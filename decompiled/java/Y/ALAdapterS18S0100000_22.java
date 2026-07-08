package Y;

import X.C1414130mu3;
import X.C1425660nCe;
import X.C1425670nCf;
import X.C1450510nqj;
import X.C1453190nv3;
import X.C1453390nvN;
import X.C337180DJs;
import X.InterfaceC1428100nGa;
import X.InterfaceC1453510nvZ;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public class ALAdapterS18S0100000_22 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
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
            case 4:
                onAnimationEnd$4(this, animator);
                break;
            case 5:
                onAnimationEnd$5(this, animator);
                break;
            case 6:
                onAnimationEnd$6(this, animator);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (2 - this.$t != 0) {
            super.onAnimationStart(animator);
        } else {
            onAnimationStart$0(this, animator);
        }
    }

    public ALAdapterS18S0100000_22(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationEnd$0(ALAdapterS18S0100000_22 aLAdapterS18S0100000_22, Animator animator) {
        View view;
        View view2;
        C1425660nCe c1425660nCe = (C1425660nCe) aLAdapterS18S0100000_22.l0;
        if (c1425660nCe.LLJJL) {
            C1425670nCf c1425670nCf = c1425660nCe.LLJJIII;
            if (c1425670nCf != null && (view2 = c1425670nCf.LLJJJIL) != null) {
                view2.setClickable(false);
            }
            C1425670nCf c1425670nCf2 = ((C1425660nCe) aLAdapterS18S0100000_22.l0).LLJJIII;
            if (c1425670nCf2 != null && (view = c1425670nCf2.LLJJJJ) != null) {
                view.setClickable(false);
            }
        }
        ((C1425660nCe) aLAdapterS18S0100000_22.l0).LLJJJJJIL = null;
    }

    public static final void onAnimationEnd$1(ALAdapterS18S0100000_22 aLAdapterS18S0100000_22, Animator animator) {
        Function0<Unit> function0;
        C1453190nv3 c1453190nv3 = (C1453190nv3) aLAdapterS18S0100000_22.l0;
        if (c1453190nv3 != null && (function0 = c1453190nv3.LIZIZ) != null) {
            function0.invoke();
        }
    }

    public static final void onAnimationEnd$2(ALAdapterS18S0100000_22 aLAdapterS18S0100000_22, Animator animator) {
        super.onAnimationEnd(animator);
        ((C1450510nqj) aLAdapterS18S0100000_22.l0).LJ.onEnd();
    }

    public static final void onAnimationEnd$3(ALAdapterS18S0100000_22 aLAdapterS18S0100000_22, Animator animator) {
        ((InterfaceC1428100nGa) aLAdapterS18S0100000_22.l0).onEnd();
    }

    public static final void onAnimationEnd$4(ALAdapterS18S0100000_22 aLAdapterS18S0100000_22, Animator animator) {
        ((InterfaceC1428100nGa) aLAdapterS18S0100000_22.l0).onEnd();
    }

    public static final void onAnimationEnd$5(ALAdapterS18S0100000_22 aLAdapterS18S0100000_22, Animator animator) {
        super.onAnimationEnd(animator);
        InterfaceC1453510nvZ interfaceC1453510nvZ = ((C1453390nvN) aLAdapterS18S0100000_22.l0).LJ;
        if (interfaceC1453510nvZ != null) {
            interfaceC1453510nvZ.LJ();
        }
    }

    public static final void onAnimationEnd$6(ALAdapterS18S0100000_22 aLAdapterS18S0100000_22, Animator animator) {
        C337180DJs.LIZJ(((C1414130mu3) aLAdapterS18S0100000_22.l0).LLJZIJLIL);
    }

    public static final void onAnimationStart$0(ALAdapterS18S0100000_22 aLAdapterS18S0100000_22, Animator animator) {
        super.onAnimationStart(animator);
        ((C1450510nqj) aLAdapterS18S0100000_22.l0).LJ.onStart();
    }
}
