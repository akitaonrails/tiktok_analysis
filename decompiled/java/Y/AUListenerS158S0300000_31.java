package Y;

import X.C118300cf;
import X.C1295960jpS;
import X.C1308910kAL;
import X.C15X1;
import X.C16G0;
import X.C16GW;
import X.C1836710xtd;
import X.C20575915fJ;
import X.C20580115fz;
import X.C20632215oO;
import X.C418440Gaw;
import X.C500260Jjc;
import X.C814420VxA;
import X.EnumC1405120mfW;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.widget.ScrollView;
import com.bytedance.android.livesdk.broadcast.end.EndIncentiveSettlementFragmentV2;
import com.ss.android.ugc.aweme.im.common.widget.appbar.IMAppBarLayout$Behavior;
import com.ss.android.ugc.aweme.story.note.StoryThoughtAvatarCreationFragment;
import com.zhiliaoapp.musically.R;
import tikcast.api.anchor_data.FinishEncourageDecoupling;

/* JADX INFO: loaded from: classes32.dex */
public class AUListenerS158S0300000_31 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS158S0300000_31 aUListenerS158S0300000_31, ValueAnimator valueAnimator) {
        ((IMAppBarLayout$Behavior) aUListenerS158S0300000_31.l0).setHeaderTopBottomOffset((C16G0) aUListenerS158S0300000_31.l1, (C16GW) aUListenerS158S0300000_31.l2, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    public static final void onAnimationUpdate$1(AUListenerS158S0300000_31 aUListenerS158S0300000_31, ValueAnimator valueAnimator) {
        int i;
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C15X1 c15x1 = ((StoryThoughtAvatarCreationFragment) aUListenerS158S0300000_31.l0).WR().LLILZ;
        T value = ((StoryThoughtAvatarCreationFragment) aUListenerS158S0300000_31.l0).WR().LLLJL.getValue();
        EnumC1405120mfW enumC1405120mfW = EnumC1405120mfW.DEFAULT;
        int i2 = -16777216;
        if (value == enumC1405120mfW) {
            i = -16777216;
        } else {
            i = -1;
        }
        if (((StoryThoughtAvatarCreationFragment) aUListenerS158S0300000_31.l0).WR().LLLJL.getValue() == enumC1405120mfW) {
            i2 = -1;
        }
        int iIntValue = C20632215oO.LIZ(fFloatValue, -1, Integer.valueOf(i)).intValue();
        int iIntValue2 = C20632215oO.LIZ(fFloatValue, -16777216, Integer.valueOf(i2)).intValue();
        int iIntValue3 = C20632215oO.LIZ(fFloatValue, C1308910kAL.LIZJ(R.attr.zj, (Context) aUListenerS158S0300000_31.l1), -16777216).intValue();
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c15x1.getScrollViewPaddingBottomOnSoftInputShownDp() + ((c15x1.getScrollViewPaddingBottomOnSoftInputHiddenDp() - c15x1.getScrollViewPaddingBottomOnSoftInputShownDp()) * (1.0f - fFloatValue)))));
        ((C20580115fz) aUListenerS158S0300000_31.l2).LLJJJJJIL.setBackgroundTintList(ColorStateList.valueOf(iIntValue));
        ((C20580115fz) aUListenerS158S0300000_31.l2).LLJJJJJIL.setTextColor(iIntValue2);
        ((C20580115fz) aUListenerS158S0300000_31.l2).LLJJJJJIL.setIconTintColor(iIntValue2);
        if (((C20580115fz) aUListenerS158S0300000_31.l2).LLJILLL.getVisibility() == 0) {
            ((C20580115fz) aUListenerS158S0300000_31.l2).LLJILLL.setBackgroundTintList(ColorStateList.valueOf(iIntValue3));
        }
        ScrollView scrollView = ((C20580115fz) aUListenerS158S0300000_31.l2).LLJJIJIL;
        scrollView.setPadding(scrollView.getPaddingLeft(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(((StoryThoughtAvatarCreationFragment) aUListenerS158S0300000_31.l0).WR().LLILZ.getScrollViewPaddingTopDp()))), scrollView.getPaddingRight(), iLIZIZ);
    }

    public static final void onAnimationUpdate$2(AUListenerS158S0300000_31 aUListenerS158S0300000_31, ValueAnimator valueAnimator) {
        Boolean boolValueOf;
        C1836710xtd c1836710xtd;
        if (valueAnimator.getAnimatedFraction() >= 1.0f) {
            FinishEncourageDecoupling finishEncourageDecoupling = (FinishEncourageDecoupling) aUListenerS158S0300000_31.l0;
            if (finishEncourageDecoupling != null) {
                boolValueOf = Boolean.valueOf(finishEncourageDecoupling.showDiamonds);
            } else {
                boolValueOf = null;
            }
            if (C500260Jjc.LJJJI(boolValueOf) && (c1836710xtd = ((EndIncentiveSettlementFragmentV2) aUListenerS158S0300000_31.l1).LLJILJIL) != null) {
                c1836710xtd.play();
            }
            C500260Jjc.LLFFF((C1295960jpS) aUListenerS158S0300000_31.l2);
        }
    }

    public static final void onAnimationUpdate$3(AUListenerS158S0300000_31 aUListenerS158S0300000_31, ValueAnimator valueAnimator) {
        ((C118300cf) aUListenerS158S0300000_31.l0).element = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ((GradientDrawable) aUListenerS158S0300000_31.l1).setAlpha(((C118300cf) aUListenerS158S0300000_31.l0).element);
        ((C20575915fJ) aUListenerS158S0300000_31.l2).LIZIZ.invalidate();
    }

    public AUListenerS158S0300000_31(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj3;
        this.l1 = obj2;
        this.l2 = obj;
    }
}
