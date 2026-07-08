package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;

/* JADX INFO: renamed from: X.0HdE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C445340HdE extends C445320HdC {
    public final String LLILZIL;

    public C445340HdE(C448860Hiu c448860Hiu, String str) {
        super(c448860Hiu, str);
        this.LLILZIL = str;
    }

    @Override // X.C445320HdC, android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int i8;
        if (z && AbstractC445160Hcw.LIZ(charSequence, this, i6)) {
            if (this.LL.LJIIJ) {
                i = (int) (layout.getPrimaryHorizontal(i6) - (getLeadingMargin(z) * i2));
            }
            this.LLILLL.set(paint);
            this.LL.LIZJ(this.LLILLL);
            if (((InterfaceC445170Hcx[]) ((Spanned) charSequence).getSpans(i6, (int) Math.min(i6 + 1, i7), InterfaceC445170Hcx.class)).length != 0) {
                this.LLILLL.setAlpha((int) (this.LLILLL.getAlpha() * (r1[0].LIZ() / 255.0f)));
            }
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
