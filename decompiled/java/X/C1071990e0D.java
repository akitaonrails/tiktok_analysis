package X;

import java.util.Locale;

/* JADX INFO: renamed from: X.0e0D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1071990e0D {
    public static final C1071990e0D LIZ = new C1071990e0D();

    public static void LIZIZ(String str, int i, EnumC1072080e0M enumC1072080e0M) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_method", "auto");
        c2344009Gk.LJIIIIZZ("verify_type", "email");
        c2344009Gk.LIZJ(i, "show_index");
        c2344009Gk.LJIIIIZZ("show_type", "contact_sync_pop_up");
        c2344009Gk.LJIIIIZZ("click", enumC1072080e0M.name().toLowerCase(Locale.ROOT));
        if (str != null) {
            c2344009Gk.LJFF("enter_from", str);
        }
        C20684815ws.LJIILLIIL("contact_sync_prompt_click", c2344009Gk.LIZ);
    }

    public static void LIZ(String str, String str2, int i, EnumC1072080e0M enumC1072080e0M) {
        String str3;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("verify_type", "contact");
        c2344009Gk.LIZJ(i, "show_index");
        c2344009Gk.LJIIIIZZ("show_type", "contact_sync_pop_up");
        c2344009Gk.LJIIIIZZ("click", enumC1072080e0M.name().toLowerCase(Locale.ROOT));
        C0TNP.LIZ.getClass();
        if (C0TNP.LIZ()) {
            str3 = "ad_disclosure";
        } else {
            str3 = "no_ad_disclosure";
        }
        c2344009Gk.LJIIIIZZ("prompt_content", str3);
        if (str != null) {
            c2344009Gk.LJFF("enter_from", str);
        }
        if (str2 != null) {
            c2344009Gk.LJFF("enter_method", str2);
        }
        C20684815ws.LJIILLIIL("contact_sync_prompt_click", c2344009Gk.LIZ);
    }
}
