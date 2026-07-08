package X;

import Y.ALAdapterS4S0210000_24;
import Y.AUListenerS15S0100001_24;
import Y.AUListenerS272S0100000_24;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: renamed from: X.0rDe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1580040rDe extends C09AY implements Function1<Float, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ Float LLILLL;
    public final /* synthetic */ View LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ C1579960rDW LLILZLL;
    public final /* synthetic */ C1578910rBp LLIZ;
    public final /* synthetic */ C19RF LLIZLLLIL;
    public final /* synthetic */ ViewGroup LLJ;
    public final /* synthetic */ Function0<Unit> LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1580040rDe(boolean z, boolean z2, Float f, View view, boolean z3, C1579960rDW c1579960rDW, C1578910rBp c1578910rBp, C19RF c19rf, ViewGroup viewGroup, AwS568S0100000_24 awS568S0100000_24) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = z2;
        this.LLILLL = f;
        this.LLILZ = view;
        this.LLILZIL = z3;
        this.LLILZLL = c1579960rDW;
        this.LLIZ = c1578910rBp;
        this.LLIZLLLIL = c19rf;
        this.LLJ = viewGroup;
        this.LLJI = awS568S0100000_24;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Float f) {
        float f2;
        float f3;
        float f4;
        Pair pair;
        float fFloatValue;
        float f5;
        float fFloatValue2 = f.floatValue();
        boolean z = this.LL;
        float f6 = 0.0f;
        Float fValueOf = Float.valueOf(0.0f);
        if (z) {
            f2 = 0.0f;
        } else {
            f2 = fFloatValue2;
        }
        Float fValueOf2 = Float.valueOf(f2);
        if (this.LL) {
            f3 = fFloatValue2;
        } else {
            f3 = 0.0f;
        }
        Pair pair2 = new Pair(fValueOf2, Float.valueOf(f3));
        float fLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
        if (this.LL) {
            f4 = 0.0f;
        } else {
            f4 = fLIZIZ;
        }
        Float fValueOf3 = Float.valueOf(f4);
        if (!this.LL) {
            fLIZIZ = 0.0f;
        }
        Pair pair3 = new Pair(fValueOf3, Float.valueOf(fLIZIZ));
        if (this.LLILLJJLI) {
            Float f7 = this.LLILLL;
            if (f7 != null) {
                fFloatValue = f7.floatValue();
            } else {
                fFloatValue = -C497820Jfg.LIZJ(this.LLILZ.getContext());
            }
            if (this.LL) {
                f5 = 0.0f;
            } else {
                f5 = fFloatValue;
            }
            Float fValueOf4 = Float.valueOf(f5);
            if (this.LL) {
                f6 = fFloatValue;
            }
            pair = new Pair(fValueOf4, Float.valueOf(f6));
        } else {
            pair = new Pair(fValueOf, fValueOf);
        }
        if (this.LLILZIL) {
            AnimatorSet animatorSet = this.LLILZLL.LIZIZ;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            C1579960rDW c1579960rDW = this.LLILZLL;
            AnimatorSet animatorSet2 = new AnimatorSet();
            C1578910rBp c1578910rBp = this.LLIZ;
            View view = this.LLILZ;
            C1579960rDW c1579960rDW2 = this.LLILZLL;
            C19RF c19rf = this.LLIZLLLIL;
            boolean z2 = this.LL;
            ViewGroup viewGroup = this.LLJ;
            Function0<Unit> function0 = this.LLJI;
            animatorSet2.setInterpolator(new DecelerateInterpolator());
            animatorSet2.setDuration(300L);
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c1578910rBp, "translationY", ((Number) pair2.getFirst()).floatValue(), ((Number) pair2.getSecond()).floatValue());
            objectAnimatorOfFloat.addUpdateListener(new AUListenerS15S0100001_24(c1579960rDW2, fFloatValue2, 0));
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(((Number) pair3.getFirst()).floatValue(), ((Number) pair3.getSecond()).floatValue());
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS272S0100000_24(c19rf, 0));
            animatorSet2.playTogether(objectAnimatorOfFloat, valueAnimatorOfFloat, ObjectAnimator.ofFloat(view, "translationY", ((Number) pair.getFirst()).floatValue(), ((Number) pair.getSecond()).floatValue()));
            animatorSet2.addListener(new ALAdapterS4S0210000_24(viewGroup, z2, function0, 0));
            animatorSet2.start();
            c1579960rDW.LIZIZ = animatorSet2;
        } else {
            C1578910rBp c1578910rBp2 = this.LLIZ;
            float fFloatValue3 = ((Number) pair2.getSecond()).floatValue();
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1578910rBp2);
            c1578910rBp2.setTranslationY(fFloatValue3);
            this.LLIZLLLIL.setRadius(((Number) pair3.getSecond()).floatValue());
            C786410Ut5.ed(this.LLILZ, ((Number) pair.getSecond()).floatValue());
            if (!this.LL) {
                C718540SGm.LIZ(this.LLJ);
            }
            this.LLJI.invoke();
        }
        return Unit.LIZ;
    }
}
