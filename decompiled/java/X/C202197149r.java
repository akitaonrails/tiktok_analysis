package X;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tts.oecverify.BdTuring;
import com.tts.oecverify.BdTuringCallback;
import com.tts.oecverify.BdTuringConfig;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.149r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C202197149r {
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public static void LIZ(String str, Activity activity, String str2, int i, int i2, int i3, int i4, BdTuringCallback bdTuringCallback) {
        JSONObject jSONObject = new JSONObject();
        BdTuringConfig config = BdTuring.getInstance().getConfig();
        try {
            jSONObject.put("mobile", str2);
            jSONObject.put("app_id", CastIntegerProtector.parseInt(config.getAppId()));
            try {
                jSONObject.put("channel_id", i);
                try {
                    jSONObject.put(Scene.SCENE_SERVICE, i2);
                } catch (JSONException e) {
                    e = e;
                }
            } catch (JSONException e2) {
                e = e2;
            }
        } catch (JSONException e3) {
            e = e3;
        }
        try {
            jSONObject.put("code_type", i4);
            jSONObject.put("language", config.getLanguage());
            jSONObject.put("ac", C786410Ut5.b3(C786410Ut5.L3(activity)));
            jSONObject.put("app_name", config.getAppName());
            jSONObject.put("channel", config.getChannel());
            jSONObject.put("device_brand", C202204149y.LIZ);
            jSONObject.put("device_id", config.getDeviceId());
            jSONObject.put("device_platform", "Android");
            jSONObject.put("device_type", C202204149y.LIZIZ);
            jSONObject.put("iid", config.getInstallId());
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("");
            sbLIZ.append((int) (C148O.LIZLLL(C786410Ut5.L3(activity)) * 160.0f));
            jSONObject.put("dpi", C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("");
            Context contextL3 = C786410Ut5.L3(activity);
            int i5 = 0;
            try {
                PackageInfo packageInfoY3 = C786410Ut5.Y3(contextL3.getPackageManager(), contextL3.getPackageName(), 0);
                if (packageInfoY3 != null) {
                    i5 = packageInfoY3.versionCode;
                }
            } catch (PackageManager.NameNotFoundException e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            sbLIZ2.append(i5);
            jSONObject.put("manifest_version_code", C2188811AlT.LIZIZ(sbLIZ2));
            jSONObject.put("openudid", config.getOpenUdid());
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("");
            sbLIZ3.append(C202204149y.LIZJ);
            jSONObject.put("os_api", C2188811AlT.LIZIZ(sbLIZ3));
            jSONObject.put("os_version", C202204149y.LIZLLL);
            jSONObject.put("resolution", C148O.LJ(activity));
            jSONObject.put("version_code", config.getAppVersion().replace(e3.d, ""));
            jSONObject.put("version_name", config.getAppVersion());
            try {
                jSONObject.put("event_type", i3);
            } catch (JSONException e5) {
                e = e5;
                TryCatchGuardChecker.doCheck(e);
            }
        } catch (JSONException e6) {
            e = e6;
            TryCatchGuardChecker.doCheck(e);
            HashMap map = new HashMap();
            map.put("Content-Type", "application/json");
            C145R.LIZ.LIZ(new RunnableC202196149q(config, str, map, jSONObject, bdTuringCallback, activity, str2, i, i2, i3, i4));
        }
        HashMap map2 = new HashMap();
        map2.put("Content-Type", "application/json");
        C145R.LIZ.LIZ(new RunnableC202196149q(config, str, map2, jSONObject, bdTuringCallback, activity, str2, i, i2, i3, i4));
    }
}
