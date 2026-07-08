package X;

import Y.ARunnableS92S0200000_23;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ttnet.org.chromium.net.n0;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.0p5H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1497970p5H extends n0 {
    public final AtomicInteger LIZ = new AtomicInteger(3);
    public final ExecutorC1498010p5L LIZIZ;
    public final Executor LIZJ;
    public final AbstractC1498040p5O LIZLLL;
    public ByteBuffer LJ;
    public long LJFF;
    public long LJI;

    @Override // com.ttnet.org.chromium.net.n0
    public final void LIZJ() {
        if (!this.LIZ.compareAndSet(1, 2)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onRewindSucceeded() called when not awaiting a rewind; in state: ");
            sbLIZ.append(this.LIZ.get());
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
        }
        Executor executor = this.LIZJ;
        C1497990p5J c1497990p5J = new C1497990p5J(this);
        C1497900p5A c1497900p5A = ((C1498000p5K) this).LJIIJJI;
        c1497900p5A.getClass();
        executor.execute(new ARunnableS92S0200000_23(c1497990p5J, c1497900p5A, 35));
    }

    @Override // com.ttnet.org.chromium.net.n0
    public final void LIZ(boolean z) {
        if (this.LIZ.compareAndSet(0, 2)) {
            Executor executor = this.LIZJ;
            C1497980p5I c1497980p5I = new C1497980p5I(this, z);
            C1497900p5A c1497900p5A = ((C1498000p5K) this).LJIIJJI;
            c1497900p5A.getClass();
            executor.execute(new ARunnableS92S0200000_23(c1497980p5I, c1497900p5A, 35));
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onReadSucceeded() called when not awaiting a read result; in state: ");
        sbLIZ.append(this.LIZ.get());
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ttnet.org.chromium.net.n0
    public final void LIZIZ(Exception exc) {
        C1497900p5A c1497900p5A = ((C1498000p5K) this).LJIIJJI;
        c1497900p5A.getClass();
        c1497900p5A.LJJ(new C1497800p50("Exception received from UploadDataProvider", exc));
    }

    public final void LIZLLL(InterfaceC1497890p59 interfaceC1497890p59) {
        try {
            ExecutorC1498010p5L executorC1498010p5L = this.LIZIZ;
            C1497900p5A c1497900p5A = ((C1498000p5K) this).LJIIJJI;
            c1497900p5A.getClass();
            executorC1498010p5L.execute(new ARunnableS92S0200000_23(interfaceC1497890p59, c1497900p5A, 38));
        } catch (RejectedExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            C1497900p5A c1497900p5A2 = ((C1498000p5K) this).LJIIJJI;
            c1497900p5A2.getClass();
            c1497900p5A2.LJJ(new C1497800p50("Exception received from UploadDataProvider", e));
        }
    }

    public AbstractC1497970p5H(Executor executor, ExecutorC1498050p5P executorC1498050p5P, AbstractC1498040p5O abstractC1498040p5O) {
        this.LIZIZ = new ExecutorC1498010p5L(this, executor);
        this.LIZJ = executorC1498050p5P;
        this.LIZLLL = abstractC1498040p5O;
    }
}
