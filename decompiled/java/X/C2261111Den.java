package X;

import Y.AUListenerS5S0100002_35;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Interpolator;

/* JADX INFO: renamed from: X.1Den, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2261111Den {
    public final View LIZ;
    public Animator LIZIZ;

    public final void LIZIZ() {
        Animator animator = this.LIZIZ;
        if (animator != null) {
            animator.cancel();
        }
        this.LIZIZ = null;
    }

    public C2261111Den(C1899490zWt c1899490zWt) {
        this.LIZ = c1899490zWt;
    }

    public final float LIZJ(float f) {
        return C12ES.LIZJ(f, this.LIZ.getContext());
    }

    public final Animator LIZ(float f, float f2, float f3, long j, long j2, Interpolator interpolator, Interpolator interpolator2) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(j);
        valueAnimatorOfFloat.setInterpolator(interpolator);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS5S0100002_35(this, f, f2, 0));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setDuration(j2);
        valueAnimatorOfFloat2.setInterpolator(interpolator2);
        valueAnimatorOfFloat2.addUpdateListener(new AUListenerS5S0100002_35(this, f + f2, f3 + f, 1));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        return animatorSet;
    }
}
