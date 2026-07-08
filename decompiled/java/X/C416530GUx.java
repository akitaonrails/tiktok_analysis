package X;

import android.graphics.Path;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.LineBackgroundSpan;
import android.view.View;
import android.widget.TextView;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0GUx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C416530GUx extends ClickableSpan implements LineBackgroundSpan, InterfaceC431020GvE, InterfaceC1859880yV0 {
    public final TextView LL;
    public final String LLILLJJLI;
    public final Integer LLILLL;
    public C0GV2 LLIZ;
    public C0GV3 LLIZLLLIL;
    public final boolean LLILZ = true;
    public int LLILZIL = -1;
    public int LLILZLL = -1;
    public final C01GW LLJ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(516));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1310));
    public final C416550GUz LLJIJIL = new C416550GUz();
    public final Path LLJILJIL = new Path();

    @Override // X.InterfaceC431020GvE
    public final void LIZJ() {
    }

    @Override // X.InterfaceC431020GvE
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC431020GvE
    public final void LJ() {
    }

    @Override // X.InterfaceC431020GvE
    public final void LJFF(InterfaceC328600CuQ interfaceC328600CuQ) {
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
    }

    @Override // X.InterfaceC1859880yV0
    public final void LIZ(C0GV2 c0gv2) {
        this.LLIZ = c0gv2;
    }

    @Override // X.InterfaceC1859880yV0
    public final void LIZIZ(C0GV3 c0gv3) {
        this.LLIZLLLIL = c0gv3;
    }

    @Override // android.text.style.ClickableSpan, X.InterfaceC431020GvE
    public final void onClick(View view) {
        C0GV2 c0gv2 = this.LLIZ;
        if (c0gv2 != null) {
            c0gv2.LIZ(view, this, this.LLILLJJLI, this.LLILZIL, this.LLILZLL, this.LLILZ);
        }
    }

    public C416530GUx(TextView textView, String str, Integer num) {
        this.LL = textView;
        this.LLILLJJLI = str;
        this.LLILLL = num;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    @Override // android.text.style.LineBackgroundSpan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void drawBackground(android.graphics.Canvas r21, android.graphics.Paint r22, int r23, int r24, int r25, int r26, int r27, java.lang.CharSequence r28, int r29, int r30, int r31) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C416530GUx.drawBackground(android.graphics.Canvas, android.graphics.Paint, int, int, int, int, int, java.lang.CharSequence, int, int, int):void");
    }
}
