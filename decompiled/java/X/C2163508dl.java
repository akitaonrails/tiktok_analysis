package X;

import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08dl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2163508dl {
    public static final /* synthetic */ int LIZ = 0;

    static {
        new Object() { // from class: X.08dm
        };
    }

    public static void LIZ(Object... objArr) {
        JSONObject jSONObject = new JSONObject();
        int length = objArr.length;
        if (length % 2 == 0) {
            for (int i = 0; i < length; i += 2) {
                try {
                    jSONObject.put(String.valueOf(objArr[i]), String.valueOf(objArr[i + 1]));
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            C786410Ut5.J3(jSONObject);
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void LIZIZ(Throwable th, String... strArr) {
        StringBuilder sb = new StringBuilder(400);
        for (String str : strArr) {
            sb.append(str);
        }
        String string = sb.toString();
        if (string == null) {
            string = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(string);
        sbLIZ.append("  ");
        sbLIZ.append(Log.getStackTraceString(th));
        C2188811AlT.LIZIZ(sbLIZ);
    }
}
