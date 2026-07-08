package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;

/* JADX INFO: renamed from: X.0HdC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C445320HdC implements LeadingMarginSpan {
    public final C448860Hiu LL;
    public final String LLILLJJLI;
    public final Paint LLILLL = AbstractC445100Hcq.LIZJ;
    public int LLILZ;

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z) {
        return Math.max(this.LLILZ, this.LL.LIZJ);
    }

    public C445320HdC(C448860Hiu c448860Hiu, String str) {
        this.LL = c448860Hiu;
        this.LLILLJJLI = str;
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int i8;
        if (z && AbstractC445160Hcw.LIZ(charSequence, this, i6)) {
            if (this.LL.LJIIJ) {
                i = (int) (layout.getPrimaryHorizontal(i6) - (getLeadingMargin(z) * i2));
            }
            this.LLILLL.set(paint);
            this.LL.LIZJ(this.LLILLL);
            int iMeasureText = (int) (this.LLILLL.measureText(this.LLILLJJLI) + 0.5f);
            int i9 = this.LL.LIZJ;
            if (iMeasureText > i9) {
                this.LLILZ = iMeasureText;
                i9 = iMeasureText;
            } else {
                this.LLILZ = 0;
            }
            if (i2 > 0) {
                i8 = (i + (i9 * i2)) - iMeasureText;
            } else {
                i8 = i + (i2 * i9) + (i9 - iMeasureText);
            }
            canvas.drawText(this.LLILLJJLI, i8, i4, this.LLILLL);
        }
    }
}
