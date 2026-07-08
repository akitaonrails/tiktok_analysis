package X;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS231S0000000_3;

/* JADX INFO: renamed from: X.0tDD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1656650tDD {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(450));
    public static String LIZIZ = "";
    public static boolean LIZJ;

    public static Map LIZ() {
        Map mapLJ;
        HashMap map = (HashMap) ((HashMap) LIZ.getValue()).get("record");
        if (map == null || (mapLJ = C2097608Jq.LJIIZILJ(map)) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        Set<Map.Entry> setEntrySet = mapLJ.entrySet();
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(setEntrySet, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (Map.Entry entry : setEntrySet) {
            Map mapLIZ = C08J4.LIZ((Map) entry.getValue(), AFwS231S0000000_3.get$arr$(170));
            Pair pair = new Pair(entry.getKey(), Long.valueOf(((Number) C2097608Jq.LJFF(EnumC1910370zoR.ON_INIT, mapLIZ)).longValue() + ((Number) C2097608Jq.LJFF(EnumC1910370zoR.ON_CREATE, mapLIZ)).longValue() + ((Number) C2097608Jq.LJFF(EnumC1910370zoR.ON_START, mapLIZ)).longValue() + ((Number) C2097608Jq.LJFF(EnumC1910370zoR.ON_RESUME, mapLIZ)).longValue()));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }

    public static final void LIZIZ(String str) {
        if (!C298320Bmg.LIZ()) {
            return;
        }
        C20102213l6 c20102213l6 = C20102213l6.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GlobalALSComponentMonitor onScreenCreate ");
        sbLIZ.append(LIZIZ);
        sbLIZ.append(' ');
        sbLIZ.append(str);
        C201955140j.LJIILJJIL(c20102213l6, C2188811AlT.LIZIZ(sbLIZ));
        LIZIZ = str;
        ((HashMap) LIZ.getValue()).put(LIZIZ, new HashMap());
    }

    public static final void LIZJ(String str) {
        if (!C298320Bmg.LIZ()) {
            return;
        }
        C20102213l6 c20102213l6 = C20102213l6.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GlobalALSComponentMonitor onScreenDestroy ");
        sbLIZ.append(str);
        C201955140j.LJIILJJIL(c20102213l6, C2188811AlT.LIZIZ(sbLIZ));
        ((HashMap) LIZ.getValue()).remove(str);
    }

    public static final void LIZLLL(String str) {
        if (!C298320Bmg.LIZ()) {
            return;
        }
        C20102213l6 c20102213l6 = C20102213l6.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GlobalALSComponentMonitor onScreenResume ");
        sbLIZ.append(str);
        C201955140j.LJIILJJIL(c20102213l6, C2188811AlT.LIZIZ(sbLIZ));
        LIZIZ = str;
    }
}
