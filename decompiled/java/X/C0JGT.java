package X;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.competition.service.ILiveCompetitionExternalService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterMockToolSwitch;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.share.ShareFromInfo;
import com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import qo2.w;

/* JADX INFO: renamed from: X.0JGT, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JGT {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(long j) {
        String str;
        User userLJIJJLI = UserService.getInstance().user().LJIJJLI();
        if (userLJIJJLI != null) {
            if (C930540aK4.LJIJJ(userLJIJJLI)) {
                str = "live_anchor_c_guest";
            } else if (C930540aK4.LJJII(userLJIJJLI)) {
                str = "live_guest_c_guest";
            } else {
                str = "live_audience_c_guest";
            }
            LIZ(str, Long.valueOf(j), null, "guest_window", "audience", null, null, null, null, null, null, null, null, null, null, null, 63488);
        }
    }

    public static void LIZJ(long j) {
        String str;
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        map.put("to_user_id", String.valueOf(j));
        User userLJIJJLI = UserService.getInstance().user().LJIJJLI();
        if (userLJIJJLI != null) {
            if (C930540aK4.LJIJJ(userLJIJJLI)) {
                str = "live_anchor_c_guest";
            } else if (C930540aK4.LJJII(userLJIJJLI)) {
                str = "live_guest_c_guest";
            } else {
                str = "live_audience_c_guest";
            }
            map.put("request_page", str);
        }
        C0KX4.LIZ("livesdk_guest_window_follow_icon_show", map, null, true);
    }

    public static void LIZ(String str, Long l, HashMap map, String str2, String str3, Long l2, Long l3, Long l4, Long l5, String str4, String str5, String str6, String str7, EnumC946710ak9 enumC946710ak9, String str8, String str9, int i) {
        String string;
        int i2;
        String string2;
        String string3;
        String string4;
        String string5;
        Map<String, String> linkedHashMap;
        String str10;
        long jLongValue;
        int iHashCode;
        String guestRequestId;
        String string6;
        String str11;
        String connectionType = str3;
        String str12 = str2;
        String str13 = str5;
        String str14 = str4;
        String str15 = str9;
        String str16 = str8;
        String str17 = str7;
        String str18 = str6;
        if ((i & 8) != 0) {
            str12 = "gift_panel";
        }
        if ((i & 16) != 0) {
            connectionType = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).getConnectionType();
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str18 = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str17 = null;
        }
        if ((i & 8192) != 0) {
            enumC946710ak9 = null;
        }
        if ((i & 16384) != 0) {
            str16 = null;
        }
        if ((i & 32768) != 0) {
            str15 = null;
        }
        HashMap map2 = new HashMap();
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
        String str19 = CardStruct.IStatusCode.DEFAULT;
        if (room != null) {
            map2.put("room_id", room.getIdStr());
            map2.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            map2.put("guest_id", String.valueOf(UserService.getInstance().user().getCurrentUserId()));
            map2.put("server_heat_level", String.valueOf(((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).ip(room.getId())));
            map2.put("client_heat_level", String.valueOf(((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).v5(room.getId())));
            map2.put("is_sub_only_live", String.valueOf(room.liveSubOnly));
            if (room.getOwner() != null && room.getOwner().isAnchorHasSubQualification()) {
                if (room.getOwner().isSubscribed()) {
                    str11 = "1";
                } else {
                    str11 = CardStruct.IStatusCode.DEFAULT;
                }
            } else {
                str11 = "-1";
            }
            map2.put("is_subscription", str11);
        }
        w.LIZ.getClass();
        if (Intrinsics.LJFF(w.LJIIL(), "portal")) {
            str19 = "1";
        }
        map2.put("is_portal_user", str19);
        if (Intrinsics.LJFF(w.LJIIL(), "portal")) {
            map2.put("portal_id", String.valueOf(w.LJIJ()));
        }
        map2.put("request_page", str);
        map2.put("click_user_position", str12);
        map2.put("connection_type", connectionType);
        map2.put("core_connection_type", C915980Zwa.LIZLLL().oE2());
        String str20 = "";
        if (l == null || (string = l.toString()) == null) {
            string = "";
        }
        map2.put("to_user_id", string);
        MultiGuestDataHolder multiGuestDataHolder = C920830a4P.LIZ;
        if (multiGuestDataHolder != null && multiGuestDataHolder.LJJIFFI > 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        map2.put("is_guest_connection", String.valueOf(i2));
        if (l2 == null || (string2 = l2.toString()) == null) {
            string2 = "";
        }
        map2.put("multiguest_liveshow_ranking_num", string2);
        if (l3 == null || (string3 = l3.toString()) == null) {
            string3 = "";
        }
        map2.put("show_cnt", string3);
        if (l4 == null || (string4 = l4.toString()) == null) {
            string4 = "";
        }
        map2.put("multi_guide_reason", string4);
        if (l5 == null || (string5 = l5.toString()) == null) {
            string5 = "";
        }
        map2.put("multi_guide_rank", string5);
        if (str14 == null) {
            str14 = "";
        }
        map2.put("link_id", str14);
        if (str13 == null) {
            str13 = "";
        }
        map2.put("mg_channel_id", str13);
        C917520Zz4.LIZ(map2);
        C01Z4.LIZ(null, map2);
        if (map != null) {
            map2.putAll(map);
        }
        IInteractService iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
        if (iInteractService.Nt()) {
            linkedHashMap = iInteractService.getMatchLogParams();
        } else {
            linkedHashMap = new LinkedHashMap<>();
        }
        if (!TextUtils.isEmpty(iInteractService.xw0())) {
            if (TextUtils.equals("in_pk", iInteractService.xw0())) {
                linkedHashMap.put("match_status", "pk_phase");
            } else {
                linkedHashMap.put("match_status", LiveCenterMockToolSwitch.PUNISH);
            }
        }
        map2.putAll(linkedHashMap);
        ILiveCompetitionExternalService iLiveCompetitionExternalService = (ILiveCompetitionExternalService) C1161920gLG.LIZJ(ILiveCompetitionExternalService.class);
        if (iLiveCompetitionExternalService.Al1()) {
            iLiveCompetitionExternalService.dH(map2);
        }
        map2.put("sub_match_type", ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Ti2());
        ILiveHostCrossRoomEventHelper iLiveHostCrossRoomEventHelper = (ILiveHostCrossRoomEventHelper) C1161920gLG.LIZJ(ILiveHostCrossRoomEventHelper.class);
        map2.put("cohost_from_room_id", iLiveHostCrossRoomEventHelper.getFromRoomId());
        map2.put("cohost_from_request_id", iLiveHostCrossRoomEventHelper.getFromRequestId());
        ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Yz("follow", map);
        if (C497740JfY.LJIL()) {
            str10 = "portrait";
        } else {
            str10 = "landscape";
        }
        map2.put("room_orientation", str10);
        InterfaceC2183451Acp interfaceC2183451Acp = (InterfaceC2183451Acp) C1161920gLG.LIZJ(IInteractService.class);
        long jLongValue2 = 0;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        Map<String, String> mapLJJ = interfaceC2183451Acp.LJJ(Long.valueOf(jLongValue));
        if (mapLJJ != null) {
            map2.putAll(mapLJJ);
        }
        if (str18 == null) {
            str18 = "";
        }
        map2.put("trigger_type", str18);
        if (str17 == null) {
            str17 = "";
        }
        map2.put("multi_request_id", str17);
        map2.put("user_id", String.valueOf(UserService.getInstance().user().getCurrentUserId()));
        if (enumC946710ak9 != null && (string6 = Integer.valueOf(enumC946710ak9.getValue()).toString()) != null) {
            str20 = string6;
        }
        map2.put("reason", str20);
        map2.put("multi_tool", ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).No2());
        Room room2 = (Room) dataChannelGlobal.gg0(C930940aKi.class);
        if (room2 != null && (guestRequestId = room2.getGuestRequestId()) != null) {
            map2.put("guest_request_id", guestRequestId);
        }
        long currentUserId = UserService.getInstance().user().getCurrentUserId();
        User user = new User();
        user.setId(currentUserId);
        map2.put("from_user_type", C917520Zz4.LJIILL(user));
        if (l != null) {
            jLongValue2 = l.longValue();
        }
        User user2 = new User();
        user2.setId(jLongValue2);
        map2.put("to_user_type", C917520Zz4.LJIILL(user2));
        if (str16 != null && str16.length() > 0) {
            map2.put("action_type", str16);
        }
        if (str15 != null) {
            map2.put("follow_icon_type", str15);
        }
        if (C931790aM5.LIZIZ() && ((iHashCode = str12.hashCode()) == -1522866121 ? str12.equals("guest_window") : iHashCode == -335591217 ? str12.equals("guest_ranking") : iHashCode == 1027320294 && str12.equals("guest_showdown_billboard"))) {
            map2.put("is_guest_connection", "1");
        }
        C0IWT.LIZ(map2, (ShareFromInfo) dataChannelGlobal.gg0(C931420aLU.class));
        C0KX4.LIZ("livesdk_follow", map2, null, true);
    }
}
