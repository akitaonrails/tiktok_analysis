package X;

import Y.ACListenerS130S0200000_28;
import Y.ACListenerS162S0100000_28;
import Y.ALAdapterS10S0110000_28;
import Y.ALAdapterS22S0200000_28;
import Y.AUListenerS156S0300000_28;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0zrK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public abstract class AbstractC1912160zrK implements InterfaceC1912220zrQ {
    public final View LL;
    public final View LLILLJJLI;
    public final View LLILLL;
    public final View LLILZ;
    public final View LLILZIL;
    public final C1912000zr4 LLILZLL;
    public final float LLIZ;
    public final float LLIZLLLIL;
    public final float LLJ;
    public final boolean LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;

    public abstract void LIZIZ();

    public void LIZLLL() {
        if (!this.LLJIJIL && this.LLJILJILJ) {
            C786410Ut5.LJLLLLLL(0, this.LL);
            if (this.LLJILJIL) {
                C786410Ut5.LJLLLLLL(8, this.LLILLJJLI);
                C786410Ut5.LJLLLLLL(0, this.LLILLL);
            } else {
                C786410Ut5.LJLLLLLL(0, this.LLILLJJLI);
                C786410Ut5.LJLLLLLL(8, this.LLILLL);
            }
        }
    }

    public final void LIZJ(Function0<Unit> function0) {
        if (!this.LLJIJIL && this.LLJILJILJ && this.LLJILJIL) {
            this.LLJILJIL = false;
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.addListener(new ALAdapterS22S0200000_28(this, function0, 1));
            animatorSet.playSequentially(LJ(true), LJFF(true), LJI(true));
            animatorSet.start();
        }
    }

    public final Animator LJ(boolean z) {
        ValueAnimator valueAnimatorOfFloat;
        float f;
        ObjectAnimator objectAnimatorOfFloat;
        AnimatorSet animatorSet = new AnimatorSet();
        if (z) {
            valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, -1.0f);
        } else {
            valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        }
        C817403Hg c817403Hg = new C817403Hg();
        if (z) {
            f = 0.0f;
        } else {
            f = -this.LLIZLLLIL;
        }
        c817403Hg.element = f;
        C817403Hg c817403Hg2 = new C817403Hg();
        c817403Hg2.element = this.LLIZLLLIL;
        valueAnimatorOfFloat.addListener(new ALAdapterS10S0110000_28(z, this, 0));
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS156S0300000_28(this, c817403Hg, c817403Hg2, 0));
        valueAnimatorOfFloat.setDuration(200L);
        if (z) {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LLILZ, "alpha", 1.0f, 0.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LLILZ, "alpha", 0.0f, 1.0f);
        }
        objectAnimatorOfFloat.setDuration(150L);
        if (z) {
            animatorSet.playSequentially(objectAnimatorOfFloat, valueAnimatorOfFloat);
            return animatorSet;
        }
        animatorSet.playSequentially(valueAnimatorOfFloat, objectAnimatorOfFloat);
        return animatorSet;
    }

    public final ValueAnimator LJFF(boolean z) {
        float translationX;
        ValueAnimator valueAnimatorOfFloat;
        C817403Hg c817403Hg = new C817403Hg();
        if (z) {
            translationX = -this.LLIZ;
        } else {
            translationX = this.LL.getTranslationX();
        }
        c817403Hg.element = translationX;
        C817403Hg c817403Hg2 = new C817403Hg();
        c817403Hg2.element = this.LLJ + this.LLIZ;
        if (z) {
            valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, -1.0f);
        } else {
            valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        }
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS156S0300000_28(this, c817403Hg, c817403Hg2, 1));
        valueAnimatorOfFloat.addListener(new ALAdapterS10S0110000_28(z, this, 1));
        valueAnimatorOfFloat.setDuration(300L);
        return valueAnimatorOfFloat;
    }

    public final Animator LJI(boolean z) {
        final float translationX;
        ValueAnimator valueAnimatorOfFloat;
        ObjectAnimator objectAnimatorOfFloat;
        if (z) {
            translationX = this.LLJ;
        } else {
            translationX = this.LL.getTranslationX();
        }
        if (z) {
            valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, -1.0f);
        } else {
            valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        }
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0zrM
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C786410Ut5.Jc(this.LL.LL, translationX + (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.LL.LLJ));
            }
        });
        valueAnimatorOfFloat.setDuration(150L);
        AnimatorSet animatorSet = new AnimatorSet();
        if (z) {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LLILZ, "alpha", 0.0f, 1.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LLILZ, "alpha", 1.0f, 0.0f);
        }
        objectAnimatorOfFloat.setDuration(150L);
        objectAnimatorOfFloat.addListener(new ALAdapterS10S0110000_28(z, this, 2));
        animatorSet.playTogether(objectAnimatorOfFloat, valueAnimatorOfFloat);
        return animatorSet;
    }

    public AbstractC1912160zrK(Context context, View view, View view2, View view3, View view4, View view5, C1912000zr4 c1912000zr4) {
        this.LL = view;
        this.LLILLJJLI = view2;
        this.LLILLL = view3;
        this.LLILZ = view4;
        this.LLILZIL = view5;
        this.LLILZLL = c1912000zr4;
        this.LLIZ = C12ES.LIZJ(90.0f, context);
        this.LLIZLLLIL = C12ES.LIZJ(36.0f, context);
        this.LLJ = C12ES.LIZJ(10.0f, context);
        this.LLJI = c1912000zr4.LIZ;
        view5.findViewById(R.id.dc2);
        view5.findViewById(R.id.dc0);
        C12ES.LIZJ(22.0f, context);
        Function0<Unit> function0 = c1912000zr4.LIZIZ;
        if (function0 != null) {
            C786410Ut5.I7(new ACListenerS162S0100000_28(function0, 155), view2);
            C786410Ut5.I7(new ACListenerS162S0100000_28(function0, 156), view3);
        }
        Function0<Unit> function02 = c1912000zr4.LIZJ;
        if (function02 != null) {
            C786410Ut5.I7(new ACListenerS130S0200000_28(function02, this, 55), view4);
        }
        C786410Ut5.LJLLLLLL(8, view5);
    }
}
