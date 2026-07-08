package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: X.0EpJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C376390EpJ extends View {
    public final float LL;
    public final Paint LLILLJJLI;
    public final Paint LLILLL;
    public final Path LLILZ;
    public final Path LLILZIL;
    public boolean LLILZLL;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.LLILZIL, this.LLILLL);
        canvas.drawPath(this.LLILZ, this.LLILLJJLI);
    }

    public final void setFillColor(int i) {
        this.LLILLL.setColor(i);
        invalidate();
    }

    public C376390EpJ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = 3.5762f;
        Paint paint = new Paint();
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(3.57692f);
        paint.setAntiAlias(true);
        this.LLILLJJLI = paint;
        Paint paint2 = new Paint();
        paint2.setColor(-16776961);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        this.LLILLL = paint2;
        this.LLILZ = new Path();
        this.LLILZIL = new Path();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (!this.LLILZLL) {
            float f = i / 92.0f;
            float f2 = i2 / 103.0f;
            if (f >= f2) {
                f = f2;
            }
            Matrix matrix = new Matrix();
            this.LLILLJJLI.setStrokeWidth(this.LL * f);
            matrix.setScale(f, f);
            Path path = this.LLILZIL;
            path.moveTo(77.0f, 46.0f);
            path.cubicTo(77.0f, 66.5408f, 52.4525f, 84.5135f, 47.0453f, 88.2233f);
            path.cubicTo(46.4019f, 88.6647f, 45.5981f, 88.6647f, 44.9547f, 88.2233f);
            path.cubicTo(39.5475f, 84.5135f, 15.0f, 66.5408f, 15.0f, 46.0f);
            path.cubicTo(15.0f, 28.8792f, 28.8792f, 15.0f, 46.0f, 15.0f);
            path.cubicTo(63.1208f, 15.0f, 77.0f, 28.8792f, 77.0f, 46.0f);
            path.close();
            path.transform(matrix);
            Path path2 = this.LLILZ;
            path2.moveTo(75.2115f, 46.0f);
            path2.cubicTo(75.2115f, 55.5903f, 69.4499f, 64.7949f, 62.7246f, 72.2229f);
            path2.cubicTo(56.0452f, 79.6f, 48.6842f, 84.9299f, 46.0335f, 86.7485f);
            path2.cubicTo(45.9995f, 86.7656f, 45.9987f, 86.7654f, 45.9977f, 86.7651f);
            path2.cubicTo(45.9942f, 86.764f, 45.9835f, 86.7602f, 45.9665f, 86.7485f);
            path2.cubicTo(43.3158f, 84.9299f, 35.9548f, 79.6f, 29.2754f, 72.2229f);
            path2.cubicTo(22.5501f, 64.7949f, 16.7885f, 55.5903f, 16.7885f, 46.0f);
            path2.cubicTo(16.7885f, 29.8669f, 29.8669f, 16.7885f, 46.0f, 16.7885f);
            path2.cubicTo(62.1331f, 16.7885f, 75.2115f, 29.8669f, 75.2115f, 46.0f);
            path2.close();
            path2.transform(matrix);
            this.LLILZLL = true;
        }
    }
}
