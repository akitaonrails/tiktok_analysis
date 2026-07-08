package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0wmk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1794000wmk extends C1793980wmi {
    public long LIZ;
    public final String LIZIZ;
    public String LIZJ;
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
        c1794310wnF.LIZ(enumC1794330wnH, "livesdk_iap_start_check_order_receipt", jSONObject2, null, jSONObject);
    }

    public final void LJ(boolean z, int i, C1792840wks c1792840wks, int i2) {
        long jUptimeMillis;
        long j;
        String str;
        HashMap<String, ?> map;
        long j2 = 0;
        if (this.LIZ > 0) {
            jUptimeMillis = SystemClock.uptimeMillis() - this.LIZ;
        } else {
            jUptimeMillis = 0;
        }
        if (C1794020wmm.LIZ.equals(this.LIZJ)) {
            C1794020wmm.LJFF = jUptimeMillis;
        }
        JSONObject jSONObject = new JSONObject();
        C1793980wmi.LIZ("time_consuming", jUptimeMillis, jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        if (z) {
            j = 0;
        } else {
            j = 1;
        }
        C1793980wmi.LIZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, j, jSONObject2);
        C1793980wmi.LIZ("order_state", i, jSONObject2);
        C1793980wmi.LIZ("pay_type", this.LJFF, jSONObject2);
        if (this.LJ) {
            j2 = 1;
        }
        C1793980wmi.LIZ("is_subscription", j2, jSONObject2);
        C1793980wmi.LIZIZ("payment_method", this.LJI.LJJ.channelName, jSONObject2);
        C1793980wmi.LIZIZ("merchant_id", this.LIZLLL, jSONObject2);
        if (i2 >= 0) {
            C1793980wmi.LIZ("retry_count", i2, jSONObject2);
        }
        if (c1792840wks != null) {
            C1793980wmi.LIZ("result_code", c1792840wks.LIZ, jSONObject2);
            C1793980wmi.LIZ("result_detail_code", c1792840wks.LIZIZ, jSONObject2);
            C1793980wmi.LIZIZ("result_message", c1792840wks.LJ, jSONObject2);
            C1792850wkt.LIZ(c1792840wks.LIZ, c1792840wks.LIZIZ, c1792840wks.LJ, jSONObject2);
        } else {
            C1793980wmi.LIZ("result_code", -1L, jSONObject2);
            C1793980wmi.LIZ("result_detail_code", -1L, jSONObject2);
            C1793980wmi.LIZIZ("result_message", "unknown", jSONObject2);
        }
        C1792170wjn c1792170wjn = this.LJI.LIZ;
        if (c1792170wjn != null && (map = c1792170wjn.LJI) != null) {
            LIZJ(map, jSONObject2);
        }
        AbstractC1794600wni abstractC1794600wni = this.LJI.LJIIJ;
        if (abstractC1794600wni != null) {
            C1793980wmi.LIZIZ("channel_order_id", abstractC1794600wni.LJFF, jSONObject2);
        }
        C1793980wmi.LIZIZ("billing_country_code", C1794580wng.LIZ(this.LJI), jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        C1793980wmi.LIZIZ("product_id", this.LIZIZ, jSONObject3);
        C1793980wmi.LIZIZ("request_id", this.LIZJ, jSONObject3);
        if (!C2093608Ic.LJ(this.LJI.LJJIFFI)) {
            C1793980wmi.LIZIZ("restore_entrance", this.LJI.LJJIFFI, jSONObject2);
        }
        InterfaceC1794350wnJ interfaceC1794350wnJLJ = ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LJ();
        EnumC1794330wnH enumC1794330wnH = EnumC1794330wnH.BOTH;
        if (z) {
            str = "livesdk_iap_check_order_receipt_success";
        } else {
            str = "livesdk_iap_check_order_receipt_fail";
        }
        C1794310wnF c1794310wnF = (C1794310wnF) interfaceC1794350wnJLJ;
        c1794310wnF.getClass();
        c1794310wnF.LIZ(enumC1794330wnH, str, jSONObject2, jSONObject, jSONObject3);
    }

    public C1794000wmk(C1794480wnW c1794480wnW, EnumC1794260wnA enumC1794260wnA, String str, String str2, boolean z) {
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
}
