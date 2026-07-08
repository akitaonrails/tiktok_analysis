package X;

import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.model.ExchangeDisplayInfo;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0g1W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1149680g1W {
    public static final /* synthetic */ int LIZ = 0;

    public static void LJIJI() {
        C1149690g1X.LIZ = true;
        C1149690g1X.LIZIZ = C158B.LIZ();
    }

    public static String LIZLLL() {
        return ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Fc2();
    }

    public static String LJ() {
        C1803800x2Y.LIZ.getClass();
        return C1803800x2Y.LJIILJJIL();
    }

    public static void LIZ(C474500IjA c474500IjA) {
        C1803800x2Y.LIZ.getClass();
        c474500IjA.LJJII(C1803800x2Y.LJIIL(null), "strategy_task_type");
    }

    public static void LIZIZ(Throwable th, Map map) {
        map.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "failed");
        map.put("error_code", String.valueOf(C512300K7g.LIZIZ(th)));
        String message = th.getMessage();
        if (message == null) {
            message = th.toString();
        }
        map.put("error_message", message);
    }

    public static void LIZJ(C474500IjA c474500IjA, String str) {
        String first;
        Pair<String, ? extends Map<String, ? extends Object>> pair;
        Map<String, ? extends Object> second;
        Pair<String, ? extends Map<String, ? extends Object>> pair2 = C1123590fLR.LIZLLL;
        if (pair2 != null && (first = pair2.getFirst()) != null && Intrinsics.LJFF(first, str) && (pair = C1123590fLR.LIZLLL) != null && (second = pair.getSecond()) != null) {
            for (Map.Entry<String, ? extends Object> entry : second.entrySet()) {
                c474500IjA.LJJII(entry.getValue(), entry.getKey());
            }
        }
    }

    public static void LJI(int i, String str, Boolean bool, String str2) {
        String str3;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_auto_balance_exchange_show");
        c474500IjALIZ.LJJII(str, "charge_reason");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "popup_type");
        c474500IjALIZ.LJJII(str2, "gift_enter_from");
        if (bool != null) {
            if (bool.booleanValue()) {
                str3 = CardStruct.IStatusCode.DEFAULT;
            } else {
                str3 = "1";
            }
            c474500IjALIZ.LJJII(str3, "is_second_confirmation_needed");
        }
        c474500IjALIZ.LIZ();
    }

    public static void LJIIJJI(String str, String str2, String str3, boolean z) {
        String str4;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_recharge_gift_exchange_page_start_loading");
        if (z) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(str4, "is_automatic_exchange");
        c474500IjALIZ.LJJII(str, "exchange_type");
        c474500IjALIZ.LJJII("live_detail", "request_page");
        c474500IjALIZ.LJJII(str2, "exchange_scenario");
        c474500IjALIZ.LJJII(str3, "charge_reason");
        c474500IjALIZ.LIZ();
    }

    public static void LJIJ(String str, String str2, String str3, boolean z) {
        String str4;
        if (z) {
            str4 = "open";
        } else {
            str4 = "close";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_auto_balance_exchange_setting");
        c474500IjALIZ.LJJII(str4, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c474500IjALIZ.LJJII(str, "request_from");
        c474500IjALIZ.LJJII(str2, "charge_reason");
        c474500IjALIZ.LJJII(str3, "gift_enter_from");
        c474500IjALIZ.LIZ();
    }

    public static void LJFF(int i, boolean z, String str, String str2, Boolean bool) {
        String str3;
        String str4;
        if (z) {
            str3 = "turn_on";
        } else {
            str3 = "cancel";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_auto_balance_exchange_click");
        c474500IjALIZ.LJJII(str3, "click");
        c474500IjALIZ.LJJII(str, "charge_reason");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "popup_type");
        c474500IjALIZ.LJJII(str2, "gift_enter_from");
        if (bool != null) {
            if (bool.booleanValue()) {
                str4 = CardStruct.IStatusCode.DEFAULT;
            } else {
                str4 = "1";
            }
            c474500IjALIZ.LJJII(str4, "is_second_confirmation_needed");
        }
        c474500IjALIZ.LIZ();
    }

    public static void LJIILLIIL(DataChannel dataChannel, long j, String str, int i, boolean z) {
        String str2;
        String str3;
        String str4;
        if (i == 1) {
            str2 = "ug_exchange";
        } else {
            str2 = "anchor_income";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_balance_exchange_success");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(Long.valueOf(j), "gift_id");
        if (C497740JfY.LJIL()) {
            str3 = "portrait";
        } else {
            str3 = "landscape";
        }
        c474500IjALIZ.LJJII(str3, "room_orientation");
        c474500IjALIZ.LJJII(str2, "enter_from");
        c474500IjALIZ.LJJII(str, "gift_enter_from");
        c474500IjALIZ.LJJII(Integer.valueOf(z ? 1 : 0), "is_auto");
        if (C500260Jjc.LJIIZILJ(dataChannel)) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(str4, "is_anchor");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        c474500IjALIZ.LIZ();
    }

    public static void LJIIZILJ(long j, DataChannel dataChannel, String str, String str2, boolean z) {
        Long lValueOf;
        Object obj;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_balance_exchange_failed");
        c474500IjALIZ.LJIJJLI(dataChannel);
        String idStr = null;
        if (room != null) {
            lValueOf = Long.valueOf(room.getOwnerUserId());
        } else {
            lValueOf = null;
        }
        c474500IjALIZ.LJJII(String.valueOf(lValueOf), "anchor_id");
        if (room != null) {
            idStr = room.getIdStr();
        }
        c474500IjALIZ.LJJII(String.valueOf(idStr), "room_id");
        String str3 = "1";
        if (C500260Jjc.LJIIZILJ(dataChannel)) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(obj, "is_anchor");
        c474500IjALIZ.LJJII(Long.valueOf(j), "error_code");
        if (!z) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(str3, "is_auto");
        c474500IjALIZ.LJJII(str, "charge_reason");
        c474500IjALIZ.LJJII(str2, "gift_enter_from");
        c474500IjALIZ.LJJII("exchange", "error_from");
        c474500IjALIZ.LIZ();
    }

    public static void LJIIIZ(DataChannel dataChannel, long j, String str, String str2, String str3, int i, int i2, int i3) {
        String str4;
        String str5;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_balance_exchange_window_show");
        c474500IjALIZ.LJIJJLI(dataChannel);
        if (C500260Jjc.LJIIZILJ(dataChannel)) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(str4, "is_anchor");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "popup_type");
        c474500IjALIZ.LJJII(Integer.valueOf(i2), "has_auto_check_box");
        c474500IjALIZ.LJJII(Integer.valueOf(i3), "if_confirm_auto_popup");
        c474500IjALIZ.LJJII(Long.valueOf(j), "gift_id");
        c474500IjALIZ.LJJII(str2, "enter_from");
        if (C497740JfY.LJIL()) {
            str5 = "portrait";
        } else {
            str5 = "landscape";
        }
        c474500IjALIZ.LJJII(str5, "room_orientation");
        c474500IjALIZ.LJJII(str, "show_reason");
        c474500IjALIZ.LJJII(str3, "gift_enter_from");
        c474500IjALIZ.LIZ();
    }

    public static void LJIIJ(String str, String str2, String str3, long j, String str4, String str5, Boolean bool, String str6) {
        Integer numValueOf;
        String str7;
        C1803800x2Y c1803800x2Y = C1803800x2Y.LIZ;
        HashMap map = new HashMap();
        c1803800x2Y.getClass();
        C1803800x2Y.LJFF(0, map);
        if (str6 == null) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(Intrinsics.LJFF(str6, "pre_claim") ? 1 : 0);
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_exchange_fail");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(str, "exchange_type");
        c474500IjALIZ.LJJII(str2, "exchange_scenario");
        c474500IjALIZ.LJJII(str3, "charge_reason");
        c474500IjALIZ.LJJII("system_combo", "exchange_level");
        c474500IjALIZ.LJJII(Long.valueOf(j), "exchange_coins");
        c474500IjALIZ.LJJII("live_detail", "request_page");
        c474500IjALIZ.LJJII(LJ(), "is_first_recharge");
        c474500IjALIZ.LJJII(str5, "gift_enter_from");
        c474500IjALIZ.LJJII(LIZLLL(), "live_scene");
        c474500IjALIZ.LJJII(str4, "error_code");
        c474500IjALIZ.LJJIIZI(map);
        LIZ(c474500IjALIZ);
        LIZJ(c474500IjALIZ, str5);
        if (bool != null) {
            if (bool.booleanValue()) {
                str7 = CardStruct.IStatusCode.DEFAULT;
            } else {
                str7 = "1";
            }
            c474500IjALIZ.LJJII(str7, "is_second_confirmation_needed");
        }
        if (numValueOf != null) {
            c474500IjALIZ.LJJII(numValueOf.toString(), "is_pre_claim");
        }
        c474500IjALIZ.LIZ();
        C1803800x2Y.LJJJJJL(c474500IjALIZ);
    }

    public static void LJIIL(int i, Map map, String str, String str2, String str3, String str4, String str5, long j) {
        String str6;
        String str7;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return;
                } else {
                    str6 = "livesdk_exchange_confirm_popup_show";
                }
            } else {
                str6 = "livesdk_recharge_gift_exchange_w9_popup";
            }
        } else {
            str6 = "livesdk_recharge_gift_exchange_page_loading_complete";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str6);
        c474500IjALIZ.LJIL();
        if (str4 == null) {
            str7 = "success";
        } else {
            str7 = "failed";
        }
        c474500IjALIZ.LJJII(str7, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        if (str4 == null) {
            str4 = "";
        }
        c474500IjALIZ.LJJII(str4, "error_code");
        c474500IjALIZ.LJJII(str, "exchange_type");
        c474500IjALIZ.LJJII("live_detail", "request_page");
        c474500IjALIZ.LJJII(str2, "exchange_scenario");
        c474500IjALIZ.LJJII(str3, "charge_reason");
        c474500IjALIZ.LJJII(str5, "gift_enter_from");
        c474500IjALIZ.LJJII(LIZLLL(), "live_scene");
        c474500IjALIZ.LJJII("system_combo", "exchange_level");
        c474500IjALIZ.LJJII(Long.valueOf(j), "exchange_coins");
        c474500IjALIZ.LJJII(LJ(), "is_first_recharge");
        LIZJ(c474500IjALIZ, str5);
        for (Map.Entry entry : map.entrySet()) {
            c474500IjALIZ.LJJII(String.valueOf(((Number) entry.getValue()).longValue()), (String) entry.getKey());
        }
        c474500IjALIZ.LIZ();
        C1803800x2Y.LIZ.getClass();
        C1803800x2Y.LJJJJJL(c474500IjALIZ);
    }

    public static void LJIILL(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        Object obj;
        Object obj2;
        Object obj3;
        C1803800x2Y c1803800x2Y = C1803800x2Y.LIZ;
        HashMap map = new HashMap();
        c1803800x2Y.getClass();
        C1803800x2Y.LJFF(0, map);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_exchange_show");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(str, "exchange_type");
        c474500IjALIZ.LJJII(str2, "exchange_scenario");
        c474500IjALIZ.LJJII(LIZLLL(), "live_scene");
        c474500IjALIZ.LJJII("package_page", "exchange_panel");
        c474500IjALIZ.LJJII(str4, "charge_reason");
        c474500IjALIZ.LJJII(str3, "gift_enter_from");
        c474500IjALIZ.LJJII("live_detail", "request_page");
        c474500IjALIZ.LJJII(LJ(), "is_first_recharge");
        String str5 = "1";
        if (z4) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(obj, "is_auto_exchange_shown");
        if (!z) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(obj2, "is_second_confirmation_needed");
        if (z2) {
            obj3 = "1";
        } else {
            obj3 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(obj3, "is_third_popup");
        if (!z3) {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(str5, "is_need_w9");
        c474500IjALIZ.LJJIIZI(map);
        LIZ(c474500IjALIZ);
        LIZJ(c474500IjALIZ, str3);
        c474500IjALIZ.LIZ();
        C1803800x2Y.LJJJJJL(c474500IjALIZ);
        if (C1131530fYF.LJ(str3) && Intrinsics.LJFF(str, "ug_exchange")) {
            C1142550fq1.LIZJ("pre_claim", "ug_live_first_consume_task", str3);
        }
    }

    public static void LJIIIIZZ(DataChannel dataChannel, long j, String str, String str2, String str3, int i, int i2, int i3, int i4) {
        String str4;
        ExchangeDisplayInfo exchangeDisplayInfoKL2 = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().kL2();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_balance_exchange_confirm");
        c474500IjALIZ.LJIJJLI(dataChannel);
        if (C500260Jjc.LJIIZILJ(dataChannel)) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(str4, "is_anchor");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "popup_type");
        c474500IjALIZ.LJJII(Integer.valueOf(i2), "has_auto_check_box");
        c474500IjALIZ.LJJII(Integer.valueOf(i4), "if_check_auto");
        c474500IjALIZ.LJJII(Integer.valueOf(i3), "if_confirm_auto_popup");
        c474500IjALIZ.LJJII(Long.valueOf(j), "gift_id");
        c474500IjALIZ.LJJII(str, "request_from");
        c474500IjALIZ.LJJII(str2, "enter_from");
        c474500IjALIZ.LJJII(str3, "gift_enter_from");
        c474500IjALIZ.LJJII(Integer.valueOf(!exchangeDisplayInfoKL2.isFirstExchange ? 1 : 0), "is_exchange_before");
        c474500IjALIZ.LJJII(Integer.valueOf(exchangeDisplayInfoKL2.LIZ() ? 1 : 0), "is_tax_info_finished");
        c474500IjALIZ.LIZ();
    }

    public static void LJII(DataChannel dataChannel, long j, String str, String str2, String str3, int i, int i2, int i3, int i4, String str4) {
        String str5;
        ExchangeDisplayInfo exchangeDisplayInfoKL2 = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().kL2();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_balance_exchange_cancel");
        c474500IjALIZ.LJIJJLI(dataChannel);
        if (C500260Jjc.LJIIZILJ(dataChannel)) {
            str5 = "1";
        } else {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(str5, "is_anchor");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "popup_type");
        c474500IjALIZ.LJJII(Integer.valueOf(i2), "has_auto_check_box");
        c474500IjALIZ.LJJII(Integer.valueOf(i4), "if_check_auto");
        c474500IjALIZ.LJJII(Integer.valueOf(i3), "if_confirm_auto_popup");
        c474500IjALIZ.LJJII(Long.valueOf(j), "gift_id");
        c474500IjALIZ.LJJII(str, "request_from");
        c474500IjALIZ.LJJII(str2, "enter_from");
        c474500IjALIZ.LJJII(str3, "gift_enter_from");
        c474500IjALIZ.LJJII(str4, "exit_click_position");
        c474500IjALIZ.LJJII(Integer.valueOf(!exchangeDisplayInfoKL2.isFirstExchange ? 1 : 0), "is_exchange_before");
        c474500IjALIZ.LJJII(Integer.valueOf(exchangeDisplayInfoKL2.LIZ() ? 1 : 0), "is_tax_info_finished");
        c474500IjALIZ.LIZ();
    }

    public static void LJIILIIL(String str, String str2, String str3, boolean z, String str4, long j, long j2, String str5, String str6, Boolean bool, String str7) {
        Object obj;
        String str8;
        String str9;
        Integer numValueOf;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_recharge_gift_exchange_result_return");
        c474500IjALIZ.LJJII(str, "exchange_type");
        c474500IjALIZ.LJJII("live_detail", "request_page");
        c474500IjALIZ.LJJII(str2, "exchange_scenario");
        c474500IjALIZ.LJJII(str3, "charge_reason");
        String str10 = "1";
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(obj, "is_exchange_only");
        if (str4 == null) {
            str8 = "success";
        } else {
            str8 = "failed";
        }
        c474500IjALIZ.LJJII(str8, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        String str11 = "";
        if (str4 == null) {
            str9 = "";
        } else {
            str9 = str4;
        }
        c474500IjALIZ.LJJII(str9, "error_code");
        if (str6 != null) {
            str11 = str6;
        }
        c474500IjALIZ.LJJII(str11, "failure_point");
        c474500IjALIZ.LJJII(Long.valueOf(j), "loading_duration");
        c474500IjALIZ.LIZ();
        if (str4 == null) {
            C1803800x2Y c1803800x2Y = C1803800x2Y.LIZ;
            HashMap map = new HashMap();
            c1803800x2Y.getClass();
            C1803800x2Y.LJFF(0, map);
            if (str7 == null) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(Intrinsics.LJFF(str7, "pre_claim") ? 1 : 0);
            }
            C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_exchange_success");
            c474500IjALIZ2.LJIL();
            c474500IjALIZ2.LJJII(str, "exchange_type");
            c474500IjALIZ2.LJJII(str2, "exchange_scenario");
            c474500IjALIZ2.LJJII(str3, "charge_reason");
            c474500IjALIZ2.LJJII("system_combo", "exchange_level");
            c474500IjALIZ2.LJJII(Long.valueOf(j2), "exchange_coins");
            c474500IjALIZ2.LJJII("live_detail", "request_page");
            c474500IjALIZ2.LJJII(LJ(), "is_first_recharge");
            c474500IjALIZ2.LJJII(str5, "gift_enter_from");
            c474500IjALIZ2.LJJII(LIZLLL(), "live_scene");
            c474500IjALIZ2.LJJII(Long.valueOf(j), "time_consuming");
            c474500IjALIZ2.LJJIIZI(map);
            LIZ(c474500IjALIZ2);
            LIZJ(c474500IjALIZ2, str5);
            if (bool != null) {
                if (bool.booleanValue()) {
                    str10 = CardStruct.IStatusCode.DEFAULT;
                }
                c474500IjALIZ2.LJJII(str10, "is_second_confirmation_needed");
            }
            if (numValueOf != null) {
                c474500IjALIZ2.LJJII(numValueOf.toString(), "is_pre_claim");
            }
            c474500IjALIZ2.LIZ();
            C1803800x2Y.LJJJJJL(c474500IjALIZ2);
            return;
        }
        LJIIJ(str, str2, str3, j2, str4, str5, bool, str7);
    }
}
