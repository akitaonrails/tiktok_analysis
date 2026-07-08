package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GRu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C415720GRu extends View {
    public Paint LL;
    public Paint LLILLJJLI;
    public final RectF LLILLL;
    public final float LLILZ;
    public final int LLILZIL;
    public int LLILZLL;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float fMin = (float) (Math.min(width, height) - ((double) (this.LLILZ / 2)));
        this.LLILLL.set(width - fMin, height - fMin, width + fMin, height + fMin);
        Paint paint = this.LL;
        if (paint != null) {
            canvas.drawArc(this.LLILLL, 135.0f, 270.0f, false, paint);
        }
        float f = (this.LLILZLL / this.LLILZIL) * 270;
        Paint paint2 = this.LLILLJJLI;
        if (paint2 != null) {
            canvas.drawArc(this.LLILLL, 135.0f, f, false, paint2);
        }
    }

    public final void setProgress(int i) {
        this.LLILZLL = (int) Math.min(i, this.LLILZIL);
        invalidate();
    }

    public C415720GRu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILLL = new RectF();
        int iLIZIZ = C20736316Cj.LIZIZ(R.attr.exq, context);
        int iLIZIZ2 = C20736316Cj.LIZIZ(R.attr.exp, context);
        float fLIZIZ = C418440Gaw.LIZIZ(Double.valueOf(3.5d));
        this.LLILZ = fLIZIZ;
        this.LLILZIL = 100;
        this.LLILZLL = 30;
        Paint paint = new Paint(1);
        this.LL = paint;
        paint.setStyle(Paint.Style.STROKE);
        Paint paint2 = this.LL;
        if (paint2 != null) {
            paint2.setStrokeWidth(fLIZIZ);
        }
        Paint paint3 = this.LL;
        if (paint3 != null) {
            paint3.setColor(iLIZIZ);
        }
        Paint paint4 = this.LL;
        if (paint4 != null) {
            paint4.setStrokeCap(Paint.Cap.ROUND);
        }
        Paint paint5 = new Paint(1);
        this.LLILLJJLI = paint5;
        paint5.setStyle(Paint.Style.STROKE);
        Paint paint6 = this.LLILLJJLI;
        if (paint6 != null) {
            paint6.setStrokeWidth(fLIZIZ);
        }
        Paint paint7 = this.LLILLJJLI;
        if (paint7 != null) {
            paint7.setColor(iLIZIZ2);
        }
        Paint paint8 = this.LLILLJJLI;
        if (paint8 != null) {
            paint8.setStrokeCap(Paint.Cap.ROUND);
        }
    }
}
