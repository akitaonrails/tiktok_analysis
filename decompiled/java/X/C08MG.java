package X;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08MG, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08MG {
    public static final int LIZ;

    static {
        SettingsManager.LIZLLL().getClass();
        LIZ = SettingsManager.LJ("playermanager_background_check", 0);
    }

    public static boolean LIZ(String str) {
        int i = LIZ;
        if (i == 1) {
            if (TextUtils.equals("resumePlay", str)) {
                C2344809Gs.LIZLLL(4, "PlayerManagerLegacyHelper", Log.getStackTraceString(new Throwable("resumePlay")));
            }
        } else if (i != 1) {
            return false;
        }
        if (C2214201BlK.LJIIJJI) {
            String stackTraceString = Log.getStackTraceString(new Throwable("PlayVideoInAppBackground"));
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("errorMsg", stackTraceString);
                C793770VBv.LJII("play_video_in_app_background", null, null, jSONObject);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            C2344809Gs.LIZLLL(4, "PlayerManagerLegacyHelper", "Try play video when app is in background, trace is " + stackTraceString);
            return true;
        }
        return false;
    }
}
