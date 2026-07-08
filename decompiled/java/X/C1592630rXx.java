package X;

import Y.AUListenerS229S0200000_24;
import android.animation.FloatEvaluator;
import android.animation.ValueAnimator;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: renamed from: X.0rXx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1592630rXx implements InterfaceC469360Ias, InterfaceC1592590rXt {
    public static final Interpolator LLIZ = C0GY9.LIZIZ(0.33f, 0.86f, 0.2f, 1.0f);
    public static final FloatEvaluator LLIZLLLIL = new FloatEvaluator();
    public final C1592450rXf LL;
    public int LLILLJJLI;
    public int LLILLL;
    public boolean LLILZ;
    public Float LLILZIL;
    public Float LLILZLL;

    @Override // X.InterfaceC1592590rXt
    public final void LIZ() {
    }

    public C1592630rXx(C1592450rXf c1592450rXf) {
        this.LL = c1592450rXf;
    }

    @Override // X.InterfaceC1592590rXt
    public final void LIZIZ(C1591980rWu c1591980rWu) {
        TextView mCustomTextView$homepage_common_release;
        ImageView customImageView$homepage_common_release;
        C1592080rX4 c1592080rX4 = c1591980rWu.LIZLLL;
        if (c1592080rX4 != null && (mCustomTextView$homepage_common_release = c1592080rX4.getMCustomTextView$homepage_common_release()) != null) {
            C1592080rX4 c1592080rX42 = c1591980rWu.LIZLLL;
            if (c1592080rX42 != null) {
                customImageView$homepage_common_release = c1592080rX42.getCustomImageView$homepage_common_release();
            } else {
                customImageView$homepage_common_release = null;
            }
            int i = this.LLILLL;
            if (i == 1 || (i == 2 && this.LLILLJJLI == 1)) {
                C786410Ut5.S4(1.0f, mCustomTextView$homepage_common_release);
                if (c1591980rWu.LIZ() && customImageView$homepage_common_release != null) {
                    C786410Ut5.V4(customImageView$homepage_common_release, 1.0f);
                    return;
                }
                return;
            }
            LJ(mCustomTextView$homepage_common_release, customImageView$homepage_common_release, false);
        }
    }

    @Override // X.InterfaceC1592590rXt
    public final void LIZJ(C1591980rWu c1591980rWu) {
        TextView mCustomTextView$homepage_common_release;
        ImageView customImageView$homepage_common_release;
        C1592080rX4 c1592080rX4 = c1591980rWu.LIZLLL;
        if (c1592080rX4 != null && (mCustomTextView$homepage_common_release = c1592080rX4.getMCustomTextView$homepage_common_release()) != null) {
            C1592080rX4 c1592080rX42 = c1591980rWu.LIZLLL;
            if (c1592080rX42 != null) {
                customImageView$homepage_common_release = c1592080rX42.getCustomImageView$homepage_common_release();
            } else {
                customImageView$homepage_common_release = null;
            }
            int i = this.LLILLL;
            if (i == 1 || (i == 2 && this.LLILLJJLI == 1)) {
                C786410Ut5.S4(0.7f, mCustomTextView$homepage_common_release);
                if (c1591980rWu.LIZ() && customImageView$homepage_common_release != null) {
                    C786410Ut5.V4(customImageView$homepage_common_release, 0.7f);
                    return;
                }
                return;
            }
            LJ(mCustomTextView$homepage_common_release, customImageView$homepage_common_release, true);
        }
    }

    public final ImageView LIZLLL(Integer num) {
        C1592080rX4 c1592080rX4;
        if (num == null) {
            return null;
        }
        C1591980rWu c1591980rWuLJIILIIL = this.LL.LJIILIIL(num.intValue());
        if (c1591980rWuLJIILIIL == null || (c1592080rX4 = c1591980rWuLJIILIIL.LIZLLL) == null) {
            return null;
        }
        return c1592080rX4.getCustomImageView$homepage_common_release();
    }

    public final TextView LJI(Integer num) {
        C1592080rX4 c1592080rX4;
        if (num == null) {
            return null;
        }
        C1591980rWu c1591980rWuLJIILIIL = this.LL.LJIILIIL(num.intValue());
        if (c1591980rWuLJIILIIL == null || (c1592080rX4 = c1591980rWuLJIILIIL.LIZLLL) == null) {
            return null;
        }
        return c1592080rX4.getMCustomTextView$homepage_common_release();
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
        this.LLILLJJLI = this.LLILLL;
        this.LLILLL = i;
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageSelected(int i) {
        float f;
        float fLIZIZ;
        if (!this.LLILZ) {
            this.LLILZ = true;
            TextView textViewLJI = LJI(Integer.valueOf(i));
            if (textViewLJI != null) {
                fLIZIZ = textViewLJI.getTextSize();
            } else {
                fLIZIZ = C418440Gaw.LIZIZ(17);
            }
            float f2 = 1.1f * fLIZIZ;
            this.LLILZLL = Float.valueOf(f2);
            this.LLILZIL = Float.valueOf(fLIZIZ);
            if (textViewLJI != null) {
                textViewLJI.setTextSize(0, f2);
            }
        }
        int childCount = this.LL.getChildCount();
        int i2 = 0;
        while (true) {
            float f3 = 1.0f;
            if (i2 >= childCount) {
                break;
            }
            TextView textViewLJI2 = LJI(Integer.valueOf(i2));
            if (textViewLJI2 != null) {
                if (i2 != i) {
                    f3 = 0.7f;
                }
                C786410Ut5.S4(f3, textViewLJI2);
            }
            i2++;
        }
        int childCount2 = this.LL.getChildCount();
        for (int i3 = 0; i3 < childCount2; i3++) {
            ImageView imageViewLIZLLL = LIZLLL(Integer.valueOf(i3));
            if (imageViewLIZLLL != null) {
                if (i3 == i) {
                    f = 1.0f;
                } else {
                    f = 0.7f;
                }
                C786410Ut5.V4(imageViewLIZLLL, f);
            }
        }
    }

    public static void LJFF(TextView textView, Float f, boolean z) {
        if (f != null) {
            f.floatValue();
            textView.getPaint().setTextSize(f.floatValue());
            int width = textView.getWidth() - (textView.getPaddingRight() + textView.getPaddingLeft());
            float fMeasureText = textView.getPaint().measureText(textView.getText().toString());
            if (!z) {
                textView.postInvalidateOnAnimation();
            } else {
                textView.invalidate();
            }
            if (fMeasureText > width) {
                textView.requestLayout();
            }
        }
    }

    public final void LJ(TextView textView, ImageView imageView, boolean z) {
        float f;
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator viewPropertyAnimatorAlpha;
        ViewPropertyAnimator interpolator;
        ViewPropertyAnimator duration;
        textView.clearAnimation();
        if (imageView != null) {
            imageView.clearAnimation();
        }
        Float f2 = this.LLILZLL;
        if (f2 != null) {
            float fFloatValue = f2.floatValue();
            Float f3 = this.LLILZIL;
            if (f3 != null) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f3.floatValue(), fFloatValue);
                valueAnimatorOfFloat.setDuration(200L);
                Interpolator interpolator2 = LLIZ;
                valueAnimatorOfFloat.setInterpolator(interpolator2);
                valueAnimatorOfFloat.addUpdateListener(new AUListenerS229S0200000_24(this, textView, 4));
                if (z) {
                    f = 0.7f;
                } else {
                    f = 1.0f;
                }
                textView.animate().alpha(f).setInterpolator(interpolator2).setDuration(200L).start();
                if (imageView != null && (viewPropertyAnimatorAnimate = imageView.animate()) != null && (viewPropertyAnimatorAlpha = viewPropertyAnimatorAnimate.alpha(f)) != null && (interpolator = viewPropertyAnimatorAlpha.setInterpolator(interpolator2)) != null && (duration = interpolator.setDuration(200L)) != null) {
                    duration.start();
                }
                if (z) {
                    valueAnimatorOfFloat.reverse();
                } else {
                    valueAnimatorOfFloat.start();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00da  */
    @Override // X.InterfaceC469360Ias
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPageScrolled(int r14, float r15, int r16) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1592630rXx.onPageScrolled(int, float, int):void");
    }
}
