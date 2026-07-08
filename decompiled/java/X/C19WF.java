package X;

import Y.ALAdapterS27S0200000_33;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.19WF, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19WF {
    public final WeakReference<View> LIZ;

    public final void LIZIZ() {
        View view = this.LIZ.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void LJFF() {
        View view = this.LIZ.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public C19WF(View view) {
        this.LIZ = new WeakReference<>(view);
    }

    public final void LIZ(float f) {
        View view = this.LIZ.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    public final void LIZJ(long j) {
        View view = this.LIZ.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    public final void LIZLLL(Interpolator interpolator) {
        View view = this.LIZ.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
    }

    public final void LJ(C19WE c19we) {
        View view = this.LIZ.get();
        if (view != null) {
            if (c19we != null) {
                view.animate().setListener(new ALAdapterS27S0200000_33(c19we, view, 8));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void LJI(float f) {
        View view = this.LIZ.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }
}
