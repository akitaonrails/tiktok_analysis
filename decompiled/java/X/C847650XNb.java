package X;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0XNb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C847650XNb {
    public static final Map<Class, InterfaceC847830XNt> LIZ = new ConcurrentHashMap();

    public static <T extends InterfaceC847830XNt> T LIZ(Class<T> cls) {
        return (T) ((ConcurrentHashMap) LIZ).get(cls);
    }
}
