package X;

import Y.ACListenerS129S0200000_27;
import Y.AUListenerS275S0100000_27;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0xEr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1811430xEr {
    public final ValueAnimator LIZ;
    public final ValueAnimator LIZIZ;
    public final FrameLayout LIZJ;
    public final ConstraintLayout LIZLLL;
    public final FrameLayout LJ;

    public C1811430xEr(View view, C1810560xDS c1810560xDS) {
        FrameLayout frameLayout;
        float fLIZIZ = (int) C497740JfY.LIZIZ(78.0f);
        if (view != null) {
            frameLayout = (FrameLayout) view.findViewById(R.id.cng);
        } else {
            frameLayout = null;
        }
        this.LIZJ = frameLayout;
        ConstraintLayout constraintLayout = view != null ? (ConstraintLayout) view.findViewById(R.id.cn1) : null;
        this.LIZLLL = constraintLayout;
        if (constraintLayout != null) {
            this.LJ = (FrameLayout) constraintLayout.findViewById(R.id.cn0);
        }
        if (frameLayout != null) {
            C786410Ut5.O7(frameLayout, new ACListenerS129S0200000_27(c1810560xDS, this, 46));
        }
        float f = -fLIZIZ;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, 0.0f);
        this.LIZ = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setDuration(150L);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS275S0100000_27(this, 97));
        valueAnimatorOfFloat.addListener(new AbstractC1811460xEu() { // from class: X.0xEs
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                ConstraintLayout constraintLayout2 = this.LL.LIZLLL;
                if (constraintLayout2 != null) {
                    C786410Ut5.LL(8, constraintLayout2);
                }
                FrameLayout frameLayout2 = this.LL.LIZJ;
                if (frameLayout2 != null) {
                    C786410Ut5.LJZ(8, frameLayout2);
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                ConstraintLayout constraintLayout2 = this.LL.LIZLLL;
                if (constraintLayout2 != null) {
                    C786410Ut5.LL(0, constraintLayout2);
                }
                FrameLayout frameLayout2 = this.LL.LIZJ;
                if (frameLayout2 != null) {
                    C786410Ut5.LJZ(8, frameLayout2);
                }
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, f);
        this.LIZIZ = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat2.setDuration(150L);
        valueAnimatorOfFloat2.addUpdateListener(new AUListenerS275S0100000_27(this, 98));
        valueAnimatorOfFloat2.addListener(new AbstractC1811460xEu() { // from class: X.0xEt
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                ConstraintLayout constraintLayout2 = this.LL.LIZLLL;
                if (constraintLayout2 != null) {
                    C786410Ut5.LL(8, constraintLayout2);
                }
                FrameLayout frameLayout2 = this.LL.LIZJ;
                if (frameLayout2 != null) {
                    C786410Ut5.LJZ(0, frameLayout2);
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                ConstraintLayout constraintLayout2 = this.LL.LIZLLL;
                if (constraintLayout2 != null) {
                    C786410Ut5.LL(0, constraintLayout2);
                }
                FrameLayout frameLayout2 = this.LL.LIZJ;
                if (frameLayout2 != null) {
                    C786410Ut5.LJZ(8, frameLayout2);
                }
            }
        });
    }
}
