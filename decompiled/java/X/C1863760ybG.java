package X;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0ybG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1863760ybG {
    public static boolean LIZ;
    public static final ConcurrentHashMap<String, C1863790ybJ> LIZIZ = new ConcurrentHashMap<>();

    public static void LIZIZ(String str) {
        C1863790ybJ c1863790ybJPutIfAbsent;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (str != null && str.length() != 0) {
            ConcurrentHashMap<String, C1863790ybJ> concurrentHashMap = LIZIZ;
            C1863790ybJ c1863790ybJ = concurrentHashMap.get(str);
            if (c1863790ybJ == null && (c1863790ybJPutIfAbsent = concurrentHashMap.putIfAbsent(str, (c1863790ybJ = new C1863790ybJ(0)))) != null) {
                c1863790ybJ = c1863790ybJPutIfAbsent;
            }
            c1863790ybJ.LIZIZ = Long.valueOf(jCurrentTimeMillis);
        }
    }

    public static void LIZJ(String str) {
        C1863790ybJ c1863790ybJ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (str != null && str.length() != 0 && (c1863790ybJ = LIZIZ.get(str)) != null && c1863790ybJ.LIZ != null && c1863790ybJ.LJ == null) {
            c1863790ybJ.LJ = Long.valueOf(jCurrentTimeMillis);
        }
    }

    public static void LIZLLL(String str) {
        C1863790ybJ c1863790ybJPutIfAbsent;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (str != null && str.length() != 0) {
            ConcurrentHashMap<String, C1863790ybJ> concurrentHashMap = LIZIZ;
            C1863790ybJ c1863790ybJ = concurrentHashMap.get(str);
            if (c1863790ybJ == null && (c1863790ybJPutIfAbsent = concurrentHashMap.putIfAbsent(str, (c1863790ybJ = new C1863790ybJ(0)))) != null) {
                c1863790ybJ = c1863790ybJPutIfAbsent;
            }
            C1863790ybJ c1863790ybJ2 = c1863790ybJ;
            if (c1863790ybJ2.LJFF == null) {
                c1863790ybJ2.LJFF = Long.valueOf(jCurrentTimeMillis);
            }
        }
    }

    public static void LJ(String str) {
        C1863790ybJ c1863790ybJ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (str != null && str.length() != 0 && (c1863790ybJ = LIZIZ.get(str)) != null && c1863790ybJ.LIZJ != null && c1863790ybJ.LIZLLL == null) {
            c1863790ybJ.LIZLLL = Long.valueOf(jCurrentTimeMillis);
        }
    }

    public static void LJFF(String str) {
        C1863790ybJ c1863790ybJPutIfAbsent;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (str != null && str.length() != 0) {
            ConcurrentHashMap<String, C1863790ybJ> concurrentHashMap = LIZIZ;
            C1863790ybJ c1863790ybJ = concurrentHashMap.get(str);
            if (c1863790ybJ == null && (c1863790ybJPutIfAbsent = concurrentHashMap.putIfAbsent(str, (c1863790ybJ = new C1863790ybJ(0)))) != null) {
                c1863790ybJ = c1863790ybJPutIfAbsent;
            }
            C1863790ybJ c1863790ybJ2 = c1863790ybJ;
            if (c1863790ybJ2.LIZJ == null) {
                c1863790ybJ2.LIZJ = Long.valueOf(jCurrentTimeMillis);
            }
        }
    }

    public static Long LIZ(Long l, Long l2) {
        if (l != null && l2 != null) {
            Long lValueOf = Long.valueOf(l2.longValue() - l.longValue());
            if (lValueOf.longValue() >= 0) {
                return lValueOf;
            }
            return null;
        }
        return null;
    }
}
