package Y;

import X.C06MM;
import X.C0Z9B;
import X.C0ZSM;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import X.C890630Ywn;
import X.C901500ZYe;
import X.C903960ZdC;
import X.C904040ZdK;
import X.C904050ZdL;
import X.C904110ZdR;
import X.C904120ZdS;
import X.C913300ZsG;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Space;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.groupshot.vh.AIGroupShotCardReusedUISlot;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.powerpage.BaseChatRoomFragment;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.singleactivity.BaseChatRootFragment;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: loaded from: classes15.dex */
public class AUListenerS263S0100000_14 implements ValueAnimator.AnimatorUpdateListener {
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

    public AUListenerS263S0100000_14(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationUpdate$0(AUListenerS263S0100000_14 aUListenerS263S0100000_14, ValueAnimator valueAnimator) {
        Window window;
        Activity activityLIZ = C06MM.LIZ(((BaseChatRoomFragment) aUListenerS263S0100000_14.l0).getRootView().getContext());
        if (activityLIZ != null && (window = activityLIZ.getWindow()) != null) {
            window.setNavigationBarColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    public static final void onAnimationUpdate$1(AUListenerS263S0100000_14 aUListenerS263S0100000_14, ValueAnimator valueAnimator) {
        Activity activityLIZ;
        Window window;
        if (!C913300ZsG.LIZ.LIZ() && (activityLIZ = C06MM.LIZ(((BaseChatRootFragment) aUListenerS263S0100000_14.l0).getRootView().getContext())) != null && (window = activityLIZ.getWindow()) != null) {
            window.setNavigationBarColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    public static final void onAnimationUpdate$10(AUListenerS263S0100000_14 aUListenerS263S0100000_14, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C904120ZdS.LIZ(((C904050ZdL) aUListenerS263S0100000_14.l0).LLILLJJLI, fFloatValue);
        C904050ZdL c904050ZdL = (C904050ZdL) aUListenerS263S0100000_14.l0;
        if (c904050ZdL.LLILZIL) {
            C904120ZdS.LIZ(c904050ZdL.LLILLL, fFloatValue);
        }
    }

    public static final void onAnimationUpdate$11(AUListenerS263S0100000_14 aUListenerS263S0100000_14, ValueAnimator valueAnimator) {
        C904110ZdR.LIZ(((C904040ZdK) aUListenerS263S0100000_14.l0).LLILLL, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        C904040ZdK c904040ZdK = (C904040ZdK) aUListenerS263S0100000_14.l0;
        if (c904040ZdK.LLILZIL) {
            C904110ZdR.LIZ(c904040ZdK.LLILZ, 1.0f);
        }
    }

    public static final void onAnimationUpdate$12(AUListenerS263S0100000_14 aUListenerS263S0100000_14, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C904110ZdR.LIZ(((C904040ZdK) aUListenerS263S0100000_14.l0).LLILLL, fFloatValue);
        C904040ZdK c904040ZdK = (C904040ZdK) aUListenerS263S0100000_14.l0;
        if (c904040ZdK.LLILZIL) {
            C904110ZdR.LIZ(c904040ZdK.LLILZ, fFloatValue);
        }
    }

    public static final void onAnimationUpdate$13(AUListenerS263S0100000_14 aUListenerS263S0100000_14, ValueAnimator valueAnimator) {
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            float fFloatValue = f.floatValue();
            C901500ZYe c901500ZYeSp = ((AIGroupShotCardReusedUISlot) aUListenerS263S0100000_14.l0).sp();
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c901500ZYeSp);
            c901500ZYeSp.setScaleX(fFloatValue);
            C901500ZYe c901500ZYeSp2 = ((AIGroupShotCardReusedUISlot) aUListenerS263S0100000_14.l0).sp();
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c901500ZYeSp2);
            c901500ZYeSp2.setScaleY(fFloatValue);
        }
    }

    public static final void onAnimationUpdate$14(AUListenerS263S0100000_14 aUListenerS263S0100000_14, ValueAnimator valueAnimator) {
        float fFloatValue;
        Float f;
        for (View view : ((C0ZSM) aUListenerS263S0100000_14.l0).LJFF) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
                fFloatValue = f.floatValue();
            } else {
                fFloatValue = 0.0f;
            }
            C786410Ut5.Jc(view, fFloatValue);
        }
    }

    public static final void onAnimationUpdate$15(AUListenerS263S0100000_14 aUListenerS263S0100000_14, ValueAnimator valueAnimator) {
        Float f;
        float fFloatValue;
        Float f2;
        View view = ((C0ZSM) aUListenerS263S0100000_14.l0).LJI;
        if (view != null) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue instanceof Float) {
                f = (Float) animatedValue;
            } else {
                f = null;
            }
            float fFloatValue2 = 0.0f;
            if (f != null) {
                fFloatValue = f.floatValue();
            } else {
                fFloatValue = 0.0f;
            }
            C786410Ut5.Ob(view, fFloatValue);
            Object animatedValue2 = valueAnimator.getAnimatedValue();
            if ((animatedValue2 instanceof Float) && (f2 = (Float) animatedValue2) != null) {
                fFloatValue2 = f2.floatValue();
            }
            C786410Ut5.pc(view, fFloatValue2);
        }
    }

    public static final void onAnimationUpdate$16(AUListenerS263S0100000_14 aUListenerS263S0100000_14, ValueAnimator valueAnimator) {
        View view;
        ViewGroup.LayoutParams layoutParams;
        if (valueAnimator.getAnimatedFraction() <= 0.75f && (view = ((C890630Ywn) aUListenerS263S0100000_14.l0).LJI) != null && (layoutParams = view.getLayoutParams()) != null) {
            layoutParams.height = (int) (((valueAnimator.getAnimatedFraction() * C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28))) * 4) / 3);
        }
        if (valueAnimator.getAnimatedFraction() > 0.25f) {
            View view2 = ((C890630Ywn) aUListenerS263S0100000_14.l0).LJI;
            if (view2 != null) {
                C786410Ut5.T4(view2, ((valueAnimator.getAnimatedFraction() - 0.25f) * 4) / 3);
            }
            RecyclerView recyclerView = ((C890630Ywn) aUListenerS263S0100000_14.l0).LJII;
            if (recyclerView != null) {
                C786410Ut5.LLIZLLLIL(recyclerView, 0);
            }
        }
        View view3 = ((C890630Ywn) aUListenerS263S0100000_14.l0).LJI;
        if (view3 != null) {
            view3.requestLayout();
        }
    }

    public static final void onAnimationUpdate$17(AUListenerS263S0100000_14 aUListenerS263S0100000_14, ValueAnimator valueAnimator) {
        View view = (View) aUListenerS263S0100000_14.l0;
        if (view != null) {
            C786410Ut5.T4(view, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static final void onAnimationUpdate$18(AUListenerS263S0100000_14 aUListenerS263S0100000_14, ValueAnimator valueAnimator) {
        C786410Ut5.T4((View) aUListenerS263S0100000_14.l0, ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static final void onAnimationUpdate$19(AUListenerS263S0100000_14 aUListenerS263S0100000_14, ValueAnimator valueAnimator) {
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            ((C0Z9B) aUListenerS263S0100000_14.l0).LLLLZI(f.floatValue());
        }
    }

    public static final void onAnimationUpdate$2(AUListenerS263S0100000_14 aUListenerS263S0100000_14, ValueAnimator valueAnimator) {
        ((View) aUListenerS263S0100000_14.l0).setBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    public static final void onAnimationUpdate$3(AUListenerS263S0100000_14 aUListenerS263S0100000_14, ValueAnimator valueAnimator) {
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            C903960ZdC c903960ZdC = (C903960ZdC) aUListenerS263S0100000_14.l0;
            float fFloatValue = f.floatValue();
            C786410Ut5.u5(c903960ZdC.LIZJ, fFloatValue);
            ViewGroup.LayoutParams layoutParams = c903960ZdC.LIZJ.getLayoutParams();
            layoutParams.width = (int) (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72)) * fFloatValue);
            layoutParams.height = (int) (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72)) * fFloatValue);
            C786410Ut5.G6(c903960ZdC.LIZJ, layoutParams);
        }
    }

    public static final void onAnimationUpdate$4(AUListenerS263S0100000_14 aUListenerS263S0100000_14, ValueAnimator valueAnimator) {
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            C903960ZdC c903960ZdC = (C903960ZdC) aUListenerS263S0100000_14.l0;
            float fFloatValue = f.floatValue();
            C786410Ut5.u5(c903960ZdC.LIZJ, fFloatValue);
            ViewGroup.LayoutParams layoutParams = c903960ZdC.LIZJ.getLayoutParams();
            layoutParams.width = (int) (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72)) * fFloatValue);
            layoutParams.height = (int) (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72)) * fFloatValue);
            C786410Ut5.G6(c903960ZdC.LIZJ, layoutParams);
        }
    }

    public static final void onAnimationUpdate$5(AUListenerS263S0100000_14 aUListenerS263S0100000_14, ValueAnimator valueAnimator) {
        Space space = ((C903960ZdC) aUListenerS263S0100000_14.l0).LIZLLL;
        if (space != null) {
            ViewGroup.LayoutParams layoutParams = space.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C786410Ut5.W5(space, layoutParams);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
    }

    public static final void onAnimationUpdate$6(AUListenerS263S0100000_14 aUListenerS263S0100000_14, ValueAnimator valueAnimator) {
        Space space = ((C903960ZdC) aUListenerS263S0100000_14.l0).LIZLLL;
        if (space != null) {
            ViewGroup.LayoutParams layoutParams = space.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C786410Ut5.W5(space, layoutParams);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
    }

    public static final void onAnimationUpdate$7(AUListenerS263S0100000_14 aUListenerS263S0100000_14, ValueAnimator valueAnimator) {
        Space space = ((C903960ZdC) aUListenerS263S0100000_14.l0).LIZLLL;
        if (space != null) {
            ViewGroup.LayoutParams layoutParams = space.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C786410Ut5.W5(space, layoutParams);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
    }

    public static final void onAnimationUpdate$8(AUListenerS263S0100000_14 aUListenerS263S0100000_14, ValueAnimator valueAnimator) {
        Space space = ((C903960ZdC) aUListenerS263S0100000_14.l0).LIZLLL;
        ViewGroup.LayoutParams layoutParams = space.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C786410Ut5.W5(space, layoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public static final void onAnimationUpdate$9(AUListenerS263S0100000_14 aUListenerS263S0100000_14, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C904120ZdS.LIZ(((C904050ZdL) aUListenerS263S0100000_14.l0).LLILLJJLI, fFloatValue);
        C904050ZdL c904050ZdL = (C904050ZdL) aUListenerS263S0100000_14.l0;
        if (c904050ZdL.LLILZIL) {
            C904120ZdS.LIZ(c904050ZdL.LLILLL, fFloatValue);
        }
    }
}
