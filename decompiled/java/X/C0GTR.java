package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: X.0GTR, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GTR extends View {
    public float LL;
    public LinearGradient LLILLJJLI;
    public final RectF LLILLL;
    public final Paint LLILZ;

    public C0GTR(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final float getRingWidth() {
        return this.LL;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawArc(this.LLILLL, -90.0f, 360.0f, false, this.LLILZ);
    }

    public final void setRingWidth(float f) {
        this.LL = f;
        this.LLILZ.setStrokeWidth(f);
        LIZ(getWidth(), getHeight());
        invalidate();
    }

    public final void LIZ(int i, int i2) {
        if (i > 0 && i2 > 0) {
            RectF rectF = this.LLILLL;
            float f = this.LL;
            rectF.left = f / 2.0f;
            rectF.top = (f / 2.0f) + 0.0f;
            rectF.right = i - (f / 2.0f);
            rectF.bottom = i2 - (f / 2.0f);
        }
    }

    public C0GTR(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.LL = C418440Gaw.LIZIZ(Double.valueOf(1.0d));
        this.LLILLL = new RectF();
        Paint paint = new Paint();
        paint.setStrokeWidth(this.LL);
        paint.setAntiAlias(true);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        this.LLILZ = paint;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        LIZ(i, i2);
        if (this.LLILLJJLI == null && i > 0 && i2 > 0) {
            LinearGradient linearGradientLIZJ = C1618440sDa.LIZIZ.LJJIJLIJ().LIZJ(getContext(), getWidth(), getHeight());
            this.LLILLJJLI = linearGradientLIZJ;
            this.LLILZ.setShader(linearGradientLIZJ);
        }
    }
}
