package X;

import java.util.Date;

/* JADX INFO: renamed from: X.10ys, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19423210ys {
    public static final C19423210ys LIZ = new C19423210ys();
    public static String LIZIZ = "profile_photo_page";
    public static boolean LIZJ;

    public static void LIZ(String str) {
        String strValueOf = String.valueOf(new Date().getTime());
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("item_id", str);
        c2344009Gk.LJIIIIZZ("start_time", strValueOf);
        c2344009Gk.LJIIIIZZ("enter_from", LIZIZ);
        C20684815ws.LJIILLIIL("choose_starter_avatar", c2344009Gk.LIZ);
    }

    public static void LIZIZ(String str, String str2, String str3, String str4) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("item_id", str);
        c2344009Gk.LJIIIIZZ("item_tab", str2);
        c2344009Gk.LJIIIIZZ("item_subcategory", str3);
        c2344009Gk.LJIIIIZZ("color", str4);
        C20684815ws.LJIILLIIL("select_avatar_item", c2344009Gk.LIZ);
    }
}
