package X;

import Y.ARunnableS122S0100000_22;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0nPu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1433880nPu implements InterfaceC1433950nQ1 {
    public InterfaceC1433890nPv LIZIZ;
    public boolean LJ;
    public String LIZ = "";
    public final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public final BPEAHandler LIZLLL = new BPEAHandler(Looper.getMainLooper());
    public final AtomicBoolean LJFF = new AtomicBoolean(false);

    @Override // X.InterfaceC1433950nQ1
    public final void LIZ() {
        InterfaceC1433890nPv interfaceC1433890nPv;
        if (!this.LIZJ.compareAndSet(false, true) || (interfaceC1433890nPv = this.LIZIZ) == null) {
            return;
        }
        interfaceC1433890nPv.LIZ(this.LIZ);
    }

    @Override // X.InterfaceC1433950nQ1
    public final void LIZJ() {
        this.LJFF.set(true);
    }

    @Override // X.InterfaceC1433950nQ1
    public final void end() {
        this.LIZLLL.removeCallbacksAndMessages(null);
    }

    @Override // X.InterfaceC1433950nQ1
    public final boolean isCanceled() {
        return this.LJFF.get();
    }

    @Override // X.InterfaceC1433950nQ1
    public final String LIZIZ() {
        return this.LIZ;
    }

    public final void LIZLLL(long j) {
        if (this.LJ) {
            return;
        }
        this.LJ = true;
        C786410Ut5.LJLIIL(j, this.LIZLLL, new ARunnableS122S0100000_22(this, 1));
    }
}
