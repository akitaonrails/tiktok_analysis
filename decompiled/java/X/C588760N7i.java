package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0N7i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C588760N7i {
    public static final ConcurrentHashMap<String, Object> LIZ = new ConcurrentHashMap<>();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C588790N7l());
    public static final C01GW LIZJ = C452501pT.LIZ(EnumC452301pR.PUBLICATION, new C588780N7k());

    public static final void LIZ(String str, EnumC588770N7j enumC588770N7j, EnumC588750N7h enumC588750N7h) {
        ConcurrentHashMap<String, Object> concurrentHashMap = LIZ;
        concurrentHashMap.put(enumC588770N7j.getReason(), Integer.valueOf(enumC588770N7j.getCode()));
        concurrentHashMap.put(enumC588750N7h.getReason(), Integer.valueOf(enumC588750N7h.getCode()));
        if (str != null) {
            concurrentHashMap.put(EnumC588770N7j.ERROR_REASON.getReason(), str);
        }
        if (!concurrentHashMap.isEmpty()) {
            ((ExecutorService) LIZJ.getValue()).execute(new Runnable() { // from class: X.0Mzc
                public static void LIZ() {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        for (Map.Entry<String, Object> entry : C588760N7i.LIZ.entrySet()) {
                            jSONObject.put(entry.getKey(), entry.getValue());
                        }
                        AbstractC1604130rqV abstractC1604130rqV = (AbstractC1604130rqV) C588760N7i.LIZIZ.getValue();
                        if (abstractC1604130rqV != null) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("fcp result ");
                            sbLIZ.append(jSONObject);
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                            boolean z = AbstractC1604130rqV.LIZLLL;
                            abstractC1604130rqV.LJIIIIZZ(null, "fcp_element_error", strLIZIZ);
                        }
                        C588760N7i.LIZ.clear();
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        AbstractC1604130rqV abstractC1604130rqV2 = (AbstractC1604130rqV) C588760N7i.LIZIZ.getValue();
                        if (abstractC1604130rqV2 != null) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("monitor exception ");
                            sbLIZ2.append(e.getMessage());
                            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                            boolean z2 = AbstractC1604130rqV.LIZLLL;
                            abstractC1604130rqV2.LJIIIIZZ(null, "fcp_element_error", strLIZIZ2);
                        }
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("FCPMonitor@cdd3.monitorEvent$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("FCPMonitor@cdd3.monitorEvent$1");
                }
            });
        }
    }
}
