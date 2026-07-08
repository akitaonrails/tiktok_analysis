package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0wmX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1793870wmX extends C1793980wmi {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;
    public final int LJ;
    public final long LJFF;
    public long LJI;
    public final C1794480wnW LJII;

    public final void LIZLLL(boolean z, C1792220wjs c1792220wjs) {
        long jUptimeMillis;
        long j;
        String str;
        HashMap<String, ?> map;
        long j2 = 0;
        if (this.LJI > 0) {
            jUptimeMillis = SystemClock.uptimeMillis() - this.LJI;
        } else {
            jUptimeMillis = 0;
        }
        this.LJI = 0L;
        JSONObject jSONObject = new JSONObject();
        if (z) {
            j = 0;
        } else {
            j = 1;
        }
        C1793980wmi.LIZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, j, jSONObject);
        C1793980wmi.LIZ("pay_type", this.LJ, jSONObject);
        if (this.LIZLLL) {
            j2 = 1;
        }
        C1793980wmi.LIZ("is_subscription", j2, jSONObject);
        C1793980wmi.LIZIZ("payment_method", this.LJII.LJJ.channelName, jSONObject);
        C1793980wmi.LIZIZ("merchant_id", this.LIZJ, jSONObject);
        if (c1792220wjs != null) {
            C1793980wmi.LIZ("result_code", c1792220wjs.LIZ, jSONObject);
            C1793980wmi.LIZ("result_detail_code", c1792220wjs.LIZIZ, jSONObject);
            C1793980wmi.LIZIZ("result_message", c1792220wjs.LJ, jSONObject);
        } else {
            C1793980wmi.LIZ("result_code", -1L, jSONObject);
            C1793980wmi.LIZ("result_detail_code", -1L, jSONObject);
            C1793980wmi.LIZIZ("result_message", "unknown", jSONObject);
        }
        C1792170wjn c1792170wjn = this.LJII.LIZ;
        if (c1792170wjn != null && (map = c1792170wjn.LJI) != null) {
            LIZJ(map, jSONObject);
        }
        C1793980wmi.LIZIZ("billing_country_code", C1794580wng.LIZ(this.LJII), jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        C1793980wmi.LIZ("time_consuming", jUptimeMillis, jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        C1793980wmi.LIZIZ("product_id", this.LIZ, jSONObject3);
        C1793980wmi.LIZIZ("request_id", this.LIZIZ, jSONObject3);
        InterfaceC1794350wnJ interfaceC1794350wnJLJ = ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LJ();
        EnumC1794330wnH enumC1794330wnH = EnumC1794330wnH.BOTH;
        if (z) {
            str = "livesdk_iap_create_order_success";
        } else {
            str = "livesdk_iap_create_order_fail";
        }
        C1794310wnF c1794310wnF = (C1794310wnF) interfaceC1794350wnJLJ;
        c1794310wnF.getClass();
        c1794310wnF.LIZ(enumC1794330wnH, str, jSONObject, jSONObject2, jSONObject3);
    }

    public C1793870wmX(String str, String str2, boolean z, EnumC1794260wnA enumC1794260wnA, long j, C1794480wnW c1794480wnW) {
        String str3;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZLLL = z;
        this.LJII = c1794480wnW;
        if (enumC1794260wnA == null) {
            this.LJ = -1;
        } else {
            this.LJ = enumC1794260wnA.getValue();
        }
        C1792170wjn c1792170wjn = c1794480wnW.LIZ;
        if (c1792170wjn != null && (str3 = c1792170wjn.LIZIZ) != null) {
            this.LIZJ = str3;
        }
        this.LJFF = j;
    }
}
