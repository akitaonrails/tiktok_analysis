package X;

import Y.AComparatorS510S0100000_11;
import Y.AObjectS311S0200000_11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0Rhz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C703090Rhz {
    public static final String LIZLLL(C703070Rhx c703070Rhx) {
        if (c703070Rhx == null) {
            return "null";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("availability=");
        sbLIZ.append(c703070Rhx.LIZ);
        sbLIZ.append(", revision=");
        sbLIZ.append(c703070Rhx.LIZJ);
        sbLIZ.append(", candidate=");
        sbLIZ.append(c703070Rhx.LIZIZ);
        sbLIZ.append(", hasBeenAvailable=");
        sbLIZ.append(c703070Rhx.LJ);
        sbLIZ.append(", updatedAtMs=");
        sbLIZ.append(c703070Rhx.LIZLLL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final int LIZIZ(String str, Map map) {
        Object obj = map.get(str);
        int i = 0;
        while (obj != null) {
            i++;
            obj = map.get(obj);
        }
        return i;
    }

    public static final String LIZ(C702990Rhp c702990Rhp, C702940Rhk c702940Rhk, C700400Rde c700400Rde, Map<String, String> map) {
        if (c700400Rde == null) {
            return "<empty-tree>";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(c700400Rde.LIZ, null);
        for (C700400Rde c700400Rde2 : c700400Rde.LIZJ.values()) {
            linkedHashMap.put(c700400Rde2.LIZ, c700400Rde.LIZ);
            c700400Rde2.LIZIZ(new AObjectS311S0200000_11(c700400Rde2, linkedHashMap, 1));
        }
        ArrayList arrayList = new ArrayList();
        LIZJ(0, c702990Rhp, c702940Rhk, c700400Rde, arrayList, map);
        Set<String> setKeySet = map.keySet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : setKeySet) {
            if (!linkedHashMap.containsKey(obj)) {
                arrayList2.add(obj);
            }
        }
        for (String str : C13LP.LJLLLL(new AComparatorS510S0100000_11(new AComparatorS510S0100000_11(map, 0), 1), arrayList2)) {
            int iLIZIZ = LIZIZ(str, map);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(u.LJJ(iLIZIZ, "  "));
            sbLIZ.append("- [DEL] ");
            sbLIZ.append(str);
            sbLIZ.append(" [removed]");
            arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
        }
        return C13LP.LJJLIIIJ(arrayList, "\n", null, null, 0, null, null, 62);
    }

    public static final void LIZJ(int i, C702990Rhp c702990Rhp, C702940Rhk c702940Rhk, C700400Rde c700400Rde, List list, Map map) {
        String strLIZIZ;
        String strLIZIZ2 = c700400Rde.LIZ;
        C703070Rhx c703070Rhx = c702940Rhk.LIZIZ.get(strLIZIZ2);
        if (c703070Rhx != null) {
            String str = c702940Rhk.LIZLLL.get(strLIZIZ2);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(c703070Rhx.LIZ.name().toLowerCase(Locale.ROOT));
            sbLIZ.append(" revision=");
            sbLIZ.append(c703070Rhx.LIZJ);
            sbLIZ.append(" timing=");
            String str2 = "null";
            if (str == null) {
                str = "null";
            }
            sbLIZ.append(str);
            sbLIZ.append(" candidate=");
            String str3 = c703070Rhx.LIZIZ;
            if (str3 != null) {
                str2 = str3;
            }
            sbLIZ.append(str2);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else if (!c702990Rhp.LIZ.containsKey(strLIZIZ2)) {
            strLIZIZ = "no-state";
        } else {
            EnumC699470Rc9 enumC699470Rc9 = C703100Ri0.LIZ(strLIZIZ2, null, c702990Rhp.LIZ).LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(enumC699470Rc9.name().toLowerCase(Locale.ROOT));
            sbLIZ2.append(" revision=0 default");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        if ((!map.isEmpty()) && !map.containsKey(strLIZIZ2)) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("[ADD] ");
            sbLIZ3.append(strLIZIZ2);
            strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append(u.LJJ(i, "  "));
        sbLIZ4.append("- ");
        sbLIZ4.append(strLIZIZ2);
        sbLIZ4.append(" [");
        sbLIZ4.append(strLIZIZ);
        sbLIZ4.append(']');
        list.add(C2188811AlT.LIZIZ(sbLIZ4));
        Iterator<T> it2 = c700400Rde.LIZJ.values().iterator();
        while (it2.hasNext()) {
            LIZJ(i + 1, c702990Rhp, c702940Rhk, (C700400Rde) it2.next(), list, map);
        }
    }
}
