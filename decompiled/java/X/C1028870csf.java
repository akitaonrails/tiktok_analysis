package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0csf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1028870csf implements InterfaceC1029020csu {
    public final Map<String, Function1<C1028760csU, Object>> LIZ;

    @Override // X.InterfaceC1029020csu
    public final Map<String, Function1<C1028760csU, Object>> getProvidedLogics() {
        return this.LIZ;
    }

    public C1028870csf(C1028880csg<?>... c1028880csgArr) {
        int iLIZIZ = C2097908Jt.LIZIZ(c1028880csgArr.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ < 16 ? 16 : iLIZIZ);
        for (C1028880csg<?> c1028880csg : c1028880csgArr) {
            linkedHashMap.put(c1028880csg.LIZ.getName(), c1028880csg);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C2097908Jt.LIZIZ(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), ((C1028880csg) entry.getValue()).LIZIZ);
        }
        this.LIZ = new LinkedHashMap(linkedHashMap2);
    }
}
