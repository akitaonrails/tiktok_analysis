package X;

import android.animation.ObjectAnimator;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;

/* JADX INFO: renamed from: X.0EZX, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EZX {
    public static void LIZIZ(final View view, final float f) {
        if (view == null) {
            return;
        }
        view.setOnTouchListener(new View.OnTouchListener() { // from class: X.0EZY
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                View view3 = view;
                float f2 = f;
                if (motionEvent.getAction() == 0) {
                    C0EZX.LIZ(1.0f, f2, view3);
                    return false;
                }
                if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    return false;
                }
                C0EZX.LIZ(f2, 1.0f, view3);
                return false;
            }
        });
    }

    public static void LIZ(float f, float f2, View view) {
        C786410Ut5.T4(view, f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", view.getAlpha(), f2);
        objectAnimatorOfFloat.setDuration(200L);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        C786410Ut5.Pd(objectAnimatorOfFloat);
    }
}
