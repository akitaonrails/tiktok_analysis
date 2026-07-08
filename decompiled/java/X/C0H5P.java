package X;

import Y.AAListenerS317S0100000_6;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.0H5P, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H5P {
    public Integer LIZ;
    public AnimatorSet LIZIZ;
    public final C0ID8 LIZJ = new C0ID8(Integer.TYPE, 0);

    public final void LIZ(ViewGroup viewGroup, ViewGroup viewGroup2, boolean z) {
        float f;
        Integer num = this.LIZ;
        if (num != null) {
            int iIntValue = num.intValue();
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = iIntValue;
                C786410Ut5.W5(viewGroup, layoutParams);
                if (z) {
                    f = 1.0f;
                } else {
                    iIntValue = 0;
                    f = 0.0f;
                }
                ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(viewGroup, PropertyValuesHolder.ofInt(this.LIZJ, iIntValue), PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, f));
                ObjectAnimator objectAnimatorOfPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(viewGroup2, new PropertyValuesHolder[0]);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(objectAnimatorOfPropertyValuesHolder, objectAnimatorOfPropertyValuesHolder2);
                animatorSet.setDuration(200L);
                animatorSet.setInterpolator(C1619980sG4.LJI());
                AnimatorSet animatorSet2 = this.LIZIZ;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                this.LIZIZ = animatorSet;
                animatorSet.addListener(new AAListenerS317S0100000_6(this, 71));
                animatorSet.start();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
    }
}
