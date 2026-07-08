package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Spanned;
import android.text.style.ReplacementSpan;
import android.view.View;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Hd8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C445280Hd8 extends ReplacementSpan implements InterfaceC431020GvE, InterfaceC418280Gag, InterfaceC417190GXl {
    public final float LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public final CharSequence LLILZLL;
    public final Bitmap LLIZ;
    public final float LLIZLLLIL;
    public InterfaceC328600CuQ LLJ;
    public boolean LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;

    @Override // X.InterfaceC431020GvE
    public final void LIZJ() {
        this.LLJI = false;
    }

    @Override // X.InterfaceC431020GvE
    public final void LIZLLL() {
        this.LLJI = false;
    }

    @Override // X.InterfaceC431020GvE
    public final void LJ() {
        this.LLJI = true;
    }

    public final RectF LIZ() {
        return (RectF) this.LLJILJILJ.getValue();
    }

    @Override // X.InterfaceC431020GvE
    public final void LJFF(InterfaceC328600CuQ interfaceC328600CuQ) {
        this.LLJ = interfaceC328600CuQ;
    }

    @Override // X.InterfaceC431020GvE
    public final void onClick(View view) {
        InterfaceC328600CuQ interfaceC328600CuQ = this.LLJ;
        if (interfaceC328600CuQ != null) {
            interfaceC328600CuQ.LIZIZ(view, this, a0.LJJLIIIJILLIZJL(this.LLILZLL, new String[]{","}, 0, 6), null);
        }
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return this.LLILZ + (this.LLILZIL * 2);
    }

    public C445280Hd8(float f, int i, int i2, int i3, int i4, CharSequence charSequence, Bitmap bitmap, float f2) {
        this.LL = f;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = i3;
        this.LLILZIL = i4;
        this.LLILZLL = charSequence;
        this.LLIZ = bitmap;
        this.LLIZLLLIL = f2;
        this.LLJIJIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1636));
        this.LLJILJIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(636));
        this.LLJILJILJ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(635));
    }

    public /* synthetic */ C445280Hd8(float f, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, Bitmap bitmap) {
        this(f, i2, i3, i4, i5, charSequence, bitmap, 0.8f);
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Integer numValueOf;
        int i6 = i2;
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        float f2 = this.LLILZ * this.LLIZLLLIL;
        float f3 = 2;
        float f4 = i4 + (((fontMetrics.descent + fontMetrics.ascent) - f2) / f3);
        Spanned spanned = (Spanned) charSequence;
        int i7 = i + 1;
        if (i7 <= i6) {
            i6 = i7;
        }
        InterfaceC445170Hcx interfaceC445170Hcx = (InterfaceC445170Hcx) C13LQ.LJJIFFI(spanned.getSpans(i, i6, InterfaceC445170Hcx.class));
        if (interfaceC445170Hcx != null) {
            numValueOf = Integer.valueOf(interfaceC445170Hcx.LIZ());
        } else {
            numValueOf = null;
        }
        LIZ().left = this.LLILZIL + f;
        LIZ().top = f4;
        LIZ().right = LIZ().left + this.LLILZ;
        LIZ().bottom = LIZ().top + f2;
        paint.setColor(this.LLILLJJLI);
        int alpha = paint.getAlpha();
        int alpha2 = ((Paint) this.LLJILJIL.getValue()).getAlpha();
        int alpha3 = ((Paint) this.LLJIJIL.getValue()).getAlpha();
        if (numValueOf != null) {
            paint.setAlpha(C814420VxA.LIZIZ(alpha * (numValueOf.intValue() / 255.0f)));
        }
        RectF rectFLIZ = LIZ();
        float f5 = this.LL;
        canvas.drawRoundRect(rectFLIZ, f5, f5, paint);
        RectF rectF = new RectF();
        rectF.left = LIZ().left + (((LIZ().right - LIZ().left) - this.LLIZ.getWidth()) / f3);
        rectF.top = LIZ().top + (((LIZ().bottom - LIZ().top) - this.LLIZ.getHeight()) / f3);
        rectF.right = rectF.left + this.LLIZ.getWidth();
        rectF.bottom = rectF.top + this.LLIZ.getHeight();
        if (numValueOf != null) {
            ((Paint) this.LLJILJIL.getValue()).setAlpha(C814420VxA.LIZIZ(alpha2 * (numValueOf.intValue() / 255.0f)));
        }
        canvas.drawBitmap(this.LLIZ, (Rect) null, rectF, (Paint) this.LLJILJIL.getValue());
        if (this.LLJI) {
            if (numValueOf != null) {
                ((Paint) this.LLJIJIL.getValue()).setAlpha(C814420VxA.LIZIZ(alpha3 * (numValueOf.intValue() / 255.0f)));
            }
            RectF rectFLIZ2 = LIZ();
            float f6 = this.LL;
            canvas.drawRoundRect(rectFLIZ2, f6, f6, (Paint) this.LLJIJIL.getValue());
        }
        paint.setColor(0);
        LIZ().left = f;
        LIZ().right = LIZ().left + this.LLILZIL;
        canvas.drawRect(LIZ(), paint);
        LIZ().left = f + this.LLILZ + this.LLILZIL;
        LIZ().right = LIZ().left + this.LLILZIL;
        canvas.drawRect(LIZ(), paint);
        paint.setAlpha(alpha);
        ((Paint) this.LLJILJIL.getValue()).setAlpha(alpha2);
        ((Paint) this.LLJIJIL.getValue()).setAlpha(alpha3);
    }
}
