package Y;

import X.AnonymousClass1853;
import X.C212219183d;
import X.C212359188n;
import X.C212360188o;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO;

/* JADX INFO: loaded from: classes33.dex */
public class ALAdapterS2S0201000_32 extends AnimatorListenerAdapter {
    public final int $t;
    public int i2;
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

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        switch (this.$t) {
            case 0:
                onAnimationStart$0(this, animator, z);
                break;
            case 1:
            default:
                super.onAnimationStart(animator, z);
                break;
            case 2:
                onAnimationStart$1(this, animator, z);
                break;
            case 3:
                onAnimationStart$2(this, animator, z);
                break;
        }
    }

    public static final void onAnimationEnd$0(ALAdapterS2S0201000_32 aLAdapterS2S0201000_32, Animator animator) {
        int i;
        super.onAnimationEnd(animator);
        Integer num = (Integer) aLAdapterS2S0201000_32.l1;
        if (num != null && num.intValue() == 1 && aLAdapterS2S0201000_32.i2 == 2) {
            UsPopupCardVO usPopupCardVO = ((C212219183d) aLAdapterS2S0201000_32.l0).LLIZ;
            if (usPopupCardVO != null) {
                usPopupCardVO.setPopupCardStatus(2);
                usPopupCardVO.setProductStatus(90);
            }
            C212219183d c212219183d = (C212219183d) aLAdapterS2S0201000_32.l0;
            if (c212219183d.LLLIILIL) {
                i = 4;
            } else {
                i = 0;
            }
            c212219183d.S0(false, Integer.valueOf(i), false);
        }
    }

    public static final void onAnimationEnd$1(ALAdapterS2S0201000_32 aLAdapterS2S0201000_32, Animator animator) {
        ((C212360188o) aLAdapterS2S0201000_32.l0).LJII(1.0f);
        C212359188n c212359188n = (C212359188n) aLAdapterS2S0201000_32.l1;
        HandlerHook.viewPost(c212359188n, new ARunnableS36S0201000_32((C212360188o) aLAdapterS2S0201000_32.l0, aLAdapterS2S0201000_32.i2, c212359188n, 4));
    }

    public static final void onAnimationEnd$2(ALAdapterS2S0201000_32 aLAdapterS2S0201000_32, Animator animator) {
        int i;
        super.onAnimationEnd(animator);
        Integer num = (Integer) aLAdapterS2S0201000_32.l1;
        if (num != null && num.intValue() == 1 && aLAdapterS2S0201000_32.i2 == 2) {
            PopupCardVO popupCardVO = ((AnonymousClass1853) aLAdapterS2S0201000_32.l0).LLIZLLLIL;
            if (popupCardVO != null) {
                popupCardVO.setPopupCardStatus(2);
                popupCardVO.setProductStatus(90);
            }
            AnonymousClass1853 anonymousClass1853 = (AnonymousClass1853) aLAdapterS2S0201000_32.l0;
            if (anonymousClass1853.LLLLIIL) {
                i = 4;
            } else {
                i = 0;
            }
            AnonymousClass1853.c1(anonymousClass1853, false, false, Integer.valueOf(i), 8);
        }
    }

    public static final void onAnimationEnd$3(ALAdapterS2S0201000_32 aLAdapterS2S0201000_32, Animator animator) {
        int i;
        super.onAnimationEnd(animator);
        Integer num = (Integer) aLAdapterS2S0201000_32.l1;
        if (num != null && num.intValue() == 1 && aLAdapterS2S0201000_32.i2 == 2) {
            PopupCardVO popupCardVO = ((AnonymousClass1853) aLAdapterS2S0201000_32.l0).LLIZLLLIL;
            if (popupCardVO != null) {
                popupCardVO.setPopupCardStatus(2);
                popupCardVO.setProductStatus(90);
            }
            AnonymousClass1853 anonymousClass1853 = (AnonymousClass1853) aLAdapterS2S0201000_32.l0;
            if (anonymousClass1853.LLLLIIL) {
                i = 4;
            } else {
                i = 0;
            }
            AnonymousClass1853.c1(anonymousClass1853, false, false, Integer.valueOf(i), 8);
        }
    }

    public static final void onAnimationStart$0(ALAdapterS2S0201000_32 aLAdapterS2S0201000_32, Animator animator, boolean z) {
        ((C212219183d) aLAdapterS2S0201000_32.l0).LLJLLIL.LJIIL(1);
    }

    public static final void onAnimationStart$1(ALAdapterS2S0201000_32 aLAdapterS2S0201000_32, Animator animator, boolean z) {
        ((AnonymousClass1853) aLAdapterS2S0201000_32.l0).LLLFF.LJIIJJI(1);
    }

    public static final void onAnimationStart$2(ALAdapterS2S0201000_32 aLAdapterS2S0201000_32, Animator animator, boolean z) {
        ((AnonymousClass1853) aLAdapterS2S0201000_32.l0).LLLFF.LJIIJJI(1);
    }

    public ALAdapterS2S0201000_32(Object obj, Object obj2, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.l1 = obj2;
        this.i2 = i;
    }
}
