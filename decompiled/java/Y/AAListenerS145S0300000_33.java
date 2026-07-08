package Y;

import X.C19QG;
import X.C19QH;
import X.C500260Jjc;
import X.C786410Ut5;
import android.animation.Animator;
import android.view.View;

/* JADX INFO: loaded from: classes34.dex */
public class AAListenerS145S0300000_33 implements Animator.AnimatorListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    public static final void onAnimationCancel$0(AAListenerS145S0300000_33 aAListenerS145S0300000_33, Animator animator) {
    }

    public static final void onAnimationCancel$1(AAListenerS145S0300000_33 aAListenerS145S0300000_33, Animator animator) {
    }

    public static final void onAnimationEnd$1(AAListenerS145S0300000_33 aAListenerS145S0300000_33, Animator animator) {
    }

    public static final void onAnimationRepeat$0(AAListenerS145S0300000_33 aAListenerS145S0300000_33, Animator animator) {
    }

    public static final void onAnimationRepeat$1(AAListenerS145S0300000_33 aAListenerS145S0300000_33, Animator animator) {
    }

    public static final void onAnimationStart$0(AAListenerS145S0300000_33 aAListenerS145S0300000_33, Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationCancel$0(this, animator);
                break;
            case 1:
                onAnimationCancel$1(this, animator);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animator);
                break;
            case 1:
                onAnimationEnd$1(this, animator);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationRepeat$0(this, animator);
                break;
            case 1:
                onAnimationRepeat$1(this, animator);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationStart$0(this, animator);
                break;
            case 1:
                onAnimationStart$1(this, animator);
                break;
        }
    }

    public static final void onAnimationEnd$0(AAListenerS145S0300000_33 aAListenerS145S0300000_33, Animator animator) {
        C19QH.LJ((View) aAListenerS145S0300000_33.l0, (C19QG) aAListenerS145S0300000_33.l2, (C19QH) aAListenerS145S0300000_33.l1);
    }

    public static final void onAnimationStart$1(AAListenerS145S0300000_33 aAListenerS145S0300000_33, Animator animator) {
        View view = (View) aAListenerS145S0300000_33.l0;
        C19QG c19qg = (C19QG) aAListenerS145S0300000_33.l1;
        C19QH c19qh = (C19QH) aAListenerS145S0300000_33.l2;
        C786410Ut5.Jc(view, 0.0f);
        C786410Ut5.ed(view, 0.0f);
        C786410Ut5.Jc(c19qg.LIZ, 0.0f);
        C786410Ut5.ed(c19qg.LIZ, c19qh.getHeight());
        C500260Jjc.LLFFF(c19qg.LIZ);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AAListenerS145S0300000_33(android.view.View r2, X.C19QG r3, X.C19QH r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            if (r5 == 0) goto Lf
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
            r0.l2 = r4
        Lb:
            r0.<init>()
            return
        Lf:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r4
            r0.l2 = r3
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AAListenerS145S0300000_33.<init>(android.view.View, X.19QG, X.19QH, int):void");
    }
}
