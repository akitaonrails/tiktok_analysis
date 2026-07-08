package X;

import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0IEZ, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IEZ {
    public final View LIZ;
    public ViewTreeObserver LIZIZ;
    public ViewTreeObserver.OnPreDrawListener LIZJ;
    public boolean LIZLLL;
    public final ViewOnAttachStateChangeListenerC521700Kd6 LJ = new ViewOnAttachStateChangeListenerC521700Kd6(this, 2);

    public final void LIZ() {
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.LIZJ;
        if (onPreDrawListener == null) {
            return;
        }
        ViewTreeObserver viewTreeObserver = this.LIZIZ;
        if (viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            try {
                ViewTreeObserver viewTreeObserver2 = this.LIZ.getViewTreeObserver();
                if (viewTreeObserver2.isAlive()) {
                    viewTreeObserver2.removeOnPreDrawListener(onPreDrawListener);
                    C2187701Ajg.LIZIZ(viewTreeObserver2, onPreDrawListener, ViewTreeObserver.OnPreDrawListener.class);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        } else {
            try {
                viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
                C2187701Ajg.LIZIZ(viewTreeObserver, onPreDrawListener, ViewTreeObserver.OnPreDrawListener.class);
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        this.LIZJ = null;
        this.LIZIZ = null;
        this.LIZLLL = false;
        try {
            this.LIZ.removeOnAttachStateChangeListener(this.LJ);
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
    }

    public C0IEZ(View view) {
        this.LIZ = view;
    }
}
