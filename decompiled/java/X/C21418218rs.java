package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LineBackgroundSpan;
import android.view.KeyEvent;
import android.widget.TextView;
import kotlin.Pair;

/* JADX INFO: renamed from: X.18rs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21418218rs implements LineBackgroundSpan {
    public final int LL;
    public final int LLILLJJLI;
    public TextView LLILLL;
    public final C21418318rt LLILZ = new C21418318rt();
    public final Paint LLILZIL;

    public final Layout LIZIZ() {
        InterfaceC431030GvF interfaceC431030GvF;
        Layout layoutLJIIIIZZ;
        KeyEvent.Callback callback = this.LLILLL;
        if ((callback instanceof InterfaceC431030GvF) && (interfaceC431030GvF = (InterfaceC431030GvF) callback) != null && (layoutLJIIIIZZ = interfaceC431030GvF.LJIIIIZZ()) != null) {
            return layoutLJIIIIZZ;
        }
        TextView textView = this.LLILLL;
        if (textView != null) {
            return textView.getLayout();
        }
        return null;
    }

    public C21418218rs(int i, int i2) {
        this.LL = i;
        this.LLILLJJLI = i2;
        Paint paint = new Paint();
        paint.setColor(i);
        this.LLILZIL = paint;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0046 A[PHI: r2
      0x0046: PHI (r2v1 float) = (r2v0 float), (r2v5 float) binds: [B:11:0x002d, B:21:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static kotlin.Pair LIZ(int r7, int r8, int r9, android.text.Layout r10) {
        /*
            java.lang.CharSequence r0 = r10.getText()
            r6 = 0
            if (r0 == 0) goto L27
            int r0 = r0.length()
        Lb:
            int r5 = X.C13LZ.LJ(r7, r6, r0)
            int r4 = X.C13LZ.LJ(r8, r6, r0)
            if (r4 > r5) goto L29
            float r0 = r10.getPrimaryHorizontal(r5)
            java.lang.Float r2 = java.lang.Float.valueOf(r0)
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r2, r1)
            return r0
        L27:
            r0 = 0
            goto Lb
        L29:
            r2 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r3 = 1
            if (r5 > r4) goto L46
        L2f:
            float r1 = r10.getPrimaryHorizontal(r5)
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 >= 0) goto L38
            r2 = r1
        L38:
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L3d
            r3 = r1
        L3d:
            if (r5 == r4) goto L42
            int r5 = r5 + 1
            goto L2f
        L42:
            int r0 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r0 > 0) goto L57
        L46:
            int r0 = r10.getLineCount()
            int r0 = r0 + (-1)
            if (r0 >= 0) goto L4f
            r0 = 0
        L4f:
            int r0 = X.C13LZ.LJ(r9, r6, r0)
            float r3 = r10.getLineRight(r0)
        L57:
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            java.lang.Float r1 = java.lang.Float.valueOf(r3)
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21418218rs.LIZ(int, int, int, android.text.Layout):kotlin.Pair");
    }

    @Override // android.text.style.LineBackgroundSpan
    public void drawBackground(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, int i8) {
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
                Pair pairLIZ = LIZ(i9, i10, i8, layoutLIZIZ);
                float fFloatValue = ((Number) pairLIZ.getFirst()).floatValue();
                float fFloatValue2 = ((Number) pairLIZ.getSecond()).floatValue();
                float f = i4;
                float fAscent = f + paint.ascent();
                float fDescent = paint.descent() + f + this.LLILLJJLI;
                C21418318rt c21418318rt = this.LLILZ;
                c21418318rt.LIZ = fAscent;
                c21418318rt.LIZIZ = fDescent;
                float fAscent2 = paint.ascent() + f;
                float fDescent2 = f + paint.descent() + this.LLILLJJLI;
                c21418318rt.LIZ = fAscent2;
                c21418318rt.LIZIZ = fDescent2;
                C21418318rt c21418318rt2 = this.LLILZ;
                c21418318rt2.LIZJ = Float.valueOf(fFloatValue);
                c21418318rt2.LIZLLL = Float.valueOf(fFloatValue2);
                this.LLILZ.reset();
                this.LLILZ.addRect(fFloatValue, fAscent, fFloatValue2, fDescent, Path.Direction.CW);
                canvas.drawPath(this.LLILZ, this.LLILZIL);
            }
        }
    }
}
