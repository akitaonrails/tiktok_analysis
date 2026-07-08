package Y;

import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import X.C910120Zn8;
import android.animation.Animator;
import android.view.View;

/* JADX INFO: loaded from: classes5.dex */
public class AAListenerS48S0210000_4 implements Animator.AnimatorListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    public static final void onAnimationRepeat$0(AAListenerS48S0210000_4 aAListenerS48S0210000_4, Animator animator) {
    }

    public static final void onAnimationRepeat$1(AAListenerS48S0210000_4 aAListenerS48S0210000_4, Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 0:
                this.z2 = true;
                break;
            case 1:
                this.z2 = true;
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

    public static final void onAnimationEnd$0(AAListenerS48S0210000_4 aAListenerS48S0210000_4, Animator animator) {
        if (!aAListenerS48S0210000_4.z2) {
            C786410Ut5.T4((View) aAListenerS48S0210000_4.l1, 1.0f);
            C786410Ut5.LJLLLLLL(0, (View) aAListenerS48S0210000_4.l1);
        }
        aAListenerS48S0210000_4.z2 = false;
    }

    public static final void onAnimationEnd$1(AAListenerS48S0210000_4 aAListenerS48S0210000_4, Animator animator) {
        if (!aAListenerS48S0210000_4.z2) {
            ((View) aAListenerS48S0210000_4.l0).getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
            ((View) aAListenerS48S0210000_4.l0).requestLayout();
        }
        aAListenerS48S0210000_4.z2 = false;
    }

    public static final void onAnimationStart$0(AAListenerS48S0210000_4 aAListenerS48S0210000_4, Animator animator) {
        C910120Zn8 c910120Zn8 = (C910120Zn8) aAListenerS48S0210000_4.l0;
        View view = (View) aAListenerS48S0210000_4.l1;
        c910120Zn8.getClass();
        view.getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
        view.requestLayout();
        C910120Zn8 c910120Zn82 = (C910120Zn8) aAListenerS48S0210000_4.l0;
        View view2 = (View) aAListenerS48S0210000_4.l1;
        c910120Zn82.getClass();
        C786410Ut5.ed(view2, 0.0f);
    }

    public static final void onAnimationStart$1(AAListenerS48S0210000_4 aAListenerS48S0210000_4, Animator animator) {
        View view = (View) aAListenerS48S0210000_4.l0;
        ((C910120Zn8) aAListenerS48S0210000_4.l1).getClass();
        C786410Ut5.ed(view, 0.0f);
        C786410Ut5.T4(view, 1.0f);
        C786410Ut5.LJLLLLLL(0, view);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AAListenerS48S0210000_4(X.ViewOnAttachStateChangeListenerC20604515jv r2, X.C910120Zn8 r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            if (r4 == 0) goto Ld
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
        L9:
            r0.<init>()
            return
        Ld:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AAListenerS48S0210000_4.<init>(X.15jv, X.0Zn8, int):void");
    }
}
