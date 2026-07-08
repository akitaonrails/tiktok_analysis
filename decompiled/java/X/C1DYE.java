package X;

import Y.ALAdapterS28S0100000_35;
import Y.AUListenerS281S0100000_35;
import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: renamed from: X.1DYE, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public abstract class C1DYE<T> implements C1DY1 {
    public final View LIZ;
    public final C1DYJ<T> LIZIZ;
    public final InterfaceC2257451DXj LIZJ;
    public ValueAnimator LIZLLL;
    public C1DY2 LJ;

    public abstract T LIZIZ();

    public void LIZJ(T t) {
    }

    @Override // X.C1DY1
    public final void cancel() {
        ValueAnimator valueAnimator;
        if (this.LIZIZ.LIZ == null && (valueAnimator = this.LIZLLL) != null) {
            valueAnimator.cancel();
            this.LIZLLL = null;
        }
    }

    @Override // X.C1DY1
    public final void start() {
        ValueAnimator valueAnimatorOfFloat;
        T t = this.LIZIZ.LIZ;
        if (t != null) {
            C1DY2 c1dy2 = this.LJ;
            if (c1dy2 != null) {
                c1dy2.LIZIZ();
            }
            LIZLLL(t);
            C1DY2 c1dy22 = this.LJ;
            if (c1dy22 != null) {
                c1dy22.LIZ();
                return;
            }
            return;
        }
        if (!(this instanceof C1DYM)) {
            ValueAnimator valueAnimator = this.LIZLLL;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            C1DYJ<T> c1dyj = this.LIZIZ;
            T t2 = c1dyj.LIZJ;
            if (t2 != null) {
                T tLIZIZ = c1dyj.LIZIZ;
                if (tLIZIZ == null) {
                    tLIZIZ = LIZIZ();
                }
                if ((tLIZIZ instanceof Integer) && (t2 instanceof Integer)) {
                    valueAnimatorOfFloat = ValueAnimator.ofInt(tLIZIZ.intValue(), ((Number) t2).intValue());
                } else if (!(tLIZIZ instanceof Float) || !(t2 instanceof Float)) {
                    return;
                } else {
                    valueAnimatorOfFloat = ValueAnimator.ofFloat(tLIZIZ.floatValue(), ((Number) t2).floatValue());
                }
                if (valueAnimatorOfFloat != null) {
                    valueAnimatorOfFloat.setDuration(this.LIZIZ.LIZLLL);
                    valueAnimatorOfFloat.setInterpolator(C1016660cYy.LIZ(this.LIZIZ.LJ));
                    valueAnimatorOfFloat.addUpdateListener(new AUListenerS281S0100000_35(this, 8));
                    valueAnimatorOfFloat.addListener(new ALAdapterS28S0100000_35(this, 7));
                    this.LIZLLL = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.start();
                }
            }
        }
    }

    @Override // X.C1DY1
    public final void LIZ(C1DY2 c1dy2) {
        this.LJ = c1dy2;
    }

    public void LIZLLL(T t) {
        LIZJ(t);
    }

    public C1DYE(View view, C1DYJ<T> c1dyj, InterfaceC2257451DXj interfaceC2257451DXj) {
        this.LIZ = view;
        this.LIZIZ = c1dyj;
        this.LIZJ = interfaceC2257451DXj;
    }
}
