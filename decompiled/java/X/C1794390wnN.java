package X;

import android.os.Looper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0wnN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1794390wnN extends C1793980wmi {
    public final C1794480wnW LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;

    public C1794390wnN(C1794480wnW c1794480wnW, boolean z) {
        this.LIZ = c1794480wnW;
        this.LIZIZ = z;
        ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZLLL().getClass();
        this.LIZJ = C1795410wp1.LIZJ("iap_exp_google_pay_cashier_lock_monitor", 1) == 1;
    }

    public final void LIZLLL(Integer num, Integer num2, Boolean bool, String str) {
        String str2;
        String str3;
        String strLIZLLL;
        boolean zIsCurrentThread;
        C1794370wnL c1794370wnL;
        if (!this.LIZJ) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        C1794480wnW c1794480wnW = this.LIZ;
        String str4 = null;
        if (c1794480wnW != null && (c1794370wnL = c1794480wnW.LJIIL) != null) {
            str2 = c1794370wnL.LJII;
        } else {
            str2 = null;
        }
        C1793980wmi.LIZIZ("payment_attempt_id", str2, jSONObject);
        C1794480wnW c1794480wnW2 = this.LIZ;
        if (c1794480wnW2 != null) {
            str3 = c1794480wnW2.LIZJ;
        } else {
            str3 = null;
        }
        C1793980wmi.LIZIZ("product_id", str3, jSONObject);
        C1794480wnW c1794480wnW3 = this.LIZ;
        if (c1794480wnW3 != null) {
            strLIZLLL = c1794480wnW3.LIZLLL();
        } else {
            strLIZLLL = null;
        }
        C1793980wmi.LIZIZ("request_id", strLIZLLL, jSONObject);
        C1794480wnW c1794480wnW4 = this.LIZ;
        if (c1794480wnW4 != null) {
            str4 = c1794480wnW4.LIZIZ;
        }
        C1793980wmi.LIZIZ("biz_content", str4, jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("is_subscription", this.LIZIZ);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1793980wmi.LIZIZ("payment_method", EnumC1791830wjF.GOOGLE.channelName, jSONObject2);
        C1793980wmi.LIZIZ("thread_name", C786410Ut5.u3().getName(), jSONObject2);
        C1793980wmi.LIZ("thread_id", C786410Ut5.u3().getId(), jSONObject2);
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            zIsCurrentThread = mainLooper.isCurrentThread();
        } else {
            zIsCurrentThread = false;
        }
        try {
            jSONObject2.put("is_main_thread", zIsCurrentThread);
        } catch (JSONException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        if (bool != null) {
            try {
                jSONObject2.put("lock_status", bool.booleanValue());
            } catch (JSONException e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
        }
        if (num != null) {
            C1793980wmi.LIZ("retry_count", num.intValue(), jSONObject2);
        }
        if (num2 != null) {
            C1793980wmi.LIZ("max_retry_count", num2.intValue(), jSONObject2);
        }
        InterfaceC1794350wnJ interfaceC1794350wnJLJ = ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LJ();
        EnumC1794330wnH enumC1794330wnH = EnumC1794330wnH.BOTH;
        C1794310wnF c1794310wnF = (C1794310wnF) interfaceC1794350wnJLJ;
        c1794310wnF.getClass();
        c1794310wnF.LIZ(enumC1794330wnH, str, jSONObject2, null, jSONObject);
    }
}
