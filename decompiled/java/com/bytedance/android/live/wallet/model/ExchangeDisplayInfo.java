package com.bytedance.android.live.wallet.model;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public final class ExchangeDisplayInfo {

    @C09CT("exchange")
    public RevenueExchange exchange;

    @C09CT("exchange_entrance_icon")
    public int exchangeEntranceIcon;

    @C09CT("exchange_entrance_subtitle")
    public int exchangeEntranceSubtitle;

    @C09CT("exchange_entrance_title")
    public int exchangeEntranceTitle;

    @C09CT("is_first_exchange")
    public boolean isFirstExchange = true;

    @C09CT("w9_tax_status")
    public int w9TaxStatus;

    public final boolean LIZ() {
        return this.w9TaxStatus == 4;
    }
}
