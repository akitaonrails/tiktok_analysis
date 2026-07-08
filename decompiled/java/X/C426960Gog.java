package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import android.text.style.LineHeightSpan;

/* JADX INFO: renamed from: X.0Gog, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C426960Gog implements LeadingMarginSpan, LineHeightSpan {
    public final Bitmap LL;
    public final int LLILLJJLI;

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return this.LL.getWidth() + this.LLILLJJLI;
    }

    public C426960Gog(Bitmap bitmap, int i) {
        this.LL = bitmap;
        this.LLILLJJLI = i;
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        if (i2 == ((Spanned) charSequence).getSpanEnd(this)) {
            int height = this.LL.getHeight();
            int i5 = fontMetricsInt.descent;
            int i6 = height - (((i4 + i5) - fontMetricsInt.ascent) - i3);
            if (i6 > 0) {
                fontMetricsInt.descent = i5 + i6;
            }
            int i7 = fontMetricsInt.bottom;
            int i8 = height - (((i4 + i7) - fontMetricsInt.top) - i3);
            if (i8 > 0) {
                fontMetricsInt.bottom = i7 + i8;
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        if (!z) {
            return;
        }
        int lineTop = layout.getLineTop(layout.getLineForOffset(((Spanned) charSequence).getSpanStart(this)));
        if (i2 < 0) {
            i -= this.LL.getWidth();
        }
        canvas.drawBitmap(this.LL, i, ((i3 + (i5 - lineTop)) / 2.0f) - (this.LL.getHeight() / 2.0f), paint);
    }
}
