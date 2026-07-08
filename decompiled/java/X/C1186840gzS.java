package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AwS102S1000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: renamed from: X.0gzS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1186840gzS {
    public final Map<String, CopyOnWriteArrayList<InterfaceC1180270gor>> LIZ = new LinkedHashMap();
    public final List<InterfaceC1186850gzT> LIZIZ = new ArrayList();

    public final void LIZ(AbstractC1186480gys abstractC1186480gys) {
        C1180170goh.LIZLLL().LIZ(new AwS562S0100000_18(abstractC1186480gys, 2732));
        List<InterfaceC1186850gzT> list = this.LIZIZ;
        if (!(list instanceof Collection) || !((ArrayList) list).isEmpty()) {
            Iterator it2 = ((ArrayList) list).iterator();
            while (it2.hasNext()) {
                if (((InterfaceC1186850gzT) it2.next()).onEvent()) {
                    C1180170goh.LIZLLL().LIZ(new AwS562S0100000_18(abstractC1186480gys, 2733));
                    return;
                }
            }
        }
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) ((LinkedHashMap) this.LIZ).get(abstractC1186480gys.getEventName());
        if (copyOnWriteArrayList != null) {
            Iterator it3 = copyOnWriteArrayList.iterator();
            while (it3.hasNext()) {
                ((InterfaceC1180270gor) it3.next()).onEvent(abstractC1186480gys);
            }
        }
    }

    public final void LIZIZ(String str, InterfaceC1180270gor interfaceC1180270gor) {
        C1180170goh.LIZLLL().LIZ(new AwS102S1000000_18(str, 28));
        Map<String, CopyOnWriteArrayList<InterfaceC1180270gor>> map = this.LIZ;
        CopyOnWriteArrayList<InterfaceC1180270gor> copyOnWriteArrayList = (CopyOnWriteArrayList) ((LinkedHashMap) map).get(str);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        }
        copyOnWriteArrayList.add(interfaceC1180270gor);
        map.put(str, copyOnWriteArrayList);
    }

    public final void LIZJ(String str, InterfaceC1180270gor interfaceC1180270gor) {
        C1180170goh.LIZLLL().LIZ(new AwS102S1000000_18(str, 29));
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) ((LinkedHashMap) this.LIZ).get(str);
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(interfaceC1180270gor);
        }
    }
}
