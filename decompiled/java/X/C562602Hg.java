package X;

/* JADX INFO: renamed from: X.02Hg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C562602Hg {
    public static final boolean LIZ(boolean z, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        return z;
    }

    public static final double LIZIZ(double d, Double d2) {
        if (d2 != null) {
            return d2.doubleValue();
        }
        return d;
    }

    public static final float LIZJ(float f, Double d) {
        if (d != null) {
            return (float) d.doubleValue();
        }
        return f;
    }

    public static final Float LIZLLL(Double d, Float f) {
        if (d != null) {
            return Float.valueOf((float) d.doubleValue());
        }
        return f;
    }

    public static final float LJ(float f, Float f2) {
        if (f2 != null) {
            return f2.floatValue();
        }
        return f;
    }

    public static final int LJFF(int i, Integer num) {
        if (num != null) {
            return num.intValue();
        }
        return i;
    }

    public static final long LJI(long j, Integer num) {
        if (num != null) {
            return num.intValue();
        }
        return j;
    }

    public static final Long LJII(Integer num, Long l) {
        if (num != null) {
            return Long.valueOf(num.intValue());
        }
        return l;
    }

    public static final boolean LJIIIIZZ(boolean z, Integer num) {
        if (num != null) {
            if (num.intValue() != 0) {
                return true;
            }
            return false;
        }
        return z;
    }

    public static final int LJIIIZ(int i, Long l) {
        if (l != null) {
            if (new C354710DvR(-2147483648L, 2147483647L).LJIIIIZZ(l.longValue())) {
                return (int) l.longValue();
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Value ");
            sbLIZ.append(l);
            sbLIZ.append(" is out of Int range");
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        return i;
    }

    public static final Integer LJIIJ(Integer num, Long l) {
        if (l != null) {
            if (new C354710DvR(-2147483648L, 2147483647L).LJIIIIZZ(l.longValue())) {
                return Integer.valueOf((int) l.longValue());
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Value ");
            sbLIZ.append(l);
            sbLIZ.append(" is out of Int range");
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        return num;
    }

    public static final long LJIIJJI(long j, Long l) {
        if (l != null) {
            return l.longValue();
        }
        return j;
    }

    public static final String LJIIL(Integer num, String str) {
        String string;
        if (num != null && (string = num.toString()) != null) {
            return string;
        }
        return str;
    }

    public static final String LJIILIIL(Long l, String str) {
        String string;
        if (l != null && (string = l.toString()) != null) {
            return string;
        }
        return str;
    }
}
