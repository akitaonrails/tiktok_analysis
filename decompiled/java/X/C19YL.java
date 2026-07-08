package X;

import Y.ALAdapterS6S0101000_33;
import Y.AUListenerS0S0104000_33;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.19YL, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19YL extends LinearLayout {
    public int LL;
    public final Paint LLILLJJLI;
    public int LLILLL;
    public float LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public ValueAnimator LLIZ;
    public int LLIZLLLIL;
    public float LLJ;
    public float LLJI;
    public boolean LLJIJIL;
    public int LLJILJIL;
    public final /* synthetic */ C19YK LLJILJILJ;

    public final void LIZIZ() {
        int right;
        View childAt = getChildAt(this.LLILLL);
        int left = -1;
        if (childAt == null || childAt.getWidth() <= 0) {
            right = -1;
        } else {
            left = childAt.getLeft();
            right = childAt.getRight();
            if (this.LLILZ > 0.0f && this.LLILLL < getChildCount() - 1) {
                View childAt2 = getChildAt(this.LLILLL + 1);
                float left2 = this.LLILZ * childAt2.getLeft();
                float f = this.LLILZ;
                left = (int) (left2 + ((1.0f - f) * left));
                right = (int) ((f * childAt2.getRight()) + ((1.0f - this.LLILZ) * right));
            }
        }
        if (left == this.LLILZIL && right == this.LLILZLL) {
            return;
        }
        this.LLILZIL = left;
        this.LLILZLL = right;
        postInvalidateOnAnimation();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        View viewFindViewById;
        super.draw(canvas);
        int i = this.LLILZIL;
        if (i >= 0 && this.LLILZLL > i) {
            View childAt = getChildAt(this.LLJILJILJ.getSelectedTabPosition());
            if (childAt != null && (viewFindViewById = childAt.findViewById(R.id.mg7)) != null) {
                if (this.LLJILJILJ.LLJL == null || !this.LLJIJIL) {
                    int i2 = this.LLILZIL;
                    float width = i2 + (((this.LLILZLL - i2) - viewFindViewById.getWidth()) / 2);
                    this.LLJ = width;
                    this.LLJI = width + viewFindViewById.getWidth();
                }
                canvas.drawRect(this.LLJ + this.LLJILJIL, getHeight() - this.LL, this.LLJI - this.LLJILJIL, getHeight(), this.LLILLJJLI);
                return;
            }
            canvas.drawRect(this.LLILZIL + this.LLJILJIL, getHeight() - this.LL, this.LLILZLL - this.LLJILJIL, getHeight(), this.LLILLJJLI);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19YL(C19YK c19yk, Context context) {
        super(context);
        this.LLJILJILJ = c19yk;
        this.LLILLL = -1;
        this.LLILZIL = -1;
        this.LLILZLL = -1;
        c19yk.LJI(27);
        this.LLIZLLLIL = Integer.MAX_VALUE;
        setWillNotDraw(false);
        this.LLILLJJLI = new Paint();
    }

    public final void LIZ(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        ValueAnimator valueAnimator = this.LLIZ;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.LLIZ.cancel();
        }
        if (getLayoutDirection() == 1) {
            z = true;
        } else {
            z = false;
        }
        View childAt = getChildAt(i);
        if (childAt == null) {
            LIZIZ();
            return;
        }
        int left = childAt.getLeft();
        int right = childAt.getRight();
        if (Math.abs(i - this.LLILLL) <= 1) {
            i4 = this.LLILZIL;
            i3 = this.LLILZLL;
        } else {
            int iLJI = this.LLJILJILJ.LJI(24);
            if (i >= this.LLILLL ? !z : z) {
                i3 = left - iLJI;
            } else {
                i3 = iLJI + right;
            }
            i4 = i3;
        }
        if (i4 != left || i3 != right) {
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.LLIZ = valueAnimator2;
            valueAnimator2.setInterpolator(C19YK.LLLF);
            valueAnimator2.setDuration(i2);
            valueAnimator2.setFloatValues(0.0f, 1.0f);
            valueAnimator2.addUpdateListener(new AUListenerS0S0104000_33(this, i4, left, i3, right, 4));
            valueAnimator2.addListener(new ALAdapterS6S0101000_33(this, i, 5));
            valueAnimator2.start();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredWidth;
        boolean z;
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            return;
        }
        int childCount = getChildCount();
        int i3 = 0;
        int iMax = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() == 0) {
                iMax = Math.max(iMax, childAt.getMeasuredWidth());
                this.LLIZLLLIL = Math.min(this.LLIZLLLIL, childAt.getMeasuredWidth());
            }
        }
        C19YK c19yk = this.LLJILJILJ;
        int i5 = c19yk.LLJJJ;
        if (i5 == 1) {
            if (c19yk.LLJJIJIL != 1 || iMax <= 0) {
                return;
            }
            if (iMax * childCount <= getMeasuredWidth() - (c19yk.LJI(16) * 2)) {
                boolean z2 = false;
                while (i3 < childCount) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i3).getLayoutParams();
                    if (layoutParams.width != iMax || layoutParams.weight != 0.0f) {
                        layoutParams.width = iMax;
                        layoutParams.weight = 0.0f;
                        z2 = true;
                    }
                    i3++;
                }
                if (!z2) {
                    return;
                }
            } else {
                C19YK c19yk2 = this.LLJILJILJ;
                c19yk2.LLJJIJIL = 0;
                c19yk2.LJIILLIIL(false);
            }
            super.onMeasure(i, i2);
            return;
        }
        if (i5 != 0 || !c19yk.LLJJJJ || c19yk.LLL != getResources().getConfiguration().orientation || iMax <= 0) {
            return;
        }
        int measuredWidth2 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt2 = getChildAt(i6);
            if (childAt2.getVisibility() != 8) {
                measuredWidth2 += childAt2.getMeasuredWidth();
            }
        }
        if (measuredWidth2 > 0 && measuredWidth2 < (measuredWidth = (this.LLJILJILJ.getMeasuredWidth() - this.LLJILJILJ.LLILZ.getPaddingLeft()) - this.LLJILJILJ.LLILZ.getPaddingRight())) {
            if (iMax * childCount < measuredWidth) {
                z = false;
                for (int i7 = 0; i7 < childCount; i7++) {
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) getChildAt(i7).getLayoutParams();
                    if (layoutParams2.width != 0 || layoutParams2.weight != 1.0f) {
                        layoutParams2.width = 0;
                        layoutParams2.weight = 1.0f;
                        z = true;
                    }
                }
            } else {
                int i8 = (measuredWidth - measuredWidth2) / (childCount * 2);
                z = false;
                while (i3 < childCount) {
                    if (getChildAt(i3).getVisibility() != 8) {
                        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) getChildAt(i3).getLayoutParams();
                        layoutParams3.leftMargin = i8;
                        layoutParams3.rightMargin = i8;
                        z = true;
                    }
                    i3++;
                }
            }
            if (z) {
                super.onMeasure(i, i2);
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ValueAnimator valueAnimator = this.LLIZ;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.LLIZ.cancel();
            LIZ(this.LLILLL, Math.round((1.0f - this.LLIZ.getAnimatedFraction()) * this.LLIZ.getDuration()));
            return;
        }
        LIZIZ();
    }
}
