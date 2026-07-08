package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pWB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1514650pWB extends C1514660pWC {
    public C1514650pWB() {
        this(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1514650pWB(Object obj) throws JSONException {
        super(0);
        boolean z = false;
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            Object objOpt = jSONObject.opt("pid_allow_list");
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
            }
            Object objOpt2 = jSONObject.opt("pid_deny_list");
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
}
