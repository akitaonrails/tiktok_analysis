package com.bytedance.android.live.adminsetting;

import X.C11NZ;
import X.C470590Icr;
import X.InterfaceC1485405rg;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import X.InterfaceC1501310pAf;

/* JADX INFO: loaded from: classes.dex */
public interface RoomSwitchApi {
    @InterfaceC1501170pAR("/webcast/room/switch/batch_update/")
    @InterfaceC1501310pAf({"Content-Type: application/json"})
    C11NZ<C470590Icr<Object>> batchUpdateSwitch(@InterfaceC1485405rg SwitchBatchUpdateRequest switchBatchUpdateRequest);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/room/switch/update/")
    C11NZ<C470590Icr<Object>> updateSwitch(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("switch_type") int i, @InterfaceC1501050pAF("switch_value") boolean z, @InterfaceC1501050pAF("switch_num_value") long j2);
}
