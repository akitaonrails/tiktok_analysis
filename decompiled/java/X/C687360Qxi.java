package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0Qxi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C687360Qxi {
    public static final List<InterfaceC687370Qxj> LIZ = new ArrayList();
    public static long LIZIZ;

    static {
        C2188561Al4 c2188561Al4 = C476250Ilz.LIZ;
        InterfaceC2188711AlJ interfaceC2188711AlJ = new InterfaceC2188711AlJ() { // from class: X.0Qxh
            @Override // X.InterfaceC2188711AlJ
            public final void LIZ(C1768270w7F c1768270w7F) {
                C09QO c09qo = c1768270w7F.LIZIZ;
                if (c09qo != null) {
                    int i = C687320Qxe.LIZ[c09qo.ordinal()];
                    if (i != 1) {
                        if (i == 2) {
                            Iterator it2 = ((ArrayList) C687360Qxi.LIZ).iterator();
                            while (it2.hasNext()) {
                                ((InterfaceC687370Qxj) it2.next()).onLowMemory();
                            }
                            return;
                        }
                        return;
                    }
                    int i2 = c1768270w7F.LIZLLL;
                    if (i2 != 8 && i2 != 9) {
                        return;
                    }
                    Iterator it3 = ((ArrayList) C687360Qxi.LIZ).iterator();
                    while (it3.hasNext()) {
                        ((InterfaceC687370Qxj) it3.next()).onLowMemory();
                    }
                }
            }
        };
        c2188561Al4.getClass();
        C2188561Al4.LJII(interfaceC2188711AlJ);
    }

    public static void LIZ(InterfaceC687370Qxj interfaceC687370Qxj) {
        ((ArrayList) LIZ).add(interfaceC687370Qxj);
    }
}
