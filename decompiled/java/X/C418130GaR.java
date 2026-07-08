package X;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0GaR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C418130GaR extends ReplacementSpan implements InterfaceC430910Gv3, InterfaceC430960Gv8, InterfaceC418250Gad {
    public final int LLILLL;
    public final int LLILZIL;
    public final int LLILZLL;
    public Paint.FontMetrics LLIZ;
    public final int LLIZLLLIL;
    public final int LLJ;
    public boolean LLJI;
    public InterfaceC418240Gac LLJIJIL;
    public final CharSequence LLJILJIL;
    public float LLJILLL;
    public final int LL = 12;
    public final int LLILLJJLI = 2;
    public float LLJILJILJ = -1.0f;
    public final int LLILZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));

    @Override // X.InterfaceC430960Gv8
    public final void LIZ() {
    }

    @Override // X.InterfaceC418250Gad
    public final int getType() {
        return 1001;
    }

    @Override // X.InterfaceC430910Gv3
    public final int LIZIZ() {
        return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf((this.LLILLJJLI * 2) + this.LL))) - ((int) this.LLJILLL);
    }

    @Override // X.InterfaceC418250Gad
    public final boolean LJI() {
        return C418190GaX.LIZ(this);
    }

    @Override // X.InterfaceC418250Gad
    public final boolean LJIIIIZZ() {
        return C418190GaX.LIZIZ(this);
    }

    public static final int LIZLLL(int i) {
        try {
            i = Color.argb(C814420VxA.LIZIZ(Color.alpha(i) * 0.34f), Color.red(i), Color.green(i), Color.blue(i));
            return i;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return i;
        }
    }

    @Override // X.InterfaceC430960Gv8
    public final float LJFF(float f) {
        float f2 = this.LLJILJILJ;
        if (f2 < 0.0f) {
            return 0.0f;
        }
        return Math.abs(f - (f2 + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf((this.LL / 2) + this.LLILLJJLI)))));
    }

    @Override // X.InterfaceC430960Gv8
    public final void onClick(View view) {
        InterfaceC418240Gac interfaceC418240Gac = this.LLJIJIL;
        if (interfaceC418240Gac != null) {
            interfaceC418240Gac.LIZJ(this, this.LLJILJIL, null);
        }
    }

    public C418130GaR(int i, int i2, CharSequence charSequence) {
        this.LLILLL = -1;
        this.LLILLL = C814420VxA.LIZIZ(C418440Gaw.LJ(10));
        this.LLILZIL = i;
        this.LLILZLL = i2;
        this.LLIZLLLIL = LIZLLL(i);
        this.LLJ = LIZLLL(i2);
        this.LLJILJIL = charSequence;
    }

    @Override // X.InterfaceC430960Gv8
    public final void LIZJ(TextView textView, Spanned spanned, int i) {
        this.LLJI = false;
    }

    @Override // X.InterfaceC430960Gv8
    public final void LJ(TextView textView, Spanned spanned, int i) {
        this.LLJI = true;
    }

    @Override // X.InterfaceC430960Gv8
    public final void LJII(TextView textView, Spanned spanned, int i) {
        this.LLJI = false;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LL + (this.LLILLJJLI * 2))));
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int i6;
        int i7;
        this.LLJILJILJ = f;
        TextPaint textPaint = new TextPaint(paint);
        this.LLIZ = paint.getFontMetrics();
        int i8 = this.LLILLL;
        if (i8 != -1) {
            textPaint.setTextSize(i8);
            textPaint.setLetterSpacing(0.0f);
        }
        C444890HcV c444890HcV = new C444890HcV();
        c444890HcV.LIZ(92);
        textPaint.setTypeface(c444890HcV.getTypeface());
        this.LLJILLL = textPaint.measureText(charSequence, 0, charSequence.length());
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("src leading:");
        Paint.FontMetrics fontMetrics2 = this.LLIZ;
        Paint.FontMetrics fontMetrics3 = null;
        if (fontMetrics2 == null) {
            fontMetrics2 = null;
        }
        sbLIZ.append(fontMetrics2.leading);
        sbLIZ.append(" top:");
        Paint.FontMetrics fontMetrics4 = this.LLIZ;
        if (fontMetrics4 == null) {
            fontMetrics4 = null;
        }
        sbLIZ.append(fontMetrics4.top);
        sbLIZ.append(" asecnt:");
        Paint.FontMetrics fontMetrics5 = this.LLIZ;
        if (fontMetrics5 == null) {
            fontMetrics5 = null;
        }
        sbLIZ.append(fontMetrics5.ascent);
        sbLIZ.append(" descent:");
        Paint.FontMetrics fontMetrics6 = this.LLIZ;
        if (fontMetrics6 == null) {
            fontMetrics6 = null;
        }
        sbLIZ.append(fontMetrics6.descent);
        sbLIZ.append(" bottom:");
        Paint.FontMetrics fontMetrics7 = this.LLIZ;
        if (fontMetrics7 != null) {
            fontMetrics3 = fontMetrics7;
        }
        sbLIZ.append(fontMetrics3.bottom);
        C2188811AlT.LIZIZ(sbLIZ);
        int iMeasureText = (int) textPaint.measureText(charSequence, i, i2);
        Math.abs(fontMetrics.top);
        Math.abs(fontMetrics.bottom);
        RectF rectF = new RectF();
        float f2 = i3;
        rectF.top = f2;
        rectF.bottom = f2 + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LL)));
        float fLIZIZ = ((int) f) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLILLJJLI)));
        rectF.left = fLIZIZ;
        rectF.right = fLIZIZ + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LL)));
        if (this.LLJI) {
            i6 = this.LLJ;
        } else {
            i6 = this.LLILZLL;
        }
        paint.setColor(i6);
        int i9 = this.LLILZ;
        canvas.drawRoundRect(rectF, i9, i9, paint);
        if (this.LLJI) {
            i7 = this.LLIZLLLIL;
        } else {
            i7 = this.LLILZIL;
        }
        textPaint.setColor(i7);
        float f3 = rectF.left;
        float f4 = (rectF.right - f3) - iMeasureText;
        float f5 = 2;
        float f6 = f3 + (f4 / f5);
        float f7 = fontMetrics.leading - fontMetrics.top;
        float f8 = rectF.bottom;
        canvas.drawText(charSequence, i, i2, f6, (f8 - (((f8 - rectF.top) - f7) / f5)) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), textPaint);
        paint.setColor(0);
        rectF.left = f;
        rectF.right = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLILLJJLI))) + f;
        canvas.drawRect(rectF, paint);
        float fLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LL + this.LLILLJJLI))) + f;
        rectF.left = fLIZIZ2;
        rectF.right = fLIZIZ2 + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLILLJJLI)));
        canvas.drawRect(rectF, paint);
    }
}
