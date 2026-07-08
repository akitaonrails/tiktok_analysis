package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.04mE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1196804mE {
    public final InterfaceC1092104Ox[] LIZ;
    public final Map<Class<? extends Object>, Object> LIZIZ;

    public C1196804mE(InterfaceC1092104Ox... interfaceC1092104OxArr) {
        this.LIZ = interfaceC1092104OxArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (InterfaceC1092104Ox interfaceC1092104Ox : interfaceC1092104OxArr) {
            linkedHashMap.putAll(interfaceC1092104Ox.getProvidedContexts());
        }
        this.LIZIZ = linkedHashMap;
    }

    public <T> T LIZ(Class<T> cls) {
        T t = (T) ((LinkedHashMap) this.LIZIZ).get(cls);
        if (t == null) {
            return null;
        }
        return t;
    }
}
