package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.00dW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C123600dW {
    public static final /* synthetic */ int LIZ = 0;

    public static List LIZ(JSONObject jSONObject) {
        JSONArray jSONArray;
        if (jSONObject == null) {
            return C13BV.INSTANCE;
        }
        Object objOpt = jSONObject.opt("__applog_cp_ids");
        if (objOpt == null) {
            return C13BV.INSTANCE;
        }
        if ((objOpt instanceof String) && ((CharSequence) objOpt).length() > 0) {
            return Collections.singletonList(objOpt);
        }
        if ((objOpt instanceof JSONArray) && (jSONArray = (JSONArray) objOpt) != null) {
            ArrayList arrayList = new ArrayList(jSONArray.length());
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                Object objOpt2 = jSONArray.opt(i);
                if ((objOpt2 instanceof String) && ((CharSequence) objOpt2).length() > 0) {
                    arrayList.add(objOpt2);
                }
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }
}
