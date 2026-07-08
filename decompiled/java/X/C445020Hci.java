package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.text.style.LineHeightSpan;
import android.text.style.MetricAffectingSpan;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Hci, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C445020Hci extends MetricAffectingSpan implements LeadingMarginSpan, LineHeightSpan.WithDensity {
    public final C448860Hiu LL;
    public final C445110Hcr LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public final float LLILZLL;
    public final Rect LLIZ = new Rect();
    public final Paint LLIZLLLIL = new Paint(1);

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return this.LL.LJIILJJIL;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        this.LL.LIZ(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        this.LL.LIZ(textPaint);
    }

    public C445020Hci(C448860Hiu c448860Hiu, C445110Hcr c445110Hcr, int i, int i2, int i3, float f) {
        this.LL = c448860Hiu;
        this.LLILLJJLI = c445110Hcr;
        this.LLILLL = i;
        this.LLILZ = i2;
        this.LLILZIL = i3;
        this.LLILZLL = f;
    }

    @Override // android.text.style.LineHeightSpan.WithDensity
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt, TextPaint textPaint) {
        float fLIZIZ;
        if (textPaint == null || fontMetricsInt == null || charSequence == null) {
            return;
        }
        Paint.FontMetricsInt fontMetricsInt2 = textPaint.getFontMetricsInt();
        int i5 = fontMetricsInt2.descent - fontMetricsInt2.ascent;
        if (i5 <= 0) {
            return;
        }
        Integer num = this.LLILLJJLI.LIZ;
        if (num != null && i == num.intValue()) {
            return;
        }
        if (a0.LJJJIL(charSequence.subSequence(i, i2))) {
            fLIZIZ = C445120Hcs.LIZIZ(8);
        } else {
            fLIZIZ = this.LLILZIL * this.LLILZLL;
        }
        float f = i5;
        float f2 = fLIZIZ / f;
        float f3 = (f * (f2 - 1)) / 2;
        fontMetricsInt.top = Math.round((fontMetricsInt2.top * f2) + f3);
        fontMetricsInt.ascent = Math.round((fontMetricsInt2.ascent * f2) + f3);
        fontMetricsInt.descent = Math.round((fontMetricsInt2.descent * f2) + f3);
        fontMetricsInt.bottom = Math.round((fontMetricsInt2.bottom * f2) + f3);
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int i8;
        int width = layout.getWidth();
        if (i2 > 0) {
            i8 = i;
            i = width;
        } else {
            i8 = i - width;
        }
        this.LLIZLLLIL.setStyle(Paint.Style.FILL);
        Integer num = this.LLILLJJLI.LIZ;
        if (num != null && i6 == num.intValue()) {
            Path path = new Path();
            float f = i - i8;
            float f2 = this.LLILLJJLI.LIZLLL;
            path.moveTo(i8 + f2, i3);
            path.rLineTo(f - (2 * f2), 0.0f);
            path.rQuadTo(f2, 0.0f, f2, f2);
            float f3 = (i5 - i3) - f2;
            path.rLineTo(0.0f, f3);
            path.rLineTo(-f, 0.0f);
            path.rLineTo(0.0f, -f3);
            float f4 = -f2;
            path.rQuadTo(0.0f, f4, f2, f4);
            path.close();
            this.LLIZLLLIL.setColor(this.LLILLJJLI.LIZJ);
            canvas.drawPath(path, this.LLIZLLLIL);
            return;
        }
        Integer num2 = this.LLILLJJLI.LIZIZ;
        if (num2 != null && i7 == num2.intValue()) {
            float f5 = this.LLILLJJLI.LIZLLL;
            Path path2 = new Path();
            float f6 = i5 - f5;
            path2.moveTo(i, f6);
            float f7 = -f5;
            path2.rQuadTo(0.0f, f5, f7, f5);
            path2.rLineTo(-((i - i8) - (2 * f5)), 0.0f);
            path2.rQuadTo(f7, 0.0f, f7, f7);
            this.LLIZLLLIL.setColor(this.LLILLL);
            int i9 = (int) f6;
            this.LLIZ.set(i8, i3, this.LLILZ + i8, i9);
            canvas.drawRect(this.LLIZ, this.LLIZLLLIL);
            this.LLIZ.set(i - this.LLILZ, i3, i, i9);
            canvas.drawRect(this.LLIZ, this.LLIZLLLIL);
            this.LLIZLLLIL.setStyle(Paint.Style.STROKE);
            this.LLIZLLLIL.setStrokeWidth(this.LLILZ);
            canvas.drawPath(path2, this.LLIZLLLIL);
            return;
        }
        this.LLIZLLLIL.setColor(this.LLILLL);
        this.LLIZ.set(i8, i3, this.LLILZ + i8, i5);
        canvas.drawRect(this.LLIZ, this.LLIZLLLIL);
        this.LLIZ.set(i - this.LLILZ, i3, i, i5);
        canvas.drawRect(this.LLIZ, this.LLIZLLLIL);
    }
}
