package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Hd2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C445220Hd2 implements LeadingMarginSpan {
    public static final boolean LLILZLL;
    public final C448860Hiu LL;
    public final Paint LLILLJJLI = AbstractC445100Hcq.LIZJ;
    public final RectF LLILLL = AbstractC445100Hcq.LIZIZ;
    public final Rect LLILZ = AbstractC445100Hcq.LIZ;
    public final int LLILZIL;

    static {
        int i = Build.VERSION.SDK_INT;
        LLILZLL = 24 == i || 25 == i;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return this.LL.LIZJ;
    }

    public C445220Hd2(C448860Hiu c448860Hiu, int i) {
        this.LL = c448860Hiu;
        this.LLILZIL = i;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int iMin;
        int iMax;
        Paint.Style style;
        int width;
        if (z && AbstractC445160Hcw.LIZ(charSequence, this, i6)) {
            this.LLILLJJLI.set(paint);
            this.LL.LIZJ(this.LLILLJJLI);
            int iSave = canvas.save();
            try {
                if (this.LL.LJIIJ) {
                    i = (int) (layout.getPrimaryHorizontal(i6) - (this.LL.LIZJ * i2));
                }
                int i8 = this.LL.LIZJ;
                int iDescent = (int) ((this.LLILLJJLI.descent() - this.LLILLJJLI.ascent()) + 0.5f);
                C448860Hiu c448860Hiu = this.LL;
                int iMin2 = Math.min(c448860Hiu.LIZJ, iDescent) / 2;
                int i9 = c448860Hiu.LJIIIZ;
                if (i9 != 0 && i9 <= iMin2) {
                    iMin2 = i9;
                }
                int i10 = (i8 - iMin2) / 2;
                if (LLILZLL) {
                    if (i2 < 0) {
                        width = i - (layout.getWidth() - (i8 * this.LLILZIL));
                    } else {
                        width = (i8 * this.LLILZIL) - i;
                    }
                    int i11 = i + (i10 * i2);
                    int i12 = (i2 * iMin2) + i11;
                    int i13 = i2 * width;
                    iMin = Math.min(i11, i12) + i13;
                    iMax = Math.max(i11, i12) + i13;
                } else {
                    if (i2 <= 0) {
                        i -= i8;
                    }
                    iMin = i + i10;
                    iMax = iMin + iMin2;
                }
                int iDescent2 = (i4 + ((int) (((this.LLILLJJLI.descent() + this.LLILLJJLI.ascent()) / 2.0f) + 0.5f))) - (iMin2 / 2);
                int i14 = iMin2 + iDescent2;
                int i15 = this.LLILZIL;
                if (i15 != 0 && i15 != 1) {
                    this.LLILZ.set(iMin, iDescent2, iMax, i14);
                    this.LLILLJJLI.setStyle(Paint.Style.FILL);
                    canvas.drawRect(this.LLILZ, this.LLILLJJLI);
                } else {
                    this.LLILLL.set(iMin, iDescent2, iMax, i14);
                    if (this.LLILZIL == 0) {
                        style = Paint.Style.FILL;
                    } else {
                        style = Paint.Style.STROKE;
                    }
                    this.LLILLJJLI.setStyle(style);
                    canvas.drawOval(this.LLILLL, this.LLILLJJLI);
                }
                canvas.restoreToCount(iSave);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                canvas.restoreToCount(iSave);
                throw th;
            }
        }
    }
}
