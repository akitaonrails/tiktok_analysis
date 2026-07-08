package X;

/* JADX INFO: renamed from: X.0qrN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1566230qrN extends AbstractC1805010x4V<C1566240qrO, C1556620qbs> implements InterfaceC1566260qrQ {
    @Override // X.AbstractC1805010x4V
    public final Object LJFF(C1566240qrO c1566240qrO, InterfaceC1364105Vn<? super C1556620qbs> interfaceC1364105Vn) {
        EnumC1562970qm7 enumC1562970qm7;
        int i;
        C1566240qrO c1566240qrO2 = c1566240qrO;
        if (c1566240qrO2.LIZJ) {
            enumC1562970qm7 = EnumC1562970qm7.DEFAULT;
        } else if (c1566240qrO2.LIZ) {
            enumC1562970qm7 = EnumC1562970qm7.FROM_SWITCH;
        } else if (c1566240qrO2.LIZLLL) {
            enumC1562970qm7 = EnumC1562970qm7.FIRST_RECHARGE;
        } else {
            enumC1562970qm7 = EnumC1562970qm7.DEFAULT;
        }
        boolean z = false;
        if (c1566240qrO2.LIZ) {
            i = 44;
        } else {
            i = 0;
        }
        if (!c1566240qrO2.LIZLLL || c1566240qrO2.LIZIZ) {
            z = true;
        }
        return new C1556620qbs(enumC1562970qm7, z, i);
    }
}
