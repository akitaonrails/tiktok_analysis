package Y;

import X.C0STE;
import X.C707280Rok;
import X.C719840SLm;
import X.C731960SnS;
import X.C786410Ut5;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegateKt;
import com.ss.android.ugc.aweme.feed.assem.sharer.VideoExposeSharerInformationAssem;
import com.ss.android.ugc.aweme.feed.landscape.cell.assem.speed.LandscapeCellSpeedAssem;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.feed.platform.cell.clean.CellCleanComponent;
import com.ss.android.ugc.feed.platform.cell.gradual.CellGradualComponent;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes12.dex */
public class ALAdapterS8S0100000_11 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;

    public static final void onAnimationStart$0(ALAdapterS8S0100000_11 aLAdapterS8S0100000_11, Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
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
            case 4:
            case 7:
            case 8:
            case BdTuring.TYPE_ECAF /* 9 */:
            default:
                super.onAnimationCancel(animator);
                break;
            case 5:
                onAnimationCancel$3(this, animator);
                break;
            case 6:
                onAnimationCancel$4(this, animator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onAnimationCancel$5(this, animator);
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
            case 4:
                onAnimationEnd$4(this, animator);
                break;
            case 5:
                onAnimationEnd$5(this, animator);
                break;
            case 6:
                onAnimationEnd$6(this, animator);
                break;
            case 7:
                onAnimationEnd$7(this, animator);
                break;
            case 8:
                onAnimationEnd$8(this, animator);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onAnimationEnd$9(this, animator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onAnimationEnd$10(this, animator);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onAnimationEnd$11(this, animator);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (11 - this.$t != 0) {
            super.onAnimationStart(animator);
        } else {
            onAnimationStart$0(this, animator);
        }
    }

    public ALAdapterS8S0100000_11(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationCancel$0(ALAdapterS8S0100000_11 aLAdapterS8S0100000_11, Animator animator) {
        C719840SLm c719840SLm = (C719840SLm) aLAdapterS8S0100000_11.l0;
        if (c719840SLm.LJIIIIZZ == animator) {
            c719840SLm.LJIIIIZZ = null;
        }
    }

    public static final void onAnimationCancel$1(ALAdapterS8S0100000_11 aLAdapterS8S0100000_11, Animator animator) {
        C719840SLm c719840SLm = (C719840SLm) aLAdapterS8S0100000_11.l0;
        if (c719840SLm.LJIJJ == animator) {
            c719840SLm.LJIJJ = null;
        }
    }

    public static final void onAnimationCancel$2(ALAdapterS8S0100000_11 aLAdapterS8S0100000_11, Animator animator) {
        C719840SLm c719840SLm = (C719840SLm) aLAdapterS8S0100000_11.l0;
        if (c719840SLm.LJIJJ == animator) {
            c719840SLm.LJIJJ = null;
        }
    }

    public static final void onAnimationCancel$3(ALAdapterS8S0100000_11 aLAdapterS8S0100000_11, Animator animator) {
        C731960SnS c731960SnS = (C731960SnS) aLAdapterS8S0100000_11.l0;
        c731960SnS.LJ = false;
        ALAdapterS8S0100000_11 aLAdapterS8S0100000_112 = c731960SnS.LJFF;
        if (aLAdapterS8S0100000_112 != null) {
            c731960SnS.LIZ.removeListener(aLAdapterS8S0100000_112);
        }
    }

    public static final void onAnimationCancel$4(ALAdapterS8S0100000_11 aLAdapterS8S0100000_11, Animator animator) {
        ((C707280Rok) aLAdapterS8S0100000_11.l0).invalidate();
    }

    public static final void onAnimationCancel$5(ALAdapterS8S0100000_11 aLAdapterS8S0100000_11, Animator animator) {
        C0STE c0ste = (C0STE) aLAdapterS8S0100000_11.l0;
        if (c0ste.LLLILZJ == animator) {
            c0ste.LLLILZJ = null;
        }
    }

    public static final void onAnimationEnd$0(ALAdapterS8S0100000_11 aLAdapterS8S0100000_11, Animator animator) {
        C719840SLm c719840SLm = (C719840SLm) aLAdapterS8S0100000_11.l0;
        if (c719840SLm.LJIIIIZZ == animator) {
            c719840SLm.LJIIIIZZ = null;
        }
    }

    public static final void onAnimationEnd$1(ALAdapterS8S0100000_11 aLAdapterS8S0100000_11, Animator animator) {
        C719840SLm c719840SLm = (C719840SLm) aLAdapterS8S0100000_11.l0;
        if (c719840SLm.LJIJJ == animator) {
            c719840SLm.LJIJJ = null;
        }
    }

    public static final void onAnimationEnd$10(ALAdapterS8S0100000_11 aLAdapterS8S0100000_11, Animator animator) {
        C0STE c0ste = (C0STE) aLAdapterS8S0100000_11.l0;
        if (c0ste.LLLILZJ == animator) {
            c0ste.LLLILZJ = null;
        }
    }

    public static final void onAnimationEnd$11(ALAdapterS8S0100000_11 aLAdapterS8S0100000_11, Animator animator) {
        C786410Ut5.x5((TuxIconView) ((VideoExposeSharerInformationAssem) aLAdapterS8S0100000_11.l0).getContentView().findViewById(R.id.ozi), 1.0f);
    }

    public static final void onAnimationEnd$2(ALAdapterS8S0100000_11 aLAdapterS8S0100000_11, Animator animator) {
        C719840SLm c719840SLm = (C719840SLm) aLAdapterS8S0100000_11.l0;
        if (c719840SLm.LJIJJ == animator) {
            c719840SLm.LJIJJ = null;
        }
    }

    public static final void onAnimationEnd$3(ALAdapterS8S0100000_11 aLAdapterS8S0100000_11, Animator animator) {
        CommerceVideoDelegateKt commerceVideoDelegateKt = (CommerceVideoDelegateKt) aLAdapterS8S0100000_11.l0;
        if (commerceVideoDelegateKt.isSelected) {
            commerceVideoDelegateKt.LLZZ(4);
        }
    }

    public static final void onAnimationEnd$4(ALAdapterS8S0100000_11 aLAdapterS8S0100000_11, Animator animator) {
        int alpha = ((CellGradualComponent) aLAdapterS8S0100000_11.l0).ep().getAlpha();
        CellGradualComponent cellGradualComponent = (CellGradualComponent) aLAdapterS8S0100000_11.l0;
        int i = cellGradualComponent.LLLF;
        if (alpha != i && i >= 0) {
            cellGradualComponent.lp();
        }
    }

    public static final void onAnimationEnd$5(ALAdapterS8S0100000_11 aLAdapterS8S0100000_11, Animator animator) {
        C731960SnS c731960SnS = (C731960SnS) aLAdapterS8S0100000_11.l0;
        if (c731960SnS.LIZJ) {
            c731960SnS.LJ = false;
            ALAdapterS8S0100000_11 aLAdapterS8S0100000_112 = c731960SnS.LJFF;
            if (aLAdapterS8S0100000_112 != null) {
                c731960SnS.LIZ.removeListener(aLAdapterS8S0100000_112);
                return;
            }
            return;
        }
        int i = c731960SnS.LIZLLL;
        if (i < c731960SnS.LIZIZ) {
            c731960SnS.LIZLLL = i + 1;
            c731960SnS.LIZ.start();
            return;
        }
        c731960SnS.LJ = false;
        ALAdapterS8S0100000_11 aLAdapterS8S0100000_113 = c731960SnS.LJFF;
        if (aLAdapterS8S0100000_113 == null) {
            return;
        }
        c731960SnS.LIZ.removeListener(aLAdapterS8S0100000_113);
    }

    public static final void onAnimationEnd$6(ALAdapterS8S0100000_11 aLAdapterS8S0100000_11, Animator animator) {
        C707280Rok c707280Rok = (C707280Rok) aLAdapterS8S0100000_11.l0;
        c707280Rok.LLIZ = c707280Rok.LLILZLL;
        c707280Rok.invalidate();
    }

    public static final void onAnimationEnd$7(ALAdapterS8S0100000_11 aLAdapterS8S0100000_11, Animator animator) {
        ((CellCleanComponent) aLAdapterS8S0100000_11.l0).LLJL = null;
    }

    public static final void onAnimationEnd$8(ALAdapterS8S0100000_11 aLAdapterS8S0100000_11, Animator animator) {
        super.onAnimationEnd(animator);
        View view = ((LandscapeCellSpeedAssem) aLAdapterS8S0100000_11.l0).LLJJJJ;
        if (view == null) {
            view = null;
        }
        C786410Ut5.LJLLLLLL(4, view);
    }

    public static final void onAnimationEnd$9(ALAdapterS8S0100000_11 aLAdapterS8S0100000_11, Animator animator) {
        C0STE c0ste = (C0STE) aLAdapterS8S0100000_11.l0;
        c0ste.LLJJIII = c0ste.LLJJ;
    }
}
