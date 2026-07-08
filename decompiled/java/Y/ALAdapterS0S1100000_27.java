package Y;

import X.C1295960jpS;
import X.C1849960yF0;
import X.C786410Ut5;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.ss.android.ugc.aweme.tako.botpage.components.loading.TakoLoadingAssem;

/* JADX INFO: loaded from: classes28.dex */
public class ALAdapterS0S1100000_27 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        if (this.$t != 0) {
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
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.$t != 0) {
            super.onAnimationStart(animator);
        } else {
            onAnimationStart$0(this, animator);
        }
    }

    public static final void onAnimationCancel$0(ALAdapterS0S1100000_27 aLAdapterS0S1100000_27, Animator animator) {
        ((TakoLoadingAssem) aLAdapterS0S1100000_27.l1).up(aLAdapterS0S1100000_27.s0);
    }

    public static final void onAnimationEnd$0(ALAdapterS0S1100000_27 aLAdapterS0S1100000_27, Animator animator) {
        ((TakoLoadingAssem) aLAdapterS0S1100000_27.l1).up(aLAdapterS0S1100000_27.s0);
    }

    public static final void onAnimationEnd$1(ALAdapterS0S1100000_27 aLAdapterS0S1100000_27, Animator animator) {
        ((C1849960yF0) aLAdapterS0S1100000_27.l1).LLILZIL.animate().setListener(null);
        ((C1849960yF0) aLAdapterS0S1100000_27.l1).LLILZIL.setText(aLAdapterS0S1100000_27.s0);
        C1849960yF0 c1849960yF0 = (C1849960yF0) aLAdapterS0S1100000_27.l1;
        C786410Ut5.wd(c1849960yF0.LLILZIL, c1849960yF0.LIZIZ(8.0f));
        ((C1849960yF0) aLAdapterS0S1100000_27.l1).LLILZIL.animate().alpha(1.0f).translationY(0.0f).setDuration(320L).setInterpolator(C1849960yF0.LLJIJIL).start();
    }

    public static final void onAnimationStart$0(ALAdapterS0S1100000_27 aLAdapterS0S1100000_27, Animator animator) {
        C1295960jpS c1295960jpS = ((TakoLoadingAssem) aLAdapterS0S1100000_27.l1).LLJL;
        if (c1295960jpS != null) {
            C786410Ut5.LLD(4, c1295960jpS);
        }
    }

    public ALAdapterS0S1100000_27(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
