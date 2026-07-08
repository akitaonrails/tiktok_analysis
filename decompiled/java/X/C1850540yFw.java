package X;

/* JADX INFO: renamed from: X.0yFw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1850540yFw {
    public static final C1850540yFw LIZ = new C1850540yFw();

    public static void LIZ(C1B4F c1b4f) {
        int i;
        String str;
        int i2 = c1b4f.LIZ;
        if (i2 == -6) {
            i = 1;
        } else {
            if (i2 != -7 && i2 != -7) {
                if (i2 != -8 && i2 != -8) {
                    if (i2 == -9) {
                        i = 5;
                    } else {
                        i = 999;
                        if (i2 != -6) {
                            if (i2 != -7 && i2 != -7) {
                                if (i2 != -8) {
                                    if (i2 == -8) {
                                        str = "DM feature blocked";
                                    } else if (i2 != -9) {
                                        if (i2 == -10) {
                                            str = "child mode";
                                        } else {
                                            str = "others";
                                        }
                                    }
                                }
                            }
                        }
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        c2344009Gk.LIZJ(i, "error_code");
                        c2344009Gk.LJIIIIZZ("error_msg", str);
                        C20684815ws.LJIILLIIL("tiktok_system_share_error", c2344009Gk.LIZ);
                    }
                    str = "U16";
                    C2344009Gk c2344009Gk2 = new C2344009Gk();
                    c2344009Gk2.LIZJ(i, "error_code");
                    c2344009Gk2.LJIIIIZZ("error_msg", str);
                    C20684815ws.LJIILLIIL("tiktok_system_share_error", c2344009Gk2.LIZ);
                }
                i = 4;
                str = "NO DM";
                C2344009Gk c2344009Gk22 = new C2344009Gk();
                c2344009Gk22.LIZJ(i, "error_code");
                c2344009Gk22.LJIIIIZZ("error_msg", str);
                C20684815ws.LJIILLIIL("tiktok_system_share_error", c2344009Gk22.LIZ);
            }
            i = c1b4f.LIZIZ == 30000 ? 2 : 3;
            if (c1b4f.LIZIZ == 30000) {
                str = "exceeded post quantity";
            } else {
                str = "exceeded DM quantity";
            }
            C2344009Gk c2344009Gk222 = new C2344009Gk();
            c2344009Gk222.LIZJ(i, "error_code");
            c2344009Gk222.LJIIIIZZ("error_msg", str);
            C20684815ws.LJIILLIIL("tiktok_system_share_error", c2344009Gk222.LIZ);
        }
        str = "exceeded video length";
        C2344009Gk c2344009Gk2222 = new C2344009Gk();
        c2344009Gk2222.LIZJ(i, "error_code");
        c2344009Gk2222.LJIIIIZZ("error_msg", str);
        C20684815ws.LJIILLIIL("tiktok_system_share_error", c2344009Gk2222.LIZ);
    }

    public static void LIZIZ(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("click_actions", str);
        C20684815ws.LJIILLIIL("tiktok_system_share_page_click", c2344009Gk.LIZ);
    }

    public static void LIZJ(int i, String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("share_format", str);
        c2344009Gk.LIZJ(i, "media_cnt");
        C20684815ws.LJIILLIIL("tiktok_system_share_page_show", c2344009Gk.LIZ);
    }
}
