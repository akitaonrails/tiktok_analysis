package X;

import Y.ARunnableS95S0200000_26;
import android.os.Handler;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0uNy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1701760uNy extends C11RN {
    public final Handler LL;
    public boolean LLILLJJLI;

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        this.LLILLJJLI = true;
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LLILLJJLI;
    }

    public C1701760uNy(BPEAHandler bPEAHandler) {
        this.LL = bPEAHandler;
    }

    @Override // X.C11RN
    public final InterfaceC420801kM LIZJ(Runnable runnable, long j, TimeUnit timeUnit) {
        if (this.LLILLJJLI) {
            return C11JT.INSTANCE;
        }
        long millis = timeUnit.toMillis(j);
        ARunnableS95S0200000_26 aRunnableS95S0200000_26 = new ARunnableS95S0200000_26(this, runnable, 57);
        if (millis <= 0) {
            C786410Ut5.LJL(this.LL, aRunnableS95S0200000_26);
            return new C11LO(new ARunnableS95S0200000_26(this, aRunnableS95S0200000_26, 55));
        }
        C786410Ut5.LJLIIL(millis, this.LL, aRunnableS95S0200000_26);
        return new C11LO(new ARunnableS95S0200000_26(this, aRunnableS95S0200000_26, 56));
    }
}
