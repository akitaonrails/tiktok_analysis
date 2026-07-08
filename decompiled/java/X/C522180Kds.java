package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Kds, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C522180Kds {
    public static final C522180Kds LIZ = new C522180Kds();
    public static String LIZIZ;
    public static String LIZJ;
    public static String LIZLLL;

    public static C0LAB LIZ(boolean z) {
        String str;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("shoot_way", LIZJ);
        c0lab.LJ("creation_id", LIZIZ);
        c0lab.LJ("content_source", "upload");
        String str2 = LIZLLL;
        if (str2 == null) {
            str2 = "";
        }
        c0lab.LJ("mv_id", str2);
        c0lab.LJ("enter_from", "album_panel");
        if (z) {
            str = "video";
        } else {
            str = "photo";
        }
        c0lab.LJ("content_type", str);
        return c0lab;
    }

    public static void LIZJ(String str) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("shoot_way", LIZJ);
        c0lab.LJ("creation_id", LIZIZ);
        c0lab.LJ("toast_type", str);
        c0lab.LJ("enter_from", "album_panel");
        C20684815ws.LJIILLIIL("album_toast_show", c0lab.LIZ);
    }

    public static void LIZIZ(String str, String str2, boolean z, boolean z2) {
        C0LAB c0labLIZ = LIZ(z);
        c0labLIZ.LJ("button_type", str2);
        c0labLIZ.LJ("enter_from", str);
        if (Intrinsics.LJFF(str2, "edit") || Intrinsics.LJFF(str2, "autocut")) {
            c0labLIZ.LIZ(z2 ? 1 : 0, "is_disable_by_layout");
        }
        C20684815ws.LJIILLIIL("album_page_button_click_forep", c0labLIZ.LIZ);
    }
}
