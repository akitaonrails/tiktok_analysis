package X;

import Y.ARunnableS127S0100000_27;
import android.animation.Animator;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: X.0ydA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1864940ydA extends C1704130uRn {
    public final int $t;
    public Object l0;

    public static final void onAnimationStart$0(C1864940ydA c1864940ydA, Animator animator) {
    }

    public static final void onAnimationStart$1(C1864940ydA c1864940ydA, Animator animator) {
    }

    public static final void onAnimationStart$11(C1864940ydA c1864940ydA, Animator animator) {
    }

    public static final void onAnimationStart$8(C1864940ydA c1864940ydA, Animator animator) {
    }

    @Override // X.C1704130uRn, android.animation.Animator.AnimatorListener
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
            case BdTuring.TYPE_EMAIL /* 11 */:
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
            case 14:
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
            case 25:
            default:
                super.onAnimationEnd(animator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onAnimationEnd$9(this, animator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onAnimationEnd$10(this, animator);
                break;
            case 15:
                onAnimationEnd$11(this, animator);
                break;
            case 16:
                onAnimationEnd$12(this, animator);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                onAnimationEnd$13(this, animator);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                onAnimationEnd$14(this, animator);
                break;
            case 19:
                onAnimationEnd$15(this, animator);
                break;
            case 21:
                onAnimationEnd$16(this, animator);
                break;
            case 22:
                onAnimationEnd$17(this, animator);
                break;
            case 23:
                onAnimationEnd$18(this, animator);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                onAnimationEnd$19(this, animator);
                break;
            case 26:
                onAnimationEnd$20(this, animator);
                break;
            case 27:
                onAnimationEnd$21(this, animator);
                break;
            case 28:
                onAnimationEnd$22(this, animator);
                break;
            case 29:
                onAnimationEnd$23(this, animator);
                break;
            case 30:
                onAnimationEnd$24(this, animator);
                break;
            case 31:
                onAnimationEnd$25(this, animator);
                break;
            case 32:
                onAnimationEnd$26(this, animator);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                onAnimationEnd$27(this, animator);
                break;
        }
    }

    @Override // X.C1704130uRn, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 3:
                onAnimationStart$0(this, animator);
                break;
            case 4:
                onAnimationStart$1(this, animator);
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
            case 15:
            case 16:
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
            case 19:
            case 21:
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
            default:
                super.onAnimationStart(animator);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onAnimationStart$2(this, animator);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onAnimationStart$3(this, animator);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onAnimationStart$4(this, animator);
                break;
            case 14:
                onAnimationStart$5(this, animator);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                onAnimationStart$6(this, animator);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                onAnimationStart$7(this, animator);
                break;
            case 22:
                onAnimationStart$8(this, animator);
                break;
            case 23:
                onAnimationStart$9(this, animator);
                break;
            case 25:
                onAnimationStart$10(this, animator);
                break;
            case 26:
                onAnimationStart$11(this, animator);
                break;
            case 27:
                onAnimationStart$12(this, animator);
                break;
        }
    }

    public C1864940ydA(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationEnd$0(C1864940ydA c1864940ydA, Animator animator) {
        AbstractC1842530y31.LJIILJJIL(((C1842540y32) c1864940ydA.l0).LJIILIIL, -2);
        C1842540y32.LJIJ(C1842540y32.LJJIIZ, ((C1842540y32) c1864940ydA.l0).LJIILIIL);
        C1842540y32 c1842540y32 = (C1842540y32) c1864940ydA.l0;
        int i = C1842540y32.LJJIJIIJI;
        LinearLayout linearLayout = c1842540y32.LJIIJJI;
        linearLayout.setPaddingRelative(i, linearLayout.getPaddingTop(), i, c1842540y32.LJIIJJI.getPaddingBottom());
        C786410Ut5.S4(1.0f, ((C1842540y32) c1864940ydA.l0).LJIILIIL);
        C500260Jjc.LJIILIIL(((C1842540y32) c1864940ydA.l0).LJIILIIL);
        ((C1842540y32) c1864940ydA.l0).LIZIZ.LJIL = null;
    }

    public static final void onAnimationEnd$1(C1864940ydA c1864940ydA, Animator animator) {
        Map.Entry entryFirstEntry;
        C1810410xDD c1810410xDD;
        RankTypeV2 rankTypeV2;
        AbstractC1842530y31.LJIILJJIL(((C1842520y30) c1864940ydA.l0).LJIILIIL, -2);
        C1842520y30.LJIJI(C1842520y30.LJJIIZ, ((C1842520y30) c1864940ydA.l0).LJIILIIL);
        C1842520y30 c1842520y30 = (C1842520y30) c1864940ydA.l0;
        int i = C1842520y30.LJJIJ;
        int i2 = C1842520y30.LJJIJIIJI;
        LinearLayout linearLayout = c1842520y30.LJIIJJI;
        linearLayout.setPaddingRelative(i, linearLayout.getPaddingTop(), i2, c1842520y30.LJIIJJI.getPaddingBottom());
        C1842430y2r c1842430y2r = ((C1842520y30) c1864940ydA.l0).LIZIZ;
        C1842470y2v c1842470y2v = c1842430y2r.LJIILLIIL;
        Integer numValueOf = null;
        if (c1842470y2v != null && (c1810410xDD = c1842470y2v.LIZ) != null && (rankTypeV2 = c1810410xDD.LIZIZ) != null) {
            numValueOf = Integer.valueOf(rankTypeV2.type);
        }
        TreeMap treeMap = (TreeMap) ((LinkedHashMap) c1842430y2r.LJIJJ).get(numValueOf);
        if (treeMap != null && (entryFirstEntry = treeMap.firstEntry()) != null && entryFirstEntry.getValue() != null) {
            C1842520y30 c1842520y302 = (C1842520y30) c1864940ydA.l0;
            HandlerHook.viewPostDelay(c1842520y302.LIZJ, new ARunnableS127S0100000_27(c1842520y302, 47), 800L);
            return;
        }
        C1842520y30 c1842520y303 = (C1842520y30) c1864940ydA.l0;
        EnumC1842640y3C enumC1842640y3C = EnumC1842640y3C.RESET;
        TextView textView = c1842520y303.LJIILIIL;
        String string = textView.getText().toString();
        final C1842520y30 c1842520y304 = (C1842520y30) c1864940ydA.l0;
        c1842520y303.LJIILL(enumC1842640y3C, textView, string, -1L, new InterfaceC1704110uRl() { // from class: X.0y3R
            @Override // X.InterfaceC1704110uRl
            public final void LIZ(int i3) {
                c1842520y304.LJIJ();
            }
        }, true);
    }

    public static final void onAnimationEnd$10(C1864940ydA c1864940ydA, Animator animator) {
        C786410Ut5.LJZL(8, ((C1843220y48) c1864940ydA.l0).LJIILJJIL);
        C786410Ut5.hd(((C1843220y48) c1864940ydA.l0).LJIILJJIL, 0.0f);
    }

    public static final void onAnimationEnd$11(C1864940ydA c1864940ydA, Animator animator) {
        C786410Ut5.LJZL(8, ((C1843220y48) c1864940ydA.l0).LJIILJJIL);
        C786410Ut5.o5(((C1843220y48) c1864940ydA.l0).LJIILLIIL, 1.0f);
    }

    public static final void onAnimationEnd$12(C1864940ydA c1864940ydA, Animator animator) {
        C786410Ut5.LJZL(8, ((C1843040y3q) c1864940ydA.l0).LJIIJJI);
        C786410Ut5.hd(((C1843040y3q) c1864940ydA.l0).LJIIJJI, 0.0f);
    }

    public static final void onAnimationEnd$13(C1864940ydA c1864940ydA, Animator animator) {
        C786410Ut5.hd(((C1843150y41) c1864940ydA.l0).LJIIJJI, 0.0f);
        C786410Ut5.LJZL(8, ((C1843150y41) c1864940ydA.l0).LJIILJJIL);
        C786410Ut5.hd(((C1843150y41) c1864940ydA.l0).LJIILJJIL, 0.0f);
    }

    public static final void onAnimationEnd$14(C1864940ydA c1864940ydA, Animator animator) {
        C786410Ut5.LLIL(((C1843040y3q) c1864940ydA.l0).LJIILIIL, 8);
        C786410Ut5.cd(0.0f, ((C1843040y3q) c1864940ydA.l0).LJIILIIL);
    }

    public static final void onAnimationEnd$15(C1864940ydA c1864940ydA, Animator animator) {
        C786410Ut5.LJZL(8, ((C1843170y43) c1864940ydA.l0).LJIILJJIL);
        C786410Ut5.o5(((C1843170y43) c1864940ydA.l0).LJIILLIIL, 1.0f);
        C786410Ut5.V4(((C1843170y43) c1864940ydA.l0).LJIILL, 1.0f);
    }

    public static final void onAnimationEnd$16(C1864940ydA c1864940ydA, Animator animator) {
        ((C1843170y43) c1864940ydA.l0).LJIILLIIL.setScrollEnabled(true);
        AbstractC1842530y31.LJIILJJIL(((C1843170y43) c1864940ydA.l0).LIZJ, -2);
        ((C1843170y43) c1864940ydA.l0).LJIILIIL(false);
    }

    public static final void onAnimationEnd$17(C1864940ydA c1864940ydA, Animator animator) {
        C786410Ut5.LJZL(8, ((C1843220y48) c1864940ydA.l0).LJIILJJIL);
        C786410Ut5.pd(((C1843220y48) c1864940ydA.l0).LJIILLIIL, 0.0f);
    }

    public static final void onAnimationEnd$18(C1864940ydA c1864940ydA, Animator animator) {
        C786410Ut5.S4(1.0f, ((C1843150y41) c1864940ydA.l0).LJIILIIL);
        C786410Ut5.LJZL(8, ((C1843150y41) c1864940ydA.l0).LJIILJJIL);
        C786410Ut5.o5(((C1843150y41) c1864940ydA.l0).LJIILLIIL, 1.0f);
    }

    public static final void onAnimationEnd$19(C1864940ydA c1864940ydA, Animator animator) {
        C786410Ut5.LJZL(8, ((C1843210y47) c1864940ydA.l0).LJIILJJIL);
        C786410Ut5.o5(((C1843210y47) c1864940ydA.l0).LJIILLIIL, 1.0f);
    }

    public static final void onAnimationEnd$2(C1864940ydA c1864940ydA, Animator animator) {
        AbstractC1842530y31.LJIILJJIL(((C1842830y3V) c1864940ydA.l0).LIZJ, -2);
    }

    public static final void onAnimationEnd$20(C1864940ydA c1864940ydA, Animator animator) {
        ((C1843210y47) c1864940ydA.l0).LJIILLIIL.setScrollEnabled(true);
        AbstractC1842530y31.LJIILJJIL(((C1843210y47) c1864940ydA.l0).LIZJ, -2);
        ((C1843210y47) c1864940ydA.l0).LJIILIIL(false);
    }

    public static final void onAnimationEnd$21(C1864940ydA c1864940ydA, Animator animator) {
        C786410Ut5.cd(0.0f, ((C1843150y41) c1864940ydA.l0).LJIILIIL);
        C786410Ut5.LJZL(8, ((C1843150y41) c1864940ydA.l0).LJIILJJIL);
        C786410Ut5.pd(((C1843150y41) c1864940ydA.l0).LJIILLIIL, 0.0f);
    }

    public static final void onAnimationEnd$22(C1864940ydA c1864940ydA, Animator animator) {
        C786410Ut5.LLIL(((C1843220y48) c1864940ydA.l0).LJIILIIL, 8);
        C786410Ut5.cd(0.0f, ((C1843220y48) c1864940ydA.l0).LJIILIIL);
    }

    public static final void onAnimationEnd$23(C1864940ydA c1864940ydA, Animator animator) {
        C786410Ut5.LJZL(8, ((C1843210y47) c1864940ydA.l0).LJIILJJIL);
        C786410Ut5.hd(((C1843210y47) c1864940ydA.l0).LJIILJJIL, 0.0f);
    }

    public static final void onAnimationEnd$24(C1864940ydA c1864940ydA, Animator animator) {
        ((C1843140y40) c1864940ydA.l0).LJIILIIL(false);
    }

    public static final void onAnimationEnd$25(C1864940ydA c1864940ydA, Animator animator) {
        AbstractC1842530y31.LJIILJJIL(((C1843140y40) c1864940ydA.l0).LJIILIIL, -2);
    }

    public static final void onAnimationEnd$26(C1864940ydA c1864940ydA, Animator animator) {
        C786410Ut5.LJLZ(8, ((C1842990y3l) c1864940ydA.l0).LIZLLL());
        C786410Ut5.LJZL(0, ((C1842990y3l) c1864940ydA.l0).LJIIJJI);
        ((C1842990y3l) c1864940ydA.l0).LJIILIIL(false);
    }

    public static final void onAnimationEnd$27(C1864940ydA c1864940ydA, Animator animator) {
        AbstractC1842530y31.LJIILJJIL(((C1842990y3l) c1864940ydA.l0).LJFF(), -2);
    }

    public static final void onAnimationEnd$3(C1864940ydA c1864940ydA, Animator animator) {
        ((C1842830y3V) c1864940ydA.l0).LJIILLIIL.setScrollEnabled(true);
        AbstractC1842530y31.LJIILJJIL(((C1842830y3V) c1864940ydA.l0).LIZJ, -2);
        ((C1842830y3V) c1864940ydA.l0).LJIILIIL(false);
    }

    public static final void onAnimationEnd$4(C1864940ydA c1864940ydA, Animator animator) {
        ((C1843220y48) c1864940ydA.l0).LJIILLIIL.setScrollEnabled(true);
        C786410Ut5.LLIL(((C1843220y48) c1864940ydA.l0).LJIILIIL, 0);
        C786410Ut5.S4(1.0f, ((C1843220y48) c1864940ydA.l0).LJIILIIL);
        C786410Ut5.LJZL(0, ((C1843220y48) c1864940ydA.l0).LJIIJJI);
        C786410Ut5.W4(((C1843220y48) c1864940ydA.l0).LJIIJJI, 1.0f);
        ((C1843220y48) c1864940ydA.l0).LJIILIIL(false);
    }

    public static final void onAnimationEnd$5(C1864940ydA c1864940ydA, Animator animator) {
        C786410Ut5.LJZL(8, ((C1843210y47) c1864940ydA.l0).LJIILJJIL);
        C786410Ut5.pd(((C1843210y47) c1864940ydA.l0).LJIILLIIL, 0.0f);
    }

    public static final void onAnimationEnd$6(C1864940ydA c1864940ydA, Animator animator) {
        C786410Ut5.LJLLLLLL(8, ((C1843220y48) c1864940ydA.l0).LJ);
    }

    public static final void onAnimationEnd$7(C1864940ydA c1864940ydA, Animator animator) {
        C1842980y3k c1842980y3k = (C1842980y3k) c1864940ydA.l0;
        c1842980y3k.LJJJ = false;
        C786410Ut5.LJLZ(8, c1842980y3k.LIZLLL());
        C786410Ut5.LLIL(((C1842980y3k) c1864940ydA.l0).LJFF(), 0);
        TextView textView = ((C1842980y3k) c1864940ydA.l0).LJJI;
        if (textView != null) {
            C786410Ut5.LLIL(textView, 8);
        }
        C786410Ut5.LJZL(0, ((C1842980y3k) c1864940ydA.l0).LJIIJJI);
        ViewGroup viewGroup = ((C1842980y3k) c1864940ydA.l0).LJJIFFI;
        if (viewGroup != null) {
            AbstractC1842530y31.LJIILJJIL(viewGroup, -2);
        }
        C786410Ut5.cd(0.0f, ((C1842980y3k) c1864940ydA.l0).LJFF());
        TextView textView2 = ((C1842980y3k) c1864940ydA.l0).LJJI;
        if (textView2 != null) {
            C786410Ut5.cd(0.0f, textView2);
        }
        ((C1842980y3k) c1864940ydA.l0).LJIILIIL(false);
        ((C1842980y3k) c1864940ydA.l0).LIZIZ();
    }

    public static final void onAnimationEnd$8(C1864940ydA c1864940ydA, Animator animator) {
        C1842980y3k c1842980y3k = (C1842980y3k) c1864940ydA.l0;
        if (c1842980y3k.LJJJ) {
            return;
        }
        C786410Ut5.LJLZ(8, c1842980y3k.LIZLLL());
        TextView textView = ((C1842980y3k) c1864940ydA.l0).LJJI;
        if (textView != null) {
            C786410Ut5.LLIL(textView, 8);
        }
        C786410Ut5.LJZL(0, ((C1842980y3k) c1864940ydA.l0).LJIIJJI);
        C786410Ut5.cd(0.0f, ((C1842980y3k) c1864940ydA.l0).LJFF());
        TextView textView2 = ((C1842980y3k) c1864940ydA.l0).LJJI;
        if (textView2 != null) {
            C786410Ut5.cd(0.0f, textView2);
        }
        ViewGroup viewGroup = ((C1842980y3k) c1864940ydA.l0).LJJIFFI;
        if (viewGroup != null) {
            AbstractC1842530y31.LJIILJJIL(viewGroup, -2);
        }
        ((C1842980y3k) c1864940ydA.l0).LJIILIIL(false);
        ((C1842980y3k) c1864940ydA.l0).LIZIZ();
    }

    public static final void onAnimationEnd$9(C1864940ydA c1864940ydA, Animator animator) {
        C786410Ut5.LJZL(8, ((C1843210y47) c1864940ydA.l0).LJIILJJIL);
    }

    public static final void onAnimationStart$10(C1864940ydA c1864940ydA, Animator animator) {
        C786410Ut5.LJZL(0, ((C1843210y47) c1864940ydA.l0).LJIIJJI);
        C786410Ut5.S4(0.0f, ((C1843210y47) c1864940ydA.l0).LJIILIIL);
    }

    public static final void onAnimationStart$12(C1864940ydA c1864940ydA, Animator animator) {
        C786410Ut5.LJZL(0, ((C1843150y41) c1864940ydA.l0).LJIILJJIL);
        C1843150y41 c1843150y41 = (C1843150y41) c1864940ydA.l0;
        C786410Ut5.pd(c1843150y41.LJIILLIIL, c1843150y41.LIZIZ.LJIILL);
    }

    public static final void onAnimationStart$2(C1864940ydA c1864940ydA, Animator animator) {
        C786410Ut5.LJLZ(0, ((C1843040y3q) c1864940ydA.l0).LIZLLL());
        C786410Ut5.bd(((C1843040y3q) c1864940ydA.l0).LIZIZ.LJIILL, ((C1843040y3q) c1864940ydA.l0).LIZLLL());
        C786410Ut5.R4(1.0f, ((C1843040y3q) c1864940ydA.l0).LIZLLL());
    }

    public static final void onAnimationStart$3(C1864940ydA c1864940ydA, Animator animator) {
        C786410Ut5.LJZL(0, ((C1843210y47) c1864940ydA.l0).LJIIJJI);
    }

    public static final void onAnimationStart$4(C1864940ydA c1864940ydA, Animator animator) {
        C786410Ut5.LJLZ(0, ((C1843040y3q) c1864940ydA.l0).LIZLLL());
        C786410Ut5.R4(0.0f, ((C1843040y3q) c1864940ydA.l0).LIZLLL());
    }

    public static final void onAnimationStart$5(C1864940ydA c1864940ydA, Animator animator) {
        C786410Ut5.LJLZ(0, ((C1843040y3q) c1864940ydA.l0).LIZLLL());
        C786410Ut5.bd(((C1843040y3q) c1864940ydA.l0).LIZIZ.LJIILL, ((C1843040y3q) c1864940ydA.l0).LIZLLL());
        C786410Ut5.R4(1.0f, ((C1843040y3q) c1864940ydA.l0).LIZLLL());
        ImageView imageView = ((C1843040y3q) c1864940ydA.l0).LJIJI;
        if (imageView == null) {
            imageView = null;
        }
        C786410Ut5.V4(imageView, 0.0f);
    }

    public static final void onAnimationStart$6(C1864940ydA c1864940ydA, Animator animator) {
        C786410Ut5.LJZL(0, ((C1843150y41) c1864940ydA.l0).LJIILJJIL);
        C1843150y41 c1843150y41 = (C1843150y41) c1864940ydA.l0;
        C786410Ut5.hd(c1843150y41.LJIILJJIL, c1843150y41.LIZIZ.LJIILL);
    }

    public static final void onAnimationStart$7(C1864940ydA c1864940ydA, Animator animator) {
        C786410Ut5.LJZL(0, ((C1843170y43) c1864940ydA.l0).LJIIJJI);
        C786410Ut5.S4(0.0f, ((C1843170y43) c1864940ydA.l0).LJIILIIL);
        C786410Ut5.V4(((C1843170y43) c1864940ydA.l0).LJIIL, 0.0f);
    }

    public static final void onAnimationStart$9(C1864940ydA c1864940ydA, Animator animator) {
        C786410Ut5.LJZL(0, ((C1843150y41) c1864940ydA.l0).LJIILJJIL);
        C786410Ut5.o5(((C1843150y41) c1864940ydA.l0).LJIILLIIL, 0.0f);
    }
}
