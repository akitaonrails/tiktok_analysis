package X;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.PathInterpolator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0HUJ, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HUJ {
    public final float LIZ;
    public final float LIZIZ;

    public /* synthetic */ C0HUJ() {
        this(0.0f, 1.0f);
    }

    public C0HUJ(float f, float f2) {
        this.LIZ = f;
        this.LIZIZ = f2;
    }

    public final ValueAnimator LIZ(View view, final Function0<Unit> function0) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "Alpha", this.LIZ, this.LIZIZ);
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.setInterpolator(new PathInterpolator(0.44f, 0.05f, 0.55f, 0.95f));
        objectAnimatorOfFloat.addListener(new C0HUM() { // from class: X.0HUK
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                function0.invoke();
            }
        });
        C786410Ut5.Pd(objectAnimatorOfFloat);
        return objectAnimatorOfFloat;
    }

    public final ValueAnimator LIZIZ(View view, final Function0<Unit> function0) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "Alpha", this.LIZIZ, this.LIZ);
        objectAnimatorOfFloat.setDuration(220L);
        objectAnimatorOfFloat.setInterpolator(new PathInterpolator(0.44f, 0.05f, 0.55f, 0.95f));
        objectAnimatorOfFloat.addListener(new C0HUM() { // from class: X.0HUL
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                function0.invoke();
            }
        });
        C786410Ut5.Pd(objectAnimatorOfFloat);
        return objectAnimatorOfFloat;
    }
}
