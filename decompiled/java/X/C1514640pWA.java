package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pWA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1514640pWA extends C1514660pWC {
    public final Map<String, C1514650pWB> LIZLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1514640pWA(Object obj) throws JSONException {
        super(0);
        boolean z = false;
        this.LIZLLL = new LinkedHashMap();
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            Object objOpt = jSONObject.opt("bid_allow_list");
            if (objOpt != null) {
                if ((objOpt instanceof String) && Intrinsics.LJFF(objOpt, "all")) {
                    z = true;
                }
                this.LIZJ = z;
                if (objOpt instanceof JSONArray) {
                    List<String> list = this.LIZ;
                    List<Object> listLIZLLL = C08HX.LIZLLL((JSONArray) objOpt);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : (ArrayList) listLIZLLL) {
                        if (obj2 instanceof String) {
                            arrayList.add(obj2);
                        }
                    }
                    list.addAll(arrayList);
                }
                if (objOpt instanceof JSONObject) {
                    JSONObject jSONObject2 = (JSONObject) objOpt;
                    Iterator<String> itKeys = jSONObject2.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        this.LIZ.add(next);
                        this.LIZLLL.put(next, new C1514650pWB(jSONObject2.opt(next)));
                    }
                }
            }
            Object objOpt2 = jSONObject.opt("bid_deny_list");
            if (objOpt2 != null && (objOpt2 instanceof JSONArray)) {
                List<String> list2 = this.LIZIZ;
                List<Object> listLIZLLL2 = C08HX.LIZLLL((JSONArray) objOpt2);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : (ArrayList) listLIZLLL2) {
                    if (obj3 instanceof String) {
                        arrayList2.add(obj3);
                    }
                }
                list2.addAll(arrayList2);
            }
        }
    }

    public final boolean LIZ(String str, String str2) {
        if ((this.LIZJ || this.LIZ.contains(str)) && !this.LIZIZ.contains(str)) {
            C1514660pWC c1514660pWC = (C1514660pWC) ((LinkedHashMap) this.LIZLLL).get(str);
            if (c1514660pWC == null || ((c1514660pWC.LIZJ || c1514660pWC.LIZ.contains(str2)) && !c1514660pWC.LIZIZ.contains(str2))) {
                return true;
            }
            return false;
        }
        return false;
    }
}
