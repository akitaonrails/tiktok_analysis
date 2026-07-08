package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0qRE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1550020qRE {
    public final Map<Class<?>, InterfaceC1550090qRL<?>> LIZ = new LinkedHashMap();

    public final <T> T LIZ(Class<T> cls) {
        T t;
        InterfaceC1550090qRL interfaceC1550090qRL = (InterfaceC1550090qRL) ((LinkedHashMap) this.LIZ).get(cls);
        if (interfaceC1550090qRL == null || (t = (T) interfaceC1550090qRL.LIZ()) == null || !cls.isAssignableFrom(t.getClass())) {
            return null;
        }
        return t;
    }
}
