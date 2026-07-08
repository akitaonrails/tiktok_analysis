package X;

import android.graphics.Paint;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.LineHeightSpan;
import android.text.style.ReplacementSpan;

/* JADX INFO: renamed from: X.0H13, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public class C0H13 implements LineHeightSpan.WithDensity {
    public final float LL;
    public final float LLILLJJLI;

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
    }

    public static boolean LIZ(CharSequence charSequence) {
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            if (!Character.isWhitespace(cCharAt) && !Character.isSpaceChar(cCharAt)) {
                return false;
            }
        }
        return true;
    }

    public C0H13(float f, float f2) {
        this.LL = f;
        this.LLILLJJLI = f2;
    }

    @Override // android.text.style.LineHeightSpan.WithDensity
    public void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt, TextPaint textPaint) {
        float f;
        ReplacementSpan[] replacementSpanArr;
        if (textPaint == null) {
            return;
        }
        Paint.FontMetricsInt fontMetricsInt2 = textPaint.getFontMetricsInt();
        if (fontMetricsInt2.descent - fontMetricsInt2.ascent <= 0) {
            return;
        }
        if ((charSequence instanceof Spanned) && (replacementSpanArr = (ReplacementSpan[]) ((Spanned) charSequence).getSpans(i, i2, ReplacementSpan.class)) != null && replacementSpanArr.length > 0) {
            return;
        }
        if (LIZ(charSequence.subSequence(i, i2))) {
            f = this.LL;
        } else {
            f = this.LLILLJJLI;
        }
        fontMetricsInt.ascent = Math.round(fontMetricsInt2.ascent * f);
        fontMetricsInt.descent = Math.round(fontMetricsInt2.descent * f);
        fontMetricsInt.top = Math.round(fontMetricsInt2.top * f);
        fontMetricsInt.bottom = Math.round(fontMetricsInt2.bottom * f);
    }
}
