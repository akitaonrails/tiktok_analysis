package X;

import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.13Lb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19994513Lb {
    public static final C19994613Lc LIZ(int i) {
        return new C19994613Lc(i, i >> 31);
    }

    public static final C19994613Lc LIZIZ(long j) {
        return new C19994613Lc((int) j, (int) (j >> 32));
    }

    public static final String LIZJ(Object obj, Object obj2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Random range is empty: [");
        sbLIZ.append(obj);
        sbLIZ.append(", ");
        sbLIZ.append(obj2);
        sbLIZ.append(").");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final int LIZLLL(C19994913Lf c19994913Lf, IntRange intRange) {
        if (!intRange.isEmpty()) {
            int i = intRange.LLILLJJLI;
            if (i < Integer.MAX_VALUE) {
                return c19994913Lf.nextInt(intRange.LL, i + 1);
            }
            int i2 = intRange.LL;
            if (i2 > Integer.MIN_VALUE) {
                return c19994913Lf.nextInt(i2 - 1, i) + 1;
            }
            return c19994913Lf.nextInt();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Cannot get random in empty range: ");
        sbLIZ.append(intRange);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final long LJ(C19994913Lf c19994913Lf, C354710DvR c354710DvR) {
        if (!c354710DvR.isEmpty()) {
            long j = c354710DvR.LLILLJJLI;
            if (j < Long.MAX_VALUE) {
                return c19994913Lf.nextLong(c354710DvR.LL, j + 1);
            }
            long j2 = c354710DvR.LL;
            if (j2 > Long.MIN_VALUE) {
                return c19994913Lf.nextLong(j2 - 1, j) + 1;
            }
            return c19994913Lf.nextLong();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Cannot get random in empty range: ");
        sbLIZ.append(c354710DvR);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
