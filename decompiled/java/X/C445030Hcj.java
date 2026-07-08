package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: renamed from: X.0Hcj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C445030Hcj extends MetricAffectingSpan implements LeadingMarginSpan {
    public final C448860Hiu LL;
    public final C445110Hcr LLILLJJLI;
    public final Rect LLILLL = new Rect();
    public final Paint LLILZ = new Paint(1);

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

    public C445030Hcj(C448860Hiu c448860Hiu, C445110Hcr c445110Hcr) {
        this.LL = c448860Hiu;
        this.LLILLJJLI = c445110Hcr;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int i8;
        this.LLILZ.setStyle(Paint.Style.FILL);
        Paint paint2 = this.LLILZ;
        C448860Hiu c448860Hiu = this.LL;
        int iLIZ = c448860Hiu.LJIILIIL;
        if (iLIZ == 0 && (iLIZ = c448860Hiu.LJIIL) == 0) {
            iLIZ = AbstractC445040Hck.LIZ(paint.getColor(), 25);
        }
        paint2.setColor(iLIZ);
        int width = layout.getWidth();
        if (i2 > 0) {
            i8 = i;
            i = width;
        } else {
            i8 = i - width;
        }
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
            this.LLILZ.setColor(this.LLILLJJLI.LIZJ);
            canvas.drawPath(path, this.LLILZ);
            return;
        }
        Integer num2 = this.LLILLJJLI.LIZIZ;
        if (num2 != null && i7 == num2.intValue()) {
            Path path2 = new Path();
            float f5 = i - i8;
            float f6 = this.LLILLJJLI.LIZLLL;
            path2.moveTo(i8, i3);
            path2.rLineTo(f5, 0.0f);
            float f7 = (i5 - i3) - f6;
            path2.rLineTo(0.0f, f7);
            float f8 = -f6;
            path2.rQuadTo(0.0f, f6, f8, f6);
            path2.rLineTo(-(f5 - (2 * f6)), 0.0f);
            path2.rQuadTo(f8, 0.0f, f8, f8);
            path2.rLineTo(0.0f, -f7);
            path2.close();
            canvas.drawPath(path2, this.LLILZ);
            return;
        }
        this.LLILLL.set(i8, i3, i, i5);
        canvas.drawRect(this.LLILLL, this.LLILZ);
    }
}
