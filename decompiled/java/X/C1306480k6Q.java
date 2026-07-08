package X;

import com.bytedance.android.starship.engine.graph.config.GlobalTraceConfig;
import com.bytedance.android.starship.engine.graph.config.GraphConfig;
import com.bytedance.android.starship.engine.graph.config.SamplingConfig;
import com.bytedance.android.starship.engine.strategy.IStarShipStrategy;
import com.bytedance.android.starship.strategy.repository.Extra;
import com.bytedance.android.starship.strategy.repository.GraphList;
import com.bytedance.android.starship.strategy.repository.StrategiesData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0k6Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1306480k6Q {
    public static final C1306480k6Q LIZ = new C1306480k6Q();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C1306360k6E());
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C1306490k6R());
    public static volatile boolean LIZLLL;

    public static ConcurrentHashMap LIZIZ() {
        return (ConcurrentHashMap) LIZIZ.getValue();
    }

    public static IStarShipStrategy LIZ(String str) {
        Object obj;
        C1306250k63 c1306250k63;
        C01GW c01gw = LIZJ;
        if (((ConcurrentHashMap) c01gw.getValue()).containsKey(str) && (obj = ((ConcurrentHashMap) c01gw.getValue()).get(str)) != null && (c1306250k63 = (C1306250k63) LIZIZ().get(obj)) != null) {
            return c1306250k63;
        }
        for (Map.Entry entry : LIZIZ().entrySet()) {
            if (((C1306250k63) entry.getValue()).LJIILJJIL().containsKey(str)) {
                ((ConcurrentHashMap) LIZJ.getValue()).put(str, entry.getKey());
                return (IStarShipStrategy) entry.getValue();
            }
        }
        return C1306370k6F.LIZ;
    }

    public static void LIZJ(StrategiesData strategiesData) throws Exception {
        Map<String, GraphList> map;
        SamplingConfig samplingConfig;
        String str;
        GlobalTraceConfig globalTraceConfig;
        if (!LIZLLL && (map = strategiesData.containers) != null && !map.isEmpty()) {
            StrategiesData strategiesDataLJ = C1306580k6a.LJ(EnumC1306820k6y.COLD_START, false);
            if (strategiesDataLJ != null && (globalTraceConfig = strategiesDataLJ.globalTraceConfig) != null) {
                samplingConfig = globalTraceConfig.initializationTraceSampling;
            } else {
                samplingConfig = null;
            }
            C1308190k9B c1308190k9BLIZ = C1306710k6n.LIZ("init_client", samplingConfig, null);
            if (c1308190k9BLIZ != null) {
                c1308190k9BLIZ.LJLL("trace_type", "client_init");
            } else {
                c1308190k9BLIZ = null;
            }
            try {
                strategiesData.setTracer(c1308190k9BLIZ);
                Extra extra = strategiesData.extra;
                if (extra != null && (str = extra.logid) != null && c1308190k9BLIZ != null) {
                    c1308190k9BLIZ.LIZ(str, "logid");
                }
                LIZ.LIZLLL(strategiesData);
                LIZLLL = true;
                if (c1308190k9BLIZ != null) {
                    c1308190k9BLIZ.release();
                }
                C1306420k6K.LIZ(c1308190k9BLIZ, null);
            } catch (Throwable th) {
                th = th;
                try {
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    } catch (Throwable th2) {
                        th = th2;
                        th = null;
                        TryCatchGuardChecker.doCheck(th);
                        C1306420k6K.LIZ(c1308190k9BLIZ, th);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        }
    }

    public final synchronized void LIZLLL(StrategiesData strategiesData) {
        if (strategiesData == null) {
            return;
        }
        ((ConcurrentHashMap) LIZJ.getValue()).clear();
        Map<String, GraphList> map = strategiesData.containers;
        if (map != null) {
            for (Map.Entry<String, GraphList> entry : map.entrySet()) {
                Map<String, GraphConfig> map2 = entry.getValue().graphs;
                if (map2 != null && !map2.isEmpty()) {
                    C1306520k6U.LIZ(strategiesData, entry.getKey(), new C1306330k6B(entry, map2, strategiesData));
                }
            }
        }
    }
}
