package X;

import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0hxf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1224170hxf {
    public static final InterfaceC1224210hxj LIZ(C1224280hxq c1224280hxq, String str) {
        if (str == null) {
            return new C1223840hx8();
        }
        List<InterfaceC1224210hxj> listLIZ = c1224280hxq.LIZLLL().LIZ();
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(listLIZ, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (InterfaceC1224210hxj interfaceC1224210hxj : listLIZ) {
            linkedHashMap.put(interfaceC1224210hxj.LIZ().LIZIZ, interfaceC1224210hxj);
        }
        InterfaceC1224210hxj interfaceC1224210hxj2 = (InterfaceC1224210hxj) linkedHashMap.get(str);
        if (interfaceC1224210hxj2 == null) {
            return new C1223840hx8();
        }
        return interfaceC1224210hxj2;
    }
}
