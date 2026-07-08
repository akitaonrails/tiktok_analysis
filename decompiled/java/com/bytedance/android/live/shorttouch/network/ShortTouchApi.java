package com.bytedance.android.live.shorttouch.network;

import X.C11NZ;
import X.C470590Icr;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.bytedance.android.livesdk.chatroom.model.UnifyBaseShortTouchGetResponse;
import webcast.api.room.RoomMultiShortTouchV2Response;

/* JADX INFO: loaded from: classes18.dex */
public interface ShortTouchApi {
    @InterfaceC1501160pAQ("/webcast/room/janus_multi/short_touch/")
    C11NZ<C470590Icr<RoomMultiShortTouchV2Response>> getShortTouch(@InterfaceC1501070pAH("need_bizs") long j, @InterfaceC1501070pAH("room_id") Long l, @InterfaceC1501070pAH("sec_anchor_id") String str, @InterfaceC1501070pAH("anchor_id") String str2, @InterfaceC1501070pAH("need_envelope_list") int i, @InterfaceC1501070pAH("need_goody_bag") int i2, @InterfaceC1501070pAH("need_portal_list") int i3, @InterfaceC1501070pAH("need_revenue_permission") int i4);

    @InterfaceC1501160pAQ("/webcast/room/unify_base/short_touch/get/")
    C11NZ<UnifyBaseShortTouchGetResponse> getShortTouchV2(@InterfaceC1501070pAH("room_id") Long l, @InterfaceC1501070pAH("anchor_id") Long l2);
}
