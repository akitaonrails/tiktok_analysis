package X;

import android.graphics.Paint;
import android.text.style.LineBackgroundSpan;
import android.widget.TextView;

/* JADX INFO: renamed from: X.0GV0, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GV0 implements LineBackgroundSpan {
    public final float LL;
    public final TextView LLILLJJLI;
    public final C0GTV LLILLL = new C0GTV();
    public final Paint LLILZ;

    public C0GV0(TextView textView, int i, float f) {
        this.LL = f;
        this.LLILLJJLI = textView;
        Paint paint = new Paint();
        paint.setColor(i);
        this.LLILZ = paint;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    @Override // android.text.style.LineBackgroundSpan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void drawBackground(android.graphics.Canvas r6, android.graphics.Paint r7, int r8, int r9, int r10, int r11, int r12, java.lang.CharSequence r13, int r14, int r15, int r16) {
        /*
            r5 = this;
            android.widget.TextView r0 = r5.LLILLJJLI
            android.text.Layout r4 = r0.getLayout()
            if (r4 != 0) goto L9
            return
        L9:
            android.widget.TextView r0 = r5.LLILLJJLI
            java.lang.CharSequence r1 = r0.getText()
            boolean r0 = r1 instanceof android.text.Spanned
            if (r0 == 0) goto L62
            android.text.Spanned r1 = (android.text.Spanned) r1
            if (r1 == 0) goto L62
            int r3 = r1.getSpanStart(r5)
            android.widget.TextView r0 = r5.LLILLJJLI
            java.lang.CharSequence r1 = r0.getText()
            boolean r0 = r1 instanceof android.text.Spanned
            if (r0 == 0) goto L62
            android.text.Spanned r1 = (android.text.Spanned) r1
            if (r1 == 0) goto L62
            int r2 = r1.getSpanEnd(r5)
            android.widget.TextView r0 = r5.LLILLJJLI
            java.lang.CharSequence r0 = r0.getText()
            if (r0 == 0) goto L69
            int r0 = r0.length()
        L39:
            r1 = 1
            int r0 = r0 - r1
            if (r2 != r0) goto L63
            if (r2 <= r15) goto L67
        L3f:
            if (r3 < r14) goto L42
            r14 = r3
        L42:
            int r0 = r12 - r10
            float r3 = (float) r0
            float r1 = (float) r1
            float r0 = r5.LL
            float r1 = r1 - r0
            float r3 = r3 * r1
            X.0GTV r2 = r5.LLILLL
            float r1 = (float) r10
            float r1 = r1 + r3
            float r0 = (float) r12
            r2.LIZ = r1
            r2.LIZIZ = r0
            r2.reset()
            X.0GTV r0 = r5.LLILLL
            r4.getSelectionPath(r14, r15, r0)
            X.0GTV r1 = r5.LLILLL
            android.graphics.Paint r0 = r5.LLILZ
            r6.drawPath(r1, r0)
        L62:
            return
        L63:
            int r15 = r15 - r1
            if (r2 <= r15) goto L67
            r2 = r15
        L67:
            r15 = r2
            goto L3f
        L69:
            r0 = 0
            goto L39
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0GV0.drawBackground(android.graphics.Canvas, android.graphics.Paint, int, int, int, int, int, java.lang.CharSequence, int, int, int):void");
    }
}
