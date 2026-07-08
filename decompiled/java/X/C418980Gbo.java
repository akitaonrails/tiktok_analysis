package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Gbo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C418980Gbo extends FrameLayout {
    public int LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public final int LLILZLL;
    public final int LLIZ;
    public View LLIZLLLIL;
    public View LLJ;
    public final Rect LLJI;
    public final Rect LLJIJIL;
    public final PointF LLJILJIL;
    public final Paint LLJILJILJ;
    public final Path LLJILLL;

    public C418980Gbo(Context context) {
        super(context, null, 0);
        this.LLILLJJLI = C497740JfY.LJIIIZ(R.dimen.azw);
        this.LLILLL = C497740JfY.LJIIIZ(R.dimen.azv);
        this.LLILZ = C497740JfY.LJIIIZ(R.dimen.b00);
        this.LLILZIL = C497740JfY.LJIIIZ(R.dimen.b05);
        this.LLILZLL = C497740JfY.LJIIIZ(R.dimen.azx);
        this.LLIZ = C497740JfY.LJIIIZ(R.dimen.b02);
        this.LLJI = new Rect();
        this.LLJIJIL = new Rect();
        this.LLJILJIL = new PointF();
        this.LLJILJILJ = new Paint();
        this.LLJILLL = new Path();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.LLJILLL, this.LLJILJILJ);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        int measuredWidth;
        int measuredHeight2;
        int marginStart;
        int marginEnd;
        View view;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        int size = View.MeasureSpec.getSize(i);
        View view2 = this.LLJ;
        int width = 0;
        if (view2 != null) {
            view2.measure(View.MeasureSpec.makeMeasureSpec(size, 0), View.MeasureSpec.makeMeasureSpec(size, 0));
        }
        View view3 = this.LLJ;
        if (view3 != null) {
            measuredHeight = view3.getMeasuredHeight();
        } else {
            measuredHeight = 0;
        }
        this.LL = (measuredHeight + (this.LLILZIL * 2)) / 2;
        View view4 = this.LLJ;
        if (view4 != null) {
            measuredWidth = view4.getMeasuredWidth();
        } else {
            measuredWidth = 0;
        }
        int iMax = Math.max(measuredWidth + (this.LLILZ * 2), (this.LL * 2) + this.LLILLJJLI);
        Rect rect = this.LLJI;
        int iMin = Math.min(iMax, rect.right - rect.left);
        View view5 = this.LLJ;
        if (view5 != null) {
            measuredHeight2 = view5.getMeasuredHeight();
        } else {
            measuredHeight2 = 0;
        }
        setMeasuredDimension(iMin, measuredHeight2 + (this.LLILZIL * 2) + this.LLILLL);
        PointF pointF = this.LLJILJIL;
        pointF.x = 0.0f;
        pointF.y = 0.0f;
        int measuredWidth2 = getMeasuredWidth();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginStart = marginLayoutParams2.getMarginStart();
        } else {
            marginStart = 0;
        }
        int i3 = measuredWidth2 + marginStart;
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
            marginEnd = marginLayoutParams.getMarginEnd();
        } else {
            marginEnd = 0;
        }
        int i4 = i3 + marginEnd;
        int i5 = this.LLJIJIL.left;
        View view6 = this.LLIZLLLIL;
        if (view6 != null) {
            width = view6.getWidth();
        }
        int i6 = i5 - ((i4 - width) / 2);
        int i7 = i6 + i4;
        Rect rect2 = this.LLJI;
        int i8 = rect2.left;
        if (i6 <= i8) {
            i7 = i8 + i4;
            i6 = i8;
        } else {
            int i9 = rect2.right;
            if (i7 >= i9) {
                i6 = i9 - i4;
                i7 = i9;
            }
        }
        PointF pointF2 = this.LLJILJIL;
        Rect rect3 = this.LLJIJIL;
        int i10 = this.LL;
        float f = this.LLILLJJLI / 2.0f;
        pointF2.x = C419990GdR.LIZ((rect3.left + rect3.right) / 2.0f, (i6 + i10) + f, (i7 - i10) - f) - ((i6 + i7) / 2.0f);
        float measuredWidth3 = getMeasuredWidth();
        float measuredHeight3 = getMeasuredHeight();
        this.LLJILLL.reset();
        this.LLJILLL.moveTo(this.LL, 0.0f);
        float f2 = this.LL * 2.0f;
        this.LLJILLL.arcTo(0.0f, 0.0f, f2, f2, 270.0f, -180.0f, false);
        float f3 = this.LLILLJJLI;
        PointF pointF3 = this.LLJILJIL;
        float f4 = pointF3.x;
        float f5 = ((measuredWidth3 - f3) / 2.0f) + f4;
        float f6 = pointF3.y;
        float f7 = (measuredHeight3 - this.LLILLL) + f6;
        float f8 = (measuredWidth3 / 2.0f) + f4;
        float f9 = f6 + measuredHeight3;
        float f10 = ((f3 + measuredWidth3) / 2.0f) + f4;
        this.LLJILLL.lineTo(f5, f7);
        this.LLJILLL.cubicTo(f5 + this.LLILZLL, f7, f8 - this.LLIZ, f9, f8, f9);
        this.LLJILLL.cubicTo(f8 + this.LLIZ, f9, f10 - this.LLILZLL, f7, f10, f7);
        this.LLJILLL.lineTo(measuredWidth3 - this.LL, measuredHeight3 - this.LLILLL);
        this.LLJILLL.arcTo(measuredWidth3 - (this.LL * 2), 0.0f, measuredWidth3, measuredHeight3 - this.LLILLL, 90.0f, -180.0f, false);
        this.LLJILLL.close();
        Object parent = getParent();
        if ((parent instanceof View) && (view = (View) parent) != null) {
            view.setPivotX(f8 + ((C497740JfY.LJIIIZ(R.dimen.b01) + C497740JfY.LJIIIZ(R.dimen.b03)) / 2));
            view.setPivotY(f9 + ((C497740JfY.LJIIIZ(R.dimen.b04) + C497740JfY.LJIIIZ(R.dimen.azy)) / 2));
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth;
        int measuredHeight;
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        int i6 = (i3 - i) - (this.LLILZ * 2);
        int i7 = (i4 - i2) - this.LLILLL;
        if (i6 > 0 && i7 > 0) {
            View view = this.LLJ;
            int i8 = 0;
            if (view != null) {
                measuredWidth = view.getMeasuredWidth();
            } else {
                measuredWidth = 0;
            }
            View view2 = this.LLJ;
            if (view2 != null) {
                measuredHeight = view2.getMeasuredHeight();
            } else {
                measuredHeight = 0;
            }
            if (i6 > measuredWidth) {
                i5 = ((i6 - measuredWidth) / 2) + this.LLILZ;
            } else {
                i5 = this.LLILZ;
            }
            if (i7 > measuredHeight) {
                i8 = (i7 - measuredHeight) / 2;
            }
            View view3 = this.LLJ;
            if (view3 != null) {
                view3.layout(i5, i8, measuredWidth + i5, measuredHeight + i8);
            }
        }
    }
}
