package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: X.0Hco, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C445080Hco extends MetricAffectingSpan implements LeadingMarginSpan {
    public final C448860Hiu LL;
    public final Rect LLILLJJLI = AbstractC445100Hcq.LIZ;
    public final Paint LLILLL = AbstractC445100Hcq.LIZJ;
    public final int LLILZ;

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return 0;
    }

    public final void LIZ(TextPaint textPaint) {
        C448860Hiu c448860Hiu = this.LL;
        int i = this.LLILZ;
        c448860Hiu.getClass();
        textPaint.setFakeBoldText(true);
        float[] fArr = C448860Hiu.LJIJJLI;
        if (6 >= i) {
            textPaint.setTextSize(textPaint.getTextSize() * fArr[i - 1]);
            return;
        }
        throw new IllegalStateException(C786410Ut5.k4(Locale.US, "Supplied heading level: %d is invalid, where configured heading sizes are: `%s`", new Object[]{Integer.valueOf(i), Arrays.toString(fArr)}));
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        LIZ(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        LIZ(textPaint);
    }

    public C445080Hco(C448860Hiu c448860Hiu, int i) {
        this.LL = c448860Hiu;
        this.LLILZ = i;
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int width;
        int i8 = this.LLILZ;
        if ((i8 == 1 || i8 == 2) && (charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanEnd(this) == i7) {
            this.LLILLL.set(paint);
            C448860Hiu c448860Hiu = this.LL;
            Paint paint2 = this.LLILLL;
            c448860Hiu.getClass();
            paint2.setColor(AbstractC445040Hck.LIZ(paint2.getColor(), 75));
            paint2.setStyle(Paint.Style.FILL);
            int i9 = c448860Hiu.LJIILLIIL;
            if (i9 >= 0) {
                paint2.setStrokeWidth(i9);
            }
            float strokeWidth = this.LLILLL.getStrokeWidth();
            if (strokeWidth > 0.0f) {
                int i10 = (int) ((i5 - strokeWidth) + 0.5f);
                if (i2 > 0) {
                    width = canvas.getWidth();
                } else {
                    width = i;
                    i -= canvas.getWidth();
                }
                this.LLILLJJLI.set(i, i10, width, i5);
                canvas.drawRect(this.LLILLJJLI, this.LLILLL);
            }
        }
    }
}
