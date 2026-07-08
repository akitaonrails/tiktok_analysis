package X;

import android.view.View;

/* JADX INFO: renamed from: X.11R9, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11R9 extends C11RC implements View.OnAttachStateChangeListener {
    public final View LLILLJJLI;
    public final C11IY LLILLL;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // X.C11RC
    public final void LIZ() {
        this.LLILLJJLI.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (!isDisposed()) {
            this.LLILLL.onComplete();
        }
    }

    public C11R9(View view, C11IY c11iy) {
        this.LLILLJJLI = view;
        this.LLILLL = c11iy;
    }
}
