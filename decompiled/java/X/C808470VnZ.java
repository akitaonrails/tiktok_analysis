package X;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0VnZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C808470VnZ {
    public static final Map<Class, InterfaceC808460VnY> LIZ = new ConcurrentHashMap();

    public static <T extends InterfaceC808460VnY> T LIZ(Class<T> cls) {
        return (T) ((ConcurrentHashMap) LIZ).get(cls);
    }

    public static <T extends InterfaceC808460VnY> void LIZIZ(Class<T> cls, InterfaceC808460VnY interfaceC808460VnY) {
        if (interfaceC808460VnY != null) {
            ((ConcurrentHashMap) LIZ).put(cls, interfaceC808460VnY);
        }
    }
}
