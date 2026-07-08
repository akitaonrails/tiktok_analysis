package X;

import com.bytedance.news.common.service.manager.IServiceProxy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0V7i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C792600V7i {
    public static final ConcurrentHashMap<Class, Object> LIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<Class, InterfaceC792270V6b<?>> LIZIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<Class, InterfaceC792620V7k> LIZJ = new ConcurrentHashMap<>();

    public static <T> T LIZ(Class<T> cls) {
        T t;
        Object objNewInstance;
        ConcurrentHashMap<Class, Object> concurrentHashMap = LIZ;
        T t2 = (T) concurrentHashMap.get(cls);
        if (t2 == null) {
            synchronized (cls) {
                try {
                    T t3 = (T) concurrentHashMap.get(cls);
                    if (t3 != null) {
                        return t3;
                    }
                    ConcurrentHashMap<Class, InterfaceC792270V6b<?>> concurrentHashMap2 = LIZIZ;
                    InterfaceC792270V6b<?> interfaceC792270V6b = concurrentHashMap2.get(cls);
                    if (interfaceC792270V6b != null) {
                        T t4 = (T) interfaceC792270V6b.create();
                        concurrentHashMap2.remove(cls);
                        if (t4 != null) {
                            concurrentHashMap.put(cls, t4);
                            ConcurrentHashMap<Class, InterfaceC792620V7k> concurrentHashMap3 = LIZJ;
                            InterfaceC792620V7k interfaceC792620V7k = concurrentHashMap3.get(cls);
                            if (interfaceC792620V7k != null) {
                                interfaceC792620V7k.LIZ();
                                concurrentHashMap3.remove(cls);
                            }
                            return t4;
                        }
                    }
                    try {
                        objNewInstance = Class.forName(C786410Ut5.j4("%s__ServiceProxy", new Object[]{cls.getName()})).newInstance();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                    if (objNewInstance instanceof IServiceProxy) {
                        t = (T) ((IServiceProxy) objNewInstance).newInstance();
                    } else {
                        t = null;
                    }
                    if (t == null) {
                        return t;
                    }
                    LIZ.put(cls, t);
                    ConcurrentHashMap<Class, InterfaceC792620V7k> concurrentHashMap4 = LIZJ;
                    InterfaceC792620V7k interfaceC792620V7k2 = concurrentHashMap4.get(cls);
                    if (interfaceC792620V7k2 != null) {
                        interfaceC792620V7k2.LIZ();
                        concurrentHashMap4.remove(cls);
                    }
                    return t;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    throw th2;
                }
            }
        }
        return t2;
    }

    public static <T> void LIZIZ(Class<T> cls, InterfaceC792270V6b<T> interfaceC792270V6b) {
        LIZIZ.put(cls, interfaceC792270V6b);
    }
}
