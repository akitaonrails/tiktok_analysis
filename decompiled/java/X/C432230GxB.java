package X;

import Y.AUListenerS256S0100000_6;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.PathInterpolator;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.EasterEggShareMessageAnimatorAbility;
import com.ss.android.ugc.aweme.internalshare.impl.chatroomeasteregg.assem.EasterEggForShareAssem;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0GxB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.internalshare.impl.chatroomeasteregg.assem.EasterEggForShareAssem$showShowAgain$1$3$onCompleted$1$1$1$onPlayStart$1", f = "EasterEggForShareAssem.kt", l = {321}, m = "invokeSuspend")
public final class C432230GxB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ EasterEggForShareAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C432230GxB(EasterEggForShareAssem easterEggForShareAssem, InterfaceC1364105Vn<? super C432230GxB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = easterEggForShareAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C432230GxB(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EasterEggForShareAssem@d88a.showShowAgain$1$3$onCompleted$1$1$1$onPlayStart$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(300L, this) == objLJFF) {
                C1C7U.LIZIZ("EasterEggForShareAssem@d88a.showShowAgain$1$3$onCompleted$1$1$1$onPlayStart$1");
                return objLJFF;
            }
        }
        final EasterEggShareMessageAnimatorAbility easterEggShareMessageAnimatorAbility = (EasterEggShareMessageAnimatorAbility) this.LLILLJJLI.LLJILJIL.getValue();
        if (easterEggShareMessageAnimatorAbility != null) {
            Set<View> set = (Set) ((LinkedHashMap) easterEggShareMessageAnimatorAbility.LL).get(EnumC432220GxA.SELF);
            if (set != null) {
                for (View view : set) {
                    view.setPivotX(view.getWidth());
                    view.setPivotY(view.getHeight());
                }
            }
            Set<View> set2 = (Set) ((LinkedHashMap) easterEggShareMessageAnimatorAbility.LL).get(EnumC432220GxA.PAIR);
            if (set2 != null) {
                for (View view2 : set2) {
                    view2.setPivotX(0.0f);
                    view2.setPivotY(view2.getHeight());
                }
            }
            Set<View> set3 = (Set) ((LinkedHashMap) easterEggShareMessageAnimatorAbility.LL).get(EnumC432220GxA.INLINE);
            if (set3 != null) {
                for (View view3 : set3) {
                    view3.setPivotX(view3.getWidth() / 2.0f);
                    view3.setPivotY(view3.getHeight());
                }
            }
            AnimatorSet animatorSet = new AnimatorSet();
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.9f);
            valueAnimatorOfFloat.setInterpolator(new PathInterpolator(0.5f, 0.52f, 0.3f, 1.0f));
            valueAnimatorOfFloat.setDuration(1000L);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0Gx5
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    Float f;
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
                        float fFloatValue = f.floatValue();
                        Iterator it2 = ((LinkedHashMap) easterEggShareMessageAnimatorAbility.LL).entrySet().iterator();
                        while (it2.hasNext()) {
                            for (View view4 : (Set) ((Map.Entry) it2.next()).getValue()) {
                                C786410Ut5.Ob(view4, fFloatValue);
                                C786410Ut5.pc(view4, fFloatValue);
                            }
                        }
                    }
                }
            });
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, C418440Gaw.LIZIZ(-30));
            valueAnimatorOfFloat2.setInterpolator(new PathInterpolator(0.66f, 0.0f, 0.34f, 1.0f));
            valueAnimatorOfFloat2.setDuration(1000L);
            valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0Gx7
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    Float f;
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
                        float fFloatValue = f.floatValue();
                        Iterator it2 = ((LinkedHashMap) easterEggShareMessageAnimatorAbility.LL).entrySet().iterator();
                        while (it2.hasNext()) {
                            Iterator it3 = ((Set) ((Map.Entry) it2.next()).getValue()).iterator();
                            while (it3.hasNext()) {
                                C786410Ut5.ed((View) it3.next(), fFloatValue);
                            }
                        }
                    }
                }
            });
            animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
            AnimatorSet animatorSet2 = new AnimatorSet();
            ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.9f, 1.0f);
            valueAnimatorOfFloat3.setInterpolator(new PathInterpolator(0.5f, 0.0f, 0.39f, 1.0f));
            valueAnimatorOfFloat3.setDuration(1000L);
            valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0Gx6
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    Float f;
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
                        float fFloatValue = f.floatValue();
                        Iterator it2 = ((LinkedHashMap) easterEggShareMessageAnimatorAbility.LL).entrySet().iterator();
                        while (it2.hasNext()) {
                            for (View view4 : (Set) ((Map.Entry) it2.next()).getValue()) {
                                C786410Ut5.Ob(view4, fFloatValue);
                                C786410Ut5.pc(view4, fFloatValue);
                            }
                        }
                    }
                }
            });
            ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(C418440Gaw.LIZIZ(-30), 0.0f);
            valueAnimatorOfFloat4.setInterpolator(new PathInterpolator(0.66f, 0.0f, 0.34f, 1.0f));
            valueAnimatorOfFloat4.setDuration(1000L);
            valueAnimatorOfFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0Gx8
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    Float f;
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
                        float fFloatValue = f.floatValue();
                        Iterator it2 = ((LinkedHashMap) easterEggShareMessageAnimatorAbility.LL).entrySet().iterator();
                        while (it2.hasNext()) {
                            Iterator it3 = ((Set) ((Map.Entry) it2.next()).getValue()).iterator();
                            while (it3.hasNext()) {
                                C786410Ut5.ed((View) it3.next(), fFloatValue);
                            }
                        }
                    }
                }
            });
            animatorSet2.playTogether(valueAnimatorOfFloat3, valueAnimatorOfFloat4);
            animatorSet2.setStartDelay(1950L);
            AnimatorSet animatorSet3 = new AnimatorSet();
            ValueAnimator valueAnimatorOfFloat5 = ValueAnimator.ofFloat(0.0f, C418440Gaw.LIZIZ(2));
            valueAnimatorOfFloat5.setInterpolator(new PathInterpolator(0.42f, 0.17f, 0.58f, 0.82f));
            valueAnimatorOfFloat5.setDuration(1700L);
            valueAnimatorOfFloat5.addUpdateListener(new AUListenerS256S0100000_6(easterEggShareMessageAnimatorAbility, 145));
            ValueAnimator valueAnimatorOfFloat6 = ValueAnimator.ofFloat(C418440Gaw.LIZIZ(2), 0.0f);
            valueAnimatorOfFloat6.setInterpolator(new PathInterpolator(0.42f, 0.17f, 0.58f, 0.82f));
            valueAnimatorOfFloat6.setDuration(1500L);
            valueAnimatorOfFloat6.addUpdateListener(new AUListenerS256S0100000_6(easterEggShareMessageAnimatorAbility, 146));
            valueAnimatorOfFloat6.setStartDelay(1350L);
            animatorSet3.playTogether(valueAnimatorOfFloat5, valueAnimatorOfFloat6);
            AnimatorSet animatorSet4 = new AnimatorSet();
            AnimatorSet animatorSet5 = new AnimatorSet();
            animatorSet5.playSequentially(animatorSet, animatorSet2);
            animatorSet4.playTogether(animatorSet5, animatorSet3);
            animatorSet4.start();
            animatorSet4.addListener(new Animator.AnimatorListener() { // from class: X.0Gx9
                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    Iterator it2 = ((LinkedHashMap) easterEggShareMessageAnimatorAbility.LL).entrySet().iterator();
                    while (it2.hasNext()) {
                        for (View view4 : (Set) ((Map.Entry) it2.next()).getValue()) {
                            easterEggShareMessageAnimatorAbility.getClass();
                            EasterEggShareMessageAnimatorAbility.LIZIZ(view4);
                        }
                    }
                }
            });
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EasterEggForShareAssem@d88a.showShowAgain$1$3$onCompleted$1$1$1$onPlayStart$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
