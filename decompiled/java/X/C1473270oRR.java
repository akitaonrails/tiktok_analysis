package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Serializable;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oRR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1473270oRR implements Serializable {
    public final int LL;
    public final String LLILLJJLI;

    public C1473270oRR() {
    }

    public String getFormat() {
        return this.LLILLJJLI;
    }

    public int getRealBitrate() {
        return this.LL;
    }

    public C1473270oRR(JSONObject jSONObject) {
        this.LL = jSONObject.optInt("real_bitrate");
        this.LLILLJJLI = jSONObject.optString("format");
    }

    public static C1473270oRR from(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                return new C1473270oRR(new JSONObject(str));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return new C1473270oRR();
    }
}
