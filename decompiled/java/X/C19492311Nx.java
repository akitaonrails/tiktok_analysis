package X;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: X.11Nx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19492311Nx {
    public static long LIZIZ(long j, long j2) {
        long j3 = j + j2;
        if (j3 < 0) {
            return Long.MAX_VALUE;
        }
        return j3;
    }

    public static long LIZ(AtomicLong atomicLong, long j) {
        long j2;
        do {
            j2 = atomicLong.get();
            if (j2 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(j2, LIZIZ(j2, j)));
        return j2;
    }

    public static void LIZJ(AtomicLong atomicLong, long j) {
        long j2;
        long j3;
        do {
            j2 = atomicLong.get();
            if (j2 == Long.MAX_VALUE) {
                return;
            }
            j3 = j2 - j;
            if (j3 < 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("More produced than requested: ");
                sbLIZ.append(j3);
                C19489211Ms.LIZIZ(new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ)));
                j3 = 0;
            }
        } while (!atomicLong.compareAndSet(j2, j3));
    }
}
