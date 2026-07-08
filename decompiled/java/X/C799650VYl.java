package X;

/* JADX INFO: renamed from: X.0VYl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C799650VYl {
    public static final ThreadLocal<Long> LIZ = new ThreadLocal<>();
    public static final ThreadLocal<Long> LIZIZ = new ThreadLocal<>();
    public static long LIZJ;
    public static long LIZLLL;

    public static boolean LIZ() {
        return LIZJ > 0 && LIZLLL > 50;
    }

    public static void LIZIZ(long j) {
        C799900VZk.LIZ.getClass();
        if (C2104108Md.LIZLLL(C799900VZk.LJFF().context())) {
            ThreadLocal<Long> threadLocal = LIZIZ;
            threadLocal.set(Long.valueOf(System.currentTimeMillis()));
            long jLongValue = threadLocal.get().longValue() - j;
            ThreadLocal<Long> threadLocal2 = LIZ;
            if (threadLocal2.get() == null) {
                threadLocal2.set(Long.valueOf(jLongValue));
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(C786410Ut5.u3());
                sbLIZ.append(" first update duration");
                sbLIZ.append(threadLocal2.get());
                C2188811AlT.LIZIZ(sbLIZ);
                return;
            }
            threadLocal2.set(Long.valueOf(jLongValue + threadLocal2.get().longValue()));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(C786410Ut5.u3());
            sbLIZ2.append(" update duration");
            sbLIZ2.append(threadLocal2.get());
            C2188811AlT.LIZIZ(sbLIZ2);
        }
    }

    public static void LIZJ(long j, C0CCZ c0ccz) {
        C799900VZk.LIZ.getClass();
        if (C2104108Md.LIZLLL(C799900VZk.LJFF().context())) {
            ThreadLocal<Long> threadLocal = LIZ;
            Long l = threadLocal.get();
            ThreadLocal<Long> threadLocal2 = LIZIZ;
            if (threadLocal2.get() != null) {
                long jLongValue = j - threadLocal2.get().longValue();
                if (0 <= jLongValue && jLongValue <= LIZJ) {
                    if (l != null && l.longValue() > LIZLLL) {
                        threadLocal.set(0L);
                        Thread.sleep(LIZJ - jLongValue);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(c0ccz.key());
                        sbLIZ.append(":delay ");
                        sbLIZ.append(LIZJ - jLongValue);
                        sbLIZ.append("ms");
                        C2188811AlT.LIZIZ(sbLIZ);
                        return;
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(C786410Ut5.u3());
                    sbLIZ2.append(" don't update duration");
                    C2188811AlT.LIZIZ(sbLIZ2);
                    return;
                }
                threadLocal.set(0L);
            }
        }
    }
}
