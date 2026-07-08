package X;

import android.animation.ObjectAnimator;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: X.10VP, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10VP {
    public static void LIZIZ(View view) {
        view.setOnTouchListener(new View.OnTouchListener() { // from class: X.10VQ
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action != 1 && action != 3) {
                        return false;
                    }
                    C10VP.LIZ(view2, false);
                    return false;
                }
                C10VP.LIZ(view2, true);
                return false;
            }
        });
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
}
