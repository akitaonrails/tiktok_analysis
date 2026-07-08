package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0yDa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1849080yDa {
    public static C1849060yDY LIZ(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString(FollowStatusChangeMethod.PARAM_UID);
        String strOptString2 = jSONObject.optString("path");
        boolean zOptBoolean = jSONObject.optBoolean("exists");
        return new C1849060yDY(jSONObject.optInt("entryCount"), jSONObject.optLong("modifiedAt"), jSONObject.optLong("size"), jSONObject.optLong("totalBytes"), strOptString, strOptString2, zOptBoolean);
    }
}
