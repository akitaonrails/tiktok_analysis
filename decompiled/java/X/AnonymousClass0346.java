package X;

import com.ss.android.ugc.aweme.feed.model.GlobalComponentData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0346, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class AnonymousClass0346 extends C09AY implements Function1<C700640Re2, C700640Re2> {
    public AnonymousClass0346() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final C700640Re2 invoke(C700640Re2 c700640Re2) {
        C700640Re2 c700640Re22 = c700640Re2;
        Collection<GlobalComponentData> collectionValues = c700640Re22.LIZLLL.values();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : collectionValues) {
            Integer numValueOf = Integer.valueOf(((GlobalComponentData) obj).getShowStrategy());
            Object arrayList = linkedHashMap.get(numValueOf);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(numValueOf, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        SortedMap sortedMapLIZLLL = C2097908Jt.LIZLLL(AnonymousClass0347.LIZIZ, linkedHashMap);
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = ((TreeMap) sortedMapLIZLLL).entrySet().iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI((Iterable) ((Map.Entry) it2.next()).getValue(), arrayList2);
        }
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(arrayList2, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iLIZIZ);
        for (Object obj2 : arrayList2) {
            linkedHashMap2.put(((GlobalComponentData) obj2).getComponentKey(), obj2);
        }
        return C700640Re2.LIZ(c700640Re22, new LinkedHashMap(linkedHashMap2), null, null, null, 247);
    }
}
