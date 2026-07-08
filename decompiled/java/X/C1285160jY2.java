package X;

import Y.ARunnableS21S0100100_20;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.canvas.KryptonApp;
import com.lynx.canvas.b;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0jY2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1285160jY2 extends b {
    public List<InterfaceC1285170jY3> LIZ;
    public List<InterfaceC1285170jY3> LIZIZ;
    public long LIZJ;
    public BPEAHandler LJI;
    public final AtomicBoolean LIZLLL = new AtomicBoolean(false);
    public final AtomicBoolean LJ = new AtomicBoolean(false);
    public final AtomicBoolean LJFF = new AtomicBoolean(false);
    public final C1285150jY1 LJII = new C1285150jY1();

    @Override // com.lynx.canvas.b
    public final void LIZJ(long j) {
    }

    @Override // a17.a0
    public final void onDestroy() {
        List<InterfaceC1285170jY3> list = this.LIZ;
        if (list == null) {
            list = null;
        }
        list.clear();
    }

    @Override // a17.a0
    public final void onPause() {
        this.LIZLLL.set(true);
    }

    @Override // a17.a0
    public final void onResume() {
        this.LIZLLL.set(false);
    }

    @Override // com.lynx.canvas.b
    public final void LIZ(C1288360jdC c1288360jdC) {
        List<InterfaceC1285170jY3> list = this.LIZIZ;
        if (list == null) {
            list = null;
        }
        list.add(c1288360jdC);
        this.LJFF.set(true);
    }

    @Override // com.lynx.canvas.b
    public final void LIZIZ(InterfaceC1285170jY3 interfaceC1285170jY3) {
        List<InterfaceC1285170jY3> list = this.LIZ;
        if (list == null) {
            list = null;
        }
        list.add(interfaceC1285170jY3);
        this.LJ.set(true);
    }

    public final void LIZLLL(boolean z) {
        if (z) {
            CountDownLatch countDownLatch = this.LJII.LIZ.get();
            if (countDownLatch != null) {
                try {
                    countDownLatch.await();
                    return;
                } catch (InterruptedException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1304110k2b.LIZ("", e);
                    C786410Ut5.u3().interrupt();
                    return;
                }
            }
            return;
        }
        CountDownLatch countDownLatch2 = this.LJII.LIZ.get();
        if (countDownLatch2 != null) {
            try {
                countDownLatch2.await(20L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e2) {
                TryCatchGuardChecker.doCheck(e2);
                C1304110k2b.LIZ("", e2);
                C786410Ut5.u3().interrupt();
            }
        }
    }

    public final void LJ(double d) {
        long j = this.LIZJ + ((long) (d * 1.0E9d));
        this.LIZJ = j;
        BPEAHandler bPEAHandler = this.LJI;
        if (bPEAHandler == null) {
            return;
        }
        if (this.LJ.get() && this.LJFF.get()) {
            this.LJII.LIZ.set(new CountDownLatch(1));
        }
        C786410Ut5.LJJZZIII(bPEAHandler, new ARunnableS21S0100100_20(j, this, 11));
    }

    @Override // a17.a0
    public final void onBootstrap(KryptonApp kryptonApp) {
        super.onBootstrap(kryptonApp);
        this.LIZ = new LinkedList();
        this.LIZIZ = new LinkedList();
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null) {
            this.LJI = new BPEAHandler(looperMyLooper);
            LJ(0.0d);
            return;
        }
        throw new IllegalStateException("The current thread does not have a Looper; please initialize the Looper first.");
    }
}
