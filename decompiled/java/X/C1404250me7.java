package X;

/* JADX INFO: renamed from: X.0me7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1404250me7 {
    public static String LIZ = "";

    public static final C0LAB LIZ(String str) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", LIZ);
        c0lab.LJ("shoot_way", str);
        c0lab.LJ("enter_from", "template_preview_page");
        return c0lab;
    }

    public static final void LIZIZ(int i, String str, long j, String str2) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("item_id", str);
        c0lab.LIZ(i, "action");
        c0lab.LIZIZ(System.currentTimeMillis() - j, "duration");
        c0lab.LJ("shoot_way", str2);
        C20684815ws.LJIILLIIL("ugc_template_preview_page_duration", c0lab.LIZ);
    }

    public static final void LIZJ(int i, String str, String str2, long j, String str3) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("item_id", str);
        c0lab.LIZIZ(System.currentTimeMillis() - j, "duration");
        c0lab.LIZ(i, "error_code");
        c0lab.LJ("error_msg", str2);
        c0lab.LJ("shoot_way", str3);
        C20684815ws.LJIILLIIL("ugc_template_preview_first_frame", c0lab.LIZ);
    }
}
