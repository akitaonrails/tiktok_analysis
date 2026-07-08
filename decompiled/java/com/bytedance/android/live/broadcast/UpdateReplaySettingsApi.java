package com.bytedance.android.live.broadcast;

import X.C11NZ;
import X.C470590Icr;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import tikcast.api.anchor.UpdateReplaySettingsResponse;

/* JADX INFO: loaded from: classes8.dex */
public interface UpdateReplaySettingsApi {
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/anchor/replay/settings/update/")
    C11NZ<C470590Icr<UpdateReplaySettingsResponse>> updateRecord(@InterfaceC1501050pAF("setting_type") int i, @InterfaceC1501050pAF("action") int i2);
}
