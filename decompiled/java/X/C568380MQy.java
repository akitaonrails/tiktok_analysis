package X;

import Y.ALAdapterS5S0200000_8;
import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: renamed from: X.0MQy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C568380MQy {
    public static final /* synthetic */ int LIZ = 0;

    public static ValueAnimator LIZ(final View view, final View view2) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(0, view2);
        }
        valueAnimatorOfFloat.setInterpolator(C1619980sG4.LIZLLL());
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0MQx
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Float f;
                Object animatedValue = valueAnimator.getAnimatedValue();
                if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
                    f.floatValue();
                    View view3 = view;
                    if (view3 != null) {
                        float f2 = 1;
                        C786410Ut5.Ob(view3, f2 - (f.floatValue() * 0.1f));
                        C786410Ut5.pc(view3, f2 - (f.floatValue() * 0.1f));
                        C786410Ut5.T4(view3, f2 - f.floatValue());
                    }
                    View view4 = view2;
                    if (view4 != null) {
                        C786410Ut5.Ob(view4, (f.floatValue() * 0.1f) + 0.9f);
                        C786410Ut5.pc(view4, (f.floatValue() * 0.1f) + 0.9f);
                        C786410Ut5.T4(view4, f.floatValue());
                    }
                }
            }
        });
        valueAnimatorOfFloat.addListener(new ALAdapterS5S0200000_8(view, view2, 3));
        valueAnimatorOfFloat.start();
        return valueAnimatorOfFloat;
    }
}
