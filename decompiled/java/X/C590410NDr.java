package X;

import Y.ARunnableS28S0110000_9;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.util.IFeedCacheLoaderService;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0NDr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C590410NDr {
    public static final C590410NDr LIZ = new C590410NDr();
    public static boolean LIZIZ;
    public static volatile int LIZJ;
    public static volatile int LIZLLL;
    public static volatile boolean LJ;
    public static volatile long LJFF;
    public static boolean LJI;

    public static String LIZ(String str) {
        JSONObject jSONObject;
        if (!((Boolean) C1ENV.LJIIIZ.getValue()).booleanValue()) {
            return str;
        }
        try {
            if (C123100dR.LIZ(str)) {
                jSONObject = new JSONObject(str);
            } else {
                jSONObject = new JSONObject();
            }
            long jLongValue = ((Number) C1ENV.LJI.getValue()).longValue();
            C01GW c01gw = C1ENV.LJII;
            if (((Number) c01gw.getValue()).intValue() > 0) {
                jLongValue -= (long) (C590440NDu.LJIIIIZZ(C590440NDu.LJIIIIZZ) * ((Number) c01gw.getValue()).intValue());
            }
            jSONObject.put("client_cold_cache_duration_limit", jLongValue);
            return C786410Ut5.J3(jSONObject);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return str;
        }
    }

    public static void LIZIZ(boolean z) {
        if (((Boolean) C2281291ERb.LJIIIIZZ.getValue()).booleanValue()) {
            IFeedCacheLoaderService iFeedCacheLoaderService = (IFeedCacheLoaderService) ServiceManager.get().getService(IFeedCacheLoaderService.class);
            C786410Ut5.LJLIIL(((Number) C2281291ERb.LJII.getValue()).longValue(), C799570VYd.LIZIZ(), new ARunnableS28S0110000_9(iFeedCacheLoaderService, z, 4));
        }
    }
}
