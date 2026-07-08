package X;

import com.bytedance.keva.Keva;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.experiment.BottomTab;
import com.ss.android.ugc.aweme.experiment.TabChangeInfluencingFactors;
import com.ss.android.ugc.aweme.experiment.TabConfig;
import com.ss.android.ugc.aweme.experiment.TopTab;
import com.ss.android.ugc.aweme.experiment.TopTabItem;
import com.ss.android.ugc.aweme.experiment.TraceInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0CXN, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CXN {
    public static final C0CXN LIZ = new C0CXN();
    public static final TabConfig LIZIZ;
    public static final C01GW LIZJ;
    public static final C01GW LIZLLL;
    public static final C01GW LJ;
    public static volatile TabConfig LJFF;

    static {
        TabConfig tabConfigLIZJ = C343770Ddn.LIZIZ.LIZJ();
        LIZIZ = tabConfigLIZJ;
        LIZJ = C452501pT.LIZIZ(new C0CXO());
        LIZLLL = C452501pT.LIZIZ(new C0CTU());
        LJ = C452501pT.LIZIZ(new C0CTW());
        LJFF = tabConfigLIZJ;
    }

    public static TabConfig LIZJ() {
        return !Intrinsics.LJFF(LJFF, LIZIZ) ? LJFF : (TabConfig) LJ.getValue();
    }

    public static void LIZ(TabConfig tabConfig) {
        TraceInfo traceInfo;
        TabChangeInfluencingFactors tabChangeInfluencingFactors;
        TabChangeInfluencingFactors tabChangeInfluencingFactors2;
        k kVar;
        n nVar;
        Set<String> setLJJIJIL;
        int iLIZIZ;
        TraceInfo traceInfo2 = tabConfig.traceInfo;
        if (traceInfo2 != null && (tabChangeInfluencingFactors2 = traceInfo2.tabChangeInfluencingFactors) != null && (kVar = tabChangeInfluencingFactors2.abExpInfo) != null) {
            n nVar2 = new n();
            if ((kVar instanceof n) && (nVar = (n) kVar) != null && (setLJJIJIL = nVar.LJJIJIL()) != null) {
                for (String str : setLJJIJIL) {
                    if (C123100dR.LIZ(str) && (iLIZIZ = C307820C4u.LIZJ.LIZIZ(str)) != -1) {
                        nVar2.LJJIII(Integer.valueOf(iLIZIZ), str);
                    }
                }
            }
            tabConfig.traceInfo.tabChangeInfluencingFactors.abExpVidInfo = nVar2;
        }
        if (C0CXQ.LIZ() != null && !Intrinsics.LJFF(C0CXQ.LIZ(), "null") && (traceInfo = tabConfig.traceInfo) != null && (tabChangeInfluencingFactors = traceInfo.tabChangeInfluencingFactors) != null) {
            tabChangeInfluencingFactors.commonLogId = C0CXQ.LIZ();
        }
        ((Keva) LIZJ.getValue()).storeString("tab_fcp_config_v2", C08JS.LIZLLL(tabConfig));
    }

    public static BottomTab LIZIZ(EnumC1584360rKc enumC1584360rKc) {
        TabConfig tabConfigLIZJ = LIZJ();
        if (!Intrinsics.LJFF(tabConfigLIZJ.isJsonIllegal, Boolean.TRUE)) {
            Map<String, ArrayList<BottomTab>> map = tabConfigLIZJ.bottomTab;
            if (map != null) {
                Iterator<Map.Entry<String, ArrayList<BottomTab>>> it2 = map.entrySet().iterator();
                while (it2.hasNext()) {
                    for (BottomTab bottomTab : it2.next().getValue()) {
                        if (Intrinsics.LJFF(enumC1584360rKc.getKey(), bottomTab.bottomTabKey)) {
                            return bottomTab;
                        }
                    }
                }
            }
            return null;
        }
        Iterator<Map.Entry<Integer, Map<String, List<String>>>> it3 = C1584270rKT.LIZIZ.entrySet().iterator();
        while (it3.hasNext()) {
            for (Map.Entry<String, List<String>> entry : it3.next().getValue().entrySet()) {
                if (Intrinsics.LJFF(enumC1584360rKc.getKey(), entry.getKey())) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Iterator<T> it4 = entry.getValue().iterator();
                    while (it4.hasNext()) {
                        linkedHashMap.put(it4.next(), Boolean.TRUE);
                    }
                    return new BottomTab(entry.getKey(), linkedHashMap);
                }
            }
        }
        return null;
    }

    public static TopTabItem LIZLLL(EnumC1584360rKc enumC1584360rKc) {
        ArrayList<TopTabItem> arrayList;
        String key = enumC1584360rKc.getKey();
        TabConfig tabConfigLIZJ = LIZJ();
        if (!Intrinsics.LJFF(tabConfigLIZJ.isJsonIllegal, Boolean.TRUE)) {
            TopTab topTab = tabConfigLIZJ.topTab;
            if (topTab != null && (arrayList = topTab.topTabList) != null) {
                for (TopTabItem topTabItem : arrayList) {
                    if (Intrinsics.LJFF(key, topTabItem.topTabKey)) {
                        return topTabItem;
                    }
                }
                return null;
            }
            return null;
        }
        for (TopTabItem topTabItem2 : C1584280rKU.LIZIZ) {
            if (Intrinsics.LJFF(key, topTabItem2.topTabKey)) {
                return topTabItem2;
            }
        }
        return null;
    }
}
