package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: X.151r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C204537151r implements InterfaceC204538151s {
    public volatile int LIZ = -1;
    public final AtomicInteger LIZIZ = new AtomicInteger(0);
    public final ReentrantLock LIZJ;
    public final Condition LIZLLL;
    public volatile Throwable LJ;

    @Override // X.InterfaceC204538151s
    public final void LIZ() {
        if (this.LIZ <= 0) {
            throw new IllegalStateException("Total view count <= 0.");
        }
        int iIncrementAndGet = this.LIZIZ.incrementAndGet();
        if (iIncrementAndGet > this.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("created view count ");
            sbLIZ.append(iIncrementAndGet);
            sbLIZ.append(" is bigger than total view count ");
            sbLIZ.append(this.LIZ);
            sbLIZ.append('.');
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
        }
        LIZIZ();
        if (iIncrementAndGet == this.LIZ) {
            ReentrantLock reentrantLock = this.LIZJ;
            reentrantLock.lock();
            try {
                this.LIZLLL.signalAll();
                reentrantLock.unlock();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public final void LIZIZ() {
        final Throwable th = this.LJ;
        if (th != null) {
            throw new RuntimeException(th) { // from class: X.14er
            };
        }
    }

    public C204537151r() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.LIZJ = reentrantLock;
        this.LIZLLL = reentrantLock.newCondition();
    }
}
