package X;

import Y.AUListenerS266S0100000_17;
import android.animation.Animator;
import android.animation.ValueAnimator;
import com.bytedance.ies.sdk.widgets.AnimationInfo;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;

/* JADX INFO: renamed from: X.0eDG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1080080eDG extends AnimationInfo {
    @Override // com.bytedance.ies.sdk.widgets.AnimationInfo
    public final Animator onCreateHideAnimator(ConstraintProperty constraintProperty) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS266S0100000_17(constraintProperty, 112));
        return valueAnimatorOfFloat;
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimationInfo
    public final Animator onCreateShowAnimator(ConstraintProperty constraintProperty) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(-((int) C497740JfY.LIZIZ(126.0f)), 0.0f);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS266S0100000_17(constraintProperty, 113));
        return valueAnimatorOfFloat;
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimationInfo
    public final void onHideAnimationStart(ConstraintProperty constraintProperty) {
        super.onHideAnimationStart(constraintProperty);
        constraintProperty.translationY(0.0f);
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimationInfo
    public final void onShowAnimationStart(ConstraintProperty constraintProperty) {
        super.onShowAnimationStart(constraintProperty);
        constraintProperty.alpha(1.0f);
    }

    public C1080080eDG(int i, LayeredElementContext layeredElementContext) {
        super(i, layeredElementContext);
    }
}
