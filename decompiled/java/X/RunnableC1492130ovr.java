package X;

import Y.AObjectS397S0100000_23;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0ovr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class RunnableC1492130ovr implements Runnable, Comparable {
    public final Runnable LL;
    public final C1505540pHU LLILLJJLI;

    public final void LIZJ() {
        if (!this.LLILLJJLI.equals(C1505550pHV.LIZIZ)) {
            this.LL.run();
            return;
        }
        C844470XAv.LIZ.getClass();
        if (C2162308dZ.LJI(C844470XAv.LIZ()) && C0X35.LJ) {
            try {
                Thread.sleep(((Number) C263900AVw.LIZ.getValue()).intValue());
            } catch (InterruptedException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        C1491980ovc.LIZ.LIZ(new C1491990ovd("gecko_thread_downgrade", ((Boolean) C1852707Nl.LJIIJJI.getValue()).booleanValue(), EnumC1492100ovo.PRIORITY, 10), null, new C1492140ovs(new AObjectS397S0100000_23(this, 11)));
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            LIZJ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Runnable runnable = this.LL;
        if ((runnable instanceof Comparable) && (obj instanceof RunnableC1492130ovr)) {
            return ((Comparable) runnable).compareTo(((RunnableC1492130ovr) obj).LL);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof RunnableC1492130ovr) && this.LL.equals(((RunnableC1492130ovr) obj).LL)) {
            return true;
        }
        return false;
    }

    public RunnableC1492130ovr(Runnable runnable, C1505540pHU c1505540pHU) {
        this.LL = runnable;
        this.LLILLJJLI = c1505540pHU;
        c1505540pHU.LL = hashCode();
    }
}
