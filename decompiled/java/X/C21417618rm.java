package X;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.widget.TextView;
import java.util.Collection;

/* JADX INFO: renamed from: X.18rm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21417618rm extends AbstractC21434518uV {
    public final C14S0 LIZ;

    @Override // X.AbstractC21434218uS
    public final Collection<String> LIZJ() {
        return C1697810uHb.LJIILJJIL("mark");
    }

    public C21417618rm(C14S0 c14s0) {
        this.LIZ = c14s0;
    }

    @Override // X.AbstractC21434518uV
    public final Object LJ(C21432118u7 c21432118u7, C14S7 c14s7, InterfaceC21435018ua interfaceC21435018ua) {
        final C14S0 c14s0 = this.LIZ;
        if (c14s0 == null) {
            return null;
        }
        C21418218rs c21418218rs = new C21418218rs(c14s0) { // from class: X.18rq
            public final C14S0 LLILZLL;
            public int LLIZ;
            public final C21418418ru LLIZLLLIL;

            {
                super(c14s0.LIZ, c14s0.LIZIZ);
                this.LLILZLL = c14s0;
                this.LLIZ = 255;
                this.LLIZLLLIL = new C21418418ru();
            }

            @Override // X.C21418218rs, android.text.style.LineBackgroundSpan
            public final void drawBackground(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, int i8) {
                Spanned spanned;
                Layout layoutLIZIZ = LIZIZ();
                if (layoutLIZIZ == null) {
                    return;
                }
                TextView textView = this.LLILLL;
                CharSequence text = null;
                if (textView != null) {
                    text = textView.getText();
                }
                if ((text instanceof Spanned) && (spanned = (Spanned) text) != null) {
                    int spanStart = spanned.getSpanStart(this);
                    int spanEnd = spanned.getSpanEnd(this);
                    if (spanStart >= 0 && spanEnd >= 0) {
                        if (spanStart >= i6) {
                            i6 = spanStart;
                        }
                        if (spanEnd <= i7) {
                            i7 = spanEnd;
                        }
                        if (i6 >= i7) {
                            return;
                        }
                        int lineAscent = layoutLIZIZ.getLineAscent(i8) + i4 + this.LLILZLL.LIZJ;
                        int lineDescent = i4 + layoutLIZIZ.getLineDescent(i8) + this.LLILZLL.LIZIZ;
                        this.LLIZLLLIL.reset();
                        C21418418ru c21418418ru = this.LLIZLLLIL;
                        c21418418ru.LIZ = lineAscent;
                        c21418418ru.LIZIZ = lineDescent;
                        layoutLIZIZ.getSelectionPath(i6, i7, c21418418ru);
                        this.LLILZIL.setAlpha((Color.alpha(this.LL) * this.LLIZ) / 255);
                        canvas.drawPath(this.LLIZLLLIL, this.LLILZIL);
                    }
                }
            }
        };
        if (c14s0.LIZLLL) {
            return new Object[]{c21418218rs, new C21416618rc()};
        }
        return c21418218rs;
    }
}
