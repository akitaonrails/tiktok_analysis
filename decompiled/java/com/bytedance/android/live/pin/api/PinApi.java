package com.bytedance.android.live.pin.api;

import X.C11NZ;
import X.C470590Icr;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import kotlin.Unit;
import webcast.api.interaction.PinResponse;

/* JADX INFO: loaded from: classes.dex */
public interface PinApi {
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/room/pin/")
    C11NZ<PinResponse> pin(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("method") String str, @InterfaceC1501050pAF("payload") String str2);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/room/pin_cancel/")
    C11NZ<C470590Icr<Unit>> unpin(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("content_msg_id") long j2, @InterfaceC1501050pAF("pin_msg_id") long j3, @InterfaceC1501050pAF("method") String str);
}
