package Y;

import X.C1580100rDk;
import X.C1AV2;
import X.C2180521AVm;
import X.C786410Ut5;
import X.InterfaceC1571310qzZ;
import android.animation.Animator;
import android.view.View;
import java.util.Iterator;

/* JADX INFO: loaded from: classes25.dex */
public class AAListenerS30S0301000_24 implements Animator.AnimatorListener {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

    public static final void onAnimationCancel$0(AAListenerS30S0301000_24 aAListenerS30S0301000_24, Animator animator) {
    }

    public static final void onAnimationCancel$1(AAListenerS30S0301000_24 aAListenerS30S0301000_24, Animator animator) {
    }

    public static final void onAnimationRepeat$0(AAListenerS30S0301000_24 aAListenerS30S0301000_24, Animator animator) {
    }

    public static final void onAnimationRepeat$1(AAListenerS30S0301000_24 aAListenerS30S0301000_24, Animator animator) {
    }

    public static final void onAnimationStart$0(AAListenerS30S0301000_24 aAListenerS30S0301000_24, Animator animator) {
    }

    public static final void onAnimationStart$1(AAListenerS30S0301000_24 aAListenerS30S0301000_24, Animator animator) {
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

    public static final void onAnimationEnd$0(AAListenerS30S0301000_24 aAListenerS30S0301000_24, Animator animator) {
        C2180521AVm.LIZLLL((View) aAListenerS30S0301000_24.l0, aAListenerS30S0301000_24.i3, (C1AV2) aAListenerS30S0301000_24.l1);
        C786410Ut5.T4((View) aAListenerS30S0301000_24.l0, 1.0f);
        Iterator<InterfaceC1571310qzZ> it2 = ((C1580100rDk) aAListenerS30S0301000_24.l2).LJIILIIL.iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ();
        }
    }

    public static final void onAnimationEnd$1(AAListenerS30S0301000_24 aAListenerS30S0301000_24, Animator animator) {
        C2180521AVm.LIZLLL((View) aAListenerS30S0301000_24.l0, aAListenerS30S0301000_24.i3, (C1AV2) aAListenerS30S0301000_24.l1);
        C786410Ut5.T4((View) aAListenerS30S0301000_24.l0, 1.0f);
        Iterator<InterfaceC1571310qzZ> it2 = ((C1580100rDk) aAListenerS30S0301000_24.l2).LJIILIIL.iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ();
        }
    }

    public AAListenerS30S0301000_24(View view, int i, C1AV2 c1av2, C1580100rDk c1580100rDk, int i2) {
        this.$t = i2;
        this.l0 = view;
        this.i3 = i;
        this.l1 = c1av2;
        this.l2 = c1580100rDk;
    }
}
