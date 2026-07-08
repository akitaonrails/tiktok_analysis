package X;

/* JADX INFO: renamed from: X.1B3y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2198841B3y {
    public static final C2198841B3y LIZ = new C2198841B3y();

    public static void LIZIZ(Integer num, String str, String str2, String str3) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (str2.length() > 0) {
            c2344009Gk.LJFF("share_from_dsp", str2);
        }
        if (str3.length() <= 0) {
            str3 = "";
        }
        c2344009Gk.LJFF("entity_uri", str3);
        if (C08A4.LIZ(num)) {
            c2344009Gk.LJ(num, "fail_reason");
        }
        C20684815ws.LJIILLIIL(str, c2344009Gk.LIZ);
    }

    public static void LJ(String str, String str2, String str3, C1B45 c1b45) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (str2.length() > 0) {
            c2344009Gk.LJFF("sdk_name", str2);
        }
        if (str3.length() > 0) {
            c2344009Gk.LJFF("sdk_version", str3);
        }
        if (str != null) {
            c2344009Gk.LJFF("channel", str);
        }
        c2344009Gk.LJFF("launch_method", "share_to_dm");
        c2344009Gk.LIZJ(c1b45.LIZ, "error_code");
        c2344009Gk.LIZJ(c1b45.LIZIZ, "sub_error_code");
        C20684815ws.LJIILLIIL("open_share_check", c2344009Gk.LIZ);
    }

    public static void LJFF(String str, String str2, String str3, String str4, String str5) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (str3.length() > 0) {
            c2344009Gk.LJFF("sdk_name", str3);
        }
        if (str4.length() > 0) {
            c2344009Gk.LJFF("sdk_version", str4);
        }
        if (str5.length() > 0) {
            c2344009Gk.LJFF("launch_method", str5);
        }
        if (str2 != null) {
            c2344009Gk.LJFF("channel", str2);
        }
        C20684815ws.LJIILLIIL(str, c2344009Gk.LIZ);
    }

    public static final void LJI(String str, String str2, String str3, String str4, C1B45 c1b45) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("channel", str);
        c2344009Gk.LJIIIIZZ("launch_method", "share_to_dm");
        c2344009Gk.LJIIIIZZ("launch_from", str2);
        c2344009Gk.LIZJ(c1b45.LIZIZ, "error_code");
        c2344009Gk.LJIIIIZZ("sdk_name", str3);
        c2344009Gk.LJFF("sdk_version", str4);
        C20684815ws.LJIILLIIL("open_share_after_check_result", c2344009Gk.LIZ);
    }

    public static final void LIZJ(String str, String str2, String str3, String str4, String str5, C1B4F c1b4f, int i) {
        String str6;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("launch_method", str);
        c2344009Gk.LJIIIIZZ("launch_from", str2);
        c2344009Gk.LIZJ(c1b4f.LIZIZ, "error_code");
        String str7 = c1b4f.LIZLLL;
        if (str7.length() == 0) {
            str7 = c1b4f.LIZJ;
        }
        c2344009Gk.LJIIIIZZ("error_msg", str7);
        c2344009Gk.LIZJ(i, "share_media_type");
        if (c1b4f.LIZ == 0) {
            str6 = "success";
        } else {
            str6 = "fail";
        }
        c2344009Gk.LJIIIIZZ("result", str6);
        if (str4 == null) {
            str4 = "";
        }
        c2344009Gk.LJIIIIZZ("sdk_name", str4);
        if (str5 == null) {
            str5 = "";
        }
        c2344009Gk.LJIIIIZZ("sdk_version", str5);
        if (str3 != null) {
            c2344009Gk.LJFF("channel", str3);
        }
        C20684815ws.LJIILLIIL("open_share_after_check_result", c2344009Gk.LIZ);
    }

    public static final C2344009Gk LIZ(String str, String str2, C1B4F c1b4f, String str3, String str4, String str5, int i, int i2, String str6) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (str6 == null) {
            str6 = "sdk";
        }
        c2344009Gk.LJIIIIZZ("launch_method", str6);
        c2344009Gk.LJIIIIZZ("launch_from", str);
        c2344009Gk.LIZJ(i, "share_media_type");
        c2344009Gk.LIZJ(i2, "share_media_count");
        c2344009Gk.LIZJ(c1b4f.LIZIZ, "error_code");
        String str7 = c1b4f.LIZLLL;
        if (str7.length() == 0) {
            str7 = c1b4f.LIZJ;
        }
        c2344009Gk.LJIIIIZZ("error_msg", str7);
        c2344009Gk.LJFF("sdk_name", str4);
        c2344009Gk.LJFF("sdk_version", str5);
        if (str2 != null) {
            c2344009Gk.LJFF("result", str2);
        }
        if (str3 != null) {
            c2344009Gk.LJFF("channel", str3);
        }
        return c2344009Gk;
    }

    public static void LIZLLL(String str, String str2, C1B4F c1b4f, String str3, String str4, String str5, int i, int i2, Integer num, String str6) {
        C2344009Gk c2344009GkLIZ = LIZ(str, str2, c1b4f, str3, str4, str5, i, i2, str6);
        if (num != null) {
            c2344009GkLIZ.LIZJ(num.intValue(), "share_permission_grant_status");
        }
        C20684815ws.LJIILLIIL("open_share_check", c2344009GkLIZ.LIZ);
    }
}
