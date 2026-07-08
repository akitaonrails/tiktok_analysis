package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.style.ReplacementSpan;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.Pair;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.11G0, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11G0 extends ReplacementSpan implements InterfaceC431020GvE, InterfaceC418280Gag, InterfaceC417190GXl {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public final C19350610nA LLILZLL;
    public final C11G1 LLIZ;
    public final C19350410n8 LLIZLLLIL;
    public final Paint LLJ;
    public final C444890HcV LLJI;
    public final Paint LLJIJIL;
    public final String LLJILJIL;
    public final String LLJILJILJ;
    public InterfaceC328600CuQ LLJILLL;

    @Override // X.InterfaceC431020GvE
    public final void LIZJ() {
    }

    @Override // X.InterfaceC431020GvE
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC431020GvE
    public final void LJ() {
    }

    public final int LIZIZ() {
        String str;
        String str2 = this.LLJILJIL;
        if (str2 == null || str2.length() == 0 || (str = this.LLJILJILJ) == null || str.length() == 0) {
            return 0;
        }
        return (int) (this.LLIZLLLIL.LIZ + r2.LIZJ + r2.LIZLLL);
    }

    public final int LJI() {
        String str;
        C11G1 c11g1;
        String str2 = this.LLJILJIL;
        if (((str2 == null || str2.length() == 0) && ((str = this.LLJILJILJ) == null || str.length() == 0)) || (c11g1 = this.LLIZ) == null) {
            return 0;
        }
        return c11g1.LJ;
    }

    public final float LJII() {
        String str = this.LLJILJIL;
        if (str != null) {
            return this.LLJI.measureText(str);
        }
        return 0.0f;
    }

    public final float LJIIIIZZ() {
        String str = this.LLJILJILJ;
        if (str != null) {
            return this.LLJI.measureText(str);
        }
        return 0.0f;
    }

    public final float LIZ(float f) {
        C19350610nA c19350610nA = this.LLILZLL;
        return f + c19350610nA.LIZIZ + c19350610nA.LIZLLL;
    }

    @Override // X.InterfaceC431020GvE
    public final void LJFF(InterfaceC328600CuQ interfaceC328600CuQ) {
        this.LLJILLL = interfaceC328600CuQ;
    }

    @Override // X.InterfaceC431020GvE
    public final void onClick(View view) {
        InterfaceC328600CuQ interfaceC328600CuQ = this.LLJILLL;
        if (interfaceC328600CuQ != null) {
            List<? extends CharSequence> listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(this.LLILLJJLI, new String[]{","}, 0, 6);
            Pair[] pairArr = new Pair[3];
            pairArr[0] = new Pair("sup_order", Integer.valueOf(this.LLILZ));
            String str = this.LL;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            pairArr[1] = new Pair("title", str);
            String str3 = this.LLILLL;
            if (str3 != null) {
                str2 = str3;
            }
            pairArr[2] = new Pair("sup_block_id", str2);
            interfaceC328600CuQ.LIZIZ(view, this, listLJJLIIIJILLIZJL, C2097608Jq.LJIIIIZZ(pairArr));
        }
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        int i3;
        C19350610nA c19350610nA = this.LLILZLL;
        int i4 = (c19350610nA.LIZIZ + c19350610nA.LIZLLL) * 2;
        C11G1 c11g1 = this.LLIZ;
        if (c11g1 != null) {
            i3 = c11g1.LIZJ;
        } else {
            i3 = 0;
        }
        return (int) (i4 + i3 + LJI() + LJII() + LIZIZ() + LJIIIIZZ());
    }

    public final void LJIIIZ(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, Paint paint) {
        float fLJI;
        String str;
        int i4;
        float fLJI2;
        int i5;
        int i6;
        float fLIZ;
        int iLJI;
        float fLIZ2;
        float fAscent = i3 + paint.ascent();
        float fDescent = paint.descent() - paint.ascent();
        float f2 = this.LLILZLL.LIZJ;
        float f3 = fAscent + ((fDescent - f2) / 2.0f);
        float f4 = f3 + f2;
        float f5 = f4 - f3;
        float f6 = ((f5 / 2.0f) + f3) - ((this.LLJI.getFontMetrics().ascent + this.LLJI.getFontMetrics().descent) / 2.0f);
        float f7 = f + this.LLILZLL.LIZLLL;
        RectF rectF = new RectF(f7, f3, (getSize(paint, charSequence, i, i2, paint.getFontMetricsInt()) - (this.LLILZLL.LIZLLL * 2)) + f7, f4);
        float f8 = this.LLILZLL.LIZ;
        canvas.drawRoundRect(rectF, f8, f8, this.LLJ);
        if (this.LLIZ != null) {
            if (C426750GoL.LJFF()) {
                fLIZ2 = LIZ(f) + LJIIIIZZ() + LIZIZ() + LJII() + LJI();
            } else {
                fLIZ2 = LIZ(f);
            }
            C11G1 c11g1 = this.LLIZ;
            int i7 = c11g1.LIZJ;
            float f9 = c11g1.LIZLLL;
            float f10 = ((f5 - f9) / 2.0f) + f3;
            Drawable drawable = c11g1.LIZ;
            drawable.setBounds((int) fLIZ2, (int) f10, (int) (fLIZ2 + i7), (int) (f10 + f9));
            drawable.draw(canvas);
        }
        String str2 = this.LLJILJIL;
        int i8 = 0;
        if (str2 != null && str2.length() != 0) {
            if (C426750GoL.LJFF()) {
                fLIZ = LIZ(f) + LJIIIIZZ();
                iLJI = LIZIZ();
            } else {
                float fLIZ3 = LIZ(f);
                C11G1 c11g12 = this.LLIZ;
                if (c11g12 != null) {
                    i6 = c11g12.LIZJ;
                } else {
                    i6 = 0;
                }
                fLIZ = fLIZ3 + i6;
                iLJI = LJI();
            }
            canvas.drawText(this.LLJILJIL, fLIZ + iLJI, f6, this.LLJI);
        }
        String str3 = this.LLJILJIL;
        if (str3 != null && str3.length() != 0 && (str = this.LLJILJILJ) != null && str.length() != 0) {
            if (C426750GoL.LJFF()) {
                fLJI2 = LIZ(f) + LJIIIIZZ();
                i5 = this.LLIZLLLIL.LIZLLL;
            } else {
                float fLIZ4 = LIZ(f);
                C11G1 c11g13 = this.LLIZ;
                if (c11g13 != null) {
                    i4 = c11g13.LIZJ;
                } else {
                    i4 = 0;
                }
                fLJI2 = fLIZ4 + i4 + LJI() + LJII();
                i5 = this.LLIZLLLIL.LIZJ;
            }
            float f11 = fLJI2 + i5;
            float f12 = ((f5 - r7.LIZIZ) / 2.0f) + f3;
            this.LLJI.setStrokeWidth(this.LLIZLLLIL.LIZ);
            canvas.drawLine(f11, f12, f11, f12 + this.LLIZLLLIL.LIZIZ, this.LLJIJIL);
        }
        String str4 = this.LLJILJILJ;
        if (str4 != null && str4.length() != 0) {
            if (C426750GoL.LJFF()) {
                fLJI = LIZ(f);
            } else {
                float fLIZ5 = LIZ(f);
                C11G1 c11g14 = this.LLIZ;
                if (c11g14 != null) {
                    i8 = c11g14.LIZJ;
                }
                fLJI = fLIZ5 + i8 + LJI() + LJII() + LIZIZ();
            }
            canvas.drawText(this.LLJILJILJ, fLJI, f6, this.LLJI);
        }
    }

    public C11G0(String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, C11G1 c11g1) {
        String string;
        CharSequence charSequenceEllipsize;
        CharSequence charSequenceEllipsize2;
        C19350610nA c19350610nA = new C19350610nA();
        C19350410n8 c19350410n8 = new C19350410n8();
        float fLIZIZ = C418440Gaw.LIZIZ(124);
        float fLIZIZ2 = C418440Gaw.LIZIZ(62);
        this.LL = str;
        this.LLILLJJLI = str3;
        this.LLILLL = str4;
        this.LLILZ = i;
        this.LLILZIL = i3;
        this.LLILZLL = c19350610nA;
        this.LLIZ = c11g1;
        this.LLIZLLLIL = c19350410n8;
        Paint paint = new Paint(1);
        paint.setColor(i2);
        this.LLJ = paint;
        C444890HcV c444890HcV = new C444890HcV();
        c444890HcV.setColor(i3);
        c444890HcV.LIZ(81);
        this.LLJI = c444890HcV;
        Paint paint2 = new Paint(1);
        paint2.setColor(i4);
        this.LLJIJIL = paint2;
        String string2 = null;
        if (str != null && (charSequenceEllipsize2 = TextUtils.ellipsize(str, c444890HcV, fLIZIZ, TextUtils.TruncateAt.END)) != null) {
            string = charSequenceEllipsize2.toString();
        } else {
            string = null;
        }
        this.LLJILJIL = string;
        if (str2 != null && (charSequenceEllipsize = TextUtils.ellipsize(str2, c444890HcV, fLIZIZ2, TextUtils.TruncateAt.END)) != null) {
            string2 = charSequenceEllipsize.toString();
        }
        this.LLJILJILJ = string2;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        paint.setColor(this.LLILZIL);
        try {
            LJIIIZ(canvas, charSequence, i, i2, f, i4, paint);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
