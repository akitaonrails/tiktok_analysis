package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0uKW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1699620uKW {
    public static boolean LIZ;

    public static String LIZ(Throwable th) {
        int i;
        JSONObject jSONObject = new JSONObject();
        try {
            if (th instanceof C1BRG) {
                i = ((C1BRG) th).LL;
            } else {
                i = 0;
            }
            jSONObject.put("code", i);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return C786410Ut5.J3(jSONObject);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> String LIZIZ(C19919812wm c19919812wm, T t) {
        String strSubstring;
        if ((t instanceof JSONObject) && LIZ && c19919812wm.LIZIZ) {
            JSONObject jSONObject = (JSONObject) t;
            try {
                jSONObject.put("code", 1);
                return C786410Ut5.J3(jSONObject);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        String strLIZIZ = c19919812wm.LIZIZ(t);
        if (TextUtils.isEmpty(strLIZIZ)) {
            return "{\"code\":1}";
        }
        if (LIZ) {
            strSubstring = strLIZIZ.substring(1, strLIZIZ.length() - 1);
        } else {
            strSubstring = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("{\"code\":1,\"__data\":");
        sbLIZ.append(strLIZIZ);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
        if (!strSubstring.isEmpty()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZIZ2);
            sbLIZ2.append(",");
            sbLIZ2.append(strSubstring);
            sbLIZ2.append("}");
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(strLIZIZ2);
        sbLIZ3.append("}");
        return C2188811AlT.LIZIZ(sbLIZ3);
    }
}
