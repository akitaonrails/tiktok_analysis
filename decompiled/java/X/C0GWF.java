package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.LineBackgroundSpan;

/* JADX INFO: renamed from: X.0GWF, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GWF implements LineBackgroundSpan {
    public final int LL;

    public C0GWF(int i) {
        this.LL = i;
    }

    @Override // android.text.style.LineBackgroundSpan
    public final void drawBackground(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, int i8) {
        int color = paint.getColor();
        paint.setColor(this.LL);
        canvas.drawRect(i, i3, i2, i5, paint);
        paint.setColor(color);
    }
}
