package X;

import kotlin.jvm.internal.AwS393S0200000_27;

/* JADX INFO: renamed from: X.0wbb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1787090wbb implements InterfaceC560980LzM<C1787830wcn, C1787830wcn> {
    public final InterfaceC1786800wb8 LIZ;
    public final InterfaceC1788520wdu LIZIZ;

    @Override // X.InterfaceC560980LzM
    public final String getName() {
        return "report_mp_order_success";
    }

    public C1787090wbb(InterfaceC1786800wb8 interfaceC1786800wb8, InterfaceC1788520wdu interfaceC1788520wdu) {
        this.LIZ = interfaceC1786800wb8;
        this.LIZIZ = interfaceC1788520wdu;
    }

    @Override // X.InterfaceC560980LzM
    public final Object LIZ(C1787830wcn c1787830wcn, InterfaceC1364105Vn<? super C1787830wcn> interfaceC1364105Vn) {
        C1787830wcn c1787830wcn2 = c1787830wcn;
        if (C1787080wba.LIZ[c1787830wcn2.LJ.ordinal()] == 1) {
            InterfaceC1786480wac interfaceC1786480wacLJ = this.LIZIZ.LJ();
            C1787130wbf c1787130wbf = new C1786600wao<C1787140wbg>() { // from class: X.0wbf
                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof C1787130wbf);
                }

                public final int hashCode() {
                    return -414339267;
                }

                public final String toString() {
                    return "Success";
                }

                {
                    new C1787140wbg();
                }
            };
            AwS393S0200000_27 awS393S0200000_27 = new AwS393S0200000_27(this, c1787830wcn2, 164);
            c1787130wbf.getClass();
            interfaceC1786480wacLJ.LIZ(new C1786590wan(c1787130wbf, awS393S0200000_27));
            return c1787830wcn2;
        }
        InterfaceC1786480wac interfaceC1786480wacLJ2 = this.LIZIZ.LJ();
        C1787100wbc c1787100wbc = C1787100wbc.LIZJ;
        AwS393S0200000_27 awS393S0200000_272 = new AwS393S0200000_27(this, c1787830wcn2, 165);
        c1787100wbc.getClass();
        interfaceC1786480wacLJ2.LIZ(new C1786590wan(c1787100wbc, awS393S0200000_272));
        return c1787830wcn2;
    }
}
