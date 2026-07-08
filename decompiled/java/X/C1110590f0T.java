package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* JADX INFO: renamed from: X.0f0T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1110590f0T extends ReplacementSpan {
    public final AbstractC521080Kc6 LL;
    public final Paint LLILLJJLI = new Paint(1);

    public C1110590f0T(AbstractC521080Kc6 abstractC521080Kc6) {
        this.LL = abstractC521080Kc6;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return this.LL.LIZJ(paint, fontMetricsInt);
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        canvas.save();
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        canvas.translate(f, ((((fontMetricsInt.descent + i4) + i4) + fontMetricsInt.ascent) / 2) - (this.LL.LIZJ / 2));
        this.LL.LIZ(canvas, this.LLILLJJLI);
        canvas.restore();
    }
}
