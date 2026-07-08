package X;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: renamed from: X.0Gae, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C418260Gae extends ReplacementSpan implements InterfaceC431020GvE, InterfaceC418280Gag, InterfaceC417190GXl {
    public final int LL;
    public final int LLILLJJLI;
    public final CharSequence LLILLL;
    public InterfaceC328600CuQ LLILZ;
    public final int LLILZIL;
    public final int LLIZ;
    public final int LLIZLLLIL;
    public final int LLJ;
    public final int LLJI;
    public boolean LLJIJIL;
    public TextPaint LLJILJIL;
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(623));
    public final int LLILZLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));

    @Override // X.InterfaceC431020GvE
    public final void LIZJ() {
        this.LLJIJIL = false;
    }

    @Override // X.InterfaceC431020GvE
    public final void LIZLLL() {
        this.LLJIJIL = false;
    }

    @Override // X.InterfaceC431020GvE
    public final void LJ() {
        this.LLJIJIL = true;
    }

    public final RectF LIZ() {
        return (RectF) this.LLJILJILJ.getValue();
    }

    public static final int LIZIZ(int i) {
        try {
            i = Color.argb(C814420VxA.LIZIZ(Color.alpha(i) * 0.34f), Color.red(i), Color.green(i), Color.blue(i));
            return i;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return i;
        }
    }

    @Override // X.InterfaceC431020GvE
    public final void LJFF(InterfaceC328600CuQ interfaceC328600CuQ) {
        this.LLILZ = interfaceC328600CuQ;
    }

    @Override // X.InterfaceC431020GvE
    public final void onClick(View view) {
        InterfaceC328600CuQ interfaceC328600CuQ = this.LLILZ;
        if (interfaceC328600CuQ != null) {
            interfaceC328600CuQ.LIZ(view, this, this.LLILLL, null);
        }
    }

    public C418260Gae(int i, int i2, int i3, int i4, CharSequence charSequence) {
        this.LL = i3;
        this.LLILLJJLI = i4;
        this.LLILLL = charSequence;
        this.LLILZIL = -1;
        this.LLILZIL = C814420VxA.LIZIZ(C418440Gaw.LJ(10));
        this.LLIZ = i;
        this.LLIZLLLIL = i2;
        this.LLJ = LIZIZ(i);
        this.LLJI = LIZIZ(i2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return this.LL + (this.LLILLJJLI * 2);
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int i6;
        int i7;
        if (this.LLJILJIL == null) {
            TextPaint textPaint = new TextPaint(paint);
            int i8 = this.LLILZIL;
            if (i8 != -1) {
                textPaint.setTextSize(i8);
                textPaint.setLetterSpacing(0.0f);
            }
            C689240R1u.LIZ.getClass();
            textPaint.setTypeface(C689240R1u.LJJIIZ);
            this.LLJILJIL = textPaint;
        }
        TextPaint textPaint2 = this.LLJILJIL;
        if (textPaint2 != null) {
            Paint.FontMetrics fontMetrics = paint.getFontMetrics();
            textPaint2.measureText(charSequence, 0, charSequence.length());
            Paint.FontMetrics fontMetrics2 = textPaint2.getFontMetrics();
            int iMeasureText = (int) textPaint2.measureText(charSequence, i, i2);
            Math.abs(fontMetrics2.top);
            Math.abs(fontMetrics2.bottom);
            LIZ().top = i4 + fontMetrics.ascent;
            LIZ().bottom = LIZ().top + this.LL;
            LIZ().left = ((int) f) + this.LLILLJJLI;
            LIZ().right = LIZ().left + this.LL;
            if (this.LLJIJIL) {
                i6 = this.LLJI;
            } else {
                i6 = this.LLIZLLLIL;
            }
            paint.setColor(i6);
            RectF rectFLIZ = LIZ();
            int i9 = this.LLILZLL;
            canvas.drawRoundRect(rectFLIZ, i9, i9, paint);
            if (this.LLJIJIL) {
                i7 = this.LLJ;
            } else {
                i7 = this.LLIZ;
            }
            textPaint2.setColor(i7);
            float f2 = LIZ().left;
            float f3 = (LIZ().right - LIZ().left) - iMeasureText;
            float f4 = 2;
            canvas.drawText(charSequence, i, i2, (f3 / f4) + f2, (LIZ().bottom - (((LIZ().bottom - LIZ().top) - (fontMetrics2.leading - fontMetrics2.top)) / f4)) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), textPaint2);
            paint.setColor(0);
            LIZ().left = f;
            LIZ().right = LIZ().left + this.LLILLJJLI;
            canvas.drawRect(LIZ(), paint);
            LIZ().left = this.LL + f + this.LLILLJJLI;
            LIZ().right = LIZ().left + this.LLILLJJLI;
            canvas.drawRect(LIZ(), paint);
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
