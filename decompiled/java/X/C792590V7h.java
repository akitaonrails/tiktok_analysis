package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0V7h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C792590V7h {
    public static final ConcurrentHashMap<Class, Object> LIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<Class, InterfaceC792260V6a<?>> LIZIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<Class, InterfaceC792610V7j> LIZJ = new ConcurrentHashMap<>();

    public static <T> T LIZ(Class<T> cls) {
        ConcurrentHashMap<Class, Object> concurrentHashMap = LIZ;
        T t = (T) concurrentHashMap.get(cls);
        if (t == null) {
            synchronized (C792590V7h.class) {
                try {
                    ConcurrentHashMap<Class, InterfaceC792260V6a<?>> concurrentHashMap2 = LIZIZ;
                    InterfaceC792260V6a<?> interfaceC792260V6a = concurrentHashMap2.get(cls);
                    if (interfaceC792260V6a != null) {
                        t = (T) interfaceC792260V6a.create();
                        concurrentHashMap2.remove(cls);
                        if (t != null) {
                            concurrentHashMap.put(cls, t);
                            ConcurrentHashMap<Class, InterfaceC792610V7j> concurrentHashMap3 = LIZJ;
                            InterfaceC792610V7j interfaceC792610V7j = concurrentHashMap3.get(cls);
                            if (interfaceC792610V7j != null) {
                                interfaceC792610V7j.LIZ();
                                concurrentHashMap3.remove(cls);
                            }
                            return t;
                        }
                    }
                    return t;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return t;
    }

    public static <T> void LIZIZ(Class<T> cls, InterfaceC792260V6a<T> interfaceC792260V6a) {
        LIZIZ.put(cls, interfaceC792260V6a);
    }
}
