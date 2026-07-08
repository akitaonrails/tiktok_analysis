package X;

import com.bytedance.android.livesdk.userservice.UserService;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import tikcast.api.wallet.tiktok.GetABSStatusResponse;

/* JADX INFO: renamed from: X.0wrw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1797220wrw implements InterfaceC1141530foN {
    public static GetABSStatusResponse.ABSData LL;
    public static final HashMap<String, String> LLILLJJLI;
    public static final HashMap<String, InterfaceC1796910wrR> LLILLL;

    static {
        C1797220wrw c1797220wrw = new C1797220wrw();
        LLILLJJLI = new HashMap<>();
        LLILLL = new HashMap<>();
        C1548820qPI.LIZLLL("live_js_event_fe_recharge_finish", c1797220wrw);
    }

    public static C1797200wru LIZ(String str) {
        String str2 = str;
        Exception exc = new Exception("User cancel the Google ABS payment!");
        if (str2 == null) {
            str2 = "";
        }
        return new C1797200wru(2, -205, 206, "1-30-90-11", "Google ABS Payment Cancel", "ttlive_wallet_create_order", exc, null, str2, 0, 0, null, 3712, null);
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        InterfaceC1107590evd interfaceC1107590evd;
        EnumC1796980wrY enumC1796980wrY;
        HashMap<String, InterfaceC1796910wrR> map;
        InterfaceC1796910wrR interfaceC1796910wrR;
        if (!Intrinsics.LJFF("live_js_event_fe_recharge_finish", c262100zr.LIZ) || (interfaceC1107590evd = c262100zr.LIZIZ) == null) {
            return;
        }
        boolean z = true;
        if (C1871910yoP.LIZLLL(interfaceC1107590evd, "is_success", 0) != 1) {
            z = false;
        }
        int iLIZLLL = C1871910yoP.LIZLLL(interfaceC1107590evd, "coin_number", 0);
        String strLJFF = C1871910yoP.LJFF(interfaceC1107590evd, "order_id", "");
        int iLIZLLL2 = C1871910yoP.LIZLLL(interfaceC1107590evd, "error_code", 0);
        String strLJFF2 = C1871910yoP.LJFF(interfaceC1107590evd, "error_msg", "");
        if (Intrinsics.LJFF(C1871910yoP.LJFF(interfaceC1107590evd, "panel_channel", ""), "tiktok")) {
            return;
        }
        HashMap<String, String> map2 = LLILLJJLI;
        C1796560wqs c1796560wqs = new C1796560wqs(iLIZLLL, map2.get(strLJFF), strLJFF, String.valueOf(UserService.getInstance().user().getCurrentUserId()), false, 16);
        C1797200wru c1797200wru = new C1797200wru(2, -205, iLIZLLL2, "3-30-51-00", "Google Abs Tiktok Pay Error", "", new Exception(strLJFF2), null, null, 0, 0, null, 3968, null);
        if (z) {
            enumC1796980wrY = EnumC1796980wrY.SUCCESS;
        } else {
            enumC1796980wrY = EnumC1796980wrY.FAIL;
        }
        if (z) {
            c1797200wru = null;
        } else {
            c1796560wqs = null;
        }
        C1796960wrW c1796960wrW = new C1796960wrW(enumC1796980wrY, c1796560wqs, c1797200wru);
        if (strLJFF != null && (interfaceC1796910wrR = (map = LLILLL).get(strLJFF)) != null) {
            interfaceC1796910wrR.LJII(c1796960wrW);
            map2.remove(strLJFF);
            map.remove(strLJFF);
        }
    }
}
