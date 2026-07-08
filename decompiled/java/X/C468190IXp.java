package X;

import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.competition.service.ILiveCompetitionExternalService;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.GroupLiveSession;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.RoomLinkInfo;
import com.bytedance.android.livesdkapi.depend.share.ShareFromInfo;
import com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0IXp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C468190IXp {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Room room, String str, String str2, String str3, String str4, String str5, String str6, Map map, ShareFromInfo shareFromInfo) {
        boolean z;
        Long l;
        String str7;
        int size;
        List<Long> list;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C0IMI.LIZ(linkedHashMap, room, str, str2, str3);
        if (Intrinsics.LJFF(str4, "fyp")) {
            linkedHashMap.put("live_window_mode", "preview_card");
        }
        if (str5 != null) {
            linkedHashMap.put("all_second_label", str5);
        }
        String strLIZ = "";
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (value == null) {
                    value = "";
                }
                linkedHashMap.put(key, value);
            }
        }
        Map mapLIZ = C475750IlB.LIZ();
        String str8 = "1";
        if (((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).w9()) {
            linkedHashMap.put("channel_id", String.valueOf(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).hI2().LJIIJ().getChannelId()));
            if (((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).b70().size() > 2) {
                obj5 = "1";
            } else {
                obj5 = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("is_multi", obj5);
        }
        if (((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).vp0()) {
            linkedHashMap.put("pk_id", String.valueOf(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).getBattleId()));
        }
        linkedHashMap.putAll(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).getMatchLogParams());
        ILiveCompetitionExternalService iLiveCompetitionExternalService = (ILiveCompetitionExternalService) C1161920gLG.LIZJ(ILiveCompetitionExternalService.class);
        if (iLiveCompetitionExternalService.Al1()) {
            iLiveCompetitionExternalService.dH(linkedHashMap);
        }
        linkedHashMap.put("sub_match_type", ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Ti2());
        ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Yz("dislike", linkedHashMap);
        GroupLiveSession groupLiveSession = room.groupLiveSession;
        if (groupLiveSession != null && groupLiveSession.isGroupLiveSession) {
            z = true;
        } else {
            z = false;
        }
        if (room.getOwnerUserId() != UserService.getInstance().user().getCurrentUserId()) {
            if (z) {
                obj2 = "1";
            } else {
                obj2 = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("is_group_live", obj2);
            if (Intrinsics.LJFF(DataChannelGlobal.LLILZ.gg0(C1148140fz2.class), Boolean.TRUE)) {
                obj3 = "1";
            } else {
                obj3 = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("is_group_live_icy", obj3);
            if (((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).L6()) {
                obj4 = "1";
            } else {
                obj4 = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("is_enlarge_mode", obj4);
        }
        if (((ILiveCompetitionExternalService) C1161920gLG.LIZJ(ILiveCompetitionExternalService.class)).Al1()) {
            ((ILiveCompetitionExternalService) C1161920gLG.LIZJ(ILiveCompetitionExternalService.class)).dH(linkedHashMap);
        }
        if (!linkedHashMap.containsKey("is_guest_connection")) {
            C924810aAp c924810aApLJ = C924810aAp.LJ();
            if (c924810aApLJ != null && c924810aApLJ.LJJII > 0) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("is_guest_connection", obj);
        }
        ILiveHostCrossRoomEventHelper iLiveHostCrossRoomEventHelper = (ILiveHostCrossRoomEventHelper) C1161920gLG.LIZJ(ILiveHostCrossRoomEventHelper.class);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_dislike");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJFF(C0IXW.LIZJ("user_live_duration"));
        c474500IjALIZ.LJJIL(shareFromInfo);
        Hashtag hashtag = room.hashtag;
        if (hashtag != null) {
            l = hashtag.id;
        } else {
            l = null;
        }
        c474500IjALIZ.LJJII(l, "hashtag_id");
        Hashtag hashtag2 = room.hashtag;
        if (hashtag2 != null) {
            str7 = hashtag2.title;
        } else {
            str7 = null;
        }
        c474500IjALIZ.LJJII(str7, "hashtag_type");
        c474500IjALIZ.LJJII(str4, "event_page");
        c474500IjALIZ.LJJII(str6, "from_share_uid");
        c474500IjALIZ.LJJII(iLiveHostCrossRoomEventHelper.getFromRequestId(), "cohost_from_request_id");
        c474500IjALIZ.LJJII(iLiveHostCrossRoomEventHelper.getFromRoomId(), "cohost_from_room_id");
        c474500IjALIZ.LJJII(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).No2(), "multi_tool");
        RoomLinkInfo linkMicInfo = room.getLinkMicInfo();
        if (linkMicInfo != null && (list = linkMicInfo.audienceIdList) != null) {
            size = list.size();
        } else {
            size = 0;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(size), "guest_cnt");
        if (size <= 0) {
            str8 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(str8, "is_guest_connection");
        c474500IjALIZ.LJJIIZI(linkedHashMap);
        c474500IjALIZ.LJJII(str3, "request_page");
        c474500IjALIZ.LJJII(Long.valueOf(room.getId()), "video_id");
        c474500IjALIZ.LJJIIZI(((InterfaceC2183451Acp) C1161920gLG.LIZJ(IInteractService.class)).LJJ(null));
        LiveMode streamType = room.getStreamType();
        if (streamType != null) {
            strLIZ = C354201Zc.LIZ(streamType);
        }
        c474500IjALIZ.LJJII(strLIZ, "live_type");
        c474500IjALIZ.LJJIIZI(mapLIZ);
        c474500IjALIZ.LJJII(room.getGuestRequestId(), "guest_request_id");
        c474500IjALIZ.LJJIIZI(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).sR(0L, false));
        c474500IjALIZ.LIZ();
    }
}
