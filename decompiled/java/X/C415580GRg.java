package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/* JADX INFO: renamed from: X.0GRg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C415580GRg extends View {
    public final Paint LL;
    public final Paint LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public int LLILZIL;

    public C415580GRg(Context context) {
        super(context);
        Paint paint = new Paint();
        this.LL = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.LLILLJJLI = paint2;
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.STROKE);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width = getWidth() / 2;
        this.LL.setAlpha(this.LLILLL);
        float f = width;
        canvas.drawCircle(f, f, f, this.LL);
        this.LLILLJJLI.setAlpha(this.LLILZ);
        canvas.drawCircle(f, f, width - (this.LLILZIL / 2), this.LLILLJJLI);
    }

    public void setFillAlpha(int i) {
        this.LLILLL = i;
        invalidate();
    }

    public void setSolidColor(int i) {
        this.LL.setColor(i);
        invalidate();
    }

    public void setStrokeAlpha(int i) {
        this.LLILZ = i;
        invalidate();
    }

    public void setStrokeColor(int i) {
        this.LLILLJJLI.setColor(i);
        invalidate();
    }

    public void setStrokeWidth(int i) {
        this.LLILZIL = i;
        this.LLILLJJLI.setStrokeWidth(i);
        invalidate();
    }
}
