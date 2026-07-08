package X;

import java.lang.reflect.Constructor;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0k5p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1306110k5p {
    public static final ConcurrentHashMap<Class<?>, Function0<InterfaceC207249167z<?>>> LIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<Class<?>, Constructor<?>> LIZIZ = new ConcurrentHashMap<>();

    public static void LIZ(Class cls, Function0 function0) {
        LIZ.put(cls, function0);
    }
}
