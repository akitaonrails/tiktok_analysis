package X;

import Y.ARunnableS135S0100000_35;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0Sew, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C726680Sew {
    public static boolean LIZ;
    public static Aweme LIZIZ;
    public static int LIZLLL;
    public static C2189821An6 LJ;
    public static String LIZJ = "";
    public static final C726670Sev LJFF = C726670Sev.LIZ;

    public static void LIZ() {
        if (LIZ) {
            C726670Sev c726670Sev = LJFF;
            if (c726670Sev != null) {
                C2487409ou.LIZJ(new ARunnableS135S0100000_35(c726670Sev, 26));
            }
            LIZ = false;
            LIZIZ = null;
        }
    }

    public static void LIZIZ(Aweme aweme, String str, int i, C2189821An6 c2189821An6, int i2) {
        if ((i2 & 8) != 0) {
            c2189821An6 = null;
        }
        LIZIZ = aweme;
        LIZJ = str;
        LIZLLL = i;
        if (!LIZ) {
            C726670Sev c726670Sev = LJFF;
            if (c726670Sev != null) {
                C2487409ou.LIZJ(new ARunnableS135S0100000_35(c726670Sev, 25));
            }
            LIZ = true;
        }
        LJ = c2189821An6;
    }
}
