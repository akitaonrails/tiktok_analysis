package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.animax.service.IAnimaXService;
import com.lynx.animax.service.IAutoRegisterAnimaXService;
import com.lynx.animax.util.AnimaXLog;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0jYy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1285740jYy {
    public static volatile C1285740jYy LIZIZ;
    public static final String[] LIZJ = {"com.lynx.animax.service.AnimaXFrescoImageService", "com.lynx.animax.monitor.common.AnimaXCommonMonitorService"};
    public final Map<C1285680jYs, Map<Class<? extends IAnimaXService>, IAnimaXService>> LIZ;

    public static C1285740jYy LIZ() {
        if (LIZIZ == null) {
            synchronized (C1285740jYy.class) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = new C1285740jYy();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZIZ;
    }

    public C1285740jYy() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.LIZ = concurrentHashMap;
        concurrentHashMap.put(C1285680jYs.LIZIZ, new ConcurrentHashMap());
        for (String str : LIZJ) {
            try {
                Class<?> cls = Class.forName(str);
                if (IAutoRegisterAnimaXService.class.isAssignableFrom(cls)) {
                    IAutoRegisterAnimaXService iAutoRegisterAnimaXService = (IAutoRegisterAnimaXService) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    LIZIZ(iAutoRegisterAnimaXService.getAutoRegisterServiceScope(), iAutoRegisterAnimaXService.getServiceClass(), iAutoRegisterAnimaXService);
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Class ");
                    sbLIZ.append(str);
                    sbLIZ.append(" does not implement IAutoRegisterAnimaXService");
                    AnimaXLog.LIZJ("AnimaXServiceCenter", C2188811AlT.LIZIZ(sbLIZ));
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Failed to auto-register service ");
                sbLIZ2.append(str);
                sbLIZ2.append(": ");
                sbLIZ2.append(e.toString());
                AnimaXLog.LIZ("AnimaXServiceCenter", C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
    }

    public final void LIZIZ(C1285680jYs c1285680jYs, Class<? extends IAnimaXService> cls, IAnimaXService iAnimaXService) {
        Map concurrentHashMap = (Map) ((ConcurrentHashMap) this.LIZ).get(c1285680jYs);
        if (concurrentHashMap == null) {
            concurrentHashMap = new ConcurrentHashMap();
            ((ConcurrentHashMap) this.LIZ).put(c1285680jYs, concurrentHashMap);
        }
        boolean zContainsKey = concurrentHashMap.containsKey(cls);
        if (!zContainsKey) {
            concurrentHashMap.put(cls, iAnimaXService);
        }
        AnimaXLog.LIZIZ("AnimaXServiceCenter", C786410Ut5.j4("Register service %s with instance %s in scope %s, result: %s", new Object[]{cls.getSimpleName(), iAnimaXService, c1285680jYs, Boolean.valueOf(!zContainsKey)}));
    }
}
