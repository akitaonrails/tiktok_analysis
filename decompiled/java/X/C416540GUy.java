package X;

import android.content.Context;
import android.text.style.LineBackgroundSpan;
import android.view.View;
import android.widget.TextView;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0GUy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C416540GUy implements LineBackgroundSpan, InterfaceC431020GvE, InterfaceC1859880yV0 {
    public final TextView LL;
    public final Context LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final Integer LLILZLL;
    public final Integer LLIZ;
    public final boolean LLIZLLLIL;
    public C0GV2 LLJIJIL;
    public C0GV3 LLJILJIL;
    public int LLJ = -1;
    public int LLJI = -1;
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1165));
    public final C01GW LLJILLL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(465));
    public final C0GTP LLJJ = new C0GTP();

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

    @Override // X.InterfaceC1859880yV0
    public final void LIZ(C0GV2 c0gv2) {
        this.LLJIJIL = c0gv2;
    }

    @Override // X.InterfaceC1859880yV0
    public final void LIZIZ(C0GV3 c0gv3) {
        this.LLJILJIL = c0gv3;
    }

    @Override // X.InterfaceC431020GvE
    public final void onClick(View view) {
        C0GV2 c0gv2 = this.LLJIJIL;
        if (c0gv2 != null) {
            c0gv2.LIZ(view, this, this.LLILZIL, this.LLJ, this.LLJI, this.LLIZLLLIL);
        }
    }

    public C416540GUy(TextView textView, Context context, String str, String str2, String str3, Integer num, Integer num2, boolean z) {
        this.LL = textView;
        this.LLILLJJLI = context;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = num;
        this.LLIZ = num2;
        this.LLIZLLLIL = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0123  */
    @Override // android.text.style.LineBackgroundSpan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void drawBackground(android.graphics.Canvas r17, android.graphics.Paint r18, int r19, int r20, int r21, int r22, int r23, java.lang.CharSequence r24, int r25, int r26, int r27) {
        /*
            Method dump skipped, instruction units count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C416540GUy.drawBackground(android.graphics.Canvas, android.graphics.Paint, int, int, int, int, int, java.lang.CharSequence, int, int, int):void");
    }
}
