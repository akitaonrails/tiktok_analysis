package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GTI, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GTI extends View {
    public float LL;
    public final float LLILLJJLI;
    public final Paint LLILLL;
    public final RectF LLILZ;
    public final int LLILZIL;

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return (int) (getContext().getResources().getDisplayMetrics().density * 38.0f);
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return (int) (getContext().getResources().getDisplayMetrics().density * 38.0f);
    }

    public final float getCurrentProgress() {
        return this.LL;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawArc(this.LLILZ, -90.0f, this.LL * 360.0f, false, this.LLILLL);
    }

    public C0GTI(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        float f = context.getResources().getDisplayMetrics().density * 3.0f;
        this.LLILLJJLI = f;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(f);
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.LLILLL = paint;
        this.LLILZ = new RectF();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.sy});
        int color = typedArrayObtainStyledAttributes.getColor(0, -277450);
        typedArrayObtainStyledAttributes.recycle();
        this.LLILZIL = color;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iMin = Math.min(View.resolveSize(getSuggestedMinimumWidth() + getPaddingLeft() + getPaddingRight(), i), View.resolveSize(getSuggestedMinimumHeight() + getPaddingTop() + getPaddingBottom(), i2));
        setMeasuredDimension(Math.max(iMin, getSuggestedMinimumWidth() + getPaddingLeft() + getPaddingRight()), Math.max(iMin, getSuggestedMinimumHeight() + getPaddingTop() + getPaddingBottom()));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int i5 = this.LLILZIL;
        this.LLILLL.setShader(new SweepGradient(i / 2.0f, i2 / 2.0f, i5, i5));
        float f = this.LLILLJJLI / 2.0f;
        this.LLILZ.set(getPaddingLeft() + f, getPaddingTop() + f, (i - getPaddingRight()) - f, (i2 - getPaddingBottom()) - f);
    }
}
