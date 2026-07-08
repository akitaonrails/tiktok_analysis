package X;

import android.util.Pair;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.03ho, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C914603ho implements InterfaceC906703gX {
    public static void LIZ(C914903hr c914903hr, InterfaceC919603ic interfaceC919603ic) {
        C915503hx c915503hx;
        try {
            c915503hx = new C915503hx(C1724150uy5.LJIIL.LIZ.LJIILIIL.LIZLLL(C916403i6.LIZ("/payment/v1/get_installment_and_card_type"), c914903hr.LIZ(), c914903hr.LIZLLL));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c915503hx = new C915503hx();
        }
        interfaceC919603ic.LIZ(c915503hx);
    }

    public static void LIZIZ(C915603hy c915603hy, InterfaceC919703id interfaceC919703id) {
        String strLIZ = C916403i6.LIZ("/payment/v1/get_installment_card_bin_list");
        List<Pair<String, String>> listLIZ = c915603hy.LIZ();
        try {
            C1724150uy5 c1724150uy5 = C1724150uy5.LJIIL;
            C915703hz c915703hz = new C915703hz(c1724150uy5.LIZ.LJIILIIL.LIZLLL(strLIZ, listLIZ, c915603hy.LIZLLL));
            interfaceC919703id.LIZ(c915703hz);
            ((C931203kU) c1724150uy5.LIZ()).getClass();
            String str = c915603hy.LJ;
            Map<String, ArrayList<String>> map = c915703hz.LJFF;
            C845503Sb.LIZ.put(str, map);
            C845503Sb.LIZIZ = map;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            interfaceC919703id.LIZ(new C915703hz());
        }
    }

    public static void LIZJ(C900003fS c900003fS, InterfaceC902803fu interfaceC902803fu) {
        C899903fR c899903fR;
        try {
            c899903fR = new C899903fR(C1724150uy5.LJIIL.LIZ.LJIILIIL.LIZLLL(C916403i6.LIZ("/cashier/v1/get_unified_bin_detail"), c900003fS.LIZ(), c900003fS.LIZLLL));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c899903fR = new C899903fR();
        }
        interfaceC902803fu.LIZ(c899903fR);
    }

    public static void LIZLLL(C915203hu c915203hu, InterfaceC920103ih interfaceC920103ih) {
        C916003i2 c916003i2;
        try {
            c916003i2 = new C916003i2(C1724150uy5.LJIIL.LIZ.LJIILIIL.LIZLLL(C916403i6.LIZ("/payment/v1/verify_card_installment"), c915203hu.LIZ(), c915203hu.LIZLLL));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c916003i2 = new C916003i2();
        }
        interfaceC920103ih.LIZ(c916003i2);
    }

    public static void LJ(C898003f8 c898003f8, InterfaceC919803ie interfaceC919803ie) {
        String strLIZ = C916403i6.LIZ("/payment/v1/pay");
        List<Pair<String, String>> listLIZ = c898003f8.LIZ();
        C910103h5 c910103h5 = new C910103h5();
        try {
            C910103h5 c910103h52 = new C910103h5(C1724150uy5.LJIIL.LIZ.LJIILIIL.LIZLLL(strLIZ, listLIZ, c898003f8.LIZLLL));
            try {
                interfaceC919803ie.LIZ(c910103h52);
            } catch (Throwable th) {
                th = th;
                c910103h5 = c910103h52;
                TryCatchGuardChecker.doCheck(th);
                c910103h5.LIZLLL = "exception";
                c910103h5.LJ = th.getLocalizedMessage();
                interfaceC919803ie.LIZ(c910103h5);
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void LJI(C898403fC c898403fC, InterfaceC920003ig interfaceC920003ig) {
        try {
            interfaceC920003ig.LIZ(new C910303h7(C1724150uy5.LJIIL.LIZ.LJIILIIL.LIZLLL(C916403i6.LIZ("/payment/v1/upload_pay_info"), c898403fC.LIZ(), c898403fC.LIZLLL)));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C910303h7 c910303h7 = new C910303h7();
            c910303h7.LIZLLL = "exception";
            c910303h7.LJ = th.getLocalizedMessage();
            interfaceC920003ig.LIZ(c910303h7);
        }
    }

    public static void LJFF(C898303fB c898303fB, boolean z, InterfaceC919903if interfaceC919903if) {
        String strLIZ;
        Object objLIZLLL;
        System.currentTimeMillis();
        if (z) {
            strLIZ = C916403i6.LIZ("/cashier/client/v1/query_trade_result");
        } else {
            strLIZ = C916403i6.LIZ("/payment/v1/payment_details");
        }
        if (z) {
            c898303fB.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                String str = c898303fB.LJIIIIZZ;
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                jSONObject.put("charge_id", str);
                jSONObject.put("merchant_order_id", "");
                String str3 = c898303fB.LJII;
                if (str3 == null) {
                    str3 = "";
                }
                jSONObject.put("payment_reference", str3);
                C900203fU c900203fU = c898303fB.LJI;
                if (c900203fU == null) {
                    objLIZLLL = "";
                } else {
                    objLIZLLL = c900203fU.LIZLLL();
                }
                jSONObject.put("configuration", objLIZLLL);
                String str4 = c898303fB.LJFF;
                if (str4 == null) {
                    str4 = "";
                }
                jSONObject.put("merchant_user_id", str4);
                String str5 = c898303fB.LIZ;
                if (str5 == null) {
                    str5 = "";
                }
                jSONObject.put("merchant_id", str5);
                String str6 = c898303fB.LJIIIZ;
                if (str6 == null) {
                    str6 = "";
                }
                jSONObject.put("risk_info", str6);
                String str7 = c898303fB.LJIIJ;
                if (str7 == null) {
                    str7 = "";
                }
                jSONObject.put("device_id", str7);
                jSONObject.put("is_biometry_supported", c898303fB.LJIIJJI);
                String str8 = c898303fB.LJIIL;
                if (str8 != null) {
                    str2 = str8;
                }
                jSONObject.put("pipo_error_code_params", str2);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            HashMap map = new HashMap();
            Map<String, String> map2 = c898303fB.LIZLLL;
            if (map2 != null) {
                map.putAll(map2);
            }
            String str9 = c898303fB.LJ;
            if (str9 != null) {
                map.put("pipo-fp-session-id", str9.replace("\\/", "/"));
            }
            map.put("Content-Type", "application/json");
            try {
                interfaceC919903if.LIZ(new C910203h6(C1724150uy5.LJIIL.LIZ.LJIILIIL.LJ(strLIZ, C786410Ut5.J3(jSONObject).getBytes(StandardCharsets.UTF_8), map), (Object) null));
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C910203h6 c910203h6 = new C910203h6();
                c910203h6.LJFF = "exception";
                c910203h6.LJI = th.getLocalizedMessage();
                interfaceC919903if.LIZ(c910203h6);
                return;
            }
        }
        try {
            interfaceC919903if.LIZ(new C910203h6(C1724150uy5.LJIIL.LIZ.LJIILIIL.LIZLLL(strLIZ, c898303fB.LIZ(), c898303fB.LIZLLL)));
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C910203h6 c910203h62 = new C910203h6();
            c910203h62.LJFF = "exception";
            c910203h62.LJI = th2.getLocalizedMessage();
            interfaceC919903if.LIZ(c910203h62);
        }
    }
}
