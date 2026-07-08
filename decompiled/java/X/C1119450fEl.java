package X;

import com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0fEl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1119450fEl {
    public static final C1119450fEl LIZ = new C1119450fEl();

    public static void LIZ(int i, String str, String str2, String str3) {
        C1CC3 c1cc3MN2;
        try {
            ILoggerService iLoggerService = (ILoggerService) PluggableExtentionKt.pluggableSpi$default(ILoggerService.class, false, false, false, 14, null);
            if (iLoggerService != null && (c1cc3MN2 = iLoggerService.MN2()) != null) {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject.put("error_position", str);
                jSONObject2.put("error_position", str);
                jSONObject2.put("error_msg", str2);
                jSONObject2.put("error_code", i);
                if (str3 == null) {
                    str3 = "";
                }
                jSONObject2.put("log_id", str3);
                c1cc3MN2.LJIL("fans_club", "ttlive_livesdk_high_lighting_post_image_fail", jSONObject, new JSONObject(), jSONObject2);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
