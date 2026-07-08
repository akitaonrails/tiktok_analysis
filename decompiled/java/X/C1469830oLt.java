package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0oLt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1469830oLt extends AbstractC1468760oKA {
    public final InterfaceC1469840oLu LIZ;

    @Override // X.AbstractC1468760oKA
    public final void LIZ() {
        this.LIZ.cancel();
    }

    public C1469830oLt(InterfaceC1469840oLu interfaceC1469840oLu) {
        this.LIZ = interfaceC1469840oLu;
    }

    @Override // X.AbstractC1468760oKA
    public final void LIZIZ(String str, C1467350oHt c1467350oHt) {
        this.LIZ.LIZ(str, new C1469820oLs(c1467350oHt));
    }

    @Override // X.AbstractC1468760oKA
    public final void LIZJ(String str, Map<String, String> map, InterfaceC1309180kAm interfaceC1309180kAm) {
        this.LIZ.LIZJ(str, map, new C1469820oLs(interfaceC1309180kAm));
    }

    @Override // X.AbstractC1468760oKA
    public final void LIZLLL(String str, Map map, InterfaceC1309180kAm interfaceC1309180kAm) {
        this.LIZ.LIZLLL(str, map, null, 0, new C1469820oLs(interfaceC1309180kAm));
    }
}
