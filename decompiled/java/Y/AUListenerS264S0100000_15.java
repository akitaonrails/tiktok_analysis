package Y;

import X.AbstractC1143290frD;
import X.C1088120eQE;
import X.C1105630esT;
import X.C1143300frE;
import X.C16F5;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C939720aYs;
import X.C939740aYu;
import X.C940240aZi;
import X.C941320abS;
import X.C950660aqW;
import X.C961940b8i;
import X.C986580bmS;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import X.ViewOnClickListenerC986770bml;
import android.animation.ValueAnimator;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.multihost.biz.dialog.LinkDialog;
import com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.BaseMultiHostInviteListFragment;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: loaded from: classes16.dex */
public class AUListenerS264S0100000_15 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public Object l0;

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$t) {
            case 0:
                onAnimationUpdate$0(this, valueAnimator);
                break;
            case 1:
                onAnimationUpdate$1(this, valueAnimator);
                break;
            case 2:
                onAnimationUpdate$2(this, valueAnimator);
                break;
            case 3:
                onAnimationUpdate$3(this, valueAnimator);
                break;
            case 4:
                onAnimationUpdate$4(this, valueAnimator);
                break;
            case 5:
                onAnimationUpdate$5(this, valueAnimator);
                break;
            case 6:
                onAnimationUpdate$6(this, valueAnimator);
                break;
            case 7:
                onAnimationUpdate$7(this, valueAnimator);
                break;
            case 8:
                onAnimationUpdate$8(this, valueAnimator);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onAnimationUpdate$9(this, valueAnimator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onAnimationUpdate$10(this, valueAnimator);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onAnimationUpdate$11(this, valueAnimator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onAnimationUpdate$12(this, valueAnimator);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onAnimationUpdate$13(this, valueAnimator);
                break;
            case 14:
                onAnimationUpdate$14(this, valueAnimator);
                break;
            case 15:
                onAnimationUpdate$15(this, valueAnimator);
                break;
            case 16:
                onAnimationUpdate$16(this, valueAnimator);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                onAnimationUpdate$17(this, valueAnimator);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                onAnimationUpdate$18(this, valueAnimator);
                break;
            case 19:
                onAnimationUpdate$19(this, valueAnimator);
                break;
        }
    }

    public AUListenerS264S0100000_15(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationUpdate$0(AUListenerS264S0100000_15 aUListenerS264S0100000_15, ValueAnimator valueAnimator) {
        C950660aqW c950660aqW = ((C961940b8i) aUListenerS264S0100000_15.l0).LLILLL;
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c950660aqW);
        c950660aqW.setTranslationY(fFloatValue);
    }

    public static final void onAnimationUpdate$1(AUListenerS264S0100000_15 aUListenerS264S0100000_15, ValueAnimator valueAnimator) {
        C950660aqW c950660aqW = ((C961940b8i) aUListenerS264S0100000_15.l0).LLILLL;
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c950660aqW);
        c950660aqW.setTranslationY(fFloatValue);
    }

    public static final void onAnimationUpdate$10(AUListenerS264S0100000_15 aUListenerS264S0100000_15, ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        LiveIconView liveIconView = ((BaseMultiHostInviteListFragment) aUListenerS264S0100000_15.l0).LLJJJIL;
        if (liveIconView != null) {
            liveIconView.setIconTint(iIntValue);
        }
        C16F5 c16f5 = ((BaseMultiHostInviteListFragment) aUListenerS264S0100000_15.l0).LLJJJ;
        if (c16f5 != null) {
            c16f5.setTextColor(iIntValue);
        }
    }

    public static final void onAnimationUpdate$11(AUListenerS264S0100000_15 aUListenerS264S0100000_15, ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        LiveIconView liveIconView = ((BaseMultiHostInviteListFragment) aUListenerS264S0100000_15.l0).LLJJJIL;
        if (liveIconView != null) {
            liveIconView.setIconTint(iIntValue);
        }
        C16F5 c16f5 = ((BaseMultiHostInviteListFragment) aUListenerS264S0100000_15.l0).LLJJJ;
        if (c16f5 != null) {
            c16f5.setTextColor(iIntValue);
        }
    }

    public static final void onAnimationUpdate$12(AUListenerS264S0100000_15 aUListenerS264S0100000_15, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C786410Ut5.cc((C986580bmS) aUListenerS264S0100000_15.l0, fFloatValue);
        C786410Ut5.zc((C986580bmS) aUListenerS264S0100000_15.l0, fFloatValue);
    }

    public static final void onAnimationUpdate$13(AUListenerS264S0100000_15 aUListenerS264S0100000_15, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C786410Ut5.cc((C986580bmS) aUListenerS264S0100000_15.l0, fFloatValue);
        C786410Ut5.zc((C986580bmS) aUListenerS264S0100000_15.l0, fFloatValue);
    }

    public static final void onAnimationUpdate$14(AUListenerS264S0100000_15 aUListenerS264S0100000_15, ValueAnimator valueAnimator) {
        C1105630esT c1105630esT = ((C939740aYu) aUListenerS264S0100000_15.l0).LLLIILIL;
        if (c1105630esT != null) {
            C786410Ut5.rd(c1105630esT, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static final void onAnimationUpdate$15(AUListenerS264S0100000_15 aUListenerS264S0100000_15, ValueAnimator valueAnimator) {
        C1105630esT c1105630esT = ((C939740aYu) aUListenerS264S0100000_15.l0).LLLIL;
        if (c1105630esT != null) {
            C786410Ut5.rd(c1105630esT, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static final void onAnimationUpdate$16(AUListenerS264S0100000_15 aUListenerS264S0100000_15, ValueAnimator valueAnimator) {
        C1105630esT c1105630esT = ((C940240aZi) aUListenerS264S0100000_15.l0).LLJILJIL;
        if (c1105630esT == null) {
            c1105630esT = null;
        }
        C786410Ut5.rd(c1105630esT, ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static final void onAnimationUpdate$17(AUListenerS264S0100000_15 aUListenerS264S0100000_15, ValueAnimator valueAnimator) {
        C1105630esT c1105630esT = ((C940240aZi) aUListenerS264S0100000_15.l0).LLJILJILJ;
        if (c1105630esT != null) {
            C786410Ut5.rd(c1105630esT, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static final void onAnimationUpdate$18(AUListenerS264S0100000_15 aUListenerS264S0100000_15, ValueAnimator valueAnimator) {
        ((LinkDialog) aUListenerS264S0100000_15.l0).getClass();
    }

    public static final void onAnimationUpdate$19(AUListenerS264S0100000_15 aUListenerS264S0100000_15, ValueAnimator valueAnimator) {
        ((LinkDialog) aUListenerS264S0100000_15.l0).getClass();
    }

    public static final void onAnimationUpdate$2(AUListenerS264S0100000_15 aUListenerS264S0100000_15, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C786410Ut5.cc((C986580bmS) aUListenerS264S0100000_15.l0, fFloatValue);
        C786410Ut5.zc((C986580bmS) aUListenerS264S0100000_15.l0, fFloatValue);
    }

    public static final void onAnimationUpdate$3(AUListenerS264S0100000_15 aUListenerS264S0100000_15, ValueAnimator valueAnimator) {
        C1105630esT c1105630esT = ((C939720aYs) aUListenerS264S0100000_15.l0).onlineTicket;
        if (c1105630esT == null) {
            c1105630esT = null;
        }
        C786410Ut5.rd(c1105630esT, ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static final void onAnimationUpdate$4(AUListenerS264S0100000_15 aUListenerS264S0100000_15, ValueAnimator valueAnimator) {
        C1105630esT c1105630esT = ((C939720aYs) aUListenerS264S0100000_15.l0).onlineTicketAnimation;
        if (c1105630esT != null) {
            C786410Ut5.rd(c1105630esT, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static final void onAnimationUpdate$5(AUListenerS264S0100000_15 aUListenerS264S0100000_15, ValueAnimator valueAnimator) {
        C16F5 takeTheStageScoreText = ((ViewOnClickListenerC986770bml) aUListenerS264S0100000_15.l0).getTakeTheStageScoreText();
        if (takeTheStageScoreText != null) {
            C786410Ut5.ac(takeTheStageScoreText, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
        C16F5 takeTheStageScoreText2 = ((ViewOnClickListenerC986770bml) aUListenerS264S0100000_15.l0).getTakeTheStageScoreText();
        if (takeTheStageScoreText2 != null) {
            C786410Ut5.yc(takeTheStageScoreText2, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static final void onAnimationUpdate$6(AUListenerS264S0100000_15 aUListenerS264S0100000_15, ValueAnimator valueAnimator) {
        C786410Ut5.jd(((ViewOnClickListenerC986770bml) aUListenerS264S0100000_15.l0).getProfileContainer(), ((Float) valueAnimator.getAnimatedValue()).floatValue());
        C786410Ut5.ed(((ViewOnClickListenerC986770bml) aUListenerS264S0100000_15.l0).getViewScreenShareInfo(), ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static final void onAnimationUpdate$7(AUListenerS264S0100000_15 aUListenerS264S0100000_15, ValueAnimator valueAnimator) {
        C786410Ut5.jd(((ViewOnClickListenerC986770bml) aUListenerS264S0100000_15.l0).getProfileContainer(), ((Float) valueAnimator.getAnimatedValue()).floatValue());
        C786410Ut5.ed(((ViewOnClickListenerC986770bml) aUListenerS264S0100000_15.l0).getViewScreenShareInfo(), ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static final void onAnimationUpdate$8(AUListenerS264S0100000_15 aUListenerS264S0100000_15, ValueAnimator valueAnimator) {
        if (valueAnimator.getAnimatedValue() instanceof Integer) {
            ((C1088120eQE) aUListenerS264S0100000_15.l0).setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
            C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("addUpdateListener-> ");
            sbLIZ.append(((Integer) valueAnimator.getAnimatedValue()).intValue());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c1143300frELJIIJJI.getClass();
            AbstractC1143290frD.LIZ("LiveShowTimeStickerCountdownView", strLIZIZ);
        }
    }

    public static final void onAnimationUpdate$9(AUListenerS264S0100000_15 aUListenerS264S0100000_15, ValueAnimator valueAnimator) {
        C941320abS c941320abS = (C941320abS) aUListenerS264S0100000_15.l0;
        float f = c941320abS.LJI;
        c941320abS.LJ = f + ((c941320abS.LJFF - f) * (1 - ((Float) valueAnimator.getAnimatedValue()).floatValue()));
        C941320abS c941320abS2 = (C941320abS) aUListenerS264S0100000_15.l0;
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C941320abS c941320abS3 = (C941320abS) aUListenerS264S0100000_15.l0;
        c941320abS2.LJIIIIZZ = fFloatValue * c941320abS3.LJII;
        c941320abS3.LJIIIZ.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 200));
        long jCurrentTimeMillis = System.currentTimeMillis();
        C941320abS c941320abS4 = (C941320abS) aUListenerS264S0100000_15.l0;
        if (jCurrentTimeMillis - c941320abS4.LJIIJJI >= c941320abS4.LJIIJ) {
            c941320abS4.LJIIJJI = jCurrentTimeMillis;
            c941320abS4.invalidateSelf();
        }
    }

    public AUListenerS264S0100000_15(LinkDialog linkDialog, ValueAnimator valueAnimator, int i) {
        this.$t = i;
        this.l0 = linkDialog;
    }
}
