package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: X.0zkg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class ViewTreeObserverOnPreDrawListenerC1908040zkg implements ViewTreeObserver.OnPreDrawListener {
    public final View LL;
    public final boolean LLILLJJLI = true;
    public final Runnable LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public int LLILZLL;

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view = this.LL;
        boolean localVisibleRect = (view == null || !view.isShown()) ? false : view.getLocalVisibleRect(new Rect());
        int i = this.LLILZLL;
        if (i < 10) {
            this.LLILZLL = i + 1;
        }
        if (this.LLILZLL < 10) {
            return true;
        }
        if (localVisibleRect && !this.LLILZ) {
            this.LLILLL.run();
            this.LLILZIL = true;
        }
        if (this.LLILZIL && this.LLILLJJLI) {
            C786410Ut5.D3(this.LL.getViewTreeObserver(), this);
        }
        this.LLILZ = localVisibleRect;
        return true;
    }

    public ViewTreeObserverOnPreDrawListenerC1908040zkg(final View view, RunnableC1883740z7U runnableC1883740z7U) {
        this.LL = view;
        this.LLILLL = runnableC1883740z7U;
        if (view.isAttachedToWindow()) {
            C786410Ut5.y3(view.getViewTreeObserver(), this);
        } else {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: X.0zki
                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewDetachedFromWindow(View view2) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewAttachedToWindow(View view2) {
                    view.removeOnAttachStateChangeListener(this);
                    C786410Ut5.y3(this.LL.getViewTreeObserver(), this);
                }
            });
        }
        if (!view.isAttachedToWindow()) {
            C786410Ut5.D3(view.getViewTreeObserver(), this);
            this.LLILZ = false;
        } else {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: X.0zkh
                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewAttachedToWindow(View view2) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewDetachedFromWindow(View view2) {
                    view.removeOnAttachStateChangeListener(this);
                    C786410Ut5.D3(this.LL.getViewTreeObserver(), this);
                    this.LLILZ = false;
                }
            });
        }
    }
}
