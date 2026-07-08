package com.bytedance.android.live.publicscreen.impl.api;

import X.C11NZ;
import X.C470590Icr;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.bytedance.android.livesdk.game.model.CreateHighLightResult;

/* JADX INFO: loaded from: classes8.dex */
public interface HighLightApi {
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/game/live_fragment/cut/")
    C11NZ<C470590Icr<CreateHighLightResult>> createHighLightVideo(@InterfaceC1501050pAF("fragment_id") Long l, @InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("start_time") long j2, @InterfaceC1501050pAF("end_time") long j3, @InterfaceC1501050pAF("title") String str, @InterfaceC1501050pAF("cut_case") int i);
}
