package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.12cR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19793712cR {
    public static InterfaceC19797112cz LIZ(C19792712cH c19792712cH) {
        if (c19792712cH == null) {
            return InterfaceC19797112cz.LJIILIIL;
        }
        int i = C19793012cK.LIZ[c19792712cH.LJJI().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            throw new IllegalStateException("Invalid entity: ".concat(String.valueOf(c19792712cH)));
                        }
                        throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
                    }
                    InterfaceC19875012pY<C19792712cH> interfaceC19875012pY = c19792712cH.zzg;
                    ArrayList arrayList = new ArrayList();
                    Iterator<C19792712cH> it2 = interfaceC19875012pY.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(LIZ(it2.next()));
                    }
                    return new C19798412dC(c19792712cH.zzh, arrayList);
                }
                if (c19792712cH.LJJII()) {
                    return new C19798912dH(Boolean.valueOf(c19792712cH.zzj));
                }
                return new C19798912dH(null);
            }
            if (c19792712cH.LJJIII()) {
                return new C19816212g4(Double.valueOf(c19792712cH.zzk));
            }
            return new C19816212g4(null);
        }
        if (c19792712cH.LJJIIJ()) {
            return new C19797512d3(c19792712cH.zzi);
        }
        return InterfaceC19797112cz.LJIJJ;
    }

    public static InterfaceC19797112cz LIZIZ(Object obj) {
        if (obj == null) {
            return InterfaceC19797112cz.LJIILJJIL;
        }
        if (obj instanceof String) {
            return new C19797512d3((String) obj);
        }
        if (obj instanceof Double) {
            return new C19816212g4((Double) obj);
        }
        if (obj instanceof Long) {
            return new C19816212g4(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new C19816212g4(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new C19798912dH((Boolean) obj);
        }
        if (obj instanceof Map) {
            C19796012co c19796012co = new C19796012co();
            Map map = (Map) obj;
            for (Object string : map.keySet()) {
                InterfaceC19797112cz interfaceC19797112czLIZIZ = LIZIZ(map.get(string));
                if (string != null) {
                    if (!(string instanceof String)) {
                        string = string.toString();
                    }
                    c19796012co.LJIIJJI((String) string, interfaceC19797112czLIZIZ);
                }
            }
            return c19796012co;
        }
        if (obj instanceof List) {
            C19796612cu c19796612cu = new C19796612cu();
            Iterator it2 = ((List) obj).iterator();
            while (it2.hasNext()) {
                c19796612cu.LJIIL(LIZIZ(it2.next()));
            }
            return c19796612cu;
        }
        throw new IllegalArgumentException("Invalid value type");
    }
}
