package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/* JADX INFO: renamed from: X.1BXp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class RunnableC2206551BXp extends AbstractQueuedSynchronizer implements Runnable {
    public final /* synthetic */ C2206511BXl LL;

    public final void LIZ() {
        C2206531BXn c2206531BXn;
        C2206511BXl c2206511BXl = this.LL;
        c2206511BXl.getClass();
        release(1);
        loop0: while (true) {
            c2206531BXn = c2206511BXl.LIZ;
            EnumC2206581BXs enumC2206581BXs = EnumC2206581BXs.BACKGROUND;
            c2206531BXn.LJIIIZ.lock();
            while (!c2206531BXn.LJ(enumC2206581BXs)) {
                try {
                    c2206531BXn.LJIIJ.await();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            C2206541BXo c2206541BXo = (C2206541BXo) ((ConcurrentHashMap) c2206531BXn.LIZ).get(enumC2206581BXs);
            c2206541BXo.getClass();
            C2206561BXq c2206561BXq = new C2206561BXq(c2206541BXo);
            while (c2206561BXq.hasNext()) {
                C2206571BXr c2206571BXr = (C2206571BXr) c2206561BXq.next();
                if (c2206531BXn.LJFF(c2206571BXr)) {
                    c2206561BXq.remove();
                    ((C2206621BXw) ((ConcurrentHashMap) c2206531BXn.LIZIZ).get(enumC2206581BXs)).offer(c2206571BXr);
                    if (c2206531BXn.LJ(enumC2206581BXs)) {
                        c2206531BXn.LJIIJ.signal();
                    }
                    c2206531BXn.LJIIIZ.unlock();
                    if (c2206571BXr == null) {
                        return;
                    }
                    acquire(1);
                    try {
                        C2206511BXl.LIZ(c2206571BXr);
                        release(1);
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        release(1);
                        throw th2;
                    }
                }
            }
            break loop0;
        }
        c2206531BXn.LJIIIZ.unlock();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("Execution$Worker@8f67.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("Execution$Worker@8f67.run");
    }

    public RunnableC2206551BXp(C2206511BXl c2206511BXl) {
        this.LL = c2206511BXl;
        setState(0);
    }

    @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
    public final boolean tryAcquire(int i) {
        return compareAndSetState(0, 1);
    }

    @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
    public final boolean tryRelease(int i) {
        setState(0);
        return true;
    }
}
