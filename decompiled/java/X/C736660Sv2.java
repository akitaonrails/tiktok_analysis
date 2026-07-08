package X;

import Y.ARunnableS111S0100000_11;
import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: renamed from: X.0Sv2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C736660Sv2 implements ValueAnimator.AnimatorUpdateListener, C19KC {
    public final View LL;
    public float LLILLJJLI = -1.0f;

    @Override // X.C19KC
    public final int LIZ() {
        return 4;
    }

    public C736660Sv2(View view) {
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
                C786410Ut5.Ob(view, f);
            }
            View view2 = this.LL;
            if (view2 != null) {
                C786410Ut5.pc(view2, this.LLILLJJLI);
                return;
            }
            return;
        }
        C2487409ou.LIZLLL(i, new ARunnableS111S0100000_11(this, 174));
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.LLILLJJLI = ((Float) valueAnimator.getAnimatedValue()).floatValue();
    }
}
