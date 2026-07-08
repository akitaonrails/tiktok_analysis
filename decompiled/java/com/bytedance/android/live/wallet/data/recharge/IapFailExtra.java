package com.bytedance.android.live.wallet.data.recharge;

import X.C09CT;
import com.bytedance.android.livesdk.model.Extra;

/* JADX INFO: loaded from: classes28.dex */
public final class IapFailExtra extends Extra {

    @C09CT("toast_message")
    public String toastMessage = "";

    public final String getToastMessage() {
        return this.toastMessage;
    }

    public final void setToastMessage(String str) {
        this.toastMessage = str;
    }
}
