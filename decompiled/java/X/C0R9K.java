package X;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: X.0R9K, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0R9K implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
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

    public C0R9K(View view, Runnable runnable) {
        this.LL = view;
        this.LLILLJJLI = view.getViewTreeObserver();
        this.LLILLL = runnable;
    }

    public static void LIZ(View view, Runnable runnable) {
        C0R9K c0r9k = new C0R9K(view, runnable);
        C786410Ut5.y3(view.getViewTreeObserver(), c0r9k);
        view.addOnAttachStateChangeListener(c0r9k);
    }
}
