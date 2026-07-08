package X;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextPaint;
import android.text.style.LineHeightSpan;

/* JADX INFO: renamed from: X.0H0z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C434230H0z implements LineHeightSpan.WithDensity {
    public final int LL;
    public final Rect LLILLJJLI = new Rect();
    public boolean LLILLL;

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
    }

    public C434230H0z(int i) {
        this.LL = i;
    }

    @Override // android.text.style.LineHeightSpan.WithDensity
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt, TextPaint textPaint) {
        if (Build.VERSION.SDK_INT >= 29) {
            textPaint.getTextBounds(charSequence, i, i2, this.LLILLJJLI);
        } else {
            textPaint.getTextBounds(charSequence.toString(), i, i2, this.LLILLJJLI);
        }
        Rect rect = this.LLILLJJLI;
        int iMax = Math.max(-(rect.top - fontMetricsInt.ascent), rect.bottom - fontMetricsInt.descent);
        int i5 = fontMetricsInt.descent;
        int i6 = fontMetricsInt.ascent;
        int i7 = i5 - i6;
        int i8 = (iMax * 2) + i7;
        int i9 = this.LL;
        if (i8 < i9) {
            double d = (i9 - i7) / 2.0f;
            fontMetricsInt.top = i6 - ((int) Math.ceil(d));
            int iFloor = fontMetricsInt.descent + ((int) Math.floor(d));
            fontMetricsInt.bottom = iFloor;
            fontMetricsInt.ascent = fontMetricsInt.top;
            fontMetricsInt.descent = iFloor;
            return;
        }
        if (i8 < i9 * 1.5f) {
            fontMetricsInt.top = Math.min(this.LLILLJJLI.top, i6);
            int iMax2 = Math.max(this.LLILLJJLI.bottom, fontMetricsInt.descent);
            fontMetricsInt.bottom = iMax2;
            fontMetricsInt.ascent = fontMetricsInt.top;
            fontMetricsInt.descent = iMax2;
            return;
        }
        double d2 = ((i9 * 1.5f) - i7) / 2.0f;
        fontMetricsInt.top = i6 - ((int) Math.ceil(d2));
        int iFloor2 = fontMetricsInt.descent + ((int) Math.floor(d2));
        fontMetricsInt.bottom = iFloor2;
        fontMetricsInt.ascent = fontMetricsInt.top;
        fontMetricsInt.descent = iFloor2;
    }
}
