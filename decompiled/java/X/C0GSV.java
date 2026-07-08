package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/* JADX INFO: renamed from: X.0GSV, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GSV extends View {
    public final Paint LL;
    public float LLILLJJLI;
    public final RectF LLILLL;

    public C0GSV(Context context) {
        super(context);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(C12ES.LIZJ(0.5f, context));
        this.LL = paint;
        this.LLILLL = new RectF();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getWidth() > 0 && getHeight() > 0) {
            float strokeWidth = this.LL.getStrokeWidth() / 2;
            this.LLILLL.set(strokeWidth, strokeWidth, getWidth() - strokeWidth, getHeight() - strokeWidth);
            RectF rectF = this.LLILLL;
            float f = this.LLILLJJLI;
            canvas.drawRoundRect(rectF, f, f, this.LL);
        }
    }
}
