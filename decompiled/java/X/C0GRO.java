package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: X.0GRO, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GRO extends View {
    public float LL;
    public int LLILLJJLI;
    public final Paint LLILLL;
    public final RectF LLILZ;

    public final int getCircleColor() {
        return this.LLILLJJLI;
    }

    public final float getCircleRadius() {
        return this.LL;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        RectF rectF = this.LLILZ;
        float f = this.LL;
        canvas.drawRoundRect(rectF, f, f, this.LLILLL);
    }

    public final void setCircleColor(int i) {
        this.LLILLJJLI = i;
        this.LLILLL.setColor(i);
        invalidate();
    }

    public final void setCircleRadius(float f) {
        this.LL = f;
        invalidate();
    }

    public C0GRO(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILLJJLI = -1;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(this.LLILLJJLI);
        this.LLILLL = paint;
        this.LLILZ = new RectF();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth() / 2;
        int measuredHeight = getMeasuredHeight() / 2;
        RectF rectF = this.LLILZ;
        float f = measuredWidth;
        float f2 = this.LL;
        float f3 = measuredHeight;
        rectF.set(f - f2, f3 - f2, f + f2, f3 + f2);
    }
}
