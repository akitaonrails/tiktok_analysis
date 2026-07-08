package com.bytedance.android.live.wallet.model;

import X.C09CT;
import java.util.HashMap;

/* JADX INFO: loaded from: classes25.dex */
public final class IapProductGetResult extends BaseIapProductResult {

    @C09CT("data")
    public final HashMap<String, Item> data = new HashMap<>();

    /* JADX INFO: loaded from: classes28.dex */
    public static final class Item {

        @C09CT("price_amount_micros")
        public long priceAmountMicros;

        @C09CT("product_id")
        public String productId = "";

        @C09CT("sku_name")
        public String skuName = "";

        @C09CT("currency")
        public String currency = "";

        @C09CT("price")
        public String price = "";
    }
}
