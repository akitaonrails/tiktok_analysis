package X;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS205S0000000_17;

/* JADX INFO: renamed from: X.0eY2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1092960eY2 {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(197));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(198));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(196));

    public static ConcurrentHashMap LIZ() {
        return (ConcurrentHashMap) LIZ.getValue();
    }

    public static void LIZIZ() {
        Iterator it2 = LIZ().entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            if (((C1092970eY3) ((C443120HZe) entry.getValue()).getFirst()).LIZ == C0J0P.ROOM) {
                InterfaceC1092860eXs interfaceC1092860eXs = (InterfaceC1092860eXs) ((C443120HZe) entry.getValue()).getSecond();
                if (interfaceC1092860eXs != null) {
                    interfaceC1092860eXs.LIZJ();
                }
                it2.remove();
                ((C1093050eYB) LIZJ.getValue()).LIZIZ((String) entry.getKey());
            }
        }
    }
}
