package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0rfY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1597340rfY {
    public final Map<EnumC1597060rf6, InterfaceC1597360rfa<?>> LIZ;
    public final InterfaceC088400Uw LIZIZ;
    public final C1160320gIg LIZJ;

    public final List LIZ(C1597350rfZ c1597350rfZ, Map map) {
        InterfaceC1597360rfa<?> interfaceC1597360rfa;
        List list;
        InterfaceC1597360rfa<?> interfaceC1597360rfa2;
        List<? extends T> list2;
        int iIntValue;
        List<EnumC1597060rf6> listLIZ;
        int iIntValue2;
        Set setKeySet = map.keySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj : setKeySet) {
            if (linkedHashMap.get(obj) == null) {
                linkedHashMap.put(obj, 0);
            }
            if (linkedHashMap2.get(obj) == null) {
                linkedHashMap2.put(obj, new ArrayList());
            }
        }
        for (Object obj2 : setKeySet) {
            InterfaceC1597360rfa<?> interfaceC1597360rfa3 = this.LIZ.get(obj2);
            if (interfaceC1597360rfa3 == null || (listLIZ = interfaceC1597360rfa3.LIZ()) == null) {
                listLIZ = C13BV.INSTANCE;
            }
            for (EnumC1597060rf6 enumC1597060rf6 : listLIZ) {
                if (setKeySet.contains(enumC1597060rf6)) {
                    Object arrayList = linkedHashMap2.get(enumC1597060rf6);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap2.put(enumC1597060rf6, arrayList);
                    }
                    ((List) arrayList).add(obj2);
                    Integer num = (Integer) linkedHashMap.get(obj2);
                    if (num != null) {
                        iIntValue2 = num.intValue();
                    } else {
                        iIntValue2 = 0;
                    }
                    linkedHashMap.put(obj2, Integer.valueOf(iIntValue2 + 1));
                }
            }
        }
        C13E8 c13e8 = new C13E8();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            if (((Number) entry.getValue()).intValue() == 0) {
                c13e8.addLast(key);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        while (!c13e8.isEmpty()) {
            Object objRemoveFirst = c13e8.removeFirst();
            arrayList2.add(objRemoveFirst);
            List list3 = (List) linkedHashMap2.get(objRemoveFirst);
            if (list3 == null) {
                list3 = C13BV.INSTANCE;
            }
            for (Object obj3 : list3) {
                Integer num2 = (Integer) linkedHashMap.get(obj3);
                if (num2 != null) {
                    iIntValue = num2.intValue();
                } else {
                    iIntValue = 1;
                }
                int i = iIntValue - 1;
                linkedHashMap.put(obj3, Integer.valueOf(i));
                if (i == 0) {
                    c13e8.addLast(obj3);
                }
            }
        }
        if (arrayList2.size() < setKeySet.size()) {
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("topologicalSort: cycle detected, ");
            sbLIZ.append(setKeySet.size() - arrayList2.size());
            sbLIZ.append(" nodes unreachable, appending them");
            C1720106oR.LIZ("SkylightDataPipeline", C2188811AlT.LIZIZ(sbLIZ));
            for (Object obj4 : setKeySet) {
                if (!arrayList2.contains(obj4)) {
                    arrayList2.add(obj4);
                }
            }
        }
        int i3 = C2187451AjH.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("process start, processingOrder=");
        sbLIZ2.append(arrayList2);
        C2188811AlT.LIZIZ(sbLIZ2);
        long jCurrentTimeMillis = System.currentTimeMillis();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(map);
        for (Object obj5 : arrayList2) {
            InterfaceC1597360rfa<?> interfaceC1597360rfa4 = this.LIZ.get(obj5);
            if ((interfaceC1597360rfa4 instanceof InterfaceC1597360rfa) && (interfaceC1597360rfa2 = interfaceC1597360rfa4) != null && (list2 = (List) linkedHashMap3.get(obj5)) != 0) {
                List<InterfaceC1160280gIc<T>> listLIZIZ = interfaceC1597360rfa2.LIZIZ(list2);
                if (!listLIZIZ.isEmpty()) {
                    this.LIZJ.getClass();
                    List listLIZIZ2 = C1160320gIg.LIZIZ(listLIZIZ);
                    C1160320gIg c1160320gIg = this.LIZJ;
                    C1597490rfn c1597490rfn = c1597350rfZ.LIZ;
                    c1160320gIg.getClass();
                    List listLIZ2 = C1160320gIg.LIZ(listLIZIZ2, list2, c1597490rfn);
                    int i4 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("localTransform bizType=");
                    sbLIZ3.append(obj5);
                    sbLIZ3.append(", ops=");
                    sbLIZ3.append(listLIZIZ.size());
                    sbLIZ3.append(", before=");
                    sbLIZ3.append(list2.size());
                    sbLIZ3.append(", after=");
                    sbLIZ3.append(listLIZ2.size());
                    C2188811AlT.LIZIZ(sbLIZ3);
                    linkedHashMap3.put(obj5, listLIZ2);
                }
            }
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(linkedHashMap3);
        for (Object obj6 : arrayList2) {
            InterfaceC1597360rfa<?> interfaceC1597360rfa5 = this.LIZ.get(obj6);
            if ((interfaceC1597360rfa5 instanceof InterfaceC1597360rfa) && (interfaceC1597360rfa = interfaceC1597360rfa5) != null && (list = (List) linkedHashMap4.get(obj6)) != null) {
                List listLIZJ = interfaceC1597360rfa.LIZJ(new C1597310rfV(c1597350rfZ.LIZ, linkedHashMap4, c1597350rfZ.LIZIZ, c1597350rfZ.LIZJ, c1597350rfZ.LIZLLL), list);
                if (!listLIZJ.isEmpty()) {
                    this.LIZJ.getClass();
                    List listLIZIZ3 = C1160320gIg.LIZIZ(listLIZJ);
                    C1160320gIg c1160320gIg2 = this.LIZJ;
                    C1597490rfn c1597490rfn2 = c1597350rfZ.LIZ;
                    c1160320gIg2.getClass();
                    List listLIZ3 = C1160320gIg.LIZ(listLIZIZ3, list, c1597490rfn2);
                    int i5 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("reconcile bizType=");
                    sbLIZ4.append(obj6);
                    sbLIZ4.append(", ops=");
                    sbLIZ4.append(listLIZJ.size());
                    sbLIZ4.append(", before=");
                    sbLIZ4.append(list.size());
                    sbLIZ4.append(", after=");
                    sbLIZ4.append(listLIZ3.size());
                    C2188811AlT.LIZIZ(sbLIZ4);
                    linkedHashMap4.put(obj6, listLIZ3);
                }
            }
        }
        String strLJI = C13LE.LIZ(this.LIZIZ.getClass()).LJI();
        List listLIZ4 = this.LIZIZ.LIZ(c1597350rfZ, arrayList2, linkedHashMap4);
        int i6 = C2187451AjH.LIZ;
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("sort strategy=");
        sbLIZ5.append(strLJI);
        sbLIZ5.append(", resultSize=");
        sbLIZ5.append(listLIZ4.size());
        C2188811AlT.LIZIZ(sbLIZ5);
        Pair pair = new Pair(listLIZ4, Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        List list4 = (List) pair.getFirst();
        long jLongValue = ((Number) pair.getSecond()).longValue();
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append("process done, sortedSize=");
        sbLIZ6.append(list4.size());
        sbLIZ6.append(", elapsed=");
        sbLIZ6.append(jLongValue);
        sbLIZ6.append("ms");
        C2188811AlT.LIZIZ(sbLIZ6);
        return list4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1597340rfY(Map<EnumC1597060rf6, ? extends InterfaceC1597360rfa<?>> map, InterfaceC088400Uw interfaceC088400Uw, C1160320gIg c1160320gIg) {
        this.LIZ = map;
        this.LIZIZ = interfaceC088400Uw;
        this.LIZJ = c1160320gIg;
    }
}
