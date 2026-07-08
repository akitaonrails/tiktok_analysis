package Y;

import X.C12CY;
import X.C12EU;
import X.C12K1;
import X.C12O6;
import X.C12O7;
import X.C12TF;
import X.C12TG;
import X.C12U9;
import X.C12UA;
import X.C12UE;
import X.C12UF;
import X.C16F5;
import X.C19383610sU;
import X.C19385010si;
import X.C19393810u8;
import X.C19395810uS;
import X.C19396110uV;
import X.C19415510xd;
import X.C19415610xe;
import X.C19415710xf;
import X.C19415910xh;
import X.C19416110xj;
import X.C19416210xk;
import X.C19416310xl;
import X.C19416410xm;
import X.C19416610xo;
import X.C194434115c;
import X.C194443115l;
import X.C19461011Bw;
import X.C19471511Fx;
import X.C19508311Ub;
import X.C19639311sd;
import X.C19649211uE;
import X.C19739112Kv;
import X.C19747412Oa;
import X.C19759912Sv;
import X.C19762412Tu;
import X.C19762612Tw;
import X.C19762712Tx;
import X.C19762912Tz;
import X.C19768212Wa;
import X.C19771612Xi;
import X.C1DPV;
import X.C1DPX;
import X.C21533219Ow;
import X.C786410Ut5;
import X.EnumC1641610sox;
import X.InterfaceC1452170ntP;
import X.InterfaceC19395910uT;
import X.InterfaceC19675911yX;
import X.InterfaceC19717212Ck;
import X.InterfaceC679410Qkt;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LiveData;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.hybrid.spark.anim.BottomSheetBehavior;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.audiorecord.Point;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.extend.ExtendAlbumAssem;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishPreviewActivity;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoBottomBarViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel;
import com.ss.android.ugc.aweme.shortvideo.image.ExpandedTitleModule;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.feed.guidecard.component.StoryGuidePhotoAnimComponent;
import com.tts.oecverify.BdTuring;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import nv7.c0;

