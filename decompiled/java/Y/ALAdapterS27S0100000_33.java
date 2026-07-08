package Y;

import X.AbstractC2217051Bpv;
import X.C19P3;
import X.C19W6;
import X.C1AG4;
import X.C21567019am;
import X.C21567719at;
import X.C21570319bJ;
import X.C21572519bf;
import X.C21574419by;
import X.C21576919cN;
import X.C21580119ct;
import X.EnumC21577619cU;
import X.InterfaceC21580219cu;
import X.RunnableC21577219cQ;
import X.RunnableC21577519cT;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.SharedPreferences;
import android.graphics.Paint;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicCoverAssem;
import com.ss.android.ugc.aweme.feed.assem.relationbtn.VideoRelationBtnAssem;
import com.ss.android.ugc.aweme.im.creative.edit.impl.button.IMEditSendButtonAssem;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Iterator;

/* JADX INFO: loaded from: classes34.dex */
public class ALAdapterS27S0100000_33 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationCancel$0(this, animator);
                break;
            case 1:
                onAnimationCancel$1(this, animator);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                onAnimationCancel$2(this, animator);
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
            case 2:
            case BdTuring.TYPE_EMAIL /* 11 */:
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
            case 7:
                onAnimationEnd$5(this, animator);
                break;
            case 8:
                onAnimationEnd$6(this, animator);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onAnimationEnd$7(this, animator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
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
            case 21:
                onAnimationEnd$18(this, animator);
                break;
            case 22:
                onAnimationEnd$19(this, animator);
                break;
            case 23:
                onAnimationEnd$20(this, animator);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                onAnimationEnd$21(this, animator);
                break;
            case 25:
                onAnimationEnd$22(this, animator);
                break;
            case 26:
                onAnimationEnd$23(this, animator);
                break;
            case 27:
                onAnimationEnd$24(this, animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        if (2 - this.$t != 0) {
            super.onAnimationPause(animator);
        } else {
            onAnimationPause$0(this, animator);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 5:
                onAnimationStart$0(this, animator);
                break;
            case 7:
                super.onAnimationStart(animator);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onAnimationStart$2(this, animator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onAnimationStart$3(this, animator);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onAnimationStart$4(this, animator);
                break;
            case 23:
                onAnimationStart$5(this, animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public ALAdapterS27S0100000_33(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationCancel$0(ALAdapterS27S0100000_33 aLAdapterS27S0100000_33, Animator animator) {
        C19W6 c19w6 = (C19W6) aLAdapterS27S0100000_33.l0;
        c19w6.LLJJJJ = null;
        c19w6.LLJI = false;
    }

    public static final void onAnimationCancel$1(ALAdapterS27S0100000_33 aLAdapterS27S0100000_33, Animator animator) {
        super.onAnimationCancel(animator);
        ((VideoMusicCoverAssem) aLAdapterS27S0100000_33.l0).Wp();
    }

    public static final void onAnimationCancel$2(ALAdapterS27S0100000_33 aLAdapterS27S0100000_33, Animator animator) {
        ((C19P3) aLAdapterS27S0100000_33.l0).setTextVisible(4);
        Paint paint = ((C19P3) aLAdapterS27S0100000_33.l0).LLJJIII;
        if (paint != null) {
            paint.setAlpha(255);
        }
        super.onAnimationCancel(animator);
    }

    public static final void onAnimationEnd$0(ALAdapterS27S0100000_33 aLAdapterS27S0100000_33, Animator animator) {
        C19W6 c19w6 = (C19W6) aLAdapterS27S0100000_33.l0;
        c19w6.LLJJJJ = null;
        c19w6.LLJI = false;
    }

    public static final void onAnimationEnd$1(ALAdapterS27S0100000_33 aLAdapterS27S0100000_33, Animator animator) {
        ((C19P3) aLAdapterS27S0100000_33.l0).LLJJJJ = true;
        super.onAnimationEnd(animator);
    }

    public static final void onAnimationEnd$10(ALAdapterS27S0100000_33 aLAdapterS27S0100000_33, Animator animator) {
        ((C21567719at) aLAdapterS27S0100000_33.l0).LL = false;
    }

    public static final void onAnimationEnd$11(ALAdapterS27S0100000_33 aLAdapterS27S0100000_33, Animator animator) {
        super.onAnimationEnd(animator);
        ((C21574419by) aLAdapterS27S0100000_33.l0).LJIIIIZZ();
    }

    public static final void onAnimationEnd$12(ALAdapterS27S0100000_33 aLAdapterS27S0100000_33, Animator animator) {
        super.onAnimationEnd(animator);
        ((C21574419by) aLAdapterS27S0100000_33.l0).LLJJIJIIJIL = null;
    }

    public static final void onAnimationEnd$13(ALAdapterS27S0100000_33 aLAdapterS27S0100000_33, Animator animator) {
        super.onAnimationEnd(animator);
        ((C21574419by) aLAdapterS27S0100000_33.l0).LJIIIIZZ();
        ((C21574419by) aLAdapterS27S0100000_33.l0).LLJI.reset();
        ((C21574419by) aLAdapterS27S0100000_33.l0).postInvalidateOnAnimation();
        ((C21574419by) aLAdapterS27S0100000_33.l0).LLJJIJIIJIL = null;
    }

    public static final void onAnimationEnd$14(ALAdapterS27S0100000_33 aLAdapterS27S0100000_33, Animator animator) {
        super.onAnimationEnd(animator);
        ((C21570319bJ) ((ARunnableS1S0600001_33) aLAdapterS27S0100000_33.l0).l5).LLJJJIL = null;
    }

    public static final void onAnimationEnd$15(ALAdapterS27S0100000_33 aLAdapterS27S0100000_33, Animator animator) {
        super.onAnimationEnd(animator);
        ((C21570319bJ) ((ARunnableS1S0600001_33) aLAdapterS27S0100000_33.l0).l5).LLJJJIL = null;
    }

    public static final void onAnimationEnd$16(ALAdapterS27S0100000_33 aLAdapterS27S0100000_33, Animator animator) {
        super.onAnimationEnd(animator);
        ((C21570319bJ) aLAdapterS27S0100000_33.l0).LLJJJIL = null;
    }

    public static final void onAnimationEnd$17(ALAdapterS27S0100000_33 aLAdapterS27S0100000_33, Animator animator) {
        super.onAnimationEnd(animator);
        ((C21572519bf) aLAdapterS27S0100000_33.l0).LLJJJIL = null;
    }

    public static final void onAnimationEnd$18(ALAdapterS27S0100000_33 aLAdapterS27S0100000_33, Animator animator) {
        super.onAnimationEnd(animator);
        ((C21572519bf) aLAdapterS27S0100000_33.l0).LJIIL();
        ((C21572519bf) aLAdapterS27S0100000_33.l0).LLJILJILJ.reset();
        C21572519bf c21572519bf = (C21572519bf) aLAdapterS27S0100000_33.l0;
        c21572519bf.LLIZ = null;
        c21572519bf.LLIZLLLIL = null;
        c21572519bf.LLJ = 0.0f;
        c21572519bf.LLILZ = false;
        c21572519bf.LLILZIL = false;
        c21572519bf.LLILZLL = false;
        c21572519bf.LLILLJJLI.rewind();
        c21572519bf.invalidate();
        ((C21572519bf) aLAdapterS27S0100000_33.l0).postInvalidateOnAnimation();
        ((C21572519bf) aLAdapterS27S0100000_33.l0).LLJJJIL = null;
    }

    public static final void onAnimationEnd$19(ALAdapterS27S0100000_33 aLAdapterS27S0100000_33, Animator animator) {
        super.onAnimationEnd(animator);
        ((C21572519bf) aLAdapterS27S0100000_33.l0).LJIIL();
    }

    public static final void onAnimationEnd$2(ALAdapterS27S0100000_33 aLAdapterS27S0100000_33, Animator animator) {
        super.onAnimationEnd(animator);
        ((C21574419by) aLAdapterS27S0100000_33.l0).LJIIIIZZ();
    }

    public static final void onAnimationEnd$20(ALAdapterS27S0100000_33 aLAdapterS27S0100000_33, Animator animator) {
        super.onAnimationEnd(animator);
        C1AG4 c1ag4 = (C1AG4) aLAdapterS27S0100000_33.l0;
        c1ag4.LLILLL.setShader(c1ag4.LLILZ.getShader());
        C1AG4 c1ag42 = (C1AG4) aLAdapterS27S0100000_33.l0;
        c1ag42.LLJ = c1ag42.LLIZ;
        c1ag42.LLJI = c1ag42.LLIZLLLIL;
        c1ag42.LLILZIL = 0.0f;
        c1ag42.LLJIJIL = false;
        SharedPreferences.Editor editorEdit = c1ag42.LLJILJIL.edit();
        editorEdit.putFloat("qr_code_background_sp_center_x", ((C1AG4) aLAdapterS27S0100000_33.l0).LLJ);
        editorEdit.putFloat("qr_code_background_sp_center_y", ((C1AG4) aLAdapterS27S0100000_33.l0).LLJI);
        editorEdit.putInt("qr_code_background_sp_color_index", ((C1AG4) aLAdapterS27S0100000_33.l0).LL);
        editorEdit.apply();
    }

    public static final void onAnimationEnd$21(ALAdapterS27S0100000_33 aLAdapterS27S0100000_33, Animator animator) {
        ((C19P3) aLAdapterS27S0100000_33.l0).setTextVisible(4);
        Paint paint = ((C19P3) aLAdapterS27S0100000_33.l0).LLJJIII;
        if (paint != null) {
            paint.setAlpha(255);
        }
        super.onAnimationEnd(animator);
    }

    public static final void onAnimationEnd$22(ALAdapterS27S0100000_33 aLAdapterS27S0100000_33, Animator animator) {
        EnumC21577619cU enumC21577619cU;
        EnumC21577619cU enumC21577619cU2;
        C21576919cN c21576919cN = (C21576919cN) aLAdapterS27S0100000_33.l0;
        c21576919cN.LLLLZI = null;
        if (c21576919cN.LLILLJJLI == 0 && (enumC21577619cU = c21576919cN.LLLLLLL) != (enumC21577619cU2 = EnumC21577619cU.None) && !enumC21577619cU.isOpening && !enumC21577619cU.isDragging) {
            c21576919cN.LJIILIIL(enumC21577619cU2);
            return;
        }
        EnumC21577619cU enumC21577619cU3 = c21576919cN.LLLLLLL;
        if (enumC21577619cU3 == c21576919cN.LLLLLLLLL) {
            return;
        }
        c21576919cN.setViceState(enumC21577619cU3);
    }

    public static final void onAnimationEnd$23(ALAdapterS27S0100000_33 aLAdapterS27S0100000_33, Animator animator) {
        RunnableC21577219cQ runnableC21577219cQ = (RunnableC21577219cQ) ((ARunnableS44S0101000_33) aLAdapterS27S0100000_33.l0).l0;
        C21576919cN c21576919cN = runnableC21577219cQ.LLILZIL;
        c21576919cN.LLLLLZ = false;
        if (runnableC21577219cQ.LLILLL) {
            c21576919cN.LJIILL(true);
        }
        C21576919cN c21576919cN2 = ((RunnableC21577219cQ) ((ARunnableS44S0101000_33) aLAdapterS27S0100000_33.l0).l0).LLILZIL;
        if (c21576919cN2.LLLLLLL == EnumC21577619cU.LoadFinish) {
            c21576919cN2.LJIILIIL(EnumC21577619cU.None);
        }
    }

    public static final void onAnimationEnd$24(ALAdapterS27S0100000_33 aLAdapterS27S0100000_33, Animator animator) {
        C21576919cN c21576919cN = ((RunnableC21577519cT) aLAdapterS27S0100000_33.l0).LLILZ;
        if (c21576919cN.LLLLZI != null) {
            c21576919cN.LLLLZI = null;
            EnumC21577619cU enumC21577619cU = c21576919cN.LLLLLLL;
            EnumC21577619cU enumC21577619cU2 = EnumC21577619cU.ReleaseToRefresh;
            if (enumC21577619cU != enumC21577619cU2) {
                c21576919cN.LLLLLLJ.LIZJ(enumC21577619cU2);
            }
            ((RunnableC21577519cT) aLAdapterS27S0100000_33.l0).LLILZ.setStateRefreshing(!r0.LLILLL);
        }
    }

    public static final void onAnimationEnd$3(ALAdapterS27S0100000_33 aLAdapterS27S0100000_33, Animator animator) {
        C21580119ct c21580119ct = (C21580119ct) aLAdapterS27S0100000_33.l0;
        c21580119ct.LLJIJIL = false;
        Iterator<InterfaceC21580219cu> it2 = c21580119ct.LL.iterator();
        while (it2.hasNext()) {
            it2.next().b3();
        }
    }

    public static final void onAnimationEnd$4(ALAdapterS27S0100000_33 aLAdapterS27S0100000_33, Animator animator) {
        super.onAnimationEnd(animator);
        ((VideoRelationBtnAssem) aLAdapterS27S0100000_33.l0).Gp().wQ2(false);
    }

    public static final void onAnimationEnd$5(ALAdapterS27S0100000_33 aLAdapterS27S0100000_33, Animator animator) {
        ((IMEditSendButtonAssem) aLAdapterS27S0100000_33.l0).LLJJJIL = true;
    }

    public static final void onAnimationEnd$6(ALAdapterS27S0100000_33 aLAdapterS27S0100000_33, Animator animator) {
        super.onAnimationEnd(animator);
        ((C21570319bJ) aLAdapterS27S0100000_33.l0).getClass();
    }

    public static final void onAnimationEnd$7(ALAdapterS27S0100000_33 aLAdapterS27S0100000_33, Animator animator) {
        super.onAnimationEnd(animator);
        ((C21570319bJ) aLAdapterS27S0100000_33.l0).LLJJJJJIL = null;
    }

    public static final void onAnimationEnd$8(ALAdapterS27S0100000_33 aLAdapterS27S0100000_33, Animator animator) {
        super.onAnimationEnd(animator);
        ((C21572519bf) aLAdapterS27S0100000_33.l0).LJIIL();
    }

    public static final void onAnimationEnd$9(ALAdapterS27S0100000_33 aLAdapterS27S0100000_33, Animator animator) {
        ((C21567719at) aLAdapterS27S0100000_33.l0).LL = false;
    }

    public static final void onAnimationPause$0(ALAdapterS27S0100000_33 aLAdapterS27S0100000_33, Animator animator) {
        ((C21567019am) aLAdapterS27S0100000_33.l0).LLLIZZ = false;
    }

    public static final void onAnimationStart$0(ALAdapterS27S0100000_33 aLAdapterS27S0100000_33, Animator animator) {
        ((C21580119ct) aLAdapterS27S0100000_33.l0).LLJIJIL = true;
    }

    public static final void onAnimationStart$2(ALAdapterS27S0100000_33 aLAdapterS27S0100000_33, Animator animator) {
        ((AbstractC2217051Bpv) aLAdapterS27S0100000_33.l0).LJIL.setValue(0);
    }

    public static final void onAnimationStart$3(ALAdapterS27S0100000_33 aLAdapterS27S0100000_33, Animator animator) {
        C21567719at c21567719at = (C21567719at) aLAdapterS27S0100000_33.l0;
        c21567719at.LL = true;
        c21567719at.LLILLJJLI = true;
    }

    public static final void onAnimationStart$4(ALAdapterS27S0100000_33 aLAdapterS27S0100000_33, Animator animator) {
        C21567719at c21567719at = (C21567719at) aLAdapterS27S0100000_33.l0;
        c21567719at.LL = true;
        c21567719at.LLILLJJLI = false;
    }

    public static final void onAnimationStart$5(ALAdapterS27S0100000_33 aLAdapterS27S0100000_33, Animator animator) {
        super.onAnimationStart(animator);
        ((C1AG4) aLAdapterS27S0100000_33.l0).LLJIJIL = true;
    }
}
