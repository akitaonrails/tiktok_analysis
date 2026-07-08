package X;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uNr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1701690uNr implements InterfaceC2185021AfM {
    public static long LIZIZ;
    public static long LIZJ;
    public static final C1701690uNr LIZ = new C1701690uNr();
    public static final ConcurrentHashMap<String, Long> LIZLLL = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, Boolean> LJ = new ConcurrentHashMap<>();

    @Override // X.InterfaceC2185021AfM
    public final void LIZJ(C2184901AfA c2184901AfA) {
    }

    @Override // X.InterfaceC2185021AfM
    public final void LIZ(C2184901AfA c2184901AfA) {
        long jCurrentTimeMillis;
        if (LIZJ > 0) {
            jCurrentTimeMillis = System.currentTimeMillis() - LIZJ;
        } else {
            jCurrentTimeMillis = 0;
        }
        LIZIZ = jCurrentTimeMillis;
        LIZJ = System.currentTimeMillis();
        for (C2184301AeC c2184301AeC : c2184901AfA.LIZIZ) {
            ConcurrentHashMap<String, Long> concurrentHashMap = LIZLLL;
            String strValueOf = String.valueOf(c2184301AeC.hashCode());
            Long lPutIfAbsent = concurrentHashMap.get(strValueOf);
            if (lPutIfAbsent == null && (lPutIfAbsent = concurrentHashMap.putIfAbsent(strValueOf, 0L)) == null) {
                lPutIfAbsent = 0L;
            }
            long jLongValue = lPutIfAbsent.longValue() + LIZIZ;
            if (jLongValue != 0 && jLongValue <= c2184301AeC.LJIIIZ) {
                LJ.put(String.valueOf(c2184301AeC.hashCode()), Boolean.TRUE);
                concurrentHashMap.put(String.valueOf(c2184301AeC.hashCode()), Long.valueOf(jLongValue));
            } else {
                LJ.put(String.valueOf(c2184301AeC.hashCode()), Boolean.FALSE);
                concurrentHashMap.put(String.valueOf(c2184301AeC.hashCode()), 0L);
            }
        }
    }

    @Override // X.InterfaceC2185021AfM
    public final C1701700uNs LIZIZ(C2184901AfA c2184901AfA, String str, String str2) {
        for (C2184301AeC c2184301AeC : c2184901AfA.LIZIZ) {
            if (Intrinsics.LJFF(LJ.get(String.valueOf(c2184301AeC.hashCode())), Boolean.TRUE)) {
                return new C1701700uNs(2, c2184301AeC);
            }
        }
        return new C1701700uNs(0, null);
    }
}
