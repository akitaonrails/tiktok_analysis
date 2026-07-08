package Y;

import X.C0EJ9;
import X.C0EK1;
import X.C0EVO;
import X.C0EVQ;
import X.C0FAA;
import X.C0PEM;
import X.C1295960jpS;
import X.C1602160rnK;
import X.C19A3;
import X.C1DFH;
import X.C201955140j;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C362730EJz;
import X.C363470EMv;
import X.C363750ENx;
import X.C368000Ebm;
import X.C368010Ebn;
import X.C368040Ebq;
import X.C368220Ec8;
import X.C368630Ecn;
import X.C368790Ed3;
import X.C368800Ed4;
import X.C372960Ejm;
import X.C377510Er7;
import X.C385490F9n;
import X.C385880FBa;
import X.C385910FBd;
import X.C386100FBw;
import X.C563650M8t;
import X.C786410Ut5;
import X.C817503Hh;
import X.EnumC371580EhY;
import X.InterfaceC361710EGb;
import X.InterfaceC368580Eci;
import X.InterfaceC372990Ejp;
import X.InterfaceC377530Er9;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.gamora.editorpro.guide.logic.BaseFuncItemGuideController;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public class ALAdapterS2S0200000_5 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onAnimationStart$8(ALAdapterS2S0200000_5 aLAdapterS2S0200000_5, Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 2:
                onAnimationCancel$0(this, animator);
                break;
            case 14:
                onAnimationCancel$1(this, animator);
                break;
            case 15:
                onAnimationCancel$2(this, animator);
                break;
            case 16:
                onAnimationCancel$3(this, animator);
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
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
            default:
                super.onAnimationEnd(animator);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onAnimationEnd$12(this, animator);
                break;
            case 14:
                onAnimationEnd$13(this, animator);
                break;
            case 15:
                onAnimationEnd$14(this, animator);
                break;
            case 16:
                onAnimationEnd$15(this, animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationStart$0(this, animator);
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case BdTuring.TYPE_EMAIL /* 11 */:
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
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onAnimationStart$4(this, animator);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onAnimationStart$5(this, animator);
                break;
            case 14:
                C363750ENx.LJ("CAPTION_GUIDE_SHOW_NEW_V2");
                break;
            case 15:
                onAnimationStart$7(this, animator);
                break;
            case 16:
                onAnimationStart$8(this, animator);
                break;
        }
    }

    public static final void onAnimationCancel$0(ALAdapterS2S0200000_5 aLAdapterS2S0200000_5, Animator animator) {
        C19A3 c19a3;
        Scene scene;
        View viewFindViewById;
        C786410Ut5.LJLLLLLL(8, ((C385910FBd) aLAdapterS2S0200000_5.l0).LIZ);
        Scene scene2 = ((C385910FBd) aLAdapterS2S0200000_5.l0).LIZJ;
        if (scene2 instanceof C19A3) {
            c19a3 = (C19A3) scene2;
        } else {
            c19a3 = null;
        }
        if (!C363470EMv.LJFF(c19a3) && (scene = ((C385910FBd) aLAdapterS2S0200000_5.l0).LIZJ) != null && (viewFindViewById = scene.findViewById(R.id.gct)) != null) {
            C786410Ut5.LJLLLLLL(0, viewFindViewById);
        }
    }

    public static final void onAnimationCancel$1(ALAdapterS2S0200000_5 aLAdapterS2S0200000_5, Animator animator) {
        ((C1295960jpS) aLAdapterS2S0200000_5.l0).removeAnimatorListener(aLAdapterS2S0200000_5);
        ((Function0) aLAdapterS2S0200000_5.l1).invoke();
    }

    public static final void onAnimationCancel$2(ALAdapterS2S0200000_5 aLAdapterS2S0200000_5, Animator animator) {
        ((C1295960jpS) aLAdapterS2S0200000_5.l1).removeAnimatorListener(aLAdapterS2S0200000_5);
        ((BaseFuncItemGuideController) aLAdapterS2S0200000_5.l0).LLILZ.onHide();
        ((BaseFuncItemGuideController) aLAdapterS2S0200000_5.l0).LJ();
    }

    public static final void onAnimationCancel$3(ALAdapterS2S0200000_5 aLAdapterS2S0200000_5, Animator animator) {
        C786410Ut5.LLD(8, (C1295960jpS) aLAdapterS2S0200000_5.l0);
        C786410Ut5.LLLLLLZZ(((C0FAA) aLAdapterS2S0200000_5.l1).LLILZ, 0);
        ((C1295960jpS) aLAdapterS2S0200000_5.l0).removeAnimatorListener(aLAdapterS2S0200000_5);
    }

    public static final void onAnimationEnd$0(ALAdapterS2S0200000_5 aLAdapterS2S0200000_5, Animator animator) {
        super.onAnimationEnd(animator);
        TextView textView = (TextView) aLAdapterS2S0200000_5.l1;
        if (textView != null) {
            C786410Ut5.LLIL(textView, 8);
        }
    }

    public static final void onAnimationEnd$1(ALAdapterS2S0200000_5 aLAdapterS2S0200000_5, Animator animator) {
        ViewGroup.LayoutParams layoutParams;
        int i;
        View view = (View) aLAdapterS2S0200000_5.l0;
        if (view != null && (layoutParams = view.getLayoutParams()) != null) {
            if (((C386100FBw) aLAdapterS2S0200000_5.l1).LIZ == EnumC371580EhY.SHOW) {
                i = -2;
            } else {
                int i2 = C385880FBa.LLLF;
                i = C385880FBa.LLLF;
            }
            layoutParams.height = i;
        }
        View view2 = (View) aLAdapterS2S0200000_5.l0;
        if (view2 != null) {
            view2.requestLayout();
        }
    }

    public static final void onAnimationEnd$10(ALAdapterS2S0200000_5 aLAdapterS2S0200000_5, Animator animator) {
        C368630Ecn subTrackGroupFromXml = ((C368630Ecn) aLAdapterS2S0200000_5.l0).getSubTrackGroupFromXml();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(subTrackGroupFromXml);
        subTrackGroupFromXml.setTranslationY(0.0f);
        C368630Ecn subTrackGroupFromXml2 = ((C368630Ecn) aLAdapterS2S0200000_5.l0).getSubTrackGroupFromXml();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(subTrackGroupFromXml2);
        subTrackGroupFromXml2.setScaleY(1.0f);
        InterfaceC368580Eci innerListener = ((C368000Ebm) aLAdapterS2S0200000_5.l1).getInnerListener();
        if (innerListener != null) {
            innerListener.LIZLLL();
        }
    }

    public static final void onAnimationEnd$11(ALAdapterS2S0200000_5 aLAdapterS2S0200000_5, Animator animator) {
        Iterator<C368220Ec8> it2 = ((C368010Ebn) aLAdapterS2S0200000_5.l0).LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ();
        }
        ((C368040Ebq) aLAdapterS2S0200000_5.l1).LIZ.bringToFront();
    }

    public static final void onAnimationEnd$12(ALAdapterS2S0200000_5 aLAdapterS2S0200000_5, Animator animator) {
        super.onAnimationEnd(animator);
        TextView textView = (TextView) aLAdapterS2S0200000_5.l1;
        if (textView != null) {
            C786410Ut5.LLIL(textView, 8);
        }
    }

    public static final void onAnimationEnd$13(ALAdapterS2S0200000_5 aLAdapterS2S0200000_5, Animator animator) {
        ((C1295960jpS) aLAdapterS2S0200000_5.l0).removeAnimatorListener(aLAdapterS2S0200000_5);
        ((Function0) aLAdapterS2S0200000_5.l1).invoke();
    }

    public static final void onAnimationEnd$14(ALAdapterS2S0200000_5 aLAdapterS2S0200000_5, Animator animator) {
        ((C1295960jpS) aLAdapterS2S0200000_5.l1).removeAnimatorListener(aLAdapterS2S0200000_5);
        ((BaseFuncItemGuideController) aLAdapterS2S0200000_5.l0).LLILZ.onHide();
        ((BaseFuncItemGuideController) aLAdapterS2S0200000_5.l0).LJ();
    }

    public static final void onAnimationEnd$15(ALAdapterS2S0200000_5 aLAdapterS2S0200000_5, Animator animator) {
        C786410Ut5.LLD(8, (C1295960jpS) aLAdapterS2S0200000_5.l0);
        C786410Ut5.LLLLLLZZ(((C0FAA) aLAdapterS2S0200000_5.l1).LLILZ, 0);
        ((C1295960jpS) aLAdapterS2S0200000_5.l0).removeAnimatorListener(aLAdapterS2S0200000_5);
    }

    public static final void onAnimationEnd$2(ALAdapterS2S0200000_5 aLAdapterS2S0200000_5, Animator animator) {
        C19A3 c19a3;
        Scene scene;
        View viewFindViewById;
        C786410Ut5.LJLLLLLL(8, ((C385910FBd) aLAdapterS2S0200000_5.l0).LIZ);
        Scene scene2 = ((C385910FBd) aLAdapterS2S0200000_5.l0).LIZJ;
        if (scene2 instanceof C19A3) {
            c19a3 = (C19A3) scene2;
        } else {
            c19a3 = null;
        }
        if (!C363470EMv.LJFF(c19a3) && (scene = ((C385910FBd) aLAdapterS2S0200000_5.l0).LIZJ) != null && (viewFindViewById = scene.findViewById(R.id.gct)) != null) {
            C786410Ut5.LJLLLLLL(0, viewFindViewById);
        }
        ((Function0) aLAdapterS2S0200000_5.l1).invoke();
    }

    public static final void onAnimationEnd$3(ALAdapterS2S0200000_5 aLAdapterS2S0200000_5, Animator animator) {
        ((C0EJ9) aLAdapterS2S0200000_5.l0).LLJLLIL = null;
        ((Function0) aLAdapterS2S0200000_5.l1).invoke();
    }

    public static final void onAnimationEnd$4(ALAdapterS2S0200000_5 aLAdapterS2S0200000_5, Animator animator) {
        ((C0EJ9) aLAdapterS2S0200000_5.l0).LLJLLL = null;
        ((Function0) aLAdapterS2S0200000_5.l1).invoke();
    }

    public static final void onAnimationEnd$5(ALAdapterS2S0200000_5 aLAdapterS2S0200000_5, Animator animator) {
        C563650M8t c563650M8t = C563650M8t.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("recoverInUIThread previewHeightOffset: ");
        sbLIZ.append(((C372960Ejm) aLAdapterS2S0200000_5.l0).LLJILJIL);
        C201955140j.LIZLLL(c563650M8t, "shiwei", C2188811AlT.LIZIZ(sbLIZ));
        ((Function1) aLAdapterS2S0200000_5.l1).invoke(((C372960Ejm) aLAdapterS2S0200000_5.l0).W2(false));
        InterfaceC372990Ejp interfaceC372990Ejp = ((C372960Ejm) aLAdapterS2S0200000_5.l0).LLILZLL;
        if (interfaceC372990Ejp != null) {
            interfaceC372990Ejp.O2(false);
        }
        InterfaceC361710EGb interfaceC361710EGb = ((C372960Ejm) aLAdapterS2S0200000_5.l0).LLILZIL;
        if (interfaceC361710EGb != null) {
            interfaceC361710EGb.LR1(true);
        }
    }

    public static final void onAnimationEnd$6(ALAdapterS2S0200000_5 aLAdapterS2S0200000_5, Animator animator) {
        C563650M8t c563650M8t = C563650M8t.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("scaleInUIThread previewHeightOffset: ");
        sbLIZ.append(((C372960Ejm) aLAdapterS2S0200000_5.l0).LLJILJIL);
        C201955140j.LIZLLL(c563650M8t, "shiwei", C2188811AlT.LIZIZ(sbLIZ));
        ((Function1) aLAdapterS2S0200000_5.l1).invoke(((C372960Ejm) aLAdapterS2S0200000_5.l0).W2(true));
    }

    public static final void onAnimationEnd$7(ALAdapterS2S0200000_5 aLAdapterS2S0200000_5, Animator animator) {
        ViewGroup viewGroup;
        View previewLayout = ((C0EVO) aLAdapterS2S0200000_5.l0).LLILZIL.getPreviewLayout();
        if ((previewLayout instanceof ViewGroup) && (viewGroup = (ViewGroup) previewLayout) != null) {
            C786410Ut5.LJJJLZIJ((C0EVQ) aLAdapterS2S0200000_5.l1, viewGroup);
        }
    }

    public static final void onAnimationEnd$8(ALAdapterS2S0200000_5 aLAdapterS2S0200000_5, Animator animator) {
        ((Function0) aLAdapterS2S0200000_5.l1).invoke();
    }

    public static final void onAnimationEnd$9(ALAdapterS2S0200000_5 aLAdapterS2S0200000_5, Animator animator) {
        ((Function0) aLAdapterS2S0200000_5.l1).invoke();
    }

    public static final void onAnimationStart$0(ALAdapterS2S0200000_5 aLAdapterS2S0200000_5, Animator animator) {
        super.onAnimationStart(animator);
        C817503Hh c817503Hh = C817503Hh.LL;
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C362730EJz((AnimatorSet) aLAdapterS2S0200000_5.l0, null), 2);
    }

    public static final void onAnimationStart$1(ALAdapterS2S0200000_5 aLAdapterS2S0200000_5, Animator animator) {
        InterfaceC377530Er9 interfaceC377530Er9 = ((C377510Er7) aLAdapterS2S0200000_5.l0).LJIIJJI;
        if (interfaceC377530Er9 != null) {
            interfaceC377530Er9.LIZJ();
        }
    }

    public static final void onAnimationStart$2(ALAdapterS2S0200000_5 aLAdapterS2S0200000_5, Animator animator) {
        InterfaceC377530Er9 interfaceC377530Er9 = ((C377510Er7) aLAdapterS2S0200000_5.l0).LJIIJJI;
        if (interfaceC377530Er9 != null) {
            interfaceC377530Er9.LIZJ();
        }
    }

    public static final void onAnimationStart$3(ALAdapterS2S0200000_5 aLAdapterS2S0200000_5, Animator animator) {
        C368790Ed3 c368790Ed3 = ((C368630Ecn) aLAdapterS2S0200000_5.l0).LLJJ;
        int visibility = c368790Ed3.getVisibility();
        c368790Ed3.setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, c368790Ed3);
        C368800Ed4 c368800Ed4 = ((C368630Ecn) aLAdapterS2S0200000_5.l0).LLJJI;
        int visibility2 = c368800Ed4.getVisibility();
        c368800Ed4.setVisibility(8);
        C1602160rnK.LIZIZ(visibility2, 8, c368800Ed4);
    }

    public static final void onAnimationStart$4(ALAdapterS2S0200000_5 aLAdapterS2S0200000_5, Animator animator) {
        ConstraintLayout constraintLayout = (ConstraintLayout) aLAdapterS2S0200000_5.l0;
        if (constraintLayout != null) {
            C786410Ut5.LL(8, constraintLayout);
        }
        C786410Ut5.LL(0, (ConstraintLayout) aLAdapterS2S0200000_5.l1);
    }

    public static final void onAnimationStart$5(ALAdapterS2S0200000_5 aLAdapterS2S0200000_5, Animator animator) {
        super.onAnimationStart(animator);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C0EK1((AnimatorSet) aLAdapterS2S0200000_5.l0, null), 3);
    }

    public static final void onAnimationStart$7(ALAdapterS2S0200000_5 aLAdapterS2S0200000_5, Animator animator) {
        ((BaseFuncItemGuideController) aLAdapterS2S0200000_5.l0).LJFF();
    }

    public ALAdapterS2S0200000_5(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public ALAdapterS2S0200000_5(C385490F9n c385490F9n, C1295960jpS c1295960jpS, C0FAA c0faa, int i) {
        this.$t = i;
        this.l0 = c1295960jpS;
        this.l1 = c0faa;
    }
}
