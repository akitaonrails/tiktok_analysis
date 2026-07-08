package X;

import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreModelKt;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestAigcWallpaperConfigSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0aeM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C943120aeM {
    public static int LIZ;
    public static long LIZIZ;

    public static void LJIILJJIL() {
        if (LIZIZ == 0) {
            return;
        }
        C474500IjA c474500IjALIZ = C930540aK4.LIZJ() ? LIZ("livesdk_aigc_wallpaper_receive_result") : LIZIZ("livesdk_aigc_wallpaper_receive_result");
        c474500IjALIZ.LJJII(Long.valueOf(System.currentTimeMillis() - LIZIZ), "result_duration");
        c474500IjALIZ.LIZ();
    }

    public static C474500IjA LIZ(String str) {
        HashMap map = new HashMap();
        String strU3 = null;
        C01Z4.LIZ(null, map);
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL != null) {
            strU3 = interfaceC954180awCLLJLL.U3();
        }
        map.put("channel_id", String.valueOf(strU3));
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
        c474500IjALIZ.LJJIIZI(map);
        return c474500IjALIZ;
    }

    public static C474500IjA LIZIZ(String str) {
        HashMap map = new HashMap();
        String strU3 = null;
        C01Z4.LIZ(null, map);
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL != null) {
            strU3 = interfaceC954180awCLLJLL.U3();
        }
        map.put("channel_id", String.valueOf(strU3));
        map.put("guest_id", String.valueOf(UserService.getInstance().user().getCurrentUserId()));
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
        c474500IjALIZ.LJJIIZI(map);
        return c474500IjALIZ;
    }

    public static void LJIIIZ(long j) {
        long jCurrentTimeMillis;
        C474500IjA c474500IjALIZIZ;
        if (j == 0) {
            jCurrentTimeMillis = -1;
        } else {
            jCurrentTimeMillis = System.currentTimeMillis() - j;
        }
        if (LinkCoreModelKt.currentUserIsAnchor()) {
            c474500IjALIZIZ = LIZ("aigc_wallpaper_create_succeed");
        } else {
            c474500IjALIZIZ = LIZIZ("aigc_wallpaper_create_succeed");
        }
        c474500IjALIZIZ.LJJII(Long.valueOf(jCurrentTimeMillis), "image_load_time");
        c474500IjALIZIZ.LIZ();
    }

    public static void LJIIL(String str) {
        C474500IjA c474500IjALIZIZ = LIZIZ("livesdk_guest_ai_wallpaper_end");
        c474500IjALIZIZ.LJJII(str, "end_reason");
        c474500IjALIZIZ.LJJII(C921180a4y.LJIIJ(C915980Zwa.LJIIIIZZ()), "link_id");
        c474500IjALIZIZ.LIZ();
    }

    public static void LJ(Integer num, String str) {
        C474500IjA c474500IjALIZ = LIZ("livesdk_anchor_guest_ai_wallpaper_end");
        c474500IjALIZ.LJJII(str, "end_reason");
        c474500IjALIZ.LJJII(num, "is_keep_wallpaper");
        c474500IjALIZ.LIZ();
    }

    public static void LJIILIIL(String str, String str2) {
        Long lValueOf;
        User owner;
        FollowInfo followInfo;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        C474500IjA c474500IjALIZIZ = LIZIZ("livesdk_guest_ai_wallpaper_invitation");
        c474500IjALIZIZ.LJJII(str, "action_type");
        c474500IjALIZIZ.LJJII(str2, "btn_name");
        c474500IjALIZIZ.LJJII(C921180a4y.LJIIJ(C915980Zwa.LJIIIIZZ()), "link_id");
        if (room != null && (owner = room.getOwner()) != null && (followInfo = owner.getFollowInfo()) != null) {
            lValueOf = Long.valueOf(followInfo.getFollowStatus());
        } else {
            lValueOf = null;
        }
        c474500IjALIZIZ.LJJII(String.valueOf(lValueOf), "anchor_relationship");
        c474500IjALIZIZ.LIZ();
    }

    public static void LIZLLL(String str, String str2, String str3) {
        C474500IjA c474500IjALIZ = LIZ("livesdk_anchor_guest_confirmation");
        c474500IjALIZ.LJJII(str, "page_name");
        c474500IjALIZ.LJJII(str2, "action_type");
        c474500IjALIZ.LJJII(str3, "btn_name");
        c474500IjALIZ.LIZ();
    }

    public static void LJFF(int i, String str, String str2) {
        C474500IjA c474500IjALIZ = LIZ("livesdk_anchor_guest_ai_wallpaper_guidance");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "show_type");
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LJJII(str2, "click_decision");
        c474500IjALIZ.LIZ();
    }

    public static void LJI(int i, int i2, String str) {
        C474500IjA c474500IjALIZ = LIZ("livesdk_anchor_guest_ai_wallpaper_panel");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "guest_finished_cnt");
        c474500IjALIZ.LJJII(Integer.valueOf(i2), "guest_unfinished_cnt");
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LIZ();
    }

    public static void LJII(Integer num, String str, String str2) {
        C474500IjA c474500IjALIZIZ;
        if (LinkCoreModelKt.currentUserIsAnchor()) {
            c474500IjALIZIZ = LIZ("aigc_wallpaper_create_failed");
        } else {
            c474500IjALIZIZ = LIZIZ("aigc_wallpaper_create_failed");
        }
        c474500IjALIZIZ.LJJII(str, "fail_reason");
        c474500IjALIZIZ.LJJII(num, "error_code");
        c474500IjALIZIZ.LJJII(str2, "logid");
        c474500IjALIZIZ.LJJII(Long.valueOf(MultiGuestAigcWallpaperConfigSetting.INSTANCE.getCreateTimeout()), "timeout_interval");
        c474500IjALIZIZ.LIZ();
    }

    public static void LJIIJ(String str, String str2, String str3) {
        boolean z;
        C474500IjA c474500IjALIZIZ = LIZIZ("livesdk_anchor_guest_ai_wallpaper_btn_click");
        c474500IjALIZIZ.LJJII(str, "btn_name");
        if (str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str2 = null;
        }
        c474500IjALIZIZ.LJJII(str2, "resource_style");
        if (str3.length() == 0) {
            str3 = null;
        }
        c474500IjALIZIZ.LJJII(str3, "keyword");
        c474500IjALIZIZ.LJJII("guest", "admin_type");
        c474500IjALIZIZ.LIZ();
    }

    public static void LJIIJJI(String str, String str2, String str3) {
        C474500IjA c474500IjALIZIZ = LIZIZ("livesdk_anchor_guest_confirmation");
        c474500IjALIZIZ.LJJII(str, "page_name");
        c474500IjALIZIZ.LJJII(str2, "action_type");
        c474500IjALIZIZ.LJJII(str3, "btn_name");
        c474500IjALIZIZ.LIZ();
    }

    public static void LIZJ(int i, String str, String str2, String str3) {
        boolean z;
        C474500IjA c474500IjALIZ = LIZ("livesdk_anchor_guest_ai_wallpaper_btn_click");
        c474500IjALIZ.LJJII(str, "btn_name");
        if (str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        Integer numValueOf = null;
        if (z) {
            str2 = null;
        }
        c474500IjALIZ.LJJII(str2, "resource_style");
        if (str3.length() == 0) {
            str3 = null;
        }
        c474500IjALIZ.LJJII(str3, "keyword");
        if (i != -1) {
            numValueOf = Integer.valueOf(i);
        }
        c474500IjALIZ.LJJII(numValueOf, "is_default_keyword");
        c474500IjALIZ.LJJII("anchor", "admin_type");
        c474500IjALIZ.LIZ();
    }
}
