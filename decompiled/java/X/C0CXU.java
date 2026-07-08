package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CXU, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CXU extends C09AY implements Function0<Map<Integer, List<? extends String>>> {
    public final /* synthetic */ C1585250rM3 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CXU(C1585250rM3 c1585250rM3) {
        super(0);
        this.LL = c1585250rM3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<Integer, List<? extends String>> invoke() {
        this.LL.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((LinkedHashMap) C1584270rKT.LIZ).entrySet()) {
            Object key = entry.getKey();
            Iterable iterable = (Iterable) entry.getValue();
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(iterable, 10));
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                String key2 = ((EnumC1584360rKc) it2.next()).getKey();
                if (key2 == null) {
                    "Required value was null.".toString();
                    throw new IllegalStateException("Required value was null.");
                }
                arrayList.add(key2);
            }
            linkedHashMap.put(key, arrayList);
        }
        return linkedHashMap;
    }
}
