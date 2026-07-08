package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;

/* JADX INFO: renamed from: X.0HdA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C445300HdA implements LeadingMarginSpan {
    public static final /* synthetic */ int LLIZ = 0;
    public final String LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final Paint LLILZIL = AbstractC445100Hcq.LIZJ;
    public int LLILZLL;

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return Math.max(this.LLILZLL, this.LLILLJJLI) + this.LLILLL;
    }

    public C445300HdA(String str, int i, int i2, int i3) {
        this.LL = str;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = i3;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        if (z && AbstractC445160Hcw.LIZ(charSequence, this, i6)) {
            this.LLILZIL.set(paint);
            this.LLILZIL.setColor(this.LLILZ);
            canvas.drawText(this.LL, i, i4, this.LLILZIL);
        }
    }
}
