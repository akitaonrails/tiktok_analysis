package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ovK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1491800ovK extends AbstractC1520070pev {
    public final List<Map<String, Object>> LIZ;

    public C1491800ovK(Map<String, ? extends Object> map) {
        ArrayList arrayList = new ArrayList();
        this.LIZ = arrayList;
        if (map != null) {
            arrayList.add(map);
        }
    }

    @Override // X.AbstractC1520070pev
    public final void LIZ(JSONObject jSONObject) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<Map<String, Object>> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            for (Map.Entry<String, Object> entry : it2.next().entrySet()) {
                if (Intrinsics.LJFF(entry.getKey(), "container_id")) {
                    Object value = entry.getValue();
                    if ((value instanceof String) && value != null) {
                        linkedHashSet.add(value);
                    }
                } else {
                    C1520640pfq.LJIILJJIL(jSONObject, entry.getKey(), entry.getValue());
                }
            }
        }
        if (!linkedHashSet.isEmpty()) {
            C1520640pfq.LJIILJJIL(jSONObject, "container_ids", new JSONArray((Collection) linkedHashSet));
        }
    }
}
