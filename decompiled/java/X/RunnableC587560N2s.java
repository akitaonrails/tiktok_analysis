package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.landpage.externalguide.AbsAdExternalGuideHandler;

/* JADX INFO: renamed from: X.0N2s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class RunnableC587560N2s implements InterfaceC1038550d8H, Runnable {
    public final AbsAdExternalGuideHandler LL;
    public final long LLILLJJLI;
    public final BPEAHandler LLILLL = new BPEAHandler(Looper.getMainLooper());

    @Override // X.InterfaceC1038550d8H
    public final boolean LIZ() {
        C786410Ut5.LJLIIL(this.LLILLJJLI, this.LLILLL, this);
        return true;
    }

    @Override // X.InterfaceC1038550d8H
    public final void cancel() {
        this.LLILLL.removeCallbacks(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("AbsAdExternalGuideHandler$DelayTrigger@a516.run");
        try {
            this.LL.LJ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AbsAdExternalGuideHandler$DelayTrigger@a516.run");
    }

    public RunnableC587560N2s(long j, AbsAdExternalGuideHandler absAdExternalGuideHandler) {
        this.LL = absAdExternalGuideHandler;
        this.LLILLJJLI = j;
    }
}
