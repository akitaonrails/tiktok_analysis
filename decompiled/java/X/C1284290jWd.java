package X;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jWd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1284290jWd {
    public static C1284300jWe LIZ(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        String str = null;
        if (!Intrinsics.LJFF(jSONObject.optString("command"), "privacy_data_loader") || (jSONObjectOptJSONObject = jSONObject.optJSONObject("params")) == null) {
            return null;
        }
        String string = a0.LJLIIIL(jSONObject.optString("reason")).toString();
        if (string.length() > 0) {
            str = string;
        }
        return new C1284300jWe(str, new JSONObject(C786410Ut5.J3(jSONObjectOptJSONObject)));
    }
}
