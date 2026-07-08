package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0CGy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C310980CGy {
    public static C310980CGy LIZIZ;
    public SharedPreferences LIZ;

    public static C310980CGy LIZ() {
        if (LIZIZ == null) {
            synchronized (C310980CGy.class) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = new C310980CGy();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZIZ;
    }

    public static String LIZIZ(String str) {
        return str;
    }

    public final void LIZJ(long j, String str) {
        Context contextLIZLLL;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty("whatever")) {
            try {
                String strLIZIZ = LIZIZ(str);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("expire_timing", j);
                jSONObject.put("cache_value", "whatever");
                if (this.LIZ == null && (contextLIZLLL = C847400XMc.LIZLLL()) != null) {
                    this.LIZ = C810670Vr7.LIZJ(contextLIZLLL, 0, "com_bytedance_sdk_account_utils_common_request_cache_helper");
                }
                SharedPreferences sharedPreferences = this.LIZ;
                if (sharedPreferences != null && System.currentTimeMillis() < j) {
                    sharedPreferences.edit().putString(strLIZIZ, C786410Ut5.J3(jSONObject)).apply();
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
