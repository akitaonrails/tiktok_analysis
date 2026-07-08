package X;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.gamelink.utils.FirstAnchorOutRoomInvitedReply;
import com.bytedance.android.live.liveinteract.gamelink.utils.FirstAnchorOutRoomInvitedShow;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.IsWatchingMultiGuest;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.GuestResumeApplyStateFromHangup;
import com.bytedance.android.live.liveinteract.multiguestv3.service.IMultiGuestV3InternalServiceV2;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreModelKt;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveMultiBothGuestCntOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestGuestCountOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestOptGuestDistributeStateSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicLivePlayLogMigrate;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import qo2.w;

/* JADX INFO: renamed from: X.0aAa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C924660aAa {
    public static long LIZ;
    public static long LIZIZ;
    public static String LIZJ;
    public static String LIZLLL;
    public static String LJ;
    public static long LJFF;

    public static void LJIILLIIL() {
        Map mapLIZ = LIZ(null);
        HashMap map = (HashMap) mapLIZ;
        map.put("guest_id", String.valueOf(UserService.getInstance().user().getCurrentUserId()));
        map.put("is_from_chat_live", Intrinsics.LJFF(DataChannelGlobal.LLILZ.gg0(C930570aK7.class), Boolean.TRUE) ? "1" : CardStruct.IStatusCode.DEFAULT);
        LJIJI("livesdk_guest_enter_via_outside_liveroom_success", mapLIZ);
    }

    public static final void LJIIIIZZ() {
        if (LIZ <= 0) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis() - LIZ;
        Map mapLIZ = LIZ(null);
        String str = LIZLLL;
        if (str == null) {
            str = "live_over";
        }
        HashMap map = (HashMap) mapLIZ;
        map.put("trigger", str);
        LJIJJ(null);
        C917520Zz4.LIZ(mapLIZ);
        map.put("duration", String.valueOf(jUptimeMillis));
        map.put("permission_type", C925150aBN.LJ());
        C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_guest_connection_mode_view_duration", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_0()));
        c474500IjALIZIZ.LJIL();
        c474500IjALIZIZ.LJJIIZI(mapLIZ);
        c474500IjALIZIZ.LIZ();
        LIZ = 0L;
    }

    public static String LIZIZ() {
        String string;
        String strValueOf = String.valueOf(UserService.getInstance().user().getCurrentUserId());
        if (!TextUtils.isEmpty(strValueOf)) {
            return strValueOf;
        }
        User userLJIJJLI = UserService.getInstance().user().LJIJJLI();
        return (userLJIJJLI == null || (string = Long.valueOf(userLJIJJLI.getId()).toString()) == null) ? "" : string;
    }

    public static Map LIZ(Room room) {
        HashMap map = new HashMap();
        Room room2 = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room2 == null) {
            if (room != null) {
            }
            map.put("guest_cnt", String.valueOf(C924810aAp.LJ().LJJII));
            return map;
        }
        room = room2;
        map.put("anchor_id", String.valueOf(room.getOwnerUserId()));
        map.put("room_id", room.getIdStr());
        map.put("user_id", LIZIZ());
        map.put("live_room_mode", String.valueOf(room.liveRoomMode));
        w.LIZ.getClass();
        map.put("enter_method", w.LJIIL());
        map.put("enter_from_merge", w.LJIIIZ());
        map.put("action_type", w.LIZLLL());
        String guestRequestId = room.getGuestRequestId();
        if (guestRequestId != null) {
            map.put("guest_request_id", guestRequestId);
        }
        map.put("guest_cnt", String.valueOf(C924810aAp.LJ().LJJII));
        return map;
    }

    public static final void LIZLLL(int i) {
        if (C917520Zz4.LIZJ().length() != 0 && LJFF == 0) {
            LJFF = SystemClock.uptimeMillis();
            Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("guest_cnt", String.valueOf(i)));
            C01HU.LIZ(null, mapLJIIJ);
            C917650ZzH.LIZIZ(mapLJIIJ);
            w.LIZ.getClass();
            mapLJIIJ.put("action_type", w.LIZLLL());
            mapLJIIJ.put("show_spot_cnt", String.valueOf(C917520Zz4.LJIILJJIL()));
            LJIJI("livesdk_multi_audience_layout_watch_start", mapLJIIJ);
        }
    }

    public static final void LJ(DataChannel dataChannel) {
        Boolean bool;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C01HU.LIZJ(linkedHashMap);
        C01HU.LIZIZ(linkedHashMap);
        C924620aAW.LJIIIZ(linkedHashMap);
        C474170Iid.LIZ(linkedHashMap);
        if (dataChannel != null && (bool = (Boolean) dataChannel.gg0(GuestResumeApplyStateFromHangup.class)) != null) {
            linkedHashMap.put("is_repeat", String.valueOf(bool.booleanValue() ? 1 : 0));
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_guest_apply_suspend");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIZI(linkedHashMap);
        c474500IjALIZ.LJJII(C921180a4y.LJIIJ((IMultiGuestV3InternalServiceV2) C1161920gLG.LIZJ(IMultiGuestV3InternalServiceV2.class)), "link_id");
        c474500IjALIZ.LIZ();
    }

    public static void LJIJJ(String str) {
        if (str == null) {
            LIZLLL = null;
        } else {
            if (Intrinsics.LJFF(LIZLLL, "live_over")) {
                return;
            }
            LIZLLL = str;
        }
    }

    public static void LJIJJLI(String str) {
        if (str == null) {
            LJ = null;
        } else {
            if (Intrinsics.LJFF(LJ, "live_over")) {
                return;
            }
            LJ = str;
        }
    }

    public static final void LJIIL(Room room, String str) {
        HashMap map = new HashMap();
        map.put("action_type", str);
        if (room != null) {
            map.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            map.put("room_id", room.getIdStr());
        }
        LJIJI("livesdk_multi_guest_to_portrait_popup", map);
    }

    public static final void LJIILL(String str, String str2) {
        String str3;
        String str4;
        MultiGuestDataHolder multiGuestDataHolder;
        Pair[] pairArr = new Pair[3];
        C948450amx c948450amx = C948450amx.LIZIZ;
        Object objLJIIIZ = c948450amx.LJIIIZ("MULTI_GUEST_DATA_HOLDER");
        if (!(objLJIIIZ instanceof MultiGuestDataHolder) || (multiGuestDataHolder = (MultiGuestDataHolder) objLJIIIZ) == null || (str3 = multiGuestDataHolder.LJJLIIIJILLIZJL) == null) {
            str3 = "others";
        }
        pairArr[0] = new Pair("guest_invite_type", str3);
        pairArr[1] = new Pair("click_type", str);
        if (str2 == null) {
            str2 = "";
        }
        pairArr[2] = new Pair("tab", str2);
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        C01HU.LIZJ(mapLJIIJ);
        MultiGuestDataHolder multiGuestDataHolder2 = (MultiGuestDataHolder) c948450amx.LJIIJJI("MULTI_GUEST_DATA_HOLDER");
        if (multiGuestDataHolder2 != null) {
            if (!multiGuestDataHolder2.LJIIJ) {
                str4 = "off";
            } else if (multiGuestDataHolder2.LJIILL) {
                str4 = "rear_camera";
            } else {
                str4 = "front_camera";
            }
            mapLJIIJ.put("camera_setting", str4);
        }
        C01HU.LIZIZ(mapLJIIJ);
        C924620aAW.LJIIIIZZ(mapLJIIJ);
        C924620aAW.LJII(mapLJIIJ);
        C924620aAW.LJIIJ(mapLJIIJ);
        LJIJI("livesdk_guest_video_preview_page_click", mapLJIIJ);
    }

    public static void LJIJI(String str, Map map) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
    }

    public static final void LIZJ(int i, Map<String, String> map, Room room) {
        long jUptimeMillis;
        long jUptimeMillis2;
        if (LJFF != 0 && map != null && !map.isEmpty()) {
            long jUptimeMillis3 = SystemClock.uptimeMillis() - LJFF;
            Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("guest_cnt", String.valueOf(i)), new Pair("duration", String.valueOf(jUptimeMillis3)));
            C01HU.LIZ(room, mapLJIIJ);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                mapLJIIJ.put(entry.getKey(), entry.getValue());
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("watch end now:");
            sbLIZ.append(SystemClock.uptimeMillis());
            sbLIZ.append(", end start:");
            sbLIZ.append(C924670aAb.LJIIL);
            sbLIZ.append(", sum:");
            sbLIZ.append(C924670aAb.LJIIJJI);
            C20441214yg.LIZIZ("link_watch_duration", C2188811AlT.LIZIZ(sbLIZ));
            if (C924670aAb.LJIIL > 0) {
                jUptimeMillis = (SystemClock.uptimeMillis() - C924670aAb.LJIIL) + C924670aAb.LJIIJJI;
                C915980Zwa.LJIIIIZZ();
                if (C921180a4y.LJII()) {
                    jUptimeMillis2 = SystemClock.uptimeMillis();
                } else {
                    jUptimeMillis2 = 0;
                }
                C924730aAh.LIZIZ(jUptimeMillis2);
            } else if (C924670aAb.LJIIJJI > 0) {
                jUptimeMillis = C924670aAb.LJIIJJI;
            } else {
                jUptimeMillis = 0;
            }
            mapLJIIJ.put("link_duration", String.valueOf(Math.min(jUptimeMillis, jUptimeMillis3)));
            w.LIZ.getClass();
            mapLJIIJ.put("action_type", w.LIZLLL());
            mapLJIIJ.put("show_spot_cnt", String.valueOf(C917520Zz4.LJIILJJIL()));
            LJIJI("livesdk_multi_audience_layout_watch_duration", mapLJIIJ);
            LJFF = 0L;
            C924670aAb.LJIIJJI = 0L;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("guestLinkDurationSum update:");
            sbLIZ2.append(0L);
            C924730aAh.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public static final void LJFF(String str, String str2, Map<String, String> map) {
        Pair[] pairArr = new Pair[2];
        if (str == null) {
            str = "";
        }
        pairArr[0] = new Pair("event_action_type", str);
        if (str2 == null) {
            str2 = "";
        }
        pairArr[1] = new Pair("bubble_type", str2);
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        C01HU.LIZIZ(mapLJIIJ);
        if (map != null) {
            mapLJIIJ.putAll(map);
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_bubble_remind");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIZI(mapLJIIJ);
        c474500IjALIZ.LJJII(C921180a4y.LJIIJ((IMultiGuestV3InternalServiceV2) C1161920gLG.LIZJ(IMultiGuestV3InternalServiceV2.class)), "link_id");
        C917810ZzX.LIZ(c474500IjALIZ);
        c474500IjALIZ.LIZ();
    }

    public static final void LJIIZILJ(Room room, DataChannel dataChannel, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(EnumC1303240k1C.BIZ.getValue());
        sbLIZ.append("_WatchLinkInLogger_");
        sbLIZ.append(253);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onEnterBackground isPipMode：");
        sbLIZ2.append(z);
        sbLIZ2.append(", logMigrate: ");
        LinkMicLivePlayLogMigrate linkMicLivePlayLogMigrate = LinkMicLivePlayLogMigrate.INSTANCE;
        sbLIZ2.append(linkMicLivePlayLogMigrate.enable());
        sbLIZ2.append(", linkedGuestNum: ");
        sbLIZ2.append(C924810aAp.LJ().LJJII);
        sbLIZ2.append(", trigger: ");
        sbLIZ2.append(LJ);
        C1AZW.LJIIJ(12, strLIZIZ, C2188811AlT.LIZIZ(sbLIZ2), null, null);
        if (C924810aAp.LJ().LJJII > 0 && !linkMicLivePlayLogMigrate.enable()) {
            LJIIIZ(null, null, room, null, dataChannel, 59);
        }
    }

    public static final void LJIJ(DataChannel dataChannel, String str, boolean z) {
        if (C924810aAp.LJ().LJJII > 0 && !LinkMicLivePlayLogMigrate.INSTANCE.enable() && !z) {
            int i = C924810aAp.LJ().LJJII;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append("-WatchLinkInLogger#onEnterForeground");
            LJIIJ(i, dataChannel, "live_play", null, C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static final void LJI(Boolean bool, String str, String str2, String str3) {
        String strLIZIZ;
        String str4;
        Pair[] pairArr = new Pair[4];
        InterfaceC921620a5g interfaceC921620a5g = (InterfaceC921620a5g) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_GUEST_USER_MANAGER");
        if (interfaceC921620a5g == null || (strLIZIZ = interfaceC921620a5g.LIZIZ(UserService.getInstance().user().getCurrentUserId())) == null) {
            strLIZIZ = "others";
        }
        pairArr[0] = new Pair("guest_invite_type", strLIZIZ);
        if (str2 == null) {
            str2 = "";
        }
        pairArr[1] = new Pair("action_type", str2);
        if (str3 == null) {
            str3 = "";
        }
        pairArr[2] = new Pair("click_decision", str3);
        if (str == null) {
            str = "";
        }
        pairArr[3] = new Pair("guest_connection_type", str);
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        C01HU.LIZIZ(mapLJIIJ);
        C01HU.LIZJ(mapLJIIJ);
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        mapLJIIJ.put("is_karaoke_request", str4);
        C917750ZzR.LIZ(mapLJIIJ);
        LJIJI("livesdk_guest_cancel_connection_window", mapLJIIJ);
    }

    public static final void LJIIJJI(String str, String str2, EnumC918970a1P enumC918970a1P, Boolean bool) {
        String str3;
        HashMap map = new HashMap();
        map.put("popup_action_type", str);
        map.put("popup_click_type", str2);
        map.put("layout_setting", C917520Zz4.LJII(enumC918970a1P).getFirst());
        map.put("window_setting", C917520Zz4.LJII(enumC918970a1P).getSecond());
        if (Intrinsics.LJFF(bool, Boolean.FALSE)) {
            str3 = "landscape";
        } else {
            str3 = "portrait";
        }
        map.put("room_orientation", str3);
        LJIJI("livesdk_guest_decline_invitation_popup", map);
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x016d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIIJ(int r8, com.bytedance.ies.sdk.datachannel.DataChannel r9, java.lang.String r10, java.lang.String r11, java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C924660aAa.LJIIJ(int, com.bytedance.ies.sdk.datachannel.DataChannel, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public static void LJIIIZ(String str, Integer num, Room room, String str2, DataChannel dataChannel, int i) {
        Boolean boolValueOf;
        String str3;
        String strValueOf;
        String str4;
        String str5;
        EnterRoomConfig enterRoomConfig;
        EnterRoomConfig.RoomsData roomsData;
        String str6;
        String str7;
        EnterRoomConfig enterRoomConfig2;
        EnterRoomConfig.RoomsData roomsData2;
        Object objGg0;
        String guestRequestId;
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            room = null;
        }
        if ((i & 32) != 0) {
            str2 = null;
        }
        if (LIZIZ > 0) {
            Map<C922520a78, Long> map = C922510a77.LIZ;
            if (!LinkCoreModelKt.currentUserIsAnchor()) {
                C20441214yg.LIZIZ("MultiGuestViewLogHelper", "onGuestConnStatusEnd");
                C922510a77.LIZJ(room);
                C922510a77.LIZLLL();
            }
            Map mapLIZ = LIZ(room);
            if (str == null && (str = LJ) == null) {
                str = "live_over";
            }
            HashMap map2 = (HashMap) mapLIZ;
            map2.put("trigger", str);
            C924780aAm c924780aAm = (C924780aAm) DataChannelGlobal.LLILZ.gg0(C930550aK5.class);
            if (c924780aAm != null) {
                boolValueOf = Boolean.valueOf(c924780aAm.LIZ);
            } else {
                boolValueOf = null;
            }
            Object obj = "";
            if (!C500260Jjc.LJJIFFI(boolValueOf)) {
                str3 = "";
            } else {
                str3 = "live_over_background";
            }
            map2.put("trigger_sub_reason", str3);
            LJIJJLI(null);
            C917520Zz4.LIZ(mapLIZ);
            long jUptimeMillis = SystemClock.uptimeMillis();
            long j = jUptimeMillis - LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("watch end now:");
            sbLIZ.append(jUptimeMillis);
            sbLIZ.append(", end start:");
            sbLIZ.append(LIZIZ);
            sbLIZ.append(", cost:");
            sbLIZ.append(j);
            C20441214yg.LIZIZ("link_watch_duration", C2188811AlT.LIZIZ(sbLIZ));
            map2.put("duration", String.valueOf(j));
            long j2 = C924700aAe.LJI;
            long jUptimeMillis2 = C924700aAe.LJ;
            if (j2 > 0) {
                jUptimeMillis2 += SystemClock.uptimeMillis() - j2;
                C924700aAe.LJI = 0L;
            } else if (jUptimeMillis2 <= 0) {
                jUptimeMillis2 = 0;
            }
            if (jUptimeMillis2 <= j) {
                j = jUptimeMillis2;
            }
            C924700aAe.LJFF = j;
            map2.put("link_duration", String.valueOf(j));
            if (num == null || (strValueOf = num.toString()) == null) {
                strValueOf = String.valueOf(C924810aAp.LJ().LJJII);
            }
            map2.put("guest_cnt", strValueOf);
            Room roomLJIIIZ = C930540aK4.LJIIIZ();
            if (roomLJIIIZ != null && (guestRequestId = roomLJIIIZ.getGuestRequestId()) != null) {
                map2.put("guest_request_id", guestRequestId);
                map2.put("enter_method", C0IUA.LJIIZILJ);
                map2.put("enter_from_merge", C0IUA.LJIILLIIL);
            }
            if (MultiGuestOptGuestDistributeStateSetting.INSTANCE.isEnable()) {
                map2.put("is_from_guest_distribute", String.valueOf(C0IXN.LIZ()));
            }
            if (((IMicRoomService) C1161920gLG.LIZJ(IMicRoomService.class)).tp1()) {
                str4 = "live_house_user";
            } else {
                str4 = "basic_user";
            }
            map2.put("live_lineup_user_type", str4);
            C474170Iid.LIZ(mapLIZ);
            C924620aAW.LIZIZ(mapLIZ);
            C917650ZzH.LIZIZ(mapLIZ);
            C917650ZzH.LIZ(mapLIZ);
            C924620aAW.LJIIL(mapLIZ);
            C924620aAW.LJI(dataChannel, mapLIZ);
            if ((str2 != null || (str2 = C917520Zz4.LIZJ()) != null) && C500260Jjc.LJJIIZ(str2)) {
                obj = str2;
            } else if (dataChannel != null && (objGg0 = dataChannel.gg0(C956730b0J.class)) != null) {
                obj = objGg0;
            }
            map2.put("layout_id", obj);
            C0INV c0inv = C0IL2.LIZ;
            if (c0inv.LIZ().mEnterRoomConfig.mRoomsData.enterFromAd) {
                str5 = "1";
            } else {
                str5 = CardStruct.IStatusCode.DEFAULT;
            }
            map2.put("is_ad", str5);
            if (dataChannel != null) {
                dataChannel.zW(IsWatchingMultiGuest.class, Boolean.FALSE);
            }
            EnterRoomLinkSession enterRoomLinkSessionLIZ = c0inv.LIZ();
            if (enterRoomLinkSessionLIZ != null && (enterRoomConfig = enterRoomLinkSessionLIZ.mEnterRoomConfig) != null && (roomsData = enterRoomConfig.mRoomsData) != null && (str6 = roomsData.mgCoverType) != null) {
                map2.put("mg_cover_type", str6);
                EnterRoomLinkSession enterRoomLinkSessionLIZ2 = c0inv.LIZ();
                if (enterRoomLinkSessionLIZ2 != null && (enterRoomConfig2 = enterRoomLinkSessionLIZ2.mEnterRoomConfig) != null && (roomsData2 = enterRoomConfig2.mRoomsData) != null && roomsData2.shareIntent != null) {
                    str7 = "click_empty_spot";
                } else {
                    str7 = "click_cover";
                }
                map2.put("click_mg_cover_type", str7);
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_guest_connection_status_view_duration");
            c474500IjALIZ.LJIL();
            if (MultiGuestGuestCountOptSetting.INSTANCE.isEnable()) {
                C917810ZzX.LIZ(c474500IjALIZ);
                c474500IjALIZ.LJJIIZI(mapLIZ);
            } else {
                c474500IjALIZ.LJJIIZI(mapLIZ);
                C917810ZzX.LIZ(c474500IjALIZ);
            }
            Pair[] pairArr = {new Pair("connectionStatus", "viewDuration")};
            C945340ahw c945340ahw = new C945340ahw(c474500IjALIZ);
            c945340ahw.LIZ((Pair[]) Arrays.copyOf(pairArr, 1));
            c945340ahw.LIZIZ();
            LIZIZ = 0L;
            C924700aAe.LJ = 0L;
        }
    }

    public static final void LJIILIIL(String str, String str2, Long l, String str3, boolean z, Boolean bool, Map<Long, Long> map, String str4, DataChannel dataChannel, boolean z2, Bundle bundle, String str5) {
        String str6;
        String str7;
        Object obj;
        boolean z3;
        String strValueOf;
        String strLJIL;
        String strLJIIJ = str5;
        Pair[] pairArr = new Pair[5];
        String str8 = "";
        if (str == null) {
            str6 = "";
        } else {
            str6 = str;
        }
        pairArr[0] = new Pair("user_action_type", str6);
        if (str2 == null) {
            str2 = "";
        }
        pairArr[1] = new Pair("guest_decision", str2);
        pairArr[2] = new Pair("stay_duration", String.valueOf(l));
        pairArr[3] = new Pair("receive_invitation_platform", "room");
        Boolean bool2 = Boolean.FALSE;
        if (Intrinsics.LJFF(bool, bool2)) {
            str7 = "landscape";
        } else {
            str7 = "portrait";
        }
        pairArr[4] = new Pair("room_orientation", str7);
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        C01HU.LIZJ(mapLJIIJ);
        C01HU.LIZIZ(mapLJIIJ);
        C924620aAW.LJIIIZ(mapLJIIJ);
        C474170Iid.LIZ(mapLJIIJ);
        InterfaceC917640ZzG interfaceC917640ZzGLIZ = C921180a4y.LIZ();
        if (interfaceC917640ZzGLIZ != null && (strLJIL = interfaceC917640ZzGLIZ.LJIL(UserService.getInstance().user().getCurrentUserId())) != null) {
            str8 = strLJIL;
        }
        mapLJIIJ.put("agree_user_type", str8);
        mapLJIIJ.put("invitation_type", str3);
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        mapLJIIJ.put("show_in_outer_page", obj);
        C917750ZzR.LIZ(mapLJIIJ);
        if (str4 != null) {
            mapLJIIJ.put("guest_decision_result", str4);
        }
        if (MultiGuestOptGuestDistributeStateSetting.INSTANCE.isEnable()) {
            mapLJIIJ.put("is_from_guest_distribute", String.valueOf(C0IXN.LIZ()));
        }
        C924640aAY.LIZ(mapLJIIJ);
        EnterRoomConfig.RoomsData roomsData = C0IL2.LIZ.LIZ().mEnterRoomConfig.mRoomsData;
        String str9 = roomsData.sharedEnterFrom;
        String str10 = roomsData.shareIntent;
        if (bundle != null) {
            z3 = bundle.getBoolean("is_from_share_invite");
        } else {
            z3 = false;
        }
        String str11 = "show";
        if (z3 && ((Intrinsics.LJFF(str10, "MULTI_GUEST_INVITE_FROM_GO_LIVE_PAGE") || Intrinsics.LJFF(str9, "MULTI_GUEST_INVITE_FROM_GO_LIVE_PAGE")) && dataChannel != null && (Intrinsics.LJFF(dataChannel.gg0(FirstAnchorOutRoomInvitedReply.class), Boolean.TRUE) || (dataChannel != null && Intrinsics.LJFF(dataChannel.gg0(FirstAnchorOutRoomInvitedShow.class), Boolean.TRUE))))) {
            if (Intrinsics.LJFF(str, "show")) {
                if (dataChannel != null) {
                    dataChannel.zW(FirstAnchorOutRoomInvitedShow.class, bool2);
                }
            } else if (dataChannel != null) {
                dataChannel.zW(FirstAnchorOutRoomInvitedReply.class, bool2);
            }
            mapLJIIJ.put("is_live_take_invite", "1");
        } else {
            mapLJIIJ.put("is_live_take_invite", CardStruct.IStatusCode.DEFAULT);
        }
        C924620aAW.LJIIL(mapLJIIJ);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_guest_reply_anchor_invitation");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIZI(mapLJIIJ);
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
        Iterator<T> it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            linkedHashMap.put(String.valueOf(((Number) entry.getKey()).longValue()), entry.getValue());
        }
        c474500IjALIZ.LJJII(C786410Ut5.J3(new JSONObject(linkedHashMap)), "guest_relationship");
        c474500IjALIZ.LJJII(Integer.valueOf(C921180a4y.LJ((IMultiGuestV3InternalServiceV2) C1161920gLG.LIZJ(IMultiGuestV3InternalServiceV2.class))), "empty_mic_count");
        c474500IjALIZ.LJJII(Integer.valueOf(C921180a4y.LJI((IMultiGuestV3InternalServiceV2) C1161920gLG.LIZJ(IMultiGuestV3InternalServiceV2.class))), "show_empty_mic_count");
        if (strLJIIJ == null) {
            strLJIIJ = C921180a4y.LJIIJ((IMultiGuestV3InternalServiceV2) C1161920gLG.LIZJ(IMultiGuestV3InternalServiceV2.class));
        }
        c474500IjALIZ.LJJII(strLJIIJ, "link_id");
        C917810ZzX.LIZ(c474500IjALIZ);
        C924620aAW.LJFF(c474500IjALIZ);
        if (LiveMultiBothGuestCntOptSetting.isEnable() && z2) {
            List<C936770aU7> listLJJIIJZLJL = C915980Zwa.LJII().LJJIIJZLJL();
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJIIJZLJL, 10));
            Iterator<C936770aU7> it3 = listLJJIIJZLJL.iterator();
            while (it3.hasNext()) {
                arrayList.add(Long.valueOf(it3.next().LIZ));
            }
            if (arrayList.contains(Long.valueOf(C930540aK4.LJIIL()))) {
                strValueOf = String.valueOf(C915980Zwa.LJII().LJJIIJZLJL().size());
            } else {
                strValueOf = String.valueOf(C915980Zwa.LJII().LJJIIJZLJL().size() + 1);
            }
            c474500IjALIZ.LJJII(strValueOf, "both_guest_cnt");
            c474500IjALIZ.LJJII(String.valueOf(C921180a4y.LJIILIIL(C915980Zwa.LJIIIIZZ(), C930540aK4.LJIIL())), "guest_cnt");
        }
        Pair[] pairArr2 = new Pair[1];
        if (!Intrinsics.LJFF(str, "show")) {
            str11 = "reply";
        }
        pairArr2[0] = new Pair("replyInviteV", str11);
        C945340ahw c945340ahw = new C945340ahw(c474500IjALIZ);
        c945340ahw.LIZ((Pair[]) Arrays.copyOf(pairArr2, 1));
        c945340ahw.LIZIZ();
    }
}
