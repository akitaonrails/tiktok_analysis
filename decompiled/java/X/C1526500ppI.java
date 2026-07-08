package X;

import Y.ARunnableS123S0100000_23;
import Y.ARunnableS23S0100100_23;
import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.sync.v4.monitor.WsMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0ppI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1526500ppI implements InterfaceC1526540ppM {
    public final /* synthetic */ InterfaceC1526490ppH LL;
    public final /* synthetic */ WsMonitor LLILLJJLI;

    @Override // X.InterfaceC1526540ppM
    public final void LJI(boolean z) {
        synchronized (this) {
            try {
                WsMonitor wsMonitor = this.LLILLJJLI;
                long j = wsMonitor.LL;
                if (z && j > 0) {
                    wsMonitor.LL = 0L;
                    this.LL.LJL(this);
                    C786410Ut5.LJJZZIII(new BPEAHandler(((InterfaceC1525560pnm) C808470VnZ.LIZ(InterfaceC1525560pnm.class)).get(), null), new ARunnableS23S0100100_23(SystemClock.elapsedRealtime() - j, this, 4));
                    WsMonitor wsMonitor2 = this.LLILLJJLI;
                    ARunnableS123S0100000_23 aRunnableS123S0100000_23 = new ARunnableS123S0100000_23(this, 94);
                    wsMonitor2.getClass();
                    if (Looper.getMainLooper() == Looper.myLooper()) {
                        aRunnableS123S0100000_23.run();
                    } else {
                        C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), aRunnableS123S0100000_23);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public C1526500ppI(WsMonitor wsMonitor, InterfaceC1526490ppH interfaceC1526490ppH) {
        this.LLILLJJLI = wsMonitor;
        this.LL = interfaceC1526490ppH;
    }
}
