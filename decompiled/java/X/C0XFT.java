package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XFT, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XFT {
    public static void LIZIZ(boolean z, int i, String str, boolean z2, long j, int i2, String str2, Long l) {
        int i3;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("error_code", i2);
            if (str2 != null) {
                jSONObject.put("error_msg", str2);
            }
            int i4 = 1;
            if (z) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            jSONObject.put("is_get_all", i3);
            jSONObject.put("version_id", str);
            jSONObject.put("account_num", i);
            jSONObject.put("duration", j);
            if (!z2) {
                i4 = 0;
            }
            jSONObject.put("is_redirected_back_from_tiktok", i4);
            if (l != null) {
                jSONObject.put("tt_launch_ahead", l.longValue());
            }
            C0XG9.LJ("oidc_get_cache_token_result", jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LIZ(Context context, String str, String str2, boolean z, long j, boolean z2, Boolean bool, C0WQL c0wql, Function1 function1, int i) {
        Boolean bool2 = bool;
        long j2 = j;
        boolean z3 = z;
        boolean z4 = z2;
        String str3 = str;
        String str4 = "";
        if ((i & 2) != 0) {
            str3 = "";
        }
        if ((i & 4) == 0) {
            str4 = str2;
        }
        if ((i & 8) != 0) {
            z3 = false;
        }
        if ((i & 16) != 0) {
            j2 = Mp4ScreenVideoLoadTimeout.CONTROL;
        }
        if ((i & 32) != 0) {
            z4 = false;
        }
        if ((i & 64) != 0) {
            bool2 = null;
        }
        CoroutineContext coroutineContext = c0wql;
        if ((i & 128) != 0) {
            coroutineContext = C0PEM.LIZJ;
        }
        System.currentTimeMillis();
        C23250099c.LIZLLL(C2296808zG.LIZ(coroutineContext), null, null, new C0XFR(context, str4, z3, z4, j2, function1, str3, bool2, null), 3);
    }
}
