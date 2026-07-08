package X;

import Y.ARunnableS117S0100000_17;
import Y.ARunnableS94S0000000_17;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.android.livesdk.guide.model.ReportExtra;
import com.bytedance.android.livesdk.guide.model.TaskInfo;
import com.bytedance.android.livesdk.guide.model.TaskInfoExtra;
import com.bytedance.android.livesdk.impl.revenue.strategy.base.TaskManagerV2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fdS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1134760fdS implements InterfaceC1134750fdR {
    public static volatile boolean LLILLL;
    public static ARunnableS94S0000000_17 LLILZIL;
    public static final C1134760fdS LL = new C1134760fdS();
    public static final ConcurrentHashMap<String, C1134790fdV> LLILLJJLI = new ConcurrentHashMap<>();
    public static final C01GW LLILZ = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(148));

    public static final Handler LIZLLL() {
        return (Handler) LLILZ.getValue();
    }

    public static Map LJ() {
        ConcurrentHashMap<String, C1134790fdV> concurrentHashMap = LLILLJJLI;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(concurrentHashMap.size()));
        Iterator<T> it2 = concurrentHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            linkedHashMap.put(entry.getKey(), Long.valueOf(Math.min(((C1134790fdV) entry.getValue()).LIZJ, ((C1134790fdV) entry.getValue()).LIZIZ) / 1000));
        }
        return linkedHashMap;
    }

    public final void LIZ() {
        if (LLILLL || LLILLJJLI.isEmpty()) {
            return;
        }
        ARunnableS94S0000000_17 aRunnableS94S0000000_17 = LLILZIL;
        if (aRunnableS94S0000000_17 == null) {
            aRunnableS94S0000000_17 = new ARunnableS94S0000000_17(4);
            LLILZIL = aRunnableS94S0000000_17;
        }
        C786410Ut5.LJLIIL(1000L, LIZLLL(), aRunnableS94S0000000_17);
        LLILLL = true;
    }

    public final void LJI() {
        ARunnableS94S0000000_17 aRunnableS94S0000000_17 = LLILZIL;
        if (aRunnableS94S0000000_17 != null) {
            LIZLLL().removeCallbacks(aRunnableS94S0000000_17);
        }
        LLILZIL = null;
        LLILLL = false;
    }

    public static void LJIIIIZZ(Map map) {
        C0JT7.LIZ.getClass();
        Map mapLIZIZ = C0JT7.LIZIZ();
        boolean zRetainAll = false;
        if (!map.isEmpty()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (((String) entry.getKey()).length() > 0) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            mapLIZIZ.putAll(linkedHashMap);
        }
        C13DB c13db = new C13DB();
        TaskManagerV2.LIZ.getClass();
        LIZJ(TaskManagerV2.LIZIZ, c13db);
        Set setBuild = c13db.build();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setBuild) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        Set setLLIIJI = C13LP.LLIIJI(arrayList);
        if (!setLLIIJI.isEmpty()) {
            zRetainAll = ((LinkedHashMap) mapLIZIZ).keySet().retainAll(setLLIIJI);
        }
        if ((!map.isEmpty()) || zRetainAll) {
            C0JT7.LIZ.getClass();
            C0JT7.LIZJ(mapLIZIZ, "watch_live_duration_map");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateAndCleanCache: Updated ");
            sbLIZ.append(map.size());
            sbLIZ.append(" tasks, cache size: ");
            sbLIZ.append(mapLIZIZ.size());
            C20441214yg.LJIIIZ("TaskWatchLiveDurationTracker", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // X.InterfaceC1134750fdR
    public final void D(final boolean z) {
        if (!Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            C786410Ut5.LJJZZIII(LIZLLL(), new Runnable() { // from class: X.0fdW
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("TaskWatchLiveDurationTracker@186.onWatchStatusChanged$1");
                    try {
                        C1134760fdS.LL.D(z);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("TaskWatchLiveDurationTracker@186.onWatchStatusChanged$1");
                }
            });
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onWatchStatusChanged: isWatching=");
        sbLIZ.append(z);
        C20441214yg.LJIIIZ("TaskWatchLiveDurationTracker", C2188811AlT.LIZIZ(sbLIZ));
        if (!z) {
            Collection<C1134790fdV> collectionValues = LLILLJJLI.values();
            int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(collectionValues, 10));
            if (iLIZIZ < 16) {
                iLIZIZ = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
            for (C1134790fdV c1134790fdV : collectionValues) {
                Pair pair = new Pair(c1134790fdV.LIZ, Long.valueOf(Math.min(c1134790fdV.LIZJ, c1134790fdV.LIZIZ) / 1000));
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            }
            LJIIIIZZ(linkedHashMap);
            C20441214yg.LJIIIZ("TaskWatchLiveDurationTracker", "onWatchStatusChanged: Stopped tracking, duration saved.");
            LJI();
            return;
        }
        C20441214yg.LJIIIZ("TaskWatchLiveDurationTracker", "onWatchStatusChanged: Started tracking");
        LIZ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJFF(List<? extends C1134410fct> list) {
        long jLongValue;
        long j;
        long j2;
        long j3;
        ReportExtra reportExtra;
        if (!Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            C786410Ut5.LJJZZIII(LIZLLL(), new ARunnableS117S0100000_17(list, 161));
            return;
        }
        C0JT7.LIZ.getClass();
        Map mapLIZIZ = C0JT7.LIZIZ();
        ArrayList<C1134410fct> arrayList = new ArrayList();
        for (C1134410fct c1134410fct : list) {
            if (c1134410fct.LJI.length() > 0) {
                arrayList.add(c1134410fct);
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            linkedHashSet.add(((C1134410fct) it2.next()).LJI);
        }
        Set<String> setKeySet = LLILLJJLI.keySet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : setKeySet) {
            if (!linkedHashSet.contains(obj)) {
                arrayList2.add(obj);
            }
        }
        if (!arrayList2.isEmpty()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("syncTrackedTasks: Removing stale taskIds=");
            sbLIZ.append(arrayList2);
            C20441214yg.LJIIIZ("TaskWatchLiveDurationTracker", C2188811AlT.LIZIZ(sbLIZ));
            LJII(arrayList2);
        } else if (linkedHashSet.isEmpty() && LLILLJJLI.isEmpty()) {
            LJI();
        }
        for (C1134410fct c1134410fct2 : arrayList) {
            TaskInfo taskInfo = (TaskInfo) c1134410fct2.LIZ;
            long j4 = taskInfo.taskCompletedNum;
            if (j4 < 0) {
                j4 = 0;
            }
            long j5 = taskInfo.taskCompleteTargetNum;
            if (j5 < 0) {
                j5 = 0;
            }
            Long l = (Long) ((LinkedHashMap) mapLIZIZ).get(c1134410fct2.LJI);
            if (l != null) {
                jLongValue = l.longValue();
                if (jLongValue < 0) {
                    jLongValue = 0;
                }
            } else {
                jLongValue = 0;
            }
            ConcurrentHashMap<String, C1134790fdV> concurrentHashMap = LLILLJJLI;
            C1134790fdV c1134790fdV = concurrentHashMap.get(c1134410fct2.LJI);
            if (c1134790fdV != null) {
                j = c1134790fdV.LIZJ;
            } else {
                j = 0;
            }
            TaskInfoExtra taskInfoExtra = ((TaskInfo) c1134410fct2.LIZ).extra;
            if (taskInfoExtra != null && (reportExtra = taskInfoExtra.reportExtra) != null) {
                j2 = reportExtra.reportInterval;
            } else {
                j2 = 0;
            }
            if (j2 > 0) {
                j3 = j2 * 1000;
            } else {
                j3 = 0;
            }
            long j6 = j5 * 1000;
            long jMin = Math.min(Math.max(j4 * 1000, Math.max(jLongValue * 1000, j)), j6);
            C1134790fdV c1134790fdV2 = concurrentHashMap.get(c1134410fct2.LJI);
            if (c1134790fdV2 == null) {
                String str = c1134410fct2.LJI;
                concurrentHashMap.put(str, new C1134790fdV(j6, jMin, j3, str));
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("startTrackingTasks: Initialized duration for ");
                sbLIZ2.append(c1134410fct2.LJI);
                sbLIZ2.append(" = ");
                sbLIZ2.append(jMin);
                C20441214yg.LJIIIZ("TaskWatchLiveDurationTracker", C2188811AlT.LIZIZ(sbLIZ2));
            } else {
                c1134790fdV2.LIZIZ = j6;
                c1134790fdV2.LIZJ = jMin;
                c1134790fdV2.LJI = j3;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("startTrackingTasks: Synced duration for ");
                sbLIZ3.append(c1134410fct2.LJI);
                sbLIZ3.append(" = ");
                sbLIZ3.append(jMin);
                C20441214yg.LJIIIZ("TaskWatchLiveDurationTracker", C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
        C1134550fd7.LIZ.getClass();
        if (C1134550fd7.LIZIZ) {
            LIZ();
        } else {
            if (!LLILLJJLI.isEmpty()) {
                return;
            }
            LJI();
        }
    }

    public final void LJII(Collection<String> collection) {
        if (collection.isEmpty()) {
            return;
        }
        if (!Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            C786410Ut5.LJJZZIII(LIZLLL(), new ARunnableS117S0100000_17(collection, 162));
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stopTrackingTasks: taskIds=");
        sbLIZ.append(collection);
        C20441214yg.LJIIIZ("TaskWatchLiveDurationTracker", C2188811AlT.LIZIZ(sbLIZ));
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = collection.iterator();
        while (it2.hasNext()) {
            C1134790fdV c1134790fdVRemove = LLILLJJLI.remove(it2.next());
            if (c1134790fdVRemove != null) {
                arrayList.add(new Pair(c1134790fdVRemove.LIZ, Long.valueOf(Math.min(c1134790fdVRemove.LIZJ, c1134790fdVRemove.LIZIZ) / 1000)));
            }
        }
        Map mapLJIILLIIL = C2097608Jq.LJIILLIIL(arrayList);
        if (!mapLJIILLIIL.isEmpty()) {
            LJIIIIZZ(mapLJIILLIIL);
        }
        if (LLILLJJLI.isEmpty()) {
            LJI();
        }
    }

    public static final C1134410fct LIZIZ(String str, List<? extends C1134410fct> list) {
        for (C1134410fct c1134410fct : list) {
            if (Intrinsics.LJFF(c1134410fct.LJI, str)) {
                return c1134410fct;
            }
            C1134410fct c1134410fctLIZIZ = LIZIZ(str, c1134410fct.LJ);
            if (c1134410fctLIZIZ != null) {
                return c1134410fctLIZIZ;
            }
        }
        return null;
    }

    public static final void LIZJ(List list, C13DB c13db) {
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C1134410fct c1134410fct = (C1134410fct) it2.next();
            c13db.add(c1134410fct.LJI);
            LIZJ(c1134410fct.LJ, c13db);
        }
    }
}
