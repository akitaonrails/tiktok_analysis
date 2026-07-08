package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0GaQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C418120GaQ extends ReplacementSpan implements InterfaceC431120GvO, InterfaceC418110GaP {
    public final int LLILLJJLI;
    public final int LLILLL;
    public final Bitmap LLILZLL;
    public final int LLIZ;
    public final int LLIZLLLIL;
    public boolean LLJ;
    public InterfaceC418230Gab LLJI;
    public CharSequence LLJIJIL;
    public final int LL = 8;
    public final int LLILZ = 20;
    public final int LLILZIL = 3;

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
        List listLJJLIIIJILLIZJL;
        InterfaceC418230Gab interfaceC418230Gab = this.LLJI;
        if (interfaceC418230Gab != null) {
            CharSequence charSequence = this.LLJIJIL;
            if (charSequence != null) {
                listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(charSequence, new String[]{","}, 0, 6);
            } else {
                listLJJLIIIJILLIZJL = null;
            }
            interfaceC418230Gab.LIZ(listLJJLIIIJILLIZJL);
        }
    }

    public C418120GaQ(int i, int i2, Bitmap bitmap) {
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZLL = bitmap;
        this.LLIZ = LJFF(i);
        this.LLIZLLLIL = LJFF(i2);
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
