package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;

/* JADX INFO: renamed from: X.0Hd5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C445250Hd5 implements LeadingMarginSpan {
    public final C448860Hiu LL;
    public final Rect LLILLJJLI = AbstractC445100Hcq.LIZ;
    public final Paint LLILLL = AbstractC445100Hcq.LIZJ;

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return 0;
    }

    public C445250Hd5(C448860Hiu c448860Hiu) {
        this.LL = c448860Hiu;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int width;
        int i8 = i3 + ((i5 - i3) / 2);
        this.LLILLL.set(paint);
        this.LL.LIZLLL(this.LLILLL);
        int strokeWidth = (int) ((((int) (this.LLILLL.getStrokeWidth() + 0.5f)) / 2.0f) + 0.5f);
        if (i2 > 0) {
            width = canvas.getWidth();
        } else {
            width = i;
            i -= canvas.getWidth();
        }
        this.LLILLJJLI.set(i, i8 - strokeWidth, width, i8 + strokeWidth);
        canvas.drawRect(this.LLILLJJLI, this.LLILLL);
    }
}
