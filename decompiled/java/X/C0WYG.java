package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.framework.services.ServiceProvider;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0WYG, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WYG {
    public static final ConcurrentHashMap<Class<?>, Object> LIZ = new ConcurrentHashMap<>();

    public static final <T> T LIZ(Class<T> cls, String str) {
        Object objPutIfAbsent;
        T t = (T) PluggableExtentionKt.pluggableSpiForReal(cls);
        if (t != null) {
            return t;
        }
        ConcurrentHashMap<Class<?>, Object> concurrentHashMap = LIZ;
        Object obj = concurrentHashMap.get(cls);
        if (obj == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(cls, (obj = new Object()))) != null) {
            obj = objPutIfAbsent;
        }
        synchronized (obj) {
            try {
                T t2 = (T) PluggableExtentionKt.pluggableSpiForReal(cls);
                if (t2 != null) {
                    return t2;
                }
                return (T) LIZIZ(cls, str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static final <T> T LIZIZ(Class<T> cls, final String str) {
        Object c098200Yq;
        try {
            ServiceManager.get().bind(cls, new ServiceProvider() { // from class: X.0WYH
                @Override // com.ss.android.ugc.aweme.framework.services.ServiceProvider
                public final T get() {
                    Object objNewInstance;
                    String str2 = str;
                    try {
                        objNewInstance = Class.forName(str2).newInstance();
                        if (objNewInstance == null) {
                            objNewInstance = (T) null;
                        }
                        C189200o6.m2constructorimpl(objNewInstance);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        objNewInstance = (T) new C098200Yq(th);
                        C189200o6.m2constructorimpl(objNewInstance);
                    }
                    Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(objNewInstance);
                    if (thM5exceptionOrNullimpl != null) {
                        C554740LpI c554740LpI = C554740LpI.LIZIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("instantiate failed: ");
                        sbLIZ.append(str2);
                        C201955140j.LJIIIZ(c554740LpI, "DynamicFeatureSpi", C2188811AlT.LIZIZ(sbLIZ), thM5exceptionOrNullimpl);
                    }
                    if (C189200o6.m7isFailureimpl(objNewInstance)) {
                        return null;
                    }
                    return (T) objNewInstance;
                }
            }).asSingleton();
            c098200Yq = (T) PluggableExtentionKt.pluggableSpiForReal(cls);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C554740LpI c554740LpI = C554740LpI.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("bind failed: ");
            sbLIZ.append(cls.getName());
            sbLIZ.append(", impl=");
            sbLIZ.append(str);
            C201955140j.LJIIIZ(c554740LpI, "DynamicFeatureSpi", C2188811AlT.LIZIZ(sbLIZ), thM5exceptionOrNullimpl);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = (T) null;
        }
        if (c098200Yq == null) {
            C554740LpI c554740LpI2 = C554740LpI.LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("resolve null: ");
            sbLIZ2.append(cls.getName());
            sbLIZ2.append(", impl=");
            sbLIZ2.append(str);
            C201955140j.LJIILL(c554740LpI2, "DynamicFeatureSpi", C2188811AlT.LIZIZ(sbLIZ2));
            return (T) c098200Yq;
        }
        C554740LpI c554740LpI3 = C554740LpI.LIZIZ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("resolve success: ");
        sbLIZ3.append(cls.getName());
        sbLIZ3.append(" -> ");
        sbLIZ3.append(c098200Yq.getClass().getName());
        C201955140j.LIZLLL(c554740LpI3, "DynamicFeatureSpi", C2188811AlT.LIZIZ(sbLIZ3));
        return (T) c098200Yq;
    }
}
