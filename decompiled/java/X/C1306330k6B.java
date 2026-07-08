package X;

import com.bytedance.android.starship.engine.graph.config.GraphCommonConfig;
import com.bytedance.android.starship.engine.graph.config.GraphConfig;
import com.bytedance.android.starship.engine.graph.config.NodeConfig;
import com.bytedance.android.starship.strategy.repository.GraphList;
import com.bytedance.android.starship.strategy.repository.StrategiesData;
import com.bytedance.android.starship.strategy.repository.StrategyModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS564S0100000_20;

/* JADX INFO: renamed from: X.0k6B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1306330k6B extends C09AY implements Function2<Map<String, StrategyModel>, Map<String, NodeConfig>, Unit> {
    public final /* synthetic */ Map.Entry<String, GraphList> LL;
    public final /* synthetic */ Map<String, GraphConfig> LLILLJJLI;
    public final /* synthetic */ StrategiesData LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1306330k6B(Map.Entry<String, GraphList> entry, Map<String, GraphConfig> map, StrategiesData strategiesData) {
        super(2);
        this.LL = entry;
        this.LLILLJJLI = map;
        this.LLILLL = strategiesData;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Map<String, StrategyModel> map, Map<String, NodeConfig> map2) {
        InterfaceC1307160k7W interfaceC1307160k7WLLIIIZ;
        GraphConfig graphConfig;
        GraphCommonConfig graphCommonConfig;
        GraphCommonConfig graphCommonConfig2;
        Map<String, StrategyModel> map3 = map;
        Map<String, NodeConfig> map4 = map2;
        if ((!map3.isEmpty()) && (!map4.isEmpty())) {
            if (C1306480k6Q.LIZIZ().containsKey(this.LL.getKey())) {
                C1306250k63 c1306250k63 = (C1306250k63) C1306480k6Q.LIZIZ().get(this.LL.getKey());
                if (c1306250k63 != null) {
                    Map<String, GraphConfig> map5 = this.LLILLJJLI;
                    InterfaceC1307160k7W interfaceC1307160k7W = this.LLILLL.tracer;
                    if (c1306250k63.LJI) {
                        Throwable th = null;
                        if (interfaceC1307160k7W != null) {
                            interfaceC1307160k7WLLIIIZ = interfaceC1307160k7W.LLIIIZ("diff");
                            if (interfaceC1307160k7WLLIIIZ != null) {
                                interfaceC1307160k7WLLIIIZ.LJJIJIL("container_name", c1306250k63.LIZIZ);
                            }
                        } else {
                            interfaceC1307160k7WLLIIIZ = null;
                        }
                        ArrayList arrayList = new ArrayList();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (Map.Entry<String, StrategyModel> entry : map3.entrySet()) {
                            GraphConfig graphConfig2 = c1306250k63.LJIILIIL().get(entry.getKey());
                            C054G c054g = C1306520k6U.LIZ;
                            if ((graphConfig2 != null && (graphCommonConfig2 = graphConfig2.config) != null && graphCommonConfig2.reloadType == 1) || ((graphConfig = map5.get(entry.getKey())) != null && (graphCommonConfig = graphConfig.config) != null && graphCommonConfig.reloadType == 1)) {
                                int i = entry.getValue().status;
                                if (i != 1 && i != 2) {
                                    if (i != 4) {
                                        new AwS564S0100000_20(entry, (Map.Entry<String, StrategyModel>) 1);
                                        C1307940k8m.LIZIZ().isDebug();
                                    } else {
                                        new AwS564S0100000_20(entry, (Map.Entry<String, StrategyModel>) 0);
                                        C1307940k8m.LIZIZ().isDebug();
                                        arrayList.add(entry.getKey());
                                        c1306250k63.LJIILIIL().remove(entry.getKey());
                                        c1306250k63.LJIILJJIL().remove(entry.getKey());
                                    }
                                } else {
                                    if (entry.getValue().status == 2) {
                                        arrayList.add(entry.getKey());
                                    }
                                    List<String> list = entry.getValue().nodes;
                                    if (list != null) {
                                        for (String str : list) {
                                            C1306520k6U.LJFF(linkedHashMap, str, map4.get(str));
                                        }
                                    }
                                    C1306520k6U.LJFF(linkedHashMap2, entry.getKey(), map5.get(entry.getKey()));
                                    C1306520k6U.LJFF(c1306250k63.LJIILIIL(), entry.getKey(), map5.get(entry.getKey()));
                                    C1306520k6U.LJFF(c1306250k63.LJIILJJIL(), entry.getKey(), map3.get(entry.getKey()));
                                }
                            }
                        }
                        ((ConcurrentHashMap) c1306250k63.LIZJ.getValue()).clear();
                        try {
                            c1306250k63.LJIJ(arrayList, linkedHashMap2, linkedHashMap, interfaceC1307160k7WLLIIIZ);
                            C1306420k6K.LIZ(interfaceC1307160k7WLLIIIZ, null);
                        } finally {
                            try {
                                try {
                                } catch (Throwable th2) {
                                    while (true) {
                                    }
                                }
                            } catch (Throwable th3) {
                            }
                        }
                    }
                }
            } else {
                String key = this.LL.getKey();
                C1306340k6C c1306340k6C = new C1306340k6C(this.LL, this.LLILLJJLI, map4, map3, this.LLILLL);
                if (!C1306480k6Q.LIZIZ().contains(key)) {
                    C1306520k6U.LJ(C1306480k6Q.LIZIZ(), key, new C1306350k6D(c1306340k6C));
                }
            }
        }
        return Unit.LIZ;
    }
}
