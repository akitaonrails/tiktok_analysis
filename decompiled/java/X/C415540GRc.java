package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0GRc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C415540GRc extends FrameLayout {
    public final boolean LL;
    public Paint LLILLJJLI;
    public boolean LLILLL;
    public float[] LLILZ;
    public final RectF LLILZIL;
    public final Path LLILZLL;

    public final void LIZ(Canvas canvas) {
        this.LLILZIL.set(0.0f, 0.0f, getWidth(), getHeight());
        this.LLILZLL.reset();
        Path path = this.LLILZLL;
        RectF rectF = this.LLILZIL;
        float[] fArr = this.LLILZ;
        if (fArr == null) {
            fArr = null;
        }
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.clipPath(this.LLILZLL);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        LIZ(canvas);
        super.dispatchDraw(canvas);
        if (this.LLILLL && this.LL && (paint = this.LLILLJJLI) != null) {
            this.LLILZIL.set(0.0f, 0.0f, getWidth(), getHeight());
            this.LLILZLL.reset();
            Path path = this.LLILZLL;
            RectF rectF = this.LLILZIL;
            float[] fArr = this.LLILZ;
            if (fArr == null) {
                fArr = null;
            }
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas.drawPath(this.LLILZLL, paint);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        LIZ(canvas);
        super.draw(canvas);
    }

    public final void setRadius(float f) {
        this.LLILZ = new float[]{f, f, f, f, f, f, f, f};
        invalidate();
    }

    public C415540GRc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = true;
        this.LLILZIL = new RectF();
        this.LLILZLL = new Path();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(0);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(0);
        this.LLILLJJLI = paint;
        this.LLILLL = false;
        invalidate();
    }
}
