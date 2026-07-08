package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0x1m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1803320x1m implements InterfaceC1141530foN {
    public static final C1803320x1m LL = new C1803320x1m();
    public static boolean LLILLJJLI;

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        String string;
        String string2;
        int i;
        String string3;
        if (Intrinsics.LJFF(c262100zr.LIZ, "cancel_retention_popup_action")) {
            InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
            String string4 = null;
            if (interfaceC1107590evd != null) {
                string = interfaceC1107590evd.getString("action");
            } else {
                string = null;
            }
            InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
            String str = "";
            if (interfaceC1107590evd2 == null || (string2 = interfaceC1107590evd2.getString("recharge_entrance")) == null) {
                string2 = "";
            }
            InterfaceC1107590evd interfaceC1107590evd3 = c262100zr.LIZIZ;
            if (interfaceC1107590evd3 != null) {
                i = interfaceC1107590evd3.getInt("cancel_entrance");
            } else {
                i = 2;
            }
            EnumC1802790x0v enumC1802790x0v = EnumC1802790x0v.EXIT_RECHARGE_PANEL;
            if (i != enumC1802790x0v.getValue()) {
                enumC1802790x0v = EnumC1802790x0v.CANCEL_PAYMENT;
                if (i != enumC1802790x0v.getValue()) {
                    enumC1802790x0v = EnumC1802790x0v.UNKNOWN;
                }
            }
            InterfaceC1107590evd interfaceC1107590evd4 = c262100zr.LIZIZ;
            if (interfaceC1107590evd4 != null) {
                interfaceC1107590evd4.getString("retry_create_order_params");
            }
            Map mapLJ = C2097608Jq.LJ();
            try {
                InterfaceC1107590evd interfaceC1107590evd5 = c262100zr.LIZIZ;
                if (interfaceC1107590evd5 != null) {
                    string4 = interfaceC1107590evd5.getString("et_params");
                }
                if (C500260Jjc.LJJIIZ(string4)) {
                    Gson gson = new Gson();
                    InterfaceC1107590evd interfaceC1107590evd6 = c262100zr.LIZIZ;
                    if (interfaceC1107590evd6 != null && (string3 = interfaceC1107590evd6.getString("et_params")) != null) {
                        str = string3;
                    }
                    mapLJ = (Map) GsonProtectorUtils.fromJson(gson, str, new TypeToken<HashMap<String, String>>() { // from class: X.0x1n
                    }.getType());
                }
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (Intrinsics.LJFF(string, "cancel")) {
                if (enumC1802790x0v == EnumC1802790x0v.EXIT_RECHARGE_PANEL) {
                    C784440Upu.LIZ().LIZIZ(new C1146860fwy(string2));
                }
                if (enumC1802790x0v == EnumC1802790x0v.CANCEL_PAYMENT && !Intrinsics.LJFF(string2, "IAP_RECHARGE")) {
                    C786410Ut5.LJJZZIII(C820670WHh.LIZ, new Runnable() { // from class: X.00kQ
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("CancelRetentionDialogEvent@d621.handlePaymentCancel$1");
                            try {
                                C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131843724));
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("CancelRetentionDialogEvent@d621.handlePaymentCancel$1");
                        }
                    });
                }
            }
            if (Intrinsics.LJFF(string, "continue_payment")) {
                if (Intrinsics.LJFF(string2, "NormalRechargePanel") || Intrinsics.LJFF(string2, "FirstRechargePanel_Native")) {
                    C784440Upu.LIZ().LIZIZ(new C1146840fww(string2, mapLJ));
                }
            }
        }
    }
}
