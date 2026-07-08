package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* JADX INFO: renamed from: X.0GWZ, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GWZ extends ReplacementSpan {
    public final boolean LL;
    public final C444890HcV LLILLJJLI;

    public C0GWZ(int i, boolean z) {
        this.LL = z;
        C444890HcV c444890HcV = new C444890HcV();
        this.LLILLJJLI = c444890HcV;
        c444890HcV.LIZ(71);
        c444890HcV.setColor(i);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        String strSubstring = String.valueOf(charSequence).substring(i, i2);
        if (this.LL) {
            return (int) this.LLILLJJLI.measureText(strSubstring);
        }
        return ((int) this.LLILLJJLI.measureText(strSubstring)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3));
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        String strSubstring = String.valueOf(charSequence).substring(i, i2);
        if (this.LL) {
            canvas.drawText(strSubstring, f, i4, this.LLILLJJLI);
        } else {
            canvas.drawText(strSubstring, f + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)), i4, this.LLILLJJLI);
        }
    }
}
