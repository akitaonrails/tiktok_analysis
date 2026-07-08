package X;

import Y.AUListenerS266S0100000_17;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import com.bytedance.ies.sdk.widgets.AnimationInfo;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;

/* JADX INFO: renamed from: X.0eEm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1081020eEm extends AnimationInfo {
    @Override // com.bytedance.ies.sdk.widgets.AnimationInfo
    public final Animator onCreateHideAnimator(ConstraintProperty constraintProperty) {
        if (constraintProperty.getView() != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, r1.getHeight() + ((int) C497740JfY.LIZIZ(8.0f)));
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS266S0100000_17(constraintProperty, 114));
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
            valueAnimatorOfFloat2.setInterpolator(C0GY9.LIZIZ(0.25f, 0.1f, 0.25f, 1.0f));
            valueAnimatorOfFloat2.addUpdateListener(new AUListenerS266S0100000_17(constraintProperty, 115));
            animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
            return animatorSet;
        }
        return null;
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimationInfo
    public final Animator onCreateShowAnimator(ConstraintProperty constraintProperty) {
        if (constraintProperty.getView() != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(r0.getHeight() + ((int) C497740JfY.LIZIZ(8.0f)), 0.0f);
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS266S0100000_17(constraintProperty, 116));
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat2.setInterpolator(C0GY9.LIZIZ(0.42f, 0.0f, 1.0f, 1.0f));
            valueAnimatorOfFloat2.addUpdateListener(new AUListenerS266S0100000_17(constraintProperty, 117));
            animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
            return animatorSet;
        }
        return null;
    }

    public C1081020eEm(int i, LayeredElementContext layeredElementContext) {
        super(i, layeredElementContext);
    }
}
