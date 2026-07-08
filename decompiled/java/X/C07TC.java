package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.07TC, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07TC extends C09AY implements Function0<Map<String, List<? extends String>>> {
    public C07TC() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<String, List<? extends String>> invoke() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2250201D5m.LIZ().geckoCleanAKAndWhiteList);
        for (Map.Entry entry : ((Map) C07LY.LIZIZ.getValue()).entrySet()) {
            if (linkedHashMap.containsKey(entry.getKey())) {
                Collection collection = (Collection) linkedHashMap.get(entry.getKey());
                ArrayList arrayList = collection != null ? new ArrayList(collection) : new ArrayList();
                arrayList.removeAll((Collection) entry.getValue());
                arrayList.addAll((Collection) entry.getValue());
                linkedHashMap.put(entry.getKey(), arrayList);
            } else {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : ((Map) C07L5.LIZIZ.getValue()).entrySet()) {
            if (linkedHashMap.containsKey(entry2.getKey())) {
                Collection collection2 = (Collection) linkedHashMap.get(entry2.getKey());
                ArrayList arrayList2 = collection2 != null ? new ArrayList(collection2) : new ArrayList();
                arrayList2.removeAll((Collection) entry2.getValue());
                linkedHashMap.put(entry2.getKey(), arrayList2);
            }
        }
        return linkedHashMap;
    }
}
