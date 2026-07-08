package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.affinity.AffinityEvent;
import com.ss.android.ugc.aweme.affinity.setting.AffinityAggregationReportConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.08kb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2205908kb {
    public static volatile boolean LIZLLL;
    public static CopyOnWriteArrayList<AffinityEvent> LJ;
    public static final C2205908kb LIZ = new C2205908kb();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1752));
    public static final C01GW LIZJ = C452501pT.LIZ(EnumC452301pR.NONE, AFwS189S0000000_3.get$arr$(1751));
    public static final ConcurrentHashMap<String, Long> LJFF = new ConcurrentHashMap<>();

    public static void LJ() {
        if (LIZLLL) {
            return;
        }
        LIZLLL = true;
        long j = ((AffinityAggregationReportConfig) C2206108kd.LIZIZ.getValue()).aggregationTime;
        ((ScheduledExecutorService) LIZJ.getValue()).scheduleWithFixedDelay(new Runnable() { // from class: X.08kc
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("AffinityFeatureManager@ac19.tryStartPolling$1");
                try {
                    C2205908kb.LIZ.LIZJ(null, "time");
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("AffinityFeatureManager@ac19.tryStartPolling$1");
            }
        }, j, j, TimeUnit.SECONDS);
    }

    public final void LIZ() {
        byte[] bytes;
        CopyOnWriteArrayList<AffinityEvent> copyOnWriteArrayList = LJ;
        if (copyOnWriteArrayList == null) {
            return;
        }
        int size = copyOnWriteArrayList.size();
        C01GW c01gw = C2206108kd.LIZIZ;
        if (size >= ((AffinityAggregationReportConfig) c01gw.getValue()).aggregationCount) {
            LIZJ(null, "count");
            return;
        }
        String strLIZIZ = LIZIZ(copyOnWriteArrayList);
        if (((strLIZIZ == null || (bytes = strLIZIZ.getBytes(Charsets.UTF_8)) == null) ? 0 : bytes.length) >= ((AffinityAggregationReportConfig) c01gw.getValue()).aggregationPackageSize) {
            LIZJ(strLIZIZ, "size");
        } else {
            C2204308kL.LIZ.getClass();
            C2204308kL.LIZ().storeString("affinity_feature", GsonProtectorUtils.toJson(C2204308kL.LIZJ, copyOnWriteArrayList));
        }
    }

    public static String LIZIZ(List list) {
        if (list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            AffinityEvent affinityEvent = (AffinityEvent) it2.next();
            Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("name", affinityEvent.featureName), new Pair("from_uid", affinityEvent.fromUid), new Pair("time", Long.valueOf(affinityEvent.timeStamp)));
            Map<?, ?> map = affinityEvent.eventParams;
            if (map != null) {
                for (Map.Entry<?, ?> entry : map.entrySet()) {
                    Object value = entry.getValue();
                    if (value != null) {
                        mapLJIIJ.put(String.valueOf(entry.getKey()), value);
                    }
                }
            }
            arrayList.add(mapLJIIJ);
        }
        C1227904rF.LIZ.getClass();
        return C1227904rF.LJI(arrayList);
    }

    public static void LIZLLL(AffinityEvent affinityEvent) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("from_uid", affinityEvent.fromUid);
        Map<?, ?> map = affinityEvent.eventParams;
        if (map != null) {
            for (Map.Entry<?, ?> entry : map.entrySet()) {
                Object value = entry.getValue();
                if (value != null) {
                    c2344009Gk.LJ(value, String.valueOf(entry.getKey()));
                }
            }
        }
        C20684815ws.LJIILLIIL(affinityEvent.featureName, c2344009Gk.LIZ);
    }

    public final synchronized void LIZJ(String str, String str2) {
        CopyOnWriteArrayList<AffinityEvent> copyOnWriteArrayList = LJ;
        if (copyOnWriteArrayList == null) {
            return;
        }
        if (str == null && (str = LIZIZ(copyOnWriteArrayList)) == null) {
            return;
        }
        C20684815ws.LJIJI("affinity_aggregation_event", new Pair(str, "event_list"), new Pair(str2, "source"));
        CopyOnWriteArrayList<AffinityEvent> copyOnWriteArrayList2 = LJ;
        if (copyOnWriteArrayList2 != null) {
            copyOnWriteArrayList2.clear();
        }
        C2204308kL.LIZ.getClass();
        C2204308kL.LIZ().storeString("affinity_feature", "");
    }
}
