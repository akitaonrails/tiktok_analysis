package X;

import Y.AfS0S2300100_7;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0JCK, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JCK {
    public static C19479111Iv LIZ(final C11NZ c11nz, final EnumC499440JiI enumC499440JiI, final String str, String str2, Map map, int i) {
        final Map mapLJ = map;
        final String str3 = str2;
        if ((i & 4) != 0) {
            str3 = "";
        }
        if ((i & 8) != 0) {
            mapLJ = C2097608Jq.LJ();
        }
        return C11NZ.LJJ(new Callable() { // from class: X.0K6C
            @Override // java.util.concurrent.Callable
            public final Object call() throws JSONException {
                C1C7U.LIZ("PgcMonitorAdaptersKt@8c2c.monitorMetricsForApiObservable$1");
                final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                EnumC499440JiI enumC499440JiI2 = enumC499440JiI;
                String str4 = str;
                String str5 = str3;
                Map<String, String> map2 = mapLJ;
                C0K6D.LIZ.getClass();
                Map mapLJIILIIL = C2097608Jq.LJIILIIL(C0K6D.LIZIZ(enumC499440JiI2, str4, str5, map2), new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "start"));
                C0K6F c0k6fLIZ = C0K6L.LIZ("pgc_subscription_api_request");
                Map<String, String> map3 = c0k6fLIZ.LIZLLL;
                "1".toString();
                map3.put("is_from_pgc_subscription", "1");
                C0K66.LIZJ(c0k6fLIZ);
                for (Map.Entry entry : mapLJIILIIL.entrySet()) {
                    C0K66.LIZ(c0k6fLIZ, (String) entry.getKey(), entry.getValue());
                }
                c0k6fLIZ.LIZLLL(C0K6G.EVENT_TYPE_TEA_AND_LIVE_SDK_SLARDAR_LOG);
                C11JN c11jnLJJIJIIJIL = c11nz.LJJIJIIJIL(new AfS0S2300100_7(atomicBoolean, jElapsedRealtime, enumC499440JiI, str, str3, mapLJ, 0));
                final EnumC499440JiI enumC499440JiI3 = enumC499440JiI;
                final String str6 = str;
                final String str7 = str3;
                final Map<String, String> map4 = mapLJ;
                C11JN c11jnLJJIJIIJI = c11jnLJJIJIIJIL.LJJIIJZLJL(new InterfaceC781210Ukh() { // from class: X.0Jlo
                    @Override // X.InterfaceC781210Ukh
                    public final void run() throws JSONException {
                        if (atomicBoolean.compareAndSet(false, true)) {
                            C0K6D.LIZ(enumC499440JiI3, str6, SystemClock.elapsedRealtime() - jElapsedRealtime, str7, map4, true);
                        }
                    }
                }).LJJIJIIJI(new AfS0S2300100_7(atomicBoolean, jElapsedRealtime, enumC499440JiI, str, str3, mapLJ, 1));
                C1C7U.LIZIZ("PgcMonitorAdaptersKt@8c2c.monitorMetricsForApiObservable$1");
                return c11jnLJJIJIIJI;
            }
        });
    }
}
