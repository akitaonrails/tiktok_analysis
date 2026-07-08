package X;

import Y.AComparatorS27S0000000_8;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0M1l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C561750M1l {
    public static final long LIZJ(C0M0P c0m0p) {
        long j = c0m0p.LJIIIZ;
        if (j <= 0) {
            return c0m0p.LJIIJ;
        }
        return j;
    }

    public static List LIZ(List list, C0M22 c0m22) {
        List listLJLLLL;
        EnumC561760M1m enumC561760M1m;
        long jCurrentTimeMillis = System.currentTimeMillis();
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (hashSet.add(((C0M0P) obj).LJ)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((C0M0P) obj2).LJIILIIL == EnumC545550LaT.NONE) {
                arrayList2.add(obj2);
            }
        }
        long jLIZ = ((long) c0m22.LIZ()) * 2592000000L;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj3 : arrayList2) {
            long jLIZJ = jCurrentTimeMillis - LIZJ((C0M0P) obj3);
            if (jLIZJ > jLIZ) {
                enumC561760M1m = EnumC561760M1m.HALF_YEAR_AGO;
            } else if (jLIZJ > 7776000000L) {
                enumC561760M1m = EnumC561760M1m.THREE_MONTHS_AGO;
            } else if (jLIZJ > 2592000000L) {
                enumC561760M1m = EnumC561760M1m.ONE_MONTH_AGO;
            } else {
                enumC561760M1m = EnumC561760M1m.WITHIN_MONTH;
            }
            Object arrayList3 = linkedHashMap.get(enumC561760M1m);
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                linkedHashMap.put(enumC561760M1m, arrayList3);
            }
            ((List) arrayList3).add(obj3);
        }
        List<EnumC561760M1m> listLJIIJJI = C1697810uHb.LJIIJJI(EnumC561760M1m.HALF_YEAR_AGO, EnumC561760M1m.THREE_MONTHS_AGO, EnumC561760M1m.ONE_MONTH_AGO, EnumC561760M1m.WITHIN_MONTH);
        ArrayList arrayList4 = new ArrayList();
        for (EnumC561760M1m enumC561760M1m2 : listLJIIJJI) {
            List list2 = (List) linkedHashMap.get(enumC561760M1m2);
            if (list2 == null) {
                list2 = C13BV.INSTANCE;
            }
            if (!list2.isEmpty()) {
                if (c0m22 instanceof C0M20) {
                    listLJLLLL = C13LP.LJLLLL(new AComparatorS27S0000000_8(13), list2);
                } else if (c0m22 instanceof C561890M1z) {
                    listLJLLLL = C13LP.LJLLLL(new AComparatorS27S0000000_8(14), list2);
                } else {
                    throw new C1954807lC();
                }
                C561770M1n c561770M1n = new C561770M1n(enumC561760M1m2);
                Iterator it2 = list2.iterator();
                long j = 0;
                while (it2.hasNext()) {
                    j += ((C0M0P) it2.next()).LJI;
                }
                arrayList4.add(new C0M2A(c561770M1n, listLJLLLL, j));
            }
        }
        return arrayList4;
    }

    public static final List LIZIZ(long j, List list) {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (hashSet.add(((C0M0P) obj).LJ)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((C0M0P) obj2).LJIILIIL == EnumC545550LaT.NONE) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : arrayList2) {
            if (((C0M0P) obj3).LJI >= j) {
                arrayList3.add(obj3);
            } else {
                arrayList4.add(obj3);
            }
        }
        Pair pair = new Pair(arrayList3, arrayList4);
        List<Pair> listLJIIJJI = C1697810uHb.LJIIJJI(new Pair(Boolean.TRUE, pair.getFirst()), new Pair(Boolean.FALSE, pair.getSecond()));
        ArrayList arrayList5 = new ArrayList();
        for (Pair pair2 : listLJIIJJI) {
            boolean zBooleanValue = ((Boolean) pair2.getFirst()).booleanValue();
            List list2 = (List) pair2.getSecond();
            if (!list2.isEmpty()) {
                C561780M1o c561780M1o = new C561780M1o(zBooleanValue);
                List listLJLLLL = C13LP.LJLLLL(new AComparatorS27S0000000_8(15), list2);
                Iterator it2 = list2.iterator();
                long j2 = 0;
                while (it2.hasNext()) {
                    j2 += ((C0M0P) it2.next()).LJI;
                }
                arrayList5.add(new C0M2A(c561780M1o, listLJLLLL, j2));
            }
        }
        return arrayList5;
    }
}
