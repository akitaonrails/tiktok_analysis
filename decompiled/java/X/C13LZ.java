package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.NoSuchElementException;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.13LZ, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public class C13LZ extends C19994413La {
    public static final int LIZ(int i, int i2) {
        return i < i2 ? i2 : i;
    }

    public static final int LIZIZ(int i, int i2) {
        return i > i2 ? i2 : i;
    }

    public static final C1846520y9S LJIIL(IntRange intRange) {
        C1846510y9R c1846510y9R = C1846520y9S.LLILZ;
        int i = intRange.LLILLJJLI;
        int i2 = intRange.LL;
        int i3 = -intRange.LLILLL;
        c1846510y9R.getClass();
        return new C1846520y9S(i, i2, i3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final long LJI(long j, C354710DvR c354710DvR) {
        if (c354710DvR instanceof C13LY) {
            return ((Number) LJII(Long.valueOf(j), (C13LY) c354710DvR)).longValue();
        }
        if (!c354710DvR.isEmpty()) {
            if (j < ((Number) c354710DvR.getStart()).longValue()) {
                return ((Number) c354710DvR.getStart()).longValue();
            }
            if (j <= ((Number) c354710DvR.LJFF()).longValue()) {
                return j;
            }
            return ((Number) c354710DvR.LJFF()).longValue();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Cannot coerce value to an empty range: ");
        sbLIZ.append(c354710DvR);
        sbLIZ.append('.');
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final <T extends Comparable<? super T>> T LJII(T t, C13LY<T> c13ly) {
        if (!c13ly.isEmpty()) {
            if (c13ly.LJ(t, c13ly.getStart()) && !c13ly.LJ(c13ly.getStart(), t)) {
                return c13ly.getStart();
            }
            if (!c13ly.LJ(c13ly.LJFF(), t) || c13ly.LJ(t, c13ly.LJFF())) {
                return t;
            }
            return c13ly.LJFF();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Cannot coerce value to an empty range: ");
        sbLIZ.append(c13ly);
        sbLIZ.append('.');
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final C1846520y9S LJIIIZ(int i, int i2) {
        C1846520y9S.LLILZ.getClass();
        return new C1846520y9S(i, i2, -1);
    }

    public static final int LJIIJ(C19994913Lf c19994913Lf, IntRange intRange) {
        try {
            return C19994513Lb.LIZLLL(c19994913Lf, intRange);
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public static final long LJIIJJI(C19994913Lf c19994913Lf, C354710DvR c354710DvR) {
        try {
            return C19994513Lb.LJ(c19994913Lf, c354710DvR);
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public static final C1846520y9S LJIILIIL(IntRange intRange, int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        Integer numValueOf = Integer.valueOf(i);
        if (z) {
            C1846510y9R c1846510y9R = C1846520y9S.LLILZ;
            int i2 = intRange.LL;
            int i3 = intRange.LLILLJJLI;
            if (intRange.LLILLL <= 0) {
                i = -i;
            }
            c1846510y9R.getClass();
            return new C1846520y9S(i2, i3, i);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Step must be positive, was: ");
        sbLIZ.append(numValueOf);
        sbLIZ.append('.');
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final IntRange LJIILJJIL(int i, int i2) {
        if (i2 <= Integer.MIN_VALUE) {
            IntRange.LLILZIL.getClass();
            return IntRange.LLILZLL;
        }
        return new IntRange(i, i2 - 1);
    }

    public static final double LIZJ(double d, double d2, double d3) {
        if (d2 <= d3) {
            if (d < d2) {
                return d2;
            }
            if (d > d3) {
                return d3;
            }
            return d;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Cannot coerce value to an empty range: maximum ");
        sbLIZ.append(d3);
        sbLIZ.append(" is less than minimum ");
        sbLIZ.append(d2);
        sbLIZ.append('.');
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final float LIZLLL(float f, float f2, float f3) {
        if (f2 <= f3) {
            if (f < f2) {
                return f2;
            }
            if (f > f3) {
                return f3;
            }
            return f;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Cannot coerce value to an empty range: maximum ");
        sbLIZ.append(f3);
        sbLIZ.append(" is less than minimum ");
        sbLIZ.append(f2);
        sbLIZ.append('.');
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final int LJ(int i, int i2, int i3) {
        if (i2 <= i3) {
            if (i < i2) {
                return i2;
            }
            if (i > i3) {
                return i3;
            }
            return i;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Cannot coerce value to an empty range: maximum ");
        sbLIZ.append(i3);
        sbLIZ.append(" is less than minimum ");
        sbLIZ.append(i2);
        sbLIZ.append('.');
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final long LJFF(long j, long j2, long j3) {
        if (j2 <= j3) {
            if (j < j2) {
                return j2;
            }
            if (j > j3) {
                return j3;
            }
            return j;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Cannot coerce value to an empty range: maximum ");
        sbLIZ.append(j3);
        sbLIZ.append(" is less than minimum ");
        sbLIZ.append(j2);
        sbLIZ.append('.');
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final <T extends Comparable<? super T>> T LJIIIIZZ(T t, T t2, T t3) {
        if (t2 != null) {
            if (t3 != null) {
                if (t2.compareTo(t3) <= 0) {
                    if (t.compareTo(t2) < 0) {
                        return t2;
                    }
                    if (t.compareTo(t3) > 0) {
                        return t3;
                    }
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Cannot coerce value to an empty range: maximum ");
                    sbLIZ.append(t3);
                    sbLIZ.append(" is less than minimum ");
                    sbLIZ.append(t2);
                    sbLIZ.append('.');
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                }
            } else {
                if (t.compareTo(t2) < 0) {
                    return t2;
                }
                if (t3 == null) {
                }
            }
        } else if (t3 == null && t.compareTo(t3) > 0) {
            return t3;
        }
        return t;
    }
}
