package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* JADX INFO: renamed from: X.0GVH, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GVH extends ReplacementSpan {
    public final Integer LL;

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
    }

    public C0GVH(Integer num) {
        this.LL = num;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Integer num = this.LL;
        if (num != null) {
            return num.intValue();
        }
        if (charSequence == null) {
            return 0;
        }
        return (int) paint.measureText(charSequence, i, i2);
    }
}
