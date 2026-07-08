package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Serializable;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oQp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1472890oQp implements Serializable {
    public final double LL;
    public final double LLILLJJLI;
    public final double LLILLL;

    public double getLoudness() {
        return this.LLILLL;
    }

    public double getPlatformLu() {
        return this.LL;
    }

    public double getVersion() {
        return this.LLILLJJLI;
    }

    public static C1472890oQp fromJson(String str) {
        JSONObject jSONObjectOptJSONObject;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("Metrics");
            double dOptDouble = jSONObject.optDouble("Loudness");
            if (jSONObjectOptJSONObject2 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("loudnorm_info")) == null) {
                return null;
            }
            return new C1472890oQp(jSONObjectOptJSONObject.optDouble("platform_lu", 1.401298464324817E-45d), jSONObjectOptJSONObject.optDouble("version", 0.10000000149011612d), dOptDouble);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public C1472890oQp(double d, double d2, double d3) {
        this.LL = 1.401298464324817E-45d;
        this.LLILLJJLI = 0.10000000149011612d;
        this.LL = d;
        this.LLILLJJLI = d2;
        this.LLILLL = d3;
    }
}
