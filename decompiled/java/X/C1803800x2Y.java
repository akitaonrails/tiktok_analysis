package X;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.iap.service.IapService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.wallet.IWalletCenter;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletExchange;
import com.bytedance.android.live.walletnew.RechargeViewModel;
import com.bytedance.android.livesdk.api.revenue.strategy.IRevenueStrategyService;
import com.bytedance.android.livesdk.dataChannel.BroadcastPageChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletFixFirstRechargeEventTracking;
import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletGiftingOptimizationSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdk.wallet.CustomErrorExtra;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.scene.Scene;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import qo2.w;

/* JADX INFO: renamed from: X.0x2Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1803800x2Y {
    public static final C1803800x2Y LIZ = new C1803800x2Y();

    public static Map LJIIIZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        if (dataChannelGlobal.gg0(C930940aKi.class) != null) {
            String roomStatus = ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).getRoomStatus();
            if (roomStatus == null) {
                roomStatus = "";
            }
            linkedHashMap.put(Scene.SCENE_SERVICE, roomStatus);
            w.LIZ.getClass();
            linkedHashMap.put("anchor_id", String.valueOf(w.LJ()));
            linkedHashMap.put("room_id", String.valueOf(w.LJIJJ()));
            linkedHashMap.put("enter_from_merge", w.LJIIIZ());
            linkedHashMap.put("enter_method", w.LJIIL());
            linkedHashMap.put("action_type", w.LIZLLL());
            linkedHashMap.put("request_id", w.LJIJI());
            linkedHashMap.put("video_id", w.LJJII());
            EnumC500290Jjf enumC500290Jjf = (EnumC500290Jjf) dataChannelGlobal.gg0(BroadcastPageChannel.class);
            linkedHashMap.put("is_anchor", C500260Jjc.LJJJI(enumC500290Jjf != null ? Boolean.valueOf(enumC500290Jjf.isAudience()) : null) ? CardStruct.IStatusCode.DEFAULT : "1");
        }
        return linkedHashMap;
    }

    public static String LJIILIIL() {
        return LiveWalletFixFirstRechargeEventTracking.INSTANCE.getValue() ? String.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().kb())) ? 1 : 0) : C1126800fQc.LIZ.M92().kb() ? "1" : CardStruct.IStatusCode.DEFAULT;
    }

    public static String LJIILJJIL() {
        return LiveWalletFixFirstRechargeEventTracking.INSTANCE.getValue() ? String.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().isFirstRecharge())) ? 1 : 0) : C1803840x2c.LIZ(null);
    }

    public static void LJIJJ() {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_feature_abnormal_toast");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(LJIIL(null), "strategy_task_type");
        c474500IjALIZ.LJJII("recharge_panel_exchange", "scenario");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        c474500IjALIZ.LIZ();
    }

    public static void LIZIZ(C474500IjA c474500IjA) {
        if (DataChannelGlobal.LLILZ.gg0(C930940aKi.class) != null) {
            w.LIZ.getClass();
            c474500IjA.LJJII(Long.valueOf(w.LJ()), "anchor_id");
            c474500IjA.LJJII(Long.valueOf(w.LJIJJ()), "room_id");
            c474500IjA.LJJII(w.LJIIIZ(), "enter_from_merge");
            c474500IjA.LJJII(w.LJIIL(), "enter_method");
            c474500IjA.LJJII(w.LIZLLL(), "action_type");
            c474500IjA.LJJII(w.LJIJI(), "request_id");
            c474500IjA.LJJII(w.LJJII(), "video_id");
        }
    }

    public static void LIZLLL(Map map) {
        IWalletService iWalletService;
        IWalletCenter iWalletCenterWalletCenter;
        C1149150g0f c1149150g0fIz2;
        boolean z;
        boolean z2;
        if (LiveWalletGiftingOptimizationSetting.INSTANCE.getValue() && (iWalletService = (IWalletService) C1161920gLG.LIZJ(IWalletService.class)) != null && (iWalletCenterWalletCenter = iWalletService.walletCenter()) != null && (c1149150g0fIz2 = iWalletCenterWalletCenter.iz2()) != null) {
            EnumC1151140g3s enumC1151140g3s = c1149150g0fIz2.LIZ;
            EnumC1151140g3s enumC1151140g3s2 = EnumC1151140g3s.SUCCESS;
            boolean z3 = true;
            if (enumC1151140g3s == enumC1151140g3s2) {
                z = true;
            } else {
                z = false;
            }
            map.put("is_balance_ready", String.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0));
            map.put("wallet_server_state", c1149150g0fIz2.LIZ.getState());
            map.put("live_exchange_server_status", c1149150g0fIz2.LIZIZ.getState());
            if (c1149150g0fIz2.LIZIZ == enumC1151140g3s2) {
                z2 = true;
            } else {
                z2 = false;
            }
            map.put("is_live_exchange_balance_ready", String.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z2)) ? 1 : 0));
            map.put("ug_exchange_status", c1149150g0fIz2.LIZJ.getState());
            if (c1149150g0fIz2.LIZJ != enumC1151140g3s2) {
                z3 = false;
            }
            map.put("is_ug_exchange_balance_ready", String.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z3)) ? 1 : 0));
            map.put("has_exchange_balance", String.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(c1149150g0fIz2.LIZLLL)) ? 1 : 0));
        }
    }

    public static void LJ(Map map) {
        Map<String, String> map2;
        IRevenueStrategyService iRevenueStrategyService = C1126800fQc.LIZ;
        iRevenueStrategyService.GN();
        EnumC1121470fI1 enumC1121470fI1 = EnumC1121470fI1.RECHARGE_BANNER_TP;
        C1123320fL0 c1123320fL0LIZIZ = C1121450fHz.LIZIZ(enumC1121470fI1.getType());
        if (c1123320fL0LIZIZ != null && c1123320fL0LIZIZ.LIZLLL != 0) {
            iRevenueStrategyService.GN();
            C1123320fL0 c1123320fL0LIZIZ2 = C1121450fHz.LIZIZ(enumC1121470fI1.getType());
            if (c1123320fL0LIZIZ2 != null && (map2 = c1123320fL0LIZIZ2.LIZ) != null) {
                for (Map.Entry<String, String> entry : map2.entrySet()) {
                    if (entry.getKey().length() > 0 && entry.getValue().length() > 0) {
                        map.put(entry.getKey(), entry.getValue());
                    }
                }
            }
        }
    }

    public static String LJI(Integer num) {
        String hash;
        if (num != null) {
            num.intValue();
            IWalletService iWalletService = (IWalletService) C1161920gLG.LIZJ(IWalletService.class);
            C1804110x33 c1804110x33 = EnumC1804100x32.Companion;
            boolean zCanRedirectRechargeV3 = iWalletService.canRedirectRechargeV3();
            boolean zIsV3Phase2 = iWalletService.isV3Phase2(num.intValue());
            c1804110x33.getClass();
            EnumC1804100x32 enumC1804100x32LIZ = C1804110x33.LIZ(zCanRedirectRechargeV3, num, zIsV3Phase2);
            if (enumC1804100x32LIZ != null) {
                hash = enumC1804100x32LIZ.getHash();
            } else {
                hash = null;
            }
            if (C500260Jjc.LJJIIZ(hash)) {
                return hash;
            }
        }
        return null;
    }

    public static String LJIIJ(String str) {
        if (!C1123580fLQ.LIZIZ(str)) {
            return "";
        }
        return str;
    }

    public static String LJIIJJI(C1802410x0J c1802410x0J) {
        if (c1802410x0J.LJIILIIL) {
            int i = c1802410x0J.LJIIJJI;
            if (i != 0) {
                if (i != 1) {
                    if (i != 4) {
                        if (i != 5) {
                            if (i != 6) {
                                if (i == 7) {
                                    return "event_ticket";
                                }
                                return "room_recharge";
                            }
                            return "shoutout";
                        }
                        return "promote";
                    }
                    return "video_gifting";
                }
                return "balance_page_recharge";
            }
            if (TextUtils.equals(c1802410x0J.LJ, "first_recharge")) {
                return "room_first_recharge_panel_cash";
            }
            if (Intrinsics.LJFF(LJIILJJIL(), "1")) {
                return "room_first_recharge_panel_normal";
            }
            if (c1802410x0J.LJIIL == 1002) {
                return "room_insufficient_recharge_panel";
            }
            return "room_recharge";
        }
        int i2 = c1802410x0J.LJIIJJI;
        if (i2 != 0) {
            if (i2 != 15) {
                if (i2 == 18) {
                    if (c1802410x0J.LJIIL != 1) {
                        return "room_ug_exchange";
                    }
                    return "room_income_exchange";
                }
                switch (i2) {
                    case BdTuring.TYPE_ECAF /* 9 */:
                        if (c1802410x0J.LJIIL == 1) {
                            return "balance_page_income_exchange";
                        }
                        return "balance_page_ug_exchange";
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        if (c1802410x0J.LJIIL == 1) {
                            return "withdraw_page_income_exchange";
                        }
                        return "withdraw_page_ug_exchange";
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        if (c1802410x0J.LJIIL == 1) {
                            if (((WalletExchange) ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletExchange()).LJIL()) {
                                return "room_gift_auto_income_exchange";
                            }
                            return "room_gift_manual_income_exchange";
                        }
                        if (((WalletExchange) ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletExchange()).LJJ()) {
                            return "room_gift_auto_ug_exchange";
                        }
                        return "room_gift_manual_ug_exchange";
                    default:
                        return "room_ug_exchange";
                }
            }
            return "balance_page_refund_credit";
        }
        if (c1802410x0J.LJIIL != 1) {
            return "room_ug_exchange";
        }
        return "room_income_exchange";
    }

    public static String LJIIL(Integer num) {
        Object c098200Yq;
        int iIntValue;
        try {
            C1126800fQc.LIZ.py();
            C1134860fdc c1134860fdc = C1134860fdc.LIZ;
            if (num == null) {
                iIntValue = 0;
            } else {
                iIntValue = num.intValue();
            }
            c098200Yq = String.valueOf(c1134860fdc.LIZIZ(iIntValue, 0));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = CardStruct.IStatusCode.DEFAULT;
        }
        return (String) c098200Yq;
    }

    public static void LJIJJLI(DataChannel dataChannel) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_wallet_view_click");
        c474500IjALIZ.LJJII("recharge_panel", "page");
        c474500IjALIZ.LJJII("refund_recover", "type");
        c474500IjALIZ.LJJII("freeze_user_coin_balance_info", "sub_type");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LIZ();
    }

    public static void LJIL(DataChannel dataChannel) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_wallet_client_show");
        c474500IjALIZ.LJJII("recharge_panel", "page");
        c474500IjALIZ.LJJII("refund_recover", "type");
        c474500IjALIZ.LJJII("freeze_user_coin_balance_info", "sub_type");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LIZ();
    }

    public static void LJJIIZI(String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_recharge_quick_charge_entry_click");
        c474500IjALIZ.LJJII("live_detail", "request_page");
        c474500IjALIZ.LJJII(str, "entry_type");
        c474500IjALIZ.LIZ();
    }

    public static void LJJIJ(String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_recharge_quick_charge_entry_show");
        c474500IjALIZ.LJJII("live_detail", "request_page");
        c474500IjALIZ.LJJII(str, "entry_type");
        c474500IjALIZ.LIZ();
    }

    public static void LJJJJJL(C474500IjA c474500IjA) {
        String strLJIJ = c474500IjA.LJIJ();
        JSONObject jSONObjectLIZLLL = C2348809Ig.LIZLLL(c474500IjA.LJIJI());
        if (jSONObjectLIZLLL == null) {
            jSONObjectLIZLLL = new JSONObject();
        }
        try {
            C1807660x8m.LIZ(strLJIJ, "wallet", jSONObjectLIZLLL, new JSONObject(), new JSONObject());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static JSONObject LJJJJL(Map map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            jSONObject.put((String) entry.getKey(), entry.getValue());
        }
        return jSONObject;
    }

    public static void LJFF(Integer num, Map map) {
        String strLJI = LJI(num);
        if (strLJI != null) {
            map.put("charge_from", strLJI);
        }
    }

    public static Map LJII(C1803830x2b c1803830x2b, int i) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!c1803830x2b.LJIIJ) {
            return linkedHashMap;
        }
        long j = c1803830x2b.LJII;
        linkedHashMap.put("gift_id", String.valueOf(c1803830x2b.LJFF));
        linkedHashMap.put("gift_total_price", String.valueOf(c1803830x2b.LJIIIZ));
        linkedHashMap.put("price_gap", String.valueOf(j));
        linkedHashMap.put("package_price_gap", String.valueOf(((long) i) - j));
        linkedHashMap.put("has_sent_before", c1803830x2b.LJIJI);
        return linkedHashMap;
    }

    public static Map LJIIIIZZ(C1803830x2b c1803830x2b, boolean z) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean z2 = c1803830x2b.LJIIJ;
        String str = CardStruct.IStatusCode.DEFAULT;
        if (z2) {
            linkedHashMap.put("if_insufficient", "1");
            if (z) {
                str = "1";
            }
            linkedHashMap.put("if_new_rec", str);
            return linkedHashMap;
        }
        linkedHashMap.put("if_insufficient", CardStruct.IStatusCode.DEFAULT);
        return linkedHashMap;
    }

    public static void LJJ(String str, C1802410x0J c1802410x0J) {
        boolean z;
        LIZ.getClass();
        String strLJIIJJI = LJIIJJI(c1802410x0J);
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null && UserService.getInstance().user().getCurrentUserId() == room.getOwnerUserId()) {
            z = true;
        } else {
            z = false;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_recharge_ban_popup_click");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(String.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        c474500IjALIZ.LJJII(Boolean.valueOf(z), "is_anchor");
        c474500IjALIZ.LJJII(strLJIIJJI, "popup_entrance");
        c474500IjALIZ.LJJII("gpppa", "ban_reason");
        c474500IjALIZ.LJJII(str, "click_type");
        c474500IjALIZ.LIZ();
    }

    public static void LJJI(C1803830x2b c1803830x2b, Exception exc) {
        String mappedErrorMessage;
        int internalCode;
        String mappedErrorCode;
        int detailCode;
        String message;
        int errorCode;
        int i = 0;
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("click_type", "retry"), new Pair("request_page", c1803830x2b.LJIIL));
        if (exc == null || (mappedErrorMessage = exc.getMessage()) == null) {
            mappedErrorMessage = "";
        }
        if (exc instanceof C1797200wru) {
            C1797200wru c1797200wru = (C1797200wru) exc;
            errorCode = c1797200wru.getErrorCode();
            detailCode = c1797200wru.getDetailCode();
            internalCode = c1797200wru.getInternalCode();
            message = c1797200wru.getException().getMessage();
            if (message == null) {
                message = "";
            }
            mappedErrorCode = c1797200wru.getMappedErrorCode();
            mappedErrorMessage = c1797200wru.getMappedErrorMessage();
        } else {
            internalCode = -1;
            mappedErrorCode = CardStruct.IStatusCode.DEFAULT;
            detailCode = 0;
            message = mappedErrorMessage;
            errorCode = 0;
        }
        Intrinsics.LJFF("retry", "retry");
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_get_package_failed_page_click");
        c474500IjALIZ.LJJIIZI(mapLJIIJ);
        c474500IjALIZ.LJJIIZI(LJIIIZ());
        c474500IjALIZ.LJJII(c1803830x2b.LIZLLL, "charge_reason");
        c474500IjALIZ.LJJII(LJIILJJIL(), "is_first_recharge");
        c474500IjALIZ.LJJII(message, "error_msg");
        c474500IjALIZ.LJJII(Integer.valueOf(errorCode), "error_code");
        c474500IjALIZ.LJJII(Integer.valueOf(detailCode), "detail_error_code");
        if (internalCode == 2) {
            i = 1;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(i), "is_google_version_old");
        c474500IjALIZ.LJJII(mappedErrorCode, "mapped_error_code");
        c474500IjALIZ.LJJII(mappedErrorMessage, "mapped_error_message");
        c474500IjALIZ.LJJII("", "failed_action");
        c474500IjALIZ.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0006  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Unknown Source)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJIIZ(int r3, X.C1802410x0J r4) {
        /*
            switch(r3) {
                case 42030: goto L6;
                case 42031: goto L22;
                case 42032: goto L22;
                default: goto L3;
            }
        L3:
            switch(r3) {
                case 4005265: goto L22;
                case 4005266: goto L6;
                case 4005267: goto L22;
                case 4005268: goto L22;
                case 4005269: goto L6;
                case 4005270: goto L22;
                case 4005271: goto L22;
                default: goto L6;
            }
        L6:
            java.lang.String r0 = "livesdk_kyc_reminder_popup"
        L8:
            X.0IjA r2 = X.C0IJT.LIZ(r0)
            r2.LJIL()
            java.lang.String r1 = "error_code"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r2.LJJII(r0, r1)
            LIZIZ(r2)
            LIZ(r2, r3, r4)
            r2.LIZ()
            return
        L22:
            java.lang.String r0 = "livesdk_kyc_popup_show"
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1803800x2Y.LJJIIZ(int, X.0x0J):void");
    }

    public static void LJJIZ(String str, String str2) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_inapp_top_notice_close");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII("live_detail", "request_page");
        c474500IjALIZ.LJJII(str, "charge_reason");
        c474500IjALIZ.LJJII("white", "notice_type");
        c474500IjALIZ.LJJII(str2, "notice_id");
        c474500IjALIZ.LIZ();
    }

    public static void LJJJI(String str, String str2) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_inapp_top_notice_show");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII("live_detail", "request_page");
        c474500IjALIZ.LJJII(str, "charge_reason");
        c474500IjALIZ.LJJII(str2, "notice_id");
        c474500IjALIZ.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(X.C474500IjA r4, int r5, X.C1802410x0J r6) {
        /*
            java.lang.String r1 = LJIIJJI(r6)
            java.lang.String r0 = "popup_entrance"
            r4.LJJII(r1, r0)
            java.lang.String r3 = ""
            switch(r5) {
                case 42030: goto L11;
                case 42031: goto L3d;
                case 42032: goto L40;
                default: goto Le;
            }
        Le:
            switch(r5) {
                case 4005265: goto L3a;
                case 4005266: goto L11;
                case 4005267: goto L3a;
                case 4005268: goto L3a;
                case 4005269: goto L11;
                case 4005270: goto L40;
                case 4005271: goto L3d;
                default: goto L11;
            }
        L11:
            r1 = r3
        L12:
            java.lang.String r0 = "popup_type"
            r4.LJJII(r1, r0)
            java.lang.Exception r0 = r6.LIZLLL
            com.bytedance.android.livesdk.wallet.CustomErrorExtra r2 = com.bytedance.android.livesdk.wallet.CustomErrorExtra.getCustomErrorExtra(r0)
            java.lang.String r1 = "trigger_scenario"
            java.lang.String r0 = "recharge"
            r4.LJJII(r0, r1)
            java.lang.String r1 = "page_type"
            if (r2 == 0) goto L38
            X.08HV r0 = r2.extraMap
            if (r0 == 0) goto L38
            org.json.JSONObject r0 = r0.LIZ
            if (r0 == 0) goto L38
            java.lang.String r0 = r0.optString(r1, r3)
        L34:
            r4.LJJII(r0, r1)
            return
        L38:
            r0 = 0
            goto L34
        L3a:
            java.lang.String r1 = "resubmit"
            goto L12
        L3d:
            java.lang.String r1 = "under_review"
            goto L12
        L40:
            java.lang.String r1 = "rejected"
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1803800x2Y.LIZ(X.0IjA, int, X.0x0J):void");
    }

    public static void LJJJJI(int i, DataChannel dataChannel, Integer num) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_recharge_show_recommond");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(Integer.valueOf(i), "recommend_package");
        c474500IjALIZ.LJJII(LJIIL(num), "strategy_task_type");
        c474500IjALIZ.LIZ();
    }

    public static void LJJJJJ(String str, String str2, boolean z) {
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("request_page", str), new Pair("is_first_recharge", LJIILJJIL()), new Pair("has_pipo_recharge_before", String.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0)), new Pair("panel_channel", str2), new Pair("recharge_v3_version", String.valueOf(((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).getRechargeService().LIZJ())));
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_recharge_panel_switch");
        c474500IjALIZ.LJJIIZI(mapLJIIIIZZ);
        c474500IjALIZ.LIZ();
    }

    public static void LJIILL(int i, String str, String str2, Map map) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_abnormal_subscribe_popup_click");
        c474500IjALIZ.LJJII(str, "failed_reason");
        c474500IjALIZ.LJJII(str2, "click_type");
        c474500IjALIZ.LJJII(str2, "type");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "error_code");
        c474500IjALIZ.LJJII(LJIIL(null), "strategy_task_type");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LIZ();
    }

    public static void LJJIFFI(C1803830x2b c1803830x2b, String str, boolean z, Exception exc) {
        String message;
        int internalCode;
        String mappedErrorCode;
        String mappedErrorMessage;
        int errorCode;
        int detailCode;
        String str2;
        String str3 = "";
        if (exc == null || (message = exc.getMessage()) == null) {
            message = "";
        }
        int i = 0;
        if (exc instanceof C1797200wru) {
            C1797200wru c1797200wru = (C1797200wru) exc;
            errorCode = c1797200wru.getErrorCode();
            detailCode = c1797200wru.getDetailCode();
            internalCode = c1797200wru.getInternalCode();
            String message2 = c1797200wru.getException().getMessage();
            if (message2 != null) {
                str3 = message2;
            }
            mappedErrorCode = c1797200wru.getMappedErrorCode();
            mappedErrorMessage = c1797200wru.getMappedErrorMessage();
            message = str3;
        } else {
            internalCode = -1;
            mappedErrorCode = CardStruct.IStatusCode.DEFAULT;
            mappedErrorMessage = message;
            errorCode = 0;
            detailCode = 0;
        }
        if (z) {
            str2 = "success";
        } else {
            str2 = "failed";
        }
        Intrinsics.LJFF(str, "retry");
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("click_type", str), new Pair("request_page", c1803830x2b.LJIIL));
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_get_package_failed_page_click_result");
        c474500IjALIZ.LJJIIZI(mapLJIIJ);
        c474500IjALIZ.LJJIIZI(LJIIIZ());
        c474500IjALIZ.LJJII(LJIILJJIL(), "is_first_recharge");
        c474500IjALIZ.LJJII(c1803830x2b.LIZLLL, "charge_reason");
        c474500IjALIZ.LJJII(message, "error_msg");
        c474500IjALIZ.LJJII(Integer.valueOf(errorCode), "error_code");
        c474500IjALIZ.LJJII(Integer.valueOf(detailCode), "detail_error_code");
        if (internalCode == 2) {
            i = 1;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(i), "is_google_version_old");
        c474500IjALIZ.LJJII(mappedErrorCode, "mapped_error_code");
        c474500IjALIZ.LJJII(mappedErrorMessage, "mapped_error_message");
        c474500IjALIZ.LJJII(str2, "click_result");
        c474500IjALIZ.LIZ();
    }

    public static void LJJII(C1803830x2b c1803830x2b, C1797200wru c1797200wru, boolean z, InterfaceC1804390x3V interfaceC1804390x3V) {
        Map<String, Long> mapLJIIIIZZ;
        int errorCode = c1797200wru.getErrorCode();
        int detailCode = c1797200wru.getDetailCode();
        int internalCode = c1797200wru.getInternalCode();
        String message = c1797200wru.getException().getMessage();
        String mappedErrorCode = c1797200wru.getMappedErrorCode();
        String mappedErrorMessage = c1797200wru.getMappedErrorMessage();
        int i = 0;
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("has_to_tiktok_com_option", String.valueOf(0)), new Pair("request_page", c1803830x2b.LJIIL));
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_get_package_failed_page_show");
        c474500IjALIZ.LJJIIZI(mapLJIIJ);
        c474500IjALIZ.LJJIIZI(LJIIIZ());
        c474500IjALIZ.LJJIIZI(c1803830x2b.LIZJ);
        c474500IjALIZ.LJJII(c1803830x2b.LIZLLL, "charge_reason");
        c474500IjALIZ.LJJII(LJIILJJIL(), "is_first_recharge");
        c474500IjALIZ.LJJII(message, "error_msg");
        c474500IjALIZ.LJJII(Integer.valueOf(errorCode), "error_code");
        c474500IjALIZ.LJJII(mappedErrorCode, "mapped_error_code");
        c474500IjALIZ.LJJII(mappedErrorMessage, "mapped_error_message");
        c474500IjALIZ.LJJII(Integer.valueOf(detailCode), "detail_error_code");
        if (internalCode == 2) {
            i = 1;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(i), "is_google_version_old");
        c474500IjALIZ.LJJII("", "failed_action");
        if (interfaceC1804390x3V != null && (mapLJIIIIZZ = interfaceC1804390x3V.LJIIIIZZ()) != null) {
            c474500IjALIZ.LJJIJ(mapLJIIIIZZ);
        }
        c474500IjALIZ.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0006  */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Unknown Source)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJIIJZLJL(int r3, X.C1802410x0J r4, boolean r5, boolean r6) {
        /*
            switch(r3) {
                case 42030: goto L6;
                case 42031: goto L61;
                case 42032: goto L61;
                default: goto L3;
            }
        L3:
            switch(r3) {
                case 4005265: goto L61;
                case 4005266: goto L6;
                case 4005267: goto L61;
                case 4005268: goto L61;
                case 4005269: goto L6;
                case 4005270: goto L61;
                case 4005271: goto L61;
                default: goto L6;
            }
        L6:
            java.lang.String r0 = "livesdk_kyc_reminder_popup_click"
        L8:
            X.0IjA r2 = X.C0IJT.LIZ(r0)
            r2.LJIL()
            java.lang.String r1 = "error_code"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r2.LJJII(r0, r1)
            if (r6 == 0) goto L2b
            java.lang.String r1 = "check_detail"
        L1c:
            java.lang.String r0 = "click_type"
            r2.LJJII(r1, r0)
            LIZIZ(r2)
            LIZ(r2, r3, r4)
            r2.LIZ()
            return
        L2b:
            switch(r3) {
                case 42030: goto L53;
                case 42031: goto L48;
                case 42032: goto L45;
                default: goto L2e;
            }
        L2e:
            switch(r3) {
                case 4005265: goto L40;
                case 4005266: goto L56;
                case 4005267: goto L3d;
                case 4005268: goto L3a;
                case 4005269: goto L37;
                case 4005270: goto L4b;
                case 4005271: goto L34;
                default: goto L31;
            }
        L31:
            java.lang.String r1 = ""
            goto L1c
        L34:
            if (r5 == 0) goto L50
            goto L4d
        L37:
            if (r5 == 0) goto L5e
            goto L58
        L3a:
            if (r5 == 0) goto L5e
            goto L42
        L3d:
            if (r5 == 0) goto L5b
            goto L42
        L40:
            if (r5 == 0) goto L5e
        L42:
            java.lang.String r1 = "resubmit"
            goto L1c
        L45:
            if (r5 == 0) goto L50
            goto L4d
        L48:
            if (r5 == 0) goto L50
            goto L4d
        L4b:
            if (r5 == 0) goto L50
        L4d:
            java.lang.String r1 = "got_it"
            goto L1c
        L50:
            java.lang.String r1 = "see_detail"
            goto L1c
        L53:
            if (r5 == 0) goto L5e
            goto L58
        L56:
            if (r5 == 0) goto L5b
        L58:
            java.lang.String r1 = "verify"
            goto L1c
        L5b:
            java.lang.String r1 = "not_now"
            goto L1c
        L5e:
            java.lang.String r1 = "cancel"
            goto L1c
        L61:
            java.lang.String r0 = "livesdk_kyc_popup_click"
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1803800x2Y.LJJIIJZLJL(int, X.0x0J, boolean, boolean):void");
    }

    public static void LJJJ(String str, String str2, String str3, String str4) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_inapp_top_notice_click");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII("live_detail", "request_page");
        c474500IjALIZ.LJJII(str, "charge_reason");
        c474500IjALIZ.LJJII(str2, "notice_id");
        c474500IjALIZ.LJJII(str3, "redirection_path");
        c474500IjALIZ.LJJII(str4, "fallback_reason");
        c474500IjALIZ.LIZ();
    }

    public static void LJJJJIZL(int i, RechargeViewModel rechargeViewModel, DataChannel dataChannel, Map map) {
        Object obj;
        Pair[] pairArr = new Pair[10];
        boolean zLJFF = false;
        pairArr[0] = new Pair("request_page", rechargeViewModel.eR2());
        pairArr[1] = new Pair("charge_reason", rechargeViewModel.XQ2());
        pairArr[2] = new Pair("charge_style", "window");
        pairArr[3] = new Pair("panel_type", "normal");
        pairArr[4] = new Pair("is_first_recharge", LJIILJJIL());
        pairArr[5] = new Pair("strategy_task_type", LJIIL(Integer.valueOf(rechargeViewModel.YQ2())));
        if (dataChannel != null) {
            zLJFF = Intrinsics.LJFF(dataChannel.gg0(UserIsAnchorChannel.class), Boolean.TRUE);
        }
        String str = "1";
        if (zLJFF) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[6] = new Pair("is_anchor", obj);
        pairArr[7] = new Pair("package_show_num", String.valueOf(i));
        if (rechargeViewModel.lR2()) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[8] = new Pair("is_landscape", str);
        pairArr[9] = new Pair("model", Build.MODEL);
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_recharge_show_before_action");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJIIZI(mapLJIIIIZZ);
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
    }

    public static void LIZJ(C474500IjA c474500IjA, int i, boolean z, String str, boolean z2) {
        String str2;
        c474500IjA.LJIL();
        c474500IjA.LJJII("recharge_panel", "position");
        c474500IjA.LJJII("banner", "click_position");
        c474500IjA.LJJII(Integer.valueOf(i), "recharge_package");
        if (z) {
            str2 = "with_price";
        } else {
            str2 = "without_price";
        }
        c474500IjA.LJJII(str2, "copywrite_type");
        c474500IjA.LJJII(Integer.valueOf(z2 ? 1 : 0), "is_iap_package_fail");
        LIZIZ(c474500IjA);
        if (str != null) {
            c474500IjA.LJJII(str, "banner_type");
        }
    }

    public static void LJJIII(int i, String str, String str2, String str3, boolean z) {
        boolean z2;
        Object obj;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null && UserService.getInstance().user().getCurrentUserId() == room.getOwnerUserId()) {
            z2 = true;
        } else {
            z2 = false;
        }
        Pair[] pairArr = new Pair[10];
        String str4 = "1";
        pairArr[0] = new Pair("abs_status", "1");
        pairArr[1] = new Pair("user_id", String.valueOf(UserService.getInstance().user().getCurrentUserId()));
        w.LIZ.getClass();
        pairArr[2] = new Pair("room_id", String.valueOf(w.LJIJJ()));
        pairArr[3] = new Pair("recharge_package", String.valueOf(i));
        pairArr[4] = new Pair("request_page", str3);
        pairArr[5] = new Pair("charge_reason", str2);
        pairArr[6] = new Pair("pay_method", str);
        pairArr[7] = new Pair("request_id", w.LJIJI());
        if (z2) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[8] = new Pair("is_anchor", obj);
        if (!z) {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[9] = new Pair("is_first_recharge", str4);
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_recharge_billing_choice_page_click");
        c474500IjALIZ.LJJIIZI(mapLJIIIIZZ);
        c474500IjALIZ.LIZ();
    }

    public static void LJJIIJ(long j, String str, String str2, String str3, String str4) {
        String billingCountryCode;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_googleplay_ecl_callback_result");
        c474500IjALIZ.LJJII(str, "action");
        c474500IjALIZ.LJJII(str2, "transaction_token");
        c474500IjALIZ.LJJII(str3, "message");
        c474500IjALIZ.LJJII(str4, "error_code");
        c474500IjALIZ.LJJII(Long.valueOf(j), "duration");
        InterfaceC1791930wjP interfaceC1791930wjP = (InterfaceC1791930wjP) C1161920gLG.LIZJ(IapService.class);
        if (interfaceC1791930wjP == null || (billingCountryCode = interfaceC1791930wjP.getBillingCountryCode()) == null) {
            billingCountryCode = "";
        }
        c474500IjALIZ.LJJII(billingCountryCode, "app_store_front");
        c474500IjALIZ.LIZ();
    }

    public static void LJJIJIIJIL(C1802410x0J c1802410x0J, String str, String str2, CustomErrorExtra customErrorExtra, String str3) {
        int errorCode;
        C08HV c08hv;
        Map<String, String> map;
        String strLIZ = C1802850x11.LIZ(c1802410x0J);
        Exception exc = c1802410x0J.LIZLLL;
        if (exc instanceof C501470JlZ) {
            errorCode = ((C501520Jle) exc).getErrorCode();
        } else {
            errorCode = -1;
        }
        String strLIZ2 = C1123580fLQ.LIZ(c1802410x0J.LJII.get("gift_enter_from"));
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_wallet_limit_popup_click");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(LJIIL(Integer.valueOf(c1802410x0J.LJIIJJI)), "strategy_task_type");
        c474500IjALIZ.LJJII(Integer.valueOf(errorCode), "error_code");
        c474500IjALIZ.LJJII(strLIZ, "entry_type");
        c474500IjALIZ.LJJII(str, "click_type");
        c474500IjALIZ.LJJII(str2, "click_area");
        if (str3 != null && C500260Jjc.LJJIIZ(str3)) {
            c474500IjALIZ.LJJII(str3, "panel_channel");
            c474500IjALIZ.LJJII(String.valueOf(((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).getRechargeService().LIZJ()), "recharge_v3_version");
        }
        if (Intrinsics.LJFF(strLIZ, "send_gift")) {
            c474500IjALIZ.LJJII(strLIZ2, "gift_enter_from");
        }
        c474500IjALIZ.LJJII(LJIIJJI(c1802410x0J), "hit_entry");
        if (customErrorExtra != null && (c08hv = customErrorExtra.extraMap) != null && (map = c08hv.LIZIZ) != null) {
            for (Map.Entry entry : ((HashMap) map).entrySet()) {
                c474500IjALIZ.LJJII(entry.getValue(), (String) entry.getKey());
            }
        }
        LIZIZ(c474500IjALIZ);
        c474500IjALIZ.LIZ();
    }

    @InterfaceC1294060jmO
    public static void LJIILLIIL(int i, int i2, int i3, String str, String str2, String str3) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_recharge_fail_contact_us_click");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "package");
        c474500IjALIZ.LJJII(str, "fail_from");
        c474500IjALIZ.LJJII(str2, "fail_reason");
        c474500IjALIZ.LJJII(str3, "charge_reason");
        c474500IjALIZ.LJJII(Integer.valueOf(i2), "error_code");
        c474500IjALIZ.LJJII(Integer.valueOf(i3), "detail_error_code");
        c474500IjALIZ.LJJII(LJIIL(null), "strategy_task_type");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LIZ();
    }

    public static void LJJJJ(C1803830x2b c1803830x2b, DataChannel dataChannel, Diamond diamond, boolean z, boolean z2, Map map, Map map2, int i, int i2) {
        String str;
        Object obj;
        String str2;
        String str3;
        Integer numValueOf;
        String strLIZ;
        Object obj2;
        Object obj3;
        String billingCountryCode;
        Pair[] pairArr = new Pair[28];
        pairArr[0] = new Pair("request_page", c1803830x2b.LJIIL);
        w.LIZ.getClass();
        if (Intrinsics.LJFF(w.LJIIL(), "portal")) {
            str = "portal";
        } else {
            str = c1803830x2b.LIZLLL;
        }
        pairArr[1] = new Pair("charge_reason", str);
        pairArr[2] = new Pair("charge_style", "window");
        pairArr[3] = new Pair("gift_enter_from", C1123580fLQ.LIZ(c1803830x2b.LJIILJJIL));
        pairArr[4] = new Pair("gift_send_type", c1803830x2b.LJIILLIIL);
        pairArr[5] = new Pair("has_gift_sent_before", c1803830x2b.LJIJI);
        C1803800x2Y c1803800x2Y = LIZ;
        String str4 = c1803830x2b.LJIILJJIL;
        c1803800x2Y.getClass();
        pairArr[6] = new Pair("notification_type", LJIIJ(str4));
        String str5 = c1803830x2b.LJIILJJIL;
        String str6 = c1803830x2b.LJIILL;
        String str7 = "";
        if (!C1123580fLQ.LIZIZ(str5)) {
            str6 = "";
        }
        pairArr[7] = new Pair("notification_request_id", str6);
        pairArr[8] = new Pair("pay_method", C1796440wqg.LIZ());
        pairArr[9] = new Pair("is_first_recharge", LJIILJJIL());
        pairArr[10] = new Pair("is_first_cash_recharge", LJIILIIL());
        pairArr[11] = new Pair("strategy_task_type", LJIIL(Integer.valueOf(c1803830x2b.LJ)));
        pairArr[12] = new Pair("second_entrance", c1803830x2b.LJIILIIL);
        pairArr[13] = new Pair("timestamp", String.valueOf(C158B.LIZ()));
        String str8 = "1";
        if (C500260Jjc.LJIIZILJ(dataChannel)) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[14] = new Pair("is_anchor", obj);
        pairArr[15] = new Pair("request_id", w.LJIJI());
        if (C497740JfY.LJIL()) {
            str2 = "portrait";
        } else {
            str2 = "landscape";
        }
        pairArr[16] = new Pair("room_orientation", str2);
        if (c1803830x2b.LJIIJ) {
            str3 = "rec_main";
        } else {
            str3 = "normal";
        }
        pairArr[17] = new Pair("panel_type", str3);
        if (diamond != null) {
            numValueOf = Integer.valueOf(diamond.count);
        } else {
            numValueOf = null;
        }
        pairArr[18] = new Pair("call_package", String.valueOf(numValueOf));
        if (diamond != null) {
            strLIZ = C1804850x4F.LIZ(diamond);
        } else {
            strLIZ = null;
        }
        pairArr[19] = new Pair("currency", String.valueOf(strLIZ));
        pairArr[20] = new Pair("portal_id", String.valueOf(w.LJIJ()));
        if (Intrinsics.LJFF(w.LJIIL(), "portal")) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[21] = new Pair("is_portal_user", obj2);
        if (z2) {
            obj3 = "1";
        } else {
            obj3 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[22] = new Pair("if_has_exchange_option", obj3);
        if (!c1803830x2b.LJIJJ) {
            str8 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[23] = new Pair("is_from_switch", str8);
        InterfaceC1791930wjP interfaceC1791930wjP = (InterfaceC1791930wjP) C1161920gLG.LIZJ(IapService.class);
        if (interfaceC1791930wjP != null && (billingCountryCode = interfaceC1791930wjP.getBillingCountryCode()) != null) {
            str7 = billingCountryCode;
        }
        pairArr[24] = new Pair("app_store_front", str7);
        pairArr[25] = new Pair("platform_type", c1803830x2b.LJIJJLI.toString());
        pairArr[26] = new Pair("is_quick_charge_on", String.valueOf(i));
        pairArr[27] = new Pair("is_over_kyc_limit", String.valueOf(i2));
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        LJ(mapLJIIJ);
        LJFF(Integer.valueOf(c1803830x2b.LJ), mapLJIIJ);
        if (map2 != null) {
            mapLJIIJ.putAll(map2);
        }
        LIZLLL(mapLJIIJ);
        if (c1803830x2b.LJIIJ) {
            mapLJIIJ.put("gift_id", String.valueOf(c1803830x2b.LJFF));
            mapLJIIJ.put("gift_total_price", String.valueOf(c1803830x2b.LJIIIZ));
        }
        Map mapLJIIIZ = LJIIIZ();
        Map mapLJIIIIZZ = LJIIIIZZ(c1803830x2b, z);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_recharge_show");
        if (!C2093608Ic.LJ(w.LJIIJJI())) {
            c474500IjALIZ.LJJII(w.LJIIJJI(), "enter_url_source");
        }
        if (w.LJIIJ() != 0) {
            c474500IjALIZ.LJJII(String.valueOf(w.LJIIJ()), "enter_gift_id");
        }
        c474500IjALIZ.LJJIIZI(mapLJIIJ);
        c474500IjALIZ.LJJIIZI(mapLJIIIZ);
        c474500IjALIZ.LJJIIZI(mapLJIIIIZZ);
        c474500IjALIZ.LJJIIZI(c1803830x2b.LIZJ);
        c474500IjALIZ.LJJIIZI(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).getMatchLogParams());
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJFF(C0IXW.LIZIZ(null, dataChannel, "user_live_duration"));
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LIZ();
        IRevenueStrategyService iRevenueStrategyServiceLIZIZ = C1126800fQc.LIZIZ();
        if (iRevenueStrategyServiceLIZIZ != null && iRevenueStrategyServiceLIZIZ.getMonitor() != null) {
            C1134320fck.LJ();
        }
    }

    @InterfaceC1294060jmO
    public static void LJIJI(String str, int i, int i2, String str2, String str3, String str4, String str5, String str6, int i3, int i4) {
        int i5;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_recharge_fail_popup_show");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(Integer.valueOf(i), "package");
        c474500IjALIZ.LJJII(Integer.valueOf(i2), "error_code");
        c474500IjALIZ.LJJII(Integer.valueOf(i3), "detail_error_code");
        c474500IjALIZ.LJJII(str4, "error_message");
        c474500IjALIZ.LJJII(Integer.valueOf(i4), "internal_error_code");
        c474500IjALIZ.LJJII(str, "fail_from");
        c474500IjALIZ.LJJII(str2, "fail_reason");
        c474500IjALIZ.LJJII(str5, "request_page");
        c474500IjALIZ.LJJII(str3, "charge_reason");
        if (str6 != null) {
            i5 = 1;
        } else {
            i5 = 0;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(i5), "has_push_opt_in_guide");
        c474500IjALIZ.LJJII(str6, "push_type");
        c474500IjALIZ.LJJII(LJIIL(null), "strategy_task_type");
        c474500IjALIZ.LIZ();
    }

    public static void LJJIJL(Integer num, String str, String str2, C1803830x2b c1803830x2b, DataChannel dataChannel, String str3, int i, int i2, String str4, String str5, String str6, Map map, int i3) {
        String str7;
        String str8;
        String str9 = c1803830x2b.LIZLLL;
        String str10 = c1803830x2b.LJIIL;
        if (c1803830x2b.LJIIJ) {
            str7 = "rec_main";
        } else {
            str7 = "normal";
        }
        if (c1803830x2b.LJIJJ) {
            str8 = "1";
        } else {
            str8 = CardStruct.IStatusCode.DEFAULT;
        }
        LJJIJIL(num, str, str9, str10, str7, str8, str2, c1803830x2b.LIZJ, dataChannel, str3, i, i2, str4, str5, str6, Integer.valueOf(c1803830x2b.LJ), map, i3);
    }

    public static void LJJJIL(int i, int i2, C1803830x2b c1803830x2b, DataChannel dataChannel, Map map, Integer num, String str, boolean z, Map map2, Map map3, boolean z2, int i3, int i4) {
        int i5;
        int i6;
        Object obj;
        Object obj2;
        String str2;
        String billingCountryCode;
        if (i2 < 0) {
            i5 = i2;
        } else {
            i5 = (i2 / 3) + 1;
        }
        boolean zLJFF = false;
        if (num != null && i == num.intValue()) {
            i6 = 1;
        } else {
            i6 = 0;
        }
        Pair[] pairArr = new Pair[25];
        pairArr[0] = new Pair("request_page", c1803830x2b.LJIIL);
        pairArr[1] = new Pair("charge_reason", c1803830x2b.LIZLLL);
        pairArr[2] = new Pair("gift_enter_from", c1803830x2b.LJIILJJIL);
        pairArr[3] = new Pair("has_gift_sent_before", c1803830x2b.LJIJI);
        pairArr[4] = new Pair("charge_style", "window");
        pairArr[5] = new Pair("pay_method", C1796440wqg.LIZ());
        pairArr[6] = new Pair("is_first_recharge", LJIILJJIL());
        pairArr[7] = new Pair("is_first_cash_recharge", LJIILIIL());
        pairArr[8] = new Pair("strategy_task_type", LJIIL(Integer.valueOf(c1803830x2b.LJ)));
        pairArr[9] = new Pair("notification_type", LJIIJ(c1803830x2b.LJIILJJIL));
        pairArr[10] = new Pair("recharge_package", String.valueOf(i));
        if (dataChannel != null) {
            zLJFF = Intrinsics.LJFF(dataChannel.gg0(UserIsAnchorChannel.class), Boolean.TRUE);
        }
        String str3 = "1";
        if (zLJFF) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[11] = new Pair("is_anchor", obj);
        pairArr[12] = new Pair("line", String.valueOf(i5));
        pairArr[13] = new Pair("position", String.valueOf(i2));
        w.LIZ.getClass();
        pairArr[14] = new Pair("portal_id", String.valueOf(w.LJIJ()));
        if (Intrinsics.LJFF(w.LJIIL(), "portal")) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[15] = new Pair("is_portal_user", obj2);
        if (c1803830x2b.LJIIJ) {
            str2 = "rec_main";
        } else {
            str2 = "normal";
        }
        pairArr[16] = new Pair("panel_type", str2);
        pairArr[17] = new Pair("call_package", String.valueOf(num));
        pairArr[18] = new Pair("currency", String.valueOf(str));
        pairArr[19] = new Pair("if_default_package", String.valueOf(i6));
        if (!c1803830x2b.LJIJJ) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[20] = new Pair("is_from_switch", str3);
        InterfaceC1791930wjP interfaceC1791930wjP = (InterfaceC1791930wjP) C1161920gLG.LIZJ(IapService.class);
        if (interfaceC1791930wjP == null || (billingCountryCode = interfaceC1791930wjP.getBillingCountryCode()) == null) {
            billingCountryCode = "";
        }
        pairArr[21] = new Pair("app_store_front", billingCountryCode);
        pairArr[22] = new Pair("is_custom", String.valueOf(z2 ? 1 : 0));
        pairArr[23] = new Pair("is_quick_charge_on", String.valueOf(i3));
        pairArr[24] = new Pair("is_over_kyc_limit", String.valueOf(i4));
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        LJ(mapLJIIJ);
        LJFF(Integer.valueOf(c1803830x2b.LJ), mapLJIIJ);
        if (map3 != null) {
            mapLJIIJ.putAll(map3);
        }
        Map mapLJII = LJII(c1803830x2b, i);
        Map mapLJIIIZ = LJIIIZ();
        Map mapLJIIIIZZ = LJIIIIZZ(c1803830x2b, z);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_recharge_package_show");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJIIZI(mapLJIIJ);
        c474500IjALIZ.LJJIIZI(mapLJII);
        c474500IjALIZ.LJJIIZI(mapLJIIIZ);
        c474500IjALIZ.LJJIIZI(mapLJIIIIZZ);
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJJIIZI(map2);
        c474500IjALIZ.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x0275  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJIJIIJI(X.C1803800x2Y r13, X.C1803830x2b r14, int r15, boolean r16, com.bytedance.ies.sdk.datachannel.DataChannel r17, com.bytedance.android.livesdk.wallet.Diamond r18, boolean r19, boolean r20, boolean r21, boolean r22, java.util.Map r23, java.util.Map r24, java.util.Map r25, int r26) {
        /*
            Method dump skipped, instruction units count: 650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1803800x2Y.LJJIJIIJI(X.0x2Y, X.0x2b, int, boolean, com.bytedance.ies.sdk.datachannel.DataChannel, com.bytedance.android.livesdk.wallet.Diamond, boolean, boolean, boolean, boolean, java.util.Map, java.util.Map, java.util.Map, int):void");
    }

    public static void LJIIZILJ(C1803800x2Y c1803800x2Y, int i, String str, String str2, String str3, int i2, int i3, int i4, String str4, String str5, String str6, String str7, String str8, Boolean bool, Boolean bool2, int i5) {
        String str9;
        String str10;
        int i6;
        Boolean bool3 = bool;
        String str11 = str8;
        String str12 = str7;
        String str13 = str6;
        if ((i5 & 512) != 0) {
            str9 = "live_detail";
        } else {
            str9 = null;
        }
        if ((i5 & 1024) != 0) {
            str13 = null;
        }
        if ((i5 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str12 = null;
        }
        if ((i5 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str11 = null;
        }
        if ((i5 & 8192) != 0) {
            bool3 = null;
        }
        if ((i5 & 16384) != 0) {
            bool2 = null;
        }
        c1803800x2Y.getClass();
        int i7 = 1;
        String str14 = str3;
        String str15 = str;
        String str16 = str2;
        if (Intrinsics.LJFF(bool3, Boolean.TRUE)) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_recharge_fail_popup_click");
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LJJII(Integer.valueOf(i2), "error_code");
            c474500IjALIZ.LJJII(Integer.valueOf(i3), "detail_error_code");
            c474500IjALIZ.LJJII(str4, "error_message");
            c474500IjALIZ.LJJII(Integer.valueOf(i4), "internal_error_code");
            c474500IjALIZ.LJJII(str15, "fail_from");
            c474500IjALIZ.LJJII(str16, "fail_reason");
            c474500IjALIZ.LJJII(str9, "request_page");
            c474500IjALIZ.LJJII(str14, "charge_reason");
            c474500IjALIZ.LJJII(str5, "click_area");
            if (str13 != null) {
                i6 = 1;
            } else {
                i6 = 0;
            }
            c474500IjALIZ.LJJII(Integer.valueOf(i6), "has_push_opt_in_guide");
            c474500IjALIZ.LJJII(str13, "push_type");
            c474500IjALIZ.LJJII(LJIIL(null), "strategy_task_type");
            c474500IjALIZ.LIZ();
        } else if (Intrinsics.LJFF(bool3, Boolean.FALSE)) {
            str15 = str15;
            str16 = str16;
            str14 = str14;
            LJIILLIIL(i, i2, i3, str15, str16, str14);
        }
        Pair[] pairArr = new Pair[12];
        pairArr[0] = new Pair("package", String.valueOf(i));
        pairArr[1] = new Pair("error_code", String.valueOf(i2));
        pairArr[2] = new Pair("detail_error_code", String.valueOf(i3));
        pairArr[3] = new Pair("error_message", str4);
        pairArr[4] = new Pair("internal_error_code", String.valueOf(i4));
        str15.toString();
        pairArr[5] = new Pair("fail_from", str15);
        str16.toString();
        pairArr[6] = new Pair("fail_reason", str16);
        pairArr[7] = new Pair("request_page", str9);
        pairArr[8] = new Pair("charge_reason", str14);
        pairArr[9] = new Pair("button_name", str5);
        if (str13 == null) {
            i7 = 0;
        }
        pairArr[10] = new Pair("has_push_opt_in_guide", String.valueOf(i7));
        pairArr[11] = new Pair("push_type", String.valueOf(str13));
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        if (str12 != null) {
            mapLJIIJ.put("retry_type", str12);
        }
        if (str11 != null) {
            mapLJIIJ.put("order_id", str11);
        }
        if (bool2 != null) {
            if (bool2.booleanValue()) {
                str10 = "1";
            } else {
                str10 = CardStruct.IStatusCode.DEFAULT;
            }
            mapLJIIJ.put("is_direct_to_web", str10);
        }
        C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_recharge_fail_hint_click");
        c474500IjALIZ2.LJIL();
        c474500IjALIZ2.LJJIIZI(mapLJIIJ);
        c474500IjALIZ2.LIZ();
    }

    public static void LJIJ(C1803800x2Y c1803800x2Y, Integer num, String str, String str2, String str3, String str4, int i, int i2, int i3, String str5, String str6, String str7, String str8, String str9, Boolean bool, int i4) {
        boolean z;
        String str10;
        int iIntValue;
        String str11 = str9;
        String str12 = str6;
        String str13 = str8;
        String str14 = str7;
        Boolean bool2 = null;
        if ((i4 & 1) != 0) {
            num = null;
        }
        if ((i4 & 2) != 0) {
            str = null;
        }
        if ((i4 & 4) != 0) {
            str2 = null;
        }
        if ((i4 & 8) != 0) {
            str3 = null;
        }
        if ((i4 & 256) != 0) {
            str5 = null;
        }
        if ((i4 & 512) != 0) {
            str12 = "unknown";
        }
        if ((i4 & 1024) != 0) {
            str14 = null;
        }
        if ((i4 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str13 = null;
        }
        if ((i4 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str11 = null;
        }
        int i5 = 0;
        if ((i4 & 8192) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i4 & 16384) == 0) {
            bool2 = bool;
        }
        c1803800x2Y.getClass();
        if (z) {
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            LJIJI(String.valueOf(str), iIntValue, i, String.valueOf(str2), String.valueOf(str3), String.valueOf(str5), str12, str14, i2, i3);
        }
        Pair[] pairArr = new Pair[12];
        pairArr[0] = new Pair("package", String.valueOf(num));
        pairArr[1] = new Pair("error_code", String.valueOf(i));
        pairArr[2] = new Pair("detail_error_code", String.valueOf(i2));
        pairArr[3] = new Pair("error_message", String.valueOf(str5));
        pairArr[4] = new Pair("internal_error_code", String.valueOf(i3));
        pairArr[5] = new Pair("fail_from", String.valueOf(str));
        pairArr[6] = new Pair("fail_reason", String.valueOf(str2));
        pairArr[7] = new Pair("request_page", str12);
        pairArr[8] = new Pair("charge_reason", String.valueOf(str3));
        pairArr[9] = new Pair("hint_type", str4);
        if (str14 != null) {
            i5 = 1;
        }
        pairArr[10] = new Pair("has_push_opt_in_guide", String.valueOf(i5));
        pairArr[11] = new Pair("push_type", String.valueOf(str14));
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        if (str13 != null) {
            mapLJIIJ.put("retry_type", str13);
        }
        if (str11 != null) {
            mapLJIIJ.put("order_id", str11);
        }
        if (bool2 != null) {
            if (bool2.booleanValue()) {
                str10 = "1";
            } else {
                str10 = CardStruct.IStatusCode.DEFAULT;
            }
            mapLJIIJ.put("is_direct_to_web", str10);
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_recharge_fail_hint_show");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIZI(mapLJIIJ);
        c474500IjALIZ.LIZ();
    }

    public static void LJJIL(C1803830x2b c1803830x2b, int i, String str, String str2, String str3, int i2, boolean z, DataChannel dataChannel, Map map, Integer num, String str4, boolean z2, Map map2, Map map3, boolean z3, int i3) {
        Object obj;
        String str5;
        String str6;
        String billingCountryCode;
        String str7 = str4;
        Pair[] pairArr = new Pair[18];
        boolean zLJFF = false;
        pairArr[0] = new Pair("gift_send_type", str);
        pairArr[1] = new Pair("request_page", str2);
        pairArr[2] = new Pair("charge_reason", str3);
        pairArr[3] = new Pair("charge_style", "window");
        pairArr[4] = new Pair("is_first_recharge", LJIILJJIL());
        pairArr[5] = new Pair("is_first_cash_recharge", LJIILIIL());
        pairArr[6] = new Pair("strategy_task_type", LJIIL(Integer.valueOf(c1803830x2b.LJ)));
        pairArr[7] = new Pair("recharge_package", String.valueOf(i));
        if (dataChannel != null) {
            zLJFF = Intrinsics.LJFF(dataChannel.gg0(UserIsAnchorChannel.class), Boolean.TRUE);
        }
        String str8 = "1";
        if (zLJFF) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[8] = new Pair("is_anchor", obj);
        pairArr[9] = new Pair("notification_type", LJIIJ(c1803830x2b.LJIILJJIL));
        if (c1803830x2b.LJIIJ) {
            str5 = "rec_main";
        } else {
            str5 = "normal";
        }
        pairArr[10] = new Pair("panel_type", str5);
        pairArr[11] = new Pair("call_package", String.valueOf(num));
        String str9 = "";
        if (str7 == null) {
            str7 = "";
        }
        pairArr[12] = new Pair("currency", str7);
        if (z) {
            str6 = "click";
        } else {
            str6 = "call";
        }
        pairArr[13] = new Pair("preview_type", str6);
        if (!c1803830x2b.LJIJJ) {
            str8 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[14] = new Pair("is_from_switch", str8);
        InterfaceC1791930wjP interfaceC1791930wjP = (InterfaceC1791930wjP) C1161920gLG.LIZJ(IapService.class);
        if (interfaceC1791930wjP != null && (billingCountryCode = interfaceC1791930wjP.getBillingCountryCode()) != null) {
            str9 = billingCountryCode;
        }
        pairArr[15] = new Pair("app_store_front", str9);
        pairArr[16] = new Pair("is_custom", String.valueOf(z3 ? 1 : 0));
        pairArr[17] = new Pair("is_quick_charge_on", String.valueOf(i3));
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        LJ(mapLJIIJ);
        LJFF(Integer.valueOf(i2), mapLJIIJ);
        if (map3 != null) {
            mapLJIIJ.putAll(map3);
        }
        Map mapLJII = LJII(c1803830x2b, i);
        Map mapLJIIIZ = LJIIIZ();
        Map mapLJIIIIZZ = LJIIIIZZ(c1803830x2b, z2);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_recharge_preview");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJFF(C0IXW.LIZIZ(null, dataChannel, "user_live_duration"));
        c474500IjALIZ.LJJIIZI(mapLJIIJ);
        c474500IjALIZ.LJJIIZI(mapLJII);
        c474500IjALIZ.LJJIIZI(mapLJIIIZ);
        c474500IjALIZ.LJJIIZI(mapLJIIIIZZ);
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJJIIZI(map2);
        c474500IjALIZ.LIZ();
    }

    public static void LJJIJIL(Integer num, String str, String str2, String str3, String str4, String str5, String str6, Map map, DataChannel dataChannel, String str7, int i, int i2, String str8, String str9, String str10, Integer num2, Map map2, int i3) {
        String billingCountryCode;
        Pair[] pairArr = new Pair[19];
        pairArr[0] = new Pair("pay_method", C1796440wqg.LIZ());
        pairArr[1] = new Pair("charge_reason", str2);
        pairArr[2] = new Pair("request_page", str3);
        pairArr[3] = new Pair("recharge_package", String.valueOf(num));
        pairArr[4] = new Pair("is_first_recharge", LJIILJJIL());
        pairArr[5] = new Pair("is_first_cash_recharge", LJIILIIL());
        pairArr[6] = new Pair("strategy_task_type", LJIIL(num2));
        pairArr[7] = new Pair("order_id", String.valueOf(str));
        pairArr[8] = new Pair("error_from", str7);
        pairArr[9] = new Pair("error_code", String.valueOf(i));
        pairArr[10] = new Pair("detail_error_code", String.valueOf(i2));
        pairArr[11] = new Pair("error_msg", String.valueOf(str8));
        pairArr[12] = new Pair("mapped_error_code", String.valueOf(str9));
        pairArr[13] = new Pair("mapped_error_message", String.valueOf(str10));
        pairArr[14] = new Pair("panel_type", str4);
        pairArr[15] = new Pair("is_from_switch", str5);
        pairArr[16] = new Pair("currency", str6);
        InterfaceC1791930wjP interfaceC1791930wjP = (InterfaceC1791930wjP) C1161920gLG.LIZJ(IapService.class);
        if (interfaceC1791930wjP == null || (billingCountryCode = interfaceC1791930wjP.getBillingCountryCode()) == null) {
            billingCountryCode = "";
        }
        pairArr[17] = new Pair("app_store_front", billingCountryCode);
        pairArr[18] = new Pair("is_quick_charge_on", String.valueOf(i3));
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        LJFF(num2, mapLJIIJ);
        if (map2 != null) {
            mapLJIIJ.putAll(map2);
        }
        Map mapLJIIIZ = LJIIIZ();
        mapLJIIIZ.putAll(C467820IWe.LIZIZ());
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_recharge_failed");
        c474500IjALIZ.LJJIIZI(mapLJIIJ);
        c474500IjALIZ.LJJIIZI(mapLJIIIZ);
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LIZ();
    }
}
