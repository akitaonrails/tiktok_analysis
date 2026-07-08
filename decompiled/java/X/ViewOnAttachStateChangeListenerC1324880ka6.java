package X;

import Y.ARunnableS120S0100000_20;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: X.0ka6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class ViewOnAttachStateChangeListenerC1324880ka6 implements View.OnAttachStateChangeListener, View.OnTouchListener {
    public final C1320770kTT<InterfaceC1316360kMM> LL;

    public ViewOnAttachStateChangeListenerC1324880ka6(C1320770kTT<InterfaceC1316360kMM> c1320770kTT) {
        this.LL = c1320770kTT;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (this.LL != null) {
            C707090RoR.LIZIZ(new ARunnableS120S0100000_20(this, 329));
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (this.LL != null) {
            C707090RoR.LIZIZ(new ARunnableS120S0100000_20(this, 330));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C1320770kTT<InterfaceC1316360kMM> c1320770kTT = this.LL;
        if (c1320770kTT != null && c1320770kTT.LJII(motionEvent)) {
            return true;
        }
        return false;
    }
}
