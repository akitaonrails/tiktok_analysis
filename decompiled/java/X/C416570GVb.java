package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;

/* JADX INFO: renamed from: X.0GVb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C416570GVb extends ImageSpan {
    public C416570GVb(Drawable drawable) {
        super(drawable, 1);
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Rect bounds = getDrawable().getBounds();
        if (fontMetricsInt != null) {
            int i3 = fontMetricsInt.descent;
            int i4 = fontMetricsInt.ascent;
            int i5 = i4 + ((i3 - i4) / 2);
            int iHeight = bounds.height() / 2;
            int i6 = i5 - iHeight;
            fontMetricsInt.ascent = i6;
            int i7 = i5 + iHeight;
            fontMetricsInt.descent = i7;
            fontMetricsInt.top = i6;
            fontMetricsInt.bottom = i7;
        }
        return bounds.right;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        canvas.save();
        canvas.translate(f, ((i3 + i5) - getDrawable().getBounds().height()) / 2.0f);
        getDrawable().draw(canvas);
        canvas.restore();
    }
}
