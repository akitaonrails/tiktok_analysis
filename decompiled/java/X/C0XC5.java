package X;

import android.content.SharedPreferences;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XC5, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XC5 {
    public static final C0XC5 LIZ = new C0XC5();
    public static volatile boolean LIZIZ = true;
    public static volatile String LIZJ = "";
    public static volatile Pair<String, String> LIZLLL = new Pair<>("", "");

    public final String LIZ() {
        String str;
        String string;
        synchronized (this) {
            try {
                if ((LIZJ.length() == 0) && LIZIZ) {
                    SharedPreferences sharedPreferencesLIZIZ = C844580XBg.LIZIZ(C0XCJ.LIZIZ.LJ());
                    if (sharedPreferencesLIZIZ == null || (string = sharedPreferencesLIZIZ.getString("device_token_info", "")) == null) {
                        string = "";
                    }
                    LIZJ = string;
                    LIZIZ = false;
                }
                str = LIZJ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return str;
    }

    public final Pair<String, String> LIZIZ() {
        Pair<String, String> pair;
        synchronized (this) {
            try {
                if (LIZLLL.getFirst().length() == 0 || LIZLLL.getSecond().length() == 0) {
                    LIZLLL = LIZ.LIZJ();
                }
                pair = LIZLLL;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return pair;
    }

    public final Pair<String, String> LIZJ() {
        String strOptString;
        String str;
        JSONObject jSONObject;
        String strOptString2 = "";
        if (LIZ().length() > 0) {
            try {
                jSONObject = new JSONObject(LIZ());
                strOptString = jSONObject.optString("device_token", "");
            } catch (JSONException e) {
                e = e;
                strOptString = "";
            }
            try {
                strOptString2 = jSONObject.optString("dtoken_sign", "");
            } catch (JSONException e2) {
                e = e2;
                TryCatchGuardChecker.doCheck(e);
                C844870XCj.LIZ(Intrinsics.LJIIJJI(e.getMessage(), "handleDTokenInfo: JSON parse error, "));
            }
            str = strOptString2;
            strOptString2 = strOptString;
        } else {
            str = "";
        }
        return new Pair<>(strOptString2, str);
    }

    public final void LIZLLL(Pair<String, String> pair) {
        synchronized (this) {
            try {
                LIZLLL = pair;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
