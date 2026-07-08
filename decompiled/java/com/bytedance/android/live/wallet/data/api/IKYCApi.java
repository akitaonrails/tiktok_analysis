package com.bytedance.android.live.wallet.data.api;

import X.C11NZ;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import com.bytedance.android.live.wallet.data.model.kyc.KYCIqaIdPhotoResult;
import com.bytedance.retrofit2.mime.TypedOutput;

/* JADX INFO: loaded from: classes24.dex */
public interface IKYCApi {
    @InterfaceC1501170pAR("/api/compliance/kyc/v1/iqa/id_photo/")
    C11NZ<KYCIqaIdPhotoResult> iqaIdPhotoVerify(@InterfaceC1485405rg TypedOutput typedOutput);
}
