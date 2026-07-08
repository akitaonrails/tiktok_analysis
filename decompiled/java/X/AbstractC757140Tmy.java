package X;

import Y.ARunnableS112S0100000_12;
import android.os.Looper;
import android.view.View;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: renamed from: X.0Tmy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC757140Tmy implements InterfaceC752610Tff {
    public final long LIZ;
    public boolean LIZIZ;
    public final BPEAHandler LIZJ;
    public final ARunnableS112S0100000_12 LIZLLL;

    public abstract void LIZIZ();

    public /* synthetic */ AbstractC757140Tmy() {
        this(300L);
    }

    public AbstractC757140Tmy(long j) {
        this.LIZ = j;
        this.LIZIZ = true;
        this.LIZJ = new BPEAHandler(Looper.getMainLooper());
        this.LIZLLL = new ARunnableS112S0100000_12(this, 40);
    }

    @Override // X.InterfaceC752610Tff
    public final void LIZ(View view, String str) {
        if (this.LIZIZ) {
            this.LIZIZ = false;
            C786410Ut5.LJLIIL(this.LIZ, this.LIZJ, this.LIZLLL);
            LIZIZ();
        }
    }
}
