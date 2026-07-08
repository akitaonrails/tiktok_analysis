package X;

import Y.ARunnableS120S0100000_20;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: X.0klA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class ViewOnAttachStateChangeListenerC1331740klA implements View.OnAttachStateChangeListener, View.OnTouchListener, InterfaceC1332020klc {
    public final C1320770kTT<InterfaceC1316360kMM> LL;

    @Override // X.InterfaceC1332020klc
    public final void LIZ() {
    }

    public ViewOnAttachStateChangeListenerC1331740klA(C1320770kTT<InterfaceC1316360kMM> c1320770kTT) {
        this.LL = c1320770kTT;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (this.LL != null) {
            C1260120ite.LIZIZ(new ARunnableS120S0100000_20(this, 148));
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (this.LL != null) {
            C1260120ite.LIZIZ(new ARunnableS120S0100000_20(this, 147));
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
