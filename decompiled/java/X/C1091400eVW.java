package X;

import Y.ALAdapterS12S0200000_17;
import Y.ALAdapterS13S0100000_17;
import Y.AUListenerS34S0301000_6;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.PathInterpolator;
import android.widget.TextView;
import com.bytedance.android.live.wallet.IWalletService;
import webcast.api.profit.IapListResult;

/* JADX INFO: renamed from: X.0eVW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1091400eVW {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZLLL(View view) {
        if (view == null) {
            return;
        }
        C786410Ut5.Ob(view, 1.0f);
        C786410Ut5.pc(view, 1.0f);
        ObjectAnimator duration = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f, 1.3f, 1.0f).setDuration(560L);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f, 1.3f, 1.0f).setDuration(560L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(duration, duration2);
        animatorSet.setInterpolator(new PathInterpolator(0.66f, 0.0f, 0.34f, 1.0f));
        animatorSet.addListener(new ALAdapterS12S0200000_17(animatorSet, view, 30));
        animatorSet.start();
    }

    public static void LIZ(View view, View view2) {
        if (view != null && view2 != null) {
            int[] iArr = new int[2];
            view2.getLocationOnScreen(iArr);
            int[] iArr2 = {iArr[0] + ((view2.getWidth() + 1) / 2), iArr[1] + ((view2.getHeight() + 1) / 2)};
            int[] iArr3 = new int[2];
            view.getLocationOnScreen(iArr3);
            int[] iArr4 = {iArr3[0] + ((view.getWidth() + 1) / 2), iArr3[1] + ((view.getHeight() + 1) / 2)};
            C786410Ut5.Fd(view, (view.getX() + iArr2[0]) - iArr4[0]);
            C786410Ut5.Ld(view, (view.getY() + iArr2[1]) - iArr4[1]);
            view.requestLayout();
        }
    }

    public static void LIZJ(C1295960jpS c1295960jpS, C1295960jpS c1295960jpS2, TextView textView) {
        if (c1295960jpS != null) {
            c1295960jpS.removeAllAnimatorListeners();
            c1295960jpS.removeAllUpdateListeners();
        }
        if (c1295960jpS2 != null) {
            c1295960jpS2.removeAllAnimatorListeners();
            c1295960jpS2.removeAllUpdateListeners();
        }
        if (c1295960jpS != null) {
            c1295960jpS.setAnimation((Animation) null);
        }
        if (c1295960jpS2 != null) {
            c1295960jpS2.setAnimation((Animation) null);
        }
        if (textView != null) {
            textView.setAnimation(null);
        }
        if (c1295960jpS != null) {
            C500260Jjc.LJIILIIL(c1295960jpS);
        }
        if (c1295960jpS2 != null) {
            C500260Jjc.LJIILIIL(c1295960jpS2);
        }
        if (textView != null) {
            C500260Jjc.LJIILIIL(textView);
        }
    }

    public static void LIZIZ(int i, int i2, String str, boolean z) {
        IapListResult.QuickChargeConfig quickChargeConfig;
        int i3;
        String strLIZIZ;
        IapListResult.ListResultExtra listResultExtraVx1 = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().vx1();
        if (listResultExtraVx1 != null) {
            quickChargeConfig = listResultExtraVx1.quickChargeConfig;
        } else {
            quickChargeConfig = null;
        }
        if (quickChargeConfig == null) {
            i3 = -1;
        } else if (quickChargeConfig.hasValidBizContract) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_recharge_success_anime");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(String.valueOf(i3), "is_quick_charge_on");
        c474500IjALIZ.LJJII(String.valueOf(z ? 1 : 0), "is_charge_status");
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("other: ");
                    sbLIZ.append(i2);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                } else {
                    strLIZIZ = "google";
                }
            } else {
                strLIZIZ = "pipo";
            }
        } else {
            strLIZIZ = "unknown";
        }
        c474500IjALIZ.LJJII(strLIZIZ, "recharge_channel");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "coin_amount");
        c474500IjALIZ.LJJII(str, "scenario_type");
        c474500IjALIZ.LIZ();
    }

    public static void LJ(C1295960jpS c1295960jpS, final C1295960jpS c1295960jpS2, final TextView textView, final View view, final int i) {
        if (c1295960jpS != null && c1295960jpS2 != null && textView != null && !c1295960jpS.isAnimating() && !c1295960jpS2.isAnimating()) {
            LIZJ(c1295960jpS, c1295960jpS2, textView);
            C500260Jjc.LLFFF(c1295960jpS);
            c1295960jpS.setMinProgress(0.0f);
            c1295960jpS.setMaxProgress(1.0f);
            c1295960jpS.setProgress(0.0f);
            final C013C c013c = new C013C();
            c013c.element = true;
            c1295960jpS.addAnimatorUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0eVX
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    if (valueAnimator.getAnimatedFraction() >= 0.1f) {
                        C013C c013c2 = c013c;
                        if (c013c2.element) {
                            c013c2.element = false;
                            C1295960jpS c1295960jpS3 = c1295960jpS2;
                            TextView textView2 = textView;
                            View view2 = view;
                            int i2 = i;
                            C500260Jjc.LLFFF(c1295960jpS3);
                            C013C c013c3 = new C013C();
                            c013c3.element = true;
                            c1295960jpS3.setMinProgress(0.0f);
                            c1295960jpS3.setMaxProgress(1.0f);
                            c1295960jpS3.setProgress(0.0f);
                            c1295960jpS3.addAnimatorUpdateListener(new AUListenerS34S0301000_6(c013c3, textView2, i2, view2, 1));
                            c1295960jpS3.addAnimatorListener(new ALAdapterS13S0100000_17(c1295960jpS3, 80));
                            C1143680frq.LJIILJJIL(c1295960jpS3, "tiktok_live_revenue_normal_1", "ttlive_quick_charge_icons.zip", true);
                        }
                    }
                }
            });
            c1295960jpS.addAnimatorListener(new ALAdapterS13S0100000_17(c1295960jpS, 79));
            C1143680frq.LJIILJJIL(c1295960jpS, "tiktok_live_revenue_normal_1", "ttlive_quick_charge_particles.zip", true);
        }
    }
}
