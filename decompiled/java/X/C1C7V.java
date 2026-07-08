package X;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: X.1C7V, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C7V {
    public static ConcurrentHashMap<String, C1C7Y> LIZ = new ConcurrentHashMap<>(64);
    public static final ConcurrentLinkedQueue<C1C7W> LIZIZ = new ConcurrentLinkedQueue<>();
    public static boolean LIZJ;
    public static boolean LIZLLL;
    public static InterfaceC202113146l LJ;
    public static boolean LJFF;
    public static long LJI;
    public static int LJII;

    public static void LIZ(C1C7W c1c7w, boolean z) {
        C1869680yko c1869680yko;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Iterator<C1C7Y> it2 = LIZ.values().iterator();
        while (it2.hasNext()) {
            for (C1C7X c1c7x = it2.next().LIZIZ; c1c7x != null; c1c7x = c1c7x.LIZ) {
                C1869680yko c1869680yko2 = c1c7x.LIZIZ;
                if (z) {
                    c1869680yko = c1869680yko2;
                } else {
                    c1869680yko = new C1869680yko(c1869680yko2.LIZ, c1869680yko2.LIZIZ, 0L, 0L, 1020);
                }
                int i = (int) (jCurrentTimeMillis - c1869680yko2.LIZLLL);
                c1869680yko.LJ = i;
                c1869680yko.LJFF = true;
                if (i > 0) {
                    c1c7w.LIZJ(c1869680yko);
                }
            }
        }
    }

    public static void LIZIZ(String str, String str2) {
        for (C1C7W c1c7w : LIZIZ) {
            C1869680yko c1869680yko = new C1869680yko(str2, str, 0L, 0L, 1020);
            int iCurrentTimeMillis = (int) (System.currentTimeMillis() - c1c7w.LIZJ);
            c1869680yko.LJ = iCurrentTimeMillis;
            c1869680yko.LJFF = true;
            if (iCurrentTimeMillis > 0) {
                c1c7w.LIZJ(c1869680yko);
            }
        }
    }
}
