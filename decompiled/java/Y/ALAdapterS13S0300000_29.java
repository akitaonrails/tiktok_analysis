package Y;

import X.AbstractViewOnTouchListenerC19382810sM;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.MotionEvent;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.search.sug.ui.comon.EcOnSearchTouchListener;
import com.ss.android.ugc.aweme.search.common.communicate.OnSearchTouchListener;

/* JADX INFO: loaded from: classes30.dex */
public class ALAdapterS13S0300000_29 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    public static final void onAnimationEnd$0(ALAdapterS13S0300000_29 aLAdapterS13S0300000_29, Animator animator) {
        super.onAnimationEnd(animator);
        ((AbstractViewOnTouchListenerC19382810sM) aLAdapterS13S0300000_29.l2).LIZIZ((MotionEvent) aLAdapterS13S0300000_29.l1, (View) aLAdapterS13S0300000_29.l0);
    }

    public static final void onAnimationEnd$1(ALAdapterS13S0300000_29 aLAdapterS13S0300000_29, Animator animator) {
        super.onAnimationEnd(animator);
        ((EcOnSearchTouchListener) aLAdapterS13S0300000_29.l2).LIZIZ((MotionEvent) aLAdapterS13S0300000_29.l1, (View) aLAdapterS13S0300000_29.l0);
    }

    public static final void onAnimationEnd$2(ALAdapterS13S0300000_29 aLAdapterS13S0300000_29, Animator animator) {
        super.onAnimationEnd(animator);
        ((OnSearchTouchListener) aLAdapterS13S0300000_29.l0).LIZIZ((MotionEvent) aLAdapterS13S0300000_29.l2, (View) aLAdapterS13S0300000_29.l1);
    }

    public ALAdapterS13S0300000_29(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l2 = obj;
        this.l0 = obj2;
        this.l1 = obj3;
    }
}
