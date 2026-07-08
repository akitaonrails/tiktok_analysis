package X;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.lib.AppLogNewUtils;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.09Nk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2362209Nk {
    public static void LIZ(Uri uri, String str) {
        if (uri == null) {
            return;
        }
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        if (contextLIZ == null || !C08Q0.LJ(contextLIZ, "enable_process_start_event", false)) {
            return;
        }
        C2362309Nl c2362309Nl = C2362309Nl.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(">");
        sbLIZ.append(uri);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2362309Nl.getClass();
        if (!C2362309Nl.LIZIZ) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("process", C2162308dZ.LIZ(C1BWL.LIZ()));
                if (!TextUtils.isEmpty(strLIZIZ)) {
                    jSONObject.put("uri", strLIZIZ);
                }
                if (C2104108Md.LIZLLL(C1BWL.LIZ())) {
                    AppLogNewUtils.onEventV3("process_start_reason_event", jSONObject);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            C2362309Nl.LIZIZ = true;
        }
    }
}
