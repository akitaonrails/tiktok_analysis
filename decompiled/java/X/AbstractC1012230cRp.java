package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cRp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC1012230cRp implements InterfaceC996870c33 {
    public static List LIZJ(List list, Map map) {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            map.get(((C1012220cRo) it2.next()).LIZ);
            arrayList.add(new Object() { // from class: X.0cRv
            });
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static JSONObject LIZIZ(JSONObject jSONObject, List list, Map map) {
        JSONObject jSONObject2 = new JSONObject(C786410Ut5.J3(jSONObject));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C1012260cRs c1012260cRs = (C1012260cRs) it2.next();
            Object objOpt = jSONObject2.opt(c1012260cRs.LIZ());
            if (objOpt != null) {
                LIZLLL(jSONObject2, objOpt, c1012260cRs, map);
            }
        }
        return jSONObject2;
    }

    public static void LIZLLL(Object obj, Object obj2, C1012260cRs c1012260cRs, Map map) {
        List<C1012260cRs> list = c1012260cRs.LIZIZ;
        if (list == null) {
            Iterator<InterfaceC1012270cRt> it2 = C1012280cRu.LIZ.iterator();
            while (it2.hasNext() && !it2.next().LIZ(obj, obj2, c1012260cRs, map)) {
            }
            return;
        }
        if (!c1012260cRs.LIZIZ()) {
            if (obj2 instanceof JSONObject) {
                for (C1012260cRs c1012260cRs2 : list) {
                    Object objOpt = ((JSONObject) obj2).opt(c1012260cRs2.LIZ());
                    if (objOpt != null) {
                        LIZLLL(obj2, objOpt, c1012260cRs2, map);
                    }
                }
                return;
            }
            throw new IllegalStateException("child must be a json object");
        }
        if (obj2 instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj2;
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                Object objOpt2 = jSONArray.opt(i);
                if (objOpt2 != null) {
                    if (objOpt2 instanceof JSONObject) {
                        for (C1012260cRs c1012260cRs3 : list) {
                            Object objOpt3 = ((JSONObject) objOpt2).opt(c1012260cRs3.LIZ());
                            if (objOpt3 != null) {
                                LIZLLL(objOpt2, objOpt3, c1012260cRs3, map);
                            }
                        }
                    } else {
                        throw new IllegalStateException("item must be a json object");
                    }
                }
            }
            return;
        }
        throw new IllegalStateException("child element must be a json array");
    }
}
