package Y;

import X.AbstractC19994813Le;
import X.AbstractC2098408Jy;
import X.C0E48;
import X.C0E5S;
import X.C0EB4;
import X.C0EJ9;
import X.C0EZS;
import X.C0F2V;
import X.C0F65;
import X.C0FLW;
import X.C0FS1;
import X.C0FS2;
import X.C0FS4;
import X.C0FS5;
import X.C0FS9;
import X.C0FSY;
import X.C1295960jpS;
import X.C13LZ;
import X.C1426520nE2;
import X.C1426750nEP;
import X.C1602160rnK;
import X.C1653260t7k;
import X.C1697810uHb;
import X.C214799194j;
import X.C362580EJk;
import X.C362760EKc;
import X.C362780EKe;
import X.C368020Ebo;
import X.C368630Ecn;
import X.C368660Ecq;
import X.C370190EfJ;
import X.C370570Efv;
import X.C371220Egy;
import X.C372500Ej2;
import X.C372520Ej4;
import X.C373630Ekr;
import X.C376330EpD;
import X.C383230F0v;
import X.C383920F3m;
import X.C388070FJl;
import X.C390250FRv;
import X.C786410Ut5;
import X.EnumC373450EkZ;
import X.InterfaceC360800ECo;
import X.InterfaceC365030ESv;
import X.InterfaceC390170FRn;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerTopicRepoApi;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes6.dex */
public class ALAdapterS2S0100000_5 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationCancel$0(this, animator);
                break;
            case 6:
                onAnimationCancel$1(this, animator);
                break;
            case 14:
                onAnimationCancel$2(this, animator);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                onAnimationCancel$3(this, animator);
                break;
            case 37:
                onAnimationCancel$4(this, animator);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 1:
                super.onAnimationEnd(animator);
                break;
            case 2:
            case 7:
            case 21:
            case 26:
            case 31:
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
            case 37:
            default:
                super.onAnimationEnd(animator);
                break;
            case 3:
                onAnimationEnd$1(this, animator);
                break;
            case 4:
                onAnimationEnd$2(this, animator);
                break;
            case 5:
                onAnimationEnd$3(this, animator);
                break;
            case 6:
                onAnimationEnd$4(this, animator);
                break;
            case 8:
                onAnimationEnd$5(this, animator);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onAnimationEnd$6(this, animator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onAnimationEnd$7(this, animator);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onAnimationEnd$8(this, animator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onAnimationEnd$9(this, animator);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onAnimationEnd$10(this, animator);
                break;
            case 14:
                onAnimationEnd$11(this, animator);
                break;
            case 15:
                onAnimationEnd$12(this, animator);
                break;
            case 16:
                onAnimationEnd$13(this, animator);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                onAnimationEnd$14(this, animator);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                onAnimationEnd$15(this, animator);
                break;
            case 19:
                onAnimationEnd$16(this, animator);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                onAnimationEnd$17(this, animator);
                break;
            case 22:
                onAnimationEnd$18(this, animator);
                break;
            case 23:
                onAnimationEnd$19(this, animator);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                onAnimationEnd$20(this, animator);
                break;
            case 25:
                onAnimationEnd$21(this, animator);
                break;
            case 27:
                super.onAnimationEnd(animator);
                break;
            case 28:
                onAnimationEnd$23(this, animator);
                break;
            case 29:
                onAnimationEnd$24(this, animator);
                break;
            case 30:
                onAnimationEnd$25(this, animator);
                break;
            case 32:
                onAnimationEnd$26(this, animator);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                onAnimationEnd$27(this, animator);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                onAnimationEnd$28(this, animator);
                break;
            case 35:
                onAnimationEnd$29(this, animator);
                break;
            case 38:
                onAnimationEnd$30(this, animator);
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
                onAnimationStart$1(this, animator);
                break;
            case 2:
                onAnimationStart$2(this, animator);
                break;
            case 7:
                onAnimationStart$3(this, animator);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onAnimationStart$4(this, animator);
                break;
            case 21:
                onAnimationStart$5(this, animator);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                onAnimationStart$6(this, animator);
                break;
            case 26:
                onAnimationStart$7(this, animator);
                break;
            case 27:
                onAnimationStart$8(this, animator);
                break;
            case 31:
                onAnimationStart$9(this, animator);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                onAnimationStart$10(this, animator);
                break;
            case 35:
                onAnimationStart$11(this, animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public ALAdapterS2S0100000_5(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationCancel$0(ALAdapterS2S0100000_5 aLAdapterS2S0100000_5, Animator animator) {
        C368020Ebo c368020Ebo = (C368020Ebo) aLAdapterS2S0100000_5.l0;
        c368020Ebo.LIZIZ.LJIIZILJ(true, (int) (c368020Ebo.LJIIZILJ - c368020Ebo.LJIJ), 0, false, false);
    }

    public static final void onAnimationCancel$1(ALAdapterS2S0100000_5 aLAdapterS2S0100000_5, Animator animator) {
        super.onAnimationCancel(animator);
        C786410Ut5.y1(((C370190EfJ) aLAdapterS2S0100000_5.l0).getVideoSelectFrameFromXml(), 4);
    }

    public static final void onAnimationCancel$2(ALAdapterS2S0100000_5 aLAdapterS2S0100000_5, Animator animator) {
        ((C370570Efv) aLAdapterS2S0100000_5.l0).LLILZ.setAlpha(255);
        ((C370570Efv) aLAdapterS2S0100000_5.l0).invalidate();
    }

    public static final void onAnimationCancel$3(ALAdapterS2S0100000_5 aLAdapterS2S0100000_5, Animator animator) {
        ((C368660Ecq) aLAdapterS2S0100000_5.l0).LJJI = 0;
    }

    public static final void onAnimationCancel$4(ALAdapterS2S0100000_5 aLAdapterS2S0100000_5, Animator animator) {
        C786410Ut5.T4(((C368660Ecq) aLAdapterS2S0100000_5.l0).LIZLLL, 1.0f);
        C786410Ut5.Jc(((C368660Ecq) aLAdapterS2S0100000_5.l0).LIZLLL, 0.0f);
        C786410Ut5.ed(((C368660Ecq) aLAdapterS2S0100000_5.l0).LIZLLL, 0.0f);
    }

    public static final void onAnimationEnd$1(ALAdapterS2S0100000_5 aLAdapterS2S0100000_5, Animator animator) {
        super.onAnimationEnd(animator);
        TuxIconView tuxIconView = ((C0F65) aLAdapterS2S0100000_5.l0).LLJJJJ;
        if (tuxIconView != null) {
            C786410Ut5.Fb(tuxIconView, 0.0f);
        }
    }

    public static final void onAnimationEnd$10(ALAdapterS2S0100000_5 aLAdapterS2S0100000_5, Animator animator) {
        Function0 function0 = (Function0) aLAdapterS2S0100000_5.l0;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onAnimationEnd$11(ALAdapterS2S0100000_5 aLAdapterS2S0100000_5, Animator animator) {
        C370570Efv c370570Efv = (C370570Efv) aLAdapterS2S0100000_5.l0;
        c370570Efv.LLJJ = false;
        c370570Efv.LLILZ.setAlpha(0);
        ((C370570Efv) aLAdapterS2S0100000_5.l0).invalidate();
    }

    public static final void onAnimationEnd$12(ALAdapterS2S0100000_5 aLAdapterS2S0100000_5, Animator animator) {
        C368630Ecn subTrackGroupFromXml = ((C368630Ecn) aLAdapterS2S0100000_5.l0).getSubTrackGroupFromXml();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(subTrackGroupFromXml);
        subTrackGroupFromXml.setTranslationY(0.0f);
        C368630Ecn subTrackGroupFromXml2 = ((C368630Ecn) aLAdapterS2S0100000_5.l0).getSubTrackGroupFromXml();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(subTrackGroupFromXml2);
        subTrackGroupFromXml2.setScaleY(1.0f);
    }

    public static final void onAnimationEnd$13(ALAdapterS2S0100000_5 aLAdapterS2S0100000_5, Animator animator) {
        C786410Ut5.LLLLZLL(((C0FSY) aLAdapterS2S0100000_5.l0).LLILLL, 4);
    }

    public static final void onAnimationEnd$14(ALAdapterS2S0100000_5 aLAdapterS2S0100000_5, Animator animator) {
        super.onAnimationEnd(animator);
        C786410Ut5.B5(((C0FSY) aLAdapterS2S0100000_5.l0).LLILLL, 1.0f);
    }

    public static final void onAnimationEnd$15(ALAdapterS2S0100000_5 aLAdapterS2S0100000_5, Animator animator) {
        C362580EJk.LIZ(((C0F2V) aLAdapterS2S0100000_5.l0).LIZ);
    }

    public static final void onAnimationEnd$16(ALAdapterS2S0100000_5 aLAdapterS2S0100000_5, Animator animator) {
        Function0<Unit> function0 = ((C0F2V) aLAdapterS2S0100000_5.l0).LIZLLL;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onAnimationEnd$17(ALAdapterS2S0100000_5 aLAdapterS2S0100000_5, Animator animator) {
        C786410Ut5.LJLLLLLL(4, ((C0F2V) aLAdapterS2S0100000_5.l0).LIZJ);
    }

    public static final void onAnimationEnd$18(ALAdapterS2S0100000_5 aLAdapterS2S0100000_5, Animator animator) {
        InterfaceC360800ECo interfaceC360800ECo = ((C383920F3m) aLAdapterS2S0100000_5.l0).LIZIZ;
        if (interfaceC360800ECo != null) {
            C0EB4.LIZIZ(interfaceC360800ECo, new EnumC373450EkZ[]{EnumC373450EkZ.PLAY_PAUSE, EnumC373450EkZ.FULL_SCREEN, EnumC373450EkZ.UNDO, EnumC373450EkZ.REDO, EnumC373450EkZ.KEY_FRAME}, null, Boolean.FALSE, null, null, 18);
        }
        C0E5S c0e5s = ((C383920F3m) aLAdapterS2S0100000_5.l0).LIZLLL;
        if (c0e5s != null) {
            c0e5s.yV(AFwS234S0000000_5.get$arr$(431));
        }
    }

    public static final void onAnimationEnd$19(ALAdapterS2S0100000_5 aLAdapterS2S0100000_5, Animator animator) {
        Boolean boolValueOf;
        InterfaceC360800ECo interfaceC360800ECo;
        C0E5S c0e5s = ((C383920F3m) aLAdapterS2S0100000_5.l0).LIZLLL;
        if (c0e5s != null) {
            c0e5s.yV(AFwS234S0000000_5.get$arr$(432));
        }
        InterfaceC360800ECo interfaceC360800ECo2 = ((C383920F3m) aLAdapterS2S0100000_5.l0).LIZIZ;
        if (interfaceC360800ECo2 != null) {
            C0EB4.LIZIZ(interfaceC360800ECo2, new EnumC373450EkZ[]{EnumC373450EkZ.PLAY_PAUSE, EnumC373450EkZ.FULL_SCREEN, EnumC373450EkZ.KEY_FRAME}, null, Boolean.TRUE, null, null, 18);
        }
        C0E48 c0e48 = ((C383920F3m) aLAdapterS2S0100000_5.l0).LJ;
        if (c0e48 != null && c0e48.Bo().LIZ() && (interfaceC360800ECo = ((C383920F3m) aLAdapterS2S0100000_5.l0).LIZIZ) != null) {
            C0EB4.LIZIZ(interfaceC360800ECo, new EnumC373450EkZ[]{EnumC373450EkZ.UNDO}, null, Boolean.TRUE, null, null, 26);
        }
        C383920F3m c383920F3m = (C383920F3m) aLAdapterS2S0100000_5.l0;
        InterfaceC360800ECo interfaceC360800ECo3 = c383920F3m.LIZIZ;
        if (interfaceC360800ECo3 != null) {
            EnumC373450EkZ[] enumC373450EkZArr = {EnumC373450EkZ.REDO};
            C0E48 c0e482 = c383920F3m.LJ;
            if (c0e482 != null) {
                boolValueOf = Boolean.valueOf(c0e482.Bo().LJFF());
            } else {
                boolValueOf = null;
            }
            C0EB4.LIZIZ(interfaceC360800ECo3, enumC373450EkZArr, null, boolValueOf, null, null, 26);
        }
    }

    public static final void onAnimationEnd$2(ALAdapterS2S0100000_5 aLAdapterS2S0100000_5, Animator animator) {
        C214799194j c214799194j = ((C362780EKe) aLAdapterS2S0100000_5.l0).LL;
        if (c214799194j != null) {
            c214799194j.LLLLIL();
        }
        ((C362780EKe) aLAdapterS2S0100000_5.l0).m3();
    }

    public static final void onAnimationEnd$20(ALAdapterS2S0100000_5 aLAdapterS2S0100000_5, Animator animator) {
        View viewXg;
        ImageView imageView;
        C786410Ut5.LJLZ(8, ((C383920F3m) aLAdapterS2S0100000_5.l0).LIZ);
        IntRange intRangeLJIILJJIL = C13LZ.LJIILJJIL(0, ((C383920F3m) aLAdapterS2S0100000_5.l0).LIZ.getChildCount());
        C383920F3m c383920F3m = (C383920F3m) aLAdapterS2S0100000_5.l0;
        Iterator<Integer> it2 = intRangeLJIILJJIL.iterator();
        while (it2.hasNext()) {
            C786410Ut5.LJLLLLLL(8, c383920F3m.LIZ.getChildAt(((AbstractC2098408Jy) it2).nextInt()));
        }
        C786410Ut5.LJLLLLLL(4, ((C383920F3m) aLAdapterS2S0100000_5.l0).LIZJ);
        C0E5S c0e5s = ((C383920F3m) aLAdapterS2S0100000_5.l0).LIZLLL;
        if (c0e5s != null && (viewXg = c0e5s.xg()) != null && (imageView = (ImageView) viewXg.findViewById(R.id.l5f)) != null) {
            C786410Ut5.LJZI(4, imageView);
        }
    }

    public static final void onAnimationEnd$21(ALAdapterS2S0100000_5 aLAdapterS2S0100000_5, Animator animator) {
        C383230F0v c383230F0v = (C383230F0v) aLAdapterS2S0100000_5.l0;
        c383230F0v.LIZ = false;
        C786410Ut5.LJLLLLLL(8, (View) c383230F0v.LJ.getValue());
    }

    public static final void onAnimationEnd$23(ALAdapterS2S0100000_5 aLAdapterS2S0100000_5, Animator animator) {
        C1426520nE2 c1426520nE2 = ((C1426750nEP) aLAdapterS2S0100000_5.l0).LLJJJIL;
        if (c1426520nE2 != null) {
            c1426520nE2.zR0(true);
        }
    }

    public static final void onAnimationEnd$24(ALAdapterS2S0100000_5 aLAdapterS2S0100000_5, Animator animator) {
        C786410Ut5.LLD(8, (C1295960jpS) aLAdapterS2S0100000_5.l0);
    }

    public static final void onAnimationEnd$25(ALAdapterS2S0100000_5 aLAdapterS2S0100000_5, Animator animator) {
        ((Function0) aLAdapterS2S0100000_5.l0).invoke();
    }

    public static final void onAnimationEnd$26(ALAdapterS2S0100000_5 aLAdapterS2S0100000_5, Animator animator) {
        C786410Ut5.T4((View) aLAdapterS2S0100000_5.l0, 1.0f);
        C786410Ut5.ed((View) aLAdapterS2S0100000_5.l0, 0.0f);
    }

    public static final void onAnimationEnd$27(ALAdapterS2S0100000_5 aLAdapterS2S0100000_5, Animator animator) {
        C786410Ut5.LJLZ(8, ((C0FLW) aLAdapterS2S0100000_5.l0).LIZIZ);
        ((C0FLW) aLAdapterS2S0100000_5.l0).LJIILL = false;
    }

    public static final void onAnimationEnd$28(ALAdapterS2S0100000_5 aLAdapterS2S0100000_5, Animator animator) {
        ((C371220Egy) aLAdapterS2S0100000_5.l0).LLJILJIL = false;
    }

    public static final void onAnimationEnd$29(ALAdapterS2S0100000_5 aLAdapterS2S0100000_5, Animator animator) {
        C371220Egy c371220Egy = (C371220Egy) aLAdapterS2S0100000_5.l0;
        c371220Egy.LLJILJILJ = false;
        c371220Egy.LLJJ = null;
    }

    public static final void onAnimationEnd$3(ALAdapterS2S0100000_5 aLAdapterS2S0100000_5, Animator animator) {
        C362760EKc c362760EKcC3 = ((C362780EKe) aLAdapterS2S0100000_5.l0).c3();
        if (c362760EKcC3 != null) {
            c362760EKcC3.LIZ();
        }
        ((C362780EKe) aLAdapterS2S0100000_5.l0).LLJILJIL.LJII(Boolean.TRUE);
    }

    public static final void onAnimationEnd$30(ALAdapterS2S0100000_5 aLAdapterS2S0100000_5, Animator animator) {
        super.onAnimationEnd(animator);
        ((C388070FJl) aLAdapterS2S0100000_5.l0).LLJ.removeAllAnimatorListeners();
    }

    public static final void onAnimationEnd$4(ALAdapterS2S0100000_5 aLAdapterS2S0100000_5, Animator animator) {
        super.onAnimationEnd(animator);
        C786410Ut5.y1(((C370190EfJ) aLAdapterS2S0100000_5.l0).getVideoSelectFrameFromXml(), 4);
    }

    public static final void onAnimationEnd$5(ALAdapterS2S0100000_5 aLAdapterS2S0100000_5, Animator animator) {
        ((C0EJ9) aLAdapterS2S0100000_5.l0).LLJLL = null;
    }

    public static final void onAnimationEnd$6(ALAdapterS2S0100000_5 aLAdapterS2S0100000_5, Animator animator) {
        ((C0EJ9) aLAdapterS2S0100000_5.l0).LLJZ = null;
    }

    public static final void onAnimationEnd$7(ALAdapterS2S0100000_5 aLAdapterS2S0100000_5, Animator animator) {
        C372500Ej2 c372500Ej2 = ((C0EZS) aLAdapterS2S0100000_5.l0).LLJJJIL;
        if (c372500Ej2 != null) {
            c372500Ej2.LJII = null;
        }
    }

    public static final void onAnimationEnd$8(ALAdapterS2S0100000_5 aLAdapterS2S0100000_5, Animator animator) {
        InterfaceC365030ESv interfaceC365030ESvVr;
        C372520Ej4 c372520Ej4 = (C372520Ej4) aLAdapterS2S0100000_5.l0;
        c372520Ej4.LIZIZ.LJII = null;
        c372520Ej4.LIZLLL = true;
        c372520Ej4.LIZJ();
        C1653260t7k.LIZIZ("click_edit_pro_entrance");
        if (((C372520Ej4) aLAdapterS2S0100000_5.l0).LIZ.kr().LJII && (interfaceC365030ESvVr = ((C372520Ej4) aLAdapterS2S0100000_5.l0).LIZ.vr()) != null) {
            interfaceC365030ESvVr.UV();
        }
    }

    public static final void onAnimationEnd$9(ALAdapterS2S0100000_5 aLAdapterS2S0100000_5, Animator animator) {
        C373630Ekr c373630Ekr = (C373630Ekr) aLAdapterS2S0100000_5.l0;
        C786410Ut5.LJLIIL(3000L, c373630Ekr.LLJI, new ARunnableS105S0100000_5(c373630Ekr, 74));
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.6f, 1.0f);
        C373630Ekr c373630Ekr2 = (C373630Ekr) aLAdapterS2S0100000_5.l0;
        valueAnimatorOfFloat.setDuration(266L);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS255S0100000_5(c373630Ekr2, 13));
        valueAnimatorOfFloat.start();
    }

    public static final void onAnimationStart$0(ALAdapterS2S0100000_5 aLAdapterS2S0100000_5, Animator animator) {
        C368020Ebo c368020Ebo = (C368020Ebo) aLAdapterS2S0100000_5.l0;
        c368020Ebo.LJIJ = 0.0f;
        c368020Ebo.LJIIZILJ = 0.0f;
    }

    public static final void onAnimationStart$1(ALAdapterS2S0100000_5 aLAdapterS2S0100000_5, Animator animator) {
        TextView textView = (TextView) aLAdapterS2S0100000_5.l0;
        if (textView != null) {
            C786410Ut5.LLIL(textView, 0);
        }
        super.onAnimationStart(animator);
    }

    public static final void onAnimationStart$10(ALAdapterS2S0100000_5 aLAdapterS2S0100000_5, Animator animator) {
        ((C371220Egy) aLAdapterS2S0100000_5.l0).LLJILJIL = true;
    }

    public static final void onAnimationStart$11(ALAdapterS2S0100000_5 aLAdapterS2S0100000_5, Animator animator) {
        ((C371220Egy) aLAdapterS2S0100000_5.l0).LLJILJILJ = true;
    }

    public static final void onAnimationStart$2(ALAdapterS2S0100000_5 aLAdapterS2S0100000_5, Animator animator) {
        int size;
        super.onAnimationStart(animator);
        List<AddYoursStickerTopicRepoApi.AddYoursSuggestTopic> list = ((C0FS2) aLAdapterS2S0100000_5.l0).LJFF.get(C0FS9.RECOMMEND);
        List<AddYoursStickerTopicRepoApi.AddYoursSuggestTopic> list2 = list;
        int iIntValue = 0;
        if (list2 == null || list2.isEmpty()) {
            list = null;
        }
        List<AddYoursStickerTopicRepoApi.AddYoursSuggestTopic> list3 = list;
        if (list3 != null) {
            C0FS2 c0fs2 = (C0FS2) aLAdapterS2S0100000_5.l0;
            int i = c0fs2.LJII;
            if (i < 0) {
                size = C13LZ.LJIIJ(AbstractC19994813Le.Default, C1697810uHb.LJIIIZ(list3));
            } else {
                size = (i + 1) % list3.size();
            }
            c0fs2.LJII = size;
            AddYoursStickerTopicRepoApi.AddYoursSuggestTopic addYoursSuggestTopic = (AddYoursStickerTopicRepoApi.AddYoursSuggestTopic) ListProtector.get(list3, size);
            InterfaceC390170FRn interfaceC390170FRn = c0fs2.LIZJ.LJI;
            if (interfaceC390170FRn != null) {
                String topicText = c0fs2.LJIIIIZZ.LIZ.getTopicText();
                String str = "";
                if (topicText == null) {
                    topicText = "";
                }
                String str2 = addYoursSuggestTopic.text;
                if (str2 == null) {
                    str2 = "";
                }
                String value = C0FS4.ICON.getValue();
                boolean z = C0FS1.LLJJIJIIJIL;
                String addYoursEnterMethod = c0fs2.LJIIIIZZ.LIZ.getAddYoursEnterMethod();
                if (addYoursEnterMethod != null) {
                    str = addYoursEnterMethod;
                }
                Integer num = addYoursSuggestTopic.type;
                if (num != null) {
                    iIntValue = num.intValue();
                }
                interfaceC390170FRn.LJIILIIL(iIntValue, topicText, str2, value, str, z);
            }
            c0fs2.LJIIIIZZ.LIZLLL(new AwS584S0100000_5(addYoursSuggestTopic, 153), true);
            C390250FRv c390250FRv = c0fs2.LIZJ;
            c390250FRv.LJIIJ = C0FS5.AUTO;
            c390250FRv.LJIIIIZZ = ((AddYoursStickerTopicRepoApi.AddYoursSuggestTopic) ListProtector.get(list3, c0fs2.LJII)).text;
        }
    }

    public static final void onAnimationStart$3(ALAdapterS2S0100000_5 aLAdapterS2S0100000_5, Animator animator) {
        C376330EpD cursor$tools_camera_edit_release = ((C370190EfJ) aLAdapterS2S0100000_5.l0).getCursor$tools_camera_edit_release();
        if (cursor$tools_camera_edit_release != null) {
            int visibility = cursor$tools_camera_edit_release.getVisibility();
            cursor$tools_camera_edit_release.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, cursor$tools_camera_edit_release);
        }
        super.onAnimationStart(animator);
    }

    public static final void onAnimationStart$4(ALAdapterS2S0100000_5 aLAdapterS2S0100000_5, Animator animator) {
        InterfaceC365030ESv interfaceC365030ESvVr;
        C372520Ej4 c372520Ej4 = (C372520Ej4) aLAdapterS2S0100000_5.l0;
        c372520Ej4.LIZLLL = false;
        c372520Ej4.LIZJ.LIZLLL.invoke();
        if (((C372520Ej4) aLAdapterS2S0100000_5.l0).LIZ.kr().LJII && (interfaceC365030ESvVr = ((C372520Ej4) aLAdapterS2S0100000_5.l0).LIZ.vr()) != null) {
            interfaceC365030ESvVr.rx(((C372520Ej4) aLAdapterS2S0100000_5.l0).LIZ.kr());
        }
    }

    public static final void onAnimationStart$5(ALAdapterS2S0100000_5 aLAdapterS2S0100000_5, Animator animator) {
        C786410Ut5.LJLLLLLL(0, ((C0F2V) aLAdapterS2S0100000_5.l0).LIZJ);
    }

    public static final void onAnimationStart$6(ALAdapterS2S0100000_5 aLAdapterS2S0100000_5, Animator animator) {
        ((LinkedHashMap) ((C383920F3m) aLAdapterS2S0100000_5.l0).LJI).clear();
        IntRange intRangeLJIILJJIL = C13LZ.LJIILJJIL(0, ((C383920F3m) aLAdapterS2S0100000_5.l0).LIZ.getChildCount());
        C383920F3m c383920F3m = (C383920F3m) aLAdapterS2S0100000_5.l0;
        Iterator<Integer> it2 = intRangeLJIILJJIL.iterator();
        while (it2.hasNext()) {
            View childAt = c383920F3m.LIZ.getChildAt(((AbstractC2098408Jy) it2).nextInt());
            c383920F3m.LJI.put(childAt, Integer.valueOf(childAt.getVisibility()));
        }
    }

    public static final void onAnimationStart$7(ALAdapterS2S0100000_5 aLAdapterS2S0100000_5, Animator animator) {
        C786410Ut5.LJLLLLLL(0, (View) ((C383230F0v) aLAdapterS2S0100000_5.l0).LJ.getValue());
        ((C383230F0v) aLAdapterS2S0100000_5.l0).LIZ = true;
    }

    public static final void onAnimationStart$8(ALAdapterS2S0100000_5 aLAdapterS2S0100000_5, Animator animator) {
        TextView textView = (TextView) aLAdapterS2S0100000_5.l0;
        if (textView != null) {
            C786410Ut5.LLIL(textView, 0);
        }
        super.onAnimationStart(animator);
    }

    public static final void onAnimationStart$9(ALAdapterS2S0100000_5 aLAdapterS2S0100000_5, Animator animator) {
        C786410Ut5.y1(((C370190EfJ) aLAdapterS2S0100000_5.l0).getVideoSelectFrameFromXml(), 0);
        super.onAnimationStart(animator);
    }
}
