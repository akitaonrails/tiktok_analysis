package Y;

import X.C0PRV;
import X.C786410Ut5;
import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.bytedance.tux.widget.RadiusLayout;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardLivePlayerAssem;
import com.ss.android.ugc.aweme.search.pages.sevensplitscreen.assem.SearchSevenSplitScreenBehaviorAssem;

/* JADX INFO: loaded from: classes11.dex */
public class AAListenerS321S0100000_10 implements Animator.AnimatorListener {
    public final int $t;
    public Object l0;

    public static final void onAnimationCancel$0(AAListenerS321S0100000_10 aAListenerS321S0100000_10, Animator animator) {
    }

    public static final void onAnimationCancel$4(AAListenerS321S0100000_10 aAListenerS321S0100000_10, Animator animator) {
    }

    public static final void onAnimationCancel$6(AAListenerS321S0100000_10 aAListenerS321S0100000_10, Animator animator) {
    }

    public static final void onAnimationEnd$3(AAListenerS321S0100000_10 aAListenerS321S0100000_10, Animator animator) {
    }

    public static final void onAnimationEnd$5(AAListenerS321S0100000_10 aAListenerS321S0100000_10, Animator animator) {
    }

    public static final void onAnimationRepeat$0(AAListenerS321S0100000_10 aAListenerS321S0100000_10, Animator animator) {
    }

    public static final void onAnimationRepeat$1(AAListenerS321S0100000_10 aAListenerS321S0100000_10, Animator animator) {
    }

    public static final void onAnimationRepeat$2(AAListenerS321S0100000_10 aAListenerS321S0100000_10, Animator animator) {
    }

    public static final void onAnimationRepeat$3(AAListenerS321S0100000_10 aAListenerS321S0100000_10, Animator animator) {
    }

    public static final void onAnimationRepeat$4(AAListenerS321S0100000_10 aAListenerS321S0100000_10, Animator animator) {
    }

    public static final void onAnimationRepeat$5(AAListenerS321S0100000_10 aAListenerS321S0100000_10, Animator animator) {
    }

    public static final void onAnimationRepeat$6(AAListenerS321S0100000_10 aAListenerS321S0100000_10, Animator animator) {
    }

    public static final void onAnimationStart$0(AAListenerS321S0100000_10 aAListenerS321S0100000_10, Animator animator) {
    }

    public static final void onAnimationStart$3(AAListenerS321S0100000_10 aAListenerS321S0100000_10, Animator animator) {
    }

    public static final void onAnimationStart$4(AAListenerS321S0100000_10 aAListenerS321S0100000_10, Animator animator) {
    }

    public static final void onAnimationStart$5(AAListenerS321S0100000_10 aAListenerS321S0100000_10, Animator animator) {
    }

