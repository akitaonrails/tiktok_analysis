package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.sparkpreload.ECSparkPreloadCondition;
import com.ss.android.ugc.aweme.ecommerce.sparkpreload.ECSparkPreloadConfigItem;
import com.ss.android.ugc.aweme.ecommerce.sparkpreload.ECSparkPreloadEventParams;
import com.ss.android.ugc.aweme.ecommerce.sparkpreload.ECSparkPreloadRouterParams;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.AwS138S1200000_23;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pkm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1523700pkm {
    public static final C01GW LIZ;
    public static final C01GW LIZIZ;
    public static final ConcurrentHashMap<String, CopyOnWriteArrayList<Pair<ECSparkPreloadEventParams, ECSparkPreloadConfigItem>>> LIZJ;
    public static final ConcurrentHashMap<String, CopyOnWriteArrayList<ECSparkPreloadConfigItem>> LIZLLL;

    static {
        CopyOnWriteArrayList<Pair<ECSparkPreloadEventParams, ECSparkPreloadConfigItem>> copyOnWriteArrayListPutIfAbsent;
        List<ECSparkPreloadRouterParams> list;
        CopyOnWriteArrayList<ECSparkPreloadConfigItem> copyOnWriteArrayListPutIfAbsent2;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new C1523720pko());
        LIZ = c01gwLIZIZ;
        LIZIZ = C452501pT.LIZIZ(new C1523730pkp());
        LIZJ = new ConcurrentHashMap<>();
        LIZLLL = new ConcurrentHashMap<>();
        try {
            Iterator it2 = ((List) c01gwLIZIZ.getValue()).iterator();
            while (it2.hasNext()) {
                List<ECSparkPreloadConfigItem> listLIZ = ((InterfaceC1523710pkn) it2.next()).LIZ();
                if (listLIZ != null) {
                    for (ECSparkPreloadConfigItem eCSparkPreloadConfigItem : listLIZ) {
                        ECSparkPreloadCondition eCSparkPreloadCondition = eCSparkPreloadConfigItem.preloadCondition;
                        String str = eCSparkPreloadCondition != null ? eCSparkPreloadCondition.triggerType : null;
                        if (Intrinsics.LJFF(str, "event")) {
                            List<ECSparkPreloadEventParams> list2 = eCSparkPreloadConfigItem.preloadCondition.eventParams;
                            if (list2 != null) {
                                for (ECSparkPreloadEventParams eCSparkPreloadEventParams : list2) {
                                    ConcurrentHashMap<String, CopyOnWriteArrayList<Pair<ECSparkPreloadEventParams, ECSparkPreloadConfigItem>>> concurrentHashMap = LIZJ;
                                    String str2 = eCSparkPreloadEventParams.eventName;
                                    if (str2 == null) {
                                        str2 = "";
                                    }
                                    CopyOnWriteArrayList<Pair<ECSparkPreloadEventParams, ECSparkPreloadConfigItem>> copyOnWriteArrayList = concurrentHashMap.get(str2);
                                    if (copyOnWriteArrayList == null && (copyOnWriteArrayListPutIfAbsent = concurrentHashMap.putIfAbsent(str2, (copyOnWriteArrayList = new CopyOnWriteArrayList<>()))) != null) {
                                        copyOnWriteArrayList = copyOnWriteArrayListPutIfAbsent;
                                    }
                                    copyOnWriteArrayList.add(new Pair<>(eCSparkPreloadEventParams, eCSparkPreloadConfigItem));
                                }
                            }
                        } else if (Intrinsics.LJFF(str, "router") && (list = eCSparkPreloadConfigItem.preloadCondition.routerParams) != null) {
                            for (ECSparkPreloadRouterParams eCSparkPreloadRouterParams : list) {
                                ConcurrentHashMap<String, CopyOnWriteArrayList<ECSparkPreloadConfigItem>> concurrentHashMap2 = LIZLLL;
                                String str3 = eCSparkPreloadRouterParams.path;
                                if (str3 == null) {
                                    str3 = "";
                                }
                                CopyOnWriteArrayList<ECSparkPreloadConfigItem> copyOnWriteArrayList2 = concurrentHashMap2.get(str3);
                                if (copyOnWriteArrayList2 == null && (copyOnWriteArrayListPutIfAbsent2 = concurrentHashMap2.putIfAbsent(str3, (copyOnWriteArrayList2 = new CopyOnWriteArrayList<>()))) != null) {
                                    copyOnWriteArrayList2 = copyOnWriteArrayListPutIfAbsent2;
                                }
                                copyOnWriteArrayList2.add(eCSparkPreloadConfigItem);
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ECSparkPreloader, init error: ");
            sbLIZ.append(th.getMessage());
            C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static void LIZ(String str, JSONObject jSONObject) {
        if (str != null) {
            try {
                if (!a0.LJJIIZI(str, "tiktokec", false) || !((Boolean) LIZIZ.getValue()).booleanValue()) {
                    return;
                }
                C1743690vTb.LIZLLL(new AwS138S1200000_23(str, jSONObject, new C013C(), 2));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ECSparkPreloader, handleEvent error: ");
                sbLIZ.append(e.getMessage());
                C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }
}
