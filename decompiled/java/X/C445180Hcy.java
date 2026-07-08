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

/* JADX INFO: renamed from: X.0Hcy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C445180Hcy implements LeadingMarginSpan {
    public static final boolean LLJI;
    public final int LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public final boolean LLILZLL;
    public final Paint LLIZ = AbstractC445100Hcq.LIZJ;
    public final RectF LLIZLLLIL = AbstractC445100Hcq.LIZIZ;
    public final Rect LLJ = AbstractC445100Hcq.LIZ;

    static {
        int i = Build.VERSION.SDK_INT;
        LLJI = 24 == i || 25 == i;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return this.LLILLJJLI + this.LLILLL;
    }

    public C445180Hcy(int i, int i2, int i3, int i4, int i5, boolean z) {
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = i3;
        this.LLILZ = i4;
        this.LLILZIL = i5;
        this.LLILZLL = z;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int iMin;
        int iMax;
        Paint.Style style;
        int width;
        if (z && AbstractC445160Hcw.LIZ(charSequence, this, i6)) {
            this.LLIZ.set(paint);
            this.LLIZ.setColor(this.LLILZIL);
            if (((InterfaceC445170Hcx[]) ((Spanned) charSequence).getSpans(i6, (int) Math.min(i6 + 1, i7), InterfaceC445170Hcx.class)).length != 0) {
                this.LLIZ.setAlpha((int) (this.LLIZ.getAlpha() * (r2[0].LIZ() / 255.0f)));
            }
            int iSave = canvas.save();
            try {
                int i8 = this.LLILLJJLI;
                int iMin2 = Math.min(this.LLILLJJLI, (int) ((this.LLIZ.descent() - this.LLIZ.ascent()) + 0.5f)) / 2;
                int i9 = this.LLILZ;
                if (i9 != 0 && i9 <= iMin2) {
                    iMin2 = i9;
                }
                int i10 = (i8 - iMin2) / 2;
                if (LLJI) {
                    if (i2 < 0) {
                        width = i - (layout.getWidth() - (i8 * this.LL));
                    } else {
                        width = (i8 * this.LL) - i;
                    }
                    int i11 = i + (i10 * i2);
                    double d = i11;
                    double d2 = (i2 * iMin2) + i11;
                    double d3 = width * i2;
                    iMin = (int) (Math.min(d, d2) + d3);
                    iMax = (int) (Math.max(d, d2) + d3);
                } else {
                    if (i2 > 0) {
                        iMin = i + i10;
                    } else {
                        iMin = (i - i8) + i10;
                    }
                    iMax = iMin + iMin2;
                }
                int iDescent = (i4 + ((int) (((this.LLIZ.descent() + this.LLIZ.ascent()) / 2.0f) + 0.5f))) - (iMin2 / 2);
                int i12 = iMin2 + iDescent;
                if (this.LLILZLL) {
                    this.LLIZLLLIL.set(iMin, iDescent, iMax, i12);
                    this.LLIZ.setStyle(Paint.Style.FILL);
                    canvas.drawOval(this.LLIZLLLIL, this.LLIZ);
                } else {
                    int i13 = this.LL;
                    if (i13 != 0 && i13 != 1) {
                        this.LLJ.set(iMin, iDescent, iMax, i12);
                        this.LLIZ.setStyle(Paint.Style.FILL);
                        canvas.drawRect(this.LLJ, this.LLIZ);
                    } else {
                        this.LLIZLLLIL.set(iMin, iDescent, iMax, i12);
                        if (this.LL == 0) {
                            style = Paint.Style.FILL;
                        } else {
                            style = Paint.Style.STROKE;
                        }
                        this.LLIZ.setStyle(style);
                        canvas.drawOval(this.LLIZLLLIL, this.LLIZ);
                    }
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
