package com.bytedance.android.live.wallet.model;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public final class RevenueExchange {

    @C09CT("ab_retention_popup")
    public final boolean allowRetentionPopup;

    @C09CT("revenue")
    public final long balance;

    @C09CT("currency")
    public final String currency;

    @C09CT("price_dot")
    public final int dot;

    @C09CT("enable")
    public final boolean enableExchange;

    @C09CT("exchange_input_option")
    public final int exchangeInputOption;

    @C09CT("has_short_video_gift")
    public final boolean isRevenue;

    @C09CT("behavior_data")
    public final PopupData popupData;

    @C09CT("unit_price")
    public final int price;

    @C09CT("region")
    public final String region;

    @C09CT("show_exchange_amount_adjusted_text")
    public final boolean showExchangeAmountAdjustedText;

    @C09CT("show_exchange_tooltip")
    public final boolean showExchangeTooltip;

    public final boolean isRevenue() {
        return this.isRevenue;
    }

    public RevenueExchange(String str, boolean z, boolean z2, int i, String str2, long j, int i2, boolean z3, boolean z4, int i3, PopupData popupData, boolean z5) {
        this.currency = str;
        this.enableExchange = z;
        this.isRevenue = z2;
        this.dot = i;
        this.region = str2;
        this.balance = j;
        this.price = i2;
        this.showExchangeTooltip = z3;
        this.showExchangeAmountAdjustedText = z4;
        this.exchangeInputOption = i3;
        this.popupData = popupData;
        this.allowRetentionPopup = z5;
    }
}
