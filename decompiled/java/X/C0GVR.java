package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* JADX INFO: renamed from: X.0GVR, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GVR extends ReplacementSpan {
    public final int LL;
    public final int LLILLJJLI;

    public C0GVR(int i, int i2) {
        this.LL = i;
        this.LLILLJJLI = i2;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            int i3 = fontMetricsInt.ascent;
            int i4 = this.LLILLJJLI;
            fontMetricsInt.ascent = i3 - i4;
            fontMetricsInt.top -= i4;
            fontMetricsInt.descent += i4;
            fontMetricsInt.bottom += i4;
        }
        return this.LL;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        canvas.drawText(charSequence, i, i2, f, i4, paint);
    }
}
