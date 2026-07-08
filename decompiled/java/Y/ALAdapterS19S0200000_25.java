package Y;

import X.AbstractViewOnLayoutChangeListenerC1657530tEd;
import X.C1602160rnK;
import X.C1645330sux;
import X.C1663510tOH;
import X.C1695930uEZ;
import X.C786410Ut5;
import X.EnumC1645310suv;
import X.InterfaceC1637600siU;
import X.InterfaceC1645340suy;
import X.ViewOnTouchListenerC1657570tEh;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import kotlin.jvm.functions.Function0;
import oyl.d0;

/* JADX INFO: loaded from: classes26.dex */
public class ALAdapterS19S0200000_25 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 5:
                onAnimationCancel$0(this, animator);
                break;
            case 6:
                onAnimationCancel$1(this, animator);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

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
        switch (this.$t) {
            case 0:
                onAnimationStart$0(this, animator);
                break;
            case 1:
                onAnimationStart$1(this, animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public static final void onAnimationCancel$0(ALAdapterS19S0200000_25 aLAdapterS19S0200000_25, Animator animator) {
        float f;
        super.onAnimationCancel(animator);
        View view = (View) aLAdapterS19S0200000_25.l0;
        if (((d0) aLAdapterS19S0200000_25.l1).LLIZ == 1) {
            f = 180.0f;
        } else {
            f = 0.0f;
        }
        C786410Ut5.Ab(view, f);
    }

    public static final void onAnimationCancel$1(ALAdapterS19S0200000_25 aLAdapterS19S0200000_25, Animator animator) {
        super.onAnimationCancel(animator);
        Function0 function0 = (Function0) aLAdapterS19S0200000_25.l0;
        if (function0 != null) {
            function0.invoke();
        }
        ((d0) aLAdapterS19S0200000_25.l1).getBatchViewStateListener().LIZJ();
    }

    public static final void onAnimationEnd$0(ALAdapterS19S0200000_25 aLAdapterS19S0200000_25, Animator animator) {
        InterfaceC1645340suy interfaceC1645340suy = ((C1645330sux) aLAdapterS19S0200000_25.l0).LIZIZ;
        if (interfaceC1645340suy != null) {
            interfaceC1645340suy.LIZIZ((EnumC1645310suv) aLAdapterS19S0200000_25.l1);
        }
        ((C1645330sux) aLAdapterS19S0200000_25.l0).LIZJ = false;
    }

    public static final void onAnimationEnd$1(ALAdapterS19S0200000_25 aLAdapterS19S0200000_25, Animator animator) {
        ((AnimatorSet) aLAdapterS19S0200000_25.l0).start();
        InterfaceC1637600siU interfaceC1637600siU = ((C1695930uEZ) aLAdapterS19S0200000_25.l1).LL;
        if (interfaceC1637600siU != null) {
            interfaceC1637600siU.onStateChange(1);
        }
    }

    public static final void onAnimationEnd$2(ALAdapterS19S0200000_25 aLAdapterS19S0200000_25, Animator animator) {
        C786410Ut5.Ob(((ViewOnTouchListenerC1657570tEh) aLAdapterS19S0200000_25.l0).LLILLL, 1.0f);
        C786410Ut5.pc(((ViewOnTouchListenerC1657570tEh) aLAdapterS19S0200000_25.l0).LLILLL, 1.0f);
        ((ViewPropertyAnimator) aLAdapterS19S0200000_25.l1).setListener(null);
    }

    public static final void onAnimationEnd$3(ALAdapterS19S0200000_25 aLAdapterS19S0200000_25, Animator animator) {
        super.onAnimationEnd(animator);
        AbstractViewOnLayoutChangeListenerC1657530tEd abstractViewOnLayoutChangeListenerC1657530tEd = (AbstractViewOnLayoutChangeListenerC1657530tEd) aLAdapterS19S0200000_25.l0;
        int visibility = abstractViewOnLayoutChangeListenerC1657530tEd.getVisibility();
        abstractViewOnLayoutChangeListenerC1657530tEd.setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, abstractViewOnLayoutChangeListenerC1657530tEd);
        ((Function0) aLAdapterS19S0200000_25.l1).invoke();
    }

    public static final void onAnimationEnd$4(ALAdapterS19S0200000_25 aLAdapterS19S0200000_25, Animator animator) {
        ViewGroup viewGroup;
        C786410Ut5.b2((C1663510tOH) aLAdapterS19S0200000_25.l0, 4);
        ViewParent parent = ((C1663510tOH) aLAdapterS19S0200000_25.l0).getParent();
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            viewGroup.setClipChildren(true);
        }
        C786410Ut5.LJLLLLLL(0, ((C1663510tOH) aLAdapterS19S0200000_25.l0).LL.LIZJ);
        ((Function0) aLAdapterS19S0200000_25.l1).invoke();
    }

    public static final void onAnimationEnd$5(ALAdapterS19S0200000_25 aLAdapterS19S0200000_25, Animator animator) {
        float f;
        super.onAnimationEnd(animator);
        View view = (View) aLAdapterS19S0200000_25.l0;
        if (((d0) aLAdapterS19S0200000_25.l1).LLIZ == 1) {
            f = 180.0f;
        } else {
            f = 0.0f;
        }
        C786410Ut5.Ab(view, f);
    }

    public static final void onAnimationEnd$6(ALAdapterS19S0200000_25 aLAdapterS19S0200000_25, Animator animator) {
        super.onAnimationEnd(animator);
        Function0 function0 = (Function0) aLAdapterS19S0200000_25.l0;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onAnimationStart$0(ALAdapterS19S0200000_25 aLAdapterS19S0200000_25, Animator animator) {
        ((C1645330sux) aLAdapterS19S0200000_25.l0).LIZJ = true;
    }

    public static final void onAnimationStart$1(ALAdapterS19S0200000_25 aLAdapterS19S0200000_25, Animator animator) {
        InterfaceC1637600siU interfaceC1637600siU = ((C1695930uEZ) aLAdapterS19S0200000_25.l1).LL;
        if (interfaceC1637600siU != null) {
            interfaceC1637600siU.onStateChange(0);
        }
    }

    public ALAdapterS19S0200000_25(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
