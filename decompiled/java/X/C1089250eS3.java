package X;

import com.bytedance.android.live.dynamicstrategy.strategy.Strategy;
import com.bytedance.android.live.livedecision.ILiveDecisionService;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0eS3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1089250eS3 {
    public final ILiveDecisionService LIZ = (ILiveDecisionService) C1161920gLG.LIZJ(ILiveDecisionService.class);
    public final Map<String, C1089610eSd> LIZIZ = new LinkedHashMap();

    public final C443120HZe<Strategy, C1089610eSd, C1089610eSd> LIZ(Strategy strategy, Map<String, ? extends Object> map, String str) {
        Object obj;
        Object obj2;
        Object obj3 = ((LinkedHashMap) this.LIZIZ).get(strategy.decisionKey);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C0J0E c0j0e : (ArrayList) strategy.LIZIZ()) {
            String str2 = c0j0e.LIZ;
            String str3 = c0j0e.LIZJ;
            String str4 = c0j0e.LIZIZ;
            ILiveDecisionService iLiveDecisionService = this.LIZ;
            EnumC1094630eaj.Companion.getClass();
            C1090000eTG c1090000eTGO3 = iLiveDecisionService.O3(C1094620eai.LIZ(str4), str3, str2);
            if (c1090000eTGO3 != null && (obj2 = c1090000eTGO3.LIZJ) != null) {
                linkedHashMap.put(c0j0e.LIZ, obj2);
            }
        }
        for (C0J0E c0j0e2 : (ArrayList) strategy.LIZ()) {
            String str5 = c0j0e2.LIZ;
            String str6 = c0j0e2.LIZJ;
            String str7 = c0j0e2.LIZIZ;
            ILiveDecisionService iLiveDecisionService2 = this.LIZ;
            EnumC1094630eaj.Companion.getClass();
            C1090000eTG c1090000eTGO32 = iLiveDecisionService2.O3(C1094620eai.LIZ(str7), str6, str5);
            if (c1090000eTGO32 != null && (obj = c1090000eTGO32.LIZJ) != null) {
                linkedHashMap.put(c0j0e2.LIZ, obj);
            }
        }
        C1089610eSd c1089610eSdLIZ = C1089660eSi.LIZ(strategy, new LinkedHashMap(C2097608Jq.LJIIL(linkedHashMap, map)), str);
        this.LIZIZ.put(strategy.decisionKey, c1089610eSdLIZ);
        return new C443120HZe<>(strategy, obj3, c1089610eSdLIZ);
    }
}
