package X;

import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletFixFirstRechargeEventTracking;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import qo2.w;

/* JADX INFO: renamed from: X.0x28, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1803540x28 {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Removed duplicated region for block: B:31:0x0153  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJ() {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1803540x28.LJ():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(String str) {
        int iLJJJI;
        String str2;
        if (C1797190wrt.LIZ) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_recharge_create_order_loading_complete");
            c474500IjALIZ.LJJII(C1797190wrt.LIZJ, "request_page");
            if (LiveWalletFixFirstRechargeEventTracking.INSTANCE.getValue()) {
                iLJJJI = C500260Jjc.LJJJI(Boolean.valueOf(((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().kb()));
            } else {
                iLJJJI = C500260Jjc.LJJJI(Boolean.valueOf(C1797190wrt.LIZIZ));
            }
            c474500IjALIZ.LJJII(Integer.valueOf(iLJJJI), "is_first_recharge");
            c474500IjALIZ.LJJII(C1797190wrt.LIZLLL, "pay_method");
            c474500IjALIZ.LJJII(C1797190wrt.LJ, "charge_reason");
            if (str == null) {
                str2 = "success";
            } else {
                str2 = "failed";
            }
            c474500IjALIZ.LJJII(str2, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
            if (str == null) {
                str = "";
            }
            c474500IjALIZ.LJJII(str, "error_code");
            c474500IjALIZ.LJJII(Long.valueOf(C158B.LIZ() - C1797190wrt.LJFF), "recharge_create_order_duration");
            c474500IjALIZ.LIZ();
            C1797190wrt.LIZ = false;
            C1797190wrt.LIZJ = "";
            C1797190wrt.LIZLLL = "";
            C1797190wrt.LJ = "";
            C1797190wrt.LJFF = 0L;
        }
    }

    public static void LIZIZ(C1803560x2A c1803560x2A) {
        Object obj;
        Object obj2;
        Object obj3;
        long jLIZ = C158B.LIZ();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_recharge_preload_sdk_loading_complete");
        c474500IjALIZ.LJJII(C1796440wqg.LIZ(), "pay_method");
        String str = "success";
        if (c1803560x2A.LIZJ) {
            obj = "success";
        } else {
            obj = "failed";
        }
        c474500IjALIZ.LJJII(obj, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        if (c1803560x2A.LIZ) {
            obj2 = "success";
        } else {
            obj2 = "failed";
        }
        c474500IjALIZ.LJJII(obj2, "skproduct_process1_status");
        if (c1803560x2A.LIZIZ) {
            obj3 = "success";
        } else {
            obj3 = "failed";
        }
        c474500IjALIZ.LJJII(obj3, "diamond_status");
        if (!c1803560x2A.LIZJ) {
            str = "failed";
        }
        c474500IjALIZ.LJJII(str, "skproduct_process2_status");
        c474500IjALIZ.LJJII(Long.valueOf(jLIZ - c1803560x2A.LIZLLL), "duration");
        c474500IjALIZ.LJJII(Long.valueOf(c1803560x2A.LJFF - c1803560x2A.LIZLLL), "skproduct_process1_loading_duration");
        c474500IjALIZ.LJJII(Long.valueOf(c1803560x2A.LJI - c1803560x2A.LJFF), "diamond_loading_duration");
        c474500IjALIZ.LJJII(Long.valueOf(c1803560x2A.LJII - c1803560x2A.LJI), "skproduct_process2_loading_duration");
        c474500IjALIZ.LJJII(c1803560x2A.LJ, "request_page");
        c474500IjALIZ.LIZ();
    }

    public static C1803560x2A LIZJ(String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_recharge_preload_sdk_start_init");
        c474500IjALIZ.LJJII(C1796440wqg.LIZ(), "pay_method");
        c474500IjALIZ.LJJII(str, "request_page");
        c474500IjALIZ.LIZ();
        C1803560x2A c1803560x2A = new C1803560x2A();
        c1803560x2A.LIZLLL = C158B.LIZ();
        c1803560x2A.LJ = str;
        return c1803560x2A;
    }

    public static void LIZLLL(long j, long j2, boolean z) {
        String str;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_recharge_preload_wallet_loading_complete");
        c474500IjALIZ.LJJII(C1796440wqg.LIZ(), "pay_method");
        c474500IjALIZ.LJJII("live_room", "request_page");
        if (z) {
            str = "success";
        } else {
            str = "failed";
        }
        c474500IjALIZ.LJJII(str, "wallet_info_status");
        c474500IjALIZ.LJJII(Long.valueOf(j2), "wallet_info_loading_duration");
        w.LIZ.getClass();
        c474500IjALIZ.LJJII(String.valueOf(w.LJIJJ()), "room_id");
        c474500IjALIZ.LJJII(Long.valueOf(j), "coin_balance");
        c474500IjALIZ.LIZ();
    }

    public static void LJFF(long j, String str, String str2) {
        if (!C1803550x29.LIZ) {
            return;
        }
        if (str == null) {
            C1803550x29.LJIIJJI = j;
        } else {
            C1803550x29.LJIILLIIL = str;
            C1803550x29.LJIJJLI = str;
            if (str2 != null) {
                C1803550x29.LJIJ = str2;
            }
        }
        if (C1803550x29.LJ != 0) {
            LJ();
        }
    }

    public static void LJI(String str, String str2, String str3) {
        if (str == null) {
            C1803550x29.LJ = C158B.LIZ();
        } else {
            C1803550x29.LJIILLIIL = str;
            C1803550x29.LJIJJ = str;
            if (str2 != null) {
                C1803550x29.LJIIZILJ = str2;
            }
            if (str3 != null) {
                C1803550x29.LJIJ = str3;
            }
        }
        if (C1803550x29.LJIIJJI != 0) {
            LJ();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJII(String str, String str2, String str3) {
        int iLJJJI;
        Object obj;
        String str4;
        String string;
        String string2;
        HashMap map = new HashMap();
        map.put("order_id", C1797030wrd.LIZ);
        map.put("request_page", C1797030wrd.LIZJ);
        if (LiveWalletFixFirstRechargeEventTracking.INSTANCE.getValue()) {
            iLJJJI = C500260Jjc.LJJJI(Boolean.valueOf(((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().kb()));
        } else {
            iLJJJI = C500260Jjc.LJJJI(Boolean.valueOf(C1797190wrt.LIZIZ));
        }
        map.put("is_first_recharge", Integer.valueOf(iLJJJI));
        map.put("pay_method", C1797030wrd.LIZLLL);
        map.put("charge_reason", C1797030wrd.LJ);
        String str5 = "success";
        if (str == null) {
            obj = "success";
        } else {
            obj = "failed";
        }
        map.put("payment_result_load_status", obj);
        map.put("is_supplement", Integer.valueOf(C1797030wrd.LJFF ? 1 : 0));
        if (str == null) {
            str4 = "";
        } else {
            str4 = str;
        }
        map.put("payment_result_load_error_code", str4);
        if (str2 == null) {
            str2 = "";
        }
        map.put("payment_result_load_detail_error_code", str2);
        if (str3 == null) {
            str3 = "";
        }
        map.put("payment_result_load_error_message", str3);
        if (Intrinsics.LJFF(C1797030wrd.LJIILJJIL.get("upload_receipt_duration"), CardStruct.IStatusCode.DEFAULT)) {
            str5 = "failed";
        }
        map.put("upload_receipt_status", str5);
        String str6 = null;
        if (C1797030wrd.LJI) {
            str6 = "web_socket_push_message";
        }
        map.put("completion_method", str6);
        if (str == null) {
            map.put("is_success_before_retry", Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(C1797030wrd.LJIIL)) ? 1 : 0));
        }
        HashMap map2 = new HashMap();
        map2.put("query_order_duration", Long.valueOf(C1797030wrd.LJIILL));
        map2.put("payment_result_return_duration", Long.valueOf(C158B.LIZ() - C1797030wrd.LJIILIIL));
        Long lLIZ = C1803510x25.LIZJ.LIZ();
        if (lLIZ != null) {
            map2.put("client_e2e_time_consuming", Long.valueOf(lLIZ.longValue()));
        }
        if (C1797030wrd.LJI) {
            map2.put("ws_msg_id", C1797030wrd.LJIIIZ);
            map2.put("ws_log_id", Long.valueOf(C1797030wrd.LJIIJ));
            map2.put("completion_ws_create_time", Long.valueOf(C1797030wrd.LJII));
            map2.put("completion_ws_latency", Long.valueOf(C1797030wrd.LJIIIIZZ - C1797030wrd.LJII));
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_recharge_payment_result_result_return");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || (string2 = value.toString()) == null) {
                string2 = "";
            }
            linkedHashMap.put(key, string2);
        }
        c474500IjALIZ.LJJIIZI(linkedHashMap);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C2097908Jt.LIZIZ(map2.size()));
        for (Map.Entry entry2 : map2.entrySet()) {
            Object key2 = entry2.getKey();
            Object value2 = entry2.getValue();
            if (value2 == null || (string = value2.toString()) == null) {
                string = "";
            }
            linkedHashMap2.put(key2, string);
        }
        c474500IjALIZ.LJJIIZI(linkedHashMap2);
        c474500IjALIZ.LJJIIZI(C1797030wrd.LJIILJJIL);
        c474500IjALIZ.LIZ();
        C1803800x2Y.LIZ.getClass();
        C1807660x8m.LIZIZ("livesdk_recharge_payment_result_return", C1803800x2Y.LJJJJL(map), C1803800x2Y.LJJJJL(map2), C1803800x2Y.LJJJJL(C1797030wrd.LJIILJJIL));
        C1797030wrd.LIZ();
    }
}
