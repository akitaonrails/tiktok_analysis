package X;

import Y.ARunnableS131S0100000_31;
import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: renamed from: X.14ge, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20329414ge implements ValueAnimator.AnimatorUpdateListener, C19KC {
    public final View LL;
    public float LLILLJJLI = -1.0f;

    @Override // X.C19KC
    public final int LIZ() {
        return 4;
    }

    public C20329414ge(View view) {
        this.LL = view;
    }

    @Override // X.C19KC
    public final void LIZIZ(int i) {
        float f = this.LLILLJJLI;
        if (f < 0.0f) {
            return;
        }
        if (i == 0) {
            View view = this.LL;
            if (view != null) {
                C786410Ut5.Ab(view, f);
                return;
            }
            return;
        }
        C2487409ou.LIZLLL(i, new ARunnableS131S0100000_31(this, 10));
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.LLILLJJLI = ((Float) valueAnimator.getAnimatedValue()).floatValue();
    }
}
