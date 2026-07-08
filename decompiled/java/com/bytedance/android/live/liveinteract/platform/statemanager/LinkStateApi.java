package com.bytedance.android.live.liveinteract.platform.statemanager;

import X.AbstractC19484711Kz;
import X.C09SO;
import X.C470590Icr;
import X.C926820aE4;
import X.EnumC1846380y9E;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501310pAf;
import com.bytedance.android.livesdk.chatroom.model.interact.CheckPermissionResponse;
import tikcast.linkmic.controller.AckStateReq;
import tikcast.linkmic.controller.AckStateResp;
import tikcast.linkmic.controller.ChangeStateReq;
import tikcast.linkmic.controller.ChangeStateResp;
import tikcast.linkmic.controller.GetStateReq;
import tikcast.linkmic.controller.GetStateResp;

/* JADX INFO: loaded from: classes.dex */
public interface LinkStateApi {
    @C09SO(EnumC1846380y9E.ROOM)
    @InterfaceC1501170pAR("/tikcast/linkmic/change_state/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    Object changeState(@InterfaceC1485405rg ChangeStateReq changeStateReq, InterfaceC1364105Vn<? super C926820aE4<ChangeStateResp>> interfaceC1364105Vn);

    @C09SO(EnumC1846380y9E.ROOM)
    @InterfaceC1501170pAR("/tikcast/linkmic/get_state/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    Object getState(@InterfaceC1485405rg GetStateReq getStateReq, InterfaceC1364105Vn<? super C926820aE4<GetStateResp>> interfaceC1364105Vn);

    @C09SO(EnumC1846380y9E.ROOM)
    @InterfaceC1501170pAR("/tikcast/linkmic/ack_state/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    Object sendMessageAck(@InterfaceC1485405rg AckStateReq ackStateReq, InterfaceC1364105Vn<? super C926820aE4<AckStateResp>> interfaceC1364105Vn);

    @C09SO(EnumC1846380y9E.ROOM)
    @InterfaceC1501170pAR("/tikcast/linkmic/ack_state/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<CheckPermissionResponse>> sendMessageAckRx(@InterfaceC1485405rg AckStateReq ackStateReq);
}