/* JADX INFO: loaded from: classes30.dex */
public class AUListenerS277S0100000_29 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public Object l0;

    public static final void onAnimationUpdate$15(AUListenerS277S0100000_29 aUListenerS277S0100000_29, ValueAnimator valueAnimator) {
        C12K1.LIZ((C12K1) aUListenerS277S0100000_29.l0, valueAnimator);
    }

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
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                onAnimationUpdate$20(this, valueAnimator);
                break;
            case 21:
                onAnimationUpdate$21(this, valueAnimator);
                break;
            case 22:
                onAnimationUpdate$22(this, valueAnimator);
                break;
            case 23:
                onAnimationUpdate$23(this, valueAnimator);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                onAnimationUpdate$24(this, valueAnimator);
                break;
            case 25:
                onAnimationUpdate$25(this, valueAnimator);
                break;
            case 26:
                onAnimationUpdate$26(this, valueAnimator);
                break;
            case 27:
                onAnimationUpdate$27(this, valueAnimator);
                break;
            case 28:
                onAnimationUpdate$28(this, valueAnimator);
                break;
            case 29:
                onAnimationUpdate$29(this, valueAnimator);
                break;
            case 30:
                onAnimationUpdate$30(this, valueAnimator);
                break;
            case 31:
                onAnimationUpdate$31(this, valueAnimator);
                break;
            case 32:
                onAnimationUpdate$32(this, valueAnimator);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                onAnimationUpdate$33(this, valueAnimator);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                onAnimationUpdate$34(this, valueAnimator);
                break;
            case 35:
                onAnimationUpdate$35(this, valueAnimator);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                onAnimationUpdate$36(this, valueAnimator);
                break;
            case 37:
                onAnimationUpdate$37(this, valueAnimator);
                break;
            case 38:
                onAnimationUpdate$38(this, valueAnimator);
                break;
            case 39:
                onAnimationUpdate$39(this, valueAnimator);
                break;
            case 40:
                onAnimationUpdate$40(this, valueAnimator);
                break;
            case 41:
                onAnimationUpdate$41(this, valueAnimator);
                break;
            case 42:
                onAnimationUpdate$42(this, valueAnimator);
                break;
            case 43:
                onAnimationUpdate$43(this, valueAnimator);
                break;
            case 44:
                onAnimationUpdate$44(this, valueAnimator);
                break;
            case 45:
                onAnimationUpdate$45(this, valueAnimator);
                break;
            case 46:
                onAnimationUpdate$46(this, valueAnimator);
                break;
            case 47:
                onAnimationUpdate$47(this, valueAnimator);
                break;
            case 48:
                onAnimationUpdate$48(this, valueAnimator);
                break;
            case 49:
                onAnimationUpdate$49(this, valueAnimator);
                break;
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                onAnimationUpdate$50(this, valueAnimator);
                break;
            case 51:
                onAnimationUpdate$51(this, valueAnimator);
                break;
            case 52:
                onAnimationUpdate$52(this, valueAnimator);
                break;
            case 53:
                onAnimationUpdate$53(this, valueAnimator);
                break;
            case 54:
                onAnimationUpdate$54(this, valueAnimator);
                break;
            case 55:
                onAnimationUpdate$55(this, valueAnimator);
                break;
            case 56:
                onAnimationUpdate$56(this, valueAnimator);
                break;
            case 57:
                onAnimationUpdate$57(this, valueAnimator);
                break;
            case 58:
                onAnimationUpdate$58(this, valueAnimator);
                break;
            case 59:
                onAnimationUpdate$59(this, valueAnimator);
                break;
            case 60:
                onAnimationUpdate$60(this, valueAnimator);
                break;
            case 61:
                onAnimationUpdate$61(this, valueAnimator);
                break;
            case BaseNotice.CREATOR /* 62 */:
                onAnimationUpdate$62(this, valueAnimator);
                break;
            case 63:
                onAnimationUpdate$63(this, valueAnimator);
                break;
            case 64:
                onAnimationUpdate$64(this, valueAnimator);
                break;
            case 65:
                onAnimationUpdate$65(this, valueAnimator);
                break;
            case 66:
                onAnimationUpdate$66(this, valueAnimator);
                break;
            case 67:
                onAnimationUpdate$67(this, valueAnimator);
                break;
            case 68:
                onAnimationUpdate$68(this, valueAnimator);
                break;
            case 69:
                onAnimationUpdate$69(this, valueAnimator);
                break;
            case 70:
                onAnimationUpdate$70(this, valueAnimator);
                break;
            case 71:
                onAnimationUpdate$71(this, valueAnimator);
                break;
            case DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE /* 72 */:
                onAnimationUpdate$72(this, valueAnimator);
                break;
            case 73:
                onAnimationUpdate$73(this, valueAnimator);
                break;
            case 74:
                onAnimationUpdate$74(this, valueAnimator);
                break;
        }
    }

    public AUListenerS277S0100000_29(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationUpdate$0(AUListenerS277S0100000_29 aUListenerS277S0100000_29, ValueAnimator valueAnimator) {
        ((FrameLayout) aUListenerS277S0100000_29.l0).getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ((FrameLayout) aUListenerS277S0100000_29.l0).requestLayout();
    }

    public static final void onAnimationUpdate$1(AUListenerS277S0100000_29 aUListenerS277S0100000_29, ValueAnimator valueAnimator) {
        C786410Ut5.T4((View) aUListenerS277S0100000_29.l0, ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static final void onAnimationUpdate$10(AUListenerS277S0100000_29 aUListenerS277S0100000_29, ValueAnimator valueAnimator) {
        ((C19762912Tz) aUListenerS277S0100000_29.l0).LLILLJJLI = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ((C19762912Tz) aUListenerS277S0100000_29.l0).invalidate();
    }

    public static final void onAnimationUpdate$11(AUListenerS277S0100000_29 aUListenerS277S0100000_29, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ImageView imageView = ((C19762712Tx) aUListenerS277S0100000_29.l0).LL;
        ImageView imageView2 = null;
        if (imageView == null) {
            imageView = null;
        }
        C786410Ut5.Qb(imageView, fFloatValue);
        ImageView imageView3 = ((C19762712Tx) aUListenerS277S0100000_29.l0).LL;
        if (imageView3 != null) {
            imageView2 = imageView3;
        }
        C786410Ut5.rc(imageView2, fFloatValue);
    }

    public static final void onAnimationUpdate$12(AUListenerS277S0100000_29 aUListenerS277S0100000_29, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ImageView imageView = ((C19762712Tx) aUListenerS277S0100000_29.l0).LL;
        ImageView imageView2 = null;
        if (imageView == null) {
            imageView = null;
        }
        C786410Ut5.Qb(imageView, fFloatValue);
        ImageView imageView3 = ((C19762712Tx) aUListenerS277S0100000_29.l0).LL;
        if (imageView3 != null) {
            imageView2 = imageView3;
        }
        C786410Ut5.rc(imageView2, fFloatValue);
    }

    public static final void onAnimationUpdate$13(AUListenerS277S0100000_29 aUListenerS277S0100000_29, ValueAnimator valueAnimator) {
        C19762612Tw c19762612Tw = (C19762612Tw) aUListenerS277S0100000_29.l0;
        InterfaceC1452170ntP interfaceC1452170ntP = c19762612Tw.LLJILJIL;
        if (interfaceC1452170ntP == null) {
            return;
        }
        c19762612Tw.LLLJ().setValue(Long.valueOf(interfaceC1452170ntP.LLL()));
        float fLLL = interfaceC1452170ntP.LLL() / interfaceC1452170ntP.getDuration();
        C19762412Tu c19762412Tu = ((C19762612Tw) aUListenerS277S0100000_29.l0).LLLFZ;
        View view = null;
        if (c19762412Tu == null) {
            c19762412Tu = null;
        }
        c19762412Tu.LJIILL(fLLL);
        C19762612Tw c19762612Tw2 = (C19762612Tw) aUListenerS277S0100000_29.l0;
        if (c19762612Tw2.LLJJIJI) {
            C19762412Tu c19762412Tu2 = c19762612Tw2.LLLFZ;
            if (c19762412Tu2 == null) {
                c19762412Tu2 = null;
            }
            int iLIZ = c19762412Tu2.LIZ(interfaceC1452170ntP.LLL(), ((C19762612Tw) aUListenerS277S0100000_29.l0).LLJJJ);
            C19762412Tu c19762412Tu3 = ((C19762612Tw) aUListenerS277S0100000_29.l0).LLLFZ;
            if (c19762412Tu3 == null) {
                c19762412Tu3 = null;
            }
            c19762412Tu3.LIZIZ();
            if (iLIZ == -1) {
                Point point = ((C19762612Tw) aUListenerS277S0100000_29.l0).LLJJJ;
                if (point != null) {
                    point.setY(interfaceC1452170ntP.LLL());
                }
                C19762412Tu c19762412Tu4 = ((C19762612Tw) aUListenerS277S0100000_29.l0).LLLFZ;
                if (c19762412Tu4 == null) {
                    c19762412Tu4 = null;
                }
                c19762412Tu4.LIZIZ();
            } else {
                Point point2 = ((C19762612Tw) aUListenerS277S0100000_29.l0).LLJJJ;
                if (point2 != null) {
                    point2.setY(iLIZ);
                }
                C19762412Tu c19762412Tu5 = ((C19762612Tw) aUListenerS277S0100000_29.l0).LLLFZ;
                if (c19762412Tu5 == null) {
                    c19762412Tu5 = null;
                }
                c19762412Tu5.LIZIZ();
                ((C19762612Tw) aUListenerS277S0100000_29.l0).LLLLII(iLIZ, C1DPV.LIZIZ.LIZJ(C1DPX.STOP_AUDIO_RECORD_BTN_ANIM_END, EnumC1641610sox.USER_OPERATION), false);
            }
        } else {
            c19762612Tw2.LLJJJ = null;
        }
        int iLLL = interfaceC1452170ntP.LLL();
        C19762612Tw c19762612Tw3 = (C19762612Tw) aUListenerS277S0100000_29.l0;
        if (iLLL >= c19762612Tw3.LLJILJILJ) {
            if (c19762612Tw3.LLJJIJI) {
                c19762612Tw3.LLLLII(-1, C1DPV.LIZIZ.LIZJ(C1DPX.STOP_AUDIO_DURATION_END, EnumC1641610sox.USER_OPERATION), true);
                return;
            }
            c19762612Tw3.LLJJIII.cancel();
            ((C19762612Tw) aUListenerS277S0100000_29.l0).LLLLIILL.LIZ(0.0f, true);
            C19762412Tu c19762412Tu6 = ((C19762612Tw) aUListenerS277S0100000_29.l0).LLLFZ;
            if (c19762412Tu6 == null) {
                c19762412Tu6 = null;
            }
            c19762412Tu6.LJIILL(0.0f);
            C19762612Tw c19762612Tw4 = (C19762612Tw) aUListenerS277S0100000_29.l0;
            AudioRecorderParam audioRecorderParam = c19762612Tw4.LLLJIL;
            C19762412Tu c19762412Tu7 = c19762612Tw4.LLLFZ;
            if (c19762412Tu7 == null) {
                c19762412Tu7 = null;
            }
            audioRecorderParam.setMStack(c19762412Tu7.getStack());
            if (((C19762612Tw) aUListenerS277S0100000_29.l0).LLLJIL.getMStack().isEmpty()) {
                View view2 = ((C19762612Tw) aUListenerS277S0100000_29.l0).LLLIIIL;
                if (view2 != null) {
                    view = view2;
                }
                C786410Ut5.LJLLLLLL(8, view);
                return;
            }
            View view3 = ((C19762612Tw) aUListenerS277S0100000_29.l0).LLLIIIL;
            if (view3 != null) {
                view = view3;
            }
            C786410Ut5.LJLLLLLL(0, view);
        }
    }

    public static final void onAnimationUpdate$14(AUListenerS277S0100000_29 aUListenerS277S0100000_29, ValueAnimator valueAnimator) {
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            float fFloatValue = f.floatValue();
            SmartImageView smartImageViewEp = ((StoryGuidePhotoAnimComponent) aUListenerS277S0100000_29.l0).ep();
            if (smartImageViewEp != null) {
                C786410Ut5.fc(smartImageViewEp, fFloatValue);
            }
            SmartImageView smartImageViewEp2 = ((StoryGuidePhotoAnimComponent) aUListenerS277S0100000_29.l0).ep();
            if (smartImageViewEp2 != null) {
                C786410Ut5.Bc(smartImageViewEp2, fFloatValue);
            }
        }
    }

    public static final void onAnimationUpdate$16(AUListenerS277S0100000_29 aUListenerS277S0100000_29, ValueAnimator valueAnimator) {
        ((C19739112Kv) aUListenerS277S0100000_29.l0).LLJI = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C19739112Kv c19739112Kv = (C19739112Kv) aUListenerS277S0100000_29.l0;
        float f = c19739112Kv.LLJI;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19739112Kv);
        c19739112Kv.setAlpha(f);
        ((C19739112Kv) aUListenerS277S0100000_29.l0).getClass();
    }

    public static final void onAnimationUpdate$17(AUListenerS277S0100000_29 aUListenerS277S0100000_29, ValueAnimator valueAnimator) {
        C786410Ut5.cd(((Float) valueAnimator.getAnimatedValue()).floatValue() + ((ExpandedTitleModule) aUListenerS277S0100000_29.l0).LLJJIJI.getLayoutParams().height, ((ExpandedTitleModule) aUListenerS277S0100000_29.l0).LLJJIJIL);
    }

    public static final void onAnimationUpdate$18(AUListenerS277S0100000_29 aUListenerS277S0100000_29, ValueAnimator valueAnimator) {
        C786410Ut5.cd(((Float) valueAnimator.getAnimatedValue()).floatValue() + ((ExpandedTitleModule) aUListenerS277S0100000_29.l0).LLJJIJI.getLayoutParams().height, ((ExpandedTitleModule) aUListenerS277S0100000_29.l0).LLJJIJIL);
    }

    public static final void onAnimationUpdate$19(AUListenerS277S0100000_29 aUListenerS277S0100000_29, ValueAnimator valueAnimator) {
        Integer num;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            int iIntValue = num.intValue();
            FrameLayout frameLayout = ((C19639311sd) aUListenerS277S0100000_29.l0).LLJILLL;
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            if (layoutParams.height != iIntValue) {
                layoutParams.height = iIntValue;
                C786410Ut5.W5(frameLayout, layoutParams);
            }
        }
    }

    public static final void onAnimationUpdate$2(AUListenerS277S0100000_29 aUListenerS277S0100000_29, ValueAnimator valueAnimator) {
        ExtendAlbumAssem extendAlbumAssem = (ExtendAlbumAssem) aUListenerS277S0100000_29.l0;
        InterfaceC19675911yX interfaceC19675911yX = extendAlbumAssem.LLJJIJIIJIL;
        if (interfaceC19675911yX != null) {
            interfaceC19675911yX.LIZLLL(extendAlbumAssem.LLJJIJI - ((int) ((Float) valueAnimator.getAnimatedValue()).floatValue()));
        }
    }

    public static final void onAnimationUpdate$20(AUListenerS277S0100000_29 aUListenerS277S0100000_29, ValueAnimator valueAnimator) {
        ((View) aUListenerS277S0100000_29.l0).setBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    public static final void onAnimationUpdate$21(AUListenerS277S0100000_29 aUListenerS277S0100000_29, ValueAnimator valueAnimator) {
        View view = ((C19383610sU) aUListenerS277S0100000_29.l0).LLILLJJLI;
        if (view != null) {
            C786410Ut5.T4(view, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static final void onAnimationUpdate$22(AUListenerS277S0100000_29 aUListenerS277S0100000_29, ValueAnimator valueAnimator) {
        View view = ((C19385010si) aUListenerS277S0100000_29.l0).LLJI;
        if (view == null) {
            view = null;
        }
        C786410Ut5.T4(view, ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static final void onAnimationUpdate$23(AUListenerS277S0100000_29 aUListenerS277S0100000_29, ValueAnimator valueAnimator) {
        View view = ((C19385010si) aUListenerS277S0100000_29.l0).LLJI;
        if (view == null) {
            view = null;
        }
        C786410Ut5.T4(view, ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static final void onAnimationUpdate$24(AUListenerS277S0100000_29 aUListenerS277S0100000_29, ValueAnimator valueAnimator) {
        ((C12EU) aUListenerS277S0100000_29.l0).LLIZLLLIL = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ((C12EU) aUListenerS277S0100000_29.l0).invalidate();
    }

    public static final void onAnimationUpdate$25(AUListenerS277S0100000_29 aUListenerS277S0100000_29, ValueAnimator valueAnimator) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C19461011Bw c19461011Bw = (C19461011Bw) aUListenerS277S0100000_29.l0;
        if (jCurrentTimeMillis - c19461011Bw.LJIIJ > 64) {
            c19461011Bw.LJIIJ = jCurrentTimeMillis;
            C786410Ut5.Bb(c19461011Bw.LJIILLIIL, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static final void onAnimationUpdate$26(AUListenerS277S0100000_29 aUListenerS277S0100000_29, ValueAnimator valueAnimator) {
        ((C194434115c) aUListenerS277S0100000_29.l0).invalidate();
    }

    public static final void onAnimationUpdate$27(AUListenerS277S0100000_29 aUListenerS277S0100000_29, ValueAnimator valueAnimator) {
        ((C19508311Ub) aUListenerS277S0100000_29.l0).LLJL = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ((C19508311Ub) aUListenerS277S0100000_29.l0).invalidate();
    }

    public static final void onAnimationUpdate$28(AUListenerS277S0100000_29 aUListenerS277S0100000_29, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C786410Ut5.Qb(((C19759912Sv) aUListenerS277S0100000_29.l0).LL, fFloatValue);
        C786410Ut5.rc(((C19759912Sv) aUListenerS277S0100000_29.l0).LL, fFloatValue);
    }

    public static final void onAnimationUpdate$29(AUListenerS277S0100000_29 aUListenerS277S0100000_29, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C786410Ut5.Qb(((C19759912Sv) aUListenerS277S0100000_29.l0).LL, fFloatValue);
        C786410Ut5.rc(((C19759912Sv) aUListenerS277S0100000_29.l0).LL, fFloatValue);
    }

    public static final void onAnimationUpdate$3(AUListenerS277S0100000_29 aUListenerS277S0100000_29, ValueAnimator valueAnimator) {
        ExtendAlbumAssem extendAlbumAssem = (ExtendAlbumAssem) aUListenerS277S0100000_29.l0;
        InterfaceC19675911yX interfaceC19675911yX = extendAlbumAssem.LLJJIJIIJIL;
        if (interfaceC19675911yX != null) {
            interfaceC19675911yX.LIZLLL(extendAlbumAssem.LLJJIJI - ((int) ((Float) valueAnimator.getAnimatedValue()).floatValue()));
        }
    }

    public static final void onAnimationUpdate$30(AUListenerS277S0100000_29 aUListenerS277S0100000_29, ValueAnimator valueAnimator) {
        ((C12TF) aUListenerS277S0100000_29.l0).LLILLJJLI = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ((C12TF) aUListenerS277S0100000_29.l0).invalidate();
    }

    public static final void onAnimationUpdate$31(AUListenerS277S0100000_29 aUListenerS277S0100000_29, ValueAnimator valueAnimator) {
        ((C12TF) aUListenerS277S0100000_29.l0).LLILLJJLI = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ((C12TF) aUListenerS277S0100000_29.l0).invalidate();
    }

    public static final void onAnimationUpdate$32(AUListenerS277S0100000_29 aUListenerS277S0100000_29, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C786410Ut5.hc(((C12TG) aUListenerS277S0100000_29.l0).LLILZIL, fFloatValue);
        C786410Ut5.Cc(((C12TG) aUListenerS277S0100000_29.l0).LLILZIL, fFloatValue);
        float f = 1.72f - fFloatValue;
        C786410Ut5.hc(((C12TG) aUListenerS277S0100000_29.l0).LLILZLL, f);
        C786410Ut5.Cc(((C12TG) aUListenerS277S0100000_29.l0).LLILZLL, f);
    }

    public static final void onAnimationUpdate$33(AUListenerS277S0100000_29 aUListenerS277S0100000_29, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C786410Ut5.x5(((C12TG) aUListenerS277S0100000_29.l0).LLILZIL, fFloatValue);
        C786410Ut5.x5(((C12TG) aUListenerS277S0100000_29.l0).LLILZLL, 1 - fFloatValue);
    }

    public static final void onAnimationUpdate$34(AUListenerS277S0100000_29 aUListenerS277S0100000_29, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C786410Ut5.hc(((C12TG) aUListenerS277S0100000_29.l0).LLILZIL, fFloatValue);
        C786410Ut5.Cc(((C12TG) aUListenerS277S0100000_29.l0).LLILZIL, fFloatValue);
        float f = 1.72f - fFloatValue;
        C786410Ut5.hc(((C12TG) aUListenerS277S0100000_29.l0).LLILZLL, f);
        C786410Ut5.Cc(((C12TG) aUListenerS277S0100000_29.l0).LLILZLL, f);
    }

    public static final void onAnimationUpdate$35(AUListenerS277S0100000_29 aUListenerS277S0100000_29, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C786410Ut5.x5(((C12TG) aUListenerS277S0100000_29.l0).LLILZIL, fFloatValue);
        C786410Ut5.x5(((C12TG) aUListenerS277S0100000_29.l0).LLILZLL, 1 - fFloatValue);
    }

    public static final void onAnimationUpdate$36(AUListenerS277S0100000_29 aUListenerS277S0100000_29, ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ((BottomSheetBehavior) aUListenerS277S0100000_29.l0).getClass();
    }

    public static final void onAnimationUpdate$37(AUListenerS277S0100000_29 aUListenerS277S0100000_29, ValueAnimator valueAnimator) {
        C786410Ut5.V4(((FTCVideoPublishPreviewActivity) aUListenerS277S0100000_29.l0).LLLLZLLIL(), ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static final void onAnimationUpdate$38(AUListenerS277S0100000_29 aUListenerS277S0100000_29, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C19771612Xi c19771612Xi = (C19771612Xi) aUListenerS277S0100000_29.l0;
        View view = c19771612Xi.LLIZLLLIL;
        float f = c19771612Xi.LLILLJJLI;
        C786410Ut5.Fd(view, f + ((c19771612Xi.LLILLL - f) * fFloatValue));
        if (fFloatValue == 1.0f) {
            C19771612Xi c19771612Xi2 = (C19771612Xi) aUListenerS277S0100000_29.l0;
            c19771612Xi2.LIZIZ(((C19771612Xi) aUListenerS277S0100000_29.l0).getItemTextSelectColor(), c19771612Xi2.getContainer().getChildAt(((C19771612Xi) aUListenerS277S0100000_29.l0).LL));
        }
    }

    public static final void onAnimationUpdate$39(AUListenerS277S0100000_29 aUListenerS277S0100000_29, ValueAnimator valueAnimator) {
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            float fFloatValue = f.floatValue();
            TuxIconView tuxIconView = ((C194443115l) aUListenerS277S0100000_29.l0).LIZLLL;
            if (tuxIconView != null) {
                C786410Ut5.vd(tuxIconView, -fFloatValue);
            }
        }
    }

    public static final void onAnimationUpdate$4(AUListenerS277S0100000_29 aUListenerS277S0100000_29, ValueAnimator valueAnimator) {
        ((C12UF) aUListenerS277S0100000_29.l0).LLILLJJLI = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ((C12UF) aUListenerS277S0100000_29.l0).invalidate();
    }

    public static final void onAnimationUpdate$40(AUListenerS277S0100000_29 aUListenerS277S0100000_29, ValueAnimator valueAnimator) {
        float fFloatValue;
        Float f;
        ConstraintLayout constraintLayout = ((C19416210xk) aUListenerS277S0100000_29.l0).LJI;
        if (constraintLayout != null) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
                fFloatValue = f.floatValue();
            } else {
                fFloatValue = 1.0f;
            }
            C786410Ut5.c5(constraintLayout, fFloatValue);
        }
    }

    public static final void onAnimationUpdate$41(AUListenerS277S0100000_29 aUListenerS277S0100000_29, ValueAnimator valueAnimator) {
        float fFloatValue;
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = 1.0f;
        }
        View view = ((C19415610xe) aUListenerS277S0100000_29.l0).LJ;
        if (view != null) {
            C786410Ut5.T4(view, fFloatValue);
        }
        C16F5 c16f5 = ((C19415610xe) aUListenerS277S0100000_29.l0).LJI;
        if (c16f5 != null) {
            c16f5.setScrollX(0);
        }
    }

    public static final void onAnimationUpdate$42(AUListenerS277S0100000_29 aUListenerS277S0100000_29, ValueAnimator valueAnimator) {
        float fFloatValue;
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = 1.0f;
        }
        View view = ((C19747412Oa) aUListenerS277S0100000_29.l0).LJI;
        if (view != null) {
            C786410Ut5.T4(view, fFloatValue);
        }
    }

    public static final void onAnimationUpdate$43(AUListenerS277S0100000_29 aUListenerS277S0100000_29, ValueAnimator valueAnimator) {
        float fFloatValue;
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = 1.0f;
        }
        LiveIconView liveIconView = ((C19747412Oa) aUListenerS277S0100000_29.l0).LJIIL;
        if (liveIconView != null) {
            C786410Ut5.i5(liveIconView, fFloatValue);
        }
    }

    public static final void onAnimationUpdate$44(AUListenerS277S0100000_29 aUListenerS277S0100000_29, ValueAnimator valueAnimator) {
        LiveIconView liveIconView = ((C12O7) aUListenerS277S0100000_29.l0).LJI;
        if (liveIconView != null) {
            liveIconView.setIconTint(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    public static final void onAnimationUpdate$45(AUListenerS277S0100000_29 aUListenerS277S0100000_29, ValueAnimator valueAnimator) {
        LiveIconView liveIconView = ((C12O7) aUListenerS277S0100000_29.l0).LJI;
        if (liveIconView != null) {
            liveIconView.setIconTint(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    public static final void onAnimationUpdate$46(AUListenerS277S0100000_29 aUListenerS277S0100000_29, ValueAnimator valueAnimator) {
        float fFloatValue;
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = 1.0f;
        }
        View view = ((C19415710xf) aUListenerS277S0100000_29.l0).LJFF;
        if (view != null) {
            C786410Ut5.T4(view, fFloatValue);
        }
    }

    public static final void onAnimationUpdate$47(AUListenerS277S0100000_29 aUListenerS277S0100000_29, ValueAnimator valueAnimator) {
        float fFloatValue;
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        ViewGroup viewGroup = ((C19416310xl) aUListenerS277S0100000_29.l0).LJI;
        if (viewGroup != null) {
            C786410Ut5.R4(fFloatValue, viewGroup);
        }
    }

    public static final void onAnimationUpdate$48(AUListenerS277S0100000_29 aUListenerS277S0100000_29, ValueAnimator valueAnimator) {
        LiveIconView liveIconView = ((C12O7) aUListenerS277S0100000_29.l0).LJI;
        if (liveIconView != null) {
            liveIconView.setIconTint(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    public static final void onAnimationUpdate$49(AUListenerS277S0100000_29 aUListenerS277S0100000_29, ValueAnimator valueAnimator) {
        float fFloatValue;
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = 1.0f;
        }
        View view = ((C19415710xf) aUListenerS277S0100000_29.l0).LJFF;
        if (view != null) {
            C786410Ut5.T4(view, fFloatValue);
        }
        C16F5 c16f5 = ((C19415710xf) aUListenerS277S0100000_29.l0).LJII;
        if (c16f5 != null) {
            c16f5.setScrollX(0);
        }
    }

    public static final void onAnimationUpdate$5(AUListenerS277S0100000_29 aUListenerS277S0100000_29, ValueAnimator valueAnimator) {
        ((C12UF) aUListenerS277S0100000_29.l0).LLILLJJLI = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ((C12UF) aUListenerS277S0100000_29.l0).invalidate();
    }

    public static final void onAnimationUpdate$50(AUListenerS277S0100000_29 aUListenerS277S0100000_29, ValueAnimator valueAnimator) {
        float fFloatValue;
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        ViewGroup viewGroup = ((C19416410xm) aUListenerS277S0100000_29.l0).LJI;
        if (viewGroup != null) {
            C786410Ut5.R4(fFloatValue, viewGroup);
        }
    }

    public static final void onAnimationUpdate$51(AUListenerS277S0100000_29 aUListenerS277S0100000_29, ValueAnimator valueAnimator) {
        float fFloatValue;
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        ViewGroup viewGroup = ((C19416110xj) aUListenerS277S0100000_29.l0).LJI;
        if (viewGroup != null) {
            C786410Ut5.R4(fFloatValue, viewGroup);
        }
    }

    public static final void onAnimationUpdate$52(AUListenerS277S0100000_29 aUListenerS277S0100000_29, ValueAnimator valueAnimator) {
        float fFloatValue;
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        ViewGroup viewGroup = ((C19416610xo) aUListenerS277S0100000_29.l0).LJI;
        if (viewGroup != null) {
            C786410Ut5.R4(fFloatValue, viewGroup);
        }
    }

    public static final void onAnimationUpdate$53(AUListenerS277S0100000_29 aUListenerS277S0100000_29, ValueAnimator valueAnimator) {
        float fFloatValue;
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = 1.0f;
        }
        View view = ((C19415510xd) aUListenerS277S0100000_29.l0).LJFF;
        if (view != null) {
            C786410Ut5.T4(view, fFloatValue);
        }
    }

    public static final void onAnimationUpdate$54(AUListenerS277S0100000_29 aUListenerS277S0100000_29, ValueAnimator valueAnimator) {
        float fFloatValue;
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = 1.0f;
        }
        View view = ((C19415510xd) aUListenerS277S0100000_29.l0).LJFF;
        if (view != null) {
            C786410Ut5.T4(view, fFloatValue);
        }
        C16F5 c16f5 = ((C19415510xd) aUListenerS277S0100000_29.l0).LJII;
        if (c16f5 != null) {
            c16f5.setScrollX(0);
        }
    }

    public static final void onAnimationUpdate$55(AUListenerS277S0100000_29 aUListenerS277S0100000_29, ValueAnimator valueAnimator) {
        float fFloatValue;
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        View view = ((C19415910xh) aUListenerS277S0100000_29.l0).LJIIIIZZ;
        if (view != null) {
            C786410Ut5.T4(view, fFloatValue);
        }
        ImageView imageView = ((C19415910xh) aUListenerS277S0100000_29.l0).LJFF;
        if (imageView != null) {
            C786410Ut5.V4(imageView, fFloatValue);
        }
        TextView textView = ((C19415910xh) aUListenerS277S0100000_29.l0).LJI;
        if (textView != null) {
            C786410Ut5.S4(fFloatValue, textView);
        }
        C16F5 c16f5 = ((C19415910xh) aUListenerS277S0100000_29.l0).LJII;
        if (c16f5 != null) {
            C786410Ut5.k5(c16f5, fFloatValue);
        }
    }

    public static final void onAnimationUpdate$56(AUListenerS277S0100000_29 aUListenerS277S0100000_29, ValueAnimator valueAnimator) {
        float fFloatValue;
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = 1.0f;
        }
        TextView textView = ((C19415910xh) aUListenerS277S0100000_29.l0).LJI;
        if (textView != null) {
            C786410Ut5.S4(fFloatValue, textView);
        }
        C16F5 c16f5 = ((C19415910xh) aUListenerS277S0100000_29.l0).LJII;
        if (c16f5 != null) {
            C786410Ut5.k5(c16f5, fFloatValue);
        }
    }

    public static final void onAnimationUpdate$57(AUListenerS277S0100000_29 aUListenerS277S0100000_29, ValueAnimator valueAnimator) {
        float fFloatValue;
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = 1.0f;
        }
        ImageView imageView = ((C19415910xh) aUListenerS277S0100000_29.l0).LJFF;
        if (imageView != null) {
            C786410Ut5.Qb(imageView, fFloatValue);
        }
        ImageView imageView2 = ((C19415910xh) aUListenerS277S0100000_29.l0).LJFF;
        if (imageView2 != null) {
            C786410Ut5.rc(imageView2, fFloatValue);
        }
    }

    public static final void onAnimationUpdate$58(AUListenerS277S0100000_29 aUListenerS277S0100000_29, ValueAnimator valueAnimator) {
        float fFloatValue;
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = 1.5f;
        }
        ImageView imageView = ((C19415910xh) aUListenerS277S0100000_29.l0).LJFF;
        if (imageView != null) {
            C786410Ut5.Qb(imageView, fFloatValue);
        }
        ImageView imageView2 = ((C19415910xh) aUListenerS277S0100000_29.l0).LJFF;
        if (imageView2 != null) {
            C786410Ut5.rc(imageView2, fFloatValue);
        }
    }

    public static final void onAnimationUpdate$59(AUListenerS277S0100000_29 aUListenerS277S0100000_29, ValueAnimator valueAnimator) {
        float fFloatValue;
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = 1.6f;
        }
        ImageView imageView = ((C19415910xh) aUListenerS277S0100000_29.l0).LJFF;
        if (imageView != null) {
            C786410Ut5.Qb(imageView, fFloatValue);
        }
        ImageView imageView2 = ((C19415910xh) aUListenerS277S0100000_29.l0).LJFF;
        if (imageView2 != null) {
            C786410Ut5.rc(imageView2, fFloatValue);
        }
    }

    public static final void onAnimationUpdate$6(AUListenerS277S0100000_29 aUListenerS277S0100000_29, ValueAnimator valueAnimator) {
        ((C194434115c) aUListenerS277S0100000_29.l0).LLJ = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ((C194434115c) aUListenerS277S0100000_29.l0).invalidate();
    }

    public static final void onAnimationUpdate$60(AUListenerS277S0100000_29 aUListenerS277S0100000_29, ValueAnimator valueAnimator) {
        LiveIconView liveIconView = ((C12O6) aUListenerS277S0100000_29.l0).LJ;
        if (liveIconView != null) {
            liveIconView.setIconTint(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    public static final void onAnimationUpdate$61(AUListenerS277S0100000_29 aUListenerS277S0100000_29, ValueAnimator valueAnimator) {
        float fFloatValue;
        Float f;
        ConstraintLayout constraintLayout = ((C19416210xk) aUListenerS277S0100000_29.l0).LJI;
        if (constraintLayout != null) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
                fFloatValue = f.floatValue();
            } else {
                fFloatValue = 1.0f;
            }
            C786410Ut5.c5(constraintLayout, fFloatValue);
        }
    }

    public static final void onAnimationUpdate$62(AUListenerS277S0100000_29 aUListenerS277S0100000_29, ValueAnimator valueAnimator) {
        float fFloatValue;
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = 1.0f;
        }
        View view = ((C19415610xe) aUListenerS277S0100000_29.l0).LJ;
        if (view != null) {
            C786410Ut5.T4(view, fFloatValue);
        }
    }

    public static final void onAnimationUpdate$63(AUListenerS277S0100000_29 aUListenerS277S0100000_29, ValueAnimator valueAnimator) {
        TextView textView = ((C19768212Wa) aUListenerS277S0100000_29.l0).LLJILJILJ;
        CutVideoSpeedViewModel cutVideoSpeedViewModel = null;
        if (textView == null) {
            textView = null;
        }
        C786410Ut5.S4(((Float) valueAnimator.getAnimatedValue()).floatValue(), textView);
        CutVideoBottomBarViewModel cutVideoBottomBarViewModel = ((C19768212Wa) aUListenerS277S0100000_29.l0).LLJJIJI;
        if (cutVideoBottomBarViewModel == null) {
            cutVideoBottomBarViewModel = null;
        }
        ((LiveData) cutVideoBottomBarViewModel.LLILZIL.getValue()).setValue(Float.valueOf(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue()));
        CutVideoSpeedViewModel cutVideoSpeedViewModel2 = ((C19768212Wa) aUListenerS277S0100000_29.l0).LLJJJJ;
        if (cutVideoSpeedViewModel2 != null) {
            cutVideoSpeedViewModel = cutVideoSpeedViewModel2;
        }
        ((LiveData) cutVideoSpeedViewModel.LLILZLL.getValue()).setValue(Float.valueOf(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue()));
    }

    public static final void onAnimationUpdate$64(AUListenerS277S0100000_29 aUListenerS277S0100000_29, ValueAnimator valueAnimator) {
        TextView textView = ((C19768212Wa) aUListenerS277S0100000_29.l0).LLJILJILJ;
        CutVideoSpeedViewModel cutVideoSpeedViewModel = null;
        if (textView == null) {
            textView = null;
        }
        C786410Ut5.S4(((Float) valueAnimator.getAnimatedValue()).floatValue(), textView);
        CutVideoBottomBarViewModel cutVideoBottomBarViewModel = ((C19768212Wa) aUListenerS277S0100000_29.l0).LLJJIJI;
        if (cutVideoBottomBarViewModel == null) {
            cutVideoBottomBarViewModel = null;
        }
        ((LiveData) cutVideoBottomBarViewModel.LLILZIL.getValue()).setValue(Float.valueOf(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue()));
        CutVideoSpeedViewModel cutVideoSpeedViewModel2 = ((C19768212Wa) aUListenerS277S0100000_29.l0).LLJJJJ;
        if (cutVideoSpeedViewModel2 != null) {
            cutVideoSpeedViewModel = cutVideoSpeedViewModel2;
        }
        ((LiveData) cutVideoSpeedViewModel.LLILZLL.getValue()).setValue(Float.valueOf(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue()));
    }

    public static final void onAnimationUpdate$65(AUListenerS277S0100000_29 aUListenerS277S0100000_29, ValueAnimator valueAnimator) {
        Pair pair;
        float fFloatValue;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue instanceof Pair) {
            pair = (Pair) animatedValue;
        } else {
            pair = null;
        }
        View view = (View) aUListenerS277S0100000_29.l0;
        float fFloatValue2 = 0.0f;
        if (pair != null) {
            fFloatValue = ((Number) pair.getFirst()).floatValue();
            fFloatValue2 = ((Number) pair.getSecond()).floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        view.dispatchTouchEvent(C19393810u8.LIZ(fFloatValue, fFloatValue2, 2));
    }

    public static final void onAnimationUpdate$66(AUListenerS277S0100000_29 aUListenerS277S0100000_29, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C19396110uV c19396110uV = (C19396110uV) aUListenerS277S0100000_29.l0;
        InterfaceC679410Qkt interfaceC679410Qkt = c19396110uV.LLILZ;
        if (interfaceC679410Qkt != null) {
            int i = c19396110uV.LLILZLL;
            interfaceC679410Qkt.LLJLL(fFloatValue * i, i);
        }
    }

    public static final void onAnimationUpdate$67(AUListenerS277S0100000_29 aUListenerS277S0100000_29, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C19396110uV c19396110uV = (C19396110uV) aUListenerS277S0100000_29.l0;
        InterfaceC679410Qkt interfaceC679410Qkt = c19396110uV.LLILZ;
        if (interfaceC679410Qkt != null) {
            int i = c19396110uV.LLILZLL;
            interfaceC679410Qkt.LLJLL(fFloatValue * i, i);
        }
    }

    public static final void onAnimationUpdate$68(AUListenerS277S0100000_29 aUListenerS277S0100000_29, ValueAnimator valueAnimator) {
        ((C21533219Ow) aUListenerS277S0100000_29.l0).LLILLL = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ((C21533219Ow) aUListenerS277S0100000_29.l0).invalidate();
    }

    public static final void onAnimationUpdate$69(AUListenerS277S0100000_29 aUListenerS277S0100000_29, ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C12CY c12cy = (C12CY) aUListenerS277S0100000_29.l0;
        InterfaceC19717212Ck interfaceC19717212Ck = c12cy.LLJLIL;
        if (interfaceC19717212Ck == null) {
            interfaceC19717212Ck = null;
        }
        interfaceC19717212Ck.LIZ(c12cy.LLJILJIL);
    }

    public static final void onAnimationUpdate$7(AUListenerS277S0100000_29 aUListenerS277S0100000_29, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        TextView textView = ((C19471511Fx) aUListenerS277S0100000_29.l0).LLJ;
        if (textView != null) {
            textView.setPaddingRelative((int) fFloatValue, 0, 0, 0);
        }
        if (fFloatValue <= 4.0f) {
            TextView textView2 = ((C19471511Fx) aUListenerS277S0100000_29.l0).LLJ;
            if (textView2 != null) {
                C786410Ut5.LJLLLLLL(8, textView2);
            }
            TuxTextView tuxTextView = ((C19471511Fx) aUListenerS277S0100000_29.l0).LLIZLLLIL;
            if (tuxTextView != null) {
                C786410Ut5.LJLLLLLL(0, tuxTextView);
            }
        }
    }

    public static final void onAnimationUpdate$70(AUListenerS277S0100000_29 aUListenerS277S0100000_29, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ImageView imageView = ((C12UE) aUListenerS277S0100000_29.l0).LL;
        ImageView imageView2 = null;
        if (imageView == null) {
            imageView = null;
        }
        C786410Ut5.Qb(imageView, fFloatValue);
        ImageView imageView3 = ((C12UE) aUListenerS277S0100000_29.l0).LL;
        if (imageView3 != null) {
            imageView2 = imageView3;
        }
        C786410Ut5.rc(imageView2, fFloatValue);
    }

    public static final void onAnimationUpdate$71(AUListenerS277S0100000_29 aUListenerS277S0100000_29, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ImageView imageView = ((C12UE) aUListenerS277S0100000_29.l0).LL;
        ImageView imageView2 = null;
        if (imageView == null) {
            imageView = null;
        }
        C786410Ut5.Qb(imageView, fFloatValue);
        ImageView imageView3 = ((C12UE) aUListenerS277S0100000_29.l0).LL;
        if (imageView3 != null) {
            imageView2 = imageView3;
        }
        C786410Ut5.rc(imageView2, fFloatValue);
    }

    public static final void onAnimationUpdate$72(AUListenerS277S0100000_29 aUListenerS277S0100000_29, ValueAnimator valueAnimator) {
        int x;
        int x2;
        C12U9 c12u9 = (C12U9) aUListenerS277S0100000_29.l0;
        InterfaceC1452170ntP interfaceC1452170ntP = c12u9.LLJIJIL;
        if (interfaceC1452170ntP == null) {
            return;
        }
        c12u9.LLLILZ().setValue(Long.valueOf(interfaceC1452170ntP.LLL()));
        float fLLL = interfaceC1452170ntP.LLL() / interfaceC1452170ntP.getDuration();
        C12UA c12ua = ((C12U9) aUListenerS277S0100000_29.l0).LLJZ;
        View view = null;
        if (c12ua == null) {
            c12ua = null;
        }
        c12ua.getClass();
        HandlerHook.viewPost(c12ua, new ARunnableS9S0100001_29(c12ua, fLLL, 1));
        C12U9 c12u92 = (C12U9) aUListenerS277S0100000_29.l0;
        if (c12u92.LLJJIII) {
            C12UA c12ua2 = c12u92.LLJZ;
            if (c12ua2 == null) {
                c12ua2 = null;
            }
            int iLLL = interfaceC1452170ntP.LLL();
            Point point = ((C12U9) aUListenerS277S0100000_29.l0).LLJJIJIL;
            if (point != null) {
                c12ua2.getClass();
                x = point.getX();
            } else {
                x = iLLL;
            }
            Iterator<T> it2 = c12ua2.LLILLJJLI.getMStack().iterator();
            while (true) {
                if (it2.hasNext()) {
                    Point point2 = (Point) it2.next();
                    int x3 = point2.getX();
                    if (x <= x3 && x3 <= iLLL && iLLL <= point2.getY() && !Intrinsics.LJFF(point2, point)) {
                        x2 = point2.getX();
                        break;
                    }
                } else {
                    x2 = -1;
                    break;
                }
            }
            C12UA c12ua3 = ((C12U9) aUListenerS277S0100000_29.l0).LLJZ;
            if (c12ua3 == null) {
                c12ua3 = null;
            }
            c12ua3.LIZLLL();
            if (x2 == -1) {
                Point point3 = ((C12U9) aUListenerS277S0100000_29.l0).LLJJIJIL;
                if (point3 != null) {
                    point3.setY(interfaceC1452170ntP.LLL());
                }
                C12UA c12ua4 = ((C12U9) aUListenerS277S0100000_29.l0).LLJZ;
                if (c12ua4 == null) {
                    c12ua4 = null;
                }
                c12ua4.LIZLLL();
            } else {
                Point point4 = ((C12U9) aUListenerS277S0100000_29.l0).LLJJIJIL;
                if (point4 != null) {
                    point4.setY(x2);
                }
                C12UA c12ua5 = ((C12U9) aUListenerS277S0100000_29.l0).LLJZ;
                if (c12ua5 == null) {
                    c12ua5 = null;
                }
                c12ua5.LIZLLL();
                ((C12U9) aUListenerS277S0100000_29.l0).LLLIZZ(x2, C1DPV.LIZIZ.LIZJ(C1DPX.STOP_AUDIO_FTC_RECORD_BTN_ANIM_END, EnumC1641610sox.USER_OPERATION), false);
            }
        } else {
            c12u92.LLJJIJIL = null;
        }
        int iLLL2 = interfaceC1452170ntP.LLL();
        C12U9 c12u93 = (C12U9) aUListenerS277S0100000_29.l0;
        if (iLLL2 >= c12u93.LLJILJIL) {
            if (c12u93.LLJJIII) {
                c12u93.LLLIZZ(-1, C1DPV.LIZIZ.LIZJ(C1DPX.STOP_AUDIO_FTC_DURATION_END, EnumC1641610sox.USER_OPERATION), true);
                return;
            }
            c12u93.LLJJI.cancel();
            ((C12U9) aUListenerS277S0100000_29.l0).LLLILZLLLI.LIZ(0.0f, true);
            C12UA c12ua6 = ((C12U9) aUListenerS277S0100000_29.l0).LLJZ;
            if (c12ua6 == null) {
                c12ua6 = null;
            }
            c12ua6.getClass();
            HandlerHook.viewPost(c12ua6, new ARunnableS9S0100001_29(c12ua6, 0.0f, 1));
            C12U9 c12u94 = (C12U9) aUListenerS277S0100000_29.l0;
            AudioRecorderParam audioRecorderParam = c12u94.LLLIL;
            C12UA c12ua7 = c12u94.LLJZ;
            if (c12ua7 == null) {
                c12ua7 = null;
            }
            audioRecorderParam.setMStack(c12ua7.getStack());
            if (((C12U9) aUListenerS277S0100000_29.l0).LLLIL.getMStack().isEmpty()) {
                View view2 = ((C12U9) aUListenerS277S0100000_29.l0).LLLFFI;
                if (view2 != null) {
                    view = view2;
                }
                C786410Ut5.LJLLLLLL(8, view);
                return;
            }
            View view3 = ((C12U9) aUListenerS277S0100000_29.l0).LLLFFI;
            if (view3 != null) {
                view = view3;
            }
            C786410Ut5.LJLLLLLL(0, view);
        }
    }

    public static final void onAnimationUpdate$73(AUListenerS277S0100000_29 aUListenerS277S0100000_29, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C19395810uS c19395810uS = (C19395810uS) aUListenerS277S0100000_29.l0;
        InterfaceC19395910uT interfaceC19395910uT = c19395810uS.LLILZ;
        if (interfaceC19395910uT != null) {
            int i = c19395810uS.LLILZLL;
            interfaceC19395910uT.LLJLL(fFloatValue * i, i);
        }
    }

    public static final void onAnimationUpdate$74(AUListenerS277S0100000_29 aUListenerS277S0100000_29, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C19395810uS c19395810uS = (C19395810uS) aUListenerS277S0100000_29.l0;
        InterfaceC19395910uT interfaceC19395910uT = c19395810uS.LLILZ;
        if (interfaceC19395910uT != null) {
            int i = c19395810uS.LLILZLL;
            interfaceC19395910uT.LLJLL(fFloatValue * i, i);
        }
    }

    public static final void onAnimationUpdate$8(AUListenerS277S0100000_29 aUListenerS277S0100000_29, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C19649211uE c19649211uE = (C19649211uE) aUListenerS277S0100000_29.l0;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        C19649211uE c19649211uE2 = (C19649211uE) aUListenerS277S0100000_29.l0;
        int i = c19649211uE2.LLJJLIIIJLLLLLLLZ;
        int iN2 = c19649211uE2.LLJLILLLLZIIL - c0.LIZ.n2();
        c19649211uE.getClass();
        float f = 0.5625f * fFloatValue;
        float f2 = (i - f) / 2;
        float f3 = iN2 * animatedFraction;
        ViewPager viewPager = ((C19649211uE) aUListenerS277S0100000_29.l0).LLJJJJ;
        if (viewPager != null) {
            ViewGroup.LayoutParams layoutParams = viewPager.getLayoutParams();
            layoutParams.width = (int) f;
            layoutParams.height = (int) fFloatValue;
            C786410Ut5.q6(viewPager, layoutParams);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(viewPager);
            viewPager.setTranslationX(f2);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(viewPager);
            viewPager.setTranslationY(f3);
        }
    }

    public static final void onAnimationUpdate$9(AUListenerS277S0100000_29 aUListenerS277S0100000_29, ValueAnimator valueAnimator) {
        ((C19762912Tz) aUListenerS277S0100000_29.l0).LLILLJJLI = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ((C19762912Tz) aUListenerS277S0100000_29.l0).invalidate();
    }
}
