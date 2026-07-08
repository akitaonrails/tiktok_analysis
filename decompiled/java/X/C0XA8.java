package X;

import Y.ARunnableS102S0000000_29;
import Y.ARunnableS113S0100000_13;

/* JADX INFO: renamed from: X.0XA8, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XA8 {
    public static boolean LIZ;
    public static C0XA9 LIZIZ;
    public static boolean LIZJ;
    public static boolean LIZLLL;

    public static void LIZ(boolean z) {
        if (LIZ && LIZJ != z) {
            if (z) {
                if (!LIZLLL) {
                    LIZLLL = true;
                    C786410Ut5.LJLIIL(60000L, C083Z.LIZIZ.LIZ(), new ARunnableS102S0000000_29(2));
                }
                C791390V2r.LJJIII.LJ(LIZIZ);
                LIZJ = true;
                return;
            }
            C791390V2r.LJJIII.LJIILLIIL(LIZIZ);
            C0XA9 c0xa9 = LIZIZ;
            c0xa9.LLILLJJLI.removeCallbacks(c0xa9.LLILZ);
            C786410Ut5.LJJZZIII(c0xa9.LLILLJJLI, new ARunnableS113S0100000_13(c0xa9, 239));
            c0xa9.LLILLJJLI.getLooper().quitSafely();
            LIZJ = false;
        }
    }
}
