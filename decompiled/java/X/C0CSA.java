package X;

/* JADX INFO: renamed from: X.0CSA, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CSA {
    public static Long LIZ;
    public static Long LIZIZ;
    public static Long LIZJ;

    public static final void LIZ() {
        if (C0AC0.LIZIZ) {
            Long l = LIZIZ;
            if (l == null) {
                LIZIZ = null;
                LIZJ = null;
                LIZ = null;
                return;
            }
            Long l2 = LIZ;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jLongValue = jCurrentTimeMillis - (l2 != null ? l2.longValue() : l.longValue());
            long jLongValue2 = l2 != null ? l.longValue() - l2.longValue() : 0L;
            Long l3 = LIZJ;
            if (l3 == null) {
                LIZIZ = null;
                LIZJ = null;
                LIZ = null;
                return;
            }
            long jLongValue3 = l3.longValue() - l.longValue();
            long jLongValue4 = jCurrentTimeMillis - l3.longValue();
            if (jLongValue3 > 0 && jLongValue4 > 0 && jLongValue2 >= 0) {
                C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C0CSB(jLongValue2, jLongValue3, jLongValue, jLongValue4, null), 2);
            }
            LIZIZ = null;
            LIZJ = null;
            LIZ = null;
        }
    }
}
