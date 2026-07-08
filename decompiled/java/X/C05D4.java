package X;

import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS580S0100000_1;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.05D4, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05D4 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Integer num, String str, Map map) {
        if (str != null && map != null) {
            map.put("error_message", str);
        }
        if (num != null) {
            int iIntValue = num.intValue();
            if (map != null) {
                map.put("error_code", Integer.valueOf(iIntValue));
            }
        }
    }

    public static void LIZJ(String str, Integer num, String str2, Map map) {
        Map mapLJIILLIIL;
        Map mapLJIIZILJ;
        LIZ(num, str2, map);
        C1018703yb.LIZLLL(str, new AwS580S0100000_1(map, (Map<Integer, String>) 453));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(num);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        LIZ(num, str2, map);
        if (map != null) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new Pair(entry.getKey(), entry.getValue().toString()));
            }
            mapLJIILLIIL = C2097608Jq.LJIILLIIL(arrayList);
        } else {
            mapLJIILLIIL = null;
        }
        C1AF0.LIZLLL(strLIZIZ, mapLJIILLIIL);
        if (map != null && (mapLJIIZILJ = C2097608Jq.LJIIZILJ(map)) != null) {
            JSONObject jSONObject = new JSONObject(mapLJIIZILJ);
            C05A8.LIZ.getClass();
            C05A8.LIZ(strLIZIZ, jSONObject, jSONObject, jSONObject);
        }
    }

    public static void LIZIZ(String str, EnumC1778650wNz enumC1778650wNz, Integer num, String str2, Map map) {
        LIZJ(str, num, str2, map);
        LIZ(num, str2, map);
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C452101pP(enumC1778650wNz, num, map, null), 2);
    }
}
