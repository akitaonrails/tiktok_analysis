package X;

import android.os.Build;
import android.util.Base64;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.nio.charset.StandardCharsets;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0wgj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1790270wgj {
    public static final int LIZ = ((C1795210woh) ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZ()).LIZ.LIZIZ.LIZJ;

    public static String LIZ(String str) {
        String strEncodeToString;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("client_param", str);
            jSONObject.put("app_version", String.valueOf(LIZ));
            jSONObject.put("client_version", "iapOpaqueV1");
            try {
                byte[] bytes = C786410Ut5.J3(jSONObject).getBytes(StandardCharsets.UTF_8);
                if (Build.VERSION.SDK_INT < 26 || bytes == null) {
                    strEncodeToString = Base64.encodeToString(bytes, 2);
                } else {
                    strEncodeToString = java.util.Base64.getEncoder().encodeToString(bytes);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strEncodeToString);
                sbLIZ.append(".1");
                return C2188811AlT.LIZIZ(sbLIZ);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return "";
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            return "";
        }
    }
}
