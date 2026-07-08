package X;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0OqQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C631880OqQ {
    public static final C05P0 LIZ(InterfaceC595010NVj interfaceC595010NVj, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        boolean z;
        Object objLJJ = interfaceC1680500tpg.LJJ();
        InterfaceC1680500tpg.LIZ.getClass();
        C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
        if (objLJJ == c1680520tpi) {
            objLJJ = C20028913Yh.LJI(Boolean.FALSE);
            interfaceC1680500tpg.LJJIJIIJI(objLJJ);
        }
        C05P0 c05p0 = (C05P0) objLJJ;
        if ((((i & 14) ^ 6) <= 4 || !interfaceC1680500tpg.LJJIIJ(interfaceC595010NVj)) && (i & 6) != 4) {
            z = false;
        } else {
            z = true;
        }
        Object objLJJ2 = interfaceC1680500tpg.LJJ();
        if (z || objLJJ2 == c1680520tpi) {
            objLJJ2 = new C0NV9(interfaceC595010NVj, c05p0, null);
            interfaceC1680500tpg.LJJIJIIJI(objLJJ2);
        }
        C1680540tpk.LJFF(interfaceC595010NVj, (Function2) objLJJ2, interfaceC1680500tpg);
        return c05p0;
    }
}
