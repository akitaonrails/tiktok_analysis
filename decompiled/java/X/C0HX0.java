package X;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import com.bytedance.tux.widget.RadiusLayout;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0HX0, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HX0 {
    public final C0HX2 LIZ = C0HX2.TRANSLATE_Y;

    public final ValueAnimator LIZ(RadiusLayout radiusLayout, final Function0 function0) {
        ObjectAnimator objectAnimatorOfFloat;
        int i = C0HX1.LIZ[this.LIZ.ordinal()];
        if (i != 1) {
            if (i == 2) {
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(radiusLayout, "alpha", 0.0f, 1.0f);
            } else {
                throw new C1954807lC();
            }
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(radiusLayout, "translationY", radiusLayout.getHeight(), 0.0f);
        }
        objectAnimatorOfFloat.setDuration(400L);
        objectAnimatorOfFloat.setInterpolator(C0HX3.LIZ());
        objectAnimatorOfFloat.addListener(new C0HUM() { // from class: X.0HUN
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                function0.invoke();
            }
        });
        C786410Ut5.Pd(objectAnimatorOfFloat);
        return objectAnimatorOfFloat;
    }

    public final ValueAnimator LIZIZ(RadiusLayout radiusLayout, final Function0 function0) {
        ObjectAnimator objectAnimatorOfFloat;
        int i = C0HX1.LIZ[this.LIZ.ordinal()];
        if (i != 1) {
            if (i == 2) {
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(radiusLayout, "alpha", 1.0f, 0.0f);
            } else {
                throw new C1954807lC();
            }
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(radiusLayout, "translationY", 0.0f, radiusLayout.getHeight());
        }
        objectAnimatorOfFloat.setDuration(350L);
        objectAnimatorOfFloat.setInterpolator(C0HX3.LIZ());
        objectAnimatorOfFloat.addListener(new C0HUM() { // from class: X.0HUO
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                function0.invoke();
            }
        });
        C786410Ut5.Pd(objectAnimatorOfFloat);
        return objectAnimatorOfFloat;
    }
}
