package X;

import android.animation.ObjectAnimator;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: X.10VO, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10VO {
    public static void LIZIZ(View view) {
        LIZJ(view, 0.5f);
    }

    public static void LIZJ(View view, final float f) {
        view.setOnTouchListener(new View.OnTouchListener() { // from class: X.10VN
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action != 1 && action != 3) {
                        return false;
                    }
                    C10VO.LIZ(f, view2, false);
                    return false;
                }
                C10VO.LIZ(f, view2, true);
                return false;
            }
        });
    }

    public static void LIZ(float f, View view, boolean z) {
        float f2;
        float[] fArr = new float[2];
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = f;
        }
        fArr[0] = f2;
        if (!z) {
            f = 1.0f;
        }
        fArr[1] = f;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", fArr);
        objectAnimatorOfFloat.setDuration(100L);
        objectAnimatorOfFloat.start();
    }
}
