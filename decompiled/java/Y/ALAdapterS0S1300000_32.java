package Y;

import X.AnonymousClass1862;
import X.C184R;
import X.C186X;
import X.C186Y;
import X.C786410Ut5;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.DiscountTag;

/* JADX INFO: loaded from: classes33.dex */
public class ALAdapterS0S1300000_32 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
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

    public static final void onAnimationEnd$0(ALAdapterS0S1300000_32 aLAdapterS0S1300000_32, Animator animator) {
        TuxTextView tuxTextView;
        C186X c186x = (C186X) aLAdapterS0S1300000_32.l1;
        if (c186x != null) {
            ((AnonymousClass1862) aLAdapterS0S1300000_32.l2).LJIILL(c186x, (DiscountTag) aLAdapterS0S1300000_32.l3);
        }
        ((AnonymousClass1862) aLAdapterS0S1300000_32.l2).LJJ(aLAdapterS0S1300000_32.s0, (DiscountTag) aLAdapterS0S1300000_32.l3);
        TuxTextView tuxTextView2 = ((AnonymousClass1862) aLAdapterS0S1300000_32.l2).LJIIJ;
        if (tuxTextView2 != null && tuxTextView2.getVisibility() == 0) {
            TuxTextView tuxTextView3 = ((AnonymousClass1862) aLAdapterS0S1300000_32.l2).LJIIJ;
            if (tuxTextView3 != null) {
                C786410Ut5.B5(tuxTextView3, 0.0f);
                return;
            }
            return;
        }
        if (((AnonymousClass1862) aLAdapterS0S1300000_32.l2).LJIJI() || (tuxTextView = ((AnonymousClass1862) aLAdapterS0S1300000_32.l2).LJIIJ) == null) {
            return;
        }
        C786410Ut5.B5(tuxTextView, 1.0f);
    }

    public static final void onAnimationEnd$1(ALAdapterS0S1300000_32 aLAdapterS0S1300000_32, Animator animator) {
        TuxTextView tuxTextView;
        C186Y c186y = (C186Y) aLAdapterS0S1300000_32.l1;
        if (c186y != null) {
            ((C184R) aLAdapterS0S1300000_32.l2).LJIILIIL(c186y, (DiscountTag) aLAdapterS0S1300000_32.l3);
        }
        ((C184R) aLAdapterS0S1300000_32.l2).LJIL(aLAdapterS0S1300000_32.s0, (DiscountTag) aLAdapterS0S1300000_32.l3);
        TuxTextView tuxTextView2 = ((C184R) aLAdapterS0S1300000_32.l2).LJIILIIL;
        if (tuxTextView2 != null && tuxTextView2.getVisibility() == 0) {
            TuxTextView tuxTextView3 = ((C184R) aLAdapterS0S1300000_32.l2).LJIILIIL;
            if (tuxTextView3 != null) {
                C786410Ut5.B5(tuxTextView3, 0.0f);
                return;
            }
            return;
        }
        if (((C184R) aLAdapterS0S1300000_32.l2).LJIIZILJ() || (tuxTextView = ((C184R) aLAdapterS0S1300000_32.l2).LJIILIIL) == null) {
            return;
        }
        C786410Ut5.B5(tuxTextView, 1.0f);
    }

    public ALAdapterS0S1300000_32(Object obj, Object obj2, String str, Object obj3, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.s0 = str;
        this.l3 = obj3;
    }
}
