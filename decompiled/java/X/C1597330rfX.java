package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS264S0000000_24;

/* JADX INFO: renamed from: X.0rfX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1597330rfX {
    public final C1160320gIg LIZ;
    public final Map<EnumC1597060rf6, Map<C13IQ<?>, InterfaceC1597210rfL<?>>> LIZIZ = new LinkedHashMap();
    public final List<InterfaceC1597430rfh> LIZJ = new ArrayList();

    public C1597330rfX(C1160320gIg c1160320gIg) {
        this.LIZ = c1160320gIg;
    }

    public final Map LIZIZ(C1597350rfZ c1597350rfZ, Map map) {
        List<InterfaceC1597430rfh> list = this.LIZJ;
        ArrayList<InterfaceC1597430rfh> arrayList = new ArrayList();
        for (Object obj : (ArrayList) list) {
            if (((InterfaceC1597430rfh) obj).getMode() == EnumC1597370rfb.PERSISTENT) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            int i = C2187451AjH.LIZ;
            return map;
        }
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("preProcess: persistentIntents=");
        sbLIZ.append(arrayList.size());
        C2188811AlT.LIZIZ(sbLIZ);
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1597310rfV c1597310rfV = new C1597310rfV(c1597350rfZ.LIZ, map, c1597350rfZ.LIZIZ, c1597350rfZ.LIZJ, c1597350rfZ.LIZLLL);
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object key2 = entry.getKey();
            List listLIZ = (List) entry.getValue();
            Map map2 = (Map) ((LinkedHashMap) this.LIZIZ).get(key2);
            if (map2 != null && !map2.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                for (InterfaceC1597430rfh interfaceC1597430rfh : arrayList) {
                    InterfaceC1597210rfL interfaceC1597210rfL = (InterfaceC1597210rfL) map2.get(C13LE.LIZ(interfaceC1597430rfh.getClass()));
                    if (interfaceC1597210rfL != null) {
                        arrayList2.addAll(interfaceC1597210rfL.LIZ(interfaceC1597430rfh, c1597310rfV));
                    }
                }
                if (!arrayList2.isEmpty()) {
                    int i3 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("preProcess: bizType=");
                    sbLIZ2.append(key2);
                    sbLIZ2.append(", ops=");
                    sbLIZ2.append(arrayList2.size());
                    sbLIZ2.append(", before=");
                    sbLIZ2.append(listLIZ.size());
                    C2188811AlT.LIZIZ(sbLIZ2);
                    this.LIZ.getClass();
                    List listLIZIZ = C1160320gIg.LIZIZ(arrayList2);
                    C1160320gIg c1160320gIg = this.LIZ;
                    C1597490rfn c1597490rfn = c1597350rfZ.LIZ;
                    c1160320gIg.getClass();
                    listLIZ = C1160320gIg.LIZ(listLIZIZ, listLIZ, c1597490rfn);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("preProcess: bizType=");
                    sbLIZ3.append(key2);
                    sbLIZ3.append(", after=");
                    sbLIZ3.append(listLIZ.size());
                    C2188811AlT.LIZIZ(sbLIZ3);
                }
            }
            linkedHashMap.put(key, listLIZ);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((InterfaceC1597430rfh) it2.next()).LIZ();
        }
        Pair pair = new Pair(linkedHashMap, Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        Map map3 = (Map) pair.getFirst();
        ((Number) pair.getSecond()).longValue();
        int i4 = C2187451AjH.LIZ;
        return map3;
    }

    public final List<InterfaceC1891350zJl> LIZ(List<? extends InterfaceC1891350zJl> list, C1597350rfZ c1597350rfZ, List<? extends InterfaceC1891350zJl> list2) {
        List list3 = list;
        if (((ArrayList) this.LIZJ).isEmpty()) {
            int i = C2187451AjH.LIZ;
            return list3;
        }
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("postProcess: intentQueue=");
        sbLIZ.append(((ArrayList) this.LIZJ).size());
        sbLIZ.append(", inputSize=");
        sbLIZ.append(list3.size());
        C2188811AlT.LIZIZ(sbLIZ);
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1597320rfW c1597320rfW = new C1597320rfW(c1597350rfZ.LIZ, list3, c1597350rfZ.LIZIZ, list2, c1597350rfZ.LIZLLL);
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((LinkedHashMap) this.LIZIZ).entrySet().iterator();
        while (it2.hasNext()) {
            Map map = (Map) ((Map.Entry) it2.next()).getValue();
            for (InterfaceC1597430rfh interfaceC1597430rfh : (ArrayList) this.LIZJ) {
                InterfaceC1597210rfL interfaceC1597210rfL = (InterfaceC1597210rfL) map.get(C13LE.LIZ(interfaceC1597430rfh.getClass()));
                if (interfaceC1597210rfL != null) {
                    arrayList.addAll(interfaceC1597210rfL.LIZJ(interfaceC1597430rfh, c1597320rfW));
                }
            }
        }
        List<InterfaceC1597430rfh> list4 = this.LIZJ;
        int i3 = 0;
        if (!(list4 instanceof Collection) || !((ArrayList) list4).isEmpty()) {
            Iterator it3 = ((ArrayList) list4).iterator();
            i3 = 0;
            while (it3.hasNext()) {
                if (((InterfaceC1597430rfh) it3.next()).getMode() == EnumC1597370rfb.ONETIME && (i3 = i3 + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        C19719612Di.LJJIIJ(this.LIZJ, AFwS264S0000000_24.get$arr$(661), true);
        if (i3 > 0) {
            int i4 = C2187451AjH.LIZ;
            ((ArrayList) this.LIZJ).size();
        }
        if (!arrayList.isEmpty()) {
            this.LIZ.getClass();
            List listLIZIZ = C1160320gIg.LIZIZ(arrayList);
            C1160320gIg c1160320gIg = this.LIZ;
            C1597490rfn c1597490rfn = c1597350rfZ.LIZ;
            c1160320gIg.getClass();
            List listLIZ = C1160320gIg.LIZ(listLIZIZ, list3, c1597490rfn);
            int i5 = C2187451AjH.LIZ;
            arrayList.size();
            listLIZIZ.size();
            list3.size();
            listLIZ.size();
            list3 = listLIZ;
        }
        Pair pair = new Pair(list3, Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        List<InterfaceC1891350zJl> list5 = (List) pair.getFirst();
        ((Number) pair.getSecond()).longValue();
        int i6 = C2187451AjH.LIZ;
        return list5;
    }
}
