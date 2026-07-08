package X;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VCW, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public abstract class C0VCW {
    public String LIZ = C0VC5.LJFF;

    public final void LIZ(JSONObject jSONObject) throws JSONException {
        if (TextUtils.isEmpty(this.LIZ)) {
            this.LIZ = C0VC5.LJFF;
        }
        jSONObject.put("store_region", this.LIZ);
    }
}
