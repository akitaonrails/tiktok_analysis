package com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.linkmicmatch.service;

import X.AbstractC19484711Kz;
import X.C09SO;
import X.C470590Icr;
import X.EnumC1846380y9E;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import com.bytedance.android.live.liveinteract.multilive.model.GetMultiGuestRecommendRoomsParams;
import com.bytedance.android.live.liveinteract.multilive.model.GetMultiGuestRecommendRoomsResponse;
import com.bytedance.android.live.liveinteract.multilive.model.HostReportOpenLinkmicPanelParams;
import com.bytedance.android.live.liveinteract.multilive.model.HostReportOpenLinkmicPanelResponse;
import com.bytedance.android.live.liveinteract.multilive.social.model.GetRecommendRoomTriggerTimeReq;
import com.bytedance.android.live.liveinteract.multilive.social.model.GetRecommendRoomTriggerTimeResp;

/* JADX INFO: loaded from: classes.dex */
public interface LinkMicMatchService {
    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/linkmic_multi_guest/recommended_rooms/")
    AbstractC19484711Kz<C470590Icr<GetMultiGuestRecommendRoomsResponse.ResponseData>> getRecommendRooms(@InterfaceC1485405rg GetMultiGuestRecommendRoomsParams getMultiGuestRecommendRoomsParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_social/get_recommend_room_trigger_time/")
    AbstractC19484711Kz<C470590Icr<GetRecommendRoomTriggerTimeResp.ResponseData>> getRecommendRoomsTriggerConfig(@InterfaceC1485405rg GetRecommendRoomTriggerTimeReq getRecommendRoomTriggerTimeReq);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/linkmic_multi_guest/host_report_open_linkmic_panel/")
    AbstractC19484711Kz<C470590Icr<HostReportOpenLinkmicPanelResponse.ResponseData>> reportAnchorOpenLinkMicPanelTimes(@InterfaceC1485405rg HostReportOpenLinkmicPanelParams hostReportOpenLinkmicPanelParams);
}