    public static final void onAnimationStart$6(AAListenerS321S0100000_10 aAListenerS321S0100000_10, Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationCancel$0(this, animator);
                break;
            case 1:
                onAnimationCancel$1(this, animator);
                break;
            case 2:
                onAnimationCancel$2(this, animator);
                break;
            case 3:
                onAnimationCancel$3(this, animator);
                break;
            case 4:
                onAnimationCancel$4(this, animator);
                break;
            case 5:
                onAnimationCancel$5(this, animator);
                break;
            case 6:
                onAnimationCancel$6(this, animator);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
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
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationRepeat$0(this, animator);
                break;
            case 1:
                onAnimationRepeat$1(this, animator);
                break;
            case 2:
                onAnimationRepeat$2(this, animator);
                break;
            case 3:
                onAnimationRepeat$3(this, animator);
                break;
            case 4:
                onAnimationRepeat$4(this, animator);
                break;
            case 5:
                onAnimationRepeat$5(this, animator);
                break;
            case 6:
                onAnimationRepeat$6(this, animator);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationStart$0(this, animator);
                break;
            case 1:
                onAnimationStart$1(this, animator);
                break;
            case 2:
                onAnimationStart$2(this, animator);
                break;
            case 3:
                onAnimationStart$3(this, animator);
                break;
            case 4:
                onAnimationStart$4(this, animator);
                break;
            case 5:
                onAnimationStart$5(this, animator);
                break;
            case 6:
                onAnimationStart$6(this, animator);
                break;
        }
    }

    public AAListenerS321S0100000_10(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationCancel$1(AAListenerS321S0100000_10 aAListenerS321S0100000_10, Animator animator) {
        ((C0PRV) aAListenerS321S0100000_10.l0).LLILZ = false;
    }

    public static final void onAnimationCancel$2(AAListenerS321S0100000_10 aAListenerS321S0100000_10, Animator animator) {
        View header = ((C0PRV) aAListenerS321S0100000_10.l0).getHeader();
        if (header != null) {
            C786410Ut5.LJLLLLLL(8, header);
        }
        C0PRV c0prv = (C0PRV) aAListenerS321S0100000_10.l0;
        c0prv.LLILZ = false;
        View header2 = c0prv.getHeader();
        if (header2 != null) {
            ViewGroup.LayoutParams layoutParams = header2.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = -2;
                C786410Ut5.W5(header2, layoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        ((C0PRV) aAListenerS321S0100000_10.l0).LIZLLL(0.0f);
    }

    public static final void onAnimationCancel$3(AAListenerS321S0100000_10 aAListenerS321S0100000_10, Animator animator) {
        RadiusLayout radiusLayoutHo = ((SearchSevenSplitScreenBehaviorAssem) aAListenerS321S0100000_10.l0).Ho();
        if (radiusLayoutHo != null) {
            C786410Ut5.LLZZ(radiusLayoutHo, 8);
        }
    }

    public static final void onAnimationCancel$5(AAListenerS321S0100000_10 aAListenerS321S0100000_10, Animator animator) {
        RadiusLayout radiusLayoutHo = ((SearchSevenSplitScreenBehaviorAssem) aAListenerS321S0100000_10.l0).Ho();
        if (radiusLayoutHo != null) {
            C786410Ut5.G5(radiusLayoutHo, 1.0f);
        }
    }

    public static final void onAnimationEnd$0(AAListenerS321S0100000_10 aAListenerS321S0100000_10, Animator animator) {
        TuxSpinner tuxSpinnerUp = ((SearchCardLivePlayerAssem) aAListenerS321S0100000_10.l0).up();
        if (tuxSpinnerUp != null) {
            C786410Ut5.LLZILL(tuxSpinnerUp, 0);
        }
    }

    public static final void onAnimationEnd$1(AAListenerS321S0100000_10 aAListenerS321S0100000_10, Animator animator) {
        ((C0PRV) aAListenerS321S0100000_10.l0).LLILZ = false;
    }

    public static final void onAnimationEnd$2(AAListenerS321S0100000_10 aAListenerS321S0100000_10, Animator animator) {
        View header = ((C0PRV) aAListenerS321S0100000_10.l0).getHeader();
        if (header != null) {
            C786410Ut5.LJLLLLLL(8, header);
        }
        C0PRV c0prv = (C0PRV) aAListenerS321S0100000_10.l0;
        c0prv.LLILZ = false;
        View header2 = c0prv.getHeader();
        if (header2 != null) {
            ViewGroup.LayoutParams layoutParams = header2.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = -2;
                C786410Ut5.W5(header2, layoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        ((C0PRV) aAListenerS321S0100000_10.l0).LIZLLL(0.0f);
    }

    public static final void onAnimationEnd$4(AAListenerS321S0100000_10 aAListenerS321S0100000_10, Animator animator) {
        RadiusLayout radiusLayoutHo = ((SearchSevenSplitScreenBehaviorAssem) aAListenerS321S0100000_10.l0).Ho();
        if (radiusLayoutHo != null) {
            C786410Ut5.LLZZ(radiusLayoutHo, 8);
        }
    }

    public static final void onAnimationEnd$6(AAListenerS321S0100000_10 aAListenerS321S0100000_10, Animator animator) {
        RadiusLayout radiusLayoutHo = ((SearchSevenSplitScreenBehaviorAssem) aAListenerS321S0100000_10.l0).Ho();
        if (radiusLayoutHo != null) {
            C786410Ut5.G5(radiusLayoutHo, 1.0f);
        }
    }

    public static final void onAnimationStart$1(AAListenerS321S0100000_10 aAListenerS321S0100000_10, Animator animator) {
        ((C0PRV) aAListenerS321S0100000_10.l0).LLILZ = true;
    }

    public static final void onAnimationStart$2(AAListenerS321S0100000_10 aAListenerS321S0100000_10, Animator animator) {
        ((C0PRV) aAListenerS321S0100000_10.l0).LLILZ = true;
    }
}
