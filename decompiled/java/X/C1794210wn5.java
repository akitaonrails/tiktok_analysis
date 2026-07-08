package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0wn5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1794210wn5 extends C1794220wn6 {
    public final String LIZJ;
    public final String LIZLLL;

    public final void LIZLLL() {
        JSONObject jSONObject = new JSONObject();
        C1793980wmi.LIZIZ("request_id", this.LIZJ, jSONObject);
        C1793980wmi.LIZIZ("product_id", this.LIZLLL, jSONObject);
        this.LIZIZ = SystemClock.uptimeMillis();
        JSONObject jSONObject2 = new JSONObject();
        C1793980wmi.LIZIZ("api_name", this.LIZ, jSONObject2);
        ((C1795850wpj) ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LJFF()).LIZ("api_request_start", jSONObject2, null, jSONObject);
    }

    public final void LJ(boolean z, C1792840wks c1792840wks) {
        long j;
        JSONObject jSONObject = new JSONObject();
        long jUptimeMillis = 0;
        if (z) {
            j = 0;
        } else {
            j = 1;
        }
        C1793980wmi.LIZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, j, jSONObject);
        C1793980wmi.LIZIZ("api_name", this.LIZ, jSONObject);
        if (c1792840wks != null) {
            C1793980wmi.LIZ("result_code", c1792840wks.LIZ, jSONObject);
            C1793980wmi.LIZ("result_detail_code", c1792840wks.LIZIZ, jSONObject);
            C1793980wmi.LIZIZ("result_message", c1792840wks.LJ, jSONObject);
            C1792850wkt.LIZ(c1792840wks.LIZ, c1792840wks.LIZIZ, c1792840wks.LJ, jSONObject);
        } else {
            C1793980wmi.LIZ("result_code", -1L, jSONObject);
            C1793980wmi.LIZ("result_detail_code", -1L, jSONObject);
            C1793980wmi.LIZIZ("result_message", "unknown", jSONObject);
        }
        JSONObject jSONObject2 = new JSONObject();
        C1793980wmi.LIZIZ("request_id", this.LIZJ, jSONObject2);
        C1793980wmi.LIZIZ("product_id", this.LIZLLL, jSONObject2);
        if (this.LIZIZ > 0) {
            jUptimeMillis = SystemClock.uptimeMillis() - this.LIZIZ;
        }
        JSONObject jSONObject3 = new JSONObject();
        C1793980wmi.LIZ("time_consuming", jUptimeMillis, jSONObject3);
        ((C1795850wpj) ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LJFF()).LIZ("api_request_end", jSONObject, jSONObject3, jSONObject2);
    }

    public C1794210wn5(String str, String str2, String str3) {
        super(str);
        this.LIZJ = str2;
        this.LIZLLL = str3;
    }
}
