package Y;

import X.AnonymousClass1853;
import X.C212219183d;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO;

/* JADX INFO: loaded from: classes33.dex */
public class ALAdapterS1S1200000_32 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

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

    public static final void onAnimationEnd$0(ALAdapterS1S1200000_32 aLAdapterS1S1200000_32, Animator animator) {
        ((C212219183d) aLAdapterS1S1200000_32.l1).E0((UsPopupCardVO) aLAdapterS1S1200000_32.l2, aLAdapterS1S1200000_32.s0);
    }

    public static final void onAnimationEnd$1(ALAdapterS1S1200000_32 aLAdapterS1S1200000_32, Animator animator) {
        ((AnonymousClass1853) aLAdapterS1S1200000_32.l1).M0((PopupCardVO) aLAdapterS1S1200000_32.l2, aLAdapterS1S1200000_32.s0);
    }

    public ALAdapterS1S1200000_32(Object obj, Object obj2, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.s0 = str;
    }
}
