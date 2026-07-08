package X;

import Y.ARunnableS9S0000100_2;
import Y.AfS38S1200000_2;
import Y.AfS40S1100000_2;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.im.frequencycontrol.impl.sync.api.FrequencyControlAPI;
import com.ss.android.ugc.aweme.im.frequencycontrol.impl.sync.api.model.FrequencyBatchSyncRequest;
import com.ss.android.ugc.aweme.im.frequencycontrol.impl.sync.api.model.FrequencySceneConfig;
import com.ss.android.ugc.aweme.im.frequencycontrol.impl.sync.api.model.FrequencySyncItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS581S0100000_2;

/* JADX INFO: renamed from: X.056w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C13000056w {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1138));
    public static final Object LIZIZ = new Object();
    public static final Map<String, Long> LIZJ = new LinkedHashMap();
    public static final Map<Long, Set<String>> LIZLLL = new LinkedHashMap();
    public static final Map<Long, ScheduledFuture<?>> LJ = new LinkedHashMap();
    public static final C01GW LJFF = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1137));
    public static final ConcurrentHashMap<Long, InterfaceC420801kM> LJI = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, InterfaceC420801kM> LJII = new ConcurrentHashMap<>();

    public static void LIZ() {
        Iterator<T> it2 = LJI.values().iterator();
        while (it2.hasNext()) {
            ((InterfaceC420801kM) it2.next()).dispose();
        }
        LJI.clear();
        Iterator<T> it3 = LJII.values().iterator();
        while (it3.hasNext()) {
            ((InterfaceC420801kM) it3.next()).dispose();
        }
        LJII.clear();
    }

    public static void LIZLLL() {
        if (!C143500gj.LIZ()) {
            LJI();
            return;
        }
        synchronized (LIZIZ) {
            try {
                C13002056y.LIZ.getClass();
                C13002056y.LIZJ();
                Collection<FrequencySceneConfig> collectionValues = C13002056y.LJ.values();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator<FrequencySceneConfig> it2 = collectionValues.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    FrequencySceneConfig next = it2.next();
                    String str = next.scene;
                    if (str != null && str.length() > 0 && str != null) {
                        if (C143500gj.LIZIZ(str)) {
                            Gson gson = C12990056m.LIZ;
                            String str2 = next.scene;
                            if (str2 == null) {
                                str2 = "";
                            }
                            Integer num = next.version;
                            linkedHashMap.put(str, Long.valueOf(C12990056m.LIZIZ(str2, num != null ? num.intValue() : 0, next.reportInterval, 0L, true).LJ));
                        } else if (LIZJ.containsKey(str)) {
                            LJ(str);
                        }
                    }
                }
                Iterator it3 = C15442062u.LJII(((LinkedHashMap) LIZJ).keySet(), linkedHashMap.keySet()).iterator();
                while (it3.hasNext()) {
                    LJ((String) it3.next());
                }
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    String str3 = (String) entry.getKey();
                    long jLongValue = ((Number) entry.getValue()).longValue();
                    Map<String, Long> map = LIZJ;
                    Long l = (Long) ((LinkedHashMap) map).get(str3);
                    if (l != null) {
                        if (l.longValue() != jLongValue) {
                            LJ(str3);
                        }
                    }
                    map.put(str3, Long.valueOf(jLongValue));
                    Map<Long, Set<String>> map2 = LIZLLL;
                    Long lValueOf = Long.valueOf(jLongValue);
                    LinkedHashMap linkedHashMap2 = (LinkedHashMap) map2;
                    Object linkedHashSet = linkedHashMap2.get(lValueOf);
                    if (linkedHashSet == null) {
                        linkedHashSet = new LinkedHashSet();
                        linkedHashMap2.put(lValueOf, linkedHashSet);
                    }
                    ((Set) linkedHashSet).add(str3);
                }
                Iterator it4 = C13LP.LLIIII(((LinkedHashMap) LIZLLL).keySet()).iterator();
                while (it4.hasNext()) {
                    long jLongValue2 = ((Number) it4.next()).longValue();
                    Set set = (Set) ((LinkedHashMap) LIZLLL).get(Long.valueOf(jLongValue2));
                    if (set == null || set.isEmpty()) {
                        LIZIZ(jLongValue2);
                    } else if (((LinkedHashMap) LJ).get(Long.valueOf(jLongValue2)) == null) {
                        LJFF(jLongValue2);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LJI() {
        LIZ();
        synchronized (LIZIZ) {
            try {
                Iterator it2 = ((LinkedHashMap) LJ).values().iterator();
                while (it2.hasNext()) {
                    ((ScheduledFuture) it2.next()).cancel(false);
                }
                ((LinkedHashMap) LJ).clear();
                ((LinkedHashMap) LIZJ).clear();
                ((LinkedHashMap) LIZLLL).clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LIZIZ(long j) {
        Map<Long, ScheduledFuture<?>> map = LJ;
        ScheduledFuture scheduledFuture = (ScheduledFuture) ((LinkedHashMap) map).get(Long.valueOf(j));
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        map.remove(Long.valueOf(j));
        LIZLLL.remove(Long.valueOf(j));
    }

    public static void LIZJ(AnonymousClass0576 anonymousClass0576) {
        if (anonymousClass0576 instanceof AnonymousClass0573) {
            LJI.remove(Long.valueOf(((AnonymousClass0573) anonymousClass0576).LIZ));
        } else {
            if (anonymousClass0576 instanceof C218400so) {
                ConcurrentHashMap<String, InterfaceC420801kM> concurrentHashMap = LJII;
                anonymousClass0576.getClass();
                concurrentHashMap.remove(null);
                return;
            }
            throw new C1954807lC();
        }
    }

    public static void LJ(String str) {
        Long lRemove = LIZJ.remove(str);
        if (lRemove != null) {
            long jLongValue = lRemove.longValue();
            LinkedHashMap linkedHashMap = (LinkedHashMap) LIZLLL;
            Set set = (Set) linkedHashMap.get(Long.valueOf(jLongValue));
            if (set != null) {
                set.remove(str);
            }
            Collection collection = (Collection) linkedHashMap.get(Long.valueOf(jLongValue));
            if (collection == null || collection.isEmpty()) {
                LIZIZ(jLongValue);
            }
        }
    }

    public static void LJFF(long j) {
        ((LinkedHashMap) LIZLLL).get(Long.valueOf(j));
        ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay = ((ScheduledExecutorService) LIZ.getValue()).scheduleWithFixedDelay(new ARunnableS9S0000100_2(j, 0), j, j, TimeUnit.MILLISECONDS);
        LJ.put(Long.valueOf(j), scheduledFutureScheduleWithFixedDelay);
    }

    public static void LJII(long j, List list) {
        boolean z;
        AnonymousClass0571 anonymousClass0571;
        if (list.isEmpty()) {
            return;
        }
        Set setLLIIJI = C13LP.LLIIJI(list);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PeriodicSync[period=");
        sbLIZ.append(j);
        sbLIZ.append("ms,");
        sbLIZ.append(setLLIIJI.size());
        sbLIZ.append(" scene(s)]");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        AnonymousClass0573 anonymousClass0573 = new AnonymousClass0573(j);
        AwS581S0100000_2 awS581S0100000_2 = new AwS581S0100000_2(setLLIIJI, (Set<String>) 568);
        if (C143500gj.LIZ()) {
            if (LJI.get(Long.valueOf(anonymousClass0573.LIZ)) != null && (!r0.isDisposed())) {
                return;
            }
            List<InterfaceC12999056v> listLJJII = C09RB.LJJII(C09RB.LJIIIZ(C09RB.LJIIJJI(new C1939607ik(C12985056h.LIZIZ.values())), AFwS229S0000000_2.get$arr$(793)));
            ArrayList arrayList = new ArrayList();
            for (InterfaceC12999056v interfaceC12999056v : listLJJII) {
                if ((interfaceC12999056v instanceof C12996056s) && interfaceC12999056v != null) {
                    arrayList.add(interfaceC12999056v);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((Boolean) awS581S0100000_2.invoke(obj)).booleanValue()) {
                    arrayList2.add(obj);
                }
            }
            if (arrayList2.isEmpty()) {
                return;
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : arrayList2) {
                C12996056s c12996056s = (C12996056s) obj2;
                C13002056y c13002056y = C13002056y.LIZ;
                String str = c12996056s.LIZ;
                c13002056y.getClass();
                if (str.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                long j2 = 0;
                if (!z) {
                    C13002056y.LIZJ();
                    synchronized (C13002056y.LIZJ) {
                        try {
                            anonymousClass0571 = C13002056y.LIZLLL;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                    if (anonymousClass0571 != null && str.length() != 0) {
                        Keva kevaLIZ = anonymousClass0571.LIZ();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("last_local_update_ms_");
                        sbLIZ2.append(str);
                        j2 = kevaLIZ.getLong(C2188811AlT.LIZIZ(sbLIZ2), 0L);
                    }
                }
                if (j2 > C13002056y.LIZLLL(c12996056s.LIZ)) {
                    arrayList3.add(obj2);
                }
            }
            if (arrayList3.isEmpty()) {
                return;
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                FrequencySyncItem frequencySyncItemLIZIZ = C12998056u.LIZIZ((C12996056s) it2.next());
                if (frequencySyncItemLIZIZ != null) {
                    arrayList4.add(frequencySyncItemLIZIZ);
                }
            }
            if (arrayList4.isEmpty()) {
                return;
            }
            String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
            if (curUserId == null) {
                curUserId = "";
            }
            ArrayList arrayList5 = new ArrayList();
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                String str2 = ((C12996056s) it3.next()).LIZ;
                if (str2.length() > 0) {
                    arrayList5.add(str2);
                }
            }
            LJI.put(Long.valueOf(anonymousClass0573.LIZ), ((FrequencyControlAPI) LJFF.getValue()).batchSync(new FrequencyBatchSyncRequest(arrayList4, null)).LJL(C11S5.LIZ()).LJJLL(new AfS38S1200000_2(anonymousClass0573, strLIZIZ, curUserId, arrayList5, 2), new AfS40S1100000_2(strLIZIZ, anonymousClass0573, 2)));
        }
    }
}
