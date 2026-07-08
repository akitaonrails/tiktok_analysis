package X;

import android.os.IBinder;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.0VAb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C793310VAb extends AbstractC793300VAa<C793360VAg> implements AnonymousClass0830 {
    @Override // X.AnonymousClass0830
    public final String LIZIZ() {
        return "android.os.IPowerManager";
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void LJII(Object[] objArr) {
        Object obj;
        AbstractC793340VAe abstractC793340VAe;
        synchronized (this) {
            this.LJ++;
            if (this.LJ == 1) {
                this.LJII = System.currentTimeMillis();
            }
        }
        if (C0V5J.LIZ.LLJILJIL && objArr.length <= 6 && objArr.length >= 4 && (obj = objArr[0]) != null && (obj instanceof IBinder)) {
            int iHashCode = obj.hashCode();
            if (!this.LIZLLL.containsKey(Integer.valueOf(iHashCode))) {
                C793360VAg c793360VAg = new C793360VAg();
                Object obj2 = objArr[1];
                if (obj2 != null && (obj2 instanceof Integer)) {
                    c793360VAg.LJ = ((Integer) obj2).intValue();
                    Object obj3 = objArr[2];
                    if (obj3 != null && (obj3 instanceof String)) {
                        c793360VAg.LJFF = (String) obj3;
                        c793360VAg.LIZIZ = -1L;
                        abstractC793340VAe = c793360VAg;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                AbstractC793340VAe abstractC793340VAe2 = (AbstractC793340VAe) this.LIZLLL.get(Integer.valueOf(iHashCode));
                abstractC793340VAe = abstractC793340VAe2;
                if (abstractC793340VAe2 == null) {
                    return;
                }
            }
            abstractC793340VAe.LIZLLL = ThreadMethodProxy.getStackTrace(C786410Ut5.u3());
            abstractC793340VAe.LIZJ = C786410Ut5.u3().getName();
            abstractC793340VAe.LIZ = System.currentTimeMillis();
            this.LIZLLL.put(Integer.valueOf(iHashCode), (T) abstractC793340VAe);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void LJIIIIZZ(Object[] objArr) {
        Object obj;
        synchronized (this) {
            this.LJ--;
            if (this.LJ == 0) {
                C787900UvU.LIZ.LIZJ(new RunnableC793330VAd(this, this.LIZJ, System.currentTimeMillis() - this.LJII));
                this.LJII = -1L;
            }
        }
        if (C0V5J.LIZ.LLJILJIL && objArr.length == 2 && (obj = objArr[0]) != null && (obj instanceof IBinder)) {
            int iHashCode = obj.hashCode();
            AbstractC793340VAe abstractC793340VAe = (AbstractC793340VAe) this.LIZLLL.get(Integer.valueOf(iHashCode));
            if (abstractC793340VAe != null) {
                abstractC793340VAe.LIZIZ = System.currentTimeMillis();
                this.LIZLLL.put(Integer.valueOf(iHashCode), (T) abstractC793340VAe);
            }
        }
    }

    @Override // X.AnonymousClass0830
    public final synchronized void LIZ(Method method, Object[] objArr) {
        try {
            String name = method.getName();
            if ("acquireWakeLock".equals(name)) {
                LJII(objArr);
            } else if ("releaseWakeLock".equals(name)) {
                LJIIIIZZ(objArr);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.C0VAV
    public final void LJFF(C793380VAi c793380VAi, C793390VAj c793390VAj) {
        if (this.LIZ.equals(c793390VAj.LIZLLL)) {
            if (c793390VAj.LIZIZ) {
                c793380VAi.LJ += c793390VAj.LJI;
            } else {
                c793380VAi.LJIIIZ += c793390VAj.LJI;
            }
        }
    }
}
