package Y;

import X.AbstractC997340c3o;
import X.C786410Ut5;
import X.C994590bzN;
import X.C997370c3r;
import X.C998110c53;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes17.dex */
public class ALAdapterS6S0300000_16 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 1:
                onAnimationEnd$0(this, animator);
                break;
            case 2:
            default:
                super.onAnimationEnd(animator);
                break;
            case 3:
                onAnimationEnd$1(this, animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationStart$0(this, animator);
                break;
            case 1:
                onAnimationStart$1(this, animator);
                break;
            case 2:
                onAnimationStart$2(this, animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public static final void onAnimationEnd$0(ALAdapterS6S0300000_16 aLAdapterS6S0300000_16, Animator animator) {
        AbstractC997340c3o abstractC997340c3o = (AbstractC997340c3o) aLAdapterS6S0300000_16.l0;
        abstractC997340c3o.getClass();
        C997370c3r.LIZ(abstractC997340c3o, 0);
    }

    public static final void onAnimationEnd$1(ALAdapterS6S0300000_16 aLAdapterS6S0300000_16, Animator animator) {
        ((ViewGroup.LayoutParams) aLAdapterS6S0300000_16.l0).height = 0;
        C786410Ut5.a6((FrameLayout) aLAdapterS6S0300000_16.l1, (ViewGroup.LayoutParams) aLAdapterS6S0300000_16.l0);
        ((Function0) aLAdapterS6S0300000_16.l2).invoke();
    }

    public static final void onAnimationStart$0(ALAdapterS6S0300000_16 aLAdapterS6S0300000_16, Animator animator) {
        AbstractC997340c3o abstractC997340c3o = (AbstractC997340c3o) aLAdapterS6S0300000_16.l0;
        int i = -((C998110c53) aLAdapterS6S0300000_16.l2).LJIIIIZZ;
        abstractC997340c3o.getClass();
        C997370c3r.LIZ(abstractC997340c3o, i);
        C997370c3r.LIZJ(abstractC997340c3o, 0);
        AbstractC997340c3o abstractC997340c3o2 = (AbstractC997340c3o) aLAdapterS6S0300000_16.l1;
        C998110c53 c998110c53 = (C998110c53) aLAdapterS6S0300000_16.l2;
        int i2 = c998110c53.LJII;
        abstractC997340c3o2.getClass();
        C997370c3r.LIZIZ(abstractC997340c3o2, i2);
        C997370c3r.LIZ(abstractC997340c3o2, -c998110c53.LJII);
        C997370c3r.LIZJ(abstractC997340c3o2, 0);
    }

    public static final void onAnimationStart$1(ALAdapterS6S0300000_16 aLAdapterS6S0300000_16, Animator animator) {
        AbstractC997340c3o abstractC997340c3o = (AbstractC997340c3o) aLAdapterS6S0300000_16.l0;
        int i = -((C998110c53) aLAdapterS6S0300000_16.l1).LJIIIIZZ;
        abstractC997340c3o.getClass();
        C997370c3r.LIZ(abstractC997340c3o, i);
        AbstractC997340c3o abstractC997340c3o2 = (AbstractC997340c3o) aLAdapterS6S0300000_16.l0;
        abstractC997340c3o2.getClass();
        C997370c3r.LIZJ(abstractC997340c3o2, 0);
        ((AbstractC997340c3o) aLAdapterS6S0300000_16.l0).LJFF("change_stage_event", new Pair<>("stageName", "showAppInfo"));
        ((AbstractC997340c3o) aLAdapterS6S0300000_16.l2).LJFF("change_stage_event", new Pair<>("stageName", "showAppInfo"));
    }

    public static final void onAnimationStart$2(ALAdapterS6S0300000_16 aLAdapterS6S0300000_16, Animator animator) {
        AbstractC997340c3o abstractC997340c3o = (AbstractC997340c3o) aLAdapterS6S0300000_16.l0;
        int i = -((C998110c53) aLAdapterS6S0300000_16.l1).LJIIIIZZ;
        abstractC997340c3o.getClass();
        C997370c3r.LIZ(abstractC997340c3o, i);
        AbstractC997340c3o abstractC997340c3o2 = (AbstractC997340c3o) aLAdapterS6S0300000_16.l0;
        abstractC997340c3o2.getClass();
        C997370c3r.LIZJ(abstractC997340c3o2, 0);
        AbstractC997340c3o abstractC997340c3o3 = (AbstractC997340c3o) aLAdapterS6S0300000_16.l2;
        C998110c53 c998110c53 = (C998110c53) aLAdapterS6S0300000_16.l1;
        int i2 = c998110c53.LJII + c998110c53.LJIIIZ;
        abstractC997340c3o3.getClass();
        C997370c3r.LIZIZ(abstractC997340c3o3, i2);
        AbstractC997340c3o abstractC997340c3o4 = (AbstractC997340c3o) aLAdapterS6S0300000_16.l2;
        C998110c53 c998110c532 = (C998110c53) aLAdapterS6S0300000_16.l1;
        int i3 = (-c998110c532.LJII) - c998110c532.LJIIIZ;
        abstractC997340c3o4.getClass();
        C997370c3r.LIZ(abstractC997340c3o4, i3);
        AbstractC997340c3o abstractC997340c3o5 = (AbstractC997340c3o) aLAdapterS6S0300000_16.l2;
        abstractC997340c3o5.getClass();
        C997370c3r.LIZJ(abstractC997340c3o5, 0);
        ((AbstractC997340c3o) aLAdapterS6S0300000_16.l0).LJFF("change_stage_event", new Pair<>("stageName", "showAppInfo"));
        ((AbstractC997340c3o) aLAdapterS6S0300000_16.l2).LJFF("change_stage_event", new Pair<>("stageName", "showAppInfo"));
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ALAdapterS6S0300000_16(X.C998110c53 r2, X.AbstractC997340c3o r3, X.AbstractC997340c3o r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            if (r5 == 0) goto Lf
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
            r0.l2 = r4
        Lb:
            r0.<init>()
            return
        Lf:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r4
            r0.l2 = r2
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ALAdapterS6S0300000_16.<init>(X.0c53, X.0c3o, X.0c3o, int):void");
    }

    public ALAdapterS6S0300000_16(ViewGroup.LayoutParams layoutParams, C994590bzN c994590bzN, Function0 function0, int i) {
        this.$t = i;
        this.l0 = layoutParams;
        this.l1 = c994590bzN;
        this.l2 = function0;
    }
}
