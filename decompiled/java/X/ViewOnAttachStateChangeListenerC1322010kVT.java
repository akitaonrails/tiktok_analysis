package X;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: X.0kVT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class ViewOnAttachStateChangeListenerC1322010kVT implements View.OnAttachStateChangeListener, View.OnTouchListener {
    public final /* synthetic */ C1322000kVS LL;

    public ViewOnAttachStateChangeListenerC1322010kVT(C1322000kVS c1322000kVS) {
        this.LL = c1322000kVS;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        C1320770kTT<InterfaceC1316360kMM> c1320770kTT = this.LL.LIZJ;
        if (c1320770kTT != null) {
            c1320770kTT.LJFF();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        C1320770kTT<InterfaceC1316360kMM> c1320770kTT = this.LL.LIZJ;
        if (c1320770kTT != null) {
            c1320770kTT.LJI();
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C1320770kTT<InterfaceC1316360kMM> c1320770kTT = this.LL.LIZJ;
        if (c1320770kTT != null && c1320770kTT.LJII(motionEvent)) {
            return true;
        }
        return false;
    }
}
