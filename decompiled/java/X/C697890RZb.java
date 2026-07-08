package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.IFeedDebugService;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0RZb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C697890RZb {
    public static final C697890RZb LIZ = new C697890RZb();
    public static final Object LIZIZ = new Object();

    public static final C697900RZc LIZ(String str) {
        C697900RZc c697900RZc;
        if (str != null && str.length() != 0) {
            synchronized (LIZIZ) {
                try {
                    c697900RZc = (C697900RZc) ((Map) C697710RYj.LIZ.getValue()).get(str);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return c697900RZc;
        }
        return null;
    }

    public static final void LIZIZ(String str, String str2, EnumC699110RbZ enumC699110RbZ, C0RZ2 c0rz2) {
        if (C0B83.LIZ() && str != null && str.length() != 0 && str2 != null && str2.length() != 0) {
            synchronized (LIZIZ) {
                try {
                    enumC699110RbZ.getDesc();
                    C01GW c01gw = C697710RYj.LIZ;
                    C697900RZc c697900RZc = (C697900RZc) ((Map) c01gw.getValue()).get(str);
                    if (c697900RZc == null) {
                        c697900RZc = new C697900RZc(new ConcurrentHashMap());
                    }
                    ConcurrentHashMap<String, CopyOnWriteArrayList<C697910RZd>> concurrentHashMap = c697900RZc.LIZ;
                    C697910RZd c697910RZd = new C697910RZd(enumC699110RbZ, c0rz2);
                    CopyOnWriteArrayList<C697910RZd> copyOnWriteArrayList = concurrentHashMap.get(str2);
                    if (copyOnWriteArrayList == null) {
                        copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                        concurrentHashMap.put(str2, copyOnWriteArrayList);
                    }
                    copyOnWriteArrayList.add(c697910RZd);
                    ((Map) c01gw.getValue()).put(str, c697900RZc);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            IFeedDebugService iFeedDebugService = (IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class, false, false);
            if (iFeedDebugService != null) {
                new C697920RZe(iFeedDebugService, str, str2);
                iFeedDebugService.LJIIJ();
            }
        }
    }
}
