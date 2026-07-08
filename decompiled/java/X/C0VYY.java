package X;

import Y.ARunnableS32S0110000_13;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VYY, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VYY {
    public static void LIZIZ(String str, String str2) {
        Object c098200Yq;
        try {
            ConcurrentHashMap<String, List<C0VZL>> concurrentHashMap = C800370VaV.LJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(str2);
            c098200Yq = (List) concurrentHashMap.remove(C2188811AlT.LIZIZ(sbLIZ));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C0VZK.LIZ(thM5exceptionOrNullimpl, "webview_monitor_removeUrlRecords_error", C2097608Jq.LJIIJ(new Pair("activityName", str)));
        }
    }

    public static void LIZJ(JSONObject jSONObject, boolean z) {
        if (C800370VaV.LIZLLL == null) {
            C2123408To c2123408To = new C2123408To(C0WQX.FIXED);
            c2123408To.LIZJ = 1;
            c2123408To.LIZIZ = "hybrid_security_monitor_navigation";
            C800370VaV.LIZLLL = C823050WQl.LIZ(new C2123508Tp(c2123408To));
        }
        ExecutorService executorService = C800370VaV.LIZLLL;
        if (executorService != null) {
            executorService.execute(new ARunnableS32S0110000_13(jSONObject, z, 14));
        }
    }

    public static void LIZ(String str, String str2, C0VZL c0vzl) {
        Object c098200Yq;
        if (str == null) {
            return;
        }
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(str2);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            ConcurrentHashMap<String, List<C0VZL>> concurrentHashMap = C800370VaV.LJ;
            if (concurrentHashMap.containsKey(strLIZIZ)) {
                List<C0VZL> arrayList = concurrentHashMap.get(strLIZIZ);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                if (arrayList.size() >= 3) {
                    arrayList.remove(0);
                }
                arrayList.add(c0vzl);
                concurrentHashMap.put(strLIZIZ, arrayList);
            } else {
                concurrentHashMap.put(strLIZIZ, C1697810uHb.LJIILJJIL(c0vzl));
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C0VZK.LIZ(thM5exceptionOrNullimpl, "webview_monitor_onHybridPageStart_error", C2097608Jq.LJIIJ(new Pair("activityName", str)));
        }
    }
}
