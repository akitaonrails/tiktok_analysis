package X;

import kotlin.jvm.internal.AwS393S0200000_27;

/* JADX INFO: renamed from: X.0wbP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1786970wbP implements InterfaceC560980LzM<C1787830wcn, C1787830wcn> {
    public final InterfaceC1786800wb8 LIZ;
    public final InterfaceC1788520wdu LIZIZ;

    @Override // X.InterfaceC560980LzM
    public final String getName() {
        return "report_order_success";
    }

    public C1786970wbP(InterfaceC1786800wb8 interfaceC1786800wb8, InterfaceC1788520wdu interfaceC1788520wdu) {
        this.LIZ = interfaceC1786800wb8;
        this.LIZIZ = interfaceC1788520wdu;
    }

    @Override // X.InterfaceC560980LzM
    public final Object LIZ(C1787830wcn c1787830wcn, InterfaceC1364105Vn<? super C1787830wcn> interfaceC1364105Vn) {
        C1787830wcn c1787830wcn2 = c1787830wcn;
        int i = C1786960wbO.LIZ[c1787830wcn2.LJ.ordinal()];
        if (i != 1 && i != 2) {
            InterfaceC1786480wac interfaceC1786480wacLJ = this.LIZIZ.LJ();
            C1787020wbU c1787020wbU = C1787020wbU.LIZJ;
            AwS393S0200000_27 awS393S0200000_27 = new AwS393S0200000_27(this, c1787830wcn2, 160);
            c1787020wbU.getClass();
            interfaceC1786480wacLJ.LIZ(new C1786590wan(c1787020wbU, awS393S0200000_27));
            return c1787830wcn2;
        }
        InterfaceC1786480wac interfaceC1786480wacLJ2 = this.LIZIZ.LJ();
        C1786980wbQ c1786980wbQ = new C1786600wao<C1786990wbR>() { // from class: X.0wbQ
            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C1786980wbQ);
            }

            public final int hashCode() {
                return 1344088192;
            }

            public final String toString() {
                return "Success";
            }

            {
                new C1786990wbR();
            }
        };
        AwS393S0200000_27 awS393S0200000_272 = new AwS393S0200000_27(this, c1787830wcn2, 159);
        c1786980wbQ.getClass();
        interfaceC1786480wacLJ2.LIZ(new C1786590wan(c1786980wbQ, awS393S0200000_272));
        return c1787830wcn2;
    }
}
