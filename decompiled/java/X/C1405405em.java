package X;

import Y.AComparatorS21S0000000_2;
import Y.AComparatorS501S0100000_2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.05em, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1405405em {
    public static final InterfaceC346201Wa<AbstractC1406905f1> LIZ(InterfaceC346201Wa<C1346605Ou> interfaceC346201Wa, Map<String, Integer> map) {
        int iIntValue;
        LinkedHashMap linkedHashMap;
        ArrayList<Pair> arrayList = new ArrayList(map.size());
        Iterator it2 = ((LinkedHashMap) map).entrySet().iterator();
        while (true) {
            iIntValue = 0;
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it2.next();
            Object key = entry.getKey();
            int iIntValue2 = ((Number) entry.getValue()).intValue();
            if (iIntValue2 >= 0) {
                iIntValue = iIntValue2;
            }
            arrayList.add(new Pair(key, Integer.valueOf(iIntValue)));
        }
        if (arrayList.isEmpty()) {
            C201955140j.LJIJJ(C0LX3.LIZIZ, "AIGCWorkflowGeneralProgressCalculator", "generalProgressEvents called with empty weights — passing node states through without aggregation");
            return new C1768806wI(new C095D(new C1346405Os(interfaceC346201Wa, null)), 18);
        }
        int i = 16;
        if (arrayList.size() > 100) {
            List listLL = C13LP.LL(C13LP.LJLLLL(new AComparatorS501S0100000_2(new AComparatorS21S0000000_2(21), 7), arrayList), 100);
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLL, 10));
            Iterator it3 = listLL.iterator();
            while (it3.hasNext()) {
                arrayList2.add(((Pair) it3.next()).getFirst());
            }
            Set setLLIIJI = C13LP.LLIIJI(arrayList2);
            int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(arrayList, 10));
            if (iLIZIZ >= 16) {
                i = iLIZIZ;
            }
            linkedHashMap = new LinkedHashMap(i);
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                Object first = ((Pair) it4.next()).getFirst();
                Pair pair = new Pair(first, Integer.valueOf(setLLIIJI.contains(first) ? 1 : 0));
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            }
        } else {
            Iterator it5 = arrayList.iterator();
            while (it5.hasNext()) {
                iIntValue += ((Number) ((Pair) it5.next()).getSecond()).intValue();
            }
            if (iIntValue <= 0) {
                int size = 100 / arrayList.size();
                int size2 = 100 - (arrayList.size() * size);
                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                Iterator it6 = arrayList.iterator();
                while (it6.hasNext()) {
                    arrayList3.add(((Pair) it6.next()).getFirst());
                }
                Set setLLIIJI2 = C13LP.LLIIJI(C13LP.LL(C13LP.LJLLJ(arrayList3), size2));
                int iLIZIZ2 = C2097908Jt.LIZIZ(C15438062q.LJIJJ(arrayList, 10));
                if (iLIZIZ2 >= 16) {
                    i = iLIZIZ2;
                }
                linkedHashMap = new LinkedHashMap(i);
                Iterator it7 = arrayList.iterator();
                while (it7.hasNext()) {
                    Object first2 = ((Pair) it7.next()).getFirst();
                    Pair pair2 = new Pair(first2, Integer.valueOf((setLLIIJI2.contains(first2) ? 1 : 0) + size));
                    linkedHashMap.put(pair2.getFirst(), pair2.getSecond());
                }
            } else {
                int iLIZIZ3 = C2097908Jt.LIZIZ(C15438062q.LJIJJ(arrayList, 10));
                if (iLIZIZ3 < 16) {
                    iLIZIZ3 = 16;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iLIZIZ3);
                for (Pair pair3 : arrayList) {
                    Pair pair4 = new Pair(pair3.getFirst(), Double.valueOf((((double) 100) * ((double) ((Number) pair3.getSecond()).intValue())) / ((double) iIntValue)));
                    linkedHashMap2.put(pair4.getFirst(), pair4.getSecond());
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(C2097908Jt.LIZIZ(linkedHashMap2.size()));
                for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                    linkedHashMap3.put(entry2.getKey(), Integer.valueOf((int) Math.floor(((Number) entry2.getValue()).doubleValue())));
                }
                LinkedHashMap linkedHashMap4 = new LinkedHashMap(C2097908Jt.LIZIZ(linkedHashMap2.size()));
                for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                    linkedHashMap4.put(entry3.getKey(), Double.valueOf(((Number) entry3.getValue()).doubleValue() - ((Number) C2097608Jq.LJFF(entry3.getKey(), linkedHashMap3)).doubleValue()));
                }
                List listLL2 = C13LP.LL(C13LP.LJLLLL(new AComparatorS501S0100000_2(new AComparatorS21S0000000_2(22), 8), linkedHashMap4.entrySet()), 100 - C13LP.LJZI(linkedHashMap3.values()));
                ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(listLL2, 10));
                Iterator it8 = listLL2.iterator();
                while (it8.hasNext()) {
                    arrayList4.add(((Map.Entry) it8.next()).getKey());
                }
                Set setLLIIJI3 = C13LP.LLIIJI(arrayList4);
                int iLIZIZ4 = C2097908Jt.LIZIZ(C15438062q.LJIJJ(arrayList, 10));
                if (iLIZIZ4 >= 16) {
                    i = iLIZIZ4;
                }
                linkedHashMap = new LinkedHashMap(i);
                Iterator it9 = arrayList.iterator();
                while (it9.hasNext()) {
                    Object first3 = ((Pair) it9.next()).getFirst();
                    Pair pair5 = new Pair(first3, Integer.valueOf(((Number) C2097608Jq.LJFF(first3, linkedHashMap3)).intValue() + (setLLIIJI3.contains(first3) ? 1 : 0)));
                    linkedHashMap.put(pair5.getFirst(), pair5.getSecond());
                }
            }
        }
        final C00H5 c00h5 = new C00H5(linkedHashMap);
        final C118300cf c118300cf = new C118300cf();
        C201955140j.LIZLLL(C0LX3.LIZIZ, "AIGCWorkflowGeneralProgressCalculator", "generalProgressEvents initialized with normalizedWeights: " + linkedHashMap);
        final C095D c095d = new C095D(new C1346405Os(interfaceC346201Wa, null));
        return new InterfaceC346201Wa<AbstractC1406905f1>() { // from class: X.05en
            @Override // X.InterfaceC346201Wa
            public final Object collect(InterfaceC346701Wf<? super AbstractC1406905f1> interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
                Object objCollect = c095d.collect(new C1405805eq(interfaceC346701Wf, c118300cf, c00h5, 100), interfaceC1364105Vn);
                if (objCollect == C099R.LJFF()) {
                    return objCollect;
                }
                return Unit.LIZ;
            }
        };
    }
}
