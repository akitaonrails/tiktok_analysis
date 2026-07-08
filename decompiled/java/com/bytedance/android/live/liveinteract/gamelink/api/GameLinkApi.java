package com.bytedance.android.live.liveinteract.gamelink.api;

import X.AbstractC19484711Kz;
import X.C09SO;
import X.C11NZ;
import X.C470590Icr;
import X.C926820aE4;
import X.EnumC1846380y9E;
import X.InterfaceC1485405rg;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501150pAP;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import X.InterfaceC1501310pAf;
import com.bytedance.android.live.liveinteract.gamelink.utils.feedback.GuestFeedbackSubmitResponse;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import java.util.Map;
import kotlin.Unit;
import tikcast.linkmic.controller.AckStateReq;
import tikcast.linkmic.controller.AckStateResp;
import tikcast.linkmic.controller.ChangeStateReq;
import tikcast.linkmic.controller.ChangeStateResp;

/* JADX INFO: loaded from: classes.dex */
public interface GameLinkApi {
    @C09SO(EnumC1846380y9E.ROOM)
    @InterfaceC1501170pAR("/tikcast/linkmic/change_state/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    C11NZ<C926820aE4<ChangeStateResp>> changeState(@InterfaceC1485405rg ChangeStateReq changeStateReq);

    @InterfaceC1501160pAQ("/webcast/linkmic_multi_guest/list_by_type/")
    AbstractC19484711Kz<C470590Icr<MultiLiveGuestInfoList>> getListByType(@InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("anchor_id") long j2, @InterfaceC1501070pAH("channel_id") long j3, @InterfaceC1501070pAH("need_list_type_set_json_str") String str, @InterfaceC1501070pAH("list_by_type_scene") int i, @InterfaceC1501070pAH("reason") int i2);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/linkmic_multi_guest/reply_accept_notice/")
    C11NZ<C470590Icr<Unit>> replyAcceptNotice(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("guest_user_id") long j2, @InterfaceC1501050pAF("anchor_id") long j3, @InterfaceC1501050pAF("channel_id") long j4);

    @C09SO(EnumC1846380y9E.ROOM)
    @InterfaceC1501170pAR("/tikcast/linkmic/ack_state/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    C11NZ<C926820aE4<AckStateResp>> sendMessageAck(@InterfaceC1485405rg AckStateReq ackStateReq);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/feedback/2/post_message/")
    C11NZ<GuestFeedbackSubmitResponse> submitFeedback(@InterfaceC1501150pAP Map<String, String> map);

    @InterfaceC1501300pAe
    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/linkmic_multi_guest/turn_off_invitation/")
    C11NZ<C470590Icr<Unit>> turnOffInvitation(@InterfaceC1501050pAF("room_id") long j);
}
