package X;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.00cx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C120100cx {
    public static final List<String> LIZ(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            if (jSONArray.get(i) instanceof String) {
                arrayList.add(jSONArray.get(i));
            }
        }
        return arrayList;
    }
}
