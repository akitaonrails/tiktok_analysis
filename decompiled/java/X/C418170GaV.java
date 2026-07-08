package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Spanned;
import android.text.style.ReplacementSpan;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0GaV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C418170GaV extends ReplacementSpan implements InterfaceC430910Gv3, InterfaceC430960Gv8, InterfaceC418250Gad {
    public final int LLILLJJLI;
    public final int LLILLL;
    public final Bitmap LLILZLL;
    public final int LLIZ;
    public final int LLIZLLLIL;
    public boolean LLJ;
    public InterfaceC418240Gac LLJI;
    public CharSequence LLJIJIL;
    public final int LL = 8;
    public final int LLILZ = 20;
    public final int LLILZIL = 3;

    @Override // X.InterfaceC430960Gv8
    public final void LIZ() {
    }

    @Override // X.InterfaceC430960Gv8
    public final float LJFF(float f) {
        return 0.0f;
    }

    @Override // X.InterfaceC418250Gad
    public final int getType() {
        return 1001;
    }

    @Override // X.InterfaceC430910Gv3
    public final int LIZIZ() {
        return this.LLILZIL * 2;
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
    public final void onClick(View view) {
        List listLJJLIIIJILLIZJL;
        InterfaceC418240Gac interfaceC418240Gac = this.LLJI;
        if (interfaceC418240Gac != null) {
            CharSequence charSequence = this.LLJIJIL;
            if (charSequence != null) {
                listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(charSequence, new String[]{","}, 0, 6);
            } else {
                listLJJLIIIJILLIZJL = null;
            }
            interfaceC418240Gac.LIZ(listLJJLIIIJILLIZJL);
        }
    }

    public C418170GaV(int i, int i2, Bitmap bitmap) {
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZLL = bitmap;
        this.LLIZ = LIZLLL(i);
        this.LLIZLLLIL = LIZLLL(i2);
    }

    @Override // X.InterfaceC430960Gv8
    public final void LIZJ(TextView textView, Spanned spanned, int i) {
        this.LLJ = false;
    }

    @Override // X.InterfaceC430960Gv8
    public final void LJ(TextView textView, Spanned spanned, int i) {
        this.LLJ = true;
    }

    @Override // X.InterfaceC430960Gv8
    public final void LJII(TextView textView, Spanned spanned, int i) {
        this.LLJ = false;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLILZ))) + (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLILZIL))) * 2);
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int i6;
        int i7;
        this.LLJIJIL = charSequence.subSequence(i, i2);
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        RectF rectF = new RectF();
        float fLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLILZIL))) + f;
        rectF.left = fLIZIZ;
        float f2 = i4;
        rectF.top = fontMetrics.ascent + f2;
        rectF.right = fLIZIZ + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLILZ)));
        rectF.bottom = f2 + fontMetrics.descent;
        if (this.LLJ) {
            i6 = this.LLIZLLLIL;
        } else {
            i6 = this.LLILLL;
        }
        paint.setColor(i6);
        canvas.drawRoundRect(rectF, C418440Gaw.LIZIZ(Integer.valueOf(this.LL)), C418440Gaw.LIZIZ(Integer.valueOf(this.LL)), paint);
        RectF rectF2 = new RectF();
        float f3 = rectF.left;
        float f4 = 2;
        rectF2.left = f3 + (((rectF.right - f3) - this.LLILZLL.getWidth()) / f4);
        float f5 = rectF.top;
        rectF2.top = f5 + (((rectF.bottom - f5) - this.LLILZLL.getHeight()) / f4);
        rectF2.right = rectF2.left + this.LLILZLL.getWidth();
        rectF2.bottom = rectF2.top + this.LLILZLL.getHeight();
        if (this.LLJ) {
            i7 = this.LLIZ;
        } else {
            i7 = this.LLILLJJLI;
        }
        paint.setColor(i7);
        canvas.drawBitmap(this.LLILZLL, (Rect) null, rectF2, paint);
        paint.setColor(0);
        rectF.left = f;
        rectF.right = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLILZIL))) + f;
        canvas.drawRect(rectF, paint);
        float fLIZIZ2 = f + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLILZ))) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLILZIL)));
        rectF.left = fLIZIZ2;
        rectF.right = fLIZIZ2 + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLILZIL)));
        canvas.drawRect(rectF, paint);
    }
}
