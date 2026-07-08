package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.api.coin.incentive.ICoinIncentiveService;
import com.bytedance.android.livesdk.dataChannel.LiveStartEnterRoomTimeStampForMatch;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.guide.model.LocalCurrencyGiftInfo;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterMockToolSwitch;
import com.bytedance.android.livesdk.livesetting.gift.GiftPanelOptimiseMetrics;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftClientForceInsertMigrateSettings;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftHeartMeAndListRequestSettings;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONObject;
import qo2.w;

/* JADX INFO: renamed from: X.0fTl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1128750fTl {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZLLL(long j, long j2) {
        if (GiftPanelOptimiseMetrics.INSTANCE.isOptimised()) {
            return;
        }
        C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_gift_panel_load_duration", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_0()));
        c474500IjALIZIZ.LJIL();
        c474500IjALIZIZ.LJIIJJI("live");
        c474500IjALIZIZ.LJIILL("click");
        c474500IjALIZIZ.LJIILJJIL("live_detail");
        c474500IjALIZIZ.LJJII(String.valueOf(j), "duration");
        c474500IjALIZIZ.LJJII(String.valueOf(j2), "view_dur");
        c474500IjALIZIZ.LIZ();
    }

    public static void LIZ(int i, String str, Map map, long j) {
        if (j > 0 && i > 0) {
            Long lValueOf = Long.valueOf(j);
            Object arrayList = ((LinkedHashMap) map).get(lValueOf);
            if (arrayList == null) {
                arrayList = new ArrayList();
                map.put(lValueOf, arrayList);
            }
            List list = (List) arrayList;
            C190500oJ c190500oJ = (C190500oJ) C13LP.LJJLIIIJL(list);
            if (c190500oJ != null && Intrinsics.LJFF(c190500oJ.LIZ, str) && c190500oJ.LIZIZ == i) {
                return;
            }
            list.add(new C190500oJ(str, i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map LIZJ(com.bytedance.android.livesdk.gift.model.GiftPage r16, java.util.LinkedList r17, java.util.List r18, java.util.List r19, java.util.List r20, boolean r21, long r22, long r24, java.util.List r26, long r27, java.util.List r29, X.C1128650fTb r30) {
        /*
            Method dump skipped, instruction units count: 967
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1128750fTl.LIZJ(com.bytedance.android.livesdk.gift.model.GiftPage, java.util.LinkedList, java.util.List, java.util.List, java.util.List, boolean, long, long, java.util.List, long, java.util.List, X.0fTb):java.util.Map");
    }

    public static Map LIZIZ(GiftPage giftPage, LinkedList linkedList, List list, List list2, List list3, boolean z, long j, long j2, List list4, long j3, List list5, long j4, boolean z2, long j5, C1128650fTb c1128650fTb) {
        boolean z3;
        Object c098200Yq;
        Gift userLevelUpgradeGift;
        int iLIZIZ;
        int i;
        InterfaceC1128210fSt interfaceC1128210fStInst;
        List<Gift> matchGameGifts;
        Gift gift;
        Gift gift2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (list != null) {
            Iterator it2 = ((ArrayList) list).iterator();
            while (it2.hasNext()) {
                long jLongValue = ((Number) it2.next()).longValue();
                LIZ(c1128650fTb.LIZ(jLongValue), "frequently_used_gift", linkedHashMap, jLongValue);
            }
        }
        if (z) {
            C1086850eOB pollGifts = GiftManager.inst().getPollGifts();
            if (pollGifts != null && (gift2 = pollGifts.LIZIZ) != null) {
                long j6 = gift2.id;
                LIZ(c1128650fTb.LIZ(j6), "poll_gift", linkedHashMap, j6);
            }
            C1086850eOB pollGifts2 = GiftManager.inst().getPollGifts();
            if (pollGifts2 != null && (gift = pollGifts2.LIZ) != null) {
                long j7 = gift.id;
                LIZ(c1128650fTb.LIZ(j7), "poll_gift", linkedHashMap, j7);
            }
        }
        long j8 = 0;
        if (j > 0 && !LiveGiftClientForceInsertMigrateSettings.INSTANCE.enableStrategyForceInsertMatchGiftOnly()) {
            LIZ(c1128650fTb.LIZ(j), "match_gift_mode", linkedHashMap, j);
        }
        C1129720fVK.LIZ.getClass();
        if (C1129720fVK.LIZ(giftPage) && (interfaceC1128210fStInst = GiftManager.inst()) != null && (matchGameGifts = interfaceC1128210fStInst.getMatchGameGifts(giftPage.pageType)) != null) {
            Iterator it3 = ((ArrayList) C13LP.LJJJJLI(matchGameGifts)).iterator();
            while (it3.hasNext()) {
                long j9 = ((Gift) it3.next()).id;
                if (j9 > j8) {
                    LIZ(c1128650fTb.LIZ(j9), "catch_beans", linkedHashMap, j9);
                    j8 = 0;
                }
            }
        }
        if (j2 > j8) {
            LIZ(c1128650fTb.LIZ(j2), "live_goal", linkedHashMap, j2);
        }
        if (list5 != null && !list5.isEmpty()) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (!z3) {
            Iterator it4 = list5.iterator();
            while (it4.hasNext()) {
                long jLongValue2 = ((Number) it4.next()).longValue();
                if (jLongValue2 > j8) {
                    LIZ(c1128650fTb.LIZ(jLongValue2), "viewer_wishes", linkedHashMap, jLongValue2);
                }
            }
        }
        if (z2 && j5 > j8 && (iLIZIZ = C01AU.LIZIZ(j5, linkedList)) >= 0) {
            int[] iArr = c1128650fTb.LIZ;
            if (iLIZIZ >= iArr.length) {
                i = -1;
            } else {
                i = iArr[iLIZIZ];
            }
            LIZ(i, "interactive_arcade", linkedHashMap, j5);
        }
        if (j4 > j8) {
            LIZ(c1128650fTb.LIZ(j4), "collaborative_gifting", linkedHashMap, j4);
        }
        if (list4 != null) {
            Iterator it5 = ((ArrayList) list4).iterator();
            while (it5.hasNext()) {
                long jLongValue3 = ((Number) it5.next()).longValue();
                LIZ(c1128650fTb.LIZ(jLongValue3), "real_time_update", linkedHashMap, jLongValue3);
            }
        }
        if (j3 > j8) {
            LIZ(c1128650fTb.LIZ(j3), "local_currency_gift", linkedHashMap, j3);
        }
        InterfaceC1133710fbl.LIZ.getClass();
        if (((C1133940fc8) C1120710fGn.LIZ()).LJIIJ()) {
            C1120710fGn.LIZ();
            Gift giftLJFF = C1133940fc8.LJFF();
            if (giftLJFF != null) {
                long j10 = giftLJFF.id;
                LIZ(c1128650fTb.LIZ(j10), "first_recharge_gift", linkedHashMap, j10);
            }
        }
        try {
            C1126800fQc.LIZ.GN();
            c098200Yq = C1121450fHz.LIZIZ(EnumC1121470fI1.GIFT_PANEL_TP.getType());
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C1134410fct c1134410fct = null;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        if (c098200Yq != null) {
            long jLIZ = C1128580fTU.LIZ();
            if (jLIZ > j8) {
                LIZ(c1128650fTb.LIZ(jLIZ), "strategy_touch_point", linkedHashMap, jLIZ);
            }
        }
        C1134410fct c1134410fctLJI = C1126800fQc.LIZ.KE0().LJI(106);
        if (c1134410fctLJI != null) {
            if (c1134410fctLJI.LJIIJJI()) {
                c1134410fct = c1134410fctLJI;
            }
            if (c1134410fct != null) {
                LIZ(c1128650fTb.LIZ(6890L), "strategy_first_cash_consumption", linkedHashMap, 6890L);
            }
        }
        if (list3 != null && list2 != null) {
            Iterator it6 = ((ArrayList) list2).iterator();
            while (it6.hasNext()) {
                long jLongValue4 = ((Number) it6.next()).longValue();
                int iLIZ = c1128650fTb.LIZ(jLongValue4);
                if (((ArrayList) list3).contains(Long.valueOf(jLongValue4))) {
                    LIZ(iLIZ, "backfill", linkedHashMap, jLongValue4);
                } else {
                    LIZ(iLIZ, "user_pin", linkedHashMap, jLongValue4);
                }
            }
        }
        if (!LiveGiftClientForceInsertMigrateSettings.INSTANCE.enableStrategyForceInsertLevelUpGame() && (userLevelUpgradeGift = GiftManager.inst().getUserLevelUpgradeGift()) != null) {
            long j11 = userLevelUpgradeGift.id;
            LIZ(c1128650fTb.LIZ(j11), "level_up_gameplay", linkedHashMap, j11);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C2097908Jt.LIZIZ(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), C13LP.LLIIII((Iterable) entry.getValue()));
        }
        return linkedHashMap2;
    }

    public static final void LJ(DataChannel dataChannel, String str, String str2, boolean z, String str3, String str4, List<Long> list, List<Long> list2, List<Long> list3, Map<Long, C1130160fW2> map, int i, String str5, Integer num, long j, boolean z2) {
        String strLIZ;
        String str6;
        String str7;
        Long lValueOf;
        String str8;
        String str9;
        boolean z3;
        Object obj;
        int i2;
        String string;
        Object obj2;
        int size;
        int i3;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Room room;
        List<AbstractC1126600fQI<? extends AnonymousClass0054>> currentGiftPanelList;
        Object obj10;
        String str10;
        LiveMode streamType;
        List<Long> list4 = list;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        dataChannelGlobal.gg0(C1148430fzV.class);
        Room room2 = (Room) dataChannelGlobal.gg0(C930940aKi.class);
        Integer numValueOf = null;
        if (room2 != null && (streamType = room2.getStreamType()) != null) {
            strLIZ = C354201Zc.LIZ(streamType);
        } else {
            strLIZ = null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        if (map != null) {
            for (Map.Entry<Long, C1130160fW2> entry : map.entrySet()) {
                arrayList.add(entry.getKey());
                arrayList2.add(Long.valueOf(entry.getValue().LIZ));
                arrayList3.add(entry.getValue().LIZIZ);
                arrayList4.add(Integer.valueOf(entry.getValue().LIZJ));
                arrayList5.add(Integer.valueOf(entry.getValue().LIZLLL));
                arrayList6.add(entry.getValue().LJ);
            }
        }
        String str11 = "";
        if (!C1129510fUz.LIZ(dataChannel, null, null)) {
            str6 = "";
        } else {
            str6 = "no2_booster";
        }
        C1128760fTm c1128760fTm = C1128760fTm.LJIIJ;
        IInteractService iInteractService = C1128450fTH.LIZ;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gift_panel_show");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIZI(C155200ic.LIZ(dataChannel));
        c474500IjALIZ.LJFF(C0IXW.LIZJ("user_live_duration"));
        c474500IjALIZ.LJJII(C1128460fTI.LJIIJ(num, ""), "tab_name");
        c474500IjALIZ.LJJII(Integer.valueOf(GiftManager.inst().getTabLocation(C1130100fVw.LIZ.LJFF, true)), "tab_location");
        if (str2 == null) {
            str7 = "icon";
        } else {
            str7 = str2;
        }
        c474500IjALIZ.LJJII(str7, "gift_enter_from");
        c474500IjALIZ.LJJII(str6, "effecting_card_banner_type");
        C1128460fTI.LIZJ(c474500IjALIZ);
        long jLongValue = 0;
        C1AI0.LIZJ(c474500IjALIZ, false, 0L, null, 7);
        Long lValueOf2 = Long.valueOf(j);
        if (lValueOf2 != null) {
            jLongValue = lValueOf2.longValue();
        }
        c474500IjALIZ.LJJII(Integer.valueOf(C1125760fOw.LIZJ(null, jLongValue, dataChannel, "appendBeaconBubbleParams")), "beacon_bubble_type");
        c474500IjALIZ.LJJII(str5, "top_area_type");
        w.LIZ.getClass();
        if (!C2093608Ic.LJ(w.LJIIJJI())) {
            c474500IjALIZ.LJJII(w.LJIIJJI(), "enter_url_source");
        }
        if (w.LJIIJ() != 0) {
            c474500IjALIZ.LJJII(String.valueOf(w.LJIIJ()), "enter_gift_id");
        }
        c474500IjALIZ.LJJII(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).No2(), "multi_tool");
        c474500IjALIZ.LJJII(C1128450fTH.LJIJI(UserService.getInstance().user().LJIJJLI()), "user_type");
        c474500IjALIZ.LJJIIZI(C1128450fTH.LJIIL());
        if (Intrinsics.LJFF(C1128450fTH.LIZLLL(), "manual_pk")) {
            if (C1128450fTH.LJIL()) {
                c474500IjALIZ.LJJII("pk_phase", "match_status");
            } else {
                c474500IjALIZ.LJJII(LiveCenterMockToolSwitch.PUNISH, "match_status");
            }
            c474500IjALIZ.LJJIIZI(C1128450fTH.LJIIL());
        }
        C1125800fP0.LIZ(c474500IjALIZ);
        for (Map.Entry<String, String> entry2 : ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).ho0().entrySet()) {
            c474500IjALIZ.LJJII(entry2.getValue(), entry2.getKey());
        }
        User userLIZJ = C1125800fP0.LIZJ();
        if (userLIZJ != null) {
            lValueOf = Long.valueOf(userLIZJ.getId());
        } else {
            lValueOf = null;
        }
        C1128450fTH.LIZ(c474500IjALIZ, lValueOf);
        C1128460fTI.LIZ(c474500IjALIZ, null);
        c474500IjALIZ.LJJII(C1128450fTH.LJIIIZ().getDesc(), "send_gift_scene");
        if (!u.LJIJI(str2, "gift_guide_bubble", false)) {
            str8 = "";
        } else {
            str8 = str2;
        }
        c474500IjALIZ.LJJII(str8, "notification_type");
        if (u.LJIJI(str2, "gift_guide_bubble", false)) {
            str11 = C1123590fLR.LIZIZ;
        }
        c474500IjALIZ.LJJII(str11, "notification_request_id");
        if (z) {
            str9 = "portrait";
        } else {
            str9 = "landscape";
        }
        c474500IjALIZ.LJJII(str9, "room_orientation");
        c474500IjALIZ.LJJII(str3, "hashtag_type");
        c474500IjALIZ.LJJII(str4, "hashtag_id");
        Room room3 = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room3 != null && room3.getOwnerUserId() == UserService.getInstance().user().getCurrentUserId()) {
            z3 = true;
        } else {
            z3 = false;
        }
        String str12 = "1";
        if (z3) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(obj, "is_anchor");
        c474500IjALIZ.LJJII(str, "request_panel_id");
        C1129310fUf.LIZ.getClass();
        c474500IjALIZ.LJJII(C1129310fUf.LIZIZ, "gift_dialog_request_id");
        c474500IjALIZ.LJJII(Long.valueOf(C158B.LIZ()), "timestamp");
        if (list4 != null && !((ArrayList) list4).isEmpty() && ((ArrayList) list4).size() > 1) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(i2), "is_frequently_used_area_show");
        if (list4 != null) {
            string = list4.toString();
        } else {
            string = null;
        }
        c474500IjALIZ.LJJII(string, "frequently_used_gift_id_set");
        if (list4 != null) {
            numValueOf = Integer.valueOf(((ArrayList) list4).size());
        }
        c474500IjALIZ.LJJII(numValueOf, "frequently_used_gift_cnt");
        if (!list2.isEmpty()) {
            list4 = list2;
        } else if (list4 == null) {
            list4 = C13BV.INSTANCE;
        }
        c474500IjALIZ.LJJII(list4, "featured_gift_id_set");
        ArrayList arrayList7 = new ArrayList(C15438062q.LJIJJ(list2, 10));
        Iterator<Long> it2 = list2.iterator();
        while (it2.hasNext()) {
            if (list3.contains(Long.valueOf(it2.next().longValue()))) {
                str10 = "autofill";
            } else {
                str10 = "manual_selection";
            }
            arrayList7.add(str10);
        }
        c474500IjALIZ.LJJII(arrayList7, "featured_gift_type_set");
        w.LIZ.getClass();
        if (Intrinsics.LJFF(w.LJIIL(), "portal")) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(obj2, "is_portal_user");
        c474500IjALIZ.LJJII(arrayList.toString(), "force_insert_gift_id_set");
        c474500IjALIZ.LJJII(arrayList2.toString(), "force_insert_priority");
        c474500IjALIZ.LJJII(arrayList3.toString(), "force_insert_from");
        c474500IjALIZ.LJJII(arrayList4.toString(), "force_insert_gift_position");
        c474500IjALIZ.LJJII(arrayList5.toString(), "force_insert_configure_position");
        c474500IjALIZ.LJJII(arrayList6.toString(), "force_insert_gift_country");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "gift_cnt");
        if (map != null) {
            size = map.size();
        } else {
            size = 0;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(size), "force_insert_gift_cnt");
        C1128970fU7 c1128970fU7 = C1130100fVw.LIZ;
        c474500IjALIZ.LJJIIZI(c1128970fU7.LJIIJJI);
        c474500IjALIZ.LJJII(0, "is_leaderboard");
        c474500IjALIZ.LJJII(Integer.valueOf(EnumC993800by6.NO_IN_RANK.getValue()), "leaderboard_user_rank");
        c474500IjALIZ.LJJII(strLIZ, "live_type");
        c474500IjALIZ.LJJII(c1128970fU7.LIZ, "guide_from");
        if (LiveGiftHeartMeAndListRequestSettings.INSTANCE.enableReorderHeartMe()) {
            if (z2) {
                obj10 = "1";
            } else {
                obj10 = CardStruct.IStatusCode.DEFAULT;
            }
            c474500IjALIZ.LJJII(obj10, "can_send_heartme");
        }
        IInteractService iInteractService2 = C1128450fTH.LIZ;
        if (C1128450fTH.LJII((Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class)) >= 1) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(i3), "is_guest_connection");
        InterfaceC1133710fbl.LIZ.getClass();
        C1120710fGn.LIZ();
        if (C1133940fc8.LJIIJJI()) {
            obj3 = "1";
        } else {
            obj3 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(obj3, "is_first_recharge");
        if (C1131560fYI.LIZIZ() > 0) {
            obj4 = "1";
        } else {
            obj4 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(obj4, "has_coin");
        if (C1131560fYI.LIZ()) {
            obj5 = "1";
        } else {
            obj5 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(obj5, "can_exchange");
        if (C1128450fTH.LJIJJLI()) {
            obj6 = "1";
        } else {
            obj6 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(obj6, "is_match_item");
        if (C1128450fTH.LJJIFFI()) {
            obj7 = "1";
        } else {
            obj7 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(obj7, "is_match_item_user");
        c474500IjALIZ.LJJII(Long.valueOf(C1128450fTH.LIZJ()), "pk_id");
        if (C1128450fTH.LIZ.b70().size() > 2) {
            obj8 = "1";
        } else {
            obj8 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(obj8, "is_multi");
        c474500IjALIZ.LJJII(C1128450fTH.LJIIZILJ(), "sub_match_type");
        IGiftService iGiftService = (IGiftService) C1161920gLG.LIZJ(IGiftService.class);
        if (iGiftService != null && (currentGiftPanelList = iGiftService.getCurrentGiftPanelList()) != null && !currentGiftPanelList.isEmpty()) {
            for (AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI : currentGiftPanelList) {
                if (abstractC1126600fQI != null && abstractC1126600fQI.LIZ == 17) {
                    obj9 = "1";
                    break;
                }
            }
            obj9 = CardStruct.IStatusCode.DEFAULT;
        } else {
            obj9 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(obj9, "has_points_gift");
        c474500IjALIZ.LJJII(C1128450fTH.LJIJ(), "team_member_cnts");
        ICoinIncentiveService iCoinIncentiveServiceLIZ = C1124730fNH.LIZ();
        if (iCoinIncentiveServiceLIZ != null) {
            iCoinIncentiveServiceLIZ.WC1();
        }
        c474500IjALIZ.LJJIIZI(null);
        LocalCurrencyGiftInfo localCurrencyGiftInfoLIZIZ = C1127580fRs.LIZIZ();
        if (localCurrencyGiftInfoLIZIZ == null || localCurrencyGiftInfoLIZIZ.giftId <= 0) {
            str12 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(str12, "is_display_local_currency");
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            c474500IjALIZ.LJJIIZI(room.getMultiStreamLogParams());
        }
        C498410Jgd.LIZ(c474500IjALIZ, dataChannel);
        JSONObject jSONObject = new JSONObject();
        C1128450fTH.LIZ.zx0(jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            jSONObject2.put(next, jSONObject.opt(next));
        }
        if (C1128450fTH.LIZ.vp0()) {
            c474500IjALIZ.LJJII(jSONObject2, "strategy_match_data");
        }
        Long l = (Long) DataChannelGlobal.LLILZ.gg0(LiveStartEnterRoomTimeStampForMatch.class);
        if (l != null) {
            long jLongValue2 = l.longValue();
            if (jLongValue2 > 0) {
                c474500IjALIZ.LJJII(Long.valueOf((C158B.LIZ() - jLongValue2) / 1000), "watch_live_seconds");
            }
        }
        C1128460fTI.LIZLLL(c474500IjALIZ);
        c474500IjALIZ.LIZ();
    }
}
