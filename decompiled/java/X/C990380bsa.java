package X;

import Y.AUListenerS265S0100000_16;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0bsa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C990380bsa {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(View view, int i, int i2, boolean z) {
        if (view == null) {
            return;
        }
        int i3 = ((FrameLayout.LayoutParams) view.getLayoutParams()).bottomMargin;
        if (z) {
            if (i3 < 0) {
                LIZIZ(view, i3, i, i2).start();
            }
        } else {
            if (i3 < 0) {
                return;
            }
            LIZIZ(view, i3, i, i2).start();
        }
    }

    public static ValueAnimator LIZIZ(View view, int i, int i2, int i3) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, i2);
        valueAnimatorOfInt.addUpdateListener(new AUListenerS265S0100000_16(view, 28));
        valueAnimatorOfInt.setDuration(i3);
        valueAnimatorOfInt.setTarget(view);
        return valueAnimatorOfInt;
    }
}
