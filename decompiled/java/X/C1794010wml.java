package X;

import android.os.SystemClock;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0wml, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1794010wml extends C1793980wmi {
    public long LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final boolean LJ;
    public final int LJFF;
    public final C1794480wnW LJI;

    public final void LIZLLL() {
        HashMap<String, ?> map;
        this.LIZ = SystemClock.uptimeMillis();
        JSONObject jSONObject = new JSONObject();
        C1793980wmi.LIZIZ("product_id", this.LIZIZ, jSONObject);
        C1793980wmi.LIZIZ("request_id", this.LIZJ, jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        C1793980wmi.LIZ("pay_type", this.LJFF, jSONObject2);
        C1793980wmi.LIZ("is_subscription", this.LJ ? 1L : 0L, jSONObject2);
        C1793980wmi.LIZIZ("payment_method", this.LJI.LJJ.channelName, jSONObject2);
        C1793980wmi.LIZIZ("merchant_id", this.LIZLLL, jSONObject2);
        C1792170wjn c1792170wjn = this.LJI.LIZ;
        if (c1792170wjn != null && (map = c1792170wjn.LJI) != null) {
            LIZJ(map, jSONObject2);
        }
        AbstractC1794600wni abstractC1794600wni = this.LJI.LJIIJ;
        if (abstractC1794600wni != null) {
            C1793980wmi.LIZIZ("channel_order_id", abstractC1794600wni.LJFF, jSONObject2);
        }
        if (!C2093608Ic.LJ(this.LJI.LJJIFFI)) {
            C1793980wmi.LIZIZ("restore_entrance", this.LJI.LJJIFFI, jSONObject2);
        }
        C1793980wmi.LIZIZ("billing_country_code", C1794580wng.LIZ(this.LJI), jSONObject2);
        InterfaceC1794350wnJ interfaceC1794350wnJLJ = ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LJ();
        EnumC1794330wnH enumC1794330wnH = EnumC1794330wnH.BOTH;
        C1794310wnF c1794310wnF = (C1794310wnF) interfaceC1794350wnJLJ;
        c1794310wnF.getClass();
        c1794310wnF.LIZ(enumC1794330wnH, "livesdk_iap_send_receipt", jSONObject2, null, jSONObject);
    }

    public C1794010wml(C1794480wnW c1794480wnW, EnumC1794260wnA enumC1794260wnA, String str, String str2, boolean z) {
        String str3;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LJ = z;
        this.LJI = c1794480wnW;
        if (enumC1794260wnA != null) {
            this.LJFF = enumC1794260wnA.getValue();
        } else {
            this.LJFF = -1;
        }
        C1792170wjn c1792170wjn = c1794480wnW.LIZ;
        if (c1792170wjn != null && (str3 = c1792170wjn.LIZIZ) != null) {
            this.LIZLLL = str3;
        }
    }

    public final void LJ(boolean z, C1792840wks c1792840wks, boolean z2, String str, int i) {
        long j;
        long j2;
        String strLIZLLL;
        String str2;
        String str3;
        HashMap<String, ?> map;
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (C1794020wmm.LIZ.equals(this.LIZJ)) {
            C1794020wmm.LJI = jUptimeMillis;
        }
        long j3 = this.LIZ;
        long j4 = 0;
        if (j3 > 0) {
            j = jUptimeMillis - j3;
        } else {
            j = 0;
        }
        this.LIZ = 0L;
        if (C1794020wmm.LIZ.equals(this.LIZJ)) {
            C1794020wmm.LJ = j;
        }
        JSONObject jSONObject = new JSONObject();
        C1793980wmi.LIZ("pay_type", this.LJFF, jSONObject);
        if (z) {
            j2 = 0;
        } else {
            j2 = 1;
        }
        C1793980wmi.LIZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, j2, jSONObject);
        if (this.LJ) {
            j4 = 1;
        }
        C1793980wmi.LIZ("is_subscription", j4, jSONObject);
        C1793980wmi.LIZIZ("payment_method", this.LJI.LJJ.channelName, jSONObject);
        C1793980wmi.LIZIZ("merchant_id", this.LIZLLL, jSONObject);
        if (str != null) {
            C1793980wmi.LIZIZ("order_status", str, jSONObject);
        }
        if (i >= 0) {
            C1793980wmi.LIZ("retry_count", i, jSONObject);
        }
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
        C1792170wjn c1792170wjn = this.LJI.LIZ;
        if (c1792170wjn != null && (map = c1792170wjn.LJI) != null) {
            LIZJ(map, jSONObject);
        }
        AbstractC1794600wni abstractC1794600wni = this.LJI.LJIIJ;
        if (abstractC1794600wni != null) {
            C1793980wmi.LIZIZ("channel_order_id", abstractC1794600wni.LJFF, jSONObject);
        }
        C1793980wmi.LIZIZ("billing_country_code", C1794580wng.LIZ(this.LJI), jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        C1793980wmi.LIZ("time_consuming", j, jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        C1793980wmi.LIZIZ("product_id", this.LIZIZ, jSONObject3);
        if (!C2093608Ic.LJ(this.LIZJ)) {
            strLIZLLL = this.LIZJ;
        } else {
            strLIZLLL = this.LJI.LIZLLL();
        }
        C1793980wmi.LIZIZ("request_id", strLIZLLL, jSONObject3);
        if (z2) {
            str2 = "second";
        } else {
            str2 = "first";
        }
        C1793980wmi.LIZIZ(Scene.SCENE_SERVICE, str2, jSONObject);
        if (!C2093608Ic.LJ(this.LJI.LJJIFFI)) {
            C1793980wmi.LIZIZ("restore_entrance", this.LJI.LJJIFFI, jSONObject);
        }
        InterfaceC1794350wnJ interfaceC1794350wnJLJ = ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LJ();
        EnumC1794330wnH enumC1794330wnH = EnumC1794330wnH.BOTH;
        if (z) {
            str3 = "livesdk_iap_send_receipt_request_success";
        } else {
            str3 = "livesdk_iap_send_receipt_request_fail";
        }
        C1794310wnF c1794310wnF = (C1794310wnF) interfaceC1794350wnJLJ;
        c1794310wnF.getClass();
        c1794310wnF.LIZ(enumC1794330wnH, str3, jSONObject, jSONObject2, jSONObject3);
    }
}
