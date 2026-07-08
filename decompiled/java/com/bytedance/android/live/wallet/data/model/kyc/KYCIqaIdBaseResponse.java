package com.bytedance.android.live.wallet.data.model.kyc;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class KYCIqaIdBaseResponse {

    @C09CT("status_code")
    public final int statusCode;

    @C09CT("status_message")
    public final String statusMessage;

    public KYCIqaIdBaseResponse() {
        this(0, "");
    }

    public KYCIqaIdBaseResponse(int i, String str) {
        this.statusCode = i;
        this.statusMessage = str;
    }
}
