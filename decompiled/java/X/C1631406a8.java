package X;

import Y.ALAdapterS0S0200000_2;
import Y.AUListenerS253S0100000_2;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;

/* JADX INFO: renamed from: X.06a8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1631406a8 {
    public static void LIZ(View view) {
        if (view.getVisibility() == 0) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(view.getHeight(), 0);
            valueAnimatorOfInt.setDuration(100L);
            valueAnimatorOfInt.setInterpolator(new AccelerateInterpolator());
            valueAnimatorOfInt.addUpdateListener(new AUListenerS253S0100000_2(view, 39));
            valueAnimatorOfInt.addListener(new ALAdapterS0S0200000_2(view, null, 4));
            valueAnimatorOfInt.start();
        }
    }

    public static final void LIZIZ(View view, float f) {
        int iLIZIZ = (int) (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)) + ((C814420VxA.LIZIZ(C418440Gaw.LIZIZ(92)) - r2) * f));
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = iLIZIZ;
        C786410Ut5.W5(view, layoutParams);
        C786410Ut5.T4(view, f);
        view.requestLayout();
    }
}
