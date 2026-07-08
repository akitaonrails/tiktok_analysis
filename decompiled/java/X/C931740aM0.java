package X;

import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.userservice.UserService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aM0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C931740aM0 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LJFF(String str) {
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        map.put("guest_cnt", String.valueOf(C921180a4y.LJIIL(C915980Zwa.LJIIIIZZ())));
        map.put("layout_id", C940770aaZ.LIZ().getDataSource().LJIL());
        map.put("panel_layout_type", String.valueOf(C940770aaZ.LIZ().getDataSource().getPanelLayoutType()));
        map.put("action_type", str);
        C0KX4.LIZ("livesdk_anchor_design_guide_setting_icon", map, null, true);
    }

    public static void LJIIJJI(C931750aM1 c931750aM1) {
        boolean z;
        HashMap map = new HashMap();
        if (!Intrinsics.LJFF(c931750aM1.LJIIJ, "live_take_detail") && !Intrinsics.LJFF(c931750aM1.LJIIJ, "design_page")) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C01Z4.LIZ(null, map);
        } else {
            map.put("anchor_id", String.valueOf(UserService.getInstance().user().getCurrentUserId()));
        }
        map.put("action_type", c931750aM1.LIZ);
        map.put("layout_id", c931750aM1.LIZIZ);
        map.put("layout_key", c931750aM1.LIZJ);
        map.put("panel_layout_type", c931750aM1.LIZLLL);
        map.put("panel_layout_list", C13LP.LJJLIIIJ(c931750aM1.LJIIIIZZ, ",", null, null, 0, null, null, 62));
        map.put("panel_type", c931750aM1.LJIIIZ);
        if (Intrinsics.LJFF(c931750aM1.LIZ, "click")) {
            map.put("is_switch_success", c931750aM1.LJII);
            if (Intrinsics.LJFF(c931750aM1.LJII, "1")) {
                map.put("switch_layout_id", c931750aM1.LJ);
                map.put("switch_layout_key", c931750aM1.LJFF);
                map.put("switch_panel_layout_type", c931750aM1.LJI);
            }
        }
        map.put("from_page", c931750aM1.LJIIJ);
        C0KX4.LIZ("livesdk_multi_anchor_layout_module_show", map, null, true);
    }

    public static void LJI(String str, String str2) {
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        map.put("guest_cnt", String.valueOf(C921180a4y.LJIIL(C915980Zwa.LJIIIIZZ())));
        map.put("layout_id", C940770aaZ.LIZ().getDataSource().LJIL());
        map.put("design_module_type", str);
        map.put("panel_layout_type", String.valueOf(C940770aaZ.LIZ().getDataSource().getPanelLayoutType()));
        map.put("if_default", str2);
        C0KX4.LIZ("livesdk_multi_anchor_design_module_show", map, null, true);
    }

    public static final void LJIIIZ(User user, String str) {
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_guest_connection_mutual_notice");
        c474500IjALIZ.LJIL();
        map.put("invite_guest_id", String.valueOf(Long.valueOf(user.getId()).longValue()));
        map.put("action_type", str);
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
    }

    public static final void LJ(String str, String str2, String str3) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_anchor_guest_seats_icon_fail");
        C01Z4.LIZ(null, new HashMap());
        c474500IjALIZ.LJJII(str, "guest_id");
        c474500IjALIZ.LJJII("seat_full", "fail_show_reason");
        c474500IjALIZ.LJJII(str3, "guest_invite_type");
        c474500IjALIZ.LJJII(Integer.valueOf(C921180a4y.LJIIL(C915980Zwa.LJIIIIZZ())), "guest_cnt");
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        c474500IjALIZ.LJJII(Integer.valueOf(C927600aFK.LJI()), "set_guest_cnt");
        if (str2 != null) {
            c474500IjALIZ.LJJII(str2, "remote_link_id");
        }
        c474500IjALIZ.LIZ();
    }

    public static void LJIIL(String str, String str2, String str3) {
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        if (str != null) {
            map.put("guest_id", str);
        }
        map.put("guest_invite_type", str2);
        map.put("exist_seat_icon_type", str3);
        C0KX4.LIZ("livesdk_anchor_guest_seats_icon_receive", map, null, true);
    }

    public static void LJII(int i, int i2, String str, String str2, String str3, String str4) {
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        map.put("popup_type", str);
        map.put("from_guest_seat", String.valueOf(i));
        map.put("to_guest_seat", String.valueOf(i2));
        map.put("click_type", str3);
        map.put("from_guest_cnt", String.valueOf(i));
        map.put("to_guest_cnt", String.valueOf(i2));
        map.put("action_type", str2);
        map.put("from_page", str4);
        map.put("panel_layout_type", String.valueOf(C940770aaZ.LIZ().getDataSource().getPanelLayoutType()));
        C0KX4.LIZ("livesdk_anchor_guest_seat_modification_popup", map, null, true);
    }

    public static final void LJIIJ(int i, String str, long j, int i2, String str2, String str3) {
        String str4;
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        if (Intrinsics.LJFF(str, "click")) {
            map.put("btn_name", str2);
        }
        if (i2 == 1) {
            str4 = "single_head";
        } else {
            str4 = "multi_head";
        }
        map.put("btn_type", str4);
        map.put("action_type", str);
        map.put("guest_id", String.valueOf(j));
        map.put("user_id", String.valueOf(C930540aK4.LJIIL()));
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        map.put("set_guest_cnt", String.valueOf(C927600aFK.LJI()));
        map.put("icon_rank", String.valueOf(i));
        if (str3 != null) {
            map.put("link_sub_reason", str3);
        }
        C0KX4.LIZ("livesdk_multi_guest_seat_icon", map, null, true);
    }

    public static void LIZ(int i, int i2, String str, String str2, User user, boolean z, String str3) {
        String idStr;
        Long lValueOf;
        Long lValueOf2;
        FollowInfo followInfo;
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        map.put("set_guest_cnt", String.valueOf(i));
        map.put("icon_rank", String.valueOf(i2));
        str.toString();
        map.put("reason", str);
        map.put("link_sub_reason", str);
        map.put("close_type", str2);
        String str4 = CardStruct.IStatusCode.DEFAULT;
        if (user == null || (idStr = user.getIdStr()) == null) {
            idStr = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("guest_id", idStr);
        if (user != null && (followInfo = user.getFollowInfo()) != null) {
            lValueOf = Long.valueOf(followInfo.getFollowStatus());
        } else {
            lValueOf = null;
        }
        map.put("anchor_relationship", String.valueOf(lValueOf));
        if (z) {
            str4 = "1";
        }
        map.put("online_friend_trigger", str4);
        if (user != null) {
            lValueOf2 = Long.valueOf(user.getId());
        } else {
            lValueOf2 = null;
        }
        C921190a4z.LIZ(lValueOf2, map);
        if (str3 != null) {
            map.put("multi_request_id", str3);
        }
        C0KX4.LIZ("livesdk_anchor_guest_seats_close", map, null, true);
    }

    public static void LIZJ(int i, int i2, String str, String str2, String str3, User user, boolean z, String str4, String str5, String str6) {
        String idStr;
        Long lValueOf;
        Long lValueOf2;
        LinkUser linkUserLLD;
        String str7;
        FollowInfo followInfo;
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        map.put("set_guest_cnt", String.valueOf(i));
        map.put("icon_rank", String.valueOf(i2));
        map.put("reason", str);
        str.toString();
        map.put("link_sub_reason", str);
        map.put("action_type", str2);
        map.put("btn_name", str3);
        String str8 = CardStruct.IStatusCode.DEFAULT;
        if (user == null || (idStr = user.getIdStr()) == null) {
            idStr = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("guest_id", idStr);
        if (user != null && (followInfo = user.getFollowInfo()) != null) {
            lValueOf = Long.valueOf(followInfo.getFollowStatus());
        } else {
            lValueOf = null;
        }
        map.put("anchor_relationship", String.valueOf(lValueOf));
        if (z) {
            str8 = "1";
        }
        map.put("online_friend_trigger", str8);
        if (user != null) {
            lValueOf2 = Long.valueOf(user.getId());
        } else {
            lValueOf2 = null;
        }
        C921190a4z.LIZ(lValueOf2, map);
        if (str5 != null) {
            map.put("guest_invite_type", str5);
        }
        if (user != null) {
            long id = user.getId();
            InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL != null && (linkUserLLD = interfaceC954180awCLLJLL.LLD(id)) != null && (str7 = linkUserLLD.linkMicId) != null) {
                str6 = str7;
            } else if (str6 != null) {
            }
            map.put("remote_link_id", str6);
        }
        if (str4 != null) {
            map.put("multi_request_id", str4);
        }
        C0KX4.LIZ("livesdk_anchor_guest_seats_icon", map, null, true);
    }
}
