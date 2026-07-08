package com.bytedance.android.live.wallet.model;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public final class IapProductBuyResult extends BaseIapProductResult {

    @C09CT("data")
    public Item data;

    public static final class Item {

        @C09CT("product_id")
        public String productId = "";

        @C09CT("order_id")
        public String orderId = "";
    }
}
