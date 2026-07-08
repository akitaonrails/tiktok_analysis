package X;

import kotlin.jvm.functions.Function2;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0c9r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1001090c9r {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Function2 function2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "businessCustomized");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("translationEvent", "globalPropsUpdated");
        jSONObject.put("extra", jSONObject2);
        function2.invoke("anole_event", jSONObject);
    }
}
