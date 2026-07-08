package X;

import Y.ARunnableS102S0100000_2;
import Y.ARunnableS112S0100000_12;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: renamed from: X.0T6G, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T6G implements ViewTreeObserver.OnDrawListener {
    public final View LL;
    public final InterfaceC1224904ql LLILLJJLI;
    public final BPEAHandler LLILLL = new BPEAHandler(Looper.getMainLooper());
    public boolean LLILZ;

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        if (this.LLILZ) {
            return;
        }
        this.LLILZ = true;
        this.LLILLJJLI.LIZIZ();
        C786410Ut5.LJL(this.LLILLL, new ARunnableS102S0100000_2(this, 24));
        C786410Ut5.LJJZZIII(this.LLILLL, new ARunnableS112S0100000_12(this, 192));
    }

    public C0T6G(View view, InterfaceC1224904ql interfaceC1224904ql) {
        this.LL = view;
        this.LLILLJJLI = interfaceC1224904ql;
        if (view.getViewTreeObserver().isAlive() && view.isAttachedToWindow()) {
            C786410Ut5.w3(view.getViewTreeObserver(), this);
        } else {
            view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC785980UsO(this, 5));
        }
    }
}
