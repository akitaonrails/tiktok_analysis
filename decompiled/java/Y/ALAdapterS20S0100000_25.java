package Y;

import X.AbstractViewOnLayoutChangeListenerC1657530tEd;
import X.C0BYO;
import X.C1465720oFG;
import X.C1602160rnK;
import X.C1638190sjR;
import X.C1644120st0;
import X.C1644340stM;
import X.C1644370stP;
import X.C1644380stQ;
import X.C1644390stR;
import X.C1654510t9l;
import X.C1659380tHc;
import X.C1662850tND;
import X.C1663510tOH;
import X.C1664310tPZ;
import X.C1695930uEZ;
import X.C19670811xi;
import X.C375780EoK;
import X.C545820Lau;
import X.C786410Ut5;
import X.InterfaceC1637600siU;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.shortvideo.component.b;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.gamora.recorder.voicechange.slideslip.v;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public class ALAdapterS20S0100000_25 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 1:
                onAnimationCancel$0(this, animator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onAnimationCancel$1(this, animator);
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
            case 4:
                onAnimationEnd$4(this, animator);
                break;
            case 5:
                onAnimationEnd$5(this, animator);
                break;
            case 6:
            case 14:
            case 15:
            default:
                super.onAnimationEnd(animator);
                break;
            case 7:
                onAnimationEnd$6(this, animator);
                break;
            case 8:
                onAnimationEnd$7(this, animator);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onAnimationEnd$8(this, animator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onAnimationEnd$9(this, animator);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onAnimationEnd$10(this, animator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onAnimationEnd$11(this, animator);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onAnimationEnd$12(this, animator);
                break;
            case 16:
                onAnimationEnd$13(this, animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 6:
                onAnimationStart$0(this, animator);
                break;
            case 7:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
            default:
                super.onAnimationStart(animator);
                break;
            case 8:
                onAnimationStart$1(this, animator);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onAnimationStart$2(this, animator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onAnimationStart$3(this, animator);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onAnimationStart$4(this, animator);
                break;
            case 14:
                onAnimationStart$5(this, animator);
                break;
            case 15:
                onAnimationStart$6(this, animator);
                break;
        }
    }

    public ALAdapterS20S0100000_25(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationCancel$0(ALAdapterS20S0100000_25 aLAdapterS20S0100000_25, Animator animator) {
        super.onAnimationCancel(animator);
        C786410Ut5.LJLLLLLL(8, (View) aLAdapterS20S0100000_25.l0);
    }

    public static final void onAnimationCancel$1(ALAdapterS20S0100000_25 aLAdapterS20S0100000_25, Animator animator) {
        super.onAnimationCancel(animator);
        C375780EoK.LIZIZ(((C1659380tHc) aLAdapterS20S0100000_25.l0).LJIJJLI(), false);
        C786410Ut5.u5(((C1659380tHc) aLAdapterS20S0100000_25.l0).LJIJI(), 1.0f);
    }

    public static final void onAnimationEnd$0(ALAdapterS20S0100000_25 aLAdapterS20S0100000_25, Animator animator) {
        super.onAnimationEnd(animator);
        ((b) aLAdapterS20S0100000_25.l0).LLLFZ.LJIIJ(Unit.LIZ);
    }

    public static final void onAnimationEnd$1(ALAdapterS20S0100000_25 aLAdapterS20S0100000_25, Animator animator) {
        super.onAnimationEnd(animator);
        C786410Ut5.LJLLLLLL(8, (View) aLAdapterS20S0100000_25.l0);
    }

    public static final void onAnimationEnd$10(ALAdapterS20S0100000_25 aLAdapterS20S0100000_25, Animator animator) {
        C1644370stP c1644370stP = (C1644370stP) aLAdapterS20S0100000_25.l0;
        c1644370stP.LJIILIIL = null;
        FilterBean filterBean = c1644370stP.LJIIJ;
        if (filterBean != null) {
            c1644370stP.LJIIIZ = filterBean;
            ((C1644390stR) c1644370stP.LJII.getValue()).LLILZ = 0.0f;
            C1644370stP c1644370stP2 = (C1644370stP) aLAdapterS20S0100000_25.l0;
            C1644120st0 c1644120st0 = c1644370stP2.LJIIIIZZ;
            if (c1644120st0 != null) {
                c1644120st0.LIZ.LLLII().DA2(c1644370stP2.LJIIIZ, true, false, C545820Lau.LIZIZ(c1644120st0.LIZ), true, false, true, false);
            }
            C1644370stP c1644370stP3 = (C1644370stP) aLAdapterS20S0100000_25.l0;
            C1465720oFG.LIZ(c1644370stP3.LIZJ, false, c1644370stP3.LJIIIZ, false, 12);
        }
        ((C1644390stR) ((C1644370stP) aLAdapterS20S0100000_25.l0).LJII.getValue()).LLILZIL = false;
        if (C0BYO.LIZ()) {
            ((C1644370stP) aLAdapterS20S0100000_25.l0).LIZIZ.setPreviewFps(-1, true);
        }
    }

    public static final void onAnimationEnd$11(ALAdapterS20S0100000_25 aLAdapterS20S0100000_25, Animator animator) {
        View view = ((C1638190sjR) aLAdapterS20S0100000_25.l0).LJ;
        if (view == null) {
            view = null;
        }
        C786410Ut5.LJLLLLLL(8, view);
    }

    public static final void onAnimationEnd$12(ALAdapterS20S0100000_25 aLAdapterS20S0100000_25, Animator animator) {
        View view = ((C1638190sjR) aLAdapterS20S0100000_25.l0).LJ;
        if (view == null) {
            view = null;
        }
        C786410Ut5.LJLLLLLL(8, view);
    }

    public static final void onAnimationEnd$13(ALAdapterS20S0100000_25 aLAdapterS20S0100000_25, Animator animator) {
        C786410Ut5.LJLLLLLL(8, ((C1638190sjR) aLAdapterS20S0100000_25.l0).LIZIZ);
    }

    public static final void onAnimationEnd$2(ALAdapterS20S0100000_25 aLAdapterS20S0100000_25, Animator animator) {
        InterfaceC1637600siU interfaceC1637600siU = ((C1695930uEZ) aLAdapterS20S0100000_25.l0).LL;
        if (interfaceC1637600siU != null) {
            interfaceC1637600siU.LIZ();
        }
    }

    public static final void onAnimationEnd$3(ALAdapterS20S0100000_25 aLAdapterS20S0100000_25, Animator animator) {
        super.onAnimationEnd(animator);
        ((C1654510t9l) aLAdapterS20S0100000_25.l0).LL.LIZLLL.invoke();
    }

    public static final void onAnimationEnd$4(ALAdapterS20S0100000_25 aLAdapterS20S0100000_25, Animator animator) {
        C19670811xi c19670811xi = ((v) aLAdapterS20S0100000_25.l0).LLL;
        C19670811xi c19670811xi2 = null;
        if (c19670811xi == null) {
            c19670811xi = null;
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19670811xi);
        c19670811xi.setScaleX(1.0f);
        C19670811xi c19670811xi3 = ((v) aLAdapterS20S0100000_25.l0).LLL;
        if (c19670811xi3 == null) {
            c19670811xi3 = null;
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19670811xi3);
        c19670811xi3.setScaleY(1.0f);
        C19670811xi c19670811xi4 = ((v) aLAdapterS20S0100000_25.l0).LLL;
        if (c19670811xi4 != null) {
            c19670811xi2 = c19670811xi4;
        }
        C375780EoK.LIZIZ(c19670811xi2, false);
    }

    public static final void onAnimationEnd$5(ALAdapterS20S0100000_25 aLAdapterS20S0100000_25, Animator animator) {
        C19670811xi c19670811xi = ((C1664310tPZ) aLAdapterS20S0100000_25.l0).LLJILLL;
        if (c19670811xi != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19670811xi);
            c19670811xi.setScaleX(1.0f);
        }
        C19670811xi c19670811xi2 = ((C1664310tPZ) aLAdapterS20S0100000_25.l0).LLJILLL;
        if (c19670811xi2 != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19670811xi2);
            c19670811xi2.setScaleY(1.0f);
        }
        C19670811xi c19670811xi3 = ((C1664310tPZ) aLAdapterS20S0100000_25.l0).LLJILLL;
        if (c19670811xi3 != null) {
            C375780EoK.LIZIZ(c19670811xi3, false);
        }
    }

    public static final void onAnimationEnd$6(ALAdapterS20S0100000_25 aLAdapterS20S0100000_25, Animator animator) {
        C19670811xi c19670811xi = ((C1662850tND) aLAdapterS20S0100000_25.l0).LLLJL;
        C19670811xi c19670811xi2 = null;
        if (c19670811xi == null) {
            c19670811xi = null;
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19670811xi);
        c19670811xi.setScaleX(1.0f);
        C19670811xi c19670811xi3 = ((C1662850tND) aLAdapterS20S0100000_25.l0).LLLJL;
        if (c19670811xi3 == null) {
            c19670811xi3 = null;
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19670811xi3);
        c19670811xi3.setScaleY(1.0f);
        C19670811xi c19670811xi4 = ((C1662850tND) aLAdapterS20S0100000_25.l0).LLLJL;
        if (c19670811xi4 != null) {
            c19670811xi2 = c19670811xi4;
        }
        C786410Ut5.G1(c19670811xi2, 8);
    }

    public static final void onAnimationEnd$7(ALAdapterS20S0100000_25 aLAdapterS20S0100000_25, Animator animator) {
        C786410Ut5.LJLLLLLL(0, ((C1663510tOH) aLAdapterS20S0100000_25.l0).LL.LIZJ);
    }

    public static final void onAnimationEnd$8(ALAdapterS20S0100000_25 aLAdapterS20S0100000_25, Animator animator) {
        boolean z;
        C1644380stQ c1644380stQ = (C1644380stQ) aLAdapterS20S0100000_25.l0;
        FilterBean filterBean = c1644380stQ.LJIIIZ;
        if (filterBean != null && !Intrinsics.LJFF(filterBean, c1644380stQ.LJIIIIZZ)) {
            z = true;
        } else {
            z = false;
        }
        C1644380stQ c1644380stQ2 = (C1644380stQ) aLAdapterS20S0100000_25.l0;
        FilterBean filterBean2 = c1644380stQ2.LJIIIZ;
        if (filterBean2 != null) {
            c1644380stQ2.LJIIIIZZ = filterBean2;
            c1644380stQ2.LJI.LLILLL = 0.0f;
            C1644340stM c1644340stM = c1644380stQ2.LJII;
            if (c1644340stM != null) {
                c1644340stM.LIZ.LLLIIIIL().mc2(filterBean2, true, false, c1644340stM.LIZ.mActivity);
            }
            C1644380stQ c1644380stQ3 = (C1644380stQ) aLAdapterS20S0100000_25.l0;
            C1465720oFG.LIZ(c1644380stQ3.LIZJ, false, c1644380stQ3.LJIIIIZZ, false, 12);
        }
        ((C1644380stQ) aLAdapterS20S0100000_25.l0).LJI.LLILZ = false;
        if (C0BYO.LIZ()) {
            ((C1644380stQ) aLAdapterS20S0100000_25.l0).LIZIZ.setPreviewFps(-1, true);
        }
        if (z) {
            ((C1644380stQ) aLAdapterS20S0100000_25.l0).LJIIL = false;
        }
    }

    public static final void onAnimationEnd$9(ALAdapterS20S0100000_25 aLAdapterS20S0100000_25, Animator animator) {
        super.onAnimationEnd(animator);
        C375780EoK.LIZIZ(((C1659380tHc) aLAdapterS20S0100000_25.l0).LJIJJLI(), false);
        C786410Ut5.u5(((C1659380tHc) aLAdapterS20S0100000_25.l0).LJIJI(), 1.0f);
    }

    public static final void onAnimationStart$0(ALAdapterS20S0100000_25 aLAdapterS20S0100000_25, Animator animator) {
        super.onAnimationStart(animator);
        AbstractViewOnLayoutChangeListenerC1657530tEd abstractViewOnLayoutChangeListenerC1657530tEd = (AbstractViewOnLayoutChangeListenerC1657530tEd) aLAdapterS20S0100000_25.l0;
        int visibility = abstractViewOnLayoutChangeListenerC1657530tEd.getVisibility();
        abstractViewOnLayoutChangeListenerC1657530tEd.setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, abstractViewOnLayoutChangeListenerC1657530tEd);
    }

    public static final void onAnimationStart$1(ALAdapterS20S0100000_25 aLAdapterS20S0100000_25, Animator animator) {
        C786410Ut5.LJLLLLLL(4, ((C1663510tOH) aLAdapterS20S0100000_25.l0).LL.LIZJ);
    }

    public static final void onAnimationStart$2(ALAdapterS20S0100000_25 aLAdapterS20S0100000_25, Animator animator) {
        ((C1644380stQ) aLAdapterS20S0100000_25.l0).LJI.LLILZ = true;
    }

    public static final void onAnimationStart$3(ALAdapterS20S0100000_25 aLAdapterS20S0100000_25, Animator animator) {
        super.onAnimationStart(animator);
        C375780EoK.LIZIZ(((C1659380tHc) aLAdapterS20S0100000_25.l0).LJIJJLI(), true);
        C786410Ut5.u5(((C1659380tHc) aLAdapterS20S0100000_25.l0).LJIJI(), 0.0f);
    }

    public static final void onAnimationStart$4(ALAdapterS20S0100000_25 aLAdapterS20S0100000_25, Animator animator) {
        ((C1644390stR) ((C1644370stP) aLAdapterS20S0100000_25.l0).LJII.getValue()).LLILZIL = true;
    }

    public static final void onAnimationStart$5(ALAdapterS20S0100000_25 aLAdapterS20S0100000_25, Animator animator) {
        C786410Ut5.LJLLLLLL(0, ((C1638190sjR) aLAdapterS20S0100000_25.l0).LIZIZ);
    }

    public static final void onAnimationStart$6(ALAdapterS20S0100000_25 aLAdapterS20S0100000_25, Animator animator) {
        View view = ((C1638190sjR) aLAdapterS20S0100000_25.l0).LJ;
        if (view == null) {
            view = null;
        }
        C786410Ut5.LJLLLLLL(0, view);
    }
}
