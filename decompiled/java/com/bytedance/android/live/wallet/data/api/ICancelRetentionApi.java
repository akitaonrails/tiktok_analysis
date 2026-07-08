package com.bytedance.android.live.wallet.data.api;

import X.C11NZ;
import X.C470590Icr;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.bytedance.android.live.wallet.data.model.wallet.RechargeCancelFrequency;

/* JADX INFO: loaded from: classes13.dex */
public interface ICancelRetentionApi {
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/wallet_api_tiktok/recharge_retention_popup")
    C11NZ<C470590Icr<RechargeCancelFrequency>> updateRetentionFrequency(@InterfaceC1501050pAF("event") String str, @InterfaceC1501050pAF("client_time_ms") long j, @InterfaceC1501050pAF("dialog_id") String str2);
}
