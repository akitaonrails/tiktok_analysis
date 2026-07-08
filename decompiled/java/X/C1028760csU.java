package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0csU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1028760csU {
    public final Map<Class<? extends Object>, Object> LIZ;

    public C1028760csU(InterfaceC1028700csO... interfaceC1028700csOArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (InterfaceC1028700csO interfaceC1028700csO : interfaceC1028700csOArr) {
            linkedHashMap.putAll(interfaceC1028700csO.getProvidedContexts());
        }
        this.LIZ = linkedHashMap;
    }

    public final <T> T LIZ(Class<T> cls) {
        T t = (T) ((LinkedHashMap) this.LIZ).get(cls);
        if (t == null) {
            return null;
        }
        return t;
    }
}
