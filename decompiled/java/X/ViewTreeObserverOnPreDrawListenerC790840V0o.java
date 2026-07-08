package X;

import Y.ARunnableS40S0400000_32;
import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: X.0V0o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class ViewTreeObserverOnPreDrawListenerC790840V0o implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View LL;
    public final Runnable LLILLJJLI;
    public ViewTreeObserver LLILLL;

    public final void LIZ() {
        if (this.LLILLL.isAlive()) {
            C786410Ut5.D3(this.LLILLL, this);
        } else {
            C786410Ut5.D3(this.LL.getViewTreeObserver(), this);
        }
        this.LL.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        LIZ();
        this.LLILLJJLI.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.LLILLL = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        LIZ();
    }

    public ViewTreeObserverOnPreDrawListenerC790840V0o(View view, ARunnableS40S0400000_32 aRunnableS40S0400000_32) {
        this.LL = view;
        this.LLILLJJLI = aRunnableS40S0400000_32;
        this.LLILLL = view.getViewTreeObserver();
    }
}
