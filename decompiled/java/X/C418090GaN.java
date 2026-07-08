package X;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0GaN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C418090GaN extends ReplacementSpan implements InterfaceC431120GvO, InterfaceC418110GaP {
    public final int LLILLJJLI;
    public final int LLILZ;
    public final int LLILZIL;
    public Paint.FontMetrics LLILZLL;
    public final int LLIZ;
    public final int LLIZLLLIL;
    public boolean LLJ;
    public InterfaceC418230Gab LLJI;
    public CharSequence LLJIJIL;
    public final int LL = 14;
    public final int LLILLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));

    @Override // X.InterfaceC431120GvO
    public final void LIZ() {
    }

    @Override // X.InterfaceC431120GvO
    public final void LIZIZ() {
        this.LLJ = true;
    }

    @Override // X.InterfaceC431120GvO
    public final void LIZJ() {
        this.LLJ = false;
    }

    @Override // X.InterfaceC431120GvO
    public final void LIZLLL() {
        this.LLJ = false;
    }

    @Override // X.InterfaceC431120GvO
    public final void LJ() {
    }

    public static final int LJFF(int i) {
        try {
            i = Color.argb(C814420VxA.LIZIZ(Color.alpha(i) * 0.34f), Color.red(i), Color.green(i), Color.blue(i));
            return i;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return i;
        }
    }

    @Override // X.InterfaceC431120GvO
    public final void onClick(View view) {
        InterfaceC418230Gab interfaceC418230Gab = this.LLJI;
        if (interfaceC418230Gab != null) {
            interfaceC418230Gab.LIZIZ(this, this.LLJIJIL, null);
        }
    }

    public C418090GaN(int i, int i2, CharSequence charSequence) {
        this.LLILLJJLI = -1;
        this.LLILLJJLI = C814420VxA.LIZIZ(C418440Gaw.LJ(11));
        this.LLILZ = i;
        this.LLILZIL = i2;
        this.LLIZ = LJFF(i);
        this.LLIZLLLIL = LJFF(i2);
        this.LLJIJIL = charSequence;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Integer numValueOf;
        Integer numValueOf2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getSize: start=");
        sbLIZ.append(i);
        sbLIZ.append(" end=");
        sbLIZ.append(i2);
        sbLIZ.append(" fm.top=");
        Integer numValueOf3 = null;
        if (fontMetricsInt != null) {
            numValueOf = Integer.valueOf(fontMetricsInt.top);
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(" fm.bottom=");
        if (fontMetricsInt != null) {
            numValueOf2 = Integer.valueOf(fontMetricsInt.bottom);
        } else {
            numValueOf2 = null;
        }
        sbLIZ.append(numValueOf2);
        sbLIZ.append(" fm.ascent=");
        if (fontMetricsInt != null) {
            numValueOf3 = Integer.valueOf(fontMetricsInt.ascent);
        }
        sbLIZ.append(numValueOf3);
        C2188811AlT.LIZIZ(sbLIZ);
        return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LL)));
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int i6;
        int i7;
        this.LLJIJIL = charSequence.subSequence(i, i2);
        TextPaint textPaint = new TextPaint(paint);
        this.LLILZLL = paint.getFontMetrics();
        int i8 = this.LLILLJJLI;
        float f2 = 0.0f;
        if (i8 != -1) {
            textPaint.setTextSize(i8);
            textPaint.setLetterSpacing(0.0f);
        }
        C444890HcV c444890HcV = new C444890HcV();
        c444890HcV.LIZ(82);
        textPaint.setTypeface(c444890HcV.getTypeface());
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        Paint.FontMetrics fontMetrics2 = this.LLILZLL;
        if (fontMetrics2 != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("src leading:");
            sbLIZ.append(fontMetrics2.leading);
            sbLIZ.append(" top:");
            sbLIZ.append(fontMetrics2.top);
            sbLIZ.append(" asecnt:");
            sbLIZ.append(fontMetrics2.ascent);
            sbLIZ.append(" descent:");
            sbLIZ.append(fontMetrics2.descent);
            sbLIZ.append(" bottom:");
            sbLIZ.append(fontMetrics2.bottom);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        int iMeasureText = (int) textPaint.measureText(charSequence, i, i2);
        Math.abs(fontMetrics.top);
        Math.abs(fontMetrics.bottom);
        RectF rectF = new RectF();
        float f3 = i4;
        Paint.FontMetrics fontMetrics3 = this.LLILZLL;
        if (fontMetrics3 != null) {
            f2 = fontMetrics3.top;
        }
        float fAbs = f3 - Math.abs(f2);
        rectF.top = fAbs;
        rectF.bottom = fAbs + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LL)));
        float f4 = (int) f;
        rectF.left = f4;
        rectF.right = f4 + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LL)));
        if (this.LLJ) {
            i6 = this.LLIZLLLIL;
        } else {
            i6 = this.LLILZIL;
        }
        paint.setColor(i6);
        int i9 = this.LLILLL;
        canvas.drawRoundRect(rectF, i9, i9, paint);
        if (this.LLJ) {
            i7 = this.LLIZ;
        } else {
            i7 = this.LLILZ;
        }
        textPaint.setColor(i7);
        float f5 = rectF.left;
        float f6 = (rectF.right - f5) - iMeasureText;
        float f7 = 2;
        float f8 = f5 + (f6 / f7);
        float f9 = fontMetrics.leading - fontMetrics.top;
        float f10 = rectF.bottom;
        canvas.drawText(charSequence, i, i2, f8, (f10 - (((f10 - rectF.top) - f9) / f7)) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), textPaint);
    }
}
