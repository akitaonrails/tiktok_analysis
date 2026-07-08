package X;

import Y.ARunnableS120S0100000_20;
import android.view.Choreographer;
import com.lynx.tasm.base.TraceController;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.core.LynxLayoutProxy;
import j27.s;

/* JADX INFO: renamed from: X.0kCG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class ChoreographerFrameCallbackC1310100kCG implements Choreographer.FrameCallback {
    public final /* synthetic */ Runnable LL;
    public final /* synthetic */ C1310090kCF LLILLJJLI;

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        s sVar = this.LLILLJJLI.LIZ;
        if (sVar.LLLIIL) {
            ARunnableS120S0100000_20 aRunnableS120S0100000_20 = new ARunnableS120S0100000_20(this, 252);
            LynxLayoutProxy lynxLayoutProxy = sVar.LLJILJIL.get();
            if (lynxLayoutProxy != null) {
                lynxLayoutProxy.LIZIZ(aRunnableS120S0100000_20);
                return;
            }
            return;
        }
        if (TraceController.isTracingStarted()) {
            TraceEvent.LIZLLL("ChoreographerLayoutTick.triggerLayout");
        }
        this.LL.run();
        if (!TraceController.isTracingStarted()) {
            return;
        }
        TraceEvent.LJII("ChoreographerLayoutTick.triggerLayout");
    }

    public ChoreographerFrameCallbackC1310100kCG(C1310090kCF c1310090kCF, ARunnableS120S0100000_20 aRunnableS120S0100000_20) {
        this.LLILLJJLI = c1310090kCF;
        this.LL = aRunnableS120S0100000_20;
    }
}
