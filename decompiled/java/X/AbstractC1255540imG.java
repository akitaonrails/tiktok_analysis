package X;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0imG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public abstract class AbstractC1255540imG {
    public final EnumC1253890ijb LIZ;

    public abstract boolean LIZIZ(AbstractC1255540imG abstractC1255540imG);

    public AbstractC1255540imG(EnumC1253890ijb enumC1253890ijb) {
        this.LIZ = enumC1253890ijb;
    }

    public void LIZ(JSONObject jSONObject) throws JSONException {
        jSONObject.put("notice_type", this.LIZ.getValue());
    }
}
