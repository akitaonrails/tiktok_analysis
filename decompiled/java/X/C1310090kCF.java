package X;

import Y.ARunnableS120S0100000_20;
import com.lynx.tasm.base.TraceController;
import com.lynx.tasm.base.TraceEvent;
import j27.s;

/* JADX INFO: renamed from: X.0kCF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1310090kCF implements InterfaceC1310560kD0 {
    public final s LIZ;

    public C1310090kCF(s sVar) {
        this.LIZ = sVar;
    }

    @Override // X.InterfaceC1310560kD0
    public final void LIZ(ARunnableS120S0100000_20 aRunnableS120S0100000_20) {
        if (TraceController.isTracingStarted()) {
            TraceEvent.LIZLLL("ChoreographerLayoutTick.requestLayout");
        }
        C786410Ut5.v2().postFrameCallback(new ChoreographerFrameCallbackC1310100kCG(this, aRunnableS120S0100000_20));
        if (TraceController.isTracingStarted()) {
            TraceEvent.LJII("ChoreographerLayoutTick.requestLayout");
        }
    }
}
