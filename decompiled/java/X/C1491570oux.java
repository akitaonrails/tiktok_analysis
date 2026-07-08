package X;

import Y.ARunnableS92S0200000_23;
import android.os.HandlerThread;
import android.util.LruCache;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oux, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1491570oux {
    public static boolean LIZJ;
    public static boolean LIZLLL;
    public static InterfaceC1491580ouy LJ;
    public static BPEAHandler LJII;
    public static final C1491570oux LIZ = new C1491570oux();
    public static boolean LIZIZ = true;
    public static final Queue<Pair<EnumC1491590ouz, Object[]>> LJFF = new ArrayBlockingQueue(512);
    public static final LruCache<String, C1491620ov2> LJI = new LruCache<>(256);

    public static boolean LJIILIIL() {
        InterfaceC1491580ouy interfaceC1491580ouy;
        return LIZLLL && (interfaceC1491580ouy = LJ) != null && (interfaceC1491580ouy instanceof C1491550ouv);
    }

    public static Map LJ(String str) {
        String str2;
        Map<String, C1491620ov2> mapSnapshot = LJI.snapshot();
        LinkedHashMap linkedHashMap = null;
        if (mapSnapshot != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry<String, C1491620ov2> entry : mapSnapshot.entrySet()) {
                C1491620ov2 value = entry.getValue();
                if (value == null) {
                    str2 = null;
                } else {
                    str2 = value.LIZ;
                }
                if (Intrinsics.LJFF(str2, str)) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(C2097908Jt.LIZIZ(linkedHashMap2.size()));
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                linkedHashMap3.put(((C1491620ov2) entry2.getValue()).LIZIZ, entry2.getValue());
            }
            linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(linkedHashMap3.size()));
            for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
                linkedHashMap.put(entry3.getKey(), ((C1491620ov2) entry3.getValue()).LIZJ);
            }
        }
        return linkedHashMap;
    }

    public static void LJIILJJIL(C1491620ov2 c1491620ov2) {
        LruCache<String, C1491620ov2> lruCache = LJI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c1491620ov2.LIZ);
        sbLIZ.append(';');
        sbLIZ.append(c1491620ov2.LIZIZ);
        lruCache.put(C2188811AlT.LIZIZ(sbLIZ), c1491620ov2);
    }

    public static void LJIIZILJ(String str) {
        if (!LIZIZ) {
            return;
        }
        LJIIL(EnumC1491590ouz.SetPropertiesAliveState, str, Boolean.FALSE);
    }

    public static String LIZLLL(final String str, List list) {
        if (list.isEmpty()) {
            return null;
        }
        if (list.size() == 1) {
            return (String) C13LP.LJJJJZI(list);
        }
        ArrayList arrayList = new ArrayList(list);
        if (!(!arrayList.isEmpty())) {
            return null;
        }
        if (arrayList.size() > 1) {
            final long jCurrentTimeMillis = System.currentTimeMillis();
            C08XD.LJJ(arrayList, new Comparator() { // from class: X.0ov1
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int iIntValue;
                    Object objLJIILL;
                    Object objLJIILL2;
                    String str2 = str;
                    long j = jCurrentTimeMillis;
                    String str3 = (String) obj;
                    String str4 = (String) obj2;
                    InterfaceC1491580ouy interfaceC1491580ouy = C1491570oux.LJ;
                    int iIntValue2 = 0;
                    if (interfaceC1491580ouy != null && (objLJIILL2 = interfaceC1491580ouy.LJIILL(str3, str2, true)) != null && (objLJIILL2 instanceof Integer)) {
                        iIntValue = ((Number) objLJIILL2).intValue();
                    } else {
                        iIntValue = 0;
                    }
                    InterfaceC1491580ouy interfaceC1491580ouy2 = C1491570oux.LJ;
                    if (interfaceC1491580ouy2 != null && (objLJIILL = interfaceC1491580ouy2.LJIILL(str4, str2, true)) != null && (objLJIILL instanceof Integer)) {
                        iIntValue2 = ((Number) objLJIILL).intValue();
                    }
                    return Intrinsics.LJII(j - ((long) iIntValue), j - ((long) iIntValue2));
                }
            });
        }
        return (String) C13LP.LJJJJZI(arrayList);
    }

    public static void LJIIIZ(String str, InterfaceC1491630ov3 interfaceC1491630ov3) {
        if (!LIZIZ) {
            interfaceC1491630ov3.onReceiveValue(null);
        } else {
            LJIIL(EnumC1491590ouz.GetProperties, str, interfaceC1491630ov3);
        }
    }

    public static void LJIIL(EnumC1491590ouz enumC1491590ouz, Object... objArr) {
        Object objValueOf;
        BPEAHandler bPEAHandler;
        try {
            if (LJ == null) {
                objValueOf = Boolean.valueOf(((ArrayBlockingQueue) LJFF).offer(new Pair(enumC1491590ouz, objArr)));
            } else {
                LIZ.getClass();
                if (LIZIZ && (bPEAHandler = LJII) != null) {
                    C786410Ut5.LJJZZIII(bPEAHandler, new ARunnableS92S0200000_23(enumC1491590ouz, objArr, 65));
                }
                objValueOf = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(objValueOf);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static List LIZJ(String str, String str2, String str3) {
        String[] strArrLIZLLL;
        Object objLJIILL;
        ArrayList arrayList = new ArrayList();
        InterfaceC1491580ouy interfaceC1491580ouy = LJ;
        if (interfaceC1491580ouy != null && (strArrLIZLLL = interfaceC1491580ouy.LIZLLL(str2)) != null) {
            ArrayList<String> arrayList2 = new ArrayList();
            for (String str4 : strArrLIZLLL) {
                if (true ^ Intrinsics.LJFF(str4, str)) {
                    arrayList2.add(str4);
                }
            }
            if (arrayList2.size() == 1) {
                arrayList.add(C13LP.LJJJJZI(arrayList2));
                return arrayList;
            }
            for (String str5 : arrayList2) {
                InterfaceC1491580ouy interfaceC1491580ouy2 = LJ;
                Object objLJIILL2 = null;
                if (interfaceC1491580ouy2 == null) {
                    objLJIILL = null;
                } else {
                    objLJIILL = interfaceC1491580ouy2.LJIILL(str5, str3, true);
                }
                InterfaceC1491580ouy interfaceC1491580ouy3 = LJ;
                if (interfaceC1491580ouy3 != null) {
                    objLJIILL2 = interfaceC1491580ouy3.LJIILL(str, str3, false);
                }
                if (Intrinsics.LJFF(objLJIILL, objLJIILL2)) {
                    arrayList.add(str5);
                }
            }
        }
        return arrayList;
    }

    public static void LJI(C1491570oux c1491570oux, String str, InterfaceC1491630ov3 interfaceC1491630ov3) {
        c1491570oux.getClass();
        if (!LIZIZ) {
            interfaceC1491630ov3.onReceiveValue(null);
        } else {
            LJIIL(EnumC1491590ouz.GetContextProperties, str, "", interfaceC1491630ov3);
        }
    }

    public static void LJII(List list, String str, InterfaceC1491630ov3 interfaceC1491630ov3) {
        if (!LIZIZ) {
            interfaceC1491630ov3.onReceiveValue(null);
        } else {
            LJIIL(EnumC1491590ouz.GetLatestContextId, list, str, interfaceC1491630ov3);
        }
    }

    public static void LJIIIIZZ(String str, String str2, InterfaceC1491630ov3 interfaceC1491630ov3) {
        if (!LIZIZ) {
            interfaceC1491630ov3.onReceiveValue(null);
        } else {
            LJIIL(EnumC1491590ouz.GetOrCreateArrayElement, str, str2, interfaceC1491630ov3);
        }
    }

    public static void LJIIJJI(C1491510our c1491510our, C1491770ovH c1491770ovH, C1491760ovG c1491760ovG) {
        BPEAHandler bPEAHandler;
        if (LIZIZ && !LIZJ) {
            JSONObject jSONObject = new JSONObject(c1491510our.LIZIZ);
            int iOptInt = jSONObject.optInt("version", -1);
            LIZLLL = jSONObject.optBoolean("_exp_key_opt_ahead", false);
            if (iOptInt == 2) {
                LJ = new C1491550ouv();
            } else {
                LJ = new C1491300ouW();
            }
            HandlerThread handlerThread = new HandlerThread("SparkTracingThread");
            handlerThread.start();
            LJII = new BPEAHandler(C786410Ut5.W2(handlerThread));
            InterfaceC1491580ouy interfaceC1491580ouy = LJ;
            if (interfaceC1491580ouy != null) {
                interfaceC1491580ouy.LJIIL(c1491510our, c1491770ovH, c1491760ovG);
            }
            if (LJ != null) {
                while (true) {
                    Queue<Pair<EnumC1491590ouz, Object[]>> queue = LJFF;
                    if (!(!queue.isEmpty())) {
                        break;
                    }
                    Pair pair = (Pair) ((ArrayBlockingQueue) queue).poll();
                    if (pair != null) {
                        EnumC1491590ouz enumC1491590ouz = (EnumC1491590ouz) pair.getFirst();
                        Object[] objArr = (Object[]) pair.getSecond();
                        if (LIZIZ && (bPEAHandler = LJII) != null) {
                            C786410Ut5.LJJZZIII(bPEAHandler, new ARunnableS92S0200000_23(enumC1491590ouz, objArr, 65));
                        }
                    }
                }
                LJI.evictAll();
            }
            LIZJ = true;
        }
    }

    public static /* synthetic */ void LJIILLIIL(C1491570oux c1491570oux, String str, Map map) {
        EnumC1491540ouu enumC1491540ouu = EnumC1491540ouu.DEFAULT;
        EnumC1491530out enumC1491530out = EnumC1491530out.MEMORY_AND_DISK;
        c1491570oux.getClass();
        LJIILL(str, map, enumC1491540ouu, enumC1491530out);
    }

    public static void LJIJJ(String str, String str2, EnumC1491500ouq enumC1491500ouq) {
        if (!LIZIZ) {
            return;
        }
        LJIIL(EnumC1491590ouz.UpdateLink, str, str2, enumC1491500ouq);
    }

    public static void LIZ(long j, String str, boolean z, boolean z2) {
        if (!LIZIZ) {
            return;
        }
        LJIIL(EnumC1491590ouz.CreateProperties, str, Long.valueOf(j), Boolean.valueOf(z), Boolean.valueOf(z2));
    }

    public static void LJFF(String str, String str2, String str3, InterfaceC1491630ov3 interfaceC1491630ov3) {
        if (!LIZIZ) {
            interfaceC1491630ov3.onReceiveValue(null);
        } else {
            LJIIL(EnumC1491590ouz.GetAssociatedContextIds, str, str2, str3, interfaceC1491630ov3);
        }
    }

    public static void LJIIJ(String str, String str2, boolean z, InterfaceC1491630ov3 interfaceC1491630ov3) {
        try {
            if (!LIZIZ) {
                interfaceC1491630ov3.onReceiveValue(null);
                return;
            }
            C1491570oux c1491570oux = LIZ;
            EnumC1491590ouz enumC1491590ouz = EnumC1491590ouz.GetProperty;
            Object[] objArr = {str, str2, Boolean.valueOf(z), interfaceC1491630ov3};
            c1491570oux.getClass();
            LJIIL(enumC1491590ouz, objArr);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static void LJIILL(String str, Map map, EnumC1491540ouu enumC1491540ouu, EnumC1491530out enumC1491530out) {
        boolean z;
        InterfaceC1491580ouy interfaceC1491580ouy;
        if (!LIZIZ) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            C1491570oux c1491570oux = LIZ;
            Object value = entry.getValue();
            c1491570oux.getClass();
            if (!(value instanceof Number) && !(value instanceof String)) {
                z = value instanceof Boolean;
            } else {
                z = true;
            }
            if (LJIILIIL()) {
                if (z && (interfaceC1491580ouy = LJ) != null && interfaceC1491580ouy.LJIIJ(String.valueOf(entry.getKey()), enumC1491540ouu)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            } else if (z) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (linkedHashMap.isEmpty()) {
            return;
        }
        if (LJ == null) {
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                C1491570oux c1491570oux2 = LIZ;
                C1491620ov2 c1491620ov2 = new C1491620ov2(str, String.valueOf(entry2.getKey()), entry2.getValue());
                c1491570oux2.getClass();
                LJIILJJIL(c1491620ov2);
            }
        }
        LJIIL(EnumC1491590ouz.SetProperties, str, linkedHashMap, enumC1491540ouu, enumC1491530out);
    }

    public static /* synthetic */ void LJIJI(C1491570oux c1491570oux, String str, String str2, Object obj) {
        EnumC1491540ouu enumC1491540ouu = EnumC1491540ouu.DEFAULT;
        EnumC1491530out enumC1491530out = EnumC1491530out.MEMORY_AND_DISK;
        c1491570oux.getClass();
        LJIJ(str, str2, obj, enumC1491540ouu, enumC1491530out);
    }

    public static void LJIJ(String str, String str2, Object obj, EnumC1491540ouu enumC1491540ouu, EnumC1491530out enumC1491530out) {
        InterfaceC1491580ouy interfaceC1491580ouy;
        if (LIZIZ) {
            if (!(obj instanceof Number) && !(obj instanceof String) && !(obj instanceof Boolean)) {
                return;
            }
            if (LJIILIIL() && (interfaceC1491580ouy = LJ) != null && !interfaceC1491580ouy.LJIIJ(str2, enumC1491540ouu)) {
                return;
            }
            if (LJ == null) {
                LJIILJJIL(new C1491620ov2(str, str2, obj));
            }
            LJIIL(EnumC1491590ouz.SetProperty, str, str2, obj, enumC1491540ouu, enumC1491530out);
        }
    }
}
