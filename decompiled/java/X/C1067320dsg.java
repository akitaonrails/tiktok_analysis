package X;

import android.os.BaseBundle;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.TemplateData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dsg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1067320dsg {
    @InterfaceC1294060jmO
    public static C1067460dsu LIZ(Map map) {
        Map map2;
        C1067460dsu c1067460dsu = new C1067460dsu();
        Object objLIZJ = LIZJ(map);
        if (objLIZJ instanceof Map) {
            map2 = (Map) objLIZJ;
        } else {
            map2 = null;
        }
        c1067460dsu.LIZ = TemplateData.LJII(map2);
        return c1067460dsu;
    }

    public static C1067460dsu LIZIZ(String str) {
        C1067460dsu c1067460dsu = new C1067460dsu();
        c1067460dsu.LIZ = TemplateData.LJIIIIZZ(str);
        return c1067460dsu;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.HashMap, java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.HashMap, java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.HashMap, java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.ArrayList] */
    public static Object LIZJ(Object obj) {
        Object arrayList;
        Object obj2;
        Object linkedHashMap;
        Object obj3;
        if (obj == null) {
            return null;
        }
        C1490740otc c1490740otc = C1490740otc.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dealing with ");
        sbLIZ.append(obj);
        sbLIZ.append('[');
        sbLIZ.append(obj.getClass());
        sbLIZ.append(']');
        c1490740otc.LIZ(C2188811AlT.LIZIZ(sbLIZ), EnumC1490770otf.D, "LynxInitData");
        if (obj instanceof List) {
            linkedHashMap = new ArrayList();
            Iterator it2 = ((Iterable) obj).iterator();
            while (it2.hasNext()) {
                linkedHashMap.add(LIZJ(it2.next()));
            }
        } else if (obj instanceof Map) {
            linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                if (entry.getKey() instanceof String) {
                    linkedHashMap.put(entry.getKey(), LIZJ(entry.getValue()));
                } else {
                    C1490740otc c1490740otc2 = C1490740otc.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("unsupported value ");
                    sbLIZ2.append(entry);
                    c1490740otc2.LIZ(C2188811AlT.LIZIZ(sbLIZ2), EnumC1490770otf.E, "LynxInitData");
                }
            }
        } else {
            if (obj instanceof Bundle) {
                arrayList = new LinkedHashMap();
                BaseBundle baseBundle = (BaseBundle) obj;
                for (String str : baseBundle.keySet()) {
                    try {
                        obj3 = baseBundle.get(str);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        obj3 = null;
                    } catch (OutOfMemoryError e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        obj3 = null;
                    }
                    arrayList.put(str, LIZJ(obj3));
                }
            } else if (obj instanceof JSONObject) {
                linkedHashMap = new LinkedHashMap();
                JSONObject jSONObject = (JSONObject) obj;
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    linkedHashMap.put(next, LIZJ(jSONObject.get(next)));
                }
            } else if (obj instanceof JSONArray) {
                arrayList = new ArrayList();
                JSONArray jSONArray = (JSONArray) obj;
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    if (jSONArray.isNull(i)) {
                        obj2 = null;
                    } else {
                        obj2 = jSONArray.get(i);
                    }
                    arrayList.add(LIZJ(obj2));
                }
            } else {
                return obj;
            }
            return arrayList;
        }
        return linkedHashMap;
    }
}
