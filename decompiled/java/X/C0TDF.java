package X;

import kotlin.jvm.internal.AFwS199S0000000_12;

/* JADX INFO: renamed from: X.0TDF, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TDF {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(481));

    public static C0TDG LIZLLL() {
        return (C0TDG) LIZ.getValue();
    }

    public static String LIZ() {
        return LIZLLL().LJIIIZ;
    }

    public static C11PQ LIZIZ() {
        return LIZLLL().LIZIZ;
    }

    public static C11PQ LIZJ() {
        return LIZLLL().LIZ;
    }

    public static int LJ() {
        return ((Number) LIZLLL().LJI.getValue()).intValue();
    }

    public static int LJFF() {
        return ((Number) LIZLLL().LJFF.getValue()).intValue();
    }

    public static boolean LJI() {
        return LIZLLL().LIZJ();
    }

    public static void LJII(float f, float f2) {
        boolean z;
        C0TDG c0tdgLIZLLL = LIZLLL();
        c0tdgLIZLLL.getClass();
        if (f > 0.0f && f2 > 0.0f) {
            float f3 = f2 / f;
            C11PQ<Boolean> c11pq = c0tdgLIZLLL.LJ;
            if (f3 < c0tdgLIZLLL.LJII) {
                z = true;
            } else {
                z = false;
            }
            c11pq.onNext(Boolean.valueOf(z));
        }
    }
}
