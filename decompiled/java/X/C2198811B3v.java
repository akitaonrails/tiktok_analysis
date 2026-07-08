package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.1B3v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2198811B3v {
    public final Map<Class<?>, InterfaceC2198821B3w<?>> LIZ = new LinkedHashMap();

    public final <T> T LIZ(Class<T> cls) {
        T t;
        InterfaceC2198821B3w interfaceC2198821B3w = (InterfaceC2198821B3w) ((LinkedHashMap) this.LIZ).get(cls);
        if (interfaceC2198821B3w == null || (t = (T) interfaceC2198821B3w.LIZ()) == null || !cls.isAssignableFrom(C1550010qRD.class)) {
            return null;
        }
        return t;
    }
}
