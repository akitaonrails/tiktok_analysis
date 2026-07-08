package X;

import android.net.Uri;

/* JADX INFO: renamed from: X.10Sc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19248410Sc {
    public static final C19248410Sc LIZ = new C19248410Sc();
    public static String LIZIZ = "";
    public static Uri LIZJ;
    public static boolean LIZLLL;
    public static int LJ;
    public static int LJFF;
    public static int LJI;
    public static int LJII;

    public static C2344009Gk LIZ() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("url", LIZIZ);
        c2344009Gk.LIZJ(LJ, "is_ecomm_new");
        c2344009Gk.LIZJ(LJFF, "is_enable_onboarding_tts_by_age");
        c2344009Gk.LIZJ(LJI, "has_landing_url");
        c2344009Gk.LIZJ(LJII, "is_show_ecomm_feed_card");
        if (LIZLLL) {
            c2344009Gk.LJFF("need_mall", "1");
        }
        return c2344009Gk;
    }

    public static void LIZIZ(String str) {
        int i;
        C2344009Gk c2344009GkLIZ = LIZ();
        if (C123100dR.LIZ(str)) {
            c2344009GkLIZ.LJFF("failure_reason", str);
            i = 0;
        } else {
            i = 1;
        }
        c2344009GkLIZ.LIZJ(i, "is_success");
        C19249910Sr.LIZIZ.LIZIZ(c2344009GkLIZ, "tts_open_link");
        Uri uri = LIZJ;
        if (uri != null) {
            C10SW c10sw = C10SW.LIZ;
            c10sw.LJIIJ("deeplink");
            c10sw.LJII(uri);
            if (i == 1) {
                c10sw.LJIIIIZZ();
            } else {
                C10SW.LJIIL(null, "open_link_failed", str);
            }
        }
    }
}
