package X;

import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0wnL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1794370wnL extends C1793980wmi {
    public long LIZ;
    public final String LIZIZ;
    public String LIZJ;
    public final String LIZLLL;
    public final boolean LJ;
    public final int LJFF;
    public final C1794480wnW LJI;
    public String LJII = "";
    public final String LJIIIIZZ;

    public final void LJ() {
        HashMap<String, ?> map;
        this.LIZ = SystemClock.uptimeMillis();
        this.LJII = UUID.randomUUID().toString();
        JSONObject jSONObject = new JSONObject();
        C1793980wmi.LIZIZ("payment_attempt_id", this.LJII, jSONObject);
        C1793980wmi.LIZIZ("client_flow", this.LJI.LIZ.LJIILIIL, jSONObject);
        C1793980wmi.LIZIZ("request_id", this.LIZJ, jSONObject);
        C1793980wmi.LIZIZ("product_id", this.LIZIZ, jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        C1793980wmi.LIZ("pay_type", this.LJFF, jSONObject2);
        C1793980wmi.LIZ("is_subscription", this.LJ ? 1L : 0L, jSONObject2);
        C1793980wmi.LIZIZ("payment_method", this.LJI.LJJ.channelName, jSONObject2);
        C1793980wmi.LIZIZ("merchant_id", this.LIZLLL, jSONObject2);
        C1793980wmi.LIZ("ntp_time_ms", C158B.LIZ(), jSONObject2);
        C1794480wnW c1794480wnW = this.LJI;
        if (c1794480wnW != null) {
            C1793980wmi.LIZIZ("biz_content", c1794480wnW.LIZIZ, jSONObject2);
        }
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
        C1793980wmi.LIZIZ("billing_country_code", this.LJIIIIZZ, jSONObject2);
        LIZLLL(jSONObject2);
        InterfaceC1794350wnJ interfaceC1794350wnJLJ = ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LJ();
        EnumC1794330wnH enumC1794330wnH = EnumC1794330wnH.BOTH;
        C1794310wnF c1794310wnF = (C1794310wnF) interfaceC1794350wnJLJ;
        c1794310wnF.getClass();
        c1794310wnF.LIZ(enumC1794330wnH, "livesdk_iap_pay_start", jSONObject2, null, jSONObject);
    }

    public static void LIZLLL(JSONObject jSONObject) {
        C1793980wmi.LIZIZ("thread_name", C786410Ut5.u3().getName(), jSONObject);
        C1793980wmi.LIZ("thread_id", C786410Ut5.u3().getId(), jSONObject);
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            try {
                jSONObject.put("is_main_thread", mainLooper.isCurrentThread());
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public C1794370wnL(String str, String str2, boolean z, EnumC1794260wnA enumC1794260wnA, C1794480wnW c1794480wnW, String str3) {
        String str4;
        this.LIZLLL = "";
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LJ = z;
        if (enumC1794260wnA == null) {
            this.LJFF = -1;
        } else {
            this.LJFF = enumC1794260wnA.getValue();
        }
        this.LJI = c1794480wnW;
        C1792170wjn c1792170wjn = c1794480wnW.LIZ;
        if (c1792170wjn != null && (str4 = c1792170wjn.LIZIZ) != null) {
            this.LIZLLL = str4;
        }
        this.LJIIIIZZ = str3;
        C158B.LIZLLL(((C1795210woh) ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZ()).LIZ.LIZ);
    }
}
