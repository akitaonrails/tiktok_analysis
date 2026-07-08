package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: renamed from: X.0Hch, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C445010Hch extends MetricAffectingSpan implements LeadingMarginSpan {
    public final C448860Hiu LL;
    public final float LLILLJJLI;
    public final int LLILLL;
    public final Integer LLILZ;
    public final int LLILZIL;
    public final Integer LLILZLL;
    public final Float LLIZ;
    public final Paint LLIZLLLIL;
    public final Paint LLJ;
    public final Paint LLJI;

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return this.LL.LJIILJJIL;
    }

    public C445010Hch(C448860Hiu c448860Hiu, float f, int i, Integer num, int i2, Integer num2, Float f2) {
        this.LL = c448860Hiu;
        this.LLILLJJLI = f;
        this.LLILLL = i;
        this.LLILZ = num;
        this.LLILZIL = i2;
        this.LLILZLL = num2;
        this.LLIZ = f2;
        new Rect();
        this.LLIZLLLIL = new Paint(1);
        this.LLJ = new Paint(1);
        this.LLJI = new Paint(1);
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int i8;
        int i9 = i;
        this.LLIZLLLIL.setStyle(Paint.Style.FILL);
        int width = layout.getWidth();
        if (i2 > 0) {
            i8 = i9;
            i9 = width;
        } else {
            i8 = i9 - width;
        }
        float fLIZIZ = C445120Hcs.LIZIZ(Double.valueOf(0.5d));
        Integer num = this.LLILZ;
        if (num != null && i6 == num.intValue()) {
            Path path = new Path();
            float f = i9 - i8;
            float f2 = this.LLILLJJLI;
            float f3 = i8;
            path.moveTo(f3 + f2, i3);
            float f4 = f - (2 * f2);
            path.rLineTo(f4, 0.0f);
            path.rQuadTo(f2, 0.0f, f2, f2);
            float f5 = (i5 - i3) - f2;
            path.rLineTo(0.0f, f5);
            path.rLineTo(-f, 0.0f);
            float f6 = -f5;
            path.rLineTo(0.0f, f6);
            float f7 = -f2;
            path.rQuadTo(0.0f, f7, f2, f7);
            path.close();
            this.LLIZLLLIL.setColor(this.LLILLL);
            canvas.drawPath(path, this.LLIZLLLIL);
            Path path2 = new Path();
            this.LLJ.setColor(this.LLILZIL);
            this.LLJ.setStyle(Paint.Style.STROKE);
            this.LLJ.setStrokeWidth(fLIZIZ);
            float f8 = i5;
            path2.moveTo(f3, f8);
            path2.rLineTo(0.0f, f6);
            path2.rQuadTo(0.0f, f7, f2, f7);
            path2.rLineTo(f4, 0.0f);
            path2.rQuadTo(f2, 0.0f, f2, f2);
            path2.rLineTo(0.0f, f5);
            canvas.drawPath(path2, this.LLJ);
            Integer num2 = this.LLILZLL;
            if (num2 != null) {
                num2.intValue();
                Path path3 = new Path();
                this.LLJI.setColor(this.LLILZLL.intValue());
                this.LLJI.setStyle(Paint.Style.STROKE);
                Paint paint2 = this.LLJI;
                Float f9 = this.LLIZ;
                if (f9 != null) {
                    fLIZIZ = f9.floatValue();
                }
                paint2.setStrokeWidth(fLIZIZ);
                path3.moveTo(f3, f8);
                path3.rLineTo(f, 0.0f);
                canvas.drawPath(path3, this.LLJI);
            }
        }
    }
}
