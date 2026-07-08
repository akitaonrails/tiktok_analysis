package X;

import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: X.0V2P, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V2P implements ViewTreeObserver.OnPreDrawListener, ViewTreeObserver.OnDrawListener {
    public final C0V2Q LL;

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        this.LL.LIZ();
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.LL.LIZ();
        return true;
    }

    public C0V2P(boolean z) {
        this.LL = new C0V2Q(z);
    }
}
