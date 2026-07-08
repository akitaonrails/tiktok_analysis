package X;

import Y.AComparatorS32S0000000_13;
import android.os.Process;
import android.util.Pair;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import duo.b;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0V9F, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V9F extends C0V7U {
    public final C0V9H LIZ;
    public C0V9G LIZJ;
    public long LIZLLL;
    public long LJ;
    public long LJFF;
    public long LJI;
    public C0V9P LJII;
    public final C0V9Z LJIIIIZZ;
    public boolean LJIIIZ = true;
    public final AtomicBoolean LIZIZ = new AtomicBoolean(false);

    public final void LJFF() {
        C0V9W c0v9wLIZJ;
        C792840V8g c792840V8g;
        String str;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.LJI < this.LJ) {
            return;
        }
        this.LJI = jCurrentTimeMillis;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        C792830V8f.LIZ(Process.myPid(), map);
        try {
            Thread.sleep(100L);
            C792830V8f.LIZ(Process.myPid(), map2);
            try {
                c0v9wLIZJ = ((C0VA1) this.LJIIIIZZ).LIZJ();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                c0v9wLIZJ = null;
            }
            if (map.isEmpty() || map2.isEmpty()) {
                return;
            }
            LinkedList linkedList = new LinkedList();
            LinkedList linkedList2 = new LinkedList();
            for (Map.Entry entry : map.entrySet()) {
                C792840V8g c792840V8g2 = (C792840V8g) entry.getValue();
                if (c792840V8g2 != null && (c792840V8g = (C792840V8g) map2.get(entry.getKey())) != null && (str = c792840V8g.LIZIZ) != null && str.equals(c792840V8g2.LIZIZ)) {
                    long j = c792840V8g.LIZJ - c792840V8g2.LIZJ;
                    if (j != 0) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("cpu_thread=");
                        sbLIZ.append(c792840V8g.LIZIZ);
                        sbLIZ.append(" thread_time=");
                        sbLIZ.append(j);
                        sbLIZ.append(" app_time=");
                        sbLIZ.append(0L);
                        C792910V8n.LIZ("APM-CPU", C2188811AlT.LIZIZ(sbLIZ));
                        double d = j;
                        linkedList.add(new C793240V9u(c792840V8g.LIZIZ, Double.valueOf(d)));
                        linkedList2.add(new C0V47(d));
                    }
                }
            }
            if (linkedList.isEmpty()) {
                return;
            }
            Collections.sort(linkedList2, new AComparatorS32S0000000_13(20));
            C0V6I c0v6i = C0V6H.LIZ;
            synchronized (c0v6i) {
                c0v6i.LIZJ = new Pair<>(Long.valueOf(System.currentTimeMillis()), linkedList2);
            }
            if (this.LJII.LIZ) {
                C0V9L c0v9l = new C0V9L(C0V7T.LIZ.LIZIZ() ? C0V9S.FRONT : C0V9S.BACK, C2257208ss.LIZ().LJ(), linkedList, c0v9wLIZJ);
                c0v9l.LJIIIZ = b.LIZJ(C792400V6o.LIZ);
                try {
                    c0v9l.LJIIJJI = ((C0VA1) this.LJIIIIZZ).LJ.LIZ();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                C0VBB.LIZ(c0v9l);
            }
        } catch (InterruptedException e2) {
            TryCatchGuardChecker.doCheck(e2);
            C792910V8n.LIZJ("APM-CPU", "InterruptedException", e2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.0V9G] */
    public final void LJI(C0V9P c0v9p) {
        if (!this.LIZIZ.compareAndSet(false, true)) {
            return;
        }
        this.LJII = c0v9p;
        if (this.LIZJ == null) {
            this.LIZJ = new AbstractRunnableC792500V6y() { // from class: X.0V9G
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("CpuDataCollector@11b7.initAsyncTask$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("CpuDataCollector@11b7.initAsyncTask$1");
                }

                public final void LIZ() throws Throwable {
                    double d;
                    C0V9W c0v9wLIZJ;
                    if (C792400V6o.LJIIIIZZ()) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("run: ");
                        sbLIZ.append(this.LLILZ.LIZLLL);
                        C792910V8n.LIZ("APM-CPU", C2188811AlT.LIZIZ(sbLIZ));
                    }
                    C0V9F c0v9f = this.LLILZ;
                    boolean zLIZIZ = C0V7T.LIZ.LIZIZ();
                    C0V9P c0v9p2 = c0v9f.LJII;
                    c0v9f.LIZLLL = (zLIZIZ ? c0v9p2.LIZJ : c0v9p2.LIZLLL) * 1000;
                    c0v9f.LJ = (zLIZIZ ? c0v9p2.LJFF : c0v9p2.LJI) * 1000;
                    C0V9F c0v9f2 = this.LLILZ;
                    if (!c0v9f2.LJIIIZ) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (jCurrentTimeMillis - c0v9f2.LJFF >= c0v9f2.LIZLLL) {
                            c0v9f2.LJFF = jCurrentTimeMillis;
                            if (C08OX.LIZJ() > 0) {
                                C791560V3i.LIZLLL().getClass();
                                long jLIZIZ = C08OX.LIZIZ();
                                C791560V3i.LIZLLL().getClass();
                                long jLIZJ = C791560V3i.LIZJ();
                                try {
                                    Thread.sleep(360L);
                                    C791560V3i.LIZLLL().getClass();
                                    long jLIZIZ2 = C08OX.LIZIZ();
                                    C791560V3i.LIZLLL().getClass();
                                    long jLIZJ2 = C791560V3i.LIZJ() - jLIZJ;
                                    if (jLIZJ2 > 0) {
                                        d = (jLIZIZ2 - jLIZIZ) / jLIZJ2;
                                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                        sbLIZ2.append("appCpuRate -> ");
                                        sbLIZ2.append(d);
                                        C2188811AlT.LIZIZ(sbLIZ2);
                                    } else {
                                        d = -1.0d;
                                    }
                                    double d2 = (jLIZIZ2 - jLIZIZ) * 1000.0d;
                                    double dCurrentTimeMillis = (d2 / (System.currentTimeMillis() - jCurrentTimeMillis)) / C08OX.LJFF();
                                    if (C792400V6o.LJIIIIZZ()) {
                                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                        sbLIZ3.append(String.valueOf(d2));
                                        sbLIZ3.append(" ");
                                        sbLIZ3.append(System.currentTimeMillis() - jCurrentTimeMillis);
                                        sbLIZ3.append(" ");
                                        sbLIZ3.append(C08OX.LJFF());
                                        C792910V8n.LIZ("APM-CPU", C2188811AlT.LIZIZ(sbLIZ3));
                                    }
                                    if (C792400V6o.LJIIIIZZ()) {
                                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                        sbLIZ4.append("appCpuSpeed -> ");
                                        sbLIZ4.append(dCurrentTimeMillis);
                                        C2188811AlT.LIZIZ(sbLIZ4);
                                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                        sbLIZ5.append("collect cpu data, rate: ");
                                        sbLIZ5.append(d);
                                        sbLIZ5.append(" speed: ");
                                        sbLIZ5.append(dCurrentTimeMillis);
                                        C792910V8n.LIZ("APM-CPU", C2188811AlT.LIZIZ(sbLIZ5));
                                    }
                                    try {
                                        ((C0VA1) c0v9f2.LJIIIIZZ).LIZLLL.LIZ();
                                        c0v9wLIZJ = ((C0VA1) c0v9f2.LJIIIIZZ).LIZJ();
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        c0v9wLIZJ = null;
                                    }
                                    if (c0v9f2.LIZ.LIZ.get()) {
                                        C0V9H c0v9h = c0v9f2.LIZ;
                                        if (c0v9h.LIZ.get()) {
                                            String str = C2257208ss.LIZ().LJ();
                                            if (C792190V5t.LIZ()) {
                                                C792910V8n.LIZ("APM-CPU", str);
                                            }
                                            synchronized (C0V9H.class) {
                                                try {
                                                    C0V9S c0v9s = C0V7T.LIZ.LIZIZ() ? C0V9S.FRONT : C0V9S.BACK;
                                                    C0V9M c0v9mLJIIIIZZ = C0V9H.LJIIIIZZ(c0v9s, c0v9h.LJII(c0v9s, str), d, dCurrentTimeMillis);
                                                    c0v9h.LJFF(c0v9s, str, c0v9mLJIIIIZZ);
                                                    if (C792190V5t.LIZ()) {
                                                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                                        sbLIZ6.append("after add cache data: ");
                                                        sbLIZ6.append(c0v9mLJIIIIZZ);
                                                        C792910V8n.LIZ("APM-CPU", C2188811AlT.LIZIZ(sbLIZ6));
                                                    }
                                                    C0V9S c0v9s2 = C0V9S.MIX;
                                                    c0v9h.LJFF(c0v9s2, str, C0V9H.LJIIIIZZ(c0v9s2, c0v9h.LJII(c0v9s2, str), d, dCurrentTimeMillis));
                                                } finally {
                                                    TryCatchGuardChecker.doCheck(th);
                                                }
                                            }
                                        }
                                        c0v9f2.LIZ.LJIIJ(c0v9wLIZJ);
                                    }
                                    C0V6I c0v6i = C0V6H.LIZ;
                                    c0v6i.LIZ = d;
                                    c0v6i.LIZIZ = dCurrentTimeMillis;
                                    C0V7T.LIZ.getClass();
                                } catch (InterruptedException th2) {
                                }
                            }
                        }
                        this.LLILZ.LJFF();
                    }
                    this.LLILZ.LJIIIZ = false;
                }

                {
                    super(30000L, 30000L);
                }
            };
        }
        if (this.LIZJ != null) {
            C792490V6x.LIZ(EnumC792970V8t.CPU).LIZJ(this.LIZJ);
        }
        try {
            ((C0VA1) this.LJIIIIZZ).LJI();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public C0V9F(C0V9H c0v9h, C0V9Z c0v9z) {
        this.LIZ = c0v9h;
        this.LJIIIIZZ = c0v9z;
    }
}
