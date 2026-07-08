package X;

import kotlin.jvm.internal.AFwS200S0000000_13;

/* JADX INFO: renamed from: X.0WvZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C838910WvZ {
    public static int LIZIZ;
    public static boolean LIZJ;
    public static boolean LJ;
    public static boolean LJFF;
    public static boolean LIZ = true;
    public static double LIZLLL = 1.0d;

    public static void LIZ() {
        boolean z = LIZJ;
        Double dValueOf = Double.valueOf(1.0d);
        if (z) {
            boolean z2 = LIZJ;
            AFwS200S0000000_13 aFwS200S0000000_13 = AFwS200S0000000_13.get$arr$(374);
            C838890WvX.LIZLLL = z2;
            C838890WvX.LIZJ = dValueOf != null ? dValueOf.doubleValue() : 1.0d;
            C838890WvX.LIZIZ = aFwS200S0000000_13;
            return;
        }
        if (LJ && !LJFF) {
            C838890WvX.LIZLLL = LIZJ;
            C838890WvX.LIZJ = dValueOf != null ? dValueOf.doubleValue() : 1.0d;
            C838890WvX.LIZIZ = null;
        } else {
            boolean z3 = LIZJ;
            Double dValueOf2 = Double.valueOf(LIZLLL);
            C838890WvX.LIZLLL = z3;
            C838890WvX.LIZJ = dValueOf2 != null ? dValueOf2.doubleValue() : 1.0d;
            C838890WvX.LIZIZ = null;
        }
    }
}
