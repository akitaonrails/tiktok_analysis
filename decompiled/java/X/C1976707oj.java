package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Pair;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.07oj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1976707oj {
    public static final Pair<Integer, Integer> LIZ(String str) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        String strOptString;
        if (str != null) {
            try {
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("catch exception, e=");
                sbLIZ.append(e.getMessage());
                C20441214yg.LJ("FullLinkExt", C2188811AlT.LIZIZ(sbLIZ));
            }
            if (str.length() != 0) {
                JSONObject jSONObjectOptJSONObject3 = new JSONObject(str).optJSONObject("data");
                if (jSONObjectOptJSONObject3 != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject3.optJSONObject("origin")) != null && (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("main")) != null && (strOptString = jSONObjectOptJSONObject2.optString("sdk_params")) != null) {
                    String strOptString2 = new JSONObject(strOptString).optString("resolution");
                    if (!TextUtils.isEmpty(strOptString2)) {
                        int iLJJIZ = a0.LJJIZ(strOptString2, 'x', 0, false, 6);
                        if (iLJJIZ > 0 && iLJJIZ < strOptString2.length() - 1) {
                            return new Pair<>(Integer.valueOf(CastIntegerProtector.parseInt(strOptString2.substring(0, iLJJIZ))), Integer.valueOf(CastIntegerProtector.parseInt(strOptString2.substring(iLJJIZ + 1))));
                        }
                        C20441214yg.LJ("FullLinkExt", "return null. index not right.");
                        return null;
                    }
                }
                C20441214yg.LJ("FullLinkExt", "return null.");
                return null;
            }
        }
        C20441214yg.LJ("FullLinkExt", "streamData is null when get video resolution");
        return null;
    }
}
