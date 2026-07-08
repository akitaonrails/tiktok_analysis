package X;

import com.bytedance.lynx.hybrid.autoservice.IHybridInnerAutoService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0N2q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C587540N2q {
    public static final C587540N2q LIZ = new C587540N2q();
    public static final List<Class<? extends IHybridInnerAutoService>> LIZIZ = new ArrayList();
    public static final ConcurrentHashMap<Class<?>, IHybridInnerAutoService> LIZJ = new ConcurrentHashMap<>();
    public static boolean LIZLLL;

    public static IHybridInnerAutoService LIZ(Class cls) {
        ConcurrentHashMap<Class<?>, IHybridInnerAutoService> concurrentHashMap;
        IHybridInnerAutoService iHybridInnerAutoService;
        try {
            concurrentHashMap = LIZJ;
            iHybridInnerAutoService = concurrentHashMap.get(cls);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (iHybridInnerAutoService != null) {
            return iHybridInnerAutoService;
        }
        IHybridInnerAutoService iHybridInnerAutoService2 = (IHybridInnerAutoService) PluggableExtentionKt.pluggableSpi$default(cls, false, false, false, 14, null);
        if (iHybridInnerAutoService2 != null) {
            concurrentHashMap.put(cls, iHybridInnerAutoService2);
            return iHybridInnerAutoService2;
        }
        if (!LIZLLL || ((ArrayList) LIZIZ).contains(cls)) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ServiceLoaderManager not found for clazz=");
        sbLIZ.append(cls);
        sbLIZ.append(' ');
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (LIZLLL) {
            throw new Exception(strLIZIZ);
        }
        return null;
    }
}
