package X;

import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0W7d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C818030W7d {
    public static final String LIZ;

    static {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("pf", "android");
            jSONObject.put("osv", Build.VERSION.RELEASE + ";" + Build.VERSION.SDK_INT);
            jSONObject.put("bd", Build.BRAND);
            jSONObject.put("mf", Build.MANUFACTURER);
            jSONObject.put("md", Build.MODEL);
            LIZ = C786410Ut5.J3(jSONObject);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            LIZ = "{\"pf\":\"android\",\"osv\":\"" + Build.VERSION.RELEASE + ";" + Build.VERSION.SDK_INT + "\",\"bd\":\"" + Build.BRAND + "\",\"mf\":\"" + Build.MANUFACTURER + "\",\"md\":\"" + Build.MODEL + "\"}";
        }
    }
}
