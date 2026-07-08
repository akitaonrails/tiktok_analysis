package X;

import java.util.List;
import p2.j1;

/* JADX INFO: renamed from: X.13ff, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20068513ff {
    public static final void LIZ(C20068213fc c20068213fc, int i, C20070713g1 c20070713g1) {
        C20068213fc c20068213fc2;
        C19968013Aw c19968013Aw = new C19968013Aw(new C20068213fc[16]);
        List<C20068213fc> listLJI = c20068213fc.LJI(false, false, false);
        while (true) {
            c19968013Aw.LJFF(c19968013Aw.LLILLL, listLJI);
            while (true) {
                int i2 = c19968013Aw.LLILLL;
                if (i2 != 0) {
                    c20068213fc2 = (C20068213fc) c19968013Aw.LJIILIIL(i2 - 1);
                    if (!C20068013fa.LJ(c20068213fc2) && !c20068213fc2.LIZLLL.LJ(C1696500uFU.LJIIIZ)) {
                        j1 j1VarLIZJ = c20068213fc2.LIZJ();
                        if (j1VarLIZJ != null) {
                            C1680470tpd c1680470tpdLIZ = C1691700u7k.LIZ(C1692940u9k.LIZJ(j1VarLIZJ));
                            if (c1680470tpdLIZ.LIZ < c1680470tpdLIZ.LIZJ && c1680470tpdLIZ.LIZIZ < c1680470tpdLIZ.LIZLLL) {
                                Object objLIZ = C20069413fo.LIZ(c20068213fc2.LIZLLL, C1694480uCE.LJ);
                                C1869430ykP c1869430ykP = (C1869430ykP) C20069413fo.LIZ(c20068213fc2.LIZLLL, C1696500uFU.LJIJJ);
                                if (objLIZ == null || c1869430ykP == null || c1869430ykP.LIZIZ.invoke().floatValue() <= 0.0f) {
                                    break;
                                }
                                int i3 = 1 + i;
                                c20070713g1.invoke(new C20068913fj(c20068213fc2, i3, c1680470tpdLIZ, j1VarLIZJ));
                                LIZ(c20068213fc2, i3, c20070713g1);
                            }
                        } else {
                            C1696250uF5.LIZJ("Expected semantics node to have a coordinator.");
                            throw new C2197108jB();
                        }
                    }
                } else {
                    return;
                }
            }
            listLJI = c20068213fc2.LJI(false, false, false);
        }
    }
}
