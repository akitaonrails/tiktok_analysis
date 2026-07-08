package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.13bP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20042113bP extends C09AY implements Function2<InterfaceC1567440qtK, C20042013bO, Map<Object, Map<String, ? extends List<? extends Object>>>> {
    public C20042113bP() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Map<Object, Map<String, ? extends List<? extends Object>>> invoke(InterfaceC1567440qtK interfaceC1567440qtK, C20042013bO c20042013bO) {
        C20042013bO c20042013bO2 = c20042013bO;
        LinkedHashMap linkedHashMap = new LinkedHashMap(c20042013bO2.LIZ);
        Iterator it2 = ((LinkedHashMap) c20042013bO2.LIZIZ).values().iterator();
        while (it2.hasNext()) {
            ((C20042213bQ) it2.next()).LIZ(linkedHashMap);
        }
        if (linkedHashMap.isEmpty()) {
            return null;
        }
        return linkedHashMap;
    }
}
