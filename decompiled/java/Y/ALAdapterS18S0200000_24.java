package Y;

import X.AbstractC1592930rYR;
import X.C118300cf;
import X.C1592950rYT;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import com.bytedance.tiktok.homepage.mainpagefragment.assem.MainPageBusinessAssem;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes25.dex */
public class ALAdapterS18S0200000_24 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;

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
    public final void onAnimationRepeat(Animator animator) {
        if (this.$t != 0) {
            super.onAnimationRepeat(animator);
        } else {
            onAnimationRepeat$0(this, animator);
        }
    }

    public static final void onAnimationEnd$0(ALAdapterS18S0200000_24 aLAdapterS18S0200000_24, Animator animator) {
        AbstractC1592930rYR abstractC1592930rYR = (AbstractC1592930rYR) aLAdapterS18S0200000_24.l0;
        if (!abstractC1592930rYR.LLILZLL) {
            C1592950rYT c1592950rYT = abstractC1592930rYR.LL;
            if (c1592950rYT.LLJJJ) {
                c1592950rYT.setCustomIconVisible(0);
            } else {
                c1592950rYT.setTabIconVisibility(0);
            }
        }
    }

    public static final void onAnimationEnd$1(ALAdapterS18S0200000_24 aLAdapterS18S0200000_24, Animator animator) {
        ((MainPageBusinessAssem) aLAdapterS18S0200000_24.l0).LLJJJJ.remove((ValueAnimator) aLAdapterS18S0200000_24.l1);
    }

    public static final void onAnimationEnd$2(ALAdapterS18S0200000_24 aLAdapterS18S0200000_24, Animator animator) {
        C118300cf c118300cf = (C118300cf) aLAdapterS18S0200000_24.l0;
        int i = c118300cf.element - 1;
        c118300cf.element = i;
        if (i == 0) {
            ((Function0) aLAdapterS18S0200000_24.l1).invoke();
        }
    }

    public static final void onAnimationEnd$3(ALAdapterS18S0200000_24 aLAdapterS18S0200000_24, Animator animator) {
        C118300cf c118300cf = (C118300cf) aLAdapterS18S0200000_24.l0;
        int i = c118300cf.element - 1;
        c118300cf.element = i;
        if (i == 0) {
            ((Function0) aLAdapterS18S0200000_24.l1).invoke();
        }
    }

    public static final void onAnimationRepeat$0(ALAdapterS18S0200000_24 aLAdapterS18S0200000_24, Animator animator) {
        if (!((AbstractC1592930rYR) aLAdapterS18S0200000_24.l0).LLILZLL) {
            ((ValueAnimator) aLAdapterS18S0200000_24.l1).setRepeatCount(0);
        }
    }

    public ALAdapterS18S0200000_24(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
