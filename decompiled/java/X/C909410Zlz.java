package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.strategy.IBusinessConfig;
import com.ss.android.ugc.aweme.im.strategy.StrategyConfigData;
import com.ss.android.ugc.aweme.im.strategy.commonresource.LightInteractionCommonResource;
import com.ss.android.ugc.aweme.im.strategy.decisiontree.DecisionTree;
import com.ss.android.ugc.aweme.im.strategy.scene.SceneConfigData;
import com.ss.android.ugc.aweme.im.strategy.scene.StrategyPlatformData;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0Zlz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C909410Zlz {
    public String LIZIZ;
    public StrategyPlatformData LIZLLL;
    public boolean LJ;
    public final C01GW LIZ = C452501pT.LIZIZ(new C909600ZmI());
    public final C01GW LIZJ = C452501pT.LIZIZ(new C909560ZmE());
    public final C01GW LJFF = C452501pT.LIZIZ(new C909590ZmH());

    public final Set<String> LIZJ() {
        List<String> list;
        Set<String> setLLIIJI;
        StrategyPlatformData strategyPlatformData = this.LIZLLL;
        return (strategyPlatformData == null || (list = strategyPlatformData.resourceScenes) == null || (setLLIIJI = C13LP.LLIIJI(list)) == null) ? C08CX.INSTANCE : setLLIIJI;
    }

    public final Map<String, DecisionTree> LJ() {
        Map<String, DecisionTree> map;
        StrategyPlatformData strategyPlatformData = this.LIZLLL;
        return (strategyPlatformData == null || (map = strategyPlatformData.decisionTree) == null) ? C2097608Jq.LJ() : map;
    }

    public static void LIZ(StrategyPlatformData strategyPlatformData) {
        Map<String, IBusinessConfig> map;
        SceneConfigData sceneConfigData;
        SceneConfigData sceneConfigData2;
        Map<EnumC909380Zlw, SceneConfigData> map2 = strategyPlatformData.sceneMap;
        Map<String, IBusinessConfig> map3 = null;
        if (map2 != null && (sceneConfigData2 = map2.get(EnumC909380Zlw.COMMON_LIGHT_INTERACTION)) != null) {
            map = sceneConfigData2.data;
        } else {
            map = null;
        }
        if ((map instanceof Map) && map != null) {
            for (Map.Entry<String, IBusinessConfig> entry : map.entrySet()) {
                ((LightInteractionCommonResource) entry.getValue()).setInteractionName(entry.getKey());
            }
        }
        if (C296650Bjz.LIZ()) {
            Map<EnumC909380Zlw, SceneConfigData> map4 = strategyPlatformData.sceneMap;
            if (map4 != null && (sceneConfigData = map4.get(EnumC909380Zlw.ACTION_BAR_BASE_STATE)) != null) {
                map3 = sceneConfigData.data;
            }
            if ((map3 instanceof Map) && map3 != null) {
                for (Map.Entry<String, IBusinessConfig> entry2 : map3.entrySet()) {
                    entry2.getValue().setConfigName(entry2.getKey());
                }
            }
        }
    }

    public static Map LIZLLL(C909410Zlz c909410Zlz, String str) {
        Map<EnumC909380Zlw, SceneConfigData> map;
        StrategyPlatformData strategyPlatformData = c909410Zlz.LIZLLL;
        c909410Zlz.getClass();
        if (strategyPlatformData != null && (map = strategyPlatformData.sceneMap) != null) {
            EnumC909380Zlw.Companion.getClass();
            SceneConfigData sceneConfigData = map.get(C1495905tN.LIZ(str));
            if (sceneConfigData != null) {
                return sceneConfigData.data;
            }
            return null;
        }
        return null;
    }

    public static void LJFF(StrategyPlatformData strategyPlatformData, StrategyPlatformData strategyPlatformData2) {
        DecisionTree decisionTree;
        Map<String, DecisionTree> map;
        Map<String, IBusinessConfig> map2;
        Map<EnumC909380Zlw, SceneConfigData> map3;
        List<String> list = strategyPlatformData.errScenes;
        if (list != null) {
            for (String str : list) {
                Map<EnumC909380Zlw, SceneConfigData> map4 = strategyPlatformData2.sceneMap;
                if (map4 != null) {
                    EnumC909380Zlw.Companion.getClass();
                    SceneConfigData sceneConfigData = map4.get(C1495905tN.LIZ(str));
                    if (sceneConfigData != null && (map2 = sceneConfigData.data) != null && (map3 = strategyPlatformData.sceneMap) != null) {
                        EnumC909380Zlw.Companion.getClass();
                        map3.put(C1495905tN.LIZ(str), new SceneConfigData(C1495905tN.LIZ(str).getKey(), map2));
                    }
                }
                if (strategyPlatformData.decisionTree == null) {
                    strategyPlatformData.decisionTree = new LinkedHashMap();
                }
                Map<String, DecisionTree> map5 = strategyPlatformData2.decisionTree;
                if (map5 != null && (decisionTree = map5.get(str)) != null && (map = strategyPlatformData.decisionTree) != null) {
                    map.put(str, decisionTree);
                }
            }
        }
    }

    public static void LJI(C909410Zlz c909410Zlz, String str) {
        StrategyPlatformData strategyPlatformDataLIZIZ;
        StrategyConfigData strategyConfigData;
        Keva keva = (Keva) c909410Zlz.LIZ.getValue();
        c909410Zlz.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                System.currentTimeMillis();
                String string = keva.getString(str, "");
                System.currentTimeMillis();
                try {
                    strategyConfigData = (StrategyConfigData) C051M.LIZJ(string, (Type) c909410Zlz.LJFF.getValue());
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (strategyConfigData == null) {
                    strategyPlatformDataLIZIZ = null;
                } else {
                    strategyPlatformDataLIZIZ = C909390Zlx.LIZIZ(strategyConfigData);
                }
                c909410Zlz.LIZLLL = strategyPlatformDataLIZIZ;
                c909410Zlz.LIZIZ = str;
                c909410Zlz.LJ = true;
                C0ZMW.LIZJ("init", C13BV.INSTANCE, false, System.currentTimeMillis() - jCurrentTimeMillis);
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                keva.erase(str);
                c909410Zlz.LIZLLL = null;
                c909410Zlz.LIZIZ = str;
                c909410Zlz.LJ = true;
                C0ZMW.LIZJ("init", C13BV.INSTANCE, true, System.currentTimeMillis() - jCurrentTimeMillis);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C0ZMW.LIZJ("init", C13BV.INSTANCE, false, System.currentTimeMillis() - jCurrentTimeMillis);
            throw th;
        }
    }

    public static void LJIIIIZZ(StrategyPlatformData strategyPlatformData, StrategyPlatformData strategyPlatformData2) {
        Map<EnumC909380Zlw, SceneConfigData> map;
        SceneConfigData sceneConfigData;
        Map<EnumC909380Zlw, SceneConfigData> map2;
        List<String> list;
        Map<String, DecisionTree> map3;
        DecisionTree decisionTree;
        Map<String, DecisionTree> map4;
        for (EnumC909380Zlw enumC909380Zlw : EnumC909380Zlw.values()) {
            Map<EnumC909380Zlw, SceneConfigData> map5 = strategyPlatformData.sceneMap;
            if ((map5 == null || map5.get(enumC909380Zlw) == null) && (map = strategyPlatformData2.sceneMap) != null && (sceneConfigData = map.get(enumC909380Zlw)) != null && (map2 = strategyPlatformData.sceneMap) != null) {
                map2.put(enumC909380Zlw, sceneConfigData);
            }
            if (strategyPlatformData.decisionTree == null) {
                strategyPlatformData.decisionTree = new LinkedHashMap();
            }
            Map<String, DecisionTree> map6 = strategyPlatformData.decisionTree;
            if ((map6 == null || !map6.containsKey(enumC909380Zlw.getKey())) && (((list = strategyPlatformData.resourceScenes) == null || !list.contains(enumC909380Zlw.getKey())) && (map3 = strategyPlatformData2.decisionTree) != null && (decisionTree = map3.get(enumC909380Zlw.getKey())) != null && (map4 = strategyPlatformData.decisionTree) != null)) {
                map4.put(enumC909380Zlw.getKey(), decisionTree);
            }
        }
    }

    public static void LIZIZ(List list, StrategyPlatformData strategyPlatformData, StrategyPlatformData strategyPlatformData2) {
        boolean z;
        Map<String, DecisionTree> map;
        for (String str : (ArrayList) list) {
            List<String> list2 = strategyPlatformData.errScenes;
            if (list2 == null || !list2.contains(str)) {
                List<String> list3 = strategyPlatformData.resourceScenes;
                if (list3 != null && list3.contains(str)) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    Map<EnumC909380Zlw, SceneConfigData> map2 = strategyPlatformData.sceneMap;
                    if (map2 != null) {
                        EnumC909380Zlw.Companion.getClass();
                        if (map2.get(C1495905tN.LIZ(str)) == null || (map = strategyPlatformData.decisionTree) == null || !map.containsKey(str)) {
                        }
                    }
                    Map<EnumC909380Zlw, SceneConfigData> map3 = strategyPlatformData2.sceneMap;
                    if (map3 != null) {
                        EnumC909380Zlw.Companion.getClass();
                        map3.remove(C1495905tN.LIZ(str));
                    }
                    Map<String, DecisionTree> map4 = strategyPlatformData2.decisionTree;
                    if (map4 != null) {
                        map4.remove(str);
                    }
                    Map<EnumC909380Zlw, SceneConfigData> map5 = strategyPlatformData.sceneMap;
                    if (map5 != null) {
                        EnumC909380Zlw.Companion.getClass();
                        map5.remove(C1495905tN.LIZ(str));
                    }
                    Map<String, DecisionTree> map6 = strategyPlatformData.decisionTree;
                    if (map6 != null) {
                        map6.remove(str);
                    }
                } else {
                    Map<EnumC909380Zlw, SceneConfigData> map7 = strategyPlatformData.sceneMap;
                    if (map7 != null) {
                        EnumC909380Zlw.Companion.getClass();
                        if (map7.get(C1495905tN.LIZ(str)) == null) {
                        }
                    }
                    Map<EnumC909380Zlw, SceneConfigData> map8 = strategyPlatformData2.sceneMap;
                    if (map8 != null) {
                        EnumC909380Zlw.Companion.getClass();
                        map8.remove(C1495905tN.LIZ(str));
                    }
                    Map<String, DecisionTree> map9 = strategyPlatformData.decisionTree;
                    if (map9 != null) {
                        map9.remove(str);
                    }
                }
            }
        }
    }

    public static void LJII(List list, StrategyPlatformData strategyPlatformData, StrategyPlatformData strategyPlatformData2) {
        Collection collection = strategyPlatformData.resourceScenes;
        if (collection == null) {
            collection = C13BV.INSTANCE;
        }
        Iterable iterable = strategyPlatformData2.resourceScenes;
        if (iterable == null) {
            iterable = C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(C13LP.LLIIJI(C13LP.LJLIL(iterable, collection)));
        Iterable iterable2 = strategyPlatformData.resourceScenes;
        if (iterable2 == null) {
            iterable2 = C13BV.INSTANCE;
        }
        arrayList.removeAll(C13LP.LJLLLLLL(list, C13LP.LLIIJI(iterable2)));
        strategyPlatformData.resourceScenes = arrayList;
    }
}
