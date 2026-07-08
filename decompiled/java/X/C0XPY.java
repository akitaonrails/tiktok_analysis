package X;

import android.app.Application;
import com.ss.android.ugc.aweme.IAccountInitializer;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceProvider;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0XPY, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XPY {
    public static final C0XPY LIZ = new C0XPY();
    public static Application LIZIZ;
    public static C0XHA LIZJ;
    public static InterfaceC427710Gpt LIZLLL;
    public static ConcurrentHashMap<Class<?>, ServiceProvider<?>> LJ;
    public static InterfaceC1154304fN LJFF;

    static {
        ((IAccountInitializer) PluggableExtentionKt.pluggableSpi$default(IAccountInitializer.class, false, false, false, 14, null)).LIZ(C1BWL.LIZ());
    }

    public static Application LIZ() {
        Application application = LIZIZ;
        if (application != null) {
            return application;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [T, java.lang.Object] */
    public static final <T> T LIZIZ(Class<T> cls) {
        ConcurrentHashMap<Class<?>, ServiceProvider<?>> concurrentHashMap = LJ;
        ConcurrentHashMap<Class<?>, ServiceProvider<?>> concurrentHashMap2 = null;
        if (concurrentHashMap == null) {
            concurrentHashMap = null;
        }
        if (concurrentHashMap.contains(cls)) {
            ConcurrentHashMap<Class<?>, ServiceProvider<?>> concurrentHashMap3 = LJ;
            if (concurrentHashMap3 != null) {
                concurrentHashMap2 = concurrentHashMap3;
            }
            return (T) concurrentHashMap2.get(cls).get();
        }
        InterfaceC1154304fN interfaceC1154304fN = LJFF;
        if (interfaceC1154304fN == null) {
            interfaceC1154304fN = null;
        }
        ServiceProvider<?> service = interfaceC1154304fN.getService(cls);
        if (service != null) {
            ConcurrentHashMap<Class<?>, ServiceProvider<?>> concurrentHashMap4 = LJ;
            if (concurrentHashMap4 != null) {
                concurrentHashMap2 = concurrentHashMap4;
            }
            concurrentHashMap2.put(cls, service);
            return service.get();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("You are not init and register ");
        sbLIZ.append(cls.getCanonicalName());
        sbLIZ.append(" in AccountSdkInitializer");
        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
