package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/* JADX INFO: renamed from: X.0GRK, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GRK extends View {
    public final Paint LL;
    public boolean LLILLJJLI;

    public C0GRK(Context context) {
        super(context, null, 0);
        Paint paint = new Paint(5);
        paint.setStyle(Paint.Style.STROKE);
        this.LL = paint;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.LLILLJJLI) {
            float height = getHeight() / 2.0f;
            canvas.drawLine(0.0f, height, getWidth(), height, this.LL);
        } else {
            float width = getWidth() / 2.0f;
            canvas.drawLine(width, 0.0f, width, getHeight(), this.LL);
        }
    }
}
