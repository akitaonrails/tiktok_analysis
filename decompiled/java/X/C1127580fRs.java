package X;

import Y.ALAdapterS9S0100000_12;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import com.bytedance.android.livesdk.guide.model.LocalCurrencyGiftInfo;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftLocalCurrencyGiftSetting;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fRs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1127580fRs {
    public static final /* synthetic */ int LIZ = 0;

    public static LocalCurrencyGiftInfo LIZIZ() {
        if (!LiveGiftLocalCurrencyGiftSetting.INSTANCE.isEnabled()) {
            return null;
        }
        C1126800fQc.LIZ.M92();
        return C1133940fc8.LJIIIZ();
    }

    public static boolean LIZLLL(Long l) {
        Long lValueOf;
        if (l == null) {
            return false;
        }
        LocalCurrencyGiftInfo localCurrencyGiftInfoLIZIZ = LIZIZ();
        if (localCurrencyGiftInfoLIZIZ != null) {
            lValueOf = Long.valueOf(localCurrencyGiftInfoLIZIZ.giftId);
        } else {
            lValueOf = null;
        }
        return Intrinsics.LJFF(l, lValueOf);
    }

    public static AnimatorSet LIZ(final View view, final C16F5 c16f5) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
        valueAnimatorOfInt.setDuration(1500L);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(500L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
        objectAnimatorOfFloat2.setDuration(500L);
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(0, 0);
        valueAnimatorOfInt2.setDuration(2500L);
        valueAnimatorOfInt2.addListener(new ALAdapterS9S0100000_12(c16f5, 57));
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(c16f5, (Property<C16F5, Float>) View.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat3.setDuration(500L);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(c16f5, (Property<C16F5, Float>) View.ALPHA, 1.0f, 0.0f);
        objectAnimatorOfFloat4.setDuration(500L);
        final AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(valueAnimatorOfInt, objectAnimatorOfFloat2, objectAnimatorOfFloat3, valueAnimatorOfInt2, objectAnimatorOfFloat4, objectAnimatorOfFloat);
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: X.0GzA
            public boolean LL;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                this.LL = true;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                View view2 = c16f5;
                if (view2 != null) {
                    view2.setSelected(false);
                }
                View view3 = view;
                if (view3 != null) {
                    C786410Ut5.T4(view3, 1.0f);
                }
                View view4 = c16f5;
                if (view4 != null) {
                    C786410Ut5.T4(view4, 0.0f);
                }
                if (!this.LL) {
                    animatorSet.start();
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                View view2 = view;
                if (view2 != null) {
                    C500260Jjc.LLFFF(view2);
                }
                View view3 = view;
                if (view3 != null) {
                    C786410Ut5.T4(view3, 1.0f);
                }
                View view4 = c16f5;
                if (view4 != null) {
                    C500260Jjc.LLFFF(view4);
                }
                View view5 = c16f5;
                if (view5 != null) {
                    C786410Ut5.T4(view5, 0.0f);
                }
            }
        });
        return animatorSet;
    }

    public static void LIZJ(int i, Function1 function1) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C352201Yi(i, null, function1), 3);
    }
}
