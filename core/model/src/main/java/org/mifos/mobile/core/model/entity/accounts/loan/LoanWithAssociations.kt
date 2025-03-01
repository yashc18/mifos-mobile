/*
 * Copyright 2024 Mifos Initiative
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * See https://github.com/openMF/mobile-mobile/blob/master/LICENSE.md
 */
package org.mifos.mobile.core.model.entity.accounts.loan

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize
import org.mifos.mobile.core.model.entity.Transaction

@Parcelize
data class LoanWithAssociations(
    var id: Int? = null,

    var accountNo: String? = null,

    var externalId: String? = null,

    var status: Status? = null,

    var clientId: Int? = null,

    var clientAccountNo: String? = null,

    var clientName: String? = null,

    var clientOfficeId: Int? = null,

    var loanProductId: Int? = null,

    var loanProductName: String? = null,

    @SerializedName("isLoanProductLinkedToFloatingRate")
    var loanProductLinkedToFloatingRate: Boolean? = null,

    var loanType: LoanType? = null,

    var currency: Currency? = null,

    var principal: Double? = null,

    var approvedPrincipal: Double? = null,

    var proposedPrincipal: Double? = null,

    var termFrequency: Int? = null,

    var termPeriodFrequencyType: TermPeriodFrequencyType? = null,

    var numberOfRepayments: Int? = null,

    var repaymentEvery: Int? = null,

    var repaymentFrequencyType: RepaymentFrequencyType? = null,

    var interestRatePerPeriod: Int? = null,

    var interestRateFrequencyType: InterestRateFrequencyType? = null,

    @SerializedName("isFloatingInterestRate")
    var floatingInterestRate: Boolean? = null,

    var amortizationType: AmortizationType? = null,

    var interestType: InterestType? = null,

    var interestCalculationPeriodType: InterestCalculationPeriodType? = null,

    var allowPartialPeriodInterestCalcualtion: Boolean? = null,

    var transactionProcessingStrategyId: Int? = null,

    var transactionProcessingStrategyName: String? = null,

    var syncDisbursementWithMeeting: Boolean? = null,

    var timeline: Timeline? = null,

    var summary: Summary? = null,

    var repaymentSchedule: RepaymentSchedule? = null,

    var feeChargesAtDisbursementCharged: Double? = null,

    var loanProductCounter: Int? = null,

    var multiDisburseLoan: Boolean? = null,

    var canDefineInstallmentAmount: Boolean? = null,

    var canDisburse: Boolean? = null,

    var canUseForTopup: Boolean? = null,

    @SerializedName("isTopup")
    var topup: Boolean? = null,

    var closureLoanId: Int? = null,

    var inArrears: Boolean? = null,

    @SerializedName("isNPA")
    var npa: Boolean? = null,

    var daysInMonthType: DaysInMonthType? = null,

    var daysInYearType: DaysInYearType? = null,

    @SerializedName("isInterestRecalculationEnabled")
    var interestRecalculationEnabled: Boolean? = null,

    var interestRecalculationData: InterestRecalculationData? = null,

    var createStandingInstructionAtDisbursement: Boolean? = null,

    @SerializedName("isVariableInstallmentsAllowed")
    var variableInstallmentsAllowed: Boolean? = null,

    var minimumGap: Int? = null,

    var maximumGap: Int? = null,

    var transactions: MutableList<Transaction?>? = ArrayList(),

    var loanPurposeName: String? = null,
) : Parcelable
