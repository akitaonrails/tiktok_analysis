package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.0jBZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1271230jBZ {
    public final int LIZ;
    public boolean LJ;
    public final boolean LJI;
    public final AtomicInteger LJFF = new AtomicInteger(0);
    public final List<RunnableC1271220jBY> LIZIZ = new ArrayList();
    public final boolean LIZLLL = false;
    public final Map<Integer, RunnableC1271220jBY> LIZJ = new ConcurrentHashMap();

    public final RunnableC1271220jBY LIZJ() {
        for (RunnableC1271220jBY runnableC1271220jBY : (ArrayList) this.LIZIZ) {
            if (runnableC1271220jBY.LLILLL.get() == 0) {
                return runnableC1271220jBY;
            }
        }
        return null;
    }

    public C1271230jBZ(int i, boolean z) {
        this.LJI = false;
        this.LIZ = i;
        this.LJI = z;
    }

    public final synchronized RunnableC1271220jBY LIZ(int i, int i2) {
        if (this.LIZLLL) {
            return LIZIZ(i, i2);
        }
        RunnableC1271220jBY runnableC1271220jBYLIZJ = LIZJ();
        if (runnableC1271220jBYLIZJ == null) {
            if (((ArrayList) this.LIZIZ).size() < this.LIZ) {
                C1271390jBp c1271390jBp = new C1271390jBp(null);
                runnableC1271220jBYLIZJ = new RunnableC1271220jBY(this, c1271390jBp);
                ((ArrayList) this.LIZIZ).add(runnableC1271220jBYLIZJ);
                c1271390jBp.LIZLLL(i, i2);
                ((ConcurrentHashMap) this.LIZJ).put(Integer.valueOf(c1271390jBp.LIZIZ), runnableC1271220jBYLIZJ);
                runnableC1271220jBYLIZJ.LIZ();
            } else if (this.LIZLLL) {
                try {
                    if (this.LJI) {
                        this.LJFF.incrementAndGet();
                    }
                    if (this.LJ) {
                        return null;
                    }
                    Thread.sleep(5L);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                return LIZ(i, i2);
            }
        } else {
            runnableC1271220jBYLIZJ.LIZ();
        }
        return runnableC1271220jBYLIZJ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0059, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0035, code lost:
    
        r2.LIZ();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized X.RunnableC1271220jBY LIZIZ(int r6, int r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            r4 = 0
        L2:
            X.0jBY r2 = r5.LIZJ()     // Catch: java.lang.Throwable -> L5a
            if (r2 != 0) goto L35
            java.util.List<X.0jBY> r0 = r5.LIZIZ     // Catch: java.lang.Throwable -> L5a
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Throwable -> L5a
            int r1 = r0.size()     // Catch: java.lang.Throwable -> L5a
            int r0 = r5.LIZ     // Catch: java.lang.Throwable -> L5a
            if (r1 >= r0) goto L39
            X.0jBp r3 = new X.0jBp     // Catch: java.lang.Throwable -> L5a
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L5a
            X.0jBY r2 = new X.0jBY     // Catch: java.lang.Throwable -> L5a
            r2.<init>(r5, r3)     // Catch: java.lang.Throwable -> L5a
            java.util.List<X.0jBY> r0 = r5.LIZIZ     // Catch: java.lang.Throwable -> L5a
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Throwable -> L5a
            r0.add(r2)     // Catch: java.lang.Throwable -> L5a
            r3.LIZLLL(r6, r7)     // Catch: java.lang.Throwable -> L5a
            java.util.Map<java.lang.Integer, X.0jBY> r1 = r5.LIZJ     // Catch: java.lang.Throwable -> L5a
            int r0 = r3.LIZIZ     // Catch: java.lang.Throwable -> L5a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L5a
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1     // Catch: java.lang.Throwable -> L5a
            r1.put(r0, r2)     // Catch: java.lang.Throwable -> L5a
        L35:
            r2.LIZ()     // Catch: java.lang.Throwable -> L5a
            goto L58
        L39:
            boolean r0 = r5.LIZLLL     // Catch: java.lang.Throwable -> L5a
            if (r0 == 0) goto L58
            boolean r0 = r5.LJI     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> L5a
            if (r0 == 0) goto L46
            java.util.concurrent.atomic.AtomicInteger r0 = r5.LJFF     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> L5a
            r0.incrementAndGet()     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> L5a
        L46:
            boolean r0 = r5.LJ     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> L5a
            if (r0 == 0) goto L4b
            goto L56
        L4b:
            r0 = 5
            java.lang.Thread.sleep(r0)     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> L5a
            goto L2
        L51:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L5a
            goto L2
        L56:
            monitor-exit(r5)
            return r4
        L58:
            monitor-exit(r5)
            return r2
        L5a:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1271230jBZ.LIZIZ(int, int):X.0jBY");
    }
}
