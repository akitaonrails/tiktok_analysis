package X;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0Wx7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C839870Wx7 {
    public static final CopyOnWriteArrayList<InterfaceC839880Wx8> LIZ = new CopyOnWriteArrayList<>();
    public static final CopyOnWriteArrayList<InterfaceC839890Wx9> LIZIZ = new CopyOnWriteArrayList<>();

    public static InterfaceC1259504wL LIZ(Map map, Map map2) {
        Iterator<InterfaceC839890Wx9> it2 = LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ();
        }
        Iterator<InterfaceC839880Wx8> it3 = LIZ.iterator();
        C823490WSd c823490WSd = null;
        while (it3.hasNext()) {
            InterfaceC1259504wL interfaceC1259504wLLIZ = it3.next().LIZ(map, map2);
            if (interfaceC1259504wLLIZ instanceof C840150WxZ) {
                return interfaceC1259504wLLIZ;
            }
            if (interfaceC1259504wLLIZ instanceof C823490WSd) {
                if (c823490WSd == null) {
                    c823490WSd = (C823490WSd) interfaceC1259504wLLIZ;
                } else {
                    C823490WSd c823490WSd2 = (C823490WSd) interfaceC1259504wLLIZ;
                    C823490WSd.LIZ(c823490WSd.LIZ, c823490WSd2.LIZ);
                    C823490WSd.LIZ(c823490WSd.LIZIZ, c823490WSd2.LIZIZ);
                    C823490WSd.LIZ(c823490WSd.LIZJ, c823490WSd2.LIZJ);
                }
            }
        }
        if (c823490WSd == null) {
            return null;
        }
        return c823490WSd;
    }
}
