package X;

import android.content.Context;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.0Pew, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C650240Pew {
    public static final C650240Pew LIZ = new C650240Pew();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1059));
    public static final int LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
    public static final int LIZLLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    public static final int LJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    public static final int LJFF = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
    public static final int LJI = C0H9H.LIZIZ(8);
    public static final int LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
    public static final int LJIIIIZZ;
    public static int LJIIIZ;
    public static int LJIIJ;

    static {
        C659720PuE.LIZ.getClass();
        LJIIIIZZ = C659720PuE.LIZ() ? C0H9H.LIZIZ(24) : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
    }

    public static final boolean LIZ() {
        LIZ.getClass();
        return ((Boolean) LIZIZ.getValue()).booleanValue() && !C19252910Tv.LIZIZ.LIZLLL().LJII().LLLLIIL();
    }

    public static int LIZLLL() {
        if (LJIIIZ == 0) {
            LJ();
        }
        return LJIIIZ;
    }

    public static void LJ() {
        LJIIIZ = C648880Pck.LIZ(41, 2) + LJI + LJII + (C1830507Ex.LIZ() ? C648880Pck.LIZ(71, 1) + C648880Pck.LIZ(91, 1) : LJIIIIZZ);
    }

    public static int LIZIZ(Context context) {
        double dLIZIZ;
        int i;
        int i2 = LJIIJ;
        if (i2 != 0) {
            return i2;
        }
        int iLIZ = C1616640sAg.LIZ(null);
        if (LIZ()) {
            dLIZIZ = (((double) ((C497820Jfg.LIZIZ(context) - (LIZJ * (iLIZ + 1))) / iLIZ)) / 0.625d) + ((double) LIZLLL());
            i = LJFF;
        } else {
            dLIZIZ = (((double) ((C497820Jfg.LIZIZ(context) - (LIZLLL * (iLIZ + 1))) / iLIZ)) / 0.625d) + ((double) LIZLLL());
            i = LJFF;
        }
        int i3 = (int) (dLIZIZ + ((double) i));
        LJIIJ = i3;
        return i3;
    }

    public static int LIZJ(Context context) {
        int iLIZ = C1616640sAg.LIZ(null);
        if (LIZ()) {
            return (C497820Jfg.LIZIZ(context) - (LIZJ * (iLIZ + 1))) / C1616640sAg.LIZ(null);
        }
        return (C497820Jfg.LIZIZ(context) - (LIZLLL * (iLIZ + 1))) / C1616640sAg.LIZ(null);
    }
}
