package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.style.ReplacementSpan;
import android.view.View;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Hd6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C445260Hd6 extends ReplacementSpan implements InterfaceC431020GvE {
    public final C448860Hiu LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final InterfaceC445270Hd7 LLILZ;
    public final Paint LLILZIL = AbstractC445100Hcq.LIZJ;
    public final int LLILZLL = C445120Hcs.LIZ(26);
    public final int LLIZ = C445120Hcs.LIZ(10);
    public InterfaceC328600CuQ LLIZLLLIL;

    @Override // X.InterfaceC431020GvE
    public final void LIZJ() {
    }

    @Override // X.InterfaceC431020GvE
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC431020GvE
    public final void LJ() {
    }

    @Override // X.InterfaceC431020GvE
    public final void LJFF(InterfaceC328600CuQ interfaceC328600CuQ) {
        this.LLIZLLLIL = interfaceC328600CuQ;
    }

    @Override // X.InterfaceC431020GvE
    public final void onClick(View view) {
        this.LLILZ.LIZ(view, this.LLILLL);
        InterfaceC328600CuQ interfaceC328600CuQ = this.LLIZLLLIL;
        if (interfaceC328600CuQ != null) {
            interfaceC328600CuQ.LIZ(view, this, a0.LJLIL(this.LLILLJJLI, '[', ']'), null);
        }
    }

    public C445260Hd6(C448860Hiu c448860Hiu, String str, String str2, InterfaceC445270Hd7 interfaceC445270Hd7) {
        this.LL = c448860Hiu;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = interfaceC445270Hd7;
        C445120Hcs.LIZ(8);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return this.LLILZLL;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        String strLJLIL = a0.LJLIL(this.LLILLJJLI, '[', ']');
        this.LLILZIL.set(paint);
        this.LLILZIL.setTypeface(Typeface.DEFAULT_BOLD);
        this.LLILZIL.setTextSize(C445120Hcs.LIZIZ(12));
        float f2 = 2;
        float fMeasureText = (this.LLILZLL - this.LLILZIL.measureText(strLJLIL)) / f2;
        Paint.FontMetrics fontMetrics = this.LLILZIL.getFontMetrics();
        float f3 = fontMetrics.descent;
        float f4 = ((f3 - fontMetrics.ascent) / f2) - f3;
        float f5 = i4;
        float f6 = 3;
        canvas.drawText(strLJLIL, fMeasureText + f, f5 - f6, this.LLILZIL);
        this.LL.LIZLLL(this.LLILZIL);
        canvas.drawCircle(f + (this.LLILZLL / 2.0f), (f5 - f4) - f6, this.LLIZ, this.LLILZIL);
    }
}
