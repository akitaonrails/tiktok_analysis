package Y;

import X.C1080120eDK;
import X.C1081740eFw;
import X.C1082400eH0;
import X.C1086750eO1;
import X.C1090450eTz;
import X.C1110060ezc;
import X.C1114050f63;
import X.C1120240fG2;
import X.C1120270fG5;
import X.C1120290fG7;
import X.C1120360fGE;
import X.C1120380fGG;
import X.C1120420fGK;
import X.C13LZ;
import X.C20441214yg;
import X.C20632315oP;
import X.C2188811AlT;
import X.C238400w2;
import X.C786410Ut5;
import X.InterfaceC1098670ehF;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.android.live.broadcast.extendedscreen.ExtendedScreenWidget;
import com.bytedance.android.live.pin.widget.BaseCommentPinnedWidget;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Arrays;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes18.dex */
public class AUListenerS224S0200000_17 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public Object l0;
    public Object l1;

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
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS224S0200000_17 aUListenerS224S0200000_17, ValueAnimator valueAnimator) {
        Integer num;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            C20632315oP c20632315oP = (C20632315oP) aUListenerS224S0200000_17.l0;
            ViewGroup.LayoutParams layoutParams = c20632315oP.getLayoutParams();
            layoutParams.height = num.intValue();
            C786410Ut5.r6(c20632315oP, layoutParams);
            float currentPlayTime = valueAnimator.getCurrentPlayTime() / valueAnimator.getDuration();
            InterfaceC1098670ehF interfaceC1098670ehF = (InterfaceC1098670ehF) aUListenerS224S0200000_17.l1;
            if (interfaceC1098670ehF != null) {
                interfaceC1098670ehF.LJ(currentPlayTime);
            }
        }
    }

    public static final void onAnimationUpdate$1(AUListenerS224S0200000_17 aUListenerS224S0200000_17, ValueAnimator valueAnimator) {
        C1090450eTz c1090450eTzZ1 = ((ExtendedScreenWidget) aUListenerS224S0200000_17.l0).z1();
        ValueAnimator valueAnimator2 = (ValueAnimator) aUListenerS224S0200000_17.l1;
        ViewGroup.LayoutParams layoutParams = c1090450eTzZ1.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
            C786410Ut5.W5(c1090450eTzZ1, marginLayoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public static final void onAnimationUpdate$10(AUListenerS224S0200000_17 aUListenerS224S0200000_17, ValueAnimator valueAnimator) {
        PointF pointF = (PointF) valueAnimator.getAnimatedValue();
        RectF rectF = ((C1120420fGK) aUListenerS224S0200000_17.l1).LIZIZ;
        float fWidth = rectF.width() / 2;
        float f = pointF.x;
        rectF.left = f - fWidth;
        float f2 = pointF.y;
        rectF.top = f2 - fWidth;
        rectF.right = f + fWidth;
        rectF.bottom = f2 + fWidth;
        ((C1120360fGE) aUListenerS224S0200000_17.l0).invalidate();
    }

    public static final void onAnimationUpdate$11(AUListenerS224S0200000_17 aUListenerS224S0200000_17, ValueAnimator valueAnimator) {
        C1120380fGG c1120380fGG = (C1120380fGG) aUListenerS224S0200000_17.l0;
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        RectF rectF = c1120380fGG.LIZJ;
        float fCenterX = rectF.centerX();
        float fCenterY = rectF.centerY();
        float f = (C1120360fGE.LLJ * fFloatValue) / 2;
        rectF.left = fCenterX - f;
        rectF.top = fCenterY - f;
        rectF.right = fCenterX + f;
        rectF.bottom = fCenterY + f;
        ((C1120360fGE) aUListenerS224S0200000_17.l1).invalidate();
    }

    public static final void onAnimationUpdate$12(AUListenerS224S0200000_17 aUListenerS224S0200000_17, ValueAnimator valueAnimator) {
        ((C1120380fGG) aUListenerS224S0200000_17.l0).LIZIZ = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ((C1120360fGE) aUListenerS224S0200000_17.l1).invalidate();
    }

    public static final void onAnimationUpdate$13(AUListenerS224S0200000_17 aUListenerS224S0200000_17, ValueAnimator valueAnimator) {
        C1114050f63 c1114050f63 = (C1114050f63) aUListenerS224S0200000_17.l0;
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        c1114050f63.getClass();
        c1114050f63.LLILZ = C13LZ.LIZLLL(fFloatValue, 0.0f, 1.0f);
        ((TextView) aUListenerS224S0200000_17.l1).invalidate();
    }

    public static final void onAnimationUpdate$14(AUListenerS224S0200000_17 aUListenerS224S0200000_17, ValueAnimator valueAnimator) {
        C1114050f63 c1114050f63 = (C1114050f63) aUListenerS224S0200000_17.l0;
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        c1114050f63.getClass();
        c1114050f63.LLILZ = C13LZ.LIZLLL(fFloatValue, 0.0f, 1.0f);
        ((TextView) aUListenerS224S0200000_17.l1).invalidate();
    }

    public static final void onAnimationUpdate$15(AUListenerS224S0200000_17 aUListenerS224S0200000_17, ValueAnimator valueAnimator) {
        ((ConstraintProperty) aUListenerS224S0200000_17.l0).translationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
        float width = ((LayeredElementContext) aUListenerS224S0200000_17.l1).getContainer().getWidth();
        if (width > 0.0f) {
            ConstraintProperty constraintProperty = (ConstraintProperty) aUListenerS224S0200000_17.l0;
            constraintProperty.alpha(1 - Math.abs(constraintProperty.translationX() / width));
        } else {
            ((ConstraintProperty) aUListenerS224S0200000_17.l0).alpha(1.0f);
        }
    }

    public static final void onAnimationUpdate$16(AUListenerS224S0200000_17 aUListenerS224S0200000_17, ValueAnimator valueAnimator) {
        ((ConstraintProperty) aUListenerS224S0200000_17.l0).translationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
        float width = ((LayeredElementContext) aUListenerS224S0200000_17.l1).getContainer().getWidth();
        if (width > 0.0f) {
            ConstraintProperty constraintProperty = (ConstraintProperty) aUListenerS224S0200000_17.l0;
            constraintProperty.alpha(1 - Math.abs(constraintProperty.translationX() / width));
        } else {
            ((ConstraintProperty) aUListenerS224S0200000_17.l0).alpha(1.0f);
        }
    }

    public static final void onAnimationUpdate$17(AUListenerS224S0200000_17 aUListenerS224S0200000_17, ValueAnimator valueAnimator) {
        C1080120eDK c1080120eDK = (C1080120eDK) aUListenerS224S0200000_17.l0;
        C1090450eTz c1090450eTz = (C1090450eTz) aUListenerS224S0200000_17.l1;
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        c1080120eDK.getClass();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c1090450eTz.getLayoutParams();
        marginLayoutParams.rightMargin = iIntValue;
        C786410Ut5.W5(c1090450eTz, marginLayoutParams);
    }

    public static final void onAnimationUpdate$18(AUListenerS224S0200000_17 aUListenerS224S0200000_17, ValueAnimator valueAnimator) {
        C1080120eDK c1080120eDK = (C1080120eDK) aUListenerS224S0200000_17.l0;
        C1090450eTz c1090450eTz = (C1090450eTz) aUListenerS224S0200000_17.l1;
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        c1080120eDK.getClass();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c1090450eTz.getLayoutParams();
        marginLayoutParams.rightMargin = iIntValue;
        C786410Ut5.W5(c1090450eTz, marginLayoutParams);
    }

    public static final void onAnimationUpdate$19(AUListenerS224S0200000_17 aUListenerS224S0200000_17, ValueAnimator valueAnimator) {
        Integer num;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue instanceof Integer) {
            num = (Integer) animatedValue;
        } else {
            num = null;
        }
        if (((View) aUListenerS224S0200000_17.l0) != null && num != null) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) aUListenerS224S0200000_17.l1;
            if (layoutParams != null) {
                layoutParams.bottomMargin = num.intValue();
            }
            C786410Ut5.W5((View) aUListenerS224S0200000_17.l0, (RelativeLayout.LayoutParams) aUListenerS224S0200000_17.l1);
        }
    }

    public static final void onAnimationUpdate$2(AUListenerS224S0200000_17 aUListenerS224S0200000_17, ValueAnimator valueAnimator) {
        ((C1086750eO1) aUListenerS224S0200000_17.l0).setScrollX(((Integer) valueAnimator.getAnimatedValue()).intValue());
        long jUptimeMillis = SystemClock.uptimeMillis();
        C238400w2 c238400w2 = (C238400w2) aUListenerS224S0200000_17.l1;
        if (jUptimeMillis - c238400w2.element >= 400) {
            c238400w2.element = jUptimeMillis;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[TakeStageMarqueeDiag] anim frac=");
            sbLIZ.append(C786410Ut5.j4("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(valueAnimator.getAnimatedFraction())}, 1)));
            sbLIZ.append(" scrollX=");
            sbLIZ.append(((C1086750eO1) aUListenerS224S0200000_17.l0).getScrollX());
            C20441214yg.LIZIZ("TakeStageMarquee", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static final void onAnimationUpdate$20(AUListenerS224S0200000_17 aUListenerS224S0200000_17, ValueAnimator valueAnimator) {
        ConstraintProperty constraintProperty = ((C1081740eFw) aUListenerS224S0200000_17.l0).LLILLJJLI;
        if (constraintProperty != null) {
            constraintProperty.margin(3, ((Integer) ((ValueAnimator) aUListenerS224S0200000_17.l1).getAnimatedValue()).intValue());
            constraintProperty.apply();
        }
    }

    public static final void onAnimationUpdate$21(AUListenerS224S0200000_17 aUListenerS224S0200000_17, ValueAnimator valueAnimator) {
        ConstraintProperty constraintPropertyLJIIIZ = ((C1082400eH0) aUListenerS224S0200000_17.l0).LJIIIZ();
        if (constraintPropertyLJIIIZ != null) {
            constraintPropertyLJIIIZ.margin(3, ((Integer) ((ValueAnimator) aUListenerS224S0200000_17.l1).getAnimatedValue()).intValue());
            constraintPropertyLJIIIZ.apply();
        }
    }

    public static final void onAnimationUpdate$3(AUListenerS224S0200000_17 aUListenerS224S0200000_17, ValueAnimator valueAnimator) {
        ((ViewGroup.MarginLayoutParams) aUListenerS224S0200000_17.l0).topMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        C786410Ut5.W5(((BaseCommentPinnedWidget) aUListenerS224S0200000_17.l1).E1(), (ViewGroup.MarginLayoutParams) aUListenerS224S0200000_17.l0);
        C786410Ut5.c5(((BaseCommentPinnedWidget) aUListenerS224S0200000_17.l1).F1(), 1 - valueAnimator.getAnimatedFraction());
    }

    public static final void onAnimationUpdate$4(AUListenerS224S0200000_17 aUListenerS224S0200000_17, ValueAnimator valueAnimator) {
        ((C1110060ezc) aUListenerS224S0200000_17.l0).getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        Function1 function1 = (Function1) aUListenerS224S0200000_17.l1;
        if (function1 != null) {
            function1.invoke(valueAnimator);
        }
        ((C1110060ezc) aUListenerS224S0200000_17.l0).requestLayout();
    }

    public static final void onAnimationUpdate$5(AUListenerS224S0200000_17 aUListenerS224S0200000_17, ValueAnimator valueAnimator) {
        ((C1120420fGK) aUListenerS224S0200000_17.l0).LIZIZ(((Float) valueAnimator.getAnimatedValue()).floatValue());
        ((C1120360fGE) aUListenerS224S0200000_17.l1).invalidate();
    }

    public static final void onAnimationUpdate$6(AUListenerS224S0200000_17 aUListenerS224S0200000_17, ValueAnimator valueAnimator) {
        ((C1120420fGK) aUListenerS224S0200000_17.l0).LIZIZ(((Float) valueAnimator.getAnimatedValue()).floatValue());
        ((C1120360fGE) aUListenerS224S0200000_17.l1).invalidate();
    }

    public static final void onAnimationUpdate$7(AUListenerS224S0200000_17 aUListenerS224S0200000_17, ValueAnimator valueAnimator) {
        ((C1120420fGK) aUListenerS224S0200000_17.l0).LIZLLL = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ((C1120360fGE) aUListenerS224S0200000_17.l1).invalidate();
    }

    public static final void onAnimationUpdate$8(AUListenerS224S0200000_17 aUListenerS224S0200000_17, ValueAnimator valueAnimator) {
        ((C1120420fGK) aUListenerS224S0200000_17.l0).LIZLLL = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ((C1120360fGE) aUListenerS224S0200000_17.l1).invalidate();
    }

    public static final void onAnimationUpdate$9(AUListenerS224S0200000_17 aUListenerS224S0200000_17, ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ((C1120270fG5) aUListenerS224S0200000_17.l0).getClass();
        C1120270fG5 c1120270fG5 = (C1120270fG5) aUListenerS224S0200000_17.l0;
        C1120290fG7 c1120290fG7 = c1120270fG5.LJIIJ;
        if (c1120290fG7 != null) {
            c1120290fG7.LIZ(iIntValue, c1120270fG5.LJFF, c1120270fG5.LJI, c1120270fG5.LIZLLL, c1120270fG5.LJ);
        }
        ((C1120240fG2) aUListenerS224S0200000_17.l1).invalidate();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AUListenerS224S0200000_17(X.C1120420fGK r2, X.C1120360fGE r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            switch(r4) {
                case 5: goto Le;
                case 6: goto Le;
                case 7: goto Le;
                case 8: goto Le;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
        La:
            r0.<init>()
            return
        Le:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AUListenerS224S0200000_17.<init>(X.0fGK, X.0fGE, int):void");
    }

    public AUListenerS224S0200000_17(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
