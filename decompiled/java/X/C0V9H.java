package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import duo.b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0V9H, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V9H extends C0V7U {
    public final AtomicBoolean LIZ = new AtomicBoolean(false);
    public C0V9P LIZIZ;
    public final C0V9Z LIZJ;
    public HashMap<String, C0V9M> LIZLLL;
    public HashMap<String, C0V9M> LJ;
    public HashMap<String, C0V9M> LJFF;

    public C0V9H(C0V9Z c0v9z) {
        this.LIZJ = c0v9z;
    }

    public final void LJIIIZ(C0V9P c0v9p) {
        if (!this.LIZ.compareAndSet(false, true)) {
            return;
        }
        this.LIZLLL = new HashMap<>();
        this.LJ = new HashMap<>();
        this.LJFF = new HashMap<>();
        this.LIZIZ = c0v9p;
    }

    public final void LJIIJ(C0V9W c0v9w) {
        if (!this.LIZ.get()) {
            return;
        }
        synchronized (C0V9H.class) {
            try {
                LJI(C0V9S.FRONT, c0v9w);
                LJI(C0V9S.BACK, c0v9w);
                LJI(C0V9S.MIX, c0v9w);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJI(C0V9S c0v9s, C0V9W c0v9w) {
        Iterator<Map.Entry<String, C0V9M>> it2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i = C0V9R.LIZ[c0v9s.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    it2 = this.LJ.entrySet().iterator();
                } else {
                    return;
                }
            } else {
                it2 = this.LJFF.entrySet().iterator();
            }
        } else {
            it2 = this.LIZLLL.entrySet().iterator();
        }
        if (it2 == null) {
            return;
        }
        while (it2.hasNext()) {
            C0V9M value = it2.next().getValue();
            if (jCurrentTimeMillis - value.LJI > this.LIZIZ.LJ * 1000) {
                it2.remove();
                double d = value.LIZIZ;
                double d2 = value.LJII;
                double d3 = d / d2;
                double d4 = value.LIZJ;
                double d5 = value.LIZLLL / d2;
                double d6 = value.LJ;
                if (C792190V5t.LIZ()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("cpu cache item: ");
                    sbLIZ.append(value);
                    C792910V8n.LIZ("APM-CPU", C2188811AlT.LIZIZ(sbLIZ));
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("assemble cpu data, type: ");
                    sbLIZ2.append(c0v9s);
                    sbLIZ2.append(" rate: ");
                    sbLIZ2.append(d3);
                    sbLIZ2.append(" maxRate: ");
                    sbLIZ2.append(d4);
                    sbLIZ2.append(" speed: ");
                    sbLIZ2.append(d5);
                    sbLIZ2.append(" maxSpeed: ");
                    sbLIZ2.append(d6);
                    C792910V8n.LIZ("APM-CPU", C2188811AlT.LIZIZ(sbLIZ2));
                }
                C0V9L c0v9l = new C0V9L(c0v9s, value.LJFF, d3, d4, d5, d6, c0v9w);
                c0v9l.LJIIIZ = b.LIZJ(C792190V5t.LIZIZ);
                try {
                    c0v9l.LJIIJJI = ((C0VA1) this.LIZJ).LJ.LIZ();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                C0VBB.LIZ(c0v9l);
            }
        }
    }

    public final C0V9M LJII(C0V9S c0v9s, String str) {
        int i = C0V9R.LIZ[c0v9s.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return null;
                }
                return this.LJ.get(str);
            }
            return this.LJFF.get(str);
        }
        return this.LIZLLL.get(str);
    }

    public final void LJFF(C0V9S c0v9s, String str, C0V9M c0v9m) {
        int i = C0V9R.LIZ[c0v9s.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    this.LJ.put(str, c0v9m);
                    return;
                }
                return;
            }
            this.LJFF.put(str, c0v9m);
            return;
        }
        this.LIZLLL.put(str, c0v9m);
    }

    public static C0V9M LJIIIIZZ(C0V9S c0v9s, C0V9M c0v9m, double d, double d2) {
        if (c0v9m == null) {
            c0v9m = new C0V9M(c0v9s, System.currentTimeMillis());
            c0v9m.LJFF = C2257208ss.LIZ().LJ();
        }
        if (d >= 0.0d || d2 >= 0.0d) {
            c0v9m.LJII++;
        }
        if (d2 >= 0.0d) {
            c0v9m.LIZLLL += d2;
        }
        if (d >= 0.0d) {
            c0v9m.LIZIZ += d;
        }
        if (c0v9m.LIZJ < d) {
            c0v9m.LIZJ = d;
        }
        if (c0v9m.LJ < d2) {
            c0v9m.LJ = d2;
        }
        return c0v9m;
    }
}
