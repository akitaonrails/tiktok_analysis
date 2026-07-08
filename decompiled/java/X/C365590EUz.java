package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: X.0EUz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C365590EUz extends View {
    public final Paint LL;
    public float LLILLJJLI;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = getWidth();
        float height = getHeight();
        float f = getResources().getDisplayMetrics().density * 3.0f;
        float f2 = getResources().getDisplayMetrics().density * 45.0f;
        float f3 = 2;
        canvas.drawRoundRect(new RectF((width - f) / f3, 0.0f, (f + width) / f3, height), f2, f2, this.LL);
        float f4 = width / 2.0f;
        canvas.drawCircle(f4, height * this.LLILLJJLI, f4 / f3, this.LL);
    }

    public final void setProgress(float f) {
        this.LLILLJJLI = C13LZ.LIZLLL(f, 0.0f, 1.0f);
        invalidate();
    }

    public C365590EUz(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(-1);
        this.LL = paint;
    }
}
