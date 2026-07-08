package X;

import Y.ALAdapterS17S0200000_22;
import Y.AUListenerS253S0100000_2;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.List;

/* JADX INFO: renamed from: X.0oD8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1464400oD8 {
    public final ViewGroup LIZ;
    public final List<View> LIZIZ;
    public final Activity LIZJ;
    public View LIZLLL;
    public LinearLayout LJ;
    public View LJFF;
    public int LJI;
    public boolean LJII = true;

    public final void LIZIZ() {
        LinearLayout linearLayout;
        if (this.LJII || (linearLayout = this.LJ) == null) {
            return;
        }
        View view = this.LJFF;
        if (view != null) {
            C786410Ut5.Ab(view, 0.0f);
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.LJI, 0);
        valueAnimatorOfInt.setDuration(250L);
        valueAnimatorOfInt.addUpdateListener(new AUListenerS253S0100000_2(linearLayout, 22));
        valueAnimatorOfInt.addListener(new ALAdapterS17S0200000_22(this, linearLayout, 4));
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(linearLayout, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(250L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorOfInt, objectAnimatorOfFloat);
        animatorSet.start();
    }

    public final void LIZJ() {
        LinearLayout linearLayout;
        if (this.LJII && (linearLayout = this.LJ) != null) {
            View view = this.LJFF;
            if (view != null) {
                C786410Ut5.Ab(view, 180.0f);
            }
            linearLayout.measure(0, 0);
            int measuredHeight = linearLayout.getMeasuredHeight();
            this.LJI = measuredHeight;
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, measuredHeight);
            valueAnimatorOfInt.setDuration(250L);
            valueAnimatorOfInt.addUpdateListener(new AUListenerS253S0100000_2(linearLayout, 22));
            valueAnimatorOfInt.addListener(new ALAdapterS17S0200000_22(this, linearLayout, 5));
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(linearLayout, "alpha", 0.0f, 1.0f);
            objectAnimatorOfFloat.setDuration(250L);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(valueAnimatorOfInt, objectAnimatorOfFloat);
            animatorSet.start();
        }
    }

    public final void LIZ(View view) {
        ((LinearLayout.LayoutParams) view.getLayoutParams()).topMargin = (int) C12ES.LIZJ(12.0f, this.LIZJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1464400oD8(ViewGroup viewGroup, List<? extends View> list, Activity activity) {
        this.LIZ = viewGroup;
        this.LIZIZ = list;
        this.LIZJ = activity;
    }
}
