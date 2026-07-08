package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabTransformer;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import kotlin.jvm.internal.AwS233S0300000_24;

/* JADX INFO: renamed from: X.0rXh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1592470rXh extends C1592460rXg {
    public final float LLJJJJJIL;
    public final /* synthetic */ C1592450rXf LLJJJJLIIL;

    public final float getMinAlpha() {
        return this.LLJJJJJIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1592470rXh(final C1592450rXf c1592450rXf, Context context) {
        super(c1592450rXf, context);
        this.LLJJJJLIIL = c1592450rXf;
        this.LLJJJJJIL = 0.6f;
        new AnimatorSet();
        LIZ();
        c1592450rXf.LLJILJILJ.add(new InterfaceC1592590rXt() { // from class: X.0rXj
            @Override // X.InterfaceC1592590rXt
            public final void LIZ() {
            }

            @Override // X.InterfaceC1592590rXt
            public final void LIZIZ(C1591980rWu c1591980rWu) {
                C1592630rXx tabAnimationHelper = c1592450rXf.getTabAnimationHelper();
                if (tabAnimationHelper != null) {
                    tabAnimationHelper.LIZIZ(c1591980rWu);
                } else {
                    C1592080rX4 c1592080rX4 = c1591980rWu.LIZLLL;
                    C1592450rXf c1592450rXf2 = c1592450rXf;
                    ITabTransformer iTabTransformer = c1592450rXf2.LLJZIJLIL;
                    if (iTabTransformer != null) {
                        iTabTransformer.kN0(c1592080rX4);
                    } else {
                        c1592450rXf2.LJJII(new AwS233S0300000_24(c1592080rX4, c1591980rWu, this, 3));
                    }
                    if (c1592080rX4 != null) {
                        c1592450rXf.LLILLL.LJIIJ(c1592080rX4, r0.LLJJJ);
                    }
                }
                if (!c1592450rXf.getSwipeMode()) {
                    this.LJIIIZ(c1591980rWu, false);
                }
            }

            @Override // X.InterfaceC1592590rXt
            public final void LIZJ(C1591980rWu c1591980rWu) {
                C1592080rX4 c1592080rX4;
                TextView mCustomTextView$homepage_common_release;
                TuxTextView tuxTextView;
                C1592630rXx tabAnimationHelper = c1592450rXf.getTabAnimationHelper();
                if (!c1592450rXf.getSwipeMode()) {
                    this.LJIIIZ(c1591980rWu, true);
                }
                TextView mCustomTextView$homepage_common_release2 = null;
                if (tabAnimationHelper != null) {
                    tabAnimationHelper.LIZJ(c1591980rWu);
                } else if (!c1592450rXf.getSwipeMode() && (c1592080rX4 = c1591980rWu.LIZLLL) != null && (mCustomTextView$homepage_common_release = c1592080rX4.getMCustomTextView$homepage_common_release()) != null) {
                    mCustomTextView$homepage_common_release.setTypeface(C1697580uHE.LIZIZ(0.0f, 500, 17.0f, 0.0f, Float.valueOf(16.0f), 0.0f, 0, null, 224));
                }
                if (c1592450rXf.LLLII) {
                    C1592080rX4 c1592080rX42 = c1591980rWu.LIZLLL;
                    if (c1592080rX42 != null) {
                        mCustomTextView$homepage_common_release2 = c1592080rX42.getMCustomTextView$homepage_common_release();
                    }
                    if ((mCustomTextView$homepage_common_release2 instanceof TuxTextView) && (tuxTextView = (TuxTextView) mCustomTextView$homepage_common_release2) != null) {
                        C1592470rXh c1592470rXh = this;
                        float f = c1592450rXf.LLJJJ;
                        c1592470rXh.getClass();
                        C1592470rXh.LJIIIIZZ(tuxTextView, false, f);
                    }
                }
            }
        });
    }

    public final void LJIIIZ(C1591980rWu c1591980rWu, boolean z) {
        C1592080rX4 c1592080rX4;
        TextView mCustomTextView$homepage_common_release;
        float f;
        ObjectAnimator duration;
        ObjectAnimator duration2 = null;
        if (c1591980rWu != null && (c1592080rX4 = c1591980rWu.LIZLLL) != null && (mCustomTextView$homepage_common_release = c1592080rX4.getMCustomTextView$homepage_common_release()) != null) {
            float f2 = 1.0f;
            if (!z) {
                if (this.LLJJJJLIIL.getEnableAnimation()) {
                    duration2 = ObjectAnimator.ofFloat(mCustomTextView$homepage_common_release, "scaleX", mCustomTextView$homepage_common_release.getScaleX(), 1.25f, 1.125f).setDuration(300L);
                    duration2.setInterpolator(new TimeInterpolator() { // from class: X.0rXu
                        @Override // android.animation.TimeInterpolator
                        public final float getInterpolation(float f3) {
                            return f3 < 0.33333334f ? f3 * 1.5f : (f3 * 0.75f) + 0.25f;
                        }
                    });
                    duration = ObjectAnimator.ofFloat(mCustomTextView$homepage_common_release, "scaleY", mCustomTextView$homepage_common_release.getScaleY(), 1.25f, 1.125f).setDuration(300L);
                    duration.setInterpolator(new TimeInterpolator() { // from class: X.0rXv
                        @Override // android.animation.TimeInterpolator
                        public final float getInterpolation(float f3) {
                            return f3 < 0.33333334f ? f3 * 1.5f : (f3 * 0.75f) + 0.25f;
                        }
                    });
                } else {
                    duration = null;
                }
                f = 1.0f;
                f2 = 1.125f;
            } else {
                f = 0.6f;
                if (this.LLJJJJLIIL.getEnableAnimation()) {
                    duration2 = ObjectAnimator.ofFloat(mCustomTextView$homepage_common_release, "scaleX", mCustomTextView$homepage_common_release.getScaleX(), 1.0f).setDuration(200L);
                    duration = ObjectAnimator.ofFloat(mCustomTextView$homepage_common_release, "scaleY", mCustomTextView$homepage_common_release.getScaleY(), 1.0f).setDuration(200L);
                } else {
                    duration = null;
                }
            }
            if (this.LLJJJJLIIL.getEnableAnimation()) {
                ObjectAnimator duration3 = ObjectAnimator.ofFloat(mCustomTextView$homepage_common_release, "alpha", mCustomTextView$homepage_common_release.getAlpha(), f).setDuration(200L);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(duration3, duration2, duration);
                animatorSet.start();
                return;
            }
            C786410Ut5.Mb(f2, mCustomTextView$homepage_common_release);
            C786410Ut5.nc(f2, mCustomTextView$homepage_common_release);
            C786410Ut5.S4(f, mCustomTextView$homepage_common_release);
        }
    }

    public final void LJIIJ(C1592080rX4 c1592080rX4, float f) {
        TextView mCustomTextView$homepage_common_release;
        TextView mCustomTextView$homepage_common_release2;
        TuxTextView tuxTextView;
        C1592080rX4 c1592080rX42;
        int childCount = getChildCount();
        TuxTextView tuxTextView2 = null;
        if (childCount >= 0) {
            int i = 0;
            while (true) {
                View childAt = getChildAt(i);
                if ((childAt instanceof C1592080rX4) && (c1592080rX42 = (C1592080rX4) childAt) != null) {
                    mCustomTextView$homepage_common_release2 = c1592080rX42.getMCustomTextView$homepage_common_release();
                } else {
                    mCustomTextView$homepage_common_release2 = null;
                }
                if ((mCustomTextView$homepage_common_release2 instanceof TuxTextView) && (tuxTextView = (TuxTextView) mCustomTextView$homepage_common_release2) != null && (tuxTextView.getVisibility() == 0 || tuxTextView.getVisibility() == 4)) {
                    LJIIIIZZ(tuxTextView, false, f);
                }
                if (i == childCount) {
                    break;
                } else {
                    i++;
                }
            }
        }
        if (c1592080rX4 != null) {
            mCustomTextView$homepage_common_release = c1592080rX4.getMCustomTextView$homepage_common_release();
        } else {
            mCustomTextView$homepage_common_release = null;
        }
        if ((mCustomTextView$homepage_common_release instanceof TuxTextView) && (tuxTextView2 = (TuxTextView) mCustomTextView$homepage_common_release) != null) {
            LJIIIIZZ(tuxTextView2, true, f);
        }
        if (!this.LLJJJJLIIL.getSwipeMode() && tuxTextView2 != null) {
            tuxTextView2.setTypeface(C1697580uHE.LIZIZ(0.0f, OppoPermissionPopupMaskDelayExp.DEFAULT, 17.0f, 0.0f, Float.valueOf(16.0f), 0.0f, 0, null, 224));
        }
    }

    public static void LJIIIIZZ(TuxTextView tuxTextView, boolean z, float f) {
        Typeface typefaceLIZ;
        if (C19252910Tv.LIZIZ.LIZLLL().LJIJI().LJJL().LJJII()) {
            return;
        }
        C1591460rW4.LIZ.getClass();
        C1591800rWc c1591800rWc = C1591460rW4.LJIIIZ;
        if (c1591800rWc != null) {
            typefaceLIZ = C1340540kzM.LIZ(z, r2.fontSize, c1591800rWc.LIZ.fontWidth, 4);
        } else if (z) {
            if (f != 17.0f && f == 15.0f && C1591880rWk.LIZIZ.LJIIJ().LIZIZ() == EnumC1591490rW7.SMALL_NARROW_FONT) {
                typefaceLIZ = C1340540kzM.LIZ(true, f, C13LZ.LJ(((Number) C0AFW.LIZ.getValue()).intValue(), 70, 150), 4);
            } else {
                typefaceLIZ = C1340540kzM.LIZ(true, f, 0, 12);
            }
        } else if (f != 17.0f && f == 15.0f && C1591880rWk.LIZIZ.LJIIJ().LIZIZ() == EnumC1591490rW7.SMALL_NARROW_FONT) {
            typefaceLIZ = C1340540kzM.LIZ(false, f, C13LZ.LJ(((Number) C0AFW.LIZ.getValue()).intValue(), 70, 150), 4);
        } else {
            typefaceLIZ = C1340540kzM.LIZ(false, f, 0, 12);
        }
        tuxTextView.setTypeface(typefaceLIZ);
        tuxTextView.setTextSize(1, f);
    }
}
