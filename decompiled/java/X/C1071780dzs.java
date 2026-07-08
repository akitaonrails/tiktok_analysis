package X;

import com.bytedance.keva.Keva;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0dzs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1071780dzs {
    public static final C1071780dzs LIZ = new C1071780dzs();

    public static String LIZJ(String str) {
        if (Intrinsics.LJFF(str, "facebook")) {
            if (C1076010e6h.LIZJ.LJII().LJ()) {
                return "on";
            }
            return "off";
        }
        boolean zLJ = C1076010e6h.LIZJ.LJIIJ().LJ();
        boolean zLIZ = C1072200e0Y.LIZ("android.permission.READ_CONTACTS");
        if (zLJ) {
            return "on";
        }
        if (!zLIZ) {
            return "unknown";
        }
        return "off";
    }

    public static String LIZLLL(String str) {
        boolean zLIZIZ;
        if (Intrinsics.LJFF(str, "facebook")) {
            zLIZIZ = C1076010e6h.LIZJ.LJII().LIZIZ();
        } else {
            zLIZIZ = C1076010e6h.LIZJ.LJIIJ().LIZIZ();
        }
        if (zLIZIZ) {
            return "on";
        }
        return "off";
    }

    public static void LJFF(int i, String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(i, "errorcode");
        if (str == null) {
            str = "";
        }
        c2344009Gk.LJIIIIZZ("errorMsg", str);
        C20684815ws.LJIILLIIL("social_pop_fail_reason", c2344009Gk.LIZ);
    }

    public static void LJ(Map map, String str, String str2, C2344009Gk c2344009Gk) {
        int iCurrentTimeMillis;
        String str3;
        String str4;
        boolean z;
        boolean z2;
        boolean z3;
        String str5;
        boolean z4 = true;
        if (map != null) {
            if (map.containsKey("is_passive") && Intrinsics.LJFF(map.get("is_passive"), "on")) {
                String str6 = C1071790dzt.LIZIZ;
                long j = C1071800dzu.LIZ().LIZ.getLong("last_show_contact_time", 0L);
                if (j == 0) {
                    iCurrentTimeMillis = 0;
                } else {
                    iCurrentTimeMillis = (int) ((System.currentTimeMillis() - j) / 86400000);
                }
                c2344009Gk.LIZJ(C1071800dzu.LIZ().LIZ.getInt("contact_pop_up_count", 0) + C1071800dzu.LIZ().LIZ.getInt("reask_count", 0), "show_index");
                c2344009Gk.LIZJ(iCurrentTimeMillis, "time_int");
                if (map != null) {
                    str3 = (String) map.get("is_followed_pop_up");
                } else {
                    str3 = null;
                }
                c2344009Gk.LJFF("followed_another", str3);
                if (Intrinsics.LJFF(str, "following_list") || Intrinsics.LJFF(str, "follower_list")) {
                    if (C1071800dzu.LIZ().LIZ.getBoolean("is_my_self", false)) {
                        str4 = "personal_homepage";
                    } else {
                        str4 = "others_homepage";
                    }
                    c2344009Gk.LJFF("previous_page", str4);
                }
                Keva keva = C1071800dzu.LIZ().LIZ;
                if (!keva.getBoolean("has_go_through_process", false) && keva.getInt("rules_major_stage", 0) < 4) {
                    z = true;
                } else {
                    z = false;
                }
                if (C1071800dzu.LIZ().LIZ.getLong("sync_off_contact_time", 0L) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (C1071800dzu.LIZ().LIZ.getLong("sync_off_facebook_time", 0L) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if ((!z2 || !Intrinsics.LJFF(str2, "contact")) && (!z3 || !Intrinsics.LJFF(str2, "facebook"))) {
                    z4 = false;
                }
                if (z) {
                    str5 = "normal";
                } else if (z4) {
                    str5 = "turn_off";
                } else {
                    str5 = "reject_all";
                }
                c2344009Gk.LJFF("reason", str5);
                return;
            }
            c2344009Gk.LJII(map);
        }
    }

    public static void LIZ(C1071780dzs c1071780dzs, String str, String str2, String str3, String str4) {
        c1071780dzs.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("pop_up_type", str2);
        c2344009Gk.LJIIIIZZ("platform", str3);
        c2344009Gk.LJIIIIZZ("auth_type", str4);
        c2344009Gk.LJIIIIZZ("enter_method", "");
        c2344009Gk.LJIIIIZZ("sync_type", "auto");
        c2344009Gk.LIZJ(1, "has_uid_errorcode");
        c2344009Gk.LIZJ(1, "retry");
        Intrinsics.LJFF(str3, "facebook");
        LJ(null, str, str3, c2344009Gk);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("authorizeFailAfterAllow, ");
        sbLIZ.append(c2344009Gk.LIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        C20684815ws.LJIILLIIL("authorize_fail_after_allow", c2344009Gk.LIZ);
    }

    public static void LIZIZ(C1071780dzs c1071780dzs, String str, String str2, String str3, String str4, String str5, String str6, Integer num, int i) {
        if ((i & 128) != 0) {
            num = null;
        }
        c1071780dzs.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("pop_up_type", str2);
        c2344009Gk.LJIIIIZZ("platform", str3);
        c2344009Gk.LJIIIIZZ("auth_type", str5);
        c2344009Gk.LJIIIIZZ("sync_type", str6);
        c2344009Gk.LJIIIIZZ("enter_method", str4);
        if (Intrinsics.LJFF(str3, "facebook") && num != null) {
            c2344009Gk.LIZJ(num.intValue(), "server_fb_token");
        }
        LJ(null, str, str3, c2344009Gk);
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("authorizeFinish, ");
        sbLIZ.append(c2344009Gk.LIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        C20684815ws.LJIILLIIL("authorize_finish", c2344009Gk.LIZ);
    }
}
