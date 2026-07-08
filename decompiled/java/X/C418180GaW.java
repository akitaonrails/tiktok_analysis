package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Spanned;
import android.text.style.ReplacementSpan;
import android.view.View;
import android.widget.TextView;
import java.util.List;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0GaW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C418180GaW extends ReplacementSpan implements InterfaceC430910Gv3, InterfaceC430960Gv8, InterfaceC418250Gad {
    public final int LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final Bitmap LLIZ;
    public boolean LLIZLLLIL;
    public InterfaceC418240Gac LLJ;
    public final CharSequence LLJI;
    public float LLJILJIL;
    public final int LL = 8;
    public final int LLILZIL = 20;
    public final int LLILZLL = 3;
    public float LLJIJIL = -1.0f;
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1146));

    @Override // X.InterfaceC430960Gv8
    public final void LIZ() {
    }

    @Override // X.InterfaceC418250Gad
    public final int getType() {
        return 1001;
    }

    @Override // X.InterfaceC430910Gv3
    public final int LIZIZ() {
        return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf((this.LLILZLL * 2) + this.LLILZIL))) - ((int) this.LLJILJIL);
    }

    @Override // X.InterfaceC418250Gad
    public final boolean LJI() {
        return C418190GaX.LIZ(this);
    }

    @Override // X.InterfaceC418250Gad
    public final boolean LJIIIIZZ() {
        return C418190GaX.LIZIZ(this);
    }

    @Override // X.InterfaceC430960Gv8
    public final float LJFF(float f) {
        float f2 = this.LLJIJIL;
        if (f2 < 0.0f) {
            return 0.0f;
        }
        return Math.abs(f - (f2 + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf((this.LLILZIL / 2) + this.LLILZLL)))));
    }

    @Override // X.InterfaceC430960Gv8
    public final void onClick(View view) {
        List listLJJLIIIJILLIZJL;
        InterfaceC418240Gac interfaceC418240Gac = this.LLJ;
        if (interfaceC418240Gac != null) {
            CharSequence charSequence = this.LLJI;
            if (charSequence != null) {
                listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(charSequence, new String[]{","}, 0, 6);
            } else {
                listLJJLIIIJILLIZJL = null;
            }
            interfaceC418240Gac.LIZ(listLJJLIIIJILLIZJL);
        }
    }

    @Override // X.InterfaceC430960Gv8
    public final void LIZJ(TextView textView, Spanned spanned, int i) {
        this.LLIZLLLIL = false;
    }

    @Override // X.InterfaceC430960Gv8
    public final void LJ(TextView textView, Spanned spanned, int i) {
        this.LLIZLLLIL = true;
    }

    @Override // X.InterfaceC430960Gv8
    public final void LJII(TextView textView, Spanned spanned, int i) {
        this.LLIZLLLIL = false;
    }

    public C418180GaW(int i, int i2, int i3, CharSequence charSequence, Bitmap bitmap) {
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = i3;
        this.LLIZ = bitmap;
        this.LLJI = charSequence;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLILZIL + (this.LLILZLL * 2))));
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        this.LLJIJIL = f;
        this.LLJILJIL = this.LLIZ.getWidth();
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        RectF rectF = new RectF();
        float fLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLILZLL))) + f;
        rectF.left = fLIZIZ;
        float f2 = i4;
        rectF.top = fontMetrics.ascent + f2;
        rectF.right = fLIZIZ + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLILZIL)));
        rectF.bottom = f2 + fontMetrics.descent;
        paint.setColor(this.LLILLL);
        canvas.drawRoundRect(rectF, C418440Gaw.LIZIZ(Integer.valueOf(this.LL)), C418440Gaw.LIZIZ(Integer.valueOf(this.LL)), paint);
        RectF rectF2 = new RectF();
        float f3 = rectF.left;
        float f4 = 2;
        rectF2.left = f3 + (((rectF.right - f3) - this.LLIZ.getWidth()) / f4);
        float f5 = rectF.top;
        rectF2.top = f5 + (((rectF.bottom - f5) - this.LLIZ.getHeight()) / f4);
        rectF2.right = rectF2.left + this.LLIZ.getWidth();
        rectF2.bottom = rectF2.top + this.LLIZ.getHeight();
        paint.setColor(this.LLILLJJLI);
        canvas.drawBitmap(this.LLIZ, (Rect) null, rectF2, paint);
        if (this.LLIZLLLIL) {
            canvas.drawRoundRect(rectF, C418440Gaw.LIZIZ(Integer.valueOf(this.LL)), C418440Gaw.LIZIZ(Integer.valueOf(this.LL)), (Paint) this.LLJILJILJ.getValue());
        }
        paint.setColor(0);
        rectF.left = f;
        rectF.right = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLILZLL))) + f;
        canvas.drawRect(rectF, paint);
        float fLIZIZ2 = f + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLILZIL + this.LLILZLL)));
        rectF.left = fLIZIZ2;
        rectF.right = fLIZIZ2 + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLILZLL)));
        canvas.drawRect(rectF, paint);
    }
}
