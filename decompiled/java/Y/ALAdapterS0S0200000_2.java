package Y;

import X.C05YD;
import X.C189200o6;
import X.C259800zU;
import X.C786410Ut5;
import X.InterfaceC1595030rbp;
import X.InterfaceC1595130rbz;
import X.InterfaceC20236714Gf;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.base.ui.assem.FeedSkylightBubbleAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public class ALAdapterS0S0200000_2 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        if (3 - this.$t != 0) {
            super.onAnimationCancel(animator);
        } else {
            onAnimationCancel$0(this, animator);
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
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        if (5 - this.$t != 0) {
            super.onAnimationRepeat(animator);
        } else {
            onAnimationRepeat$0(this, animator);
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

    public ALAdapterS0S0200000_2(LinearLayout linearLayout, int i) {
        this.$t = i;
        this.l0 = linearLayout;
        this.l1 = null;
    }

    public static final void onAnimationCancel$0(ALAdapterS0S0200000_2 aLAdapterS0S0200000_2, Animator animator) {
        HandlerHook.viewPost((FrameLayout) aLAdapterS0S0200000_2.l0, (Runnable) aLAdapterS0S0200000_2.l1);
    }

    public static final void onAnimationEnd$0(ALAdapterS0S0200000_2 aLAdapterS0S0200000_2, Animator animator) {
        C786410Ut5.T4((View) aLAdapterS0S0200000_2.l0, 1.0f);
        ((Function0) aLAdapterS0S0200000_2.l1).invoke();
    }

    public static final void onAnimationEnd$1(ALAdapterS0S0200000_2 aLAdapterS0S0200000_2, Animator animator) {
        LinearLayout linearLayout = (LinearLayout) aLAdapterS0S0200000_2.l0;
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        layoutParams.width = -2;
        C786410Ut5.d6(linearLayout, layoutParams);
        ((LinearLayout) aLAdapterS0S0200000_2.l0).requestLayout();
        Function0 function0 = (Function0) aLAdapterS0S0200000_2.l1;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onAnimationEnd$2(ALAdapterS0S0200000_2 aLAdapterS0S0200000_2, Animator animator) {
        InterfaceC1595030rbp interfaceC1595030rbp;
        super.onAnimationEnd(animator);
        InterfaceC1595130rbz interfaceC1595130rbzFQ2 = ((FeedSkylightBubbleAssem) aLAdapterS0S0200000_2.l0).ip().FQ2();
        if ((interfaceC1595130rbzFQ2 instanceof InterfaceC1595030rbp) && (interfaceC1595030rbp = (InterfaceC1595030rbp) interfaceC1595130rbzFQ2) != null) {
            interfaceC1595030rbp.LJIILJJIL();
        }
    }

    public static final void onAnimationEnd$3(ALAdapterS0S0200000_2 aLAdapterS0S0200000_2, Animator animator) {
        HandlerHook.viewPost((FrameLayout) aLAdapterS0S0200000_2.l0, (Runnable) aLAdapterS0S0200000_2.l1);
    }

    public static final void onAnimationEnd$4(ALAdapterS0S0200000_2 aLAdapterS0S0200000_2, Animator animator) {
        C786410Ut5.LJLLLLLL(8, (View) aLAdapterS0S0200000_2.l0);
        C786410Ut5.T4((View) aLAdapterS0S0200000_2.l0, 1.0f);
        Function0 function0 = (Function0) aLAdapterS0S0200000_2.l1;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onAnimationRepeat$0(ALAdapterS0S0200000_2 aLAdapterS0S0200000_2, Animator animator) {
        if (((Number) ((C05YD) aLAdapterS0S0200000_2.l0).getValue()).intValue() == 0) {
            animator.cancel();
            InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) aLAdapterS0S0200000_2.l1;
            Unit unit = Unit.LIZ;
            C189200o6.m2constructorimpl(unit);
            interfaceC20236714Gf.resumeWith(unit);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onAnimationStart$0(ALAdapterS0S0200000_2 aLAdapterS0S0200000_2, Animator animator) {
        super.onAnimationStart(animator);
        ((FeedSkylightBubbleAssem) aLAdapterS0S0200000_2.l0).mp((String) ((C259800zU) aLAdapterS0S0200000_2.l1).element);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ALAdapterS0S0200000_2(Object obj, View view, Function0<Unit> function0) {
        this.$t = function0;
        this.l0 = obj;
        this.l1 = view;
    }
}
