package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: X.1Dby, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public class C2259361Dby extends C1DQD {
    public static InterfaceC2259401Dc2 LIZ(C1DQC c1dqc, InterfaceC2259401Dc2 interfaceC2259401Dc2) {
        InterfaceC2259401Dc2 interfaceC2259401Dc22 = (InterfaceC2259401Dc2) ((HashMap) c1dqc.LIZ).get(Integer.valueOf(System.identityHashCode(interfaceC2259401Dc2)));
        if (interfaceC2259401Dc22 != null) {
            return interfaceC2259401Dc22;
        }
        List<InterfaceC2259411Dc3> listLIZ = interfaceC2259401Dc2.LIZ();
        ArrayList arrayList = new ArrayList(listLIZ.size());
        C2259371Dbz c2259371Dbz = new C2259371Dbz(interfaceC2259401Dc2.name(), arrayList);
        ((HashMap) c1dqc.LIZ).put(Integer.valueOf(System.identityHashCode(interfaceC2259401Dc2)), c2259371Dbz);
        Iterator<InterfaceC2259411Dc3> it2 = listLIZ.iterator();
        while (it2.hasNext()) {
            arrayList.add(LIZIZ(c1dqc, it2.next()));
        }
        return c2259371Dbz;
    }

    public static InterfaceC2259411Dc3 LIZIZ(C1DQC c1dqc, InterfaceC2259411Dc3 interfaceC2259411Dc3) {
        InterfaceC2259401Dc2 interfaceC2259401Dc2LIZ;
        InterfaceC2259411Dc3 interfaceC2259411Dc32 = (InterfaceC2259411Dc3) ((HashMap) c1dqc.LIZ).get(Integer.valueOf(System.identityHashCode(interfaceC2259411Dc3)));
        if (interfaceC2259411Dc32 != null) {
            return interfaceC2259411Dc32;
        }
        List<InterfaceC2259391Dc1> listLIZ = interfaceC2259411Dc3.LIZ();
        ArrayList arrayList = new ArrayList(listLIZ.size());
        C2259341Dbw c2259341Dbw = new C2259341Dbw(interfaceC2259411Dc3.name(), arrayList);
        ((HashMap) c1dqc.LIZ).put(Integer.valueOf(System.identityHashCode(interfaceC2259411Dc3)), c2259341Dbw);
        for (InterfaceC2259391Dc1 interfaceC2259391Dc1 : listLIZ) {
            Object c2259381Dc0 = ((HashMap) c1dqc.LIZ).get(Integer.valueOf(System.identityHashCode(interfaceC2259391Dc1)));
            if (c2259381Dc0 == null) {
                InterfaceC2259401Dc2 interfaceC2259401Dc2LJFF = interfaceC2259391Dc1.LJFF();
                Pattern patternLIZLLL = interfaceC2259391Dc1.LIZLLL();
                boolean zLJ = interfaceC2259391Dc1.LJ();
                boolean zLIZJ = interfaceC2259391Dc1.LIZJ();
                String strLIZIZ = interfaceC2259391Dc1.LIZIZ();
                if (interfaceC2259401Dc2LJFF != null) {
                    interfaceC2259401Dc2LIZ = LIZ(c1dqc, interfaceC2259401Dc2LJFF);
                } else {
                    interfaceC2259401Dc2LIZ = null;
                }
                c2259381Dc0 = new C2259381Dc0(patternLIZLLL, zLJ, zLIZJ, strLIZIZ, interfaceC2259401Dc2LIZ);
                ((HashMap) c1dqc.LIZ).put(Integer.valueOf(System.identityHashCode(interfaceC2259391Dc1)), c2259381Dc0);
            }
            arrayList.add(c2259381Dc0);
        }
        return c2259341Dbw;
    }
}
