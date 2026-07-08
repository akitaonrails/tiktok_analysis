package X;

import android.os.SystemClock;
import com.bytedance.android.live.gift.GiftGalleryExtra;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftSendGiftToUserCheckSettings;
import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletGiftingOptimizationSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0fXb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1131130fXb {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(int i, String str) {
        if (C1132320fZW.LIZ(str)) {
            return "creator_task_page";
        }
        if (C1131530fYF.LJ(str)) {
            return "live_ug_task";
        }
        if (i != 97) {
            if (i != 112) {
                return "";
            }
            return "room_gift_manual_send_directly";
        }
        return "room_gift_auto";
    }

    public static int LIZIZ(String str, String str2) {
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -61883557) {
                if (iHashCode != 967896495) {
                    if (iHashCode == 1868627474 && str.equals("fans_club_consume_task")) {
                        return 1;
                    }
                } else if (str.equals("fans_club_task")) {
                    return 1;
                }
            } else if (str.equals("fans_club_gift_month")) {
                return 1;
            }
        }
        if (str2 != null) {
            int iHashCode2 = str2.hashCode();
            if (iHashCode2 != -61883557) {
                if (iHashCode2 != 967896495) {
                    if (iHashCode2 != 1868627474 || !str2.equals("fans_club_consume_task")) {
                        return 0;
                    }
                    return 1;
                }
                if (!str2.equals("fans_club_task")) {
                    return 0;
                }
                return 1;
            }
            if (!str2.equals("fans_club_gift_month")) {
                return 0;
            }
            return 1;
        }
        return 0;
    }

    public static void LJI(EnumC1131680fYU enumC1131680fYU, InterfaceC1131100fXY interfaceC1131100fXY) {
        Long lValueOf;
        Object value;
        String strName;
        EnumC1129230fUX enumC1129230fUX;
        EnumC1125400fOM enumC1125400fOM;
        Long lValueOf2 = Long.valueOf(interfaceC1131100fXY.getGiftId());
        C1132880faQ c1132880faQLIZJ = interfaceC1131100fXY.LIZJ();
        if (c1132880faQLIZJ != null) {
            lValueOf = Long.valueOf(c1132880faQLIZJ.LIZ);
        } else {
            lValueOf = null;
        }
        Integer numValueOf = Integer.valueOf(interfaceC1131100fXY.getCount());
        long jLJJLIIIJ = interfaceC1131100fXY.LJJLIIIJ();
        C1126150fPZ c1126150fPZLJJJJZ = interfaceC1131100fXY.LJJJJZ();
        String source = interfaceC1131100fXY.getSource();
        long jUptimeMillis = SystemClock.uptimeMillis();
        long jLIZ = C158B.LIZ();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject.put("stage", enumC1131680fYU.getCode());
        jSONObject.put("gift_id", lValueOf2);
        jSONObject.put("to_user_id", lValueOf);
        jSONObject.put("from_user_id", UserService.getInstance().user().getCurrentUserId());
        jSONObject.put("gift_count", numValueOf);
        if (source == null) {
            source = "icon";
        }
        jSONObject.put("gift_enter_from", source);
        jSONObject2.put("duration", jUptimeMillis - jLJJLIIIJ);
        jSONObject2.put("client_time", jUptimeMillis);
        jSONObject2.put("server_time", jLIZ);
        jSONObject2.put("task_id", (Object) 0L);
        if (c1126150fPZLJJJJZ == null || (enumC1125400fOM = c1126150fPZLJJJJZ.LIZIZ) == null || (value = enumC1125400fOM.getValue()) == null) {
            value = EnumC1125400fOM.ANCHOR;
        }
        jSONObject2.put("to_user_type", value);
        if (c1126150fPZLJJJJZ == null || (enumC1129230fUX = c1126150fPZLJJJJZ.LIZ) == null || (strName = enumC1129230fUX.name()) == null) {
            strName = "";
        }
        jSONObject2.put("send_scenario", strName);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("send_gift_stage");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIJZLJL(jSONObject);
        c474500IjALIZ.LJJIIJZLJL(jSONObject2);
        c474500IjALIZ.LIZ();
        C1CC2.LJ("send_gift_stage", jSONObject, new JSONObject(), jSONObject2);
    }

    public static void LJ(InterfaceC1131100fXY interfaceC1131100fXY, Integer num, String str, long j) {
        GiftGalleryExtra giftExtraForClient;
        if (interfaceC1131100fXY != null && (giftExtraForClient = interfaceC1131100fXY.getGiftExtraForClient()) != null && giftExtraForClient.isGalleryGift) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("live_gallery_send_status");
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LJJII(num, "error_code");
            c474500IjALIZ.LJJII(str, "request_id");
            c474500IjALIZ.LJJII(Long.valueOf(j), "duration");
            c474500IjALIZ.LIZ();
        }
    }

    public static void LJFF(Long l, Long l2, Integer num, String str, String str2, int i, boolean z) throws JSONException {
        String str3;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject.put("gift_id", l);
        jSONObject.put("to_user_id", l2);
        jSONObject.put("from_user_id", UserService.getInstance().user().getCurrentUserId());
        jSONObject.put("repeat_count", num);
        jSONObject2.put("send_gift_request_id", str);
        jSONObject2.put("error_code", str2);
        jSONObject2.put("retry_count", i);
        if (z) {
            str3 = "send_gift_retry_success";
        } else {
            str3 = "send_gift_retry_final_fail";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str3);
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIJZLJL(jSONObject);
        c474500IjALIZ.LJJIIJZLJL(jSONObject2);
        c474500IjALIZ.LIZ();
        C1CC2.LJ(str3, jSONObject, new JSONObject(), jSONObject2);
    }

    public static void LIZJ(long j, String str, long j2, Long l, Long l2, Integer num, Long l3, String str2) {
        Object obj;
        long jLIZ = C158B.LIZ();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("self_gift_msg_sent");
        c474500IjALIZ.LJIL();
        Map map = (Map) DataChannelGlobal.LLILZ.gg0(C1148040fys.class);
        if (map == null || (obj = map.get("anchor_id")) == null) {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(obj, "anchor_id");
        c474500IjALIZ.LJJII(Long.valueOf(j2), "send_request_ms");
        c474500IjALIZ.LJJII(Long.valueOf(jLIZ), "response_receive_ms");
        c474500IjALIZ.LJJII(Long.valueOf(jLIZ - j2), "duration");
        c474500IjALIZ.LJJII(Long.valueOf(C158B.LIZ() - j), "send_click_duration");
        c474500IjALIZ.LJJII(l, "gift_id");
        c474500IjALIZ.LJJII(l2, "to_user_id");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "from_user_id");
        c474500IjALIZ.LJJII(num, "repeat_count");
        c474500IjALIZ.LJJII(l3, "msg_id");
        c474500IjALIZ.LJJII(str2, "log_id");
        c474500IjALIZ.LJJIIZI(C2203708kF.LIZ(str));
        c474500IjALIZ.LIZ();
    }

    public static void LIZLLL(Long l, Long l2, Long l3, Long l4, EnumC1125400fOM enumC1125400fOM, String str, String str2, boolean z, String str3, String str4) throws JSONException {
        String value;
        Long lValueOf;
        Room room;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject.put("gift_id", l);
        jSONObject.put("gift_enter_from", str);
        jSONObject.put("send_gift_scene", C1128450fTH.LJIILLIIL());
        jSONObject.put("fail_reason", str2);
        jSONObject2.put("room_id", l2);
        jSONObject2.put("anchor_id", l3);
        jSONObject2.put("to_user_id", l4);
        Long l5 = null;
        if (enumC1125400fOM != null) {
            value = enumC1125400fOM.getValue();
        } else {
            value = null;
        }
        jSONObject2.put("to_user_type", value);
        jSONObject2.put("checking_to_user_id", str3);
        jSONObject2.put("checking_anchor_id", str4);
        LiveGiftSendGiftToUserCheckSettings liveGiftSendGiftToUserCheckSettings = LiveGiftSendGiftToUserCheckSettings.INSTANCE;
        jSONObject2.put("is_open_fix_normal_link", liveGiftSendGiftToUserCheckSettings.blockForNormalLink());
        jSONObject2.put("is_open_fix_guest_link_host", liveGiftSendGiftToUserCheckSettings.blockForGuestLinkHost());
        jSONObject2.put("is_open_fix_guest_link_guest", liveGiftSendGiftToUserCheckSettings.blockForGuestLinkGuest());
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        C0IR5 c0ir5 = (C0IR5) dataChannelGlobal.gg0(C1148310fzJ.class);
        if (c0ir5 != null && (room = c0ir5.LIZIZ) != null) {
            lValueOf = Long.valueOf(room.getId());
        } else {
            lValueOf = null;
        }
        jSONObject2.put("global_room_id", lValueOf);
        C0IR5 c0ir52 = (C0IR5) dataChannelGlobal.gg0(C1148310fzJ.class);
        if (c0ir52 != null) {
            l5 = c0ir52.LIZLLL;
        }
        jSONObject2.put("global_anchor_id", l5);
        jSONObject2.put("is_guest_panel_open", z ? 1 : 0);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("send_to_wrong_user");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIJZLJL(jSONObject);
        c474500IjALIZ.LJJIIJZLJL(jSONObject2);
        c474500IjALIZ.LIZ();
        C1CC2.LJ("send_to_wrong_user", jSONObject, new JSONObject(), jSONObject2);
    }

    public static void LJII(long j, String str, long j2, String str2, String str3, Long l, Integer num, Long l2, Integer num2, Long l3, String str4, long j3, String str5, String str6, DataChannel dataChannel, int i, String str7, long j4, String str8, Long l4, int i2, Map map, int i3, int i4, boolean z) throws JSONException {
        long jLongValue;
        Object obj;
        Object objValueOf;
        Object obj2;
        int platform;
        int i5;
        Object obj3;
        long jLIZ = C158B.LIZ();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("log_id", str4);
        jSONObject3.put("send_scenario", str5);
        jSONObject3.put("gift_enter_from", str7);
        jSONObject3.put("send_to_user_type", str6);
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        C1130490fWZ c1130490fWZ = (C1130490fWZ) dataChannelGlobal.gg0(C1148340fzM.class);
        if (c1130490fWZ != null && (obj3 = c1130490fWZ.LIZIZ) != null) {
            jSONObject3.put("strategy_task_detail", obj3);
        }
        String strLJIIL = ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).getOverloadScoreRetriever().LJIIL();
        if (C500260Jjc.LJJIIZ(strLJIIL)) {
            jSONObject3.put("revenue_unified_overload_score", strLJIIL);
        }
        C1135800ff8.LJIILJJIL(jSONObject, jSONObject3, C158B.LIZ(), System.currentTimeMillis());
        InterfaceC1128210fSt interfaceC1128210fStInst = GiftManager.inst();
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        Gift giftFindGiftById = interfaceC1128210fStInst.findGiftById(jLongValue);
        if (giftFindGiftById != null) {
            C1135800ff8.LJ(giftFindGiftById, 0L, jSONObject, jSONObject3);
        }
        jSONObject.put("is_interactive_gift", i2);
        C1135800ff8.LJJIIZI(jSONObject, jSONObject2, giftFindGiftById);
        if (dataChannel != null) {
            Room room = (Room) dataChannel.gg0(RoomChannel.class);
            if (room != null) {
                platform = room.getPlatform();
            } else {
                platform = 0;
            }
            jSONObject.put("anchor_client_version", C1135800ff8.LJJI(dataChannel));
            jSONObject.put("anchor_os_type", platform);
            if (platform == 0) {
                i5 = 1;
            } else {
                i5 = 0;
            }
            jSONObject.put("disable_gift_tracking", i5);
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("send_gift_response");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIJZLJL(jSONObject);
        c474500IjALIZ.LJJIIJZLJL(jSONObject3);
        c474500IjALIZ.LJJIIJZLJL(jSONObject2);
        c474500IjALIZ.LJJIJ(map);
        Map map2 = (Map) dataChannelGlobal.gg0(C1148040fys.class);
        if (map2 == null || (obj = map2.get("anchor_id")) == null) {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(obj, "anchor_id");
        c474500IjALIZ.LJJII(Long.valueOf(j2), "send_request_ms");
        c474500IjALIZ.LJJII(Long.valueOf(jLIZ), "response_receive_ms");
        c474500IjALIZ.LJJII(Long.valueOf(jLIZ - j2), "duration");
        c474500IjALIZ.LJJII(str2, "status_code");
        c474500IjALIZ.LJJII(str3, "status_msg");
        c474500IjALIZ.LJJII(Long.valueOf(C158B.LIZ() - j), "send_click_duration");
        c474500IjALIZ.LJJII(l, "gift_id");
        c474500IjALIZ.LJJII(num, "gift_type");
        c474500IjALIZ.LJJII(l2, "to_user_id");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "from_user_id");
        c474500IjALIZ.LJJII(num2, "repeat_count");
        c474500IjALIZ.LJJII(l3, "msg_id");
        c474500IjALIZ.LJJII(Long.valueOf(j3 - j2), "api_time");
        c474500IjALIZ.LJJII(Long.valueOf(jLIZ - j3), "response_process_time");
        c474500IjALIZ.LJJIIZI(C2203708kF.LIZ(str));
        c474500IjALIZ.LJJII(Integer.valueOf(i), "msg_count");
        InterfaceC1133710fbl.LIZ.getClass();
        C1120710fGn.LIZ();
        c474500IjALIZ.LJJII(Integer.valueOf(C1133940fc8.LJIIJJI() ? 1 : 0), "is_first_recharge");
        c474500IjALIZ.LJJII(Long.valueOf(j4), "fans_club_level");
        if (l4 != null) {
            objValueOf = Long.valueOf(l4.longValue() | 0);
        } else {
            objValueOf = null;
        }
        c474500IjALIZ.LJJII(objValueOf, "fans_club_level_returned");
        c474500IjALIZ.LJJII(str8, "fans_status");
        c474500IjALIZ.LJJII(str7, "fans_enter_from");
        if (i3 != 1) {
            if (i3 != 2) {
                obj2 = "";
            } else {
                obj2 = "anchor_income";
            }
        } else {
            obj2 = "ug_exchange";
        }
        c474500IjALIZ.LJJII(obj2, "exchange_type");
        c474500IjALIZ.LJJII(LIZ(i4, str7), "exchange_scenario");
        if (LiveWalletGiftingOptimizationSetting.INSTANCE.getValue()) {
            jSONObject.put("is_balance_ready", C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0);
            c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0), "is_balance_ready");
        }
        c474500IjALIZ.LIZ();
        if (l != null && l.longValue() == 7934) {
            C0KU0.LIZIZ = System.currentTimeMillis();
            C0KU0.LIZ();
        }
        C1CC2.LJ("send_gift_response", jSONObject, jSONObject2, jSONObject3);
        if (num != null && num.intValue() == 2) {
            LinkedList<AbstractC1143340frI> linkedList = C1143330frH.LIZ;
            C1143330frH.LIZ(new C1143470frV(i));
        }
        LinkedList<AbstractC1143340frI> linkedList2 = C1143330frH.LIZ;
        C1143330frH.LIZ(new C1143500frY(i));
    }
}
