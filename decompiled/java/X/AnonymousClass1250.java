package X;

import Y.ATListenerS166S0000000_29;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: X.1250, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class AnonymousClass1250 {
    public static void LIZIZ(View view) {
        view.setOnTouchListener(new ATListenerS166S0000000_29(1));
    }

    public static void LIZJ(View view) {
        view.setOnTouchListener(new ATListenerS166S0000000_29(2));
    }

    public static void LIZ(View view, boolean z) {
        float f;
        float[] fArr = new float[2];
        float f2 = 1.0f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.5f;
        }
        fArr[0] = f;
        if (z) {
            f2 = 0.5f;
        }
        fArr[1] = f2;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", fArr);
        objectAnimatorOfFloat.setDuration(100L);
        objectAnimatorOfFloat.start();
    }

    public static void LIZLLL(View view, boolean z) {
        float f;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        float f2 = 1.2f;
        if (z) {
            f = 1.2f;
        } else {
            f = 1.0f;
        }
        ViewPropertyAnimator viewPropertyAnimatorScaleX = viewPropertyAnimatorAnimate.scaleX(f);
        if (!z) {
            f2 = 1.0f;
        }
        viewPropertyAnimatorScaleX.scaleY(f2).setDuration(100L).start();
    }
}
