package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0Vq6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C810040Vq6 {
    public static final ConcurrentHashMap<Class, Object> LIZ = new ConcurrentHashMap<>();

    public static <T> T LIZ(Class<T> cls, InterfaceC810100VqC interfaceC810100VqC) {
        T t;
        ConcurrentHashMap<Class, Object> concurrentHashMap = LIZ;
        T t2 = (T) concurrentHashMap.get(cls);
        if (t2 == null) {
            synchronized (C810040Vq6.class) {
                try {
                    t = (T) concurrentHashMap.get(cls);
                    if (t == null && (t = (T) interfaceC810100VqC.create(cls)) != null) {
                        concurrentHashMap.put(cls, t);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return t;
        }
        return t2;
    }
}
