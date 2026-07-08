package com.bytedance.android.live.liveevent;

import X.C11NZ;
import X.C470590Icr;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.bytedance.scene.Scene;
import webcast.api.room.PreviewTimeReportResponse;

/* JADX INFO: loaded from: classes8.dex */
public interface LiveEventApi {
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/room/bind/event")
    C11NZ<C470590Icr<Void>> bindLiveEvent(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("owner_user_id") long j2, @InterfaceC1501050pAF("event_id") long j3);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/room/preview_time/report/")
    C11NZ<C470590Icr<PreviewTimeReportResponse.ResponseData>> reportSubscribePreviewTime(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("preview_time_ms") long j2, @InterfaceC1501050pAF(Scene.SCENE_SERVICE) int i);
}
