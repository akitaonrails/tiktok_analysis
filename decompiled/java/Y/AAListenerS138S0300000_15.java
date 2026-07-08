package Y;

import X.C013C;
import X.C12ES;
import X.C439101nJ;
import X.C786410Ut5;
import X.C925050aBD;
import X.C925150aBN;
import X.C951350ard;
import X.C951390arh;
import X.EnumC1102750enp;
import android.animation.Animator;
import android.view.View;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: loaded from: classes16.dex */
public class AAListenerS138S0300000_15 implements Animator.AnimatorListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    public static final void onAnimationCancel$2(AAListenerS138S0300000_15 aAListenerS138S0300000_15, Animator animator) {
    }

    public static final void onAnimationEnd$0(AAListenerS138S0300000_15 aAListenerS138S0300000_15, Animator animator) {
    }

    public static final void onAnimationEnd$1(AAListenerS138S0300000_15 aAListenerS138S0300000_15, Animator animator) {
    }

    public static final void onAnimationRepeat$0(AAListenerS138S0300000_15 aAListenerS138S0300000_15, Animator animator) {
    }

    public static final void onAnimationRepeat$1(AAListenerS138S0300000_15 aAListenerS138S0300000_15, Animator animator) {
    }

    public static final void onAnimationRepeat$2(AAListenerS138S0300000_15 aAListenerS138S0300000_15, Animator animator) {
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
        }
    }

    public static final void onAnimationCancel$0(AAListenerS138S0300000_15 aAListenerS138S0300000_15, Animator animator) {
        C786410Ut5.T4((View) aAListenerS138S0300000_15.l2, 1.0f);
        C951350ard c951350ard = (C951350ard) aAListenerS138S0300000_15.l0;
        EnumC1102750enp enumC1102750enp = (EnumC1102750enp) aAListenerS138S0300000_15.l1;
        c951350ard.getClass();
        if (enumC1102750enp == EnumC1102750enp.MULTIGUEST) {
            DataChannel dataChannel = c951350ard.LIZ;
            if (C925050aBD.LJIIJ()) {
                C925050aBD.LJII(dataChannel);
                return;
            } else {
                C925050aBD.LIZLLL(dataChannel);
                return;
            }
        }
        enumC1102750enp.show(c951350ard.LIZ);
    }

    public static final void onAnimationCancel$1(AAListenerS138S0300000_15 aAListenerS138S0300000_15, Animator animator) {
        C786410Ut5.T4((View) aAListenerS138S0300000_15.l2, 1.0f);
        C951390arh c951390arh = (C951390arh) aAListenerS138S0300000_15.l0;
        EnumC1102750enp enumC1102750enp = (EnumC1102750enp) aAListenerS138S0300000_15.l1;
        c951390arh.getClass();
        if (enumC1102750enp == EnumC1102750enp.MULTIGUEST) {
            C925150aBN.LJII(c951390arh.LIZ);
        } else {
            enumC1102750enp.show(c951390arh.LIZ);
        }
    }

    public static final void onAnimationEnd$2(AAListenerS138S0300000_15 aAListenerS138S0300000_15, Animator animator) {
        C439101nJ.LJI((View) aAListenerS138S0300000_15.l2);
        if (((C013C) aAListenerS138S0300000_15.l0).element) {
            C12ES.LJIILL(0, (View) aAListenerS138S0300000_15.l1);
        }
        C786410Ut5.T4((View) aAListenerS138S0300000_15.l1, 1.0f);
    }

    public static final void onAnimationStart$0(AAListenerS138S0300000_15 aAListenerS138S0300000_15, Animator animator) {
        C951350ard c951350ard = (C951350ard) aAListenerS138S0300000_15.l0;
        EnumC1102750enp enumC1102750enp = (EnumC1102750enp) aAListenerS138S0300000_15.l1;
        c951350ard.getClass();
        if (enumC1102750enp == EnumC1102750enp.MULTIGUEST) {
            DataChannel dataChannel = c951350ard.LIZ;
            if (C925050aBD.LJIIJ()) {
                C925050aBD.LJII(dataChannel);
            } else {
                C925050aBD.LIZLLL(dataChannel);
            }
        } else {
            enumC1102750enp.show(c951350ard.LIZ);
        }
        C786410Ut5.T4((View) aAListenerS138S0300000_15.l2, 0.0f);
    }

    public static final void onAnimationStart$1(AAListenerS138S0300000_15 aAListenerS138S0300000_15, Animator animator) {
        C951390arh c951390arh = (C951390arh) aAListenerS138S0300000_15.l0;
        EnumC1102750enp enumC1102750enp = (EnumC1102750enp) aAListenerS138S0300000_15.l1;
        c951390arh.getClass();
        if (enumC1102750enp == EnumC1102750enp.MULTIGUEST) {
            C925150aBN.LJII(c951390arh.LIZ);
        } else {
            enumC1102750enp.show(c951390arh.LIZ);
        }
        C786410Ut5.T4((View) aAListenerS138S0300000_15.l2, 0.0f);
    }

    public static final void onAnimationStart$2(AAListenerS138S0300000_15 aAListenerS138S0300000_15, Animator animator) {
        if (((C013C) aAListenerS138S0300000_15.l0).element) {
            C439101nJ.LJI((View) aAListenerS138S0300000_15.l1);
        }
    }

    public AAListenerS138S0300000_15(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
