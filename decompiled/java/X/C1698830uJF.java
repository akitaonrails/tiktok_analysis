package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0uJF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1698830uJF {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final String LIZ() {
        try {
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        JSONObject jSONObject = this.LIZJ != null ? new JSONObject(this.LIZJ) : null;
        if (jSONObject != null && jSONObject.has("VCodec")) {
            String strOptString = jSONObject.optString("VCodec");
            if (!TextUtils.isEmpty(strOptString)) {
                return strOptString;
            }
        }
        return null;
    }

    public C1698830uJF(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
