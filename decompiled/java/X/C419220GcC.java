package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: X.0GcC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C419220GcC extends RelativeLayout {
    public float LL;
    public float LLILLJJLI;
    public ViewGroup.LayoutParams LLILLL;
    public final Paint LLILZ;
    public float LLILZIL;
    public View LLILZLL;
    public final float LLIZ;
    public final float LLIZLLLIL;
    public View LLJ;
    public int LLJI;
    public float LLJIJIL;
    public boolean LLJILJIL;

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        if (this.LLJILJIL) {
            measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            this.LLILLJJLI = getMeasuredHeight();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f;
        if (!this.LLJILJIL) {
            super.dispatchDraw(canvas);
            return;
        }
        int width = 0;
        if (this.LLILZIL != -1.0f && this.LLJ != null) {
            canvas.save();
            View view = this.LLJ;
            if (view != null) {
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                f = iArr[0];
                width = view.getWidth();
            } else {
                f = 0.0f;
            }
            float f2 = f + (width / 2.0f);
            float height = getHeight();
            float f3 = f2 - (height / 2.0f);
            float f4 = height + f3;
            getHeight();
            float fLIZLLL = C13LZ.LIZLLL(this.LLILZIL * 3.0f, 0.0f, 1.0f);
            float f5 = this.LLIZ * fLIZLLL;
            float f6 = fLIZLLL * this.LLIZLLLIL;
            float height2 = getHeight();
            float height3 = getHeight() - f5;
            float f7 = f6 / 2.0f;
            float f8 = f2 - f7;
            float f9 = f7 + f2;
            if (this.LLILZIL > 0.05f) {
                Path path = new Path();
                path.moveTo(f8, height3);
                path.lineTo(f9, height3);
                path.lineTo(f2, height2);
                path.close();
                canvas.drawPath(path, this.LLILZ);
            }
            float f10 = this.LLILZIL;
            if (f10 <= 0.5f) {
                float f11 = (this.LLIZ / 3.0f) * f10;
                RectF rectF = new RectF(f3 + f11, 0.0f, f4 - f11, height3);
                float f12 = this.LLILLJJLI;
                canvas.drawRoundRect(rectF, f12, f12, this.LLILZ);
                this.LLJIJIL = height3;
            } else {
                float fLIZLLL2 = C13LZ.LIZLLL((f10 - 0.5f) / 0.5f, 0.0f, 1.0f);
                float f13 = 1 - fLIZLLL2;
                float f14 = f4 + ((this.LL - f4) * fLIZLLL2);
                float f15 = this.LLJIJIL;
                float f16 = this.LLILLJJLI;
                float f18 = f15 + ((f16 - f15) * fLIZLLL2);
                float f19 = f16 * f13;
                canvas.drawRoundRect(new RectF(f3 * f13, 0.0f, f14, f18), f19, f19, this.LLILZ);
            }
            canvas.restore();
        }
        super.dispatchDraw(canvas);
    }

    public final void setNeedAnimation(boolean z) {
        this.LLJILJIL = z;
    }

    public C419220GcC(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint(1);
        this.LLILZ = paint;
        this.LLILZIL = -1.0f;
        this.LLIZ = C12ES.LIZJ(5.0f, context);
        this.LLIZLLLIL = C12ES.LIZJ(12.0f, context);
        this.LLJILJIL = true;
        paint.setColor(this.LLJI);
        int visibility = getVisibility();
        setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, this);
        invalidate();
    }

    public final void LIZ(View view, float f) {
        RelativeLayout.LayoutParams layoutParams;
        if (!this.LLJILJIL) {
            return;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        this.LLILZIL = f;
        if (this.LLJ == null) {
            this.LLJ = view;
        }
        LIZIZ(this.LL * f, (this.LLILLJJLI + this.LLIZ) * f);
        if (this.LLILZIL == 1.0f && this.LLJILJIL) {
            if (this.LLILZLL == null) {
                this.LLILZLL = getChildAt(0);
            }
            View view2 = this.LLILZLL;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                if ((layoutParams2 instanceof RelativeLayout.LayoutParams) && (layoutParams = (RelativeLayout.LayoutParams) layoutParams2) != null && (layoutParams.width != getLayoutParams().width || layoutParams.height != getLayoutParams().height)) {
                    layoutParams.width = getLayoutParams().width;
                    layoutParams.height = getLayoutParams().height;
                    C786410Ut5.W5(view2, layoutParams);
                    view2.requestLayout();
                }
            }
        }
        invalidate();
    }

    public final void LIZIZ(float f, float f2) {
        if (!this.LLJILJIL) {
            return;
        }
        int i = (int) f2;
        if (i < 1) {
            i = 1;
        }
        if (this.LLILLL == null) {
            this.LLILLL = getLayoutParams();
        }
        ViewGroup.LayoutParams layoutParams = this.LLILLL;
        if (layoutParams != null) {
            layoutParams.width = (int) f;
            layoutParams.height = i;
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        View view;
        super.onMeasure(i, i2);
        if (!this.LLJILJIL) {
            return;
        }
        Object parent = getParent();
        if (parent instanceof View) {
            view = (View) parent;
        } else {
            view = null;
        }
        float measuredWidth = 0.0f;
        if (this.LL == 0.0f) {
            if (view != null) {
                measuredWidth = view.getMeasuredWidth();
            }
            this.LL = measuredWidth;
            LIZIZ(measuredWidth, 1.0f);
            int visibility = getVisibility();
            setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, this);
        }
    }
}
