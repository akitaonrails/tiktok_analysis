package X;

import com.bytedance.geckox.GeckoGlobalConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0q6J, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1537050q6J {
    public static final C1537050q6J LIZ = new C1537050q6J();
    public static final Map<String, C1551950qUL> LIZIZ = new ConcurrentHashMap();

    public static C1551950qUL LIZ(String str) {
        Object c098200Yq;
        Object obj = null;
        if (str == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) LIZIZ;
        if (concurrentHashMap.get(str) != null) {
            return (C1551950qUL) concurrentHashMap.get(str);
        }
        try {
            C1551940qUK c1551940qUK = C797990VSb.LIZ;
            c1551940qUK.LIZIZ();
            GeckoGlobalConfig geckoGlobalConfig = c1551940qUK.LIZLLL;
            C1537040q6I c1537040q6I = new C1537040q6I(geckoGlobalConfig.getContext());
            c1537040q6I.LIZJ(geckoGlobalConfig.getAppId());
            c1537040q6I.LJII = geckoGlobalConfig.getAppVersion();
            c1537040q6I.LJIIIIZZ = geckoGlobalConfig.getDeviceId();
            c1537040q6I.LIZ = geckoGlobalConfig.getNetWork();
            c1537040q6I.LJ = geckoGlobalConfig.getStatisticMonitor();
            c1537040q6I.LJIIIZ = geckoGlobalConfig.getHost();
            c1537040q6I.LIZ(str);
            c1537040q6I.LIZIZ(str);
            c098200Yq = C1551950qUL.LIZLLL(new C1551530qTf(c1537040q6I));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (C1551950qUL) obj;
    }
}
