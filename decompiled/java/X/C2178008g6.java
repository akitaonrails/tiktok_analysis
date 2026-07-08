package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.URL;
import java.util.Map;

/* JADX INFO: renamed from: X.08g6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2178008g6 {
    public static void LIZ(Context context, String str, Map<String, String> map) {
        boolean z;
        try {
            URL url = new URL(str);
            int i = 0;
            if (!TextUtils.isEmpty(url.getPath()) && url.getPath().contains("vc/setting")) {
                z = !C810670Vr7.LIZJ(context, 0, "bd_turning_settings_init").getBoolean("inited", false);
            } else {
                z = true;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("");
            sbLIZ.append("n=");
            if (z) {
                i = 1;
            }
            sbLIZ.append(i);
            sbLIZ.append(";");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append("t=0");
            map.put("x-tt-request-tag", C2188811AlT.LIZIZ(sbLIZ2));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
