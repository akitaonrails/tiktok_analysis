package X;

import com.ss.android.ugc.aweme.inbox.widget.multi.InboxEntrancePod;
import com.ss.android.ugc.aweme.notice.api.bean.EntranceKey;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceCell;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZAH, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZAH {
    public static final C0ZAH LIZ = new C0ZAH();
    public static AnonymousClass0956 LIZIZ;
    public static C0ZA8 LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v20, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.util.HashMap, java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.HashMap, java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v39, types: [java.util.Map] */
    public static Pair LIZ(Pair pair) {
        Object first;
        int i;
        int i2;
        ?? linkedHashMap;
        ?? linkedHashMap2;
        Map mapLJJIJLIJ;
        Map mapLJJIJL;
        int i3;
        int i4;
        int i5;
        Object next;
        int iIntValue;
        int iIntValue2;
        Object objLIZ;
        Integer numValueOf;
        Object objLIZ2;
        String str;
        InboxEntrancePod inboxEntrancePod;
        InboxEntranceCell inboxEntranceCell;
        InboxEntrancePod inboxEntrancePod2;
        InboxEntranceCell inboxEntranceCell2;
        InboxEntrancePod inboxEntrancePod3;
        Integer num;
        String str2;
        int i6;
        Object next2;
        int iIntValue3;
        int iIntValue4;
        Object objLIZ3;
        Integer numValueOf2;
        Object objLIZ4;
        String str3;
        InboxEntrancePod inboxEntrancePod4;
        InboxEntranceCell inboxEntranceCell3;
        InboxEntrancePod inboxEntrancePod5;
        InboxEntranceCell inboxEntranceCell4;
        InboxEntrancePod inboxEntrancePod6;
        Integer num2;
        String str4;
        int i7;
        Object next3;
        int iIntValue5;
        Object objLIZ5;
        Integer numValueOf3;
        Object objLIZ6;
        String str5;
        InboxEntrancePod inboxEntrancePod7;
        InboxEntranceCell inboxEntranceCell5;
        InboxEntrancePod inboxEntrancePod8;
        InboxEntranceCell inboxEntranceCell6;
        int i8;
        Object next4;
        int iIntValue6;
        Object objLIZ7;
        Integer numValueOf4;
        Object objLIZ8;
        String str6;
        InboxEntrancePod inboxEntrancePod9;
        InboxEntranceCell inboxEntranceCell7;
        InboxEntrancePod inboxEntrancePod10;
        InboxEntranceCell inboxEntranceCell8;
        int i9;
        ArrayList arrayList = new ArrayList();
        Pair pair2 = (Pair) pair.getFirst();
        Object obj = null;
        if (pair2 != null) {
            first = pair2.getFirst();
        } else {
            first = null;
        }
        if (first != C889930Yvf.LIZ.LJI().getFirst()) {
            return new Pair(null, arrayList);
        }
        C0ZAM c0zam = new C0ZAM();
        Iterable iterable = (Iterable) pair.getSecond();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = iterable.iterator();
        while (true) {
            i = 1;
            i2 = 0;
            if (!it2.hasNext()) {
                break;
            }
            Object next5 = it2.next();
            C0ZA7 c0za7 = ((C890610Ywl) next5).LLILZLL;
            if (c0za7 == null || (c0za7.LIZJ != 210 && c0za7.LIZJ != 214 && c0za7.LIZJ != 99 && c0za7.LIZJ != 101)) {
                arrayList2.add(next5);
            }
        }
        ArrayList<C890610Ywl> arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            C0ZA7 c0za72 = ((C890610Ywl) obj2).LLILZLL;
            if (c0za72 != null && c0za72.LIZJ != -1 && c0za72.LIZIZ == 2) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (C890610Ywl c890610Ywl : arrayList3) {
            C0ZA7 c0za73 = c890610Ywl.LLILZLL;
            if (c0za73 != null) {
                Integer numValueOf5 = Integer.valueOf(c0za73.LIZJ);
                C0ZA7 c0za74 = c890610Ywl.LLILZLL;
                if (c0za74 != null) {
                    i9 = c0za74.LIZ;
                } else {
                    i9 = 0;
                }
                arrayList4.add(new Pair(numValueOf5, Integer.valueOf(i9)));
            }
        }
        Map mapLJIILLIIL = C2097608Jq.LJIILLIIL(arrayList4);
        Iterator it3 = mapLJIILLIIL.entrySet().iterator();
        while (it3.hasNext()) {
            c0zam.LIZIZ += ((Number) ((Map.Entry) it3.next()).getValue()).intValue();
        }
        if (C0BV6.LIZ()) {
            C1904220zeW.LL.getClass();
            linkedHashMap = C1904220zeW.LJJJIL();
        } else {
            C1904220zeW.LL.getClass();
            Map mapLJJJJJ = C1904220zeW.LJJJJJ();
            linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ((LinkedHashMap) mapLJJJJJ).entrySet()) {
                if (((Number) entry.getKey()).intValue() != 99) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
        }
        Iterator it4 = linkedHashMap.entrySet().iterator();
        while (it4.hasNext()) {
            c0zam.LIZ += ((Number) ((Map.Entry) it4.next()).getValue()).intValue();
        }
        Iterator it5 = ((ArrayList) LIZJ(mapLJIILLIIL, linkedHashMap, C0ZAJ.ShowNum, arrayList)).iterator();
        while (it5.hasNext()) {
            int iIntValue7 = ((Number) it5.next()).intValue();
            Iterator it6 = arrayList2.iterator();
            while (true) {
                if (it6.hasNext()) {
                    next4 = it6.next();
                    C0ZA7 c0za75 = ((C890610Ywl) next4).LLILZLL;
                    if (c0za75 != null && c0za75.LIZJ == iIntValue7) {
                        break;
                    }
                } else {
                    next4 = obj;
                    break;
                }
            }
            C890610Ywl c890610Ywl2 = (C890610Ywl) next4;
            Integer numValueOf6 = Integer.valueOf(iIntValue7);
            C1904220zeW c1904220zeW = C1904220zeW.LL;
            C0ZAJ c0zaj = C0ZAJ.ShowNum;
            c1904220zeW.getClass();
            int iLJJJJJL = C1904220zeW.LJJJJJL(iIntValue7, c0zaj);
            Integer num3 = (Integer) mapLJIILLIIL.get(Integer.valueOf(iIntValue7));
            if (num3 != null) {
                iIntValue6 = num3.intValue();
            } else {
                iIntValue6 = 0;
            }
            if (c890610Ywl2 != null) {
                objLIZ7 = c890610Ywl2.LIZ();
            } else {
                objLIZ7 = null;
            }
            if ((objLIZ7 instanceof InboxEntrancePod) && (inboxEntrancePod10 = (InboxEntrancePod) objLIZ7) != null && (inboxEntranceCell8 = inboxEntrancePod10.entranceCell) != null) {
                numValueOf4 = Integer.valueOf(inboxEntranceCell8.cellId);
            } else {
                numValueOf4 = null;
            }
            if (c890610Ywl2 != null) {
                objLIZ8 = c890610Ywl2.LIZ();
            } else {
                objLIZ8 = null;
            }
            if ((objLIZ8 instanceof InboxEntrancePod) && (inboxEntrancePod9 = (InboxEntrancePod) objLIZ8) != null && (inboxEntranceCell7 = inboxEntrancePod9.entranceCell) != null) {
                str6 = inboxEntranceCell7.entranceKey;
            } else {
                str6 = null;
            }
            arrayList.add(new C0ZB5(numValueOf6, null, 2, null, iLJJJJJL, iIntValue6, numValueOf4, str6, 10));
            obj = null;
        }
        ArrayList<C890610Ywl> arrayList5 = new ArrayList();
        for (Object obj3 : arrayList2) {
            C0ZA7 c0za76 = ((C890610Ywl) obj3).LLILZLL;
            if (c0za76 != null && c0za76.LIZJ != -1 && c0za76.LIZIZ == 1) {
                arrayList5.add(obj3);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        for (C890610Ywl c890610Ywl3 : arrayList5) {
            C0ZA7 c0za77 = c890610Ywl3.LLILZLL;
            if (c0za77 != null) {
                Integer numValueOf7 = Integer.valueOf(c0za77.LIZJ);
                C0ZA7 c0za78 = c890610Ywl3.LLILZLL;
                if (c0za78 != null) {
                    i8 = c0za78.LIZ;
                } else {
                    i8 = 0;
                }
                arrayList6.add(new Pair(numValueOf7, Integer.valueOf(i8)));
            }
        }
        Map mapLJIILLIIL2 = C2097608Jq.LJIILLIIL(arrayList6);
        Iterator it7 = mapLJIILLIIL2.entrySet().iterator();
        while (it7.hasNext()) {
            c0zam.LIZLLL += ((Number) ((Map.Entry) it7.next()).getValue()).intValue();
        }
        if (C0BV6.LIZ()) {
            C1904220zeW.LL.getClass();
            linkedHashMap2 = C1904220zeW.LJJJI();
        } else {
            C1904220zeW.LL.getClass();
            Map mapLJJJJIZL = C1904220zeW.LJJJJIZL();
            linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry2 : ((LinkedHashMap) mapLJJJJIZL).entrySet()) {
                if (((Number) entry2.getKey()).intValue() != 101) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                }
            }
        }
        Iterator it8 = linkedHashMap2.entrySet().iterator();
        while (it8.hasNext()) {
            c0zam.LIZJ += ((Number) ((Map.Entry) it8.next()).getValue()).intValue();
        }
        Iterator it9 = ((ArrayList) LIZJ(mapLJIILLIIL2, linkedHashMap2, C0ZAJ.ShowDot, arrayList)).iterator();
        while (it9.hasNext()) {
            int iIntValue8 = ((Number) it9.next()).intValue();
            Iterator it10 = arrayList2.iterator();
            while (true) {
                if (it10.hasNext()) {
                    next3 = it10.next();
                    C0ZA7 c0za79 = ((C890610Ywl) next3).LLILZLL;
                    if (c0za79 != null && c0za79.LIZJ == iIntValue8) {
                        break;
                    }
                } else {
                    next3 = null;
                    break;
                }
            }
            C890610Ywl c890610Ywl4 = (C890610Ywl) next3;
            Integer numValueOf8 = Integer.valueOf(iIntValue8);
            C1904220zeW c1904220zeW2 = C1904220zeW.LL;
            C0ZAJ c0zaj2 = C0ZAJ.ShowDot;
            c1904220zeW2.getClass();
            int iLJJJJJL2 = C1904220zeW.LJJJJJL(iIntValue8, c0zaj2);
            Integer num4 = (Integer) mapLJIILLIIL2.get(Integer.valueOf(iIntValue8));
            if (num4 != null) {
                iIntValue5 = num4.intValue();
            } else {
                iIntValue5 = 0;
            }
            if (c890610Ywl4 != null) {
                objLIZ5 = c890610Ywl4.LIZ();
            } else {
                objLIZ5 = null;
            }
            if ((objLIZ5 instanceof InboxEntrancePod) && (inboxEntrancePod8 = (InboxEntrancePod) objLIZ5) != null && (inboxEntranceCell6 = inboxEntrancePod8.entranceCell) != null) {
                numValueOf3 = Integer.valueOf(inboxEntranceCell6.cellId);
            } else {
                numValueOf3 = null;
            }
            if (c890610Ywl4 != null) {
                objLIZ6 = c890610Ywl4.LIZ();
            } else {
                objLIZ6 = null;
            }
            if ((objLIZ6 instanceof InboxEntrancePod) && (inboxEntrancePod7 = (InboxEntrancePod) objLIZ6) != null && (inboxEntranceCell5 = inboxEntrancePod7.entranceCell) != null) {
                str5 = inboxEntranceCell5.entranceKey;
            } else {
                str5 = null;
            }
            arrayList.add(new C0ZB5(numValueOf8, null, 1, null, iLJJJJJL2, iIntValue5, numValueOf3, str5, 10));
        }
        ArrayList<C890610Ywl> arrayList7 = new ArrayList();
        for (Object obj4 : arrayList2) {
            C0ZA7 c0za710 = ((C890610Ywl) obj4).LLILZLL;
            if (c0za710 != null && c0za710.LIZJ == -1 && c0za710.LIZIZ == 2) {
                arrayList7.add(obj4);
            }
        }
        ArrayList arrayList8 = new ArrayList();
        for (C890610Ywl c890610Ywl5 : arrayList7) {
            C0ZA7 c0za711 = c890610Ywl5.LLILZLL;
            if (c0za711 != null && (num2 = c0za711.LIZLLL) != null) {
                int iIntValue9 = num2.intValue();
                C0ZA7 c0za712 = c890610Ywl5.LLILZLL;
                if (c0za712 != null) {
                    str4 = c0za712.LJ;
                } else {
                    str4 = null;
                }
                EntranceKey entranceKey = new EntranceKey(iIntValue9, str4);
                C0ZA7 c0za713 = c890610Ywl5.LLILZLL;
                if (c0za713 != null) {
                    i7 = c0za713.LIZ;
                } else {
                    i7 = 0;
                }
                arrayList8.add(new Pair(entranceKey, Integer.valueOf(i7)));
            }
        }
        Map mapLJIILLIIL3 = C2097608Jq.LJIILLIIL(arrayList8);
        Iterator it11 = mapLJIILLIIL3.entrySet().iterator();
        while (it11.hasNext()) {
            c0zam.LIZIZ += ((Number) ((Map.Entry) it11.next()).getValue()).intValue();
        }
        if (C0BV6.LIZ()) {
            C1904220zeW.LL.getClass();
            mapLJJIJLIJ = C1904220zeW.LJJIJIIJI();
        } else {
            C1904220zeW.LL.getClass();
            mapLJJIJLIJ = C1904220zeW.LJJIJLIJ();
        }
        Iterator it12 = mapLJJIJLIJ.entrySet().iterator();
        while (it12.hasNext()) {
            c0zam.LIZ += ((Number) ((Map.Entry) it12.next()).getValue()).intValue();
        }
        for (EntranceKey entranceKey2 : LIZIZ(mapLJIILLIIL3, mapLJJIJLIJ)) {
            Iterator it13 = arrayList2.iterator();
            while (true) {
                if (it13.hasNext()) {
                    next2 = it13.next();
                    Object objLIZ9 = ((C890610Ywl) next2).LIZ();
                    if ((objLIZ9 instanceof InboxEntrancePod) && (inboxEntrancePod6 = (InboxEntrancePod) objLIZ9) != null) {
                        InboxEntranceCell inboxEntranceCell9 = inboxEntrancePod6.entranceCell;
                        if (inboxEntranceCell9.cellId == entranceKey2.entranceId && Intrinsics.LJFF(inboxEntranceCell9.entranceKey, entranceKey2.entranceKey)) {
                            break;
                        }
                    }
                } else {
                    next2 = null;
                    break;
                }
            }
            C890610Ywl c890610Ywl6 = (C890610Ywl) next2;
            Integer num5 = (Integer) mapLJJIJLIJ.get(entranceKey2);
            if (num5 != null) {
                iIntValue3 = num5.intValue();
            } else {
                iIntValue3 = 0;
            }
            Integer num6 = (Integer) mapLJIILLIIL3.get(entranceKey2);
            if (num6 != null) {
                iIntValue4 = num6.intValue();
            } else {
                iIntValue4 = 0;
            }
            if (c890610Ywl6 != null) {
                objLIZ3 = c890610Ywl6.LIZ();
            } else {
                objLIZ3 = null;
            }
            if ((objLIZ3 instanceof InboxEntrancePod) && (inboxEntrancePod5 = (InboxEntrancePod) objLIZ3) != null && (inboxEntranceCell4 = inboxEntrancePod5.entranceCell) != null) {
                numValueOf2 = Integer.valueOf(inboxEntranceCell4.cellId);
            } else {
                numValueOf2 = null;
            }
            if (c890610Ywl6 != null) {
                objLIZ4 = c890610Ywl6.LIZ();
            } else {
                objLIZ4 = null;
            }
            if ((objLIZ4 instanceof InboxEntrancePod) && (inboxEntrancePod4 = (InboxEntrancePod) objLIZ4) != null && (inboxEntranceCell3 = inboxEntrancePod4.entranceCell) != null) {
                str3 = inboxEntranceCell3.entranceKey;
            } else {
                str3 = null;
            }
            arrayList.add(new C0ZB5(-1, null, 2, null, iIntValue3, iIntValue4, numValueOf2, str3, 10));
        }
        ArrayList<C890610Ywl> arrayList9 = new ArrayList();
        for (Object obj5 : arrayList2) {
            C0ZA7 c0za714 = ((C890610Ywl) obj5).LLILZLL;
            if (c0za714 != null && c0za714.LIZJ == -1 && c0za714.LIZIZ == 1) {
                arrayList9.add(obj5);
            }
        }
        ArrayList arrayList10 = new ArrayList();
        for (C890610Ywl c890610Ywl7 : arrayList9) {
            C0ZA7 c0za715 = c890610Ywl7.LLILZLL;
            if (c0za715 != null && (num = c0za715.LIZLLL) != null) {
                int iIntValue10 = num.intValue();
                C0ZA7 c0za716 = c890610Ywl7.LLILZLL;
                if (c0za716 != null) {
                    str2 = c0za716.LJ;
                } else {
                    str2 = null;
                }
                EntranceKey entranceKey3 = new EntranceKey(iIntValue10, str2);
                C0ZA7 c0za717 = c890610Ywl7.LLILZLL;
                if (c0za717 != null) {
                    i6 = c0za717.LIZ;
                } else {
                    i6 = 0;
                }
                arrayList10.add(new Pair(entranceKey3, Integer.valueOf(i6)));
            }
        }
        Map mapLJIILLIIL4 = C2097608Jq.LJIILLIIL(arrayList10);
        Iterator it14 = mapLJIILLIIL4.entrySet().iterator();
        while (it14.hasNext()) {
            c0zam.LIZLLL += ((Number) ((Map.Entry) it14.next()).getValue()).intValue();
        }
        if (C0BV6.LIZ()) {
            C1904220zeW.LL.getClass();
            mapLJJIJL = C1904220zeW.LJJIJ();
        } else {
            C1904220zeW.LL.getClass();
            mapLJJIJL = C1904220zeW.LJJIJL();
        }
        Iterator it15 = mapLJJIJL.entrySet().iterator();
        while (it15.hasNext()) {
            c0zam.LIZJ += ((Number) ((Map.Entry) it15.next()).getValue()).intValue();
        }
        for (EntranceKey entranceKey4 : LIZIZ(mapLJIILLIIL4, mapLJJIJL)) {
            Iterator it16 = arrayList2.iterator();
            while (true) {
                if (it16.hasNext()) {
                    next = it16.next();
                    Object objLIZ10 = ((C890610Ywl) next).LIZ();
                    if ((objLIZ10 instanceof InboxEntrancePod) && (inboxEntrancePod3 = (InboxEntrancePod) objLIZ10) != null) {
                        InboxEntranceCell inboxEntranceCell10 = inboxEntrancePod3.entranceCell;
                        if (inboxEntranceCell10.cellId == entranceKey4.entranceId && Intrinsics.LJFF(inboxEntranceCell10.entranceKey, entranceKey4.entranceKey)) {
                            break;
                        }
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C890610Ywl c890610Ywl8 = (C890610Ywl) next;
            Integer num7 = (Integer) mapLJJIJL.get(entranceKey4);
            if (num7 != null) {
                iIntValue = num7.intValue();
            } else {
                iIntValue = 0;
            }
            Integer num8 = (Integer) mapLJIILLIIL4.get(entranceKey4);
            if (num8 != null) {
                iIntValue2 = num8.intValue();
            } else {
                iIntValue2 = 0;
            }
            if (c890610Ywl8 != null) {
                objLIZ = c890610Ywl8.LIZ();
            } else {
                objLIZ = null;
            }
            if ((objLIZ instanceof InboxEntrancePod) && (inboxEntrancePod2 = (InboxEntrancePod) objLIZ) != null && (inboxEntranceCell2 = inboxEntrancePod2.entranceCell) != null) {
                numValueOf = Integer.valueOf(inboxEntranceCell2.cellId);
            } else {
                numValueOf = null;
            }
            if (c890610Ywl8 != null) {
                objLIZ2 = c890610Ywl8.LIZ();
            } else {
                objLIZ2 = null;
            }
            if ((objLIZ2 instanceof InboxEntrancePod) && (inboxEntrancePod = (InboxEntrancePod) objLIZ2) != null && (inboxEntranceCell = inboxEntrancePod.entranceCell) != null) {
                str = inboxEntranceCell.entranceKey;
            } else {
                str = null;
            }
            arrayList.add(new C0ZB5(null, null, 1, null, iIntValue, iIntValue2, numValueOf, str, 11));
        }
        if (arrayList.isEmpty()) {
            int iLIZ = c0zam.LIZ();
            if (iLIZ != 1) {
                if (iLIZ != 2) {
                    i5 = 0;
                } else {
                    i5 = c0zam.LIZ;
                }
            } else {
                i5 = c0zam.LIZJ;
            }
            int iLIZ2 = c0zam.LIZ();
            if (iLIZ2 != 1) {
                if (iLIZ2 == 2) {
                    i2 = c0zam.LIZIZ;
                }
            } else {
                i2 = c0zam.LIZLLL;
            }
            return new Pair(new C0ZB5(null, 1, null, Integer.valueOf(c0zam.LIZ()), i5, i2, null, null, 197), arrayList);
        }
        int iLIZ3 = c0zam.LIZ();
        if (iLIZ3 != 1) {
            if (iLIZ3 != 2) {
                i3 = 0;
            } else {
                i3 = c0zam.LIZ;
            }
        } else {
            i3 = c0zam.LIZJ;
        }
        int iLIZ4 = c0zam.LIZ();
        if (iLIZ4 != 1) {
            if (iLIZ4 != 2) {
                i4 = 0;
            } else {
                i4 = c0zam.LIZIZ;
            }
        } else {
            i4 = c0zam.LIZLLL;
        }
        int iLIZ5 = c0zam.LIZ();
        if (c0zam.LIZ != c0zam.LIZIZ) {
            i = 2;
        } else if (c0zam.LIZJ == c0zam.LIZLLL) {
            i = 0;
        }
        return new Pair(new C0ZB5(null, 0, Integer.valueOf(i), Integer.valueOf(iLIZ5), i3, i4, null, null, 193), arrayList);
    }

    public static List LIZIZ(Map map, Map map2) {
        Integer num;
        Integer num2;
        Integer num3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            int iIntValue = ((Number) entry.getValue()).intValue();
            if (map2.containsKey(key) && ((num3 = (Integer) map2.get(key)) == null || num3.intValue() != iIntValue)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : map.entrySet()) {
            Object key2 = entry2.getKey();
            if (!map2.containsKey(key2) && ((num2 = (Integer) map.get(key2)) == null || num2.intValue() != 0)) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry3 : map2.entrySet()) {
            Object key3 = entry3.getKey();
            if (!map.containsKey(key3) && ((num = (Integer) map2.get(key3)) == null || num.intValue() != 0)) {
                linkedHashMap3.put(entry3.getKey(), entry3.getValue());
            }
        }
        return C13LP.LLIIII(((LinkedHashMap) C2097608Jq.LJIIL(C2097608Jq.LJIIL(linkedHashMap, linkedHashMap2), linkedHashMap3)).keySet());
    }

    public static List LIZJ(Map map, Map map2, C0ZAJ c0zaj, List list) {
        int i;
        int iIntValue;
        Integer num;
        ArrayList arrayList = new ArrayList(map2.size());
        Iterator it2 = map2.entrySet().iterator();
        while (it2.hasNext()) {
            arrayList.add(new Pair(((Map.Entry) it2.next()).getKey(), Boolean.FALSE));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2097608Jq.LJIILLIIL(arrayList));
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            C1904220zeW c1904220zeW = C1904220zeW.LL;
            int iIntValue2 = ((Number) entry.getKey()).intValue();
            c1904220zeW.getClass();
            Iterator it3 = C1904220zeW.LJJJ(iIntValue2).iterator();
            while (it3.hasNext()) {
                linkedHashMap.put(Integer.valueOf(((Number) it3.next()).intValue()), Boolean.TRUE);
            }
            C1904220zeW c1904220zeW2 = C1904220zeW.LL;
            int iIntValue3 = ((Number) entry.getKey()).intValue();
            c1904220zeW2.getClass();
            if (C1904220zeW.LJJJJJL(iIntValue3, c0zaj) != ((Number) entry.getValue()).intValue()) {
                arrayList2.add(entry.getKey());
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("tabUnreadCount not equal, entry.key:");
                sbLIZ.append(((Number) entry.getKey()).intValue());
                C2188811AlT.LIZIZ(sbLIZ);
                int i2 = C2187451AjH.LIZ;
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            if (!((Boolean) entry2.getValue()).booleanValue() && (num = (Integer) map2.get(entry2.getKey())) != null && num.intValue() != 0) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("processedOtherMap not process, entry.key:");
            sbLIZ2.append(((Number) entry3.getKey()).intValue());
            C2188811AlT.LIZIZ(sbLIZ2);
            int i3 = C2187451AjH.LIZ;
            Integer num2 = (Integer) entry3.getKey();
            int i4 = C0ZAK.LIZ[c0zaj.ordinal()];
            if (i4 != 1) {
                i = 2;
                if (i4 != 2) {
                    i = 0;
                }
            } else {
                i = 1;
            }
            Integer numValueOf = Integer.valueOf(i);
            Integer num3 = (Integer) map2.get(entry3.getKey());
            if (num3 != null) {
                iIntValue = num3.intValue();
            } else {
                iIntValue = 0;
            }
            ((ArrayList) list).add(new C0ZB5(num2, null, numValueOf, null, iIntValue, 0, null, null, 10));
        }
        return arrayList2;
    }
}
