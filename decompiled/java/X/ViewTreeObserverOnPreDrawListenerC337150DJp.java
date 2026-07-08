package X;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: X.0DJp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewTreeObserverOnPreDrawListenerC337150DJp implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View LL;
    public ViewTreeObserver LLILLJJLI;
    public final Runnable LLILLL;

    public final void LIZIZ() {
        if (this.LLILLJJLI.isAlive()) {
            C786410Ut5.D3(this.LLILLJJLI, this);
        } else {
            C786410Ut5.D3(this.LL.getViewTreeObserver(), this);
        }
        this.LL.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        LIZIZ();
        this.LLILLL.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.LLILLJJLI = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        LIZIZ();
    }

    public ViewTreeObserverOnPreDrawListenerC337150DJp(View view, Runnable runnable) {
        this.LL = view;
        this.LLILLJJLI = view.getViewTreeObserver();
        this.LLILLL = runnable;
    }

    public static ViewTreeObserverOnPreDrawListenerC337150DJp LIZ(View view, Runnable runnable) {
        if (view != null) {
            if (runnable != null) {
                ViewTreeObserverOnPreDrawListenerC337150DJp viewTreeObserverOnPreDrawListenerC337150DJp = new ViewTreeObserverOnPreDrawListenerC337150DJp(view, runnable);
                C786410Ut5.y3(view.getViewTreeObserver(), viewTreeObserverOnPreDrawListenerC337150DJp);
                view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC337150DJp);
                return viewTreeObserverOnPreDrawListenerC337150DJp;
            }
            throw new NullPointerException("runnable == null");
        }
        throw new NullPointerException("view == null");
    }
}
