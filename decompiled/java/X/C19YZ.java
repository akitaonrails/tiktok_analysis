package X;

import Y.ALAdapterS6S0101000_33;
import Y.AUListenerS0S0104000_33;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.19YZ, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19YZ extends LinearLayout {
    public int LL;
    public final Paint LLILLJJLI;
    public int LLILLL;
    public float LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public float LLIZLLLIL;
    public float LLJ;
    public ValueAnimator LLJI;
    public int LLJIJIL;
    public float LLJILJIL;
    public float LLJILJILJ;
    public boolean LLJILLL;
    public final /* synthetic */ C19YY LLJJ;

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
        if (left == this.LLILZLL && right == this.LLIZ) {
            return;
        }
        this.LLILZLL = left;
        this.LLIZ = right;
        postInvalidateOnAnimation();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        Point pointLIZ;
        View childAt;
        super.draw(canvas);
        C19YY c19yy = this.LLJJ;
        if (!c19yy.LLJLL && (i = this.LLILZLL) >= 0 && this.LLIZ > i && !c19yy.LLJLILLLLZIIL) {
            c19yy.getClass();
            C19YY c19yy2 = this.LLJJ;
            if (c19yy2.LLJLLIL && (childAt = getChildAt(c19yy2.getSelectedTabPosition())) != null) {
                View viewFindViewById = childAt.findViewById(R.id.mg7);
                View viewFindViewById2 = childAt.findViewById(R.id.wy1);
                if (viewFindViewById != null) {
                    if (this.LLJJ.LLJJJJ == null || !this.LLJILLL) {
                        if (viewFindViewById2 != null && viewFindViewById2.getVisibility() != 8) {
                            this.LLJILJIL = this.LLILZLL + ((((this.LLIZ - r0) - viewFindViewById.getWidth()) - (viewFindViewById2.getRight() - viewFindViewById.getRight())) / 2.0f);
                        } else {
                            this.LLJILJIL = this.LLILZLL + (((this.LLIZ - r0) - viewFindViewById.getWidth()) / 2.0f);
                        }
                        this.LLJILJILJ = this.LLJILJIL + viewFindViewById.getWidth();
                        int i2 = this.LLILZIL;
                        if (i2 != -1 && i2 < viewFindViewById.getWidth()) {
                            float width = (viewFindViewById.getWidth() - this.LLILZIL) / 2;
                            this.LLJILJIL += width;
                            this.LLJILJILJ -= width;
                        }
                    }
                    canvas.drawRoundRect(new RectF(this.LLJILJIL, getHeight() - this.LL, this.LLJILJILJ, getHeight()), this.LLIZLLLIL, this.LLJ, this.LLILLJJLI);
                    return;
                }
            }
            View childAt2 = getChildAt(this.LLJJ.getSelectedTabPosition());
            InterfaceC21558119Yl interfaceC21558119Yl = this.LLJJ.LLJLLL;
            if (interfaceC21558119Yl != null && (childAt2 instanceof C19YX) && (pointLIZ = interfaceC21558119Yl.LIZ((C19YX) childAt2, this.LLILZLL, this.LLIZ)) != null) {
                canvas.drawRoundRect(new RectF(pointLIZ.x, getHeight() - this.LL, pointLIZ.y, getHeight()), this.LLIZLLLIL, this.LLJ, this.LLILLJJLI);
            } else {
                canvas.drawRoundRect(new RectF(this.LLILZLL, getHeight() - this.LL, this.LLIZ, getHeight()), this.LLIZLLLIL, this.LLJ, this.LLILLJJLI);
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19YZ(C19YY c19yy, Context context) {
        super(context);
        this.LLJJ = c19yy;
        this.LLILLL = -1;
        this.LLILZIL = -1;
        this.LLILZLL = -1;
        this.LLIZ = -1;
        c19yy.LJIIIIZZ(27);
        this.LLJIJIL = Integer.MAX_VALUE;
        setWillNotDraw(false);
        this.LLILLJJLI = new Paint();
    }

    public final void LIZ(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        ValueAnimator valueAnimator = this.LLJI;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.LLJI.cancel();
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
            i4 = this.LLILZLL;
            i3 = this.LLIZ;
        } else {
            int iLJIIIIZZ = this.LLJJ.LJIIIIZZ(24);
            if (i >= this.LLILLL ? !z : z) {
                i3 = left - iLJIIIIZZ;
            } else {
                i3 = iLJIIIIZZ + right;
            }
            i4 = i3;
        }
        if (i4 != left || i3 != right) {
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.LLJI = valueAnimator2;
            valueAnimator2.setInterpolator(C194W.LIZ);
            valueAnimator2.setDuration(i2);
            valueAnimator2.setFloatValues(0.0f, 1.0f);
            valueAnimator2.addUpdateListener(new AUListenerS0S0104000_33(this, i4, left, i3, right, 2));
            valueAnimator2.addListener(new ALAdapterS6S0101000_33(this, i, 3));
            valueAnimator2.start();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
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
                this.LLJIJIL = Math.min(this.LLJIJIL, childAt.getMeasuredWidth());
            }
        }
        C19YY c19yy = this.LLJJ;
        int i5 = c19yy.LLJJIII;
        if (i5 == 1) {
            if (c19yy.LLJJI != 1 || iMax <= 0) {
                return;
            }
            if (iMax * childCount <= getMeasuredWidth() - (c19yy.LJIIIIZZ(16) * 2)) {
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
                C19YY c19yy2 = this.LLJJ;
                c19yy2.LLJJI = 0;
                c19yy2.LJIJI(false);
            }
            super.onMeasure(i, i2);
            return;
        }
        if (i5 != 0 || !c19yy.LLJJIJI || c19yy.LLJZIJLIL != getResources().getConfiguration().orientation || iMax <= 0) {
            return;
        }
        int measuredWidth = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt2 = getChildAt(i6);
            if (childAt2.getVisibility() != 8) {
                measuredWidth += childAt2.getMeasuredWidth();
            }
        }
        if (measuredWidth > 0 && measuredWidth < this.LLJJ.getMeasuredWidth()) {
            int i7 = iMax * childCount;
            if (i7 < this.LLJJ.getMeasuredWidth()) {
                int measuredWidth2 = (this.LLJJ.getMeasuredWidth() - i7) / (childCount * 2);
                z = false;
                while (i3 < childCount) {
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) getChildAt(i3).getLayoutParams();
                    if (layoutParams2.width != iMax || layoutParams2.weight != 0.0f || layoutParams2.leftMargin != measuredWidth2 || layoutParams2.rightMargin != measuredWidth2) {
                        layoutParams2.width = iMax;
                        layoutParams2.weight = 0.0f;
                        layoutParams2.leftMargin = measuredWidth2;
                        layoutParams2.rightMargin = measuredWidth2;
                        z = true;
                    }
                    i3++;
                }
            } else {
                int measuredWidth3 = (this.LLJJ.getMeasuredWidth() - measuredWidth) / (childCount * 2);
                z = false;
                while (i3 < childCount) {
                    if (getChildAt(i3).getVisibility() != 8) {
                        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) getChildAt(i3).getLayoutParams();
                        layoutParams3.leftMargin = measuredWidth3;
                        layoutParams3.rightMargin = measuredWidth3;
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
        ValueAnimator valueAnimator = this.LLJI;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.LLJI.cancel();
            LIZ(this.LLILLL, Math.round((1.0f - this.LLJI.getAnimatedFraction()) * this.LLJI.getDuration()));
            return;
        }
        LIZIZ();
    }
}
