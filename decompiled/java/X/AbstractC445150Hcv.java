package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;

/* JADX INFO: renamed from: X.0Hcv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC445150Hcv implements LeadingMarginSpan {
    public final int LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final boolean LLILZ;
    public final Paint LLILZIL = AbstractC445100Hcq.LIZJ;

    public abstract void LIZ(Canvas canvas, Paint paint, float f, int i, int i2, int i3, int i4);

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        int i = this.LL;
        if (i == 0) {
            return this.LLILLJJLI;
        }
        return this.LLILLL * i;
    }

    public AbstractC445150Hcv(int i, int i2, int i3, boolean z) {
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = i3;
        this.LLILZ = z;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        float primaryHorizontal;
        if (z && AbstractC445160Hcw.LIZ(charSequence, this, i6)) {
            this.LLILZIL.set(paint);
            if (((InterfaceC445170Hcx[]) ((Spanned) charSequence).getSpans(i6, (int) Math.min(i6 + 1, i7), InterfaceC445170Hcx.class)).length != 0) {
                this.LLILZIL.setAlpha((int) (this.LLILZIL.getAlpha() * (r2[0].LIZ() / 255.0f)));
            }
            if (i2 > 0) {
                primaryHorizontal = layout.getPrimaryHorizontal(i6) - this.LLILLJJLI;
            } else {
                primaryHorizontal = layout.getPrimaryHorizontal(i6) + this.LLILLJJLI;
            }
            LIZ(canvas, paint, primaryHorizontal, i2, i3, i4, i5);
        }
    }
}
