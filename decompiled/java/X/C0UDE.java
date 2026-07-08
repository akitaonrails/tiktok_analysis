package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0UDE, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UDE {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "{}")) {
            return false;
        }
        try {
            return new JSONObject(str).optBoolean("is_avatar", false);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }
}
