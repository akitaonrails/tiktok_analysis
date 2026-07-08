package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0p2Z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1496290p2Z {
    public static C1496260p2W LIZ() throws InterruptedException {
        C1496260p2W c1496260p2W = C1496260p2W.LJIIIZ;
        if (c1496260p2W == null) {
            Intrinsics.LJIIL();
        }
        C1496260p2W c1496260p2W2 = c1496260p2W.LJFF;
        if (c1496260p2W2 == null) {
            long jNanoTime = System.nanoTime();
            C1496260p2W.class.wait(C1496260p2W.LJII);
            C1496260p2W c1496260p2W3 = C1496260p2W.LJIIIZ;
            if (c1496260p2W3 == null) {
                Intrinsics.LJIIL();
            }
            if (c1496260p2W3.LJFF != null || System.nanoTime() - jNanoTime < C1496260p2W.LJIIIIZZ) {
                return null;
            }
            return C1496260p2W.LJIIIZ;
        }
        long jNanoTime2 = c1496260p2W2.LJI - System.nanoTime();
        if (jNanoTime2 > 0) {
            long j = jNanoTime2 / 1000000;
            C1496260p2W.class.wait(j, (int) (jNanoTime2 - (1000000 * j)));
            return null;
        }
        C1496260p2W c1496260p2W4 = C1496260p2W.LJIIIZ;
        if (c1496260p2W4 == null) {
            Intrinsics.LJIIL();
        }
        c1496260p2W4.LJFF = c1496260p2W2.LJFF;
        c1496260p2W2.LJFF = null;
        return c1496260p2W2;
    }
}
