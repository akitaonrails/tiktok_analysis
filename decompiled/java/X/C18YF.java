package X;

import X.C18YK;
import android.animation.Animator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: renamed from: X.18YF, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public abstract class C18YF<T extends C18YK> {
    public View LIZ;
    public ViewGroup LIZIZ;
    public LifecycleOwner LIZJ;
    public boolean LIZLLL = true;

    public abstract Animator LIZ(View view, T t, C18YL c18yl);

    public abstract Animator LIZIZ(View view, T t, C18YL c18yl);

    public abstract void LIZJ(EnumC912790ZrR enumC912790ZrR, boolean z, Integer num);

    public abstract int LIZLLL();

    public abstract void LJ(C18YL c18yl);

    public abstract void LJFF(C18YK c18yk);

    public final View LJI() {
        View view = this.LIZ;
        if (view != null) {
            return view;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public final Animator LJII(T t, C18YL c18yl) {
        View view;
        float f;
        View view2;
        View view3;
        if (!t.LJJII() || (view = this.LIZ) == null) {
            return null;
        }
        if (c18yl.LIZIZ == EnumC912790ZrR.MIDDLE) {
            int[] iArr = new int[2];
            c18yl.LIZ().getLocationOnScreen(iArr);
            int[] iArr2 = new int[2];
            Object parent = view.getParent();
            if ((parent instanceof View) && (view3 = (View) parent) != null) {
                view3.getLocationOnScreen(iArr2);
            }
            int width = view.getWidth();
            int width2 = 0;
            if (width > c18yl.LIZ().getWidth()) {
                f = (iArr[0] + ((r1 - width) / 2.0f)) - iArr2[0];
            } else {
                f = iArr[0] - iArr2[0];
            }
            Object parent2 = view.getParent();
            if ((parent2 instanceof View) && (view2 = (View) parent2) != null) {
                width2 = view2.getWidth();
            }
            if (width + f > width2) {
                f = width2 - width;
            }
            if (f < 0.0f) {
                f = 0.0f;
            }
            C786410Ut5.Fd(view, f);
        }
        return LIZIZ(view, t, c18yl);
    }

    public final void LJIIIIZZ(ViewGroup viewGroup, T t, C18YE c18ye, C18YL c18yl, Integer num) {
        if (t.LJJII()) {
            LifecycleOwner lifecycleOwner = c18ye.LIZLLL;
            if (this.LIZLLL) {
                this.LIZLLL = false;
                this.LIZIZ = viewGroup;
                this.LIZJ = lifecycleOwner;
                Context context = viewGroup.getContext();
                View viewLIZ = C20742916Ex.LIZ(context, LIZLLL(), new FrameLayout(context), false, -1);
                if (viewLIZ != null) {
                    viewGroup.addView(viewLIZ);
                    this.LIZ = viewLIZ;
                }
                if (this.LIZ != null) {
                    LJ(c18yl);
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            if (this.LIZ != null) {
                LJFF(t);
                LIZJ(c18yl.LIZIZ, c18yl.LIZLLL, num);
            }
        }
        View view = this.LIZ;
        if (view != null) {
            C786410Ut5.LJLLLLLL(4, view);
        }
    }
}
