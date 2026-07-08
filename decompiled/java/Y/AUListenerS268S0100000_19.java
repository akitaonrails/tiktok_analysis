package Y;

import X.AbstractViewOnClickListenerC1256970ioZ;
import X.C0BXY;
import X.C1214960hio;
import X.C1257690ipj;
import X.C1262780ixw;
import X.C12P2;
import X.C14B7;
import X.C14B8;
import X.C1653740t8W;
import X.C21593719f5;
import X.C2248671Czp;
import X.C268330AfP;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.business.comment.assem.CommentMentionPanelAssem;
import com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarDefaultAssem;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.relation.usercard.impl.cell.RectRecUserCell;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.profile.business.profile.navbar.ProfileScrollNavbarAnimation;
import com.ss.android.ugc.profile.business.ur.follow.ProfileNavbarFollowProtocol;
import com.ss.android.ugc.profile.business.ur.platform.HeaderRecommendUserCardUserComponent;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public class AUListenerS268S0100000_19 implements ValueAnimator.AnimatorUpdateListener {
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
        }
    }

    public AUListenerS268S0100000_19(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationUpdate$0(AUListenerS268S0100000_19 aUListenerS268S0100000_19, ValueAnimator valueAnimator) {
        double d;
        C1653740t8W c1653740t8W = (C1653740t8W) aUListenerS268S0100000_19.l0;
        c1653740t8W.getClass();
        try {
            int i = CastIntegerProtector.parseInt(valueAnimator.getAnimatedValue().toString());
            float f = i % LSPassThroughRecordSizeConfig.DEFAULT;
            if (i > 5000) {
                d = 1.0f - (f / 500.0f);
                if (i == 5500) {
                    c1653740t8W.LJJJJLL(true);
                }
            } else {
                d = f < 300.0f ? (((double) (f / 300.0f)) * 0.7d) + 0.3d : 1.0d - (((double) ((f - 300.0f) / 700.0f)) * 0.7d);
            }
            C786410Ut5.T4(c1653740t8W.LLILLL, (float) d);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static final void onAnimationUpdate$1(AUListenerS268S0100000_19 aUListenerS268S0100000_19, ValueAnimator valueAnimator) {
        ((ViewGroup.MarginLayoutParams) ((CommentMentionPanelAssem) aUListenerS268S0100000_19.l0).LJJIJL().getLayoutParams()).bottomMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ((CommentMentionPanelAssem) aUListenerS268S0100000_19.l0).LJJIJL().requestLayout();
    }

    public static final void onAnimationUpdate$10(AUListenerS268S0100000_19 aUListenerS268S0100000_19, ValueAnimator valueAnimator) {
        C786410Ut5.T4((View) aUListenerS268S0100000_19.l0, ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static final void onAnimationUpdate$11(AUListenerS268S0100000_19 aUListenerS268S0100000_19, ValueAnimator valueAnimator) {
        View view = ((ProfileScrollNavbarAnimation) aUListenerS268S0100000_19.l0).LLJLLIL;
        if (view != null) {
            C786410Ut5.T4(view, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static final void onAnimationUpdate$12(AUListenerS268S0100000_19 aUListenerS268S0100000_19, ValueAnimator valueAnimator) {
        View view = ((ProfileScrollNavbarAnimation) aUListenerS268S0100000_19.l0).LLJLLIL;
        if (view != null) {
            C786410Ut5.T4(view, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static final void onAnimationUpdate$13(AUListenerS268S0100000_19 aUListenerS268S0100000_19, ValueAnimator valueAnimator) {
        AbstractViewOnClickListenerC1256970ioZ abstractViewOnClickListenerC1256970ioZ = (AbstractViewOnClickListenerC1256970ioZ) aUListenerS268S0100000_19.l0;
        abstractViewOnClickListenerC1256970ioZ.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = abstractViewOnClickListenerC1256970ioZ.LLILLL;
        if (view != null) {
            if (fFloatValue <= 0.0f) {
                C786410Ut5.T4(view, Math.abs(fFloatValue));
                return;
            }
            if (view.getAlpha() > 0.0f) {
                C786410Ut5.T4(abstractViewOnClickListenerC1256970ioZ.LLILLL, 0.0f);
            }
            View view2 = abstractViewOnClickListenerC1256970ioZ.LLILZLL;
            if (view2 == null) {
                return;
            }
            C786410Ut5.T4(view2, fFloatValue);
        }
    }

    public static final void onAnimationUpdate$14(AUListenerS268S0100000_19 aUListenerS268S0100000_19, ValueAnimator valueAnimator) {
        ((View) aUListenerS268S0100000_19.l0).setBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    public static final void onAnimationUpdate$15(AUListenerS268S0100000_19 aUListenerS268S0100000_19, ValueAnimator valueAnimator) {
        View view = ((ProfileNavbarFollowProtocol) aUListenerS268S0100000_19.l0).LLJLLIL;
        if (view != null) {
            C786410Ut5.T4(view, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static final void onAnimationUpdate$16(AUListenerS268S0100000_19 aUListenerS268S0100000_19, ValueAnimator valueAnimator) {
        ViewGroup.LayoutParams layoutParams = ((C14B8) aUListenerS268S0100000_19.l0).getLayoutParams();
        int[] iArr = (int[]) valueAnimator.getAnimatedValue();
        layoutParams.width = iArr[0];
        layoutParams.height = iArr[1];
        C14B8 c14b8 = (C14B8) aUListenerS268S0100000_19.l0;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c14b8);
        c14b8.setLayoutParams(layoutParams);
    }

    public static final void onAnimationUpdate$17(AUListenerS268S0100000_19 aUListenerS268S0100000_19, ValueAnimator valueAnimator) {
        ViewGroup.LayoutParams layoutParams = ((C14B7) aUListenerS268S0100000_19.l0).getLayoutParams();
        int[] iArr = (int[]) valueAnimator.getAnimatedValue();
        layoutParams.width = iArr[0];
        layoutParams.height = iArr[1];
        C14B7 c14b7 = (C14B7) aUListenerS268S0100000_19.l0;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c14b7);
        c14b7.setLayoutParams(layoutParams);
    }

    public static final void onAnimationUpdate$18(AUListenerS268S0100000_19 aUListenerS268S0100000_19, ValueAnimator valueAnimator) {
        C12P2 c12p2 = ((C2248671Czp) aUListenerS268S0100000_19.l0).LL;
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c12p2);
        c12p2.setAlpha(fFloatValue);
    }

    public static final void onAnimationUpdate$19(AUListenerS268S0100000_19 aUListenerS268S0100000_19, ValueAnimator valueAnimator) {
        Function1<? super ValueAnimator, Unit> function1 = ((C1257690ipj) aUListenerS268S0100000_19.l0).LIZLLL;
        if (function1 != null) {
            function1.invoke(valueAnimator);
        }
    }

    public static final void onAnimationUpdate$2(AUListenerS268S0100000_19 aUListenerS268S0100000_19, ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        TuxIconView tuxIconView = ((FeedAvatarDefaultAssem) aUListenerS268S0100000_19.l0).LLJZIJLIL;
        TuxIconView tuxIconView2 = null;
        if (tuxIconView == null) {
            tuxIconView = null;
        }
        C786410Ut5.hc(tuxIconView, ((Float) animatedValue).floatValue());
        TuxIconView tuxIconView3 = ((FeedAvatarDefaultAssem) aUListenerS268S0100000_19.l0).LLJZIJLIL;
        if (tuxIconView3 != null) {
            tuxIconView2 = tuxIconView3;
        }
        C786410Ut5.Cc(tuxIconView2, ((Number) animatedValue).floatValue());
    }

    public static final void onAnimationUpdate$20(AUListenerS268S0100000_19 aUListenerS268S0100000_19, ValueAnimator valueAnimator) {
        Function1<? super ValueAnimator, Unit> function1 = ((C1257690ipj) aUListenerS268S0100000_19.l0).LIZLLL;
        if (function1 != null) {
            function1.invoke(valueAnimator);
        }
    }

    public static final void onAnimationUpdate$21(AUListenerS268S0100000_19 aUListenerS268S0100000_19, ValueAnimator valueAnimator) {
        ((C1214960hio) aUListenerS268S0100000_19.l0).LJFF.LIZ(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static final void onAnimationUpdate$22(AUListenerS268S0100000_19 aUListenerS268S0100000_19, ValueAnimator valueAnimator) {
        View view = ((RectRecUserCell) aUListenerS268S0100000_19.l0).itemView;
        view.setPadding(view.getPaddingLeft(), ((RectRecUserCell) aUListenerS268S0100000_19.l0).itemView.getPaddingTop(), ((RectRecUserCell) aUListenerS268S0100000_19.l0).itemView.getPaddingRight(), ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    public static final void onAnimationUpdate$23(AUListenerS268S0100000_19 aUListenerS268S0100000_19, ValueAnimator valueAnimator) {
        Float f;
        int i;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            float fFloatValue = f.floatValue();
            C1262780ixw c1262780ixwZp = ((HeaderRecommendUserCardUserComponent) aUListenerS268S0100000_19.l0).zp();
            ViewGroup.LayoutParams layoutParams = c1262780ixwZp.getLayoutParams();
            if (layoutParams != null) {
                if (C0BXY.LIZ()) {
                    i = 238;
                } else {
                    i = 298;
                }
                layoutParams.height = (int) (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i))) * fFloatValue);
                C786410Ut5.W5(c1262780ixwZp, layoutParams);
                if (!C268330AfP.LJIIIZ()) {
                    float f2 = 1 - fFloatValue;
                    ((HeaderRecommendUserCardUserComponent) aUListenerS268S0100000_19.l0).Ep((int) (r1.LLJLLL * f2));
                    ((HeaderRecommendUserCardUserComponent) aUListenerS268S0100000_19.l0).Ap((int) (r1.LLJZIJLIL * f2));
                    ((HeaderRecommendUserCardUserComponent) aUListenerS268S0100000_19.l0).Bp(f2);
                    return;
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
    }

    public static final void onAnimationUpdate$24(AUListenerS268S0100000_19 aUListenerS268S0100000_19, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (fFloatValue <= 1.5f) {
            ((C21593719f5) aUListenerS268S0100000_19.l0).LIZJ(fFloatValue);
        } else {
            ((C21593719f5) aUListenerS268S0100000_19.l0).LIZJ(-1.0f);
        }
    }

    public static final void onAnimationUpdate$3(AUListenerS268S0100000_19 aUListenerS268S0100000_19, ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        TuxIconView tuxIconView = ((FeedAvatarDefaultAssem) aUListenerS268S0100000_19.l0).LLJZIJLIL;
        TuxIconView tuxIconView2 = null;
        if (tuxIconView == null) {
            tuxIconView = null;
        }
        C786410Ut5.hc(tuxIconView, ((Float) animatedValue).floatValue());
        TuxIconView tuxIconView3 = ((FeedAvatarDefaultAssem) aUListenerS268S0100000_19.l0).LLJZIJLIL;
        if (tuxIconView3 != null) {
            tuxIconView2 = tuxIconView3;
        }
        C786410Ut5.Cc(tuxIconView2, ((Number) animatedValue).floatValue());
    }

    public static final void onAnimationUpdate$4(AUListenerS268S0100000_19 aUListenerS268S0100000_19, ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        TuxIconView tuxIconView = ((FeedAvatarDefaultAssem) aUListenerS268S0100000_19.l0).LLJZIJLIL;
        TuxIconView tuxIconView2 = null;
        if (tuxIconView == null) {
            tuxIconView = null;
        }
        C786410Ut5.hc(tuxIconView, ((Float) animatedValue).floatValue());
        TuxIconView tuxIconView3 = ((FeedAvatarDefaultAssem) aUListenerS268S0100000_19.l0).LLJZIJLIL;
        if (tuxIconView3 != null) {
            tuxIconView2 = tuxIconView3;
        }
        C786410Ut5.Cc(tuxIconView2, ((Number) animatedValue).floatValue());
    }

    public static final void onAnimationUpdate$5(AUListenerS268S0100000_19 aUListenerS268S0100000_19, ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        TuxIconView tuxIconView = ((FeedAvatarDefaultAssem) aUListenerS268S0100000_19.l0).LLJZIJLIL;
        TuxIconView tuxIconView2 = null;
        if (tuxIconView == null) {
            tuxIconView = null;
        }
        C786410Ut5.hc(tuxIconView, ((Float) animatedValue).floatValue());
        TuxIconView tuxIconView3 = ((FeedAvatarDefaultAssem) aUListenerS268S0100000_19.l0).LLJZIJLIL;
        if (tuxIconView3 != null) {
            tuxIconView2 = tuxIconView3;
        }
        C786410Ut5.Cc(tuxIconView2, ((Number) animatedValue).floatValue());
    }

    public static final void onAnimationUpdate$6(AUListenerS268S0100000_19 aUListenerS268S0100000_19, ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        TuxIconView tuxIconView = ((FeedAvatarDefaultAssem) aUListenerS268S0100000_19.l0).LLJZIJLIL;
        TuxIconView tuxIconView2 = null;
        if (tuxIconView == null) {
            tuxIconView = null;
        }
        C786410Ut5.hc(tuxIconView, ((Float) animatedValue).floatValue());
        TuxIconView tuxIconView3 = ((FeedAvatarDefaultAssem) aUListenerS268S0100000_19.l0).LLJZIJLIL;
        if (tuxIconView3 != null) {
            tuxIconView2 = tuxIconView3;
        }
        C786410Ut5.Cc(tuxIconView2, ((Number) animatedValue).floatValue());
    }

    public static final void onAnimationUpdate$7(AUListenerS268S0100000_19 aUListenerS268S0100000_19, ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        TuxIconView tuxIconView = ((FeedAvatarDefaultAssem) aUListenerS268S0100000_19.l0).LLJZIJLIL;
        TuxIconView tuxIconView2 = null;
        if (tuxIconView == null) {
            tuxIconView = null;
        }
        C786410Ut5.hc(tuxIconView, ((Float) animatedValue).floatValue());
        TuxIconView tuxIconView3 = ((FeedAvatarDefaultAssem) aUListenerS268S0100000_19.l0).LLJZIJLIL;
        if (tuxIconView3 != null) {
            tuxIconView2 = tuxIconView3;
        }
        C786410Ut5.Cc(tuxIconView2, ((Number) animatedValue).floatValue());
    }

    public static final void onAnimationUpdate$8(AUListenerS268S0100000_19 aUListenerS268S0100000_19, ValueAnimator valueAnimator) {
        C786410Ut5.B5((TuxTextView) aUListenerS268S0100000_19.l0, ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static final void onAnimationUpdate$9(AUListenerS268S0100000_19 aUListenerS268S0100000_19, ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ViewGroup.LayoutParams layoutParams = ((TuxTextView) aUListenerS268S0100000_19.l0).getLayoutParams();
        layoutParams.width = iIntValue;
        layoutParams.height = iIntValue;
        C786410Ut5.R6((TuxTextView) aUListenerS268S0100000_19.l0, layoutParams);
    }
}
