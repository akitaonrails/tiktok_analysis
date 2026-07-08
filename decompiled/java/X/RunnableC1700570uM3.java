package X;

import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: X.0uM3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class RunnableC1700570uM3 implements Runnable {
    public ViewTreeObserver LL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("LayoutHookHelper$GlobalLayoutChangeRunnable@f05.run");
        try {
            ViewTreeObserver viewTreeObserver = this.LL;
            if (viewTreeObserver != null) {
                viewTreeObserver.dispatchOnGlobalLayout();
                this.LL = null;
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LayoutHookHelper$GlobalLayoutChangeRunnable@f05.run");
    }
}
