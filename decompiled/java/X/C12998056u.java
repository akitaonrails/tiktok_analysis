package X;

import Y.AfS32S1000000_2;
import Y.AfS40S1100000_2;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.im.frequencycontrol.api.frequencyrule.FrequencyMarkRecord;
import com.ss.android.ugc.aweme.im.frequencycontrol.impl.sync.api.FrequencyControlAPI;
import com.ss.android.ugc.aweme.im.frequencycontrol.impl.sync.api.model.FrequencyBatchSyncRequest;
import com.ss.android.ugc.aweme.im.frequencycontrol.impl.sync.api.model.FrequencyBatchSyncResponse;
import com.ss.android.ugc.aweme.im.frequencycontrol.impl.sync.api.model.FrequencyCounter;
import com.ss.android.ugc.aweme.im.frequencycontrol.impl.sync.api.model.FrequencyCounterEntry;
import com.ss.android.ugc.aweme.im.frequencycontrol.impl.sync.api.model.FrequencyData;
import com.ss.android.ugc.aweme.im.frequencycontrol.impl.sync.api.model.FrequencySceneConfig;
import com.ss.android.ugc.aweme.im.frequencycontrol.impl.sync.api.model.FrequencySyncItem;
import com.ss.android.ugc.aweme.im.frequencycontrol.impl.sync.config.model.ImFrequencyTypeEnum;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.056u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12998056u {
    public static volatile C11JF LIZJ;
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1135));
    public static final Object LIZIZ = new Object();
    public static volatile AFwS187S0000000_2 LIZLLL = AFwS187S0000000_2.get$arr$(1136);

    public static void LIZJ() {
        synchronized (LIZIZ) {
            try {
                C11JF c11jf = LIZJ;
                if (c11jf != null) {
                    c11jf.dispose();
                }
                LIZJ = null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C13000056w.LIZ();
    }

    public static C11JF LIZLLL() {
        C12996056s c12996056s;
        AFwS229S0000000_2 aFwS229S0000000_2 = AFwS229S0000000_2.get$arr$(794);
        InterfaceC420801kM interfaceC420801kMLJJLL = null;
        if (C143500gj.LIZ()) {
            synchronized (LIZIZ) {
                try {
                    C11JF c11jf = LIZJ;
                    if (c11jf != null) {
                        interfaceC420801kMLJJLL = c11jf;
                    } else {
                        List<InterfaceC12999056v> listLJJII = C09RB.LJJII(C09RB.LJIIIZ(C09RB.LJIIJJI(new C1939607ik(C12985056h.LIZIZ.values())), AFwS229S0000000_2.get$arr$(793)));
                        ArrayList arrayList = new ArrayList();
                        for (InterfaceC12999056v interfaceC12999056v : listLJJII) {
                            if ((interfaceC12999056v instanceof C12996056s) && (c12996056s = (C12996056s) interfaceC12999056v) != null) {
                                arrayList.add(c12996056s);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj : arrayList) {
                                aFwS229S0000000_2.getClass();
                                if (Boolean.TRUE.booleanValue()) {
                                    arrayList2.add(obj);
                                }
                            }
                            if (!arrayList2.isEmpty()) {
                                ArrayList arrayList3 = new ArrayList();
                                Iterator it2 = arrayList2.iterator();
                                while (it2.hasNext()) {
                                    FrequencySyncItem frequencySyncItemLIZIZ = LIZIZ((C12996056s) it2.next());
                                    if (frequencySyncItemLIZIZ != null) {
                                        arrayList3.add(frequencySyncItemLIZIZ);
                                    }
                                }
                                if (!arrayList3.isEmpty()) {
                                    String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
                                    if (curUserId == null) {
                                        curUserId = "";
                                    }
                                    ArrayList arrayList4 = new ArrayList();
                                    Iterator it3 = arrayList2.iterator();
                                    while (it3.hasNext()) {
                                        String str = ((C12996056s) it3.next()).LIZ;
                                        if (str.length() > 0) {
                                            arrayList4.add(str);
                                        }
                                    }
                                    interfaceC420801kMLJJLL = ((FrequencyControlAPI) LIZ.getValue()).batchSync(new FrequencyBatchSyncRequest(arrayList3, null)).LJL(C11S5.LIZ()).LJJLL(new AfS40S1100000_2(curUserId, arrayList4, 1), new AfS32S1000000_2(1));
                                    LIZJ = (C11JF) interfaceC420801kMLJJLL;
                                }
                            }
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return (C11JF) interfaceC420801kMLJJLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v31, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v56, types: [java.util.ArrayList] */
    public static FrequencySyncItem LIZIZ(C12996056s c12996056s) {
        boolean z;
        ArrayList arrayList;
        ?? SingletonList;
        long jLongValue;
        ArrayList arrayList2;
        long jIntValue;
        Boolean bool;
        Integer num;
        List<Long> list;
        Long l;
        String str = c12996056s.LIZ;
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        Integer numValueOf = null;
        if (!z) {
            return null;
        }
        C13002056y.LIZ.getClass();
        C13002056y.LIZJ();
        FrequencySceneConfig frequencySceneConfig = C13002056y.LJ.get(str);
        if (frequencySceneConfig == null) {
            return null;
        }
        C12991056n c12991056n = ImFrequencyTypeEnum.Companion;
        Integer num2 = frequencySceneConfig.frequencyType;
        c12991056n.getClass();
        ImFrequencyTypeEnum imFrequencyTypeEnumLIZ = C12991056n.LIZ(num2);
        Map mapLJ = LJ(c12996056s);
        Gson gson = C12990056m.LIZ;
        if (mapLJ.isEmpty()) {
            return null;
        }
        if (imFrequencyTypeEnumLIZ == ImFrequencyTypeEnum.UID_CONVERSATION) {
            C13002056y.LIZJ();
            long j = C13002056y.LJI;
            if (j > 0 && j != -1) {
                if (j > 2147483647L) {
                    j = 2147483647L;
                }
                numValueOf = Integer.valueOf((int) j);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapLJ.entrySet()) {
            EnumC12995056r enumC12995056r = (EnumC12995056r) entry.getKey();
            InterfaceC12997056t interfaceC12997056t = (InterfaceC12997056t) entry.getValue();
            if (imFrequencyTypeEnumLIZ != ImFrequencyTypeEnum.UID) {
                List<String> listLIZ = interfaceC12997056t.LIZ();
                SingletonList = new ArrayList();
                for (String str2 : listLIZ) {
                    if (str2.length() > 0) {
                        SingletonList.add(str2);
                    }
                }
            } else {
                String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
                if (curUserId == null) {
                    curUserId = "";
                }
                if (curUserId.length() == 0) {
                    SingletonList = C13BV.INSTANCE;
                } else {
                    SingletonList = Collections.singletonList(curUserId);
                }
            }
            for (String str3 : SingletonList) {
                if (str3.length() != 0 && (numValueOf == null || linkedHashMap.size() < numValueOf.intValue() || linkedHashMap.containsKey(str3))) {
                    FrequencyMarkRecord frequencyMarkRecordLJ = interfaceC12997056t.LJ(str3);
                    if (frequencyMarkRecordLJ != null && (l = frequencyMarkRecordLJ.lastShowTimeMs) != null) {
                        jLongValue = l.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    if (frequencyMarkRecordLJ != null && (list = frequencyMarkRecordLJ.hitTimestamps) != null && (!list.isEmpty())) {
                        arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
                        Iterator<Long> it2 = list.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(Long.valueOf(it2.next().longValue() / 1000));
                        }
                    } else {
                        arrayList2 = null;
                    }
                    Object arrayList3 = linkedHashMap.get(str3);
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                        linkedHashMap.put(str3, arrayList3);
                    }
                    Collection collection = (Collection) arrayList3;
                    Integer numValueOf2 = Integer.valueOf(enumC12995056r.getWireValue());
                    if (frequencyMarkRecordLJ != null && (num = frequencyMarkRecordLJ.count) != null) {
                        jIntValue = num.intValue();
                    } else {
                        jIntValue = 0;
                    }
                    Long lValueOf = Long.valueOf(jIntValue);
                    Long lValueOf2 = Long.valueOf(jLongValue / 1000);
                    if (frequencyMarkRecordLJ == null || (bool = frequencyMarkRecordLJ.pendingClientOverride) == null || !bool.booleanValue()) {
                        bool = null;
                    }
                    collection.add(new FrequencyCounterEntry(numValueOf2, new FrequencyCounter(lValueOf, lValueOf2, arrayList2, bool)));
                }
            }
        }
        if (!linkedHashMap.isEmpty()) {
            arrayList = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                arrayList.add(new FrequencyData((String) entry2.getKey(), (List) entry2.getValue()));
            }
        } else {
            arrayList = null;
        }
        return new FrequencySyncItem(str, Integer.valueOf(imFrequencyTypeEnumLIZ.getValue()), arrayList);
    }

    public static Map LJ(InterfaceC12999056v interfaceC12999056v) {
        Set<EnumC12995056r> setLIZJ = interfaceC12999056v.LIZJ();
        ArrayList arrayList = new ArrayList();
        for (EnumC12995056r enumC12995056r : setLIZJ) {
            Object objLJLL = C13LP.LJLL(interfaceC12999056v.LIZ(enumC12995056r));
            if (objLJLL != null) {
                arrayList.add(new Pair(enumC12995056r, objLJLL));
            }
        }
        return C2097608Jq.LJIILLIIL(arrayList);
    }

    public static void LIZ(FrequencyBatchSyncResponse frequencyBatchSyncResponse, String str, List list) {
        InterfaceC12999056v interfaceC12999056vLJ;
        Integer num = frequencyBatchSyncResponse.statusCode;
        if (num != null && num.intValue() == 0) {
            List<FrequencySyncItem> list2 = frequencyBatchSyncResponse.items;
            if (list2 == null) {
                list2 = C13BV.INSTANCE;
            }
            if (!Intrinsics.LJFF(str, ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId())) {
                return;
            }
            long jLongValue = ((Number) LIZLLL.invoke()).longValue();
            Iterator it2 = list.iterator();
            int i = 0;
            while (true) {
                Object obj = null;
                if (!it2.hasNext()) {
                    break;
                }
                String str2 = (String) it2.next();
                InterfaceC12999056v interfaceC12999056vLJ2 = C12985056h.LJ(str2);
                if (interfaceC12999056vLJ2 != null) {
                    Map mapLJ = LJ(interfaceC12999056vLJ2);
                    Iterator it3 = list2.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        Object next = it3.next();
                        if (Intrinsics.LJFF(((FrequencySyncItem) next).scene, str2)) {
                            obj = next;
                            break;
                        }
                    }
                    FrequencySyncItem frequencySyncItem = (FrequencySyncItem) obj;
                    if (frequencySyncItem != null) {
                        C12990056m.LIZ(str2, mapLJ, frequencySyncItem);
                    }
                    Iterator it4 = mapLJ.values().iterator();
                    while (it4.hasNext()) {
                        ((InterfaceC12997056t) it4.next()).LJI();
                    }
                    C13002056y.LJIIIIZZ(C13002056y.LIZ, str2, jLongValue);
                    i++;
                }
            }
            if (i == 0 && (!list2.isEmpty())) {
                for (FrequencySyncItem frequencySyncItem2 : list2) {
                    String str3 = frequencySyncItem2.scene;
                    if (str3 != null && str3.length() > 0 && (interfaceC12999056vLJ = C12985056h.LJ(str3)) != null) {
                        Map mapLJ2 = LJ(interfaceC12999056vLJ);
                        C12990056m.LIZ(str3, mapLJ2, frequencySyncItem2);
                        Iterator it5 = mapLJ2.values().iterator();
                        while (it5.hasNext()) {
                            ((InterfaceC12997056t) it5.next()).LJI();
                        }
                        C13002056y.LJIIIIZZ(C13002056y.LIZ, str3, jLongValue);
                    }
                }
            }
        }
    }
}
