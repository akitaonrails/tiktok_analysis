package com.bytedance.android.live.wallet.model;

import X.C09CT;
import com.bytedance.android.livesdk.model.Extra;
import com.bytedance.android.livesdk.wallet.CustomErrorExtra;

/* JADX INFO: loaded from: classes18.dex */
public final class ExchangeExtra extends Extra {

    @C09CT("custom_error")
    public CustomErrorExtra customError;

    @C09CT("order_id")
    public String orderId = "";

    public final CustomErrorExtra getCustomError() {
        return this.customError;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final void setCustomError(CustomErrorExtra customErrorExtra) {
        this.customError = customErrorExtra;
    }

    public final void setOrderId(String str) {
        this.orderId = str;
    }
}
