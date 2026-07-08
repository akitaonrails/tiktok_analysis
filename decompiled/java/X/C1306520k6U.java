package X;

import Y.ARunnableS17S1100000_12;
import com.bytedance.android.starship.engine.graph.config.GraphConfig;
import com.bytedance.android.starship.engine.graph.config.NodeConfig;
import com.bytedance.android.starship.strategy.repository.GraphList;
import com.bytedance.android.starship.strategy.repository.StrategiesData;
import com.bytedance.android.starship.strategy.repository.StrategyModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS199S0000000_12;

/* JADX INFO: renamed from: X.0k6U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1306520k6U {
    public static final C054G LIZ = C2296808zG.LIZ(C0PEM.LIZJ);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(555));
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C1306530k6V());
    public static final C01GW LIZLLL = C452501pT.LIZIZ(new C1306410k6J());
    public static final C01GW LJ = C452501pT.LIZIZ(new C1306540k6W());
    public static final C01GW LJFF;

    static {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new C1306550k6X());
        LJFF = c01gwLIZIZ;
        ((Boolean) c01gwLIZIZ.getValue()).booleanValue();
    }

    public static final ExecutorService LIZIZ() {
        return (ExecutorService) LIZIZ.getValue();
    }

    public static final void LIZJ() {
        ((Boolean) LIZJ.getValue()).booleanValue();
    }

    public static final int LIZLLL(Throwable th) {
        int iIntValue;
        Integer numLIZJ = C1307940k8m.LIZ.getNetworkService().LIZJ(th);
        if (numLIZJ == null || (iIntValue = numLIZJ.intValue()) == 0) {
            return -1;
        }
        return iIntValue;
    }

    public static final void LJI(String str, Function0 function0) {
        try {
            LIZIZ().execute(new ARunnableS17S1100000_12(function0, str, 24));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("safeSubmit>>>tag:");
            sbLIZ.append(str);
            sbLIZ.append(" error:");
            sbLIZ.append(e.getMessage());
            C1306430k6L.LIZIZ(C2188811AlT.LIZIZ(sbLIZ), e);
        }
    }

    public static final void LIZ(StrategiesData strategiesData, String str, C1306330k6B c1306330k6B) {
        GraphList graphList;
        Map<String, GraphConfig> map;
        StrategyModel strategyModel;
        NodeConfig nodeConfig;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Map<String, GraphList> map2 = strategiesData.containers;
        if (map2 != null && (graphList = map2.get(str)) != null && (map = graphList.graphs) != null) {
            for (Map.Entry<String, GraphConfig> entry : map.entrySet()) {
                String key = entry.getKey();
                Map<String, StrategyModel> map3 = strategiesData.strategies;
                if (map3 != null) {
                    strategyModel = map3.get(entry.getKey());
                } else {
                    strategyModel = null;
                }
                LJFF(linkedHashMap, key, strategyModel);
                List list = entry.getValue().nodes;
                if (list == null) {
                    list = C13BV.INSTANCE;
                }
                for (Object obj : list) {
                    Map<String, NodeConfig> map4 = strategiesData.nodes;
                    if (map4 != null) {
                        nodeConfig = map4.get(obj);
                    } else {
                        nodeConfig = null;
                    }
                    LJFF(linkedHashMap2, obj, nodeConfig);
                }
            }
        }
        c1306330k6B.invoke(linkedHashMap, linkedHashMap2);
    }

    public static final <K, V> void LJ(Map<K, V> map, K k, Function1<? super V, ? extends V> function1) {
        V v = map.get(k);
        if (v == null) {
            map.put(k, function1.invoke(null));
        } else {
            function1.invoke(v);
        }
    }

    public static final <K, V> void LJFF(Map<K, V> map, K k, V v) {
        if (k != null && v != null) {
            map.put(k, v);
        }
    }
}
