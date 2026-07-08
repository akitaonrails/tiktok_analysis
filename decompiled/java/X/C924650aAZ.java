package X;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.gamelink.model.GameLinkDataHolder;
import com.bytedance.android.live.liveinteract.multilive.model.MultiGuestPermissionInfo;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserApplySettings;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserSettings;
import com.bytedance.android.livesdk.model.linksetting.RoomAudienceMultiGuestPermissionInfo;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.Intrinsics;
import qo2.w;

/* JADX INFO: renamed from: X.0aAZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C924650aAZ {
    public static final C924650aAZ LIZ = new C924650aAZ();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(272));
    public static EnumC918970a1P LIZJ;
    public static long LIZLLL;
    public static EnumC918970a1P LJ;
    public static long LJFF;
    public static String LJI;
    public static final C01GW LJII;

    static {
        EnumC918970a1P enumC918970a1P = EnumC918970a1P.NORMAL;
        LIZJ = enumC918970a1P;
        LJ = enumC918970a1P;
        LJI = "";
        LJII = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(273));
    }

    public static GameLinkDataHolder LIZLLL() {
        return (GameLinkDataHolder) LIZIZ.getValue();
    }

    public static Pair LJ() {
        return new Pair("floating", "unfixed");
    }

    public static void LIZ(Map map) {
        int i;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            HashMap map2 = (HashMap) map;
            map2.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            map2.put("room_id", room.getIdStr());
            map2.put("user_id", String.valueOf(UserService.getInstance().user().getCurrentUserId()));
            w.LIZ.getClass();
            map2.put("enter_method", w.LJIIL());
            map2.put("enter_from_merge", w.LJIIIZ());
            map2.put("action_type", w.LIZLLL());
            map2.put("layout_setting", LJ().getFirst());
            map2.put("window_setting", LJ().getSecond());
            map2.put("live_mode", String.valueOf(room.liveRoomMode));
            String requestId = room.getRequestId();
            if (requestId != null) {
                map2.put("request_id", requestId);
            }
        }
        GameLinkDataHolder gameLinkDataHolderLIZLLL = LIZLLL();
        if (gameLinkDataHolderLIZLLL != null) {
            i = gameLinkDataHolderLIZLLL.LJJIFFI;
        } else {
            i = 0;
        }
        ((HashMap) map).put("guest_cnt", String.valueOf(i));
    }

    public static void LIZIZ(Map map) {
        int i;
        HashMap map2 = (HashMap) map;
        map2.put("layout_setting", LJ().getFirst());
        map2.put("window_setting", LJ().getSecond());
        GameLinkDataHolder gameLinkDataHolderLIZLLL = LIZLLL();
        if (gameLinkDataHolderLIZLLL != null) {
            i = gameLinkDataHolderLIZLLL.LJJIFFI;
        } else {
            i = 0;
        }
        map2.put("guest_cnt", String.valueOf(i));
    }

    public static String LJI(String[] strArr) {
        boolean z;
        if (C13LQ.LJJIJIIJI("android.permission.RECORD_AUDIO", strArr) >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && C13LQ.LJJIJIIJI("android.permission.CAMERA", strArr) >= 0) {
            return "all";
        }
        if (C13LQ.LJJIJIIJI("android.permission.CAMERA", strArr) >= 0 && C13LQ.LJJIJIIJI("android.permission.RECORD_AUDIO", strArr) < 0) {
            return "video";
        }
        if (C13LQ.LJJIJIIJI("android.permission.CAMERA", strArr) < 0 && C13LQ.LJJIJIIJI("android.permission.RECORD_AUDIO", strArr) >= 0) {
            return "audio";
        }
        return "none";
    }

    public static String LJIIZILJ(Integer num) {
        if (num != null) {
            if (num.intValue() != 1 && num.intValue() != 3) {
                if (num.intValue() == 2) {
                    return "audio";
                }
                num.intValue();
                return "no_permission";
            }
            return "video";
        }
        return "no_permission";
    }

    public static void LIZJ(C924650aAZ c924650aAZ, Map map) {
        c924650aAZ.getClass();
        c924650aAZ.getClass();
        LIZIZ(map);
    }

    public static String LJFF(boolean z, Room room) {
        MultiLiveUserSettings multiLiveUserSettings;
        MultiLiveUserApplySettings multiLiveUserApplySettings;
        RoomAudienceMultiGuestPermissionInfo roomAudienceMultiGuestPermissionInfo;
        MultiGuestPermissionInfo multiGuestPermissionInfo;
        Long l;
        Integer numValueOf;
        if (!z) {
            GameLinkDataHolder gameLinkDataHolderLIZLLL = LIZLLL();
            if (gameLinkDataHolderLIZLLL != null) {
                numValueOf = Integer.valueOf(gameLinkDataHolderLIZLLL.LJJJLL);
            } else {
                numValueOf = null;
            }
            return LJIIZILJ(numValueOf);
        }
        long jLongValue = 0;
        if (room != null && (multiLiveUserSettings = room.multiLiveUserSettings) != null && (multiLiveUserApplySettings = multiLiveUserSettings.multiLiveUserApplySettings) != null && (roomAudienceMultiGuestPermissionInfo = multiLiveUserApplySettings.roomAudienceMultiGuestPermissionInfo) != null && (multiGuestPermissionInfo = roomAudienceMultiGuestPermissionInfo.permissionInfo) != null && (l = multiGuestPermissionInfo.linkPermissionType) != null) {
            jLongValue = l.longValue();
        }
        return LJIIZILJ(Integer.valueOf((int) jLongValue));
    }

    public static void LJIILJJIL(String str, EnumC918970a1P enumC918970a1P) {
        if (LIZJ == null) {
            return;
        }
        HashMap map = new HashMap();
        LIZ(map);
        if (!Intrinsics.LJFF(str, "live_over") && !Intrinsics.LJFF(str, "manual_setting_switch") && !Intrinsics.LJFF(str, "connection_start")) {
            str = "others";
        }
        map.put("trigger", str);
        LIZJ = null;
        map.put("layout_setting", LJ().getFirst());
        map.put("window_setting", LJ().getSecond());
        map.put("duration", String.valueOf(System.currentTimeMillis() - LIZLLL));
        LJIILLIIL("livesdk_multilive_mode_watch_duration", null, map);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIJ(boolean r3, java.lang.Integer r4, boolean r5) {
        /*
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            LIZ(r2)
            if (r3 == 0) goto L56
            java.lang.String r1 = "click"
        Lc:
            java.lang.String r0 = "popup_action_type"
            r2.put(r0, r1)
            if (r3 == 0) goto L53
            if (r5 == 0) goto L50
            java.lang.String r1 = "confirm"
        L17:
            java.lang.String r0 = "popup_click_type"
            r2.put(r0, r1)
            if (r4 == 0) goto L4d
            int r1 = r4.intValue()
            r0 = 8
            if (r1 == r0) goto L4d
            int r1 = r4.intValue()
            r0 = 5
            if (r1 == r0) goto L4d
            int r1 = r4.intValue()
            r0 = 6
            if (r1 != r0) goto L42
            java.lang.String r1 = "close_icon"
        L36:
            java.lang.String r0 = "leave_type"
            r2.put(r0, r1)
            r1 = 0
            java.lang.String r0 = "livesdk_guest_connection_applying_leave_popup"
            LJIILLIIL(r0, r1, r2)
            return
        L42:
            int r1 = r4.intValue()
            r0 = 11
            if (r1 != r0) goto L4d
            java.lang.String r1 = "kick_out"
            goto L36
        L4d:
            java.lang.String r1 = "button_back"
            goto L36
        L50:
            java.lang.String r1 = "cancel"
            goto L17
        L53:
            java.lang.String r1 = ""
            goto L17
        L56:
            java.lang.String r1 = "show"
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C924650aAZ.LJIIJ(boolean, java.lang.Integer, boolean):void");
    }

    public static final void LJIIL(String str, String[] strArr, boolean z) {
        String str2;
        HashMap map = new HashMap();
        LIZ(map);
        if (z) {
            str2 = LJI;
        } else {
            str2 = C924770aAl.LIZ;
        }
        if (str2 == null) {
            str2 = "";
        }
        map.put("check_permission_scene", str2);
        map.put("popup_type", "first_popup");
        map.put("guest_permission", LJFF(false, null));
        map.put("require_permission", LJI(strArr));
        map.put("click_type", str);
        LJIILLIIL("livesdk_guest_sys_permission_click", null, map);
    }

    public static final void LJIILIIL(long j, boolean z, boolean z2) {
        String str;
        String str2;
        HashMap map = new HashMap();
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            map.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            map.put("room_id", room.getIdStr());
            w.LIZ.getClass();
            map.put("enter_method", w.LJIIL());
            map.put("enter_from_merge", w.LJIIIZ());
            map.put("action_type", w.LIZLLL());
            Pair pairLJ = LJ();
            map.put("layout_setting", pairLJ.getFirst());
            map.put("window_setting", pairLJ.getSecond());
            map.put("guest_cnt", String.valueOf(C924810aAp.LJ().LJJII));
            String strLLJJJJLIIL = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).hI2().LIZ().LLJJJJLIIL();
            if (strLLJJJJLIIL != null && !TextUtils.isEmpty(strLLJJJJLIIL)) {
                map.put("request_id", strLLJJJJLIIL);
            }
        }
        map.put("request_page", "connection_button");
        map.put("anchor_relationship", String.valueOf(j));
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_guest", str);
        if (z2) {
            str2 = "portrait";
        } else {
            str2 = "landscape";
        }
        map.put("room_orientation", str2);
        LJIILLIIL("livesdk_guest_connection_icon_click", null, map);
    }

    public static void LJIILL(String str, EnumC918970a1P enumC918970a1P, Integer num) {
        EnumC918970a1P enumC918970a1P2 = LIZJ;
        if (enumC918970a1P == enumC918970a1P2) {
            return;
        }
        if (enumC918970a1P2 != null) {
            LJIILJJIL(str, enumC918970a1P2);
        }
        HashMap map = new HashMap();
        LIZ(map);
        map.put("trigger", str);
        if (enumC918970a1P == null) {
            LIZLLL();
        }
        EnumC918970a1P enumC918970a1P3 = EnumC918970a1P.FLOATING;
        if (enumC918970a1P3 != null) {
            LIZJ = enumC918970a1P3;
        }
        map.put("layout_setting", LJ().getFirst());
        map.put("window_setting", LJ().getSecond());
        if (num != null) {
            map.put("guest_cnt", String.valueOf(num.intValue()));
        }
        LJIILLIIL("livesdk_multilive_mode_watch_start", null, map);
        LIZLLL = System.currentTimeMillis();
    }

    public static void LJIILLIIL(String str, Double d, Map map) {
        C474500IjA c474500IjALIZ;
        if (Intrinsics.LJFF("livesdk_linkmic_multi_guest_icon_show", str)) {
            c474500IjALIZ = C0IJT.LIZIZ(str, d);
            c474500IjALIZ.LJJIIZI(map);
        } else {
            c474500IjALIZ = C0IJT.LIZ(str);
            c474500IjALIZ.LJJIIZI(map);
        }
        if ((Intrinsics.LJFF("livesdk_linkmic_multi_guest_icon_show", str) || Intrinsics.LJFF("livesdk_multilive_mode_watch_duration", str) || Intrinsics.LJFF("livesdk_multilive_mode_watch_start", str) || Intrinsics.LJFF("livesdk_linkmic_perf_api_finish", str) || Intrinsics.LJFF("livesdk_video_box_gift_icon_effect_show", str) || Intrinsics.LJFF("livesdk_guest_connection_icon_show", str)) && BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZ.LJIJ())) {
            c474500IjALIZ.LJJIJLIJ();
            c474500IjALIZ.LJIIIIZZ();
            c474500IjALIZ.LJJII(w.LIZ.LIZJ(), "live_type");
            c474500IjALIZ.LJJII(w.LIZLLL(), "action_type");
            c474500IjALIZ.LJJII(w.LJIJI(), "request_id");
            c474500IjALIZ.LJJIJL();
            return;
        }
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LIZ();
    }

    public final void LJII(long j, String str, String str2, String str3) {
        String str4 = str2;
        if (str4 == null) {
            str4 = "";
        } else if (Intrinsics.LJFF(str4, "apply")) {
            str4 = "guest_apply_anchor";
        } else if (Intrinsics.LJFF(str4, "invite")) {
            str4 = "anchor_invite_guest";
        }
        if (TextUtils.equals("guest", "guest")) {
            HashMap map = new HashMap();
            LIZ(map);
            Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            if (room != null) {
                map.put("room_id", room.getIdStr());
                map.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            }
            map.put("initiator", "guest");
            map.put("request_page", str);
            map.put("guest_invite_type", str4);
            map.put("guest_id", String.valueOf(j));
            map.put("link_id", str3);
            LIZJ(this, map);
            LJIILLIIL("livesdk_guest_connection_click_disconnect", null, map);
            return;
        }
        if (!TextUtils.equals("guest", "anchor")) {
            return;
        }
        HashMap map2 = new HashMap();
        LIZ(map2);
        Room room2 = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room2 != null) {
            map2.put("room_id", room2.getIdStr());
            map2.put("anchor_id", String.valueOf(room2.getOwnerUserId()));
            map2.put("guest_id", String.valueOf(UserService.getInstance().user().getCurrentUserId()));
        }
        map2.put("initiator", "anchor");
        map2.put("request_page", str);
        map2.put("guest_invite_type", str4);
        map2.put("guest_id", String.valueOf(j));
        map2.put("link_id", str3);
        LIZJ(this, map2);
        LJIILLIIL("livesdk_anchor_guest_connection_click_disconnect", null, map2);
    }

    public final void LJIIIIZZ(int i, String str, String str2, String str3) {
        HashMap map = new HashMap();
        LIZ(map);
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            map.put("room_id", room.getIdStr());
            map.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            map.put("guest_id", String.valueOf(UserService.getInstance().user().getCurrentUserId()));
        }
        if (str == null) {
            str = "guest_apply_anchor";
        }
        map.put("guest_invite_type", str);
        map.put("camera_status", "abnormal");
        if (i != 1) {
            if (i == 2) {
                map.put("mic_status", "off");
            }
        } else {
            map.put("mic_status", "on");
        }
        map.put("switch_type", "mico");
        if (str3 == null) {
            str3 = "";
        }
        map.put("windows_type", str3);
        map.put("action_type", str2);
        LIZJ(this, map);
        LJIILLIIL("livesdk_guest_connection_status_switch", null, map);
    }

    public final void LJIIIZ(int i, String str, String str2, boolean z) {
        String str3;
        HashMap map = new HashMap();
        LIZ(map);
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            map.put("room_id", room.getIdStr());
            map.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            map.put("guest_id", String.valueOf(UserService.getInstance().user().getCurrentUserId()));
        }
        if (str == null) {
            str = "";
        } else if (Intrinsics.LJFF(str, "apply")) {
            str = "guest_apply_anchor";
        } else if (Intrinsics.LJFF(str, "invite")) {
            str = "anchor_invite_guest";
        }
        map.put("guest_invite_type", str);
        if (i != 0 && i != 1) {
            if (i == 2) {
                map.put("guest_connection_type", "voice");
            }
        } else {
            map.put("guest_connection_type", "video");
        }
        if (z) {
            str3 = "mute";
        } else {
            str3 = "unmute";
        }
        map.put("switch_to", str3);
        map.put("setting_position", str2);
        LIZJ(this, map);
        LJIILLIIL("livesdk_guest_switch_mute_setting", null, map);
    }

    public static void LJIIJJI(String str, String str2, String str3, String str4, int i, DataChannel dataChannel, boolean z, int i2) {
        Long lValueOf;
        Long lValueOf2;
        String strValueOf;
        Long lValueOf3;
        String str5;
        String strLIZ;
        String str6;
        User owner;
        FollowInfo followInfo;
        LiveMode streamType;
        int i3 = i2 & 256;
        if ((i2 & 512) != 0) {
            z = false;
        }
        C924790aAn c924790aAnLIZLLL = C924790aAn.LIZLLL();
        HashMap map = new HashMap();
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        Long lValueOf4 = null;
        if (room != null) {
            lValueOf = Long.valueOf(room.getId());
        } else {
            lValueOf = null;
        }
        map.put("room_id", String.valueOf(lValueOf));
        if (room != null) {
            lValueOf2 = Long.valueOf(room.getId());
        } else {
            lValueOf2 = null;
        }
        map.put("channel_id", String.valueOf(lValueOf2));
        map.put("connection_type", "audience");
        if (c924790aAnLIZLLL.LJIIJ) {
            strValueOf = String.valueOf(C963140bAe.LJIIIIZZ(c924790aAnLIZLLL.LJIIJJI));
        } else {
            strValueOf = "1440";
        }
        map.put("time", strValueOf);
        if (room != null) {
            lValueOf3 = Long.valueOf(room.getOwnerUserId());
        } else {
            lValueOf3 = null;
        }
        map.put("anchor_id", String.valueOf(lValueOf3));
        if (C924790aAn.LIZLLL().LJIIL == 1) {
            str5 = "video";
        } else {
            str5 = "voice";
        }
        map.put("guest_connection_type", str5);
        C924790aAn.LIZLLL().getClass();
        map.put("weight_decay_type", String.valueOf(0));
        if (room != null && (streamType = room.getStreamType()) != null) {
            strLIZ = C354201Zc.LIZ(streamType);
        } else {
            strLIZ = "live_studio";
        }
        map.put("live_type", strLIZ);
        map.put("permission_type", C925050aBD.LJ());
        map.put("camera_status", "off");
        map.put("guest_invite_type", str);
        if (room != null && (owner = room.getOwner()) != null && (followInfo = owner.getFollowInfo()) != null) {
            lValueOf4 = Long.valueOf(followInfo.getFollowStatus());
        }
        map.put("anchor_relationship", String.valueOf(lValueOf4));
        Pair pairLJ = LJ();
        map.put("layout_setting", pairLJ.getFirst());
        map.put("window_setting", pairLJ.getSecond());
        map.put("link_id", str2);
        map.put("anchor_invite_position", str3);
        map.put("accept_invitation_platform", str4);
        map.put("receive_invitation_platform", "room");
        map.put("guest_cnt", String.valueOf(i));
        if (z) {
            str6 = "background_to_foreground";
        } else {
            str6 = "connection_success";
        }
        map.put("connection_success_type", str6);
        C923860a9I.LIZJ(map);
        map.put("enhance_level", CardStruct.IStatusCode.DEFAULT);
        map.put("guest_permission", C924250a9v.LIZ().LJIILJJIL());
        C923860a9I.LIZIZ(map);
        C923860a9I.LIZ(map);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_guest_connection_success");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJIILJJIL("live_detail");
        c474500IjALIZ.LJIIJJI("live_function");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LIZ();
    }
}
