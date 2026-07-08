package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0cse, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1028860cse extends C09AY implements Function0<Map<String, Function1<? super C1028760csU, ? extends Object>>> {
    public final /* synthetic */ C1028850csd LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1028860cse(C1028850csd c1028850csd) {
        super(0);
        this.LL = c1028850csd;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<String, Function1<? super C1028760csU, ? extends Object>> invoke() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1028880csg<?>[] c1028880csgArrLIZJ = this.LL.LIZJ();
        int iLIZIZ = C2097908Jt.LIZIZ(c1028880csgArrLIZJ.length);
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iLIZIZ);
        for (C1028880csg<?> c1028880csg : c1028880csgArrLIZJ) {
            linkedHashMap2.put(c1028880csg.LIZ.getName(), c1028880csg);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(C2097908Jt.LIZIZ(linkedHashMap2.size()));
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            linkedHashMap3.put(entry.getKey(), ((C1028880csg) entry.getValue()).LIZIZ);
        }
        linkedHashMap.putAll(linkedHashMap3);
        return linkedHashMap;
    }
}
