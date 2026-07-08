package X;

import com.bytedance.android.live.iap.service.IapService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.match.service.ILiveMatchService;
import com.bytedance.android.live.wallet.IWalletCenter;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.firstrecharge.RechargePanelExchangeParams;
import com.bytedance.android.livesdk.firstrecharge.RechargePanelInputParams;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.HashMap;
import java.util.Map;
import qo2.w;

/* JADX INFO: renamed from: X.0g3x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1151190g3x {
    public static final int LJFF() {
        C01GW c01gw = C1148670fzt.LIZIZ;
        return C500260Jjc.LJJJI(Boolean.valueOf(((IWalletCenter) c01gw.getValue()).JE1() ? ((IWalletCenter) c01gw.getValue()).kb() : C1133940fc8.LIZIZ.kb())) ? 1 : 0;
    }

    public static final int LJI() {
        boolean zLJIIJJI;
        C01GW c01gw = C1148670fzt.LIZIZ;
        if (((IWalletCenter) c01gw.getValue()).JE1()) {
            zLJIIJJI = ((IWalletCenter) c01gw.getValue()).isFirstRecharge();
        } else {
            C1133940fc8 c1133940fc8 = C1133940fc8.LIZIZ;
            zLJIIJJI = C1133940fc8.LJIIJJI();
        }
        return C500260Jjc.LJJJI(Boolean.valueOf(zLJIIJJI)) ? 1 : 0;
    }

    public static final void LIZ(C474500IjA c474500IjA, Integer num) {
        String hash;
        C1804110x33 c1804110x33 = EnumC1804100x32.Companion;
        boolean zCanRedirectRechargeV3 = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).canRedirectRechargeV3();
        c1804110x33.getClass();
        EnumC1804100x32 enumC1804100x32LIZ = C1804110x33.LIZ(zCanRedirectRechargeV3, num, false);
        Object obj = null;
        if (enumC1804100x32LIZ != null) {
            hash = enumC1804100x32LIZ.getHash();
        } else {
            hash = null;
        }
        if (C500260Jjc.LJJIIZ(hash)) {
            obj = hash;
        }
        c474500IjA.LJJII(obj, "charge_from");
    }

    public static final void LIZLLL(C474500IjA c474500IjA, HashMap map) {
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                c474500IjA.LJJII(entry.getValue(), (String) entry.getKey());
            }
        }
    }

    public static final void LIZJ(C474500IjA c474500IjA, RechargePanelInputParams rechargePanelInputParams, Map map) {
        String string;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        C0IXL c0ixl;
        Long l;
        String string2;
        Long l2;
        c474500IjA.LJIL();
        c474500IjA.LJJII(106, "task_type");
        C0IR5 c0ir5 = (C0IR5) DataChannelGlobal.LLILZ.gg0(C1148310fzJ.class);
        String str8 = "";
        if (c0ir5 == null || (l2 = c0ir5.LIZLLL) == null || (string = l2.toString()) == null) {
            string = "";
        }
        c474500IjA.LJJII(string, "anchor_id");
        if (c0ir5 != null && (l = c0ir5.LIZJ) != null && (string2 = l.toString()) != null) {
            str8 = string2;
        }
        c474500IjA.LJJII(str8, "room_id");
        w.LIZ.getClass();
        c474500IjA.LJJII(w.LJIJI(), "request_id");
        c474500IjA.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        String str9 = null;
        if (c0ir5 != null && (c0ixl = c0ir5.LJFF) != null) {
            str = c0ixl.LJFF;
        } else {
            str = null;
        }
        c474500IjA.LJJII(str, "action_type");
        if (rechargePanelInputParams != null) {
            str2 = rechargePanelInputParams.enterFromMerge;
        } else {
            str2 = null;
        }
        c474500IjA.LJJII(str2, "enter_from_merge");
        if (rechargePanelInputParams != null) {
            str3 = rechargePanelInputParams.profilePosition;
        } else {
            str3 = null;
        }
        c474500IjA.LJJII(str3, "profile_position");
        if (rechargePanelInputParams != null) {
            str4 = rechargePanelInputParams.enterMethod;
        } else {
            str4 = null;
        }
        c474500IjA.LJJII(str4, "enter_method");
        if (rechargePanelInputParams != null) {
            str5 = rechargePanelInputParams.requestPage;
        } else {
            str5 = null;
        }
        c474500IjA.LJJII(str5, "request_page");
        if (rechargePanelInputParams != null) {
            str6 = rechargePanelInputParams.chargeReason;
        } else {
            str6 = null;
        }
        c474500IjA.LJJII(str6, "charge_reason");
        if (rechargePanelInputParams != null) {
            str7 = rechargePanelInputParams.giftEnterFrom;
        } else {
            str7 = null;
        }
        c474500IjA.LJJII(str7, "gift_enter_from");
        if (rechargePanelInputParams != null) {
            str9 = rechargePanelInputParams.notificationType;
        }
        c474500IjA.LJJII(str9, "notification_type");
        c474500IjA.LJJII(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Fc2(), "live_scene");
        c474500IjA.LJJIIZI(map);
    }

    public static final void LJ(C474500IjA c474500IjA, RechargePanelInputParams rechargePanelInputParams, Map map) {
        String str;
        RechargePanelExchangeParams rechargePanelExchangeParams;
        Object obj;
        RechargePanelExchangeParams rechargePanelExchangeParams2;
        String str2;
        String str3;
        String string;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        C0IXL c0ixl;
        Long l;
        String string2;
        Long l2;
        RechargePanelExchangeParams rechargePanelExchangeParams3;
        String str11;
        c474500IjA.LJIL();
        c474500IjA.LJJII("window", "charge_style");
        if (rechargePanelInputParams != null && (str11 = rechargePanelInputParams.chargeReason) != null && str11.equals("local_currency_gift")) {
            str = "null";
        } else {
            str = "combined";
        }
        c474500IjA.LJJII(str, "panel_type");
        c474500IjA.LJJII("normal", "event_module");
        c474500IjA.LJJII("google_pay", "pay_method");
        c474500IjA.LJJII(Integer.valueOf(LJI()), "is_first_recharge");
        c474500IjA.LJJII(Integer.valueOf(LJFF()), "is_first_cash_recharge");
        c474500IjA.LJJII(Integer.valueOf(C1134860fdc.LIZ.LIZ()), "strategy_task_type");
        String str12 = null;
        if (rechargePanelInputParams != null) {
            rechargePanelExchangeParams = rechargePanelInputParams.exchangeParams;
        } else {
            rechargePanelExchangeParams = null;
        }
        String str13 = "1";
        if (C1149560g1K.LIZJ(rechargePanelExchangeParams)) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjA.LJJII(obj, "can_exchange");
        if (rechargePanelInputParams != null) {
            rechargePanelExchangeParams2 = rechargePanelInputParams.exchangeParams;
        } else {
            rechargePanelExchangeParams2 = null;
        }
        if (!C1149560g1K.LIZJ(rechargePanelExchangeParams2)) {
            str13 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjA.LJJII(str13, "if_has_exchange_option");
        if (rechargePanelInputParams != null && (rechargePanelExchangeParams3 = rechargePanelInputParams.exchangeParams) != null) {
            str2 = rechargePanelExchangeParams3.currencyCode;
        } else {
            str2 = null;
        }
        c474500IjA.LJJII(str2, "currency");
        C1133940fc8 c1133940fc8 = C1133940fc8.LIZIZ;
        if (C1133940fc8.LJII() > 0) {
            str3 = "has_gift";
        } else {
            str3 = "not_has_gift";
        }
        c474500IjA.LJJII(str3, "first_recharge_bonus_type");
        C1126800fQc.LIZ.py();
        c474500IjA.LJJII(Integer.valueOf(C1134860fdc.LJI()), "gift_id");
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        C0IR5 c0ir5 = (C0IR5) dataChannelGlobal.gg0(C1148310fzJ.class);
        c474500IjA.LJJII(Integer.valueOf(C500260Jjc.LJIJ(dataChannelGlobal) ? 1 : 0), "is_anchor");
        String str14 = "";
        if (c0ir5 == null || (l2 = c0ir5.LIZLLL) == null || (string = l2.toString()) == null) {
            string = "";
        }
        c474500IjA.LJJII(string, "anchor_id");
        if (c0ir5 != null && (l = c0ir5.LIZJ) != null && (string2 = l.toString()) != null) {
            str14 = string2;
        }
        c474500IjA.LJJII(str14, "room_id");
        w.LIZ.getClass();
        c474500IjA.LJJII(w.LJIJI(), "request_id");
        c474500IjA.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        if (c0ir5 != null && (c0ixl = c0ir5.LJFF) != null) {
            str4 = c0ixl.LJFF;
        } else {
            str4 = null;
        }
        c474500IjA.LJJII(str4, "action_type");
        if (rechargePanelInputParams != null) {
            str5 = rechargePanelInputParams.enterFromMerge;
        } else {
            str5 = null;
        }
        c474500IjA.LJJII(str5, "enter_from_merge");
        if (rechargePanelInputParams != null) {
            str6 = rechargePanelInputParams.profilePosition;
        } else {
            str6 = null;
        }
        c474500IjA.LJJII(str6, "profile_position");
        if (rechargePanelInputParams != null) {
            str7 = rechargePanelInputParams.enterMethod;
        } else {
            str7 = null;
        }
        c474500IjA.LJJII(str7, "enter_method");
        if (rechargePanelInputParams != null) {
            str8 = rechargePanelInputParams.requestPage;
        } else {
            str8 = null;
        }
        c474500IjA.LJJII(str8, "request_page");
        if (rechargePanelInputParams != null) {
            str9 = rechargePanelInputParams.chargeReason;
        } else {
            str9 = null;
        }
        c474500IjA.LJJII(str9, "charge_reason");
        if (rechargePanelInputParams != null) {
            str10 = rechargePanelInputParams.giftEnterFrom;
        } else {
            str10 = null;
        }
        c474500IjA.LJJII(str10, "gift_enter_from");
        if (rechargePanelInputParams != null) {
            str12 = rechargePanelInputParams.notificationType;
        }
        c474500IjA.LJJII(str12, "notification_type");
        c474500IjA.LJJII(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Fc2(), Scene.SCENE_SERVICE);
        c474500IjA.LJJII(((ILiveMatchService) C1161920gLG.LIZJ(ILiveMatchService.class)).sy0(), "is_multi");
        c474500IjA.LJJII(((ILiveMatchService) C1161920gLG.LIZJ(ILiveMatchService.class)).my(), "sub_match_type");
        ILiveHostCrossRoomEventHelper iLiveHostCrossRoomEventHelper = (ILiveHostCrossRoomEventHelper) C1161920gLG.LIZJ(ILiveHostCrossRoomEventHelper.class);
        c474500IjA.LJJII(iLiveHostCrossRoomEventHelper.getFromRequestId(), "cohost_from_request_id");
        c474500IjA.LJJII(iLiveHostCrossRoomEventHelper.getFromRoomId(), "cohost_from_room_id");
        c474500IjA.LJJIIZI(map);
    }

    public static final void LIZIZ(C474500IjA c474500IjA, RechargePanelInputParams rechargePanelInputParams, Map map, boolean z) {
        String str;
        String str2;
        String string;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        C0IXL c0ixl;
        Long l;
        String string2;
        Long l2;
        RechargePanelExchangeParams rechargePanelExchangeParams;
        Integer num;
        c474500IjA.LJIL();
        if (rechargePanelInputParams != null && (rechargePanelExchangeParams = rechargePanelInputParams.exchangeParams) != null && (num = rechargePanelExchangeParams.exchangeTypeForFirst) != null && num.intValue() == 3) {
            str = "ug_exchange";
        } else {
            str = "anchor_income";
        }
        c474500IjA.LJJII(str, "exchange_type");
        c474500IjA.LJJII("system_combo", "exchange_level");
        boolean zLIZLLL = C1149560g1K.LIZLLL(rechargePanelInputParams);
        if (z) {
            if (zLIZLLL) {
                str2 = "wallet_first_recharge_entrance";
            } else {
                str2 = "room_first_recharge_entrance";
            }
        } else if (zLIZLLL) {
            str2 = "wallet_first_recharge_package";
        } else {
            str2 = "room_first_recharge_package";
        }
        c474500IjA.LJJII(str2, "exchange_scenario");
        c474500IjA.LJJII("entrance", "first_recharge_exchange_source");
        c474500IjA.LJJII("intro", "first_recharge_exchange_entrance_page");
        c474500IjA.LJJII(Integer.valueOf(LJI()), "is_first_recharge");
        c474500IjA.LJJII(Integer.valueOf(LJFF()), "is_first_cash_recharge");
        c474500IjA.LJJII(Integer.valueOf(C1134860fdc.LIZ.LIZ()), "strategy_task_type");
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        C0IR5 c0ir5 = (C0IR5) dataChannelGlobal.gg0(C1148310fzJ.class);
        c474500IjA.LJJII(Integer.valueOf(C500260Jjc.LJIJ(dataChannelGlobal) ? 1 : 0), "is_anchor");
        String str10 = "";
        if (c0ir5 == null || (l2 = c0ir5.LIZLLL) == null || (string = l2.toString()) == null) {
            string = "";
        }
        c474500IjA.LJJII(string, "anchor_id");
        if (c0ir5 != null && (l = c0ir5.LIZJ) != null && (string2 = l.toString()) != null) {
            str10 = string2;
        }
        c474500IjA.LJJII(str10, "room_id");
        w.LIZ.getClass();
        c474500IjA.LJJII(w.LJIJI(), "request_id");
        c474500IjA.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        String str11 = null;
        if (c0ir5 != null && (c0ixl = c0ir5.LJFF) != null) {
            str3 = c0ixl.LJFF;
        } else {
            str3 = null;
        }
        c474500IjA.LJJII(str3, "action_type");
        if (rechargePanelInputParams != null) {
            str4 = rechargePanelInputParams.enterFromMerge;
        } else {
            str4 = null;
        }
        c474500IjA.LJJII(str4, "enter_from_merge");
        if (rechargePanelInputParams != null) {
            str5 = rechargePanelInputParams.profilePosition;
        } else {
            str5 = null;
        }
        c474500IjA.LJJII(str5, "profile_position");
        if (rechargePanelInputParams != null) {
            str6 = rechargePanelInputParams.enterMethod;
        } else {
            str6 = null;
        }
        c474500IjA.LJJII(str6, "enter_method");
        if (rechargePanelInputParams != null) {
            str7 = rechargePanelInputParams.requestPage;
        } else {
            str7 = null;
        }
        c474500IjA.LJJII(str7, "request_page");
        if (rechargePanelInputParams != null) {
            str8 = rechargePanelInputParams.chargeReason;
        } else {
            str8 = null;
        }
        c474500IjA.LJJII(str8, "charge_reason");
        if (rechargePanelInputParams != null) {
            str9 = rechargePanelInputParams.giftEnterFrom;
        } else {
            str9 = null;
        }
        c474500IjA.LJJII(str9, "gift_enter_from");
        if (rechargePanelInputParams != null) {
            str11 = rechargePanelInputParams.notificationType;
        }
        c474500IjA.LJJII(str11, "notification_type");
        c474500IjA.LJJII(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Fc2(), "live_scene");
        c474500IjA.LJJIIZI(map);
    }

    public static final void LJII(boolean z, boolean z2, long j, RechargePanelInputParams rechargePanelInputParams, Map<String, String> map, Throwable th) {
        String str;
        String message;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_first_recharge_configuration_fetch");
        c474500IjALIZ.LJJII(Integer.valueOf(z ? 1 : 0), "success");
        if (z2) {
            str = "cache";
        } else {
            str = "fetch";
        }
        c474500IjALIZ.LJJII(str, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c474500IjALIZ.LJJII(Long.valueOf(j), "duration");
        if (th instanceof C1797200wru) {
            C1797200wru c1797200wru = (C1797200wru) th;
            c474500IjALIZ.LJJII(Integer.valueOf(c1797200wru.getErrorCode()), "error_code");
            c474500IjALIZ.LJJII(c1797200wru.getMappedErrorMessage(), "error_des");
        } else {
            c474500IjALIZ.LJJII(0, "error_code");
            if (th == null || (message = th.getMessage()) == null) {
                message = "";
            }
            c474500IjALIZ.LJJII(message, "error_des");
        }
        LJ(c474500IjALIZ, rechargePanelInputParams, map);
        c474500IjALIZ.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIIIIZZ(com.bytedance.android.livesdk.wallet.Diamond r3, int r4, X.C1797200wru r5, com.bytedance.android.livesdk.firstrecharge.RechargePanelInputParams r6, java.util.Map<java.lang.String, java.lang.String> r7, java.util.HashMap<java.lang.String, java.lang.Object> r8) {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1151190g3x.LJIIIIZZ(com.bytedance.android.livesdk.wallet.Diamond, int, X.0wru, com.bytedance.android.livesdk.firstrecharge.RechargePanelInputParams, java.util.Map, java.util.HashMap):void");
    }

    public static final void LJIIIZ(int i, C1796560wqs c1796560wqs, RechargePanelInputParams rechargePanelInputParams, Map<String, String> map, Map<String, String> map2, boolean z) {
        String str;
        String billingCountryCode;
        HashMap<String, String> map3;
        HashMap map4 = new HashMap();
        map4.put("recharge_package", String.valueOf(i));
        map4.put("order_id", String.valueOf(c1796560wqs.LIZIZ));
        map4.put("package_quantity", String.valueOf(c1796560wqs.LIZJ));
        map4.putAll(C467820IWe.LIZIZ());
        if (z) {
            str = "tiktok";
        } else {
            str = "google_play";
        }
        map4.put("panel_channel", str);
        map4.put("recharge_v3_version", String.valueOf(((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).getRechargeService().LIZJ()));
        InterfaceC1791930wjP interfaceC1791930wjP = (InterfaceC1791930wjP) C1161920gLG.LIZJ(IapService.class);
        if (interfaceC1791930wjP == null || (billingCountryCode = interfaceC1791930wjP.getBillingCountryCode()) == null) {
            billingCountryCode = "";
        }
        map4.put("app_store_front", billingCountryCode);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_recharge_success");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJJ();
        LJ(c474500IjALIZ, rechargePanelInputParams, map2);
        c474500IjALIZ.LJFF(C0IXW.LIZJ("user_live_duration"));
        c474500IjALIZ.LJJIIZI(map4);
        if (rechargePanelInputParams != null) {
            map3 = rechargePanelInputParams.etTracking;
        } else {
            map3 = null;
        }
        c474500IjALIZ.LJJIIZI(map3);
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
    }

    public static final void LJIIJ(boolean z, long j, long j2, long j3, long j4, long j5, String str) {
        String str2;
        String str3 = str;
        HashMap map = new HashMap();
        if (z) {
            str2 = "livesdk_wallet_update_info_aftPay_success";
        } else {
            str2 = "livesdk_wallet_update_info_aftPay_failed";
        }
        if (str3 == null) {
            str3 = "";
        }
        map.put("error_msg", str3);
        map.put("duration", Long.valueOf(j));
        InterfaceC1151200g3y walletMonitorService = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).getWalletMonitorService();
        EnumC1796260wqO enumC1796260wqO = EnumC1796260wqO.BOTH;
        walletMonitorService.LIZ(enumC1796260wqO, str2, C2348809Ig.LIZLLL(map), null, null, null, "wallet");
        HashMap map2 = new HashMap();
        map2.put("charge_channel", C1796440wqg.LIZ());
        map2.put("scenario", "pay_in_revenue");
        map2.put("is_update", Integer.valueOf(walletMonitorService.LIZIZ(j2, j3) ? 1 : 0));
        map2.put("request_succeeded", Integer.valueOf(z ? 1 : 0));
        map2.put("original_coin_version", Long.valueOf(j4));
        map2.put("updated_coin_version", Long.valueOf(j5));
        walletMonitorService.LIZ(enumC1796260wqO, "livesdk_recharge_coins_balance_response", C2348809Ig.LIZLLL(map2), null, null, null, "wallet");
    }
}
