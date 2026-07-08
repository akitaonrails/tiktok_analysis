package X;

import android.content.Context;
import com.ss.android.ugc.aweme.profile.model.ProfileNgoStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iAW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1232140iAW {
    public static final C1232140iAW LIZ = new C1232140iAW();

    public static void LIZ(boolean z) {
        String str;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("type", "profile_photo");
        c2344009Gk.LJIIIIZZ("enter_from", "personal_homepage");
        if (z) {
            str = "checked";
        } else {
            str = "unchecked";
        }
        c2344009Gk.LJIIIIZZ("to_status", str);
        C20684815ws.LJIILLIIL("change_default_publish_status", c2344009Gk.LIZ);
    }

    public static void LIZIZ(EnumC566250MIt enumC566250MIt) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "personal_homepage_profile");
        c2344009Gk.LIZJ(enumC566250MIt.getMobValue(), "aime_status");
        c2344009Gk.LJIIIIZZ("enter_method", "click_profile_aime");
        C20684815ws.LJIILLIIL("enter_aime_hub", c2344009Gk.LIZ);
    }

    public static void LJ(C1232060iAO c1232060iAO) {
        String str;
        String str2;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_method", c1232060iAO.LIZ);
        c2344009Gk.LJIIIIZZ("type", c1232060iAO.LIZIZ.getStrValue());
        String str3 = c1232060iAO.LIZJ;
        if (str3 != null) {
            c2344009Gk.LJFF("enter_from", str3);
        }
        if (C1EDI.LJFF() && (str2 = c1232060iAO.LIZLLL) != null) {
            c2344009Gk.LJFF("previous_page", str2);
        }
        String str4 = c1232060iAO.LJ;
        if (str4 != null) {
            c2344009Gk.LJFF("btn_name", str4);
        }
        Boolean bool = c1232060iAO.LJFF;
        if (bool != null) {
            if (bool.booleanValue()) {
                str = "checked";
            } else {
                str = "unchecked";
            }
            c2344009Gk.LJFF("default_publish_status", str);
        }
        Boolean bool2 = c1232060iAO.LJIIIIZZ;
        if (bool2 != null) {
            c2344009Gk.LIZJ(!bool2.booleanValue() ? 1 : 0, "complete_status");
        } else {
            c2344009Gk.LIZJ(-1, "complete_status");
        }
        EnumC1216840hlq enumC1216840hlq = c1232060iAO.LJIIIZ;
        if (enumC1216840hlq != null) {
            c2344009Gk.LJFF("platform", enumC1216840hlq.getStrValue());
        }
        ProfileNgoStruct profileNgoStruct = c1232060iAO.LJIIJ;
        if (profileNgoStruct != null) {
            c2344009Gk.LJFF("ngo_name", profileNgoStruct.getName());
            c2344009Gk.LJFF("ngo_link", profileNgoStruct.getDonationLink());
        }
        Boolean bool3 = c1232060iAO.LJIIJJI;
        if (bool3 != null) {
            c2344009Gk.LJ(Boolean.valueOf(bool3.booleanValue()), "has_mentioned_account_in_bio");
        }
        Boolean bool4 = c1232060iAO.LJI;
        if (bool4 != null) {
            c2344009Gk.LIZJ(bool4.booleanValue() ? 1 : 0, "save_status");
        }
        String str5 = c1232060iAO.LJII;
        if (str5 != null) {
            c2344009Gk.LJFF("save_type", str5);
        }
        C20684815ws.LJIILLIIL("save_profile", c2344009Gk.LIZ);
    }

    public static void LJFF(Boolean bool) {
        String str;
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            str = "social_avatar";
        } else {
            str = "photo";
        }
        LJIIIZ("replace_profile_info", "click_head", str);
    }

    public static void LJI(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("entrance", str);
        C20684815ws.LJIILLIIL("edit_profile_entrance_click", c2344009Gk.LIZ);
    }

    public static void LJII(String str, String str2) {
        if (C1EDI.LJFF()) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            if (str == null) {
                str = "";
            }
            c2344009Gk.LJIIIIZZ("enter_method", str);
            if (str2 == null) {
                str2 = "";
            }
            c2344009Gk.LJIIIIZZ("entrance", str2);
            C20684815ws.LJIILLIIL("edit_profile_entrance_show", c2344009Gk.LIZ);
        }
    }

    public static void LJIILL(String str, String str2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("type", "profile_photo");
        c2344009Gk.LJIIIIZZ("enter_from", "personal_homepage");
        c2344009Gk.LJIIIIZZ("default_publish_status", str);
        c2344009Gk.LJIIIIZZ("confirm_method", str2);
        C20684815ws.LJIILLIIL("confirm_default_publish_window", c2344009Gk.LIZ);
    }

    public static void LJIIIIZZ(int i, String str, String str2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LIZJ(i, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c2344009Gk.LJIIIIZZ("click_method", str2);
        C20684815ws.LJIILLIIL("modify_username_confirm", c2344009Gk.LIZ);
    }

    public static void LJIIIZ(String str, String str2, String str3) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("type", str3);
        c2344009Gk.LJIIIIZZ("enter_method", str2);
        C20684815ws.LJIILLIIL(str, c2344009Gk.LIZ);
    }

    public static void LJIIJ(String str, String str2, HashMap map) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("type", "photo");
        c2344009Gk.LJIIIIZZ("enter_from", "personal_homepage");
        c2344009Gk.LJIIIIZZ("enter_method", str2);
        c2344009Gk.LJI(map);
        C20684815ws.LJIILLIIL(str, c2344009Gk.LIZ);
    }

    public static void LJIIJJI(Integer num, String str, int i, boolean z) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LIZJ(i, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c2344009Gk.LIZJ(z ? 1 : 0, "is_synced_from_username");
        if (num != null) {
            c2344009Gk.LIZJ(num.intValue(), "error_code");
        }
        C20684815ws.LJIILLIIL("save_nickname", c2344009Gk.LIZ);
    }

    public static void LJIILIIL(int i, String str, String str2, boolean z) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LIZJ(i, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c2344009Gk.LJIIIIZZ("error_code", str2);
        c2344009Gk.LIZJ(z ? 1 : 0, "is_synced_from_nickname");
        C20684815ws.LJIILLIIL("save_username", c2344009Gk.LIZ);
    }

    public static void LJIILJJIL(C1232140iAW c1232140iAW, int i, int i2, String str) {
        String str2;
        c1232140iAW.getClass();
        if (i2 != 1) {
            if (i2 != 2) {
                str2 = "edit_profile_page";
            } else {
                str2 = "modify_username_notify";
            }
        } else {
            str2 = "personal_homepage";
        }
        LJIILIIL(i, str2, str, false);
    }

    public static void LIZJ(Context context, String str, Long l, Boolean bool, long j, Boolean bool2) {
        String str2;
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (l != null) {
            c2344009Gk.LIZLLL(l.longValue(), "clean_size");
        }
        String str3 = "true";
        if (bool != null) {
            if (bool.booleanValue()) {
                str2 = "true";
            } else {
                str2 = "false";
            }
            c2344009Gk.LJFF("has_clean_success", str2);
        }
        if (bool2 != null) {
            if (!bool2.booleanValue()) {
                str3 = "false";
            }
            c2344009Gk.LJFF("is_save_success", str3);
        }
        c2344009Gk.LIZLLL(j, "available_storage_size");
        c2344009Gk.LIZLLL(C0WYJ.LJII(context), "memory_size");
        c2344009Gk.LIZLLL(C0WYJ.LJI(), "internal_available_size");
        c2344009Gk.LJFF("tag", str);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(" availableStorageSize: ");
        sbLIZ.append(j);
        sbLIZ.append(", cleanSize: ");
        sbLIZ.append(l);
        sbLIZ.append(", hasCleanSuccess: ");
        sbLIZ.append(bool);
        sbLIZ.append(", isSaveSuccess: ");
        sbLIZ.append(bool2);
        C1720106oR.LJI("test_clean", C2188811AlT.LIZIZ(sbLIZ));
        C20684815ws.LJIILLIIL("storage_full_status", c2344009Gk.LIZ);
    }
}
