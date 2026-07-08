package X;

import com.ss.android.ugc.effectmanager.common.utils.JsonExtKt;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.00ct, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C119700ct {
    public static final List<Object> LIZ(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object map = jSONArray.get(i);
            if (map instanceof JSONArray) {
                map = LIZ((JSONArray) map);
            } else if (map instanceof JSONObject) {
                map = JsonExtKt.toMap((JSONObject) map);
            }
            arrayList.add(map);
        }
        return arrayList;
    }
}
