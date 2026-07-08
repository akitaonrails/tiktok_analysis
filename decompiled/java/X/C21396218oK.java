package X;

import android.content.Context;
import android.view.View;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.18oK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21396218oK extends AbstractC1542070qEP {
    public final C1390410mHn LLILLJJLI;
    public C1749280vcc LLILLL;

    @Override // X.InterfaceC1163110gNB
    public final View LJJL() {
        C1749280vcc c1749280vcc = this.LLILLL;
        if (c1749280vcc == null) {
            c1749280vcc = null;
        }
        c1749280vcc.LJ();
        C1749280vcc c1749280vcc2 = this.LLILLL;
        if (c1749280vcc2 == null) {
            c1749280vcc2 = null;
        }
        C786410Ut5.LLLZLZ(c1749280vcc2, 0);
        C1749280vcc c1749280vcc3 = this.LLILLL;
        if (c1749280vcc3 != null) {
            return c1749280vcc3;
        }
        return null;
    }

    public C21396218oK(C1390410mHn c1390410mHn) {
        this.LLILLJJLI = c1390410mHn;
    }

    @Override // X.InterfaceC1163110gNB
    public final void LJIIJ(Context context) {
        C1749280vcc c1749280vcc = new C1749280vcc(context, null, 6);
        c1749280vcc.setLayoutVariant(1);
        c1749280vcc.setTopMargin(C418440Gaw.LIZIZ(40));
        c1749280vcc.LIZ(new InterfaceC1749320vcg() { // from class: X.18oL
            @Override // X.InterfaceC1749320vcg
            public final void hide() {
                C1390410mHn c1390410mHn = this.LIZ.LLILLJJLI;
                if (c1390410mHn != null) {
                    c1390410mHn.LIZLLL();
                }
                C1390410mHn c1390410mHn2 = this.LIZ.LLILLJJLI;
                if (c1390410mHn2 != null) {
                    C786410Ut5.LLLZZIL(c1390410mHn2, 8);
                }
            }

            @Override // X.InterfaceC1749320vcg
            public final void show() {
                C1390410mHn c1390410mHn = this.LIZ.LLILLJJLI;
                if (c1390410mHn != null) {
                    c1390410mHn.LIZJ();
                }
                C1390410mHn c1390410mHn2 = this.LIZ.LLILLJJLI;
                if (c1390410mHn2 != null) {
                    C786410Ut5.LLLZZIL(c1390410mHn2, 0);
                }
            }
        });
        this.LLILLL = c1749280vcc;
    }

    @Override // X.InterfaceC1163110gNB
    public final View LJJJLIIL(InterfaceC1051240dSk interfaceC1051240dSk) {
        C1749280vcc c1749280vcc = this.LLILLL;
        if (c1749280vcc == null) {
            c1749280vcc = null;
        }
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        C1893080zMY.LJFF(c1722300uv6, new AwS576S0100000_32(interfaceC1051240dSk, 570));
        c1749280vcc.setStatus(c1722300uv6);
        C1749280vcc c1749280vcc2 = this.LLILLL;
        if (c1749280vcc2 == null) {
            c1749280vcc2 = null;
        }
        C786410Ut5.LLLZLZ(c1749280vcc2, 0);
        C1749280vcc c1749280vcc3 = this.LLILLL;
        if (c1749280vcc3 == null) {
            return null;
        }
        return c1749280vcc3;
    }
}
