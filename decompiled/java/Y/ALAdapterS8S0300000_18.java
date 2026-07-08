package Y;

import X.C1182670gsj;
import X.C189200o6;
import X.C23118094a;
import X.InterfaceC20236714Gf;
import X.InterfaceC497601wk;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseActivityAssem;
import com.ss.android.ugc.aweme.search.detail.bottombar.ui.SearchDetailPoiBottomAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS136S0110000_18;
import kotlin.jvm.internal.AwS419S0200000_18;

/* JADX INFO: loaded from: classes19.dex */
public class ALAdapterS8S0300000_18 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 1:
                onAnimationCancel$0(this, animator);
                break;
            case 2:
                onAnimationCancel$1(this, animator);
                break;
            case 3:
                onAnimationCancel$2(this, animator);
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
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 2:
                onAnimationStart$0(this, animator);
                break;
            case 3:
                onAnimationStart$1(this, animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public static final void onAnimationCancel$0(ALAdapterS8S0300000_18 aLAdapterS8S0300000_18, Animator animator) {
        ((InterfaceC20236714Gf) aLAdapterS8S0300000_18.l1).LJJIIZ(null);
        ((ValueAnimator) aLAdapterS8S0300000_18.l2).removeAllUpdateListeners();
        ((ValueAnimator) aLAdapterS8S0300000_18.l2).removeListener(aLAdapterS8S0300000_18);
    }

    public static final void onAnimationCancel$1(ALAdapterS8S0300000_18 aLAdapterS8S0300000_18, Animator animator) {
        super.onAnimationCancel(animator);
        AwS419S0200000_18 awS419S0200000_18 = ((PoiCollectStatusBaseActivityAssem) aLAdapterS8S0300000_18.l0).LLJJJJLIIL;
        if (awS419S0200000_18 != null) {
            awS419S0200000_18.invoke();
        }
        ((PoiCollectStatusBaseActivityAssem) aLAdapterS8S0300000_18.l0).LLJJJJLIIL = null;
    }

    public static final void onAnimationCancel$2(ALAdapterS8S0300000_18 aLAdapterS8S0300000_18, Animator animator) {
        super.onAnimationCancel(animator);
        AwS136S0110000_18 awS136S0110000_18 = ((SearchDetailPoiBottomAssem) aLAdapterS8S0300000_18.l0).LLJJI;
        if (awS136S0110000_18 != null) {
            awS136S0110000_18.invoke();
        }
        ((SearchDetailPoiBottomAssem) aLAdapterS8S0300000_18.l0).LLJJI = null;
    }

    public static final void onAnimationEnd$0(ALAdapterS8S0300000_18 aLAdapterS8S0300000_18, Animator animator) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        super.onAnimationEnd(animator);
        ((Function0) aLAdapterS8S0300000_18.l0).invoke();
        ViewGroup.LayoutParams layoutParams = ((View) aLAdapterS8S0300000_18.l1).getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            C1182670gsj c1182670gsj = (C1182670gsj) aLAdapterS8S0300000_18.l2;
            View view = (View) aLAdapterS8S0300000_18.l1;
            marginLayoutParams.width = c1182670gsj.LIZLLL;
            int i = c1182670gsj.LJ;
            marginLayoutParams.height = i;
            marginLayoutParams.topMargin = i - view.getHeight();
        }
    }

    public static final void onAnimationEnd$1(ALAdapterS8S0300000_18 aLAdapterS8S0300000_18, Animator animator) {
        if (C23118094a.LJIIIIZZ(((InterfaceC497601wk) aLAdapterS8S0300000_18.l0).getCoroutineContext())) {
            InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) aLAdapterS8S0300000_18.l1;
            Unit unit = Unit.LIZ;
            C189200o6.m2constructorimpl(unit);
            interfaceC20236714Gf.resumeWith(unit);
        }
    }

    public static final void onAnimationEnd$2(ALAdapterS8S0300000_18 aLAdapterS8S0300000_18, Animator animator) {
        ((PoiCollectStatusBaseActivityAssem) aLAdapterS8S0300000_18.l0).LLJJL = false;
        ((AnimatorSet) aLAdapterS8S0300000_18.l1).start();
        ((Function0) aLAdapterS8S0300000_18.l2).invoke();
        AwS419S0200000_18 awS419S0200000_18 = ((PoiCollectStatusBaseActivityAssem) aLAdapterS8S0300000_18.l0).LLJJJJLIIL;
        if (awS419S0200000_18 != null) {
            awS419S0200000_18.invoke();
        }
        ((PoiCollectStatusBaseActivityAssem) aLAdapterS8S0300000_18.l0).LLJJJJLIIL = null;
    }

    public static final void onAnimationEnd$3(ALAdapterS8S0300000_18 aLAdapterS8S0300000_18, Animator animator) {
        ((SearchDetailPoiBottomAssem) aLAdapterS8S0300000_18.l0).LLJJIII = false;
        ((AnimatorSet) aLAdapterS8S0300000_18.l1).start();
        ((Function0) aLAdapterS8S0300000_18.l2).invoke();
        AwS136S0110000_18 awS136S0110000_18 = ((SearchDetailPoiBottomAssem) aLAdapterS8S0300000_18.l0).LLJJI;
        if (awS136S0110000_18 != null) {
            awS136S0110000_18.invoke();
        }
        ((SearchDetailPoiBottomAssem) aLAdapterS8S0300000_18.l0).LLJJI = null;
    }

    public static final void onAnimationStart$0(ALAdapterS8S0300000_18 aLAdapterS8S0300000_18, Animator animator) {
        ((PoiCollectStatusBaseActivityAssem) aLAdapterS8S0300000_18.l0).LLJJL = true;
    }

    public static final void onAnimationStart$1(ALAdapterS8S0300000_18 aLAdapterS8S0300000_18, Animator animator) {
        ((SearchDetailPoiBottomAssem) aLAdapterS8S0300000_18.l0).LLJJIII = true;
    }

    public ALAdapterS8S0300000_18(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj3;
        this.l1 = obj;
        this.l2 = obj2;
    }
}
