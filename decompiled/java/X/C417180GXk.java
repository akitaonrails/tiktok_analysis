package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.BidiFormatter;
import android.text.style.ReplacementSpan;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import java.util.List;

/* JADX INFO: renamed from: X.0GXk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C417180GXk extends ReplacementSpan implements InterfaceC431020GvE, InterfaceC417190GXl {
    public final Context LL;
    public final List<String> LLILLJJLI;
    public final TuxIconDrawable LLILLL;
    public InterfaceC328600CuQ LLILZ;
    public final C444890HcV LLILZIL;
    public Rect LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public final int LLJ;
    public final int LLJI;
    public final Paint.FontMetricsInt LLJIJIL;

    @Override // X.InterfaceC431020GvE
    public final void LIZJ() {
    }

    @Override // X.InterfaceC431020GvE
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC431020GvE
    public final void LJ() {
    }

    public final int LIZIZ(Paint.FontMetricsInt fontMetricsInt) {
        int iWidth;
        int i;
        int i2 = this.LLJ + this.LLJI;
        Rect bounds = this.LLILLL.getBounds();
        this.LLILZLL = bounds;
        int iHeight = 0;
        if (bounds != null) {
            iWidth = bounds.width();
        } else {
            iWidth = 0;
        }
        this.LLIZ = iWidth;
        Rect rect = this.LLILZLL;
        if (rect != null) {
            iHeight = rect.height();
        }
        this.LLIZLLLIL = iHeight;
        if (fontMetricsInt == null) {
            i = this.LLIZ;
        } else {
            int i3 = fontMetricsInt.descent;
            int i4 = fontMetricsInt.ascent;
            int i5 = (((i3 - i4) - iHeight) / 2) + i4;
            int i6 = iHeight + i5;
            if (i5 < i4) {
                fontMetricsInt.ascent = i5;
            }
            if (i5 < fontMetricsInt.top) {
                fontMetricsInt.top = i5;
            }
            if (i6 > i3) {
                fontMetricsInt.descent = i6;
            }
            if (i6 > fontMetricsInt.bottom) {
                fontMetricsInt.bottom = i6;
            }
            i = this.LLIZ;
        }
        return i + i2;
    }

    @Override // X.InterfaceC431020GvE
    public final void LJFF(InterfaceC328600CuQ interfaceC328600CuQ) {
        this.LLILZ = interfaceC328600CuQ;
    }

    @Override // X.InterfaceC431020GvE
    public final void onClick(View view) {
        InterfaceC328600CuQ interfaceC328600CuQ = this.LLILZ;
        if (interfaceC328600CuQ != null) {
            interfaceC328600CuQ.LIZIZ(view, this, this.LLILLJJLI, null);
        }
    }

    public C417180GXk(Context context, List<String> list, int i, TuxIconDrawable tuxIconDrawable) {
        int iLIZIZ;
        this.LL = context;
        this.LLILLJJLI = list;
        this.LLILLL = tuxIconDrawable;
        C444890HcV c444890HcV = new C444890HcV();
        this.LLILZIL = c444890HcV;
        if (C426750GoL.LIZLLL(context)) {
            iLIZIZ = 0;
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
        }
        this.LLJ = iLIZIZ;
        this.LLJI = C426750GoL.LIZLLL(context) ? 2 : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
        this.LLJIJIL = new Paint.FontMetricsInt();
        c444890HcV.setColor(i);
        c444890HcV.LIZ(51);
    }

    public final void LIZ(Canvas canvas, float f, int i, Paint paint, boolean z) {
        paint.getFontMetricsInt(this.LLJIJIL);
        Paint.FontMetricsInt fontMetricsInt = this.LLJIJIL;
        int i2 = fontMetricsInt.descent;
        int i3 = fontMetricsInt.ascent;
        float f2 = f + this.LLJ;
        float f3 = i + i3 + (((i2 - i3) - this.LLIZLLLIL) / 2);
        canvas.translate(f2, f3);
        if (z) {
            int iSave = canvas.save();
            canvas.scale(-1.0f, 1.0f, this.LLIZ / 2.0f, 0.0f);
            try {
                this.LLILLL.draw(canvas);
                canvas.restoreToCount(iSave);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                canvas.restoreToCount(iSave);
                throw th;
            }
        } else {
            this.LLILLL.draw(canvas);
        }
        canvas.translate(-f2, -f3);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return ((int) this.LLILZIL.measureText(String.valueOf(charSequence).substring(i, i2))) + LIZIZ(fontMetricsInt);
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        String strSubstring = String.valueOf(charSequence).substring(i, i2);
        boolean zIsRtl = BidiFormatter.getInstance().isRtl(strSubstring);
        boolean zLIZLLL = C426750GoL.LIZLLL(this.LL) ^ zIsRtl;
        if (zIsRtl) {
            LIZ(canvas, f, i4, paint, zLIZLLL);
            canvas.drawText(strSubstring, f + LIZIZ(this.LLJIJIL), i4, this.LLILZIL);
        } else {
            canvas.drawText(strSubstring, f, i4, this.LLILZIL);
            LIZ(canvas, f + this.LLILZIL.measureText(strSubstring), i4, paint, zLIZLLL);
        }
    }
}
