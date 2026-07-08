package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18AD, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18AD {
    public final List<C18AJ> LIZ = new ArrayList();
    public boolean LIZIZ = true;

    public final C18AK LIZIZ() {
        List<C18AJ> list = this.LIZ;
        ArrayList arrayList = new ArrayList();
        for (C18AJ c18aj : list) {
            if (c18aj instanceof C18AK) {
                arrayList.add(c18aj);
            }
        }
        return (C18AK) C13LP.LJJJLL(arrayList);
    }

    public final void LIZ(JSONObject jSONObject) throws JSONException {
        List<C18AJ> list = this.LIZ;
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) list) {
            if (obj instanceof C18AI) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((C18AI) it2.next()).LIZIZ);
        }
        jSONObject.put("illegal_params", arrayList2);
        C18AK c18akLIZIZ = LIZIZ();
        if (c18akLIZIZ != null) {
            jSONObject.put("extra_rule", c18akLIZIZ.LIZ);
        }
    }
}
