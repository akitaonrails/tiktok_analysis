package X;

import com.bytedance.android.starship.engine.graph.config.GlobalTraceConfig;
import com.bytedance.android.starship.engine.graph.config.GraphConfig;
import com.bytedance.android.starship.engine.graph.config.SamplingConfig;
import com.bytedance.android.starship.strategy.repository.ContainerInput;
import com.bytedance.android.starship.strategy.repository.Extra;
import com.bytedance.android.starship.strategy.repository.GraphList;
import com.bytedance.android.starship.strategy.repository.RequestData;
import com.bytedance.android.starship.strategy.repository.StrategiesData;
import com.bytedance.android.starship.strategy.repository.StrategyApi;
import com.bytedance.android.starship.strategy.repository.StrategyModel;
import com.bytedance.keva.Keva;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0k6a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1306580k6a {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C1306700k6m());
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C1306640k6g());
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C1306630k6f());
    public static final C01GW LIZLLL = C452501pT.LIZIZ(new C1306650k6h());
    public static Function2<? super RequestData, ? super StrategiesData, Unit> LJ;

    public static Keva LIZJ() {
        return (Keva) LIZ.getValue();
    }

    public static void LIZ(Throwable th) {
        Exception exc;
        if (((Boolean) C1309360kB4.LIZLLL.getValue()).booleanValue()) {
            Set<String> allKey = LIZJ().getAllKey();
            ArrayList arrayList = new ArrayList();
            for (Object obj : allKey) {
                if (u.LJJIIJZLJL((String) obj, "strategy_entry", false)) {
                    arrayList.add(obj);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                LIZJ().erase((String) it2.next());
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dataError:");
        sbLIZ.append(th.getMessage());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (th instanceof Exception) {
            exc = (Exception) th;
        } else {
            exc = null;
        }
        C1306430k6L.LIZIZ(strLIZIZ, exc);
    }

    public static String LIZLLL(EnumC1306820k6y enumC1306820k6y) {
        if (enumC1306820k6y == EnumC1306820k6y.COLD_START) {
            return "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('_');
        sbLIZ.append(enumC1306820k6y.getValue());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static StrategiesData LJ(EnumC1306820k6y enumC1306820k6y, boolean z) {
        if (z) {
            ((ConcurrentHashMap) LIZJ.getValue()).put(enumC1306820k6y.getValue(), Boolean.TRUE);
        }
        C01GW c01gw = LIZIZ;
        if (((ConcurrentHashMap) c01gw.getValue()).get(enumC1306820k6y.getValue()) != null) {
            return (StrategiesData) ((ConcurrentHashMap) c01gw.getValue()).get(enumC1306820k6y.getValue());
        }
        try {
            Keva kevaLIZJ = LIZJ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("strategy_entry");
            sbLIZ.append(LIZLLL(enumC1306820k6y));
            String string = kevaLIZJ.getString(C2188811AlT.LIZIZ(sbLIZ), null);
            if (string != null) {
                StrategiesData strategiesData = (StrategiesData) C1306320k6A.LIZ.LJII(string, StrategiesData.class);
                if (strategiesData != null) {
                    ((ConcurrentHashMap) LIZIZ.getValue()).put(enumC1306820k6y.getValue(), strategiesData);
                    if (enumC1306820k6y == EnumC1306820k6y.COLD_START) {
                        C1306520k6U.LJ(C0NOR.LIZLLL(), "starship_strategy_init_trace", new C0NOT("starship_strategy_init_trace", new C1306500k6S(strategiesData)));
                    }
                    return strategiesData;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LIZJ().erase("strategy_entry");
        }
        return null;
    }

    public static void LIZIZ(String str, Map map, Map map2) {
        map.remove(str);
        Iterator it2 = ((LinkedHashMap) map2).entrySet().iterator();
        while (it2.hasNext()) {
            Map<String, GraphConfig> map3 = ((GraphList) ((Map.Entry) it2.next()).getValue()).graphs;
            if (map3 != null) {
                map3.remove(str);
            }
        }
    }

    public static void LJFF(final EnumC1306820k6y enumC1306820k6y, final Map map, final Function2 function2, final Function2 function22) {
        SamplingConfig samplingConfig;
        final InterfaceC1307160k7W interfaceC1307160k7WLLIIIZ;
        String str;
        String strLIZIZ;
        Map<String, GraphList> map2;
        GraphList graphList;
        Map<String, GraphConfig> map3;
        Set<String> setKeySet;
        StrategyModel strategyModel;
        String str2;
        GlobalTraceConfig globalTraceConfig;
        StrategyApi strategyApi = (StrategyApi) C1306670k6j.LIZ.getValue();
        if (strategyApi == null) {
            return;
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        StrategiesData strategiesDataLJ = LJ(enumC1306820k6y, false);
        Long l = null;
        if (strategiesDataLJ != null && (globalTraceConfig = strategiesDataLJ.globalTraceConfig) != null) {
            samplingConfig = globalTraceConfig.strategyUpdateTraceSampling;
        } else {
            samplingConfig = null;
        }
        final C1308190k9B c1308190k9BLIZ = C1306710k6n.LIZ("update_config", samplingConfig, null);
        if (c1308190k9BLIZ != null) {
            c1308190k9BLIZ.LJLL("trace_type", "update_strategy_config");
            interfaceC1307160k7WLLIIIZ = c1308190k9BLIZ.LLIIIZ("fetch_strategy_config");
            interfaceC1307160k7WLLIIIZ.LJJIJIL(Scene.SCENE_SERVICE, enumC1306820k6y.getValue());
            for (Map.Entry entry : map.entrySet()) {
                if (((ContainerInput) entry.getValue()).tags != null && (!r2.isEmpty())) {
                    List<String> list = ((ContainerInput) entry.getValue()).tags;
                    if (list != null && (str2 = (String) C13LP.LJJJLL(list)) != null) {
                        interfaceC1307160k7WLLIIIZ.LJJIJIL("input_tags", str2);
                    }
                    interfaceC1307160k7WLLIIIZ.LJJIJIL("container_name", (String) entry.getKey());
                }
            }
            interfaceC1307160k7WLLIIIZ.LJJIJIL(Scene.SCENE_SERVICE, enumC1306820k6y.getValue());
        } else {
            c1308190k9BLIZ = null;
            interfaceC1307160k7WLLIIIZ = null;
        }
        StrategiesData strategiesDataLJ2 = LJ(enumC1306820k6y, false);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : map.keySet()) {
            if (strategiesDataLJ2 != null && (map2 = strategiesDataLJ2.containers) != null && (graphList = map2.get(obj)) != null && (map3 = graphList.graphs) != null && (setKeySet = map3.keySet()) != null) {
                for (Object obj2 : setKeySet) {
                    Map<String, StrategyModel> map4 = strategiesDataLJ2.strategies;
                    if (map4 != null && (strategyModel = map4.get(obj2)) != null) {
                        String str3 = strategyModel.version;
                        if (str3 == null) {
                            str3 = "";
                        }
                        linkedHashMap.put(obj2, str3);
                    }
                }
            }
        }
        String value = enumC1306820k6y.getValue();
        if (strategiesDataLJ2 != null) {
            l = strategiesDataLJ2.timestamp;
            str = strategiesDataLJ2.serverVersion;
        } else {
            str = null;
        }
        final RequestData requestData = new RequestData(value, linkedHashMap, l, str, "2.9.0", map);
        if (interfaceC1307160k7WLLIIIZ == null) {
            strLIZIZ = null;
        } else {
            String traceId = interfaceC1307160k7WLLIIIZ.getTraceId();
            String strLJIJI = interfaceC1307160k7WLLIIIZ.LJIJI();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("00");
            sbLIZ.append('-');
            sbLIZ.append(traceId);
            sbLIZ.append('-');
            sbLIZ.append(strLJIJI);
            sbLIZ.append('-');
            sbLIZ.append("03");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        strategyApi.fetchStrategies(requestData, strLIZIZ).LJL(C11S5.LIZ()).LJJLIIIJL(1L, new InterfaceC19483011Ki() { // from class: X.0k6e
            @Override // X.InterfaceC19483011Ki
            public final boolean test(Object obj3) {
                return true;
            }
        }).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0k6b
            /* JADX WARN: Can't wrap try/catch for region: R(14:202|41|(12:43|(0)(1:49)|50|(1:52)(6:60|186|61|62|(3:66|(4:69|(4:208|71|(2:74|72)|211)(1:210)|209|67)|207)|75)|53|190|54|55|192|56|59|206)(1:76)|77|50|(0)(0)|53|190|54|55|192|56|59|206) */
            /* JADX WARN: Code restructure failed: missing block: B:57:0x0141, code lost:
            
                r0 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:58:0x0142, code lost:
            
                com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
             */
            /* JADX WARN: Removed duplicated region for block: B:52:0x00ea  */
            /* JADX WARN: Removed duplicated region for block: B:60:0x0150  */
            @Override // X.InterfaceC1487280oo2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object apply(java.lang.Object r20) {
                /*
                    Method dump skipped, instruction units count: 1035
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1306590k6b.apply(java.lang.Object):java.lang.Object");
            }
        }).LJJLL(new C09JN() { // from class: X.0k6O
            @Override // X.C09JN
            public final void accept(Object obj3) {
                String str4;
                InterfaceC1307160k7W interfaceC1307160k7W;
                C1C7U.LIZ("StrategyRepository@93be.request$disposable$3");
                Pair pair = (Pair) obj3;
                Extra extra = ((StrategiesData) pair.getSecond()).extra;
                if (extra != null && (str4 = extra.logid) != null && (interfaceC1307160k7W = interfaceC1307160k7WLLIIIZ) != null) {
                    interfaceC1307160k7W.LJJIJIL("logid", str4);
                }
                InterfaceC1307160k7W interfaceC1307160k7W2 = interfaceC1307160k7WLLIIIZ;
                if (interfaceC1307160k7W2 != null) {
                    interfaceC1307160k7W2.close();
                }
                function2.invoke((StrategiesData) pair.getFirst(), (StrategiesData) pair.getSecond());
                C0NOR.LIZ("starship_strategy_init_trace", "init_trace_span_fetch", new C1306450k6N(jCurrentTimeMillis, pair));
                C1C7U.LIZIZ("StrategyRepository@93be.request$disposable$3");
            }
        }, new C09JN() { // from class: X.0k6P
            @Override // X.C09JN
            public final void accept(Object obj3) {
                C1C7U.LIZ("StrategyRepository@93be.request$disposable$4");
                Throwable th = (Throwable) obj3;
                Function2<String, Integer, Unit> function23 = function22;
                String str4 = "";
                if (function23 != null) {
                    String message = th.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    function23.invoke(message, Integer.valueOf(C1306520k6U.LIZLLL(th)));
                }
                C0NOR.LIZ("starship_strategy_init_trace", "init_trace_span_fetch", new AwS588S0100000_9(th, 434));
                InterfaceC1307160k7W interfaceC1307160k7W = interfaceC1307160k7WLLIIIZ;
                if (interfaceC1307160k7W != null) {
                    String message2 = th.getMessage();
                    if (message2 != null) {
                        str4 = message2;
                    }
                    interfaceC1307160k7W.LJJIJIL("error_msg", str4);
                    interfaceC1307160k7W.LJJLIIIJLLLLLLLZ(Integer.valueOf(C1306520k6U.LIZLLL(th)), "error_code");
                    interfaceC1307160k7W.close();
                }
                InterfaceC1307160k7W interfaceC1307160k7W2 = c1308190k9BLIZ;
                if (interfaceC1307160k7W2 != null) {
                    interfaceC1307160k7W2.close();
                }
                InterfaceC1307160k7W interfaceC1307160k7W3 = c1308190k9BLIZ;
                if (interfaceC1307160k7W3 != null) {
                    interfaceC1307160k7W3.release();
                }
                C1C7U.LIZIZ("StrategyRepository@93be.request$disposable$4");
            }
        });
    }

    public static void LJI(EnumC1306820k6y enumC1306820k6y, Map map, Function2 function2, Function2 function22) {
        if (((Boolean) C1309360kB4.LJ.getValue()).booleanValue()) {
            return;
        }
        if (((Boolean) C1309360kB4.LJFF.getValue()).booleanValue() && Intrinsics.LJFF(((ConcurrentHashMap) LIZLLL.getValue()).get(enumC1306820k6y.getValue()), Boolean.TRUE)) {
            return;
        }
        ((ConcurrentHashMap) LIZLLL.getValue()).put(enumC1306820k6y.getValue(), Boolean.TRUE);
        LJFF(enumC1306820k6y, map, function2, function22);
    }
}
