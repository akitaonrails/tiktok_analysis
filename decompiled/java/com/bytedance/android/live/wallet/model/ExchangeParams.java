package com.bytedance.android.live.wallet.model;

import X.C09CT;
import java.util.HashMap;

/* JADX INFO: loaded from: classes18.dex */
public class ExchangeParams {

    @C09CT(alternate = {"show_amount"}, value = "showAmount")
    public String amount;

    @C09CT(alternate = {"coins_count"}, value = "coinsCount")
    public long coinsCount;

    @C09CT(alternate = {"currency_code"}, value = "currencyCode")
    public String currency;

    @C09CT(alternate = {"currency_dot"}, value = "currencyDot")
    public long currencyDot;

    @C09CT(alternate = {"diamond_id"}, value = "diamondId")
    public int diamondId;

    @C09CT(alternate = {"event_params"}, value = "eventParams")
    public HashMap<String, String> eventParams;

    @C09CT("exchange_input_option")
    public int exchangeInputOption;

    @C09CT(alternate = {"exchange_level"}, value = "exchangeLevel")
    public String exchangeLevel;

    @C09CT("formatted_show_amount")
    public String formattedShowAmount;

    @C09CT("gift_id")
    public long gift_id;

    @C09CT("ignore_suppress")
    public boolean ignoreSuppress;

    @C09CT(alternate = {"is_first_recharge"}, value = "isFirstRecharge")
    public boolean isFirstRecharge;

    @C09CT("is_from_insufficient")
    public int isFromInsufficient;

    @C09CT("is_periodic_payout")
    public boolean isPeriodicPayout;

    @C09CT(alternate = {"local_amount"}, value = "localAmount")
    public long localAmount;

    @C09CT(alternate = {"penalty_warning_skip"}, value = "penaltyWarningSkip")
    public String penaltyWarningSkip;

    @C09CT("show_exchange_amount_adjusted_text")
    public boolean showExchangeAmountAdjustedText;

    @C09CT("show_exchange_tooltip")
    public boolean showExchangeTooltip;

    @C09CT("skip_kyc_reminder")
    public boolean skipKycReminder;

    @C09CT("source")
    public int source;

    @C09CT("symbol")
    public String symbol;

    @C09CT("way")
    public int way;

    @C09CT(alternate = {"sub_source"}, value = "subSource")
    public int subSource = -1;

    @C09CT("start_time")
    public Long start_time = 0L;

    @C09CT("campaign_type")
    public int campaignType = 0;
}
