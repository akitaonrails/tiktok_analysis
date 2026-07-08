package com.bytedance.android.live.wallet.data.model.kyc;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class KYCIqaIdPhotoResult {

    @C09CT("base_resp")
    public final KYCIqaIdBaseResponse baseResponse;

    @C09CT("is_valid")
    public final boolean isValid;

    public KYCIqaIdPhotoResult(boolean z, KYCIqaIdBaseResponse kYCIqaIdBaseResponse) {
        this.isValid = z;
        this.baseResponse = kYCIqaIdBaseResponse;
    }
}
