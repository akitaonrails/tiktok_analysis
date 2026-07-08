package com.bytedance.android.live.wallet.data.recharge;

import X.C09CT;
import com.bytedance.android.livesdk.model.Extra;
import com.bytedance.android.livesdk.wallet.CustomErrorExtra;

/* JADX INFO: loaded from: classes28.dex */
public final class CreateOrderExtra extends Extra {

    @C09CT("custom_error")
    public final CustomErrorExtra customError;

    @C09CT("iap_fail_extra")
    public IapFailExtra iapFailExtra;

    public final CustomErrorExtra getCustomError() {
        return this.customError;
    }

    public final IapFailExtra getIapFailExtra() {
        return this.iapFailExtra;
    }

    public final void setIapFailExtra(IapFailExtra iapFailExtra) {
        this.iapFailExtra = iapFailExtra;
    }
}
