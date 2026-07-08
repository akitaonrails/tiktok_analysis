package X;

import android.text.TextUtils;
import com.bytedance.crash.monitor.k;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Vda, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C802280Vda {
    public static void LIZ(File file) {
        C802790VeP c802790VeP = k.LIZ;
        if (c802790VeP == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (c802790VeP.LJIIIIZZ() != 0 && !TextUtils.isEmpty(c802790VeP.LJIIIZ())) {
            try {
                jSONObject.put("version_code", c802790VeP.LJIIIIZZ());
                jSONObject.put("update_version_code", c802790VeP.LJFF());
                jSONObject.put("version_name", c802790VeP.LJIIIZ());
                jSONObject.put("app_version", c802790VeP.LJIIIZ());
                jSONObject.put("manifest_version_code", c802790VeP.LJIILJJIL());
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        if (jSONObject.length() > 0) {
            C2112008Pe.LJII(new C0VSJ(file, "version.json"), C786410Ut5.J3(jSONObject));
        }
    }
}
