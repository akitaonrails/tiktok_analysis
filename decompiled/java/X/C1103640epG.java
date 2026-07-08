package X;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0epG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1103640epG extends C09AY implements Function0<JSONObject> {
    public C1103640epG() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final JSONObject invoke() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("date", new SimpleDateFormat("yyyyMMdd", Locale.getDefault()).format(new Date()));
        jSONObject.put("profile_usage", new JSONObject());
        jSONObject.put("is_new_sdk", C1103790epV.LIZ());
        jSONObject.put("profile_group_usage", new JSONObject());
        return jSONObject;
    }
}
