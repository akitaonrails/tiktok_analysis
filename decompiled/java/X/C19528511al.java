package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.11al, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19528511al extends AbstractC19529211as {
    public static final C19528511al LIZIZ = new C19528511al();

    @Override // X.AbstractC19529211as
    public final AbstractC19526311aP LIZ() {
        AbstractC19526311aP abstractC19526311aP = new AbstractC19526311aP() { // from class: X.11aU
            @Override // X.AbstractC19526311aP
            public final C19528911ap LIZIZ(List list) {
                C19528911ap c19528911ap = new C19528911ap();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    InterfaceC19526611aS interfaceC19526611aS = (InterfaceC19526611aS) it2.next();
                    if (C13LP.LJJJJ(this.LIZ, interfaceC19526611aS.LJIL())) {
                        c19528911ap.LIZIZ.add(interfaceC19526611aS);
                    }
                    Map mapLIZ = AbstractC19526311aP.LIZ(interfaceC19526611aS.LJIILJJIL(), this.LIZJ);
                    if (!mapLIZ.isEmpty()) {
                        Iterator it3 = ((LinkedHashMap) mapLIZ).values().iterator();
                        while (it3.hasNext()) {
                            if (((Boolean) it3.next()).booleanValue()) {
                                c19528911ap.LIZ.add(interfaceC19526611aS);
                                break;
                            }
                        }
                    }
                    c19528911ap.LIZIZ.add(interfaceC19526611aS);
                }
                return c19528911ap;
            }
        };
        abstractC19526311aP.LIZIZ = LIZIZ.LIZ;
        return abstractC19526311aP;
    }
}
