package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Hd1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C445210Hd1 implements LeadingMarginSpan {
    public static final boolean LLILZLL;
    public final C448860Hiu LL;
    public final int LLILLJJLI;
    public final Paint LLILLL = AbstractC445100Hcq.LIZJ;
    public final RectF LLILZ = AbstractC445100Hcq.LIZIZ;
    public final Rect LLILZIL = AbstractC445100Hcq.LIZ;

    static {
        int i = Build.VERSION.SDK_INT;
        LLILZLL = 24 == i || 25 == i;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return this.LL.LIZJ;
    }

    public C445210Hd1(C448860Hiu c448860Hiu, int i) {
        this.LL = c448860Hiu;
        this.LLILLJJLI = i;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int iMin;
        int iMax;
        Paint.Style style;
        int width;
        if (z && AbstractC445160Hcw.LIZ(charSequence, this, i6)) {
            this.LLILLL.set(paint);
            this.LL.LIZJ(this.LLILLL);
            if (((InterfaceC445170Hcx[]) ((Spanned) charSequence).getSpans(i6, (int) Math.min(i6 + 1, i7), InterfaceC445170Hcx.class)).length != 0) {
                this.LLILLL.setAlpha((int) (this.LLILLL.getAlpha() * (r2[0].LIZ() / 255.0f)));
            }
            int iSave = canvas.save();
            try {
                if (this.LL.LJIIJ) {
                    i = (int) (layout.getPrimaryHorizontal(i6) - (this.LL.LIZJ * i2));
                }
                int i8 = this.LL.LIZJ;
                int iDescent = (int) ((this.LLILLL.descent() - this.LLILLL.ascent()) + 0.5f);
                C448860Hiu c448860Hiu = this.LL;
                int iMin2 = Math.min(c448860Hiu.LIZJ, iDescent) / 2;
                int i9 = c448860Hiu.LJIIIZ;
                if (i9 != 0 && i9 <= iMin2) {
                    iMin2 = i9;
                }
                int i10 = (i8 - iMin2) / 2;
                if (LLILZLL) {
                    if (i2 < 0) {
                        width = i - (layout.getWidth() - (i8 * this.LLILLJJLI));
                    } else {
                        width = (i8 * this.LLILLJJLI) - i;
                    }
                    int i11 = i + (i2 * i10);
                    double d = i11;
                    double d2 = (i2 * iMin2) + i11;
                    double d3 = width * i2;
                    iMin = (int) (Math.min(d, d2) + d3);
                    iMax = (int) (Math.max(d, d2) + d3);
                } else {
                    if (i2 <= 0) {
                        i -= i8;
                    }
                    iMin = i + i10;
                    iMax = iMin + iMin2;
                }
                int iDescent2 = (i4 + ((int) (((this.LLILLL.descent() + this.LLILLL.ascent()) / 2.0f) + 0.5f))) - (iMin2 / 2);
                int i12 = iMin2 + iDescent2;
                int i13 = this.LLILLJJLI;
                if (i13 != 0 && i13 != 1) {
                    this.LLILZIL.set(iMin, iDescent2, iMax, i12);
                    this.LLILLL.setStyle(Paint.Style.FILL);
                    canvas.drawRect(this.LLILZIL, this.LLILLL);
                } else {
                    this.LLILZ.set(iMin, iDescent2, iMax, i12);
                    if (this.LLILLJJLI == 0) {
                        style = Paint.Style.FILL;
                    } else {
                        style = Paint.Style.STROKE;
                    }
                    this.LLILLL.setStyle(style);
                    canvas.drawOval(this.LLILZ, this.LLILLL);
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
