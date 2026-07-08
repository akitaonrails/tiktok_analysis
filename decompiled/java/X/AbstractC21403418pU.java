package X;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* JADX INFO: renamed from: X.18pU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AbstractC21403418pU extends ReplacementSpan {
    public final C21403818pY LLILLJJLI;
    public final Paint.FontMetricsInt LL = new Paint.FontMetricsInt();
    public short LLILLL = -1;
    public float LLILZ = 1.0f;

    public AbstractC21403418pU(C21403818pY c21403818pY) {
        C08IF.LIZLLL(c21403818pY, "rasterizer cannot be null");
        this.LLILLJJLI = c21403818pY;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        short s;
        paint.getFontMetricsInt(this.LL);
        Paint.FontMetricsInt fontMetricsInt2 = this.LL;
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        C21404718ph c21404718phLIZJ = this.LLILLJJLI.LIZJ();
        int iLIZ = c21404718phLIZJ.LIZ(14);
        short s2 = 0;
        if (iLIZ != 0) {
            s = c21404718phLIZJ.LIZIZ.getShort(iLIZ + c21404718phLIZJ.LIZ);
        } else {
            s = 0;
        }
        this.LLILZ = fAbs / s;
        C21404718ph c21404718phLIZJ2 = this.LLILLJJLI.LIZJ();
        int iLIZ2 = c21404718phLIZJ2.LIZ(14);
        if (iLIZ2 != 0) {
            c21404718phLIZJ2.LIZIZ.getShort(iLIZ2 + c21404718phLIZJ2.LIZ);
        }
        C21404718ph c21404718phLIZJ3 = this.LLILLJJLI.LIZJ();
        int iLIZ3 = c21404718phLIZJ3.LIZ(12);
        if (iLIZ3 != 0) {
            s2 = c21404718phLIZJ3.LIZIZ.getShort(iLIZ3 + c21404718phLIZJ3.LIZ);
        }
        short s3 = (short) (s2 * this.LLILZ);
        this.LLILLL = s3;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.LL;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return s3;
    }
}
