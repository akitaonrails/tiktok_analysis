package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13Z4, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13Z4 {
    public static final Object LIZ = new Object();

    public static final int LIZ(int i, int i2) {
        return i << (((i2 % 10) * 3) + 1);
    }

    public static final boolean LIZLLL(InterfaceC1675110tgz interfaceC1675110tgz, InterfaceC1675110tgz interfaceC1675110tgz2) {
        if (interfaceC1675110tgz != null) {
            if ((interfaceC1675110tgz instanceof C20030013Ys) && (interfaceC1675110tgz2 instanceof C20030013Ys)) {
                C20030013Ys c20030013Ys = (C20030013Ys) interfaceC1675110tgz;
                if (!c20030013Ys.LIZ() || Intrinsics.LJFF(interfaceC1675110tgz, interfaceC1675110tgz2) || Intrinsics.LJFF(c20030013Ys.LIZJ, ((C20030013Ys) interfaceC1675110tgz2).LIZJ)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public static final C19719212De LIZIZ(InterfaceC1680500tpg interfaceC1680500tpg, int i, C09AY c09ay) {
        C19719212De c19719212De;
        interfaceC1680500tpg.LJIIL(Integer.rotateLeft(i, 1), LIZ);
        Object objLJJ = interfaceC1680500tpg.LJJ();
        InterfaceC1680500tpg.LIZ.getClass();
        if (objLJJ == C1680510tph.LIZIZ) {
            c19719212De = new C19719212De(i, c09ay, true);
            interfaceC1680500tpg.LJJIJIIJI(c19719212De);
        } else {
            c19719212De = (C19719212De) objLJJ;
            c19719212De.LJIIJ(c09ay);
        }
        interfaceC1680500tpg.LJJIJL();
        return c19719212De;
    }

    public static final C19719212De LIZJ(int i, InterfaceC1451105m9 interfaceC1451105m9, InterfaceC1680500tpg interfaceC1680500tpg) {
        Object objLJJ = interfaceC1680500tpg.LJJ();
        InterfaceC1680500tpg.LIZ.getClass();
        if (objLJJ == C1680510tph.LIZIZ) {
            objLJJ = new C19719212De(i, interfaceC1451105m9, true);
            interfaceC1680500tpg.LJJIJIIJI(objLJJ);
        }
        C19719212De c19719212De = (C19719212De) objLJJ;
        c19719212De.LJIIJ(interfaceC1451105m9);
        return c19719212De;
    }
}
