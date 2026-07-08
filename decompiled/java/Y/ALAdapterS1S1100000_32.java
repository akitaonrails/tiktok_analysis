package Y;

import X.AnonymousClass1862;
import X.C184R;
import X.C786410Ut5;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;

/* JADX INFO: loaded from: classes33.dex */
public class ALAdapterS1S1100000_32 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l1;
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

    public static final void onAnimationEnd$0(ALAdapterS1S1100000_32 aLAdapterS1S1100000_32, Animator animator) {
        TuxTextView tuxTextView;
        ((AnonymousClass1862) aLAdapterS1S1100000_32.l1).LJJI(aLAdapterS1S1100000_32.s0);
        TuxTextView tuxTextView2 = ((AnonymousClass1862) aLAdapterS1S1100000_32.l1).LJIIIZ;
        if (tuxTextView2 != null && tuxTextView2.getVisibility() == 0) {
            TuxTextView tuxTextView3 = ((AnonymousClass1862) aLAdapterS1S1100000_32.l1).LJIIIZ;
            if (tuxTextView3 != null) {
                C786410Ut5.B5(tuxTextView3, 0.0f);
                return;
            }
            return;
        }
        if (((AnonymousClass1862) aLAdapterS1S1100000_32.l1).LJIJI() || (tuxTextView = ((AnonymousClass1862) aLAdapterS1S1100000_32.l1).LJIIIZ) == null) {
            return;
        }
        C786410Ut5.B5(tuxTextView, 1.0f);
    }

    public static final void onAnimationEnd$1(ALAdapterS1S1100000_32 aLAdapterS1S1100000_32, Animator animator) {
        TuxTextView tuxTextView;
        ((C184R) aLAdapterS1S1100000_32.l1).LJJI(aLAdapterS1S1100000_32.s0);
        TuxTextView tuxTextView2 = ((C184R) aLAdapterS1S1100000_32.l1).LJIIL;
        if (tuxTextView2 != null && tuxTextView2.getVisibility() == 0) {
            TuxTextView tuxTextView3 = ((C184R) aLAdapterS1S1100000_32.l1).LJIIL;
            if (tuxTextView3 != null) {
                C786410Ut5.B5(tuxTextView3, 0.0f);
                return;
            }
            return;
        }
        if (((C184R) aLAdapterS1S1100000_32.l1).LJIIZILJ() || (tuxTextView = ((C184R) aLAdapterS1S1100000_32.l1).LJIIL) == null) {
            return;
        }
        C786410Ut5.B5(tuxTextView, 1.0f);
    }

    public static final void onAnimationEnd$2(ALAdapterS1S1100000_32 aLAdapterS1S1100000_32, Animator animator) {
        ((C184R) aLAdapterS1S1100000_32.l1).LJJ(aLAdapterS1S1100000_32.s0);
        TuxTextView tuxTextView = ((C184R) aLAdapterS1S1100000_32.l1).LJII;
        if (tuxTextView != null && tuxTextView.getVisibility() == 0) {
            C184R.LJIJJ(((C184R) aLAdapterS1S1100000_32.l1).LJII, 0.0f);
        } else {
            if (((C184R) aLAdapterS1S1100000_32.l1).LJIIZILJ()) {
                return;
            }
            C184R.LJIJJ(((C184R) aLAdapterS1S1100000_32.l1).LJII, 1.0f);
        }
    }

    public static final void onAnimationEnd$3(ALAdapterS1S1100000_32 aLAdapterS1S1100000_32, Animator animator) {
        ((C184R) aLAdapterS1S1100000_32.l1).LJIJJLI(aLAdapterS1S1100000_32.s0);
        TuxTextView tuxTextView = ((C184R) aLAdapterS1S1100000_32.l1).LJIIIIZZ;
        if (tuxTextView != null && tuxTextView.getVisibility() == 0) {
            C184R.LJIJJ(((C184R) aLAdapterS1S1100000_32.l1).LJIIIIZZ, 0.0f);
        } else {
            if (((C184R) aLAdapterS1S1100000_32.l1).LJIIZILJ()) {
                return;
            }
            C184R.LJIJJ(((C184R) aLAdapterS1S1100000_32.l1).LJIIIIZZ, 1.0f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ALAdapterS1S1100000_32(Object obj, AnonymousClass1862<ViewGroup> anonymousClass1862, String str) {
        this.$t = str;
        this.l1 = obj;
        this.s0 = anonymousClass1862;
    }
}
