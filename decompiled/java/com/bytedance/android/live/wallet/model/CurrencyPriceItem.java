package com.bytedance.android.live.wallet.model;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public final class CurrencyPriceItem {

    @C09CT("currency")
    public String currency;

    @C09CT("keep_dot")
    public Integer keepDot;

    @C09CT("original_price")
    public Integer originalPrice;

    @C09CT("price")
    public Long price;

    @C09CT("price_dot")
    public Integer priceDot;

    @C09CT("price_show_form")
    public String priceShowForm;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.currency != null) {
            sb.append(", currency=");
            sb.append(this.currency);
        }
        if (this.priceShowForm != null) {
            sb.append(", price_show_form=");
            sb.append(this.priceShowForm);
        }
        if (this.price != null) {
            sb.append(", price=");
            sb.append(this.price);
        }
        if (this.originalPrice != null) {
            sb.append(", original_price=");
            sb.append(this.originalPrice);
        }
        if (this.priceDot != null) {
            sb.append(", price_dot=");
            sb.append(this.priceDot);
        }
        if (this.keepDot != null) {
            sb.append(", keep_dot=");
            sb.append(this.keepDot);
        }
        sb.replace(0, 2, "CurrencyPriceItem{");
        sb.append('}');
        return sb.toString();
    }
}
