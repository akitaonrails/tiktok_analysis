package X;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.09Tr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2378509Tr {
    public JSONObject LIZ = new JSONObject();

    public final void LIZ(int i) throws JSONException {
        this.LIZ.put("error_code", i);
    }

    public final void LIZIZ(String str) throws JSONException {
        this.LIZ.put("error_msg", str);
    }
}
