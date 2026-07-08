package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS607S0100000_28;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0zCc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1886920zCc {
    public static InterfaceC1886910zCb LIZ;
    public static final Object LIZIZ = new Object();
    public static final Map<String, C1886940zCe> LIZJ = new HashMap();
    public static final Map<String, List<String>> LIZLLL = new HashMap();
    public static final Map<String, List<C1869300ykC>> LJ = new HashMap();
    public static final Map<String, List<C1869290ykB>> LJFF = new HashMap();
    public static final Map<String, InterfaceC830890Wid> LJI = new HashMap();
    public static final HashSet<String> LJII = new HashSet<>();
    public static final HashSet<String> LJIIIIZZ = new HashSet<>();
    public static final C054G LJIIIZ = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ));

    public static boolean LIZ(String str) {
        boolean zContainsKey;
        synchronized (LIZIZ) {
            try {
                zContainsKey = ((HashMap) LIZJ).containsKey(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return zContainsKey;
    }

    public static void LIZIZ(C1886940zCe c1886940zCe) {
        synchronized (LIZIZ) {
            try {
                String str = c1886940zCe.LIZIZ.LIZ;
                if (LIZ(str)) {
                    return;
                }
                ((HashMap) LIZJ).put(str, c1886940zCe);
                LIZLLL(c1886940zCe);
                LJ(c1886940zCe.LIZJ);
                LIZJ(c1886940zCe.LIZLLL);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LIZJ(List list) {
        Integer numValueOf;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C1869290ykB c1869290ykB = (C1869290ykB) it2.next();
            HashMap map = (HashMap) LJFF;
            if (map.get(c1869290ykB.LIZJ) == null) {
                map.put(c1869290ykB.LIZJ, new ArrayList());
            }
            List list2 = (List) map.get(c1869290ykB.LIZJ);
            if (list2 != null) {
                list2.add(c1869290ykB);
            }
        }
        for (String str : ((HashMap) LJFF).keySet()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("registerGameplay strategyKey ");
            sbLIZ.append(str);
            sbLIZ.append(", gameplays: ");
            List list3 = (List) ((HashMap) LJFF).get(str);
            if (list3 != null) {
                numValueOf = Integer.valueOf(list3.size());
            } else {
                numValueOf = null;
            }
            sbLIZ.append(numValueOf);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public static void LIZLLL(C1886940zCe c1886940zCe) {
        HashMap map = (HashMap) LIZLLL;
        if (map.get(c1886940zCe.LIZ) == null) {
            map.put(c1886940zCe.LIZ, new ArrayList());
        }
        List list = (List) map.get(c1886940zCe.LIZ);
        if (list != null) {
            list.add(c1886940zCe.LIZIZ.LIZ);
        }
    }

    public static void LJ(List list) {
        Integer numValueOf;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C1869300ykC c1869300ykC = (C1869300ykC) it2.next();
            HashMap map = (HashMap) LJ;
            if (map.get(c1869300ykC.LIZJ) == null) {
                map.put(c1869300ykC.LIZJ, new ArrayList());
            }
            List list2 = (List) map.get(c1869300ykC.LIZJ);
            if (list2 != null) {
                list2.add(c1869300ykC);
            }
        }
        for (String str : ((HashMap) LJ).keySet()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("registerTask strategyKey ");
            sbLIZ.append(str);
            sbLIZ.append(", tasks: ");
            List list3 = (List) ((HashMap) LJ).get(str);
            if (list3 != null) {
                numValueOf = Integer.valueOf(list3.size());
            } else {
                numValueOf = null;
            }
            sbLIZ.append(numValueOf);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public static InterfaceC830890Wid LJFF(C1869290ykB c1869290ykB) {
        List<C1869290ykB> list;
        HashMap map = (HashMap) LJFF;
        List list2 = (List) map.get(c1869290ykB.LIZJ);
        if (list2 != null) {
            C19719612Di.LJJIIJ(list2, new AwS607S0100000_28(c1869290ykB, 117), true);
            if (list2.isEmpty()) {
                map.remove(c1869290ykB.LIZJ);
            }
        }
        C1886940zCe c1886940zCe = (C1886940zCe) ((HashMap) LIZJ).get(c1869290ykB.LIZLLL);
        if (c1886940zCe != null && (list = c1886940zCe.LIZLLL) != null) {
            C19719612Di.LJJIIJ(list, new AwS607S0100000_28(c1869290ykB, 118), true);
            if (list.isEmpty() && c1886940zCe.LIZJ.isEmpty()) {
                return LJII(c1869290ykB.LIZLLL);
            }
        }
        return null;
    }

    public static InterfaceC830890Wid LJI(C1869300ykC c1869300ykC) {
        List<C1869300ykC> list;
        HashMap map = (HashMap) LJ;
        List list2 = (List) map.get(c1869300ykC.LIZJ);
        if (list2 != null) {
            C19719612Di.LJJIIJ(list2, new AwS607S0100000_28(c1869300ykC, 119), true);
            if (list2.isEmpty()) {
                map.remove(c1869300ykC.LIZJ);
            }
        }
        C1886940zCe c1886940zCe = (C1886940zCe) ((HashMap) LIZJ).get(c1869300ykC.LIZLLL);
        if (c1886940zCe != null && (list = c1886940zCe.LIZJ) != null) {
            C19719612Di.LJJIIJ(list, new AwS607S0100000_28(c1869300ykC, 120), true);
            if (list.isEmpty() && c1886940zCe.LIZLLL.isEmpty()) {
                return LJII(c1869300ykC.LIZLLL);
            }
        }
        return null;
    }

    public static InterfaceC830890Wid LJII(String str) {
        Integer numValueOf;
        C1886940zCe c1886940zCe = (C1886940zCe) ((HashMap) LIZJ).remove(str);
        if (c1886940zCe == null) {
            return null;
        }
        for (C1869300ykC c1869300ykC : c1886940zCe.LIZJ) {
            HashMap map = (HashMap) LJ;
            List list = (List) map.get(c1869300ykC.LIZJ);
            if (list != null) {
                C19719612Di.LJJIIJ(list, new AwS607S0100000_28(c1869300ykC, 121), true);
                if (list.isEmpty()) {
                    map.remove(c1869300ykC.LIZJ);
                }
            }
        }
        for (C1869290ykB c1869290ykB : c1886940zCe.LIZLLL) {
            HashMap map2 = (HashMap) LJFF;
            List list2 = (List) map2.get(c1869290ykB.LIZJ);
            if (list2 != null) {
                C19719612Di.LJJIIJ(list2, new AwS607S0100000_28(c1869290ykB, 122), true);
                if (list2.isEmpty()) {
                    map2.remove(c1869290ykB.LIZJ);
                }
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(':');
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Iterator<String> it2 = LJII.iterator();
        while (it2.hasNext()) {
            if (u.LJJIIJZLJL(it2.next(), strLIZIZ, false)) {
                it2.remove();
            }
        }
        Iterator<String> it3 = LJIIIIZZ.iterator();
        while (it3.hasNext()) {
            if (u.LJJIIJZLJL(it3.next(), strLIZIZ, false)) {
                it3.remove();
            }
        }
        String str2 = c1886940zCe.LIZ;
        String str3 = c1886940zCe.LIZIZ.LIZ;
        HashMap map3 = (HashMap) LIZLLL;
        List list3 = (List) map3.get(str2);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("removeSceneCampaignLocked sceneCampaigns : ");
        if (list3 != null) {
            numValueOf = Integer.valueOf(list3.size());
        } else {
            numValueOf = null;
        }
        sbLIZ2.append(numValueOf);
        C2188811AlT.LIZIZ(sbLIZ2);
        if (list3 == null) {
            return null;
        }
        list3.remove(str3);
        if (!list3.isEmpty()) {
            return null;
        }
        map3.remove(str2);
        return (InterfaceC830890Wid) ((HashMap) LJI).remove(str2);
    }
}
