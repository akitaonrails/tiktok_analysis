package X;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Layout;
import android.text.Spanned;
import android.widget.TextView;
import kotlin.Pair;

/* JADX INFO: renamed from: X.18rr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21418118rr extends C21418218rs {
    public final C14S0 LLILZLL;
    public int LLIZ;

    public C21418118rr(C14S0 c14s0) {
        super(c14s0.LIZ, C445120Hcs.LIZ(3));
        this.LLILZLL = c14s0;
        this.LLIZ = 255;
    }

    @Override // X.C21418218rs, android.text.style.LineBackgroundSpan
    public final void drawBackground(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, int i8) {
        CharSequence text;
        Spanned spanned;
        Spanned spanned2;
        int i9 = i6;
        int i10 = i7;
        Layout layoutLIZIZ = LIZIZ();
        if (layoutLIZIZ == null) {
            return;
        }
        TextView textView = this.LLILLL;
        CharSequence text2 = null;
        if (textView != null) {
            text = textView.getText();
        } else {
            text = null;
        }
        if ((text instanceof Spanned) && (spanned = (Spanned) text) != null) {
            int spanStart = spanned.getSpanStart(this);
            TextView textView2 = this.LLILLL;
            if (textView2 != null) {
                text2 = textView2.getText();
            }
            if ((text2 instanceof Spanned) && (spanned2 = (Spanned) text2) != null) {
                int spanEnd = spanned2.getSpanEnd(this);
                if (spanEnd <= i10) {
                    i10 = spanEnd;
                }
                if (i10 < 0) {
                    i10 = 0;
                }
                if (spanStart >= i9) {
                    i9 = spanStart;
                }
                Pair pairLIZ = C21418218rs.LIZ(i9, i10, i8, layoutLIZIZ);
                float fFloatValue = ((Number) pairLIZ.getFirst()).floatValue();
                float fFloatValue2 = ((Number) pairLIZ.getSecond()).floatValue();
                int lineAscent = layoutLIZIZ.getLineAscent(i8) + i4 + this.LLILZLL.LIZJ;
                int lineDescent = i4 + layoutLIZIZ.getLineDescent(i8) + this.LLILZLL.LIZIZ;
                C21418318rt c21418318rt = this.LLILZ;
                float f = lineAscent;
                float f2 = lineDescent;
                c21418318rt.LIZ = f;
                c21418318rt.LIZIZ = f2;
                c21418318rt.LIZJ = Float.valueOf(fFloatValue);
                c21418318rt.LIZLLL = Float.valueOf(fFloatValue2);
                this.LLILZ.reset();
                this.LLILZ.addRect(fFloatValue, f, fFloatValue2, f2, Path.Direction.CW);
                this.LLILZIL.setAlpha((Color.alpha(this.LL) * this.LLIZ) / 255);
                canvas.drawPath(this.LLILZ, this.LLILZIL);
            }
        }
    }
}
