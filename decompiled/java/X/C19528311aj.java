package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.11aj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19528311aj extends AbstractC19529211as {
    public static final C19528311aj LIZIZ = new C19528311aj();

    @Override // X.AbstractC19529211as
    public final AbstractC19526311aP LIZ() {
        AbstractC19526311aP abstractC19526311aP = new AbstractC19526311aP() { // from class: X.11aV
            @Override // X.AbstractC19526311aP
            public final C19528911ap LIZIZ(List list) {
                boolean z;
                Boolean bool;
                C19528911ap c19528911ap = new C19528911ap();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    InterfaceC19526611aS interfaceC19526611aS = (InterfaceC19526611aS) it2.next();
                    Map mapLIZ = AbstractC19526311aP.LIZ(interfaceC19526611aS.LJIILJJIL(), this.LIZJ);
                    Map<String, String> map = this.LIZJ;
                    if (mapLIZ.size() == map.size()) {
                        while (true) {
                            z = true;
                            for (Object obj : map.keySet()) {
                                if (!z || (bool = (Boolean) ((LinkedHashMap) mapLIZ).get(obj)) == null || !bool.booleanValue()) {
                                    z = false;
                                }
                            }
                        }
                        if (z) {
                            c19528911ap.LIZ.add(interfaceC19526611aS);
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
