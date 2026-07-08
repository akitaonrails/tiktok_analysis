package X;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;

/* JADX INFO: renamed from: X.0Qko, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C679360Qko {
    public static void LIZ(float f, float f2, View view) {
        if (view == null) {
            return;
        }
        C786410Ut5.T4(view, f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", view.getAlpha(), f2);
        objectAnimatorOfFloat.setDuration(200L);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        C786410Ut5.Pd(objectAnimatorOfFloat);
    }

    public static void LIZIZ(View view, float f, float f2, long j) {
        C786410Ut5.T4(view, f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", view.getAlpha(), f2);
        objectAnimatorOfFloat.setDuration(j);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        C786410Ut5.Pd(objectAnimatorOfFloat);
    }
}
