package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0wnK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public abstract class AbstractC1794360wnK {
    public C1794480wnW LIZ;
    public final InterfaceC1794400wnO LIZIZ;
    public InterfaceC1794730wnv LIZJ;

    public abstract EnumC1794620wnk LIZJ();

    public AbstractC1794360wnK(InterfaceC1794400wnO interfaceC1794400wnO) {
        this.LIZIZ = interfaceC1794400wnO;
    }

    public void LIZ(C1794480wnW c1794480wnW) {
        this.LIZ = c1794480wnW;
    }

    /* JADX WARN: Type inference failed for: r0v117, types: [X.0wnP] */
    public final void LIZIZ(C1792840wks c1792840wks) {
        long jUptimeMillis;
        Object obj;
        HashMap<String, ?> map;
        Object obj2;
        HashMap<String, ?> map2;
        EnumC1794380wnM enumC1794380wnM;
        String str;
        int i;
        String str2;
        String str3;
        AbstractC1794600wni abstractC1794600wni;
        HashMap<String, ?> map3;
        this.LIZ.LJIJJ = true;
        if (c1792840wks.LJIIL == EnumC1794260wnA.UNKNOWN) {
            c1792840wks.LJIIL = this.LIZ.LJIILIIL;
        }
        ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZLLL();
        if (C1795410wp1.LJFF()) {
            C1792050wjb.LIZ(c1792840wks);
        }
        C1794370wnL c1794370wnL = this.LIZ.LJIIL;
        EnumC1794620wnk enumC1794620wnkLIZJ = LIZJ();
        C1794480wnW c1794480wnW = this.LIZ;
        long j = c1794480wnW.LJIILLIIL;
        long j2 = c1794480wnW.LJIJ;
        long j3 = c1794480wnW.LJIIZILJ;
        long j4 = c1794480wnW.LJIILL;
        long j5 = 0;
        if (c1794370wnL.LIZ > 0) {
            jUptimeMillis = SystemClock.uptimeMillis() - c1794370wnL.LIZ;
        } else {
            jUptimeMillis = 0;
        }
        JSONObject jSONObject = new JSONObject();
        C1793980wmi.LIZ("result_code", c1792840wks.LIZ, jSONObject);
        C1793980wmi.LIZ("result_detail_code", c1792840wks.LIZIZ, jSONObject);
        C1793980wmi.LIZ("result_sub_detail_code", c1792840wks.LIZJ, jSONObject);
        C1793980wmi.LIZIZ("result_message", c1792840wks.LJ, jSONObject);
        C1793980wmi.LIZ("pay_type", c1794370wnL.LJFF, jSONObject);
        if (c1794370wnL.LJ) {
            j5 = 1;
        }
        C1793980wmi.LIZ("is_subscription", j5, jSONObject);
        C1793980wmi.LIZIZ("payment_method", c1794370wnL.LJI.LJJ.channelName, jSONObject);
        C1793980wmi.LIZ("ntp_time_ms", C158B.LIZ(), jSONObject);
        C1792170wjn c1792170wjn = c1794370wnL.LJI.LIZ;
        if (c1792170wjn != null && (map3 = c1792170wjn.LJI) != null) {
            c1794370wnL.LIZJ(map3, jSONObject);
        }
        if (c1794370wnL.LJI.LJJ.channelName.equals(EnumC1791830wjF.GOOGLE.channelName)) {
            C1793980wmi.LIZIZ("channel_api_version", C1792910wkz.LIZ, jSONObject);
            C1793980wmi.LIZIZ("channel_sdk_version", C1792910wkz.LIZIZ, jSONObject);
        }
        if (enumC1794620wnkLIZJ != null) {
            C1793980wmi.LIZIZ("pay_state", enumC1794620wnkLIZJ.name(), jSONObject);
        } else {
            C1793980wmi.LIZIZ("pay_state", "unknown", jSONObject);
        }
        AbstractC1794600wni abstractC1794600wni2 = c1794370wnL.LJI.LJIIJ;
        if (abstractC1794600wni2 != null) {
            C1793980wmi.LIZIZ("channel_order_id", abstractC1794600wni2.LJFF, jSONObject);
        }
        C1793980wmi.LIZIZ("productId", C1794030wmn.LIZ(c1794370wnL.LJI, c1794370wnL.LIZIZ), jSONObject);
        C1793980wmi.LIZIZ("product_id", C1794030wmn.LIZ(c1794370wnL.LJI, c1794370wnL.LIZIZ), jSONObject);
        C1794480wnW c1794480wnW2 = c1794370wnL.LJI;
        String str4 = c1794370wnL.LIZLLL;
        String str5 = null;
        if (str4 == null || str4.length() <= 0) {
            str4 = c1794480wnW2.LIZ.LIZIZ;
            if (str4.length() <= 0) {
                C1792170wjn c1792170wjn2 = c1794480wnW2.LIZ;
                if (c1792170wjn2 != null && (map = c1792170wjn2.LJI) != null) {
                    obj = map.get("merchant_id");
                } else {
                    obj = null;
                }
                if (obj instanceof String) {
                    str4 = (String) obj;
                } else {
                    str4 = null;
                }
            }
        }
        C1793980wmi.LIZIZ("merchant_id", str4, jSONObject);
        C1794480wnW c1794480wnW3 = c1794370wnL.LJI;
        String str6 = c1794370wnL.LIZJ;
        if (str6 == null || str6.length() <= 0) {
            C1792170wjn c1792170wjn3 = c1794480wnW3.LIZ;
            if (c1792170wjn3 != null && (map2 = c1792170wjn3.LJI) != null) {
                obj2 = map2.get("request_id");
            } else {
                obj2 = null;
            }
            if (obj2 instanceof String) {
                str5 = (String) obj2;
            }
            str6 = str5;
        }
        C1793980wmi.LIZIZ("request_id", str6, jSONObject);
        C1792850wkt.LIZ(c1792840wks.LIZ, c1792840wks.LIZIZ, c1792840wks.LJ, jSONObject);
        if (c1792840wks.LJIIIIZZ != null) {
            C1793980wmi.LIZ("iap_error_code", r0.LIZ.getValue(), jSONObject);
            C1793980wmi.LIZIZ("iap_error_message", c1792840wks.LJIIIIZZ.LIZIZ, jSONObject);
        }
        int i2 = c1792840wks.LIZ;
        if (i2 == 0) {
            enumC1794380wnM = EnumC1794380wnM.SUCCESS;
        } else if (i2 == -202) {
            enumC1794380wnM = EnumC1794380wnM.PENDING;
        } else if (i2 == 206) {
            enumC1794380wnM = EnumC1794380wnM.CANCELLED;
        } else {
            enumC1794380wnM = EnumC1794380wnM.FAILED;
        }
        C1793980wmi.LIZ("iap_payment_state", enumC1794380wnM.getValue(), jSONObject);
        C1794370wnL.LIZLLL(jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        C1793980wmi.LIZ("time_consuming", jUptimeMillis, jSONObject2);
        C1793980wmi.LIZ("pay_state_wait_duration", j4 - c1794370wnL.LIZ, jSONObject2);
        C1793980wmi.LIZ("cashier_wait_duration", j - c1794370wnL.LIZ, jSONObject2);
        C1793980wmi.LIZ("cashier_show_duration", j3 - j, jSONObject2);
        C1793980wmi.LIZ("user_post_confirm_to_callback_duration", j2 - j3, jSONObject2);
        C1793980wmi.LIZIZ("biz_content", c1794370wnL.LJI.LIZIZ, jSONObject);
        JSONObject jSONObject3 = new JSONObject();
        C1793980wmi.LIZIZ("payment_attempt_id", c1794370wnL.LJII, jSONObject3);
        C1793980wmi.LIZIZ("client_flow", c1794370wnL.LJI.LIZ.LJIILIIL, jSONObject3);
        C1793980wmi.LIZIZ("request_id", c1794370wnL.LIZJ, jSONObject3);
        C1793980wmi.LIZIZ("product_id", c1794370wnL.LIZIZ, jSONObject3);
        if (!C2093608Ic.LJ(c1794370wnL.LJI.LJJIFFI)) {
            C1793980wmi.LIZIZ("restore_entrance", c1794370wnL.LJI.LJJIFFI, jSONObject);
        }
        if (c1792840wks.LIZIZ() && (abstractC1794600wni = c1794370wnL.LJI.LJIIJ) != null) {
            C1793980wmi.LIZ("channel_purchase_time", abstractC1794600wni.LJFF(), jSONObject2);
        }
        C1793980wmi.LIZIZ("billing_country_code", c1794370wnL.LJIIIIZZ, jSONObject);
        InterfaceC1794350wnJ interfaceC1794350wnJLJ = ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LJ();
        EnumC1794330wnH enumC1794330wnH = EnumC1794330wnH.BOTH;
        if (c1792840wks.LIZIZ()) {
            str = "livesdk_iap_finish_order_sucess";
        } else {
            str = "livesdk_iap_finish_order_failed";
        }
        C1794310wnF c1794310wnF = (C1794310wnF) interfaceC1794350wnJLJ;
        c1794310wnF.getClass();
        c1794310wnF.LIZ(enumC1794330wnH, str, jSONObject, jSONObject2, jSONObject3);
        InterfaceC1794440wnS interfaceC1794440wnSLIZLLL = C1794630wnl.LIZLLL();
        if (C1794630wnl.LJ == null) {
            synchronized (interfaceC1794440wnSLIZLLL) {
                try {
                    if (C1794630wnl.LJ == null) {
                        C1794630wnl.LJ = new C1794470wnV() { // from class: X.0wnP
                        };
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        } else {
            interfaceC1794440wnSLIZLLL.getClass();
        }
        C1794410wnP c1794410wnP = C1794630wnl.LJ;
        C1794480wnW c1794480wnW4 = this.LIZ;
        EnumC1794620wnk enumC1794620wnkLIZJ2 = LIZJ();
        c1794410wnP.getClass();
        JSONObject jSONObjectLIZLLL = C1794470wnV.LIZLLL(c1794480wnW4);
        C1793980wmi.LIZ("result_code", c1792840wks.LIZ, jSONObjectLIZLLL);
        C1793980wmi.LIZ("result_detail_code", c1792840wks.LIZIZ, jSONObjectLIZLLL);
        C1793980wmi.LIZIZ("result_message", c1792840wks.LJ, jSONObjectLIZLLL);
        C1793980wmi.LIZIZ("pay_type", c1792840wks.LJIIL.name(), jSONObjectLIZLLL);
        C1792850wkt.LIZ(c1792840wks.LIZ, c1792840wks.LIZIZ, c1792840wks.LJ, jSONObjectLIZLLL);
        if (enumC1794620wnkLIZJ2 != null) {
            C1793980wmi.LIZIZ("cur_pay_state", enumC1794620wnkLIZJ2.name(), jSONObjectLIZLLL);
        } else {
            C1793980wmi.LIZIZ("cur_pay_state", "unknown", jSONObjectLIZLLL);
        }
        ((C1796060wq4) ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZIZ()).onEventV3("pipo_pay_end", jSONObjectLIZLLL);
        C1794480wnW c1794480wnW5 = this.LIZ;
        c1794480wnW5.getClass();
        C1793950wmf c1793950wmf = new C1793950wmf();
        c1793950wmf.LIZ = c1794480wnW5.LIZJ;
        c1793950wmf.LIZIZ = c1794480wnW5.LIZLLL();
        c1793950wmf.LIZLLL = c1794480wnW5.LIZLLL;
        AbstractC1794600wni abstractC1794600wni3 = c1794480wnW5.LJIIJ;
        if (abstractC1794600wni3 != null) {
            i = abstractC1794600wni3.LIZLLL;
        } else {
            i = 1;
        }
        c1793950wmf.LJ = i;
        String str7 = "";
        if (abstractC1794600wni3 == null) {
            str2 = "";
        } else {
            str2 = abstractC1794600wni3.LJFF;
        }
        c1793950wmf.LIZJ = str2;
        C1792170wjn c1792170wjn4 = c1794480wnW5.LIZ;
        if (c1792170wjn4 != null) {
            str7 = c1792170wjn4.LJIIJ;
        }
        c1793950wmf.LJFF = str7;
        C1794480wnW c1794480wnW6 = this.LIZ;
        C1792170wjn c1792170wjn5 = c1794480wnW6.LIZ;
        if (c1792170wjn5 == null) {
            str3 = "";
        } else {
            str3 = c1792170wjn5.LJIIJ;
        }
        c1792840wks.LJIIJ = str3;
        c1792840wks.LJIIJJI = c1792170wjn5;
        c1792840wks.LJIIL = c1794480wnW6.LJIILIIL;
        ((C1794650wnn) ((C1794630wnl) C1794630wnl.LIZLLL()).LIZIZ()).LJ(c1792840wks, this.LIZJ, c1793950wmf);
        ((C1794640wnm) ((C1794630wnl) C1794630wnl.LIZLLL()).LIZJ()).LJIIJ(c1792840wks, c1793950wmf);
        this.LIZIZ.onIapOrderFinished(this.LIZ);
    }
}
