package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0T2f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C740310T2f {
    public static final ValueAnimator LIZ(final View view, float f, float f2, long j, final Function0 function0) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.setStartDelay(j);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0DYj
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C786410Ut5.ed(view, (1.0f - fFloatValue) * r2.getHeight());
                C786410Ut5.T4(view, fFloatValue);
            }
        });
        valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: X.0T2e
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                function0.invoke();
            }
        });
        return valueAnimatorOfFloat;
    }
}
