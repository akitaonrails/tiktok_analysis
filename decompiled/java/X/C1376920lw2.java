package X;

import Y.AUListenerS270S0100000_21;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: renamed from: X.0lw2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1376920lw2 extends AbstractC736370SuZ {
    public static final int LLJI;
    public static final InterpolatorC420870Ger LLJIJIL;
    public final InterfaceC1373720lqs LLILZ;
    public final InterfaceC1374230lrh LLILZIL;
    public final ViewGroup LLILZLL;
    public final ViewGroup LLIZ;
    public AnimatorSet LLIZLLLIL;
    public final AwS565S0100000_21 LLJ;

    static {
        C844470XAv.LIZ.getClass();
        LLJI = (int) C12ES.LIZJ(8.0f, C844470XAv.LIZ());
        LLJIJIL = new InterpolatorC420870Ger(0.25f, 0.1f, 0.25f, 1.0f);
    }

    @Override // X.AbstractC1376810lvr
    public final void LIZIZ(View view) {
        final int i;
        DialogC1372820lpQ dialogC1372820lpQ;
        int iLIZJ;
        Context context;
        AnimatorSet animatorSet = this.LLIZLLLIL;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS270S0100000_21(this, 20));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setDuration(200L);
        valueAnimatorOfFloat2.addUpdateListener(new AUListenerS270S0100000_21(this, 21));
        int i2 = LLJI;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i2, 0);
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.addUpdateListener(new AUListenerS270S0100000_21(this, 22));
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(0, -i2);
        valueAnimatorOfInt2.setDuration(300L);
        valueAnimatorOfInt2.addUpdateListener(new AUListenerS270S0100000_21(this, 23));
        ValueAnimator valueAnimatorOfInt3 = ValueAnimator.ofInt(this.LLIZ.getMeasuredHeight(), this.LLILZLL.getMeasuredHeight());
        valueAnimatorOfInt3.setDuration(300L);
        valueAnimatorOfInt3.addUpdateListener(new AUListenerS270S0100000_21(this, 24));
        ViewGroup viewGroup = this.LLIZ;
        ViewGroup.LayoutParams layoutParams = null;
        if (viewGroup != null) {
            layoutParams = viewGroup.getLayoutParams();
        }
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        final int i3 = marginLayoutParams.topMargin;
        ViewGroup viewGroup2 = this.LLILZLL;
        int[] iArr = new int[2];
        if (viewGroup2 != null) {
            viewGroup2.getLocationOnScreen(iArr);
        }
        if (C2162308dZ.LJII()) {
            int i4 = iArr[1];
            if (viewGroup2 != null && (context = viewGroup2.getContext()) != null) {
                iLIZJ = C497820Jfg.LIZJ(context);
            } else {
                iLIZJ = 0;
            }
            i = i4 - iLIZJ;
        } else {
            i = iArr[1];
        }
        new Animation() { // from class: X.0lw3
            @Override // android.view.animation.Animation
            public final void applyTransformation(float f, Transformation transformation) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                int i5 = i;
                marginLayoutParams2.topMargin = ((int) ((i5 - r1) * f)) + i3;
                ViewGroup viewGroup3 = this.LLIZ;
                if (viewGroup3 != null) {
                    C786410Ut5.X5(marginLayoutParams, viewGroup3);
                }
            }
        }.setDuration(200L);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.LLIZLLLIL = animatorSet2;
        animatorSet2.setInterpolator(LLJIJIL);
        animatorSet2.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2, valueAnimatorOfInt, valueAnimatorOfInt2, valueAnimatorOfInt3);
        animatorSet2.start();
        this.LLJ.invoke();
        InterfaceC1374230lrh interfaceC1374230lrh = this.LLILZIL;
        if ((interfaceC1374230lrh instanceof DialogC1372820lpQ) && (dialogC1372820lpQ = (DialogC1372820lpQ) interfaceC1374230lrh) != null) {
            C1373630lqj c1373630lqj = dialogC1372820lpQ.LLJILJILJ;
            c1373630lqj.LIZ(R.id.q1v).setPadding(0, C814420VxA.LIZIZ(C12ES.LIZJ(8.0f, c1373630lqj.LIZ)), 0, 0);
        }
    }

    @Override // X.AbstractC1376810lvr
    public final void LJII(View view) {
        LIZIZ(view);
    }

    public C1376920lw2(InterfaceC1373720lqs interfaceC1373720lqs, InterfaceC1374230lrh interfaceC1374230lrh) {
        ViewGroup viewGroupLJJIIJ;
        super(interfaceC1373720lqs, interfaceC1374230lrh);
        this.LLILZ = interfaceC1373720lqs;
        this.LLILZIL = interfaceC1374230lrh;
        if (interfaceC1374230lrh != null) {
            viewGroupLJJIIJ = interfaceC1374230lrh.LJJIIJ();
        } else {
            viewGroupLJJIIJ = null;
        }
        this.LLILZLL = viewGroupLJJIIJ;
        this.LLIZ = interfaceC1374230lrh != null ? interfaceC1374230lrh.LJIJ() : null;
        this.LLJ = new AwS565S0100000_21(this, 1199);
    }
}
