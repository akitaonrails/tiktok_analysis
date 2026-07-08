package X;

import android.os.SystemClock;
import android.os.Trace;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1C7U, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C7U {
    public static final void LIZ(String str) {
        InterfaceC202113146l interfaceC202113146l;
        int i;
        if (C2122108Tb.LIZJ && C2122108Tb.LIZJ) {
            try {
                if (C2122108Tb.LIZIZ(str) && str != null && (i = C2122108Tb.LIZLLL) > 0 && (i >= 100 || ThreadLocalRandom.current().nextInt(100) < i)) {
                    String strLIZJ = C2122108Tb.LIZJ(str);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    ConcurrentHashMap<String, Long> concurrentHashMap = C2122108Tb.LIZ;
                    Long l = concurrentHashMap.get(strLIZJ);
                    if (l == null || jUptimeMillis - l.longValue() >= 1000) {
                        concurrentHashMap.put(strLIZJ, Long.valueOf(jUptimeMillis));
                        String strLIZJ2 = C2122108Tb.LIZJ(str);
                        long jUptimeMillis2 = SystemClock.uptimeMillis();
                        ConcurrentHashMap<String, Long> concurrentHashMap2 = C2122108Tb.LIZIZ;
                        if (concurrentHashMap2.size() >= 8192) {
                            concurrentHashMap2.clear();
                        }
                        concurrentHashMap2.put(strLIZJ2, Long.valueOf(jUptimeMillis2));
                        C2122108Tb.LIZ(null, "before", str);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        if (C1C7V.LIZLLL && (interfaceC202113146l = C1C7V.LJ) != null) {
            interfaceC202113146l.LIZIZ(str);
        }
        if (C1C7V.LIZJ && str != null) {
            String name = Thread.currentThread().getName();
            if (C1C7V.LJFF) {
                Trace.beginSection(str);
            }
            int i2 = C1C7V.LJII;
            if (i2 > 10000 && i2 % 100 == 0 && System.currentTimeMillis() - C1C7V.LJI > 20000) {
                C1C7V.LIZJ = false;
                Iterator<C1C7W> it2 = C1C7V.LIZIZ.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZIZ();
                }
                C1C7V.LIZIZ.clear();
                C1C7V.LJII = 0;
                C1C7V.LIZ = new ConcurrentHashMap<>(64);
                return;
            }
            C1C7V.LJII++;
            if (!C1C7V.LIZ.containsKey(name)) {
                C1C7V.LIZ.put(name, new C1C7Y());
            }
            C1C7Y c1c7y = C1C7V.LIZ.get(name);
            if (c1c7y != null) {
                for (C1C7X c1c7x = c1c7y.LIZIZ; c1c7x != null; c1c7x = c1c7x.LIZ) {
                    if (Intrinsics.LJFF(str, c1c7x.LIZIZ.LIZ)) {
                        return;
                    }
                }
                C1869680yko c1869680yko = new C1869680yko(str, name, SystemClock.currentThreadTimeMillis(), System.currentTimeMillis(), 1008);
                Iterator<C1C7W> it3 = C1C7V.LIZIZ.iterator();
                while (it3.hasNext()) {
                    if (it3.next().LJ) {
                        c1869680yko.LJI = C07KM.LIZLLL.invoke();
                        c1869680yko.LJIIIIZZ = C07KM.LJ.invoke();
                    }
                }
                C1C7X c1c7x2 = c1c7y.LIZIZ;
                C1C7X c1c7x3 = new C1C7X(c1c7x2, c1869680yko);
                c1c7y.LIZIZ = c1c7x3;
                if (c1c7x2 != null) {
                    c1c7x2.LIZJ = c1c7x3;
                }
                c1c7y.LIZ++;
            }
        }
    }

    public static final void LIZIZ(String str) {
        InterfaceC202113146l interfaceC202113146l;
        if (C1C7V.LIZLLL && (interfaceC202113146l = C1C7V.LJ) != null) {
            interfaceC202113146l.LIZ(str);
        }
        if (C1C7V.LIZJ && str != null) {
            String name = Thread.currentThread().getName();
            if (C1C7V.LJFF) {
                Trace.endSection();
            }
            C1C7Y c1c7y = C1C7V.LIZ.get(name);
            if (c1c7y != null) {
                C1C7X c1c7x = c1c7y.LIZIZ;
                while (true) {
                    if (c1c7x == null) {
                        break;
                    }
                    if (Intrinsics.LJFF(str, c1c7x.LIZIZ.LIZ)) {
                        C1869680yko c1869680yko = c1c7x.LIZIZ;
                        C1C7X c1c7x2 = c1c7x.LIZJ;
                        C1C7X c1c7x3 = c1c7x.LIZ;
                        if (c1c7x3 != null) {
                            c1c7x3.LIZJ = c1c7x2;
                            c1c7x.LIZ = null;
                        }
                        if (c1c7x2 == null) {
                            c1c7y.LIZIZ = c1c7x3;
                        } else {
                            c1c7x2.LIZ = c1c7x3;
                            c1c7x.LIZJ = null;
                        }
                        c1c7y.LIZ--;
                        if (c1869680yko != null) {
                            int iCurrentThreadTimeMillis = (int) (SystemClock.currentThreadTimeMillis() - c1869680yko.LIZJ);
                            c1869680yko.LJ = iCurrentThreadTimeMillis;
                            if (iCurrentThreadTimeMillis > 0) {
                                Iterator<C1C7W> it2 = C1C7V.LIZIZ.iterator();
                                while (it2.hasNext()) {
                                    it2.next().LIZJ(c1869680yko);
                                }
                            }
                        }
                    } else {
                        c1c7x = c1c7x.LIZ;
                    }
                }
                C1C7V.LIZIZ(name, str);
                if (c1c7y.LIZ == 0) {
                    C1C7V.LIZ.remove(name);
                }
            } else {
                C1C7V.LIZIZ(name, str);
            }
        }
        if (C2122108Tb.LIZJ && C2122108Tb.LIZJ && str != null && str.length() != 0) {
            try {
                Long lRemove = C2122108Tb.LIZIZ.remove(C2122108Tb.LIZJ(str));
                if (lRemove != null) {
                    C2122108Tb.LIZ(Long.valueOf(SystemClock.uptimeMillis() - lRemove.longValue()), "after", str);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }
}
