package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0IhA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C473260IhA {
    public static SeiAppData LIZ(String str) {
        try {
            SeiAppData seiAppData = (SeiAppData) C19748512Ol.LIZIZ.LJII(str, SeiAppData.class);
            if (seiAppData == null) {
                return null;
            }
            if (seiAppData.version < 0) {
                return null;
            }
            return seiAppData;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public static SeiAppData LIZIZ(String str) {
        SeiAppData seiAppDataLIZ = null;
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("app_data")) {
                    seiAppDataLIZ = LIZ(JSONObjectProtectorUtils.getString(jSONObject, "app_data"));
                    return seiAppDataLIZ;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return seiAppDataLIZ;
    }
}
