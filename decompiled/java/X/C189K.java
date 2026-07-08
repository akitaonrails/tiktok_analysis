package X;

import java.util.Locale;

/* JADX INFO: renamed from: X.189K, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C189K {
    public static final C189K LIZ = new C189K();

    public static void LIZ(boolean z, String str, C18JV c18jv) {
        if (z && str != null) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            Locale locale = Locale.ROOT;
            c2344009Gk.LJIIIIZZ("path", str.toLowerCase(locale));
            c2344009Gk.LJIIIIZZ("action_type", c18jv.name().toLowerCase(locale));
            C20684815ws.LJIILLIIL("ai_avatar_post_page", c2344009Gk.LIZ);
        }
    }
}
