package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.ss.android.ugc.aweme.creative.model.edit.imagecollage.CellIntParam;
import com.ss.android.ugc.aweme.creative.model.edit.imagecollage.CollageIntParam;

/* JADX INFO: renamed from: X.0GSR, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GSR extends View {
    public CollageIntParam LL;
    public final Paint LLILLJJLI;
    public final RectF LLILLL;
    public final float LLILZ;

    private final void setColor(int i) {
        this.LLILLJJLI.setColor(i);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        CollageIntParam collageIntParam = this.LL;
        if (collageIntParam == null) {
            return;
        }
        float width = getWidth();
        float height = getHeight();
        float strokeWidth = this.LLILLJJLI.getStrokeWidth() / 2.0f;
        float strokeWidth2 = width - this.LLILLJJLI.getStrokeWidth();
        float strokeWidth3 = height - this.LLILLJJLI.getStrokeWidth();
        this.LLILLL.set(strokeWidth, strokeWidth, strokeWidth + strokeWidth2, strokeWidth + strokeWidth3);
        RectF rectF = this.LLILLL;
        float f = this.LLILZ;
        canvas.drawRoundRect(rectF, f, f, this.LLILLJJLI);
        int cols = collageIntParam.getCols();
        int i = 1;
        if (cols < 1) {
            cols = 1;
        }
        int rows = collageIntParam.getRows();
        if (rows >= 1) {
            i = rows;
        }
        for (CellIntParam cellIntParam : collageIntParam.getCells()) {
            int x = cellIntParam.getX();
            int y = cellIntParam.getY();
            int x2 = cellIntParam.getX() + cellIntParam.getWidth();
            int height2 = cellIntParam.getHeight() + cellIntParam.getY();
            if (x2 < cols) {
                float f2 = strokeWidth + ((x2 / cols) * strokeWidth2);
                float f3 = i;
                float f4 = strokeWidth + ((y / f3) * strokeWidth3);
                float f5 = strokeWidth + ((height2 / f3) * strokeWidth3);
                if (f5 > f4) {
                    canvas.drawLine(f2, f4, f2, f5, this.LLILLJJLI);
                }
            }
            if (height2 < i) {
                float f6 = strokeWidth + ((height2 / i) * strokeWidth3);
                float f7 = cols;
                float f8 = strokeWidth + ((x / f7) * strokeWidth2);
                float f9 = strokeWidth + ((x2 / f7) * strokeWidth2);
                if (f9 > f8) {
                    canvas.drawLine(f8, f6, f9, f6, this.LLILLJJLI);
                }
            }
        }
    }

    public final void setColorRes(int i) {
        Integer numLIZJ = C1308910kAL.LIZJ(i, getContext());
        if (numLIZJ != null) {
            setColor(numLIZJ.intValue());
        }
    }

    public final void setPattern(CollageIntParam collageIntParam) {
        this.LL = collageIntParam;
        invalidate();
    }

    public C0GSR(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Paint paint = new Paint(1);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(C418440Gaw.LIZIZ(2));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setDither(true);
        this.LLILLJJLI = paint;
        this.LLILLL = new RectF();
        this.LLILZ = C418440Gaw.LIZIZ(6);
    }
}
