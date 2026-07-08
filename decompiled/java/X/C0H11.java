package X;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextPaint;
import android.text.style.LineHeightSpan;

/* JADX INFO: renamed from: X.0H11, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H11 implements LineHeightSpan.WithDensity {
    public final int LL;
    public final Integer LLILLJJLI;
    public final Rect LLILLL = new Rect();
    public boolean LLILZ;

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
    }

    public C0H11(int i, Integer num) {
        this.LL = i;
        this.LLILLJJLI = num;
    }

    @Override // android.text.style.LineHeightSpan.WithDensity
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt, TextPaint textPaint) {
        Integer num;
        int i5 = i2 - 1;
        Character chLJLLJ = C13LN.LJLLJ(i5, charSequence);
        if (chLJLLJ != null && chLJLLJ.charValue() == '\n' && (num = this.LLILLJJLI) != null) {
            int i6 = i;
            while (true) {
                if (i6 < i5) {
                    char cCharAt = charSequence.charAt(i6);
                    if (!Character.isWhitespace(cCharAt) && cCharAt != '\n' && Character.getType(cCharAt) != 16 && cCharAt != 173 && (65024 > cCharAt || cCharAt >= 65040)) {
                        break;
                    } else {
                        i6++;
                    }
                } else {
                    int i7 = fontMetricsInt.descent - fontMetricsInt.ascent;
                    if (i7 > 0) {
                        int iLIZIZ = C814420VxA.LIZIZ(fontMetricsInt.descent * ((num.intValue() * 1.0f) / i7));
                        fontMetricsInt.descent = iLIZIZ;
                        int iIntValue = iLIZIZ - num.intValue();
                        fontMetricsInt.ascent = iIntValue;
                        fontMetricsInt.top = iIntValue;
                        fontMetricsInt.bottom = fontMetricsInt.descent;
                        return;
                    }
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            textPaint.getTextBounds(charSequence, i, i2, this.LLILLL);
        } else {
            textPaint.getTextBounds(charSequence.toString(), i, i2, this.LLILLL);
        }
        Rect rect = this.LLILLL;
        int iMax = Math.max(-(rect.top - fontMetricsInt.ascent), rect.bottom - fontMetricsInt.descent);
        int i8 = fontMetricsInt.descent;
        int i9 = fontMetricsInt.ascent;
        int i10 = i8 - i9;
        int i11 = (iMax * 2) + i10;
        int i12 = this.LL;
        if (i11 < i12) {
            double d = (i12 - i10) / 2.0f;
            fontMetricsInt.top = i9 - ((int) Math.ceil(d));
            int iFloor = fontMetricsInt.descent + ((int) Math.floor(d));
            fontMetricsInt.bottom = iFloor;
            fontMetricsInt.ascent = fontMetricsInt.top;
            fontMetricsInt.descent = iFloor;
            return;
        }
        if (i11 < i12 * 1.5f) {
            fontMetricsInt.top = Math.min(this.LLILLL.top, i9);
            int iMax2 = Math.max(this.LLILLL.bottom, fontMetricsInt.descent);
            fontMetricsInt.bottom = iMax2;
            fontMetricsInt.ascent = fontMetricsInt.top;
            fontMetricsInt.descent = iMax2;
            return;
        }
        double d2 = ((i12 * 1.5f) - i10) / 2.0f;
        fontMetricsInt.top = i9 - ((int) Math.ceil(d2));
        int iFloor2 = fontMetricsInt.descent + ((int) Math.floor(d2));
        fontMetricsInt.bottom = iFloor2;
        fontMetricsInt.ascent = fontMetricsInt.top;
        fontMetricsInt.descent = iFloor2;
    }
}
