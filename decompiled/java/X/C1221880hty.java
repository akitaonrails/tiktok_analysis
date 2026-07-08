package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hty, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1221880hty {
    public static final C1221880hty LIZ = new C1221880hty();

    public static final void LJFF(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        Locale locale = Locale.ROOT;
        c2344009Gk.LJIIIIZZ("enter_from", "personal_homepage".toLowerCase(locale));
        c2344009Gk.LJIIIIZZ("enter_method", "click_empty_avatar".toLowerCase(locale));
        c2344009Gk.LJIIIIZZ("action_type", str.toLowerCase(locale));
        C20684815ws.LJIILLIIL("profile_ai_avatar_entrance", c2344009Gk.LIZ);
    }

    public static final void LJI(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "personal_homepage");
        c2344009Gk.LJIIIIZZ("trigger", "ai_avatar");
        c2344009Gk.LJIIIIZZ("pop_up_type", str);
        if (Intrinsics.LJFF(str, "toggle")) {
            c2344009Gk.LJFF("ai_vatar", "ai_avatar");
        }
        C20684815ws.LJIILLIIL("show_push_permission_pop_up", c2344009Gk.LIZ);
    }

    public static void LJII(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("action_type", str);
        c2344009Gk.LJIIIIZZ("aigc_type", "slow");
        C20684815ws.LJIILLIIL("upload_confirm_pop_up", c2344009Gk.LIZ);
    }

    public static void LIZ(Integer num, String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("action_type", str);
        if (num != null) {
            c2344009Gk.LIZJ(num.intValue(), "choose_num");
        }
        C20684815ws.LJIILLIIL("ai_avatar_choose_style_page", c2344009Gk.LIZ);
    }

    public static final void LJ(String str, String str2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "personal_homepage");
        c2344009Gk.LJIIIIZZ("trigger", "ai_avatar");
        c2344009Gk.LJIIIIZZ("pop_up_type", str);
        c2344009Gk.LJIIIIZZ("action_type", str2);
        if (Intrinsics.LJFF(str, "toggle")) {
            c2344009Gk.LJFF("ai_vatar", "ai_avatar");
        }
        C20684815ws.LJIILLIIL("click_push_permission_pop_up", c2344009Gk.LIZ);
    }

    public static void LIZJ(Boolean bool, Boolean bool2, String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("action_type", str.toLowerCase(Locale.ROOT));
        if (bool != null) {
            c2344009Gk.LJ(Boolean.valueOf(bool.booleanValue()), "image_loaded");
        }
        if (bool2 != null) {
            c2344009Gk.LJ(Boolean.valueOf(bool2.booleanValue()), "is_half_page");
        }
        C20684815ws.LJIILLIIL("ai_avatar_intro_page", c2344009Gk.LIZ);
    }

    public static void LIZIZ(Long l, String str, String str2, String str3, String str4) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("action_type", str2);
        c2344009Gk.LJIIIIZZ("path", str);
        c2344009Gk.LJ(l, "duration");
        c2344009Gk.LJIIIIZZ("enter_from", str3);
        c2344009Gk.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str4);
        C20684815ws.LJIILLIIL("ai_avatar_creating_page", c2344009Gk.LIZ);
    }

    public static void LIZLLL(C1221880hty c1221880hty, String str, String str2, String str3, String str4, int i, Integer num, Integer num2, int i2) {
        String lowerCase;
        String lowerCase2;
        if ((i2 & 16) != 0) {
            i = 0;
        }
        String lowerCase3 = null;
        if ((i2 & 32) != 0) {
            num = null;
        }
        if ((i2 & 64) != 0) {
            num2 = null;
        }
        c1221880hty.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (str != null) {
            lowerCase = str.toLowerCase(Locale.ROOT);
        } else {
            lowerCase = null;
        }
        c2344009Gk.LJIIIIZZ("path", lowerCase);
        Locale locale = Locale.ROOT;
        c2344009Gk.LJIIIIZZ("action_type", str2.toLowerCase(locale));
        if (str3 != null) {
            lowerCase2 = str3.toLowerCase(locale);
        } else {
            lowerCase2 = null;
        }
        c2344009Gk.LJIIIIZZ("enter_from", lowerCase2);
        if (str4 != null) {
            lowerCase3 = str4.toLowerCase(locale);
        }
        c2344009Gk.LJIIIIZZ("enter_method", lowerCase3);
        c2344009Gk.LIZJ(i, "download_num");
        c2344009Gk.LJ(num, "generate_more_cnt");
        if (num2 != null) {
            c2344009Gk.LIZJ(num2.intValue(), "initial_image_cnt");
        }
        C20684815ws.LJIILLIIL("ai_avatar_choose_avatar_page", c2344009Gk.LIZ);
    }
}
