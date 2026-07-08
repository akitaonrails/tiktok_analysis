package X;

import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.0k9d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1308470k9d {
    public static final List<AbstractC1308040k8w> LIZ(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            arrayList.add(C1308340k9Q.LIZ(JSONArrayProtectorUtils.getJSONObject(jSONArray, i)));
        }
        return arrayList;
    }
}
