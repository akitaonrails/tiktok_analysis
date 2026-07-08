package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.react.bridge.PiperData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qHM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1543900qHM {
    public final C1543190qGD LIZ;
    public final C789070UxN LIZIZ;

    public C1543900qHM(C1543190qGD c1543190qGD) {
        this.LIZ = c1543190qGD;
        InterfaceC1297560js2 interfaceC1297560js2 = C1543410qGZ.LJIIIZ;
        this.LIZIZ = C1543410qGZ.LJIIL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.HashMap, java.util.LinkedHashMap] */
    public static Object LIZ(Object obj) {
        Object arrayList;
        if (obj != null && !(obj instanceof Boolean) && !(obj instanceof Integer) && !(obj instanceof Double) && !(obj instanceof String)) {
            if (obj instanceof Long) {
                if (!C1544000qHW.LIZLLL) {
                    return Double.valueOf(((Number) obj).longValue());
                }
                return obj;
            }
            if (obj instanceof Float) {
                return Double.valueOf(((Number) obj).floatValue());
            }
            if (obj instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj;
                arrayList = new LinkedHashMap();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    arrayList.put(next, LIZ(jSONObject.get(next)));
                }
            } else {
                if (obj instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) obj;
                    int length = jSONArray.length();
                    ArrayList arrayList2 = new ArrayList(length);
                    for (int i = 0; i < length; i++) {
                        arrayList2.add(LIZ(jSONArray.get(i)));
                    }
                    return arrayList2;
                }
                if (obj instanceof Map) {
                    ArrayList arrayList3 = new ArrayList();
                    for (Map.Entry entry : ((Map) obj).entrySet()) {
                        if (entry.getKey() instanceof String) {
                            arrayList3.add(new Pair(entry.getKey(), LIZ(entry.getValue())));
                        }
                    }
                    return C2097608Jq.LJIILLIIL(arrayList3);
                }
                if (obj instanceof List) {
                    Iterable iterable = (Iterable) obj;
                    arrayList = new ArrayList(C15438062q.LJIJJ(iterable, 10));
                    Iterator it2 = iterable.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(LIZ(it2.next()));
                    }
                } else {
                    if (obj instanceof PiperData) {
                        return C1299060juS.LIZIZ((PiperData) obj);
                    }
                    return obj.toString();
                }
            }
            return arrayList;
        }
        return obj;
    }

    public static void LIZIZ(C1543440qGc c1543440qGc, C1543910qHN c1543910qHN, C1543190qGD c1543190qGD, boolean z, InterfaceC1544410qIB interfaceC1544410qIB) {
        Map mapLJ;
        Object map;
        int iIntValue;
        String str;
        Integer num;
        if (!C1544000qHW.LJIIJ) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onBridgeResult,result:");
            sbLIZ.append(c1543440qGc);
            sbLIZ.append(",call:");
            sbLIZ.append(c1543910qHN);
            C2188811AlT.LIZIZ(sbLIZ);
            InterfaceC1297560js2 interfaceC1297560js2 = C1543410qGZ.LJIIIZ;
        }
        if (c1543910qHN != null) {
            c1543190qGD.LIZLLL.LIZIZ(c1543440qGc, c1543910qHN, c1543190qGD);
        }
        try {
            Object obj = c1543440qGc.LIZ;
            if (obj instanceof JSONObject) {
                C1543800qHC.LIZ.getClass();
                mapLJ = C1543800qHC.LIZIZ((JSONObject) obj);
            } else if (obj instanceof Map) {
                mapLJ = (Map) obj;
            } else {
                mapLJ = C2097608Jq.LJ();
            }
            Object obj2 = mapLJ.get("data");
            if (!(obj2 instanceof Map) || (map = (Map) obj2) == null) {
                map = new HashMap();
            }
            Object obj3 = mapLJ.get("code");
            if ((obj3 instanceof Integer) && (num = (Integer) obj3) != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = C386801es.DEFAULT;
            }
            Object obj4 = mapLJ.get("msg");
            if (!(obj4 instanceof String) || (str = (String) obj4) == null) {
                str = "result is not JSONObject or Map<*, *>";
            }
            C1170180gYa c1170180gYa = new C1170180gYa(iIntValue, str, (Map) LIZ(map));
            if (c1543910qHN != null) {
                c1543910qHN.LJJIJIIJIL = z;
                c1543190qGD.LIZLLL.LIZJ(c1543910qHN, c1543440qGc);
            }
            interfaceC1544410qIB.LIZ(c1170180gYa);
            if (c1543910qHN != null) {
                c1543190qGD.LIZLLL.LIZLLL(c1543190qGD, c1543910qHN);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
