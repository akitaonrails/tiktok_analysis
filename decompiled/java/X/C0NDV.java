package X;

import android.os.Looper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS10S1010000_9;
import kotlin.jvm.internal.AwS410S0200000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0NDV, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NDV {
    public static final C0NDV LIZ = new C0NDV();
    public static final C01GW LIZIZ;
    public static final ArrayList<C590280NDe> LIZJ;
    public static final Map<String, C590280NDe> LIZLLL;
    public static final C01GW LJ;
    public static final Map<String, C0NDI> LJFF;

    static {
        new HashSet();
        LIZIZ = C452501pT.LIZIZ(new C07JP());
        LIZJ = new ArrayList<>();
        LIZLLL = new LinkedHashMap();
        LJ = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, new C0NDY());
        LJFF = new LinkedHashMap();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.ArrayList] */
    public static List LIZIZ() {
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = new ArrayList();
        if (!LJIIJ()) {
            return (List) c259800zU.element;
        }
        LJIILIIL(new AwS553S0100000_9(c259800zU, (C259800zU<List<String>>) 65));
        return (List) c259800zU.element;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T, X.13BV] */
    public static List LIZJ() {
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = C13BV.INSTANCE;
        if (!LJIIJ()) {
            return (List) c259800zU.element;
        }
        LJIILIIL(new AwS553S0100000_9(c259800zU, (C259800zU<List<String>>) 66));
        return (List) c259800zU.element;
    }

    public static C0NDX LJII() {
        return (C0NDX) LJ.getValue();
    }

    public static boolean LJIIJ() {
        return ((Boolean) LIZIZ.getValue()).booleanValue();
    }

    public static void LJIIL() {
        if (C797930VRv.LIZ()) {
            ArrayList<C590280NDe> arrayList = LIZJ;
            if (arrayList.isEmpty()) {
                arrayList.addAll(LIZJ());
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("logDBChange init ");
                sbLIZ.append(arrayList.size());
                C797930VRv.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.Map] */
    public static Map LIZ(List list) {
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = C2097608Jq.LJ();
        if (list.isEmpty()) {
            return (Map) c259800zU.element;
        }
        if (!LJIIJ()) {
            return (Map) c259800zU.element;
        }
        LJIILIIL(new AwS410S0200000_9(list, c259800zU, 10));
        return (Map) c259800zU.element;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.ArrayList] */
    public static List LIZLLL(List list) {
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = new ArrayList();
        LJIILIIL(new C590270NDd(list, c259800zU));
        return (List) c259800zU.element;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.ArrayList] */
    public static List LJ(List list) {
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = new ArrayList();
        if (!LJIIJ()) {
            return (List) c259800zU.element;
        }
        LJIILIIL(new C0NDW(list, c259800zU));
        return (List) c259800zU.element;
    }

    public static C590280NDe LJI(String str) {
        if (str != null && str.length() != 0) {
            Map<String, C590280NDe> map = LIZLLL;
            if (map.containsKey(str)) {
                return (C590280NDe) ((LinkedHashMap) map).get(str);
            }
            return null;
        }
        return null;
    }

    public static void LJIILIIL(Function0 function0) {
        try {
            if (((Boolean) C0BJL.LIZ.getValue()).booleanValue() && Intrinsics.LJFF(Looper.getMainLooper().getThread(), C786410Ut5.u3())) {
                C797930VRv.LIZ();
                C23250099c.LJ(C23271099x.INSTANCE, new C411701it(function0, null));
            } else {
                function0.invoke();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (C797930VRv.LIZ()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("runCatching e");
                sbLIZ.append(C13SZ.LIZIZ(th));
                C797930VRv.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    public static List LJFF(List list, List list2) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        if ((!list.isEmpty()) && (!list2.isEmpty())) {
            int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list2, 10));
            if (iLIZIZ < 16) {
                iLIZIZ = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
            for (Object obj2 : list2) {
                linkedHashMap.put(((C5186020i) obj2).aweme_id, obj2);
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Aweme aweme = (Aweme) it2.next();
                if (aweme != null && (obj = linkedHashMap.get(aweme.getAid())) != null) {
                    arrayList.add(obj);
                }
            }
        }
        if (list2.size() != arrayList.size()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getCorrespondAwemeStructV2List ");
            sbLIZ.append(C13LP.LJJLIIIJ(list2, ",", null, null, 0, null, AFwS240S0000000_9.get$arr$(60), 30));
            sbLIZ.append(" -> ");
            sbLIZ.append(C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, AFwS240S0000000_9.get$arr$(61), 30));
            C2188811AlT.LIZIZ(sbLIZ);
        }
        return arrayList;
    }

    public static void LJIIJJI(String str, List list) {
        if (C797930VRv.LIZ()) {
            List listLIZJ = LIZJ();
            ArrayList<C590280NDe> arrayList = LIZJ;
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator<C590280NDe> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(it2.next().LIZ);
            }
            Set setLLIIJI = C13LP.LLIIJI(arrayList2);
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(listLIZJ, 10));
            Iterator it3 = listLIZJ.iterator();
            while (it3.hasNext()) {
                arrayList3.add(((C590280NDe) it3.next()).LIZ);
            }
            Set setLLIIJI2 = C13LP.LLIIJI(arrayList3);
            ArrayList<C590280NDe> arrayList4 = LIZJ;
            arrayList4.clear();
            arrayList4.addAll(listLIZJ);
            Set setLJII = C15442062u.LJII(setLLIIJI2, setLLIIJI);
            Set setLJII2 = C15442062u.LJII(setLLIIJI, setLLIIJI2);
            if ((!setLJII.isEmpty()) || (!setLJII2.isEmpty())) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("logDBChange ");
                sbLIZ.append(str);
                sbLIZ.append(':');
                sbLIZ.append(C13LP.LJJLIIIJ(list, ",", null, null, 0, null, null, 62));
                sbLIZ.append(" \nadd:");
                sbLIZ.append(C13LP.LJJLIIIJ(setLJII, ",", null, null, 0, null, null, 62));
                sbLIZ.append("; remove:");
                sbLIZ.append(C13LP.LJJLIIIJ(setLJII2, ",", null, null, 0, null, null, 62));
                sbLIZ.append(' ');
                C797930VRv.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    public static void LJIILJJIL(String str, boolean z) {
        if (!LJIIJ() || a0.LJJJIL(str)) {
            return;
        }
        LJIILIIL(new AwS10S1010000_9(str, z, 0));
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [T, java.util.List] */
    public static void LJIIIIZZ(List list, String str, int i, Map map, C0NDM c0ndm) {
        if (C797930VRv.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cachePbFeedResult with DB，awemeList ");
            sbLIZ.append(C13LP.LJJLIIIJ(list, ",", null, null, 0, null, AFwS240S0000000_9.get$arr$(62), 30));
            C797930VRv.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = C1697810uHb.LJIILJJIL(Long.valueOf(-1));
        if (!LJIIJ()) {
            return;
        }
        LJIILIIL(new C0NDT(list, i, c259800zU, map, c0ndm, str, System.currentTimeMillis()));
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [T, java.util.List] */
    public static List LJIIIZ(String str, List list, List list2, int i, Map map, C0NDM c0ndm) {
        if (C797930VRv.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cachePbFeedResult with DB without json，sourceType:");
            sbLIZ.append(c0ndm);
            sbLIZ.append(" awemeList ");
            sbLIZ.append(C13LP.LJJLIIIJ(list2, ",", null, null, 0, null, AFwS228S0000000_1.get$arr$(35), 30));
            C797930VRv.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = C1697810uHb.LJIILJJIL(Long.valueOf(-1));
        if (!LJIIJ()) {
            return (List) c259800zU.element;
        }
        LJIILIIL(new C0NDS(list2, i, c259800zU, list, c0ndm, map, str, System.currentTimeMillis()));
        return (List) c259800zU.element;
    }
}
