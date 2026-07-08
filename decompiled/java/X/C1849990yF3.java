package X;

import Y.ALAdapterS21S0200000_27;
import Y.ARunnableS104S0100000_4;
import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0yF3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1849990yF3 {
    public static final Interpolator LJFF = new LinearInterpolator();
    public static final Interpolator LJI = new DecelerateInterpolator();
    public final C417100GXc LIZ;
    public ValueAnimator LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public ARunnableS104S0100000_4 LJ;

    public C1849990yF3(C417100GXc c417100GXc) {
        this.LIZ = c417100GXc;
    }

    public final void LIZ(final float f, float f2, long j, Interpolator interpolator, Function0<Unit> function0) {
        if (this.LIZJ) {
            return;
        }
        ValueAnimator valueAnimator = this.LIZIZ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        valueAnimatorOfFloat.setDuration(j);
        valueAnimatorOfFloat.setInterpolator(interpolator);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0yF4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float fFloatValue;
                Float f3;
                C417100GXc c417100GXc = this.LL.LIZ;
                Object animatedValue = valueAnimator2.getAnimatedValue();
                if ((animatedValue instanceof Float) && (f3 = (Float) animatedValue) != null) {
                    fFloatValue = f3.floatValue();
                } else {
                    fFloatValue = f;
                }
                c417100GXc.setProgress(fFloatValue);
            }
        });
        valueAnimatorOfFloat.addListener(new ALAdapterS21S0200000_27(this, function0, 7));
        valueAnimatorOfFloat.start();
        this.LIZIZ = valueAnimatorOfFloat;
    }
}
