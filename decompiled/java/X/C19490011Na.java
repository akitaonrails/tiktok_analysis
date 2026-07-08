package X;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.11Na, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19490011Na<T> {
    public static C11O1 LIZJ(long j, TimeUnit timeUnit) {
        return LIZIZ(j, j, timeUnit, C11S5.LIZIZ);
    }

    public static C11O1 LIZ(long j, long j2, TimeUnit timeUnit) {
        return LIZIZ(j, j2, timeUnit, C11S5.LIZIZ);
    }

    public static C11O1 LIZIZ(long j, long j2, TimeUnit timeUnit, C11RO c11ro) {
        C1701890uOB.LIZ(timeUnit, "unit is null");
        C1701890uOB.LIZ(c11ro, "scheduler is null");
        return new C11O1(Math.max(0L, j), Math.max(0L, j2), timeUnit, c11ro);
    }

    public static C11NZ<Long> LIZLLL(long j, long j2, long j3, long j4, TimeUnit timeUnit) {
        C11RO c11ro = C11S5.LIZIZ;
        if (j2 >= 0) {
            if (j2 == 0) {
                C11IR c11ir = C11IR.LL;
                c11ir.getClass();
                C1701890uOB.LIZ(timeUnit, "unit is null");
                C1701890uOB.LIZ(c11ro, "scheduler is null");
                return new C11O5(c11ir, j3, timeUnit, c11ro);
            }
            long j5 = j + (j2 - 1);
            if (j > 0 && j5 < 0) {
                throw new IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
            }
            C1701890uOB.LIZ(timeUnit, "unit is null");
            C1701890uOB.LIZ(c11ro, "scheduler is null");
            return new C11O2(j, j5, Math.max(0L, j3), Math.max(0L, j4), timeUnit, c11ro);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("count >= 0 required but it was ");
        sbLIZ.append(j2);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
