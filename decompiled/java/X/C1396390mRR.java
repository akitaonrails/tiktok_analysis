package X;

import android.graphics.Canvas;
import android.text.Layout;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0mRR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1396390mRR extends AbstractC1396720mRy<C1384300m7w> implements InterfaceC1396670mRt {
    public final C444890HcV LLJILLL = new C444890HcV();
    public float LLJJ = 1.0f;
    public CharSequence LLJJI;
    public Layout LLJJIII;

    @Override // X.AbstractC1396720mRy
    public final int LJFF() {
        return 1001;
    }

    @Override // X.AbstractC1396720mRy
    public final void LJJII() {
        super.LJJII();
        this.LLJJI = null;
        this.LLJJIII = null;
        this.LLJILLL.reset();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x008b  */
    @Override // X.AbstractC1396720mRy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIL(X.C1384750m8f r9) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1396390mRR.LJIL(X.0m8f):void");
    }

    @Override // X.InterfaceC1396670mRt
    public final void LIZIZ(Canvas canvas, C1384750m8f c1384750m8f) {
        CharSequence charSequence;
        Layout layout;
        T t = this.LL;
        if (t != 0 && (charSequence = t.LIZIZ) != null && !a0.LJJJIL(charSequence) && (layout = this.LLJJIII) != null) {
            LJJIL(canvas, layout, c1384750m8f, true);
        }
    }

    @Override // X.AbstractC1396720mRy
    public final void LJIJI(AbstractC1384320m7y abstractC1384320m7y, C1384750m8f c1384750m8f) {
        this.LLJILLL.setFlags(5);
    }

    @Override // X.AbstractC1396720mRy
    public final void LJIJJ(Canvas canvas, C1384750m8f c1384750m8f) {
        CharSequence charSequence;
        T t = this.LL;
        if (t != 0 && (charSequence = t.LIZIZ) != null && !a0.LJJJIL(charSequence)) {
            canvas.save();
            canvas.translate(this.LLILLJJLI, this.LLILLL);
            Layout layout = this.LLJJIII;
            if (layout != null) {
                LJJIL(canvas, layout, c1384750m8f, false);
            }
            canvas.restore();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIL(android.graphics.Canvas r8, android.text.Layout r9, X.C1384750m8f r10, boolean r11) {
        /*
            r7 = this;
            X.0m8J r6 = r10.LJ
            float r2 = r6.LIZLLL
            double r0 = (double) r2
            r4 = 4547007122018943789(0x3f1a36e2eb1c432d, double:1.0E-4)
            int r3 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r3 <= 0) goto L38
            int r4 = r6.LJ
            android.text.TextPaint r3 = r9.getPaint()
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.STROKE
            r3.setStyle(r0)
            if (r11 != 0) goto L2f
            X.0m9D r0 = r10.LIZLLL
            kotlin.jvm.functions.Function1<? super X.0m7y, java.lang.Integer> r1 = r0.LIZLLL
            T extends X.0m7y r0 = r7.LL
            java.lang.Object r0 = r1.invoke(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r4 = X.C1396380mRQ.LIZ(r4, r0)
        L2f:
            r3.setColor(r4)
            r3.setStrokeWidth(r2)
            r9.draw(r8)
        L38:
            T extends X.0m7y r3 = r7.LL
            X.0m7w r3 = (X.C1384300m7w) r3
            if (r3 == 0) goto L79
            boolean r1 = r3.LJIILLIIL
            r0 = 1
            if (r1 != r0) goto L76
            X.0m8d r0 = X.C1384350m81.LIZJ
            java.lang.Integer r0 = r0.LIZ
        L47:
            if (r0 == 0) goto L79
            int r4 = r0.intValue()
        L4d:
            android.text.TextPaint r3 = r9.getPaint()
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL
            r3.setStyle(r0)
            if (r11 != 0) goto L6c
            X.0m9D r0 = r10.LIZLLL
            kotlin.jvm.functions.Function1<? super X.0m7y, java.lang.Integer> r1 = r0.LIZLLL
            T extends X.0m7y r0 = r7.LL
            java.lang.Object r0 = r1.invoke(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r4 = X.C1396380mRQ.LIZ(r4, r0)
        L6c:
            r3.setColor(r4)
            r3.setStrokeWidth(r2)
            r9.draw(r8)
            return
        L76:
            java.lang.Integer r0 = r3.LJIJI
            goto L47
        L79:
            X.0m8J r0 = r10.LJ
            int r4 = r0.LIZIZ
            goto L4d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1396390mRR.LJJIL(android.graphics.Canvas, android.text.Layout, X.0m8f, boolean):void");
    }
}
