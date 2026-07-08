package Y;

import X.C786410Ut5;
import android.animation.Animator;
import android.view.View;

/* JADX INFO: loaded from: classes15.dex */
public class AAListenerS65S0110000_14 implements Animator.AnimatorListener {
    public final int $t;
    public Object l0;
    public boolean z1;

    public static final void onAnimationCancel$0(AAListenerS65S0110000_14 aAListenerS65S0110000_14, Animator animator) {
    }

    public static final void onAnimationCancel$1(AAListenerS65S0110000_14 aAListenerS65S0110000_14, Animator animator) {
    }

    public static final void onAnimationCancel$2(AAListenerS65S0110000_14 aAListenerS65S0110000_14, Animator animator) {
    }

    public static final void onAnimationCancel$3(AAListenerS65S0110000_14 aAListenerS65S0110000_14, Animator animator) {
    }

    public static final void onAnimationEnd$1(AAListenerS65S0110000_14 aAListenerS65S0110000_14, Animator animator) {
    }

    public static final void onAnimationEnd$3(AAListenerS65S0110000_14 aAListenerS65S0110000_14, Animator animator) {
    }

    public static final void onAnimationRepeat$0(AAListenerS65S0110000_14 aAListenerS65S0110000_14, Animator animator) {
    }

    public static final void onAnimationRepeat$1(AAListenerS65S0110000_14 aAListenerS65S0110000_14, Animator animator) {
    }

    public static final void onAnimationRepeat$2(AAListenerS65S0110000_14 aAListenerS65S0110000_14, Animator animator) {
    }

    public static final void onAnimationRepeat$3(AAListenerS65S0110000_14 aAListenerS65S0110000_14, Animator animator) {
    }

    public static final void onAnimationStart$0(AAListenerS65S0110000_14 aAListenerS65S0110000_14, Animator animator) {
    }

    public static final void onAnimationStart$2(AAListenerS65S0110000_14 aAListenerS65S0110000_14, Animator animator) {
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
            case 2:
                onAnimationCancel$2(this, animator);
                break;
            case 3:
                onAnimationCancel$3(this, animator);
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
            case 2:
                onAnimationEnd$2(this, animator);
                break;
            case 3:
                onAnimationEnd$3(this, animator);
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
            case 2:
                onAnimationRepeat$2(this, animator);
                break;
            case 3:
                onAnimationRepeat$3(this, animator);
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
            case 2:
                onAnimationStart$2(this, animator);
                break;
            case 3:
                onAnimationStart$3(this, animator);
                break;
        }
    }

    public static final void onAnimationEnd$0(AAListenerS65S0110000_14 aAListenerS65S0110000_14, Animator animator) {
        if (!aAListenerS65S0110000_14.z1) {
            C786410Ut5.LJLLLLLL(8, (View) aAListenerS65S0110000_14.l0);
        }
    }

    public static final void onAnimationEnd$2(AAListenerS65S0110000_14 aAListenerS65S0110000_14, Animator animator) {
        if (!aAListenerS65S0110000_14.z1) {
            C786410Ut5.LJLLLLLL(8, (View) aAListenerS65S0110000_14.l0);
        }
    }

    public static final void onAnimationStart$1(AAListenerS65S0110000_14 aAListenerS65S0110000_14, Animator animator) {
        float f;
        C786410Ut5.LJLLLLLL(0, (View) aAListenerS65S0110000_14.l0);
        View view = (View) aAListenerS65S0110000_14.l0;
        if (aAListenerS65S0110000_14.z1) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        C786410Ut5.T4(view, f);
    }

    public static final void onAnimationStart$3(AAListenerS65S0110000_14 aAListenerS65S0110000_14, Animator animator) {
        float f;
        C786410Ut5.LJLLLLLL(0, (View) aAListenerS65S0110000_14.l0);
        View view = (View) aAListenerS65S0110000_14.l0;
        if (aAListenerS65S0110000_14.z1) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        C786410Ut5.T4(view, f);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AAListenerS65S0110000_14(android.view.View r2, boolean r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            switch(r4) {
                case 0: goto Le;
                case 1: goto L5;
                case 2: goto Le;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r2
            r0.z1 = r3
        La:
            r0.<init>()
            return
        Le:
            r0 = r1
            r0.z1 = r3
            r0.l0 = r2
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AAListenerS65S0110000_14.<init>(android.view.View, boolean, int):void");
    }
}
