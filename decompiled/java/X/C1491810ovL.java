package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ovL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1491810ovL extends AbstractC1520070pev {
    public final List<Map<String, Object>> LIZ;
    public String LIZIZ;

    public C1491810ovL(Map<String, ? extends Object> map) {
        ArrayList arrayList = new ArrayList();
        this.LIZ = arrayList;
        if (map != null) {
            arrayList.add(map);
        }
    }

    @Override // X.AbstractC1520070pev
    public final void LIZ(JSONObject jSONObject) {
        Iterator<Map<String, Object>> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            for (Map.Entry<String, Object> entry : it2.next().entrySet()) {
                C1520640pfq.LJIILJJIL(jSONObject, entry.getKey(), entry.getValue());
            }
        }
        String str = this.LIZIZ;
        if (str != null) {
            C1520640pfq.LJIILIIL("client_issue_id", str, jSONObject);
        }
    }
}
