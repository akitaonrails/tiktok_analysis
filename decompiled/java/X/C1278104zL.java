package X;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.04zL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1278104zL {
    public static final C1278104zL LIZJ = new C1278104zL(C08CX.INSTANCE, C2097608Jq.LJ());
    public final Set<C19EX> LIZ;
    public final Map<String, Set<Class<? extends AbstractC1889400zGc>>> LIZIZ;

    public C1278104zL(C08CX c08cx, Map map) {
        this.LIZ = c08cx;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        this.LIZIZ = linkedHashMap;
    }
}
