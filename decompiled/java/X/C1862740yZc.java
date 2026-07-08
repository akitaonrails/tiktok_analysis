package X;

import android.graphics.Rect;
import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: X.0yZc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@InterfaceC1294060jmO
public final class C1862740yZc implements C1FZ5 {
    public final View LIZ;
    public int LIZIZ;
    public C0H23 LIZJ;
    public final int LIZLLL;
    public final ViewTreeObserverOnGlobalLayoutListenerC1864770yct LJ;

    @Override // X.C1FZ5
    public final void releaseListener() {
        View view = this.LIZ;
        if (view != null && this.LJ != null) {
            C786410Ut5.C3(view.getViewTreeObserver(), this.LJ);
        }
        this.LIZJ = null;
    }

    public C1862740yZc(C19EG c19eg) {
        int iHeight;
        Window window = c19eg.getWindow();
        View decorView = window != null ? window.getDecorView() : null;
        this.LIZ = decorView;
        if (decorView != null) {
            Rect rect = new Rect();
            decorView.getWindowVisibleDisplayFrame(rect);
            iHeight = rect.height();
        } else {
            iHeight = 0;
        }
        this.LIZIZ = iHeight;
        this.LIZLLL = 200;
        this.LJ = new ViewTreeObserverOnGlobalLayoutListenerC1864770yct(this, 6);
    }
}
