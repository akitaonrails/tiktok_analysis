package com.bytedance.android.live.usermanage;

import X.C11NZ;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import tikcast.api.perception.MultiViolationStatusResponse;

/* JADX INFO: loaded from: classes8.dex */
public interface ILiveBanCapabilityApi {
    @InterfaceC1501170pAR("/webcast/perception/violation/multi_status/")
    C11NZ<MultiViolationStatusResponse> getLiveBanCapability(@InterfaceC1485405rg BanCapabilityParams banCapabilityParams);
}
