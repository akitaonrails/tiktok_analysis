package Y;

import X.C12W6;
import X.C12W9;
import X.C19735912Jp;
import X.C786410Ut5;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes30.dex */
public class AUListenerS19S0102000_29 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public int i1;
    public int i2;
    public Object l0;

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$t) {
            case 0:
                onAnimationUpdate$0(this, valueAnimator);
                break;
            case 1:
                onAnimationUpdate$1(this, valueAnimator);
                break;
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS19S0102000_29 aUListenerS19S0102000_29, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ((C19735912Jp) aUListenerS19S0102000_29.l0).setMCurSelectPercent((int) (aUListenerS19S0102000_29.i1 + ((aUListenerS19S0102000_29.i2 - r2) * fFloatValue)));
        ((C19735912Jp) aUListenerS19S0102000_29.l0).invalidate();
    }

    public static final void onAnimationUpdate$1(AUListenerS19S0102000_29 aUListenerS19S0102000_29, ValueAnimator valueAnimator) {
        View view;
        float f;
        C12W9 c12w9 = (C12W9) aUListenerS19S0102000_29.l0;
        C12W6 c12w6 = c12w9.LJII;
        View view2 = null;
        if (c12w6 == null) {
            c12w6 = null;
        }
        RecyclerView recyclerView = c12w9.LJIIIIZZ;
        if (recyclerView == null) {
            recyclerView = null;
        }
        int iLLLIIIIL = c12w6.LLLIIIIL(recyclerView, aUListenerS19S0102000_29.i1);
        C12W9 c12w92 = (C12W9) aUListenerS19S0102000_29.l0;
        C12W6 c12w62 = c12w92.LJII;
        if (c12w62 == null) {
            c12w62 = null;
        }
        RecyclerView recyclerView2 = c12w92.LJIIIIZZ;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        int iLLLIIIIL2 = c12w62.LLLIIIIL(recyclerView2, aUListenerS19S0102000_29.i2);
        if (iLLLIIIIL == -1 && iLLLIIIIL2 == -1) {
            View view3 = ((C12W9) aUListenerS19S0102000_29.l0).LJIIIZ;
            if (view3 == null) {
                view3 = null;
            }
            C786410Ut5.Jc(view3, 0.0f);
            View view4 = ((C12W9) aUListenerS19S0102000_29.l0).LJIIIZ;
            if (view4 != null) {
                view2 = view4;
            }
            C786410Ut5.LJLLLLLL(4, view2);
            return;
        }
        if (iLLLIIIIL >= 0 && iLLLIIIIL2 >= 0) {
            View view5 = ((C12W9) aUListenerS19S0102000_29.l0).LJIIIZ;
            if (view5 == null) {
                view5 = null;
            }
            C786410Ut5.LJLLLLLL(0, view5);
            float fFloatValue = (((Float) valueAnimator.getAnimatedValue()).floatValue() * (iLLLIIIIL2 - iLLLIIIIL)) + iLLLIIIIL;
            View view6 = ((C12W9) aUListenerS19S0102000_29.l0).LJIIIZ;
            if (view6 != null) {
                view2 = view6;
            }
            C786410Ut5.Fd(view2, fFloatValue - (view2.getMeasuredWidth() / 2));
            return;
        }
        View view7 = ((C12W9) aUListenerS19S0102000_29.l0).LJIIIZ;
        if (view7 == null) {
            view7 = null;
        }
        C786410Ut5.LJLLLLLL(0, view7);
        View view8 = ((C12W9) aUListenerS19S0102000_29.l0).LJIIIZ;
        if (view8 == null) {
            view = null;
        } else {
            view = view8;
        }
        if (iLLLIIIIL2 == -1) {
            f = iLLLIIIIL;
        } else {
            f = iLLLIIIIL2;
        }
        if (view8 != null) {
            view2 = view8;
        }
        C786410Ut5.Fd(view, f - (view2.getMeasuredWidth() / 2));
    }

    public AUListenerS19S0102000_29(int i, int i2, Object obj, int i3) {
        this.$t = i3;
        this.l0 = obj;
        this.i1 = i;
        this.i2 = i2;
    }
}
