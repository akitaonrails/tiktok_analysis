package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0a7a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C922800a7a {
    public static String LIZ = "";
    public static String LIZIZ = "";

    public static void LIZIZ(String str) {
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        map.put("request_page", str);
        map.put("guest_connected_cnt", String.valueOf(C924810aAp.LJ().LJJII));
        map.put("tab_name", "guest");
        C917520Zz4.LIZ(map);
        C0KX4.LIZ("livesdk_anchor_guest_blank_panel_click", map, null, true);
    }

    public static void LJI(int i, String str, String str2, boolean z) {
        String str3;
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        map.put("guest_id", String.valueOf(UserService.getInstance().user().getCurrentUserId()));
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
        map.put("connection_type", "guest");
        map.put("setting_position", str2);
        C917520Zz4.LIZ(map);
        C0KX4.LIZ("livesdk_guest_switch_mute_setting", map, null, true);
    }

    public static void LIZLLL(long j, String str, String str2, String str3, String str4) {
        if (str3 == null) {
            str3 = "";
        } else if (Intrinsics.LJFF(str3, "apply")) {
            str3 = "guest_apply_anchor";
        } else if (Intrinsics.LJFF(str3, "invite")) {
            str3 = "anchor_invite_guest";
        }
        if (TextUtils.equals(str, "guest")) {
            HashMap map = new HashMap();
            C01Z4.LIZ(null, map);
            map.put("initiator", "guest");
            map.put("request_page", str2);
            map.put("guest_invite_type", str3);
            map.put("guest_id", String.valueOf(j));
            map.put("link_id", str4);
            map.put("duration", String.valueOf(System.currentTimeMillis() - C920830a4P.LIZJ));
            C917520Zz4.LIZ(map);
            C0KX4.LIZ("livesdk_guest_connection_click_disconnect", map, null, true);
            return;
        }
        if (!TextUtils.equals(str, "anchor")) {
            return;
        }
        HashMap map2 = new HashMap();
        C01Z4.LIZ(null, map2);
        map2.put("guest_id", String.valueOf(UserService.getInstance().user().getCurrentUserId()));
        map2.put("initiator", "anchor");
        map2.put("request_page", str2);
        map2.put("guest_invite_type", str3);
        map2.put("guest_id", String.valueOf(j));
        map2.put("link_id", str4);
        C917520Zz4.LIZ(map2);
        C0KX4.LIZ("livesdk_anchor_guest_connection_click_disconnect", map2, null, true);
    }

    public static void LJII(int i, int i2, String str, String str2, String str3) {
        HashMap map = new HashMap();
        C404301hh.LIZIZ(map);
        map.put("event_action_type", str);
        map.put("link_reason", str2);
        map.put("list_ucnt", String.valueOf(i));
        map.put("list_ucnt_visible", String.valueOf(i2));
        if (str3 != null) {
            map.put("guest_invite_type", str3);
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_anchor_connection_panel_list_seeall");
        c474500IjALIZ.LJJIIZI(map);
        Pair[] pairArr = {new Pair("anchorMgrV", "itemAction")};
        C945340ahw c945340ahw = new C945340ahw(c474500IjALIZ);
        c945340ahw.LIZ((Pair[]) Arrays.copyOf(pairArr, 1));
        c945340ahw.LIZIZ();
    }

    public static void LJ(int i, int i2, String str, String str2, String str3, boolean z) {
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        map.put("guest_id", String.valueOf(UserService.getInstance().user().getCurrentUserId()));
        if (str == null) {
            str = "guest_apply_anchor";
        }
        map.put("guest_invite_type", str);
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    map.put("camera_status", "off");
                }
            } else {
                map.put("camera_status", "on");
            }
        } else {
            map.put("camera_status", "abnormal");
        }
        if (i2 != 1) {
            if (i2 == 2) {
                map.put("mic_status", "off");
            }
        } else {
            map.put("mic_status", "on");
        }
        if (z) {
            map.put("switch_type", "camera");
        } else {
            map.put("switch_type", "mico");
        }
        if (str3 == null) {
            str3 = "";
        }
        map.put("windows_type", str3);
        map.put("action_type", str2);
        C917520Zz4.LIZ(map);
        C0KX4.LIZ("livesdk_guest_connection_status_switch", map, null, true);
    }

    public static void LJFF(int i, int i2, Long l, String str, String str2, List list) {
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        map.put("guest_id", String.valueOf(l));
        map.put("show_tag_list", GsonProtectorUtils.toJson(C19748512Ol.LIZJ, list));
        if (str2 != null) {
            map.put("enter_from", str2);
        }
        if (str == null) {
            str = "guest_apply_anchor";
        }
        map.put("guest_invite_type", str);
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    map.put("camera_status", "");
                } else {
                    map.put("camera_status", "off");
                }
            } else {
                map.put("camera_status", "on");
            }
        } else {
            map.put("camera_status", "abnormal");
        }
        if (i2 != 1) {
            if (i2 != 2) {
                map.put("camera_status", "");
            } else {
                map.put("mic_status", "off");
            }
        } else {
            map.put("mic_status", "on");
        }
        C917520Zz4.LIZ(map);
        C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_anchor_guest_connection_status_show", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_0()));
        c474500IjALIZIZ.LJJIIZI(map);
        c474500IjALIZIZ.LJIL();
        c474500IjALIZIZ.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(int r8, int r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, boolean r13, long r14) {
        /*
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r2 = 0
            X.C01Z4.LIZ(r2, r3)
            java.lang.String r1 = "guest_id"
            java.lang.String r0 = java.lang.String.valueOf(r14)
            r3.put(r1, r0)
            if (r10 != 0) goto L16
            java.lang.String r10 = "guest_apply_anchor"
        L16:
            java.lang.String r0 = "guest_invite_type"
            r3.put(r0, r10)
            r7 = 2
            java.lang.String r6 = "off"
            java.lang.String r5 = "on"
            r4 = 1
            java.lang.String r1 = "camera_status"
            if (r8 == 0) goto La7
            if (r8 == r4) goto La3
            if (r8 != r7) goto L2c
            r3.put(r1, r6)
        L2c:
            java.lang.String r0 = "mic_status"
            if (r9 == r4) goto L9f
            if (r9 != r7) goto L35
            r3.put(r0, r6)
        L35:
            boolean r0 = X.C930540aK4.LIZJ()
            if (r0 == 0) goto L88
            X.0amx r1 = X.C948450amx.LIZIZ
            java.lang.String r0 = "MULTI_GUEST_V3_ANCHOR_USER_MANAGER"
            java.lang.Object r1 = r1.LJIIIZ(r0)
            boolean r0 = r1 instanceof X.InterfaceC302401Fe
            if (r0 == 0) goto L9d
            X.01Fe r1 = (X.InterfaceC302401Fe) r1
            if (r1 == 0) goto L9d
            X.0aGn r0 = r1.LIZ()
        L4f:
            if (r0 == 0) goto L9d
            java.lang.String r1 = X.C921170a4x.LIZIZ(r0, r14)
        L55:
            java.lang.String r0 = "request_page"
            r3.put(r0, r11)
            java.lang.String r0 = "action_type"
            r3.put(r0, r12)
            java.lang.String r5 = "null"
            if (r1 != 0) goto L64
            r1 = r5
        L64:
            java.lang.String r0 = "link_id"
            r3.put(r0, r1)
            java.util.Map r1 = X.C917700ZzM.LIZ()
            java.lang.Long r0 = java.lang.Long.valueOf(r14)
            java.lang.Object r0 = r1.get(r0)
            if (r0 == 0) goto L78
            r5 = r0
        L78:
            java.lang.String r0 = "guest_enter_from"
            r3.put(r0, r5)
            X.C917520Zz4.LIZ(r3)
            if (r13 == 0) goto Lad
            java.lang.String r0 = "livesdk_anchor_guest_camera_status_switch"
            X.C0KX4.LIZ(r0, r3, r2, r4)
            return
        L88:
            X.0amx r1 = X.C948450amx.LIZIZ
            java.lang.String r0 = "MULTI_GUEST_V3_MODERATOR_USER_MANAGER"
            java.lang.Object r1 = r1.LJIIIZ(r0)
            boolean r0 = r1 instanceof X.InterfaceC917530Zz5
            if (r0 == 0) goto L9d
            X.0Zz5 r1 = (X.InterfaceC917530Zz5) r1
            if (r1 == 0) goto L9d
            X.0aGn r0 = r1.LIZ()
            goto L4f
        L9d:
            r1 = r2
            goto L55
        L9f:
            r3.put(r0, r5)
            goto L35
        La3:
            r3.put(r1, r5)
            goto L2c
        La7:
            java.lang.String r0 = "abnormal"
            r3.put(r1, r0)
            goto L2c
        Lad:
            java.lang.String r0 = "livesdk_anchor_guest_mic_status_switch"
            X.C0KX4.LIZ(r0, r3, r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C922800a7a.LIZ(int, int, java.lang.String, java.lang.String, java.lang.String, boolean, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x014e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(java.lang.String r10, java.lang.String r11, X.InterfaceC921200a50 r12, com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings r13, java.lang.String r14, int r15, int r16, java.lang.String r17, int r18, long r19, int r21, java.lang.String r22, boolean r23, boolean r24, java.util.Map r25, int r26) {
        /*
            Method dump skipped, instruction units count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C922800a7a.LIZJ(java.lang.String, java.lang.String, X.0a50, com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings, java.lang.String, int, int, java.lang.String, int, long, int, java.lang.String, boolean, boolean, java.util.Map, int):void");
    }
}
