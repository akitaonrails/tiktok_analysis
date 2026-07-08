package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;

/* JADX INFO: renamed from: X.0Hd4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C445240Hd4 implements LeadingMarginSpan {
    public final C448860Hiu LL;
    public final Rect LLILLJJLI;
    public final Paint LLILLL;
    public final int LLILZ;

    public C445240Hd4(C448860Hiu c448860Hiu) {
        this.LLILLJJLI = AbstractC445100Hcq.LIZ;
        this.LLILLL = AbstractC445100Hcq.LIZJ;
        this.LLILZ = 0;
        this.LL = c448860Hiu;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return this.LL.LIZJ;
    }

    public C445240Hd4(C448860Hiu c448860Hiu, int i) {
        this.LLILLJJLI = AbstractC445100Hcq.LIZ;
        this.LLILLL = AbstractC445100Hcq.LIZJ;
        this.LLILZ = 0;
        this.LL = c448860Hiu;
        this.LLILZ = i;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int i8 = this.LL.LIZLLL;
        if (i8 == 0) {
            i8 = (int) ((r0.LIZJ * 0.25f) + 0.5f);
        }
        this.LLILLL.set(paint);
        C448860Hiu c448860Hiu = this.LL;
        Paint paint2 = this.LLILLL;
        int iLIZ = c448860Hiu.LJ;
        if (iLIZ == 0) {
            iLIZ = AbstractC445040Hck.LIZ(paint2.getColor(), 25);
        }
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(iLIZ);
        int i9 = i8 * i2;
        int i10 = i + i9;
        int i11 = i9 + i10;
        int iMin = Math.min(i10, i11);
        int iMax = Math.max(i10, i11);
        Rect rect = this.LLILLJJLI;
        int i12 = this.LLILZ;
        rect.set(iMin + (i12 * i2), i3, iMax + (i12 * i2), i5);
        canvas.drawRect(this.LLILLJJLI, this.LLILLL);
    }
}
