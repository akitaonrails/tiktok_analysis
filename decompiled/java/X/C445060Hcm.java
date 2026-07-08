package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: renamed from: X.0Hcm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C445060Hcm extends MetricAffectingSpan implements LeadingMarginSpan {
    public final C448860Hiu LL;
    public final Rect LLILLJJLI = AbstractC445100Hcq.LIZ;
    public final Paint LLILLL = AbstractC445100Hcq.LIZJ;

    public C445060Hcm(C448860Hiu c448860Hiu) {
        this.LL = c448860Hiu;
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

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int width;
        this.LLILLL.setStyle(Paint.Style.FILL);
        Paint paint2 = this.LLILLL;
        C448860Hiu c448860Hiu = this.LL;
        int iLIZ = c448860Hiu.LJIILIIL;
        if (iLIZ == 0 && (iLIZ = c448860Hiu.LJIIL) == 0) {
            iLIZ = AbstractC445040Hck.LIZ(paint.getColor(), 25);
        }
        paint2.setColor(iLIZ);
        if (i2 > 0) {
            width = canvas.getWidth();
        } else {
            width = i;
            i -= canvas.getWidth();
        }
        this.LLILLJJLI.set(i, i3, width, i5);
        canvas.drawRect(this.LLILLJJLI, this.LLILLL);
    }
}
