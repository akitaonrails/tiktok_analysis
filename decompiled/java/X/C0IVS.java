package X;

import Y.ARunnableS40S0300000_7;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkRemoveLiveShowFromLiveCellOptSetting;
import com.bytedance.android.livesdk.model.AdLiveEnterRoomConfig;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserApplySettings;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserSettings;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import qo2.w;

/* JADX INFO: renamed from: X.0IVS, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IVS {
    public boolean LIZ = true;

    public static void LIZ(EnterRoomConfig enterRoomConfig) {
        EnterRoomConfig enterRoomConfig2 = C0IL2.LIZ.LIZ().mEnterRoomConfig;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        if (dataChannelGlobal.gg0(C1148430fzV.class) == null) {
            C0IVU c0ivu = new C0IVU();
            c0ivu.LIZ = enterRoomConfig2.mRoomsData.enterMethod;
            EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
            c0ivu.LIZIZ = roomsData.enterFromMerge;
            c0ivu.LIZJ = roomsData.shareIntent;
            EnterRoomConfig.LogData logData = enterRoomConfig.mLogData;
            c0ivu.LJ = logData.gdLabel;
            long j = logData.enterRoomId;
            if (j != 0) {
                c0ivu.LIZLLL = Long.valueOf(j);
            }
            c0ivu.LJIJI = C467800IWc.LJIJ.LIZJ();
            c0ivu.LJIJJ = enterRoomConfig.mRoomsData.openLiveFromDrawerTab;
            EnterRoomConfig.LogData logData2 = enterRoomConfig.mLogData;
            c0ivu.LJIJJLI = logData2.topLeftRoomLabel;
            c0ivu.LJJ = logData2.fromEnd;
            c0ivu.LJJI = logData2.endSourceEnterFromMerge;
            c0ivu.LJJIFFI = logData2.endSourceEnterMethod;
            c0ivu.LJJII = logData2.endSourceActionType;
            c0ivu.LJJIII = logData2.endViewStatus;
            c0ivu.LJJIIJ = logData2.liveEndExit;
            c0ivu.LJI = logData2.list_item_id;
            c0ivu.LJII = Boolean.valueOf(logData2.isVideoHead);
            c0ivu.LJJJI = Integer.valueOf(enterRoomConfig.mLogData.isFromList);
            c0ivu.LJJJIL = Long.valueOf(enterRoomConfig.mLogData.topliveCacheDataDuration);
            EnterRoomConfig.LogData logData3 = enterRoomConfig.mLogData;
            c0ivu.LJJJJ = logData3.liveRecommendReason;
            c0ivu.LJFF = enterRoomConfig.mRoomsData.actionType;
            c0ivu.LJIIIIZZ = logData3.requestId;
            c0ivu.LJIIJ = logData3.testRequestId;
            c0ivu.LJIIIZ = enterRoomConfig.mSearchData.uid;
            c0ivu.LJIIJJI = logData3.sharePlatform;
            c0ivu.LJIIL = logData3.shareFromUserId;
            c0ivu.LJIILIIL = logData3.isDirectOpenApp;
            c0ivu.LJIILJJIL = logData3.webId;
            long j2 = enterRoomConfig2.mRoomsData.smallPictureOrder;
            if (j2 != -1) {
                c0ivu.LJIILL = Long.valueOf(j2);
            }
            EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.mRoomsData;
            EnterRoomConfig.GuestUser guestUser = roomsData2.guestUser;
            boolean z = true;
            if (guestUser.isGuestEnter == 1) {
                c0ivu.LJIILLIIL = "1";
            } else {
                c0ivu.LJIILLIIL = CardStruct.IStatusCode.DEFAULT;
            }
            c0ivu.LJIIZILJ = guestUser.guestCnt;
            EnterRoomConfig.LogData logData4 = enterRoomConfig.mLogData;
            c0ivu.LJJIIJZLJL = logData4.recContentId;
            c0ivu.LJJIIZ = logData4.recContentType;
            c0ivu.LJJIIZI = Long.valueOf(roomsData2.firstLabelId);
            c0ivu.LJJIJ = Long.valueOf(enterRoomConfig.mRoomsData.secondLabelId);
            EnterRoomConfig.RoomsData roomsData3 = enterRoomConfig.mRoomsData;
            c0ivu.LJJIJIIJI = roomsData3.allSecondLabel;
            c0ivu.LJJIJIIJIL = Long.valueOf(roomsData3.bottomLabelId);
            c0ivu.LJJIJIL = Long.valueOf(enterRoomConfig.mRoomsData.bottomSubLabelId);
            EnterRoomConfig.RoomsData roomsData4 = enterRoomConfig.mRoomsData;
            c0ivu.LJJIJLIJ = roomsData4.isFromBubble;
            c0ivu.LJJIL = roomsData4.isFromCache;
            c0ivu.LJJIZ = roomsData4.anchorGiftId;
            EnterRoomConfig.LogData logData5 = enterRoomConfig.mLogData;
            c0ivu.LJJJ = logData5.enterGiftPanelSource;
            c0ivu.LJJJJZI = logData5.chatId;
            c0ivu.LJJJLIIL = logData5.chatType;
            c0ivu.LJJJZ = logData5.chatMessageFromUid;
            c0ivu.LJJL = logData5.chatMessageGuestInviteType;
            c0ivu.LJJLI = logData5.chatGroupOwnerUid;
            c0ivu.LJJLIIIIJ = logData5.chatGroupUserNum;
            HashMap map = new HashMap();
            Map<String, String> map2 = enterRoomConfig.mLogData.logMap;
            if (map2 != null) {
                map.putAll(map2);
            }
            EnterRoomConfig.LogData logData6 = enterRoomConfig.mLogData;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Integer num = logData6.balanceLiveLine;
            if (num != null) {
                linkedHashMap.put("balance_live_line", String.valueOf(num.intValue()));
            }
            Integer num2 = logData6.balanceLivePosition;
            if (num2 != null) {
                linkedHashMap.put("balance_live_position", String.valueOf(num2.intValue()));
            }
            linkedHashMap.put("follow_status", String.valueOf(logData6.follow_status));
            linkedHashMap.put("inner_push_type", String.valueOf(logData6.innerPushType));
            linkedHashMap.put("isFromList", String.valueOf(logData6.isFromList));
            Integer num3 = logData6.isConsumeNewUser;
            if (num3 != null) {
                linkedHashMap.put("is_consume_new_user", String.valueOf(num3.intValue()));
            }
            Integer num4 = logData6.isFirstRecharge;
            if (num4 != null) {
                linkedHashMap.put("is_first_recharge", String.valueOf(num4.intValue()));
            }
            linkedHashMap.put("is_maf", String.valueOf(logData6.isMaf));
            linkedHashMap.put("is_nearby", String.valueOf(logData6.isNearby));
            linkedHashMap.put("live_reason", String.valueOf(logData6.liveReason));
            linkedHashMap.put("log_pb", String.valueOf(logData6.logPb));
            linkedHashMap.put("magic3ActivityId", String.valueOf(logData6.magic3_activity_id));
            linkedHashMap.put("magic3Comptype", String.valueOf(logData6.magic3_comptype));
            linkedHashMap.put("magic3_source", String.valueOf(logData6.magic3_source));
            linkedHashMap.put("opt_search_warmup_duration", String.valueOf(logData6.optSearchWarmUpDuration));
            Integer num5 = logData6.rechargePackage;
            if (num5 != null) {
                linkedHashMap.put("recharge_package", String.valueOf(num5.intValue()));
            }
            String str = logData6.rechargeType;
            if (str != null) {
                linkedHashMap.put("recharge_type", str);
            }
            linkedHashMap.put("recommendType", String.valueOf(logData6.liveRecommendReason));
            linkedHashMap.put("search_id", String.valueOf(logData6.search_id));
            linkedHashMap.put("search_keyword", String.valueOf(logData6.search_keyword));
            linkedHashMap.put("search_result_id", String.valueOf(logData6.search_result_id));
            linkedHashMap.put("search_result_type", String.valueOf(logData6.search_result_type));
            linkedHashMap.put("search_token_type", String.valueOf(logData6.search_token_type));
            linkedHashMap.put("search_type", String.valueOf(logData6.search_type));
            linkedHashMap.put("source", String.valueOf(logData6.enterLiveModule));
            String str2 = logData6.subGameRank;
            if (str2 != null) {
                linkedHashMap.put("sub_rank_game_name", str2);
            }
            linkedHashMap.put("superior_page_from", String.valueOf(logData6.superiorPageFrom));
            linkedHashMap.put("top_message_type", String.valueOf(logData6.logTopMessageType));
            linkedHashMap.put("toplive_position", String.valueOf(logData6.toplivePosition));
            linkedHashMap.put("video_id", String.valueOf(logData6.videoId));
            Integer num6 = logData6.webappLiveLine;
            if (num6 != null) {
                linkedHashMap.put("webapp_live_line", String.valueOf(num6.intValue()));
            }
            Integer num7 = logData6.webappLivePosition;
            if (num7 != null) {
                linkedHashMap.put("webapp_live_position", String.valueOf(num7.intValue()));
            }
            map.putAll(linkedHashMap);
            c0ivu.LJJJJI = map;
            if (C0IXW.LJ(enterRoomConfig)) {
                c0ivu.LJJIJL = enterRoomConfig.mRoomsData.adLiveEnterRoomConfig;
            }
            if ("follow_widget".equals(enterRoomConfig.mRoomsData.enterFromMerge)) {
                EnterRoomConfig.RoomsData roomsData5 = enterRoomConfig.mRoomsData;
                c0ivu.LJJJJIZL = roomsData5.widgetType;
                c0ivu.LJJJJJ = Integer.valueOf(roomsData5.widgetAnchorNum);
                c0ivu.LJJJJJL = Integer.valueOf(enterRoomConfig.mRoomsData.anchorPosition);
            }
            if ("homepage_live".equals(enterRoomConfig.mRoomsData.enterFromMerge)) {
                c0ivu.LJJJJL = Integer.valueOf(Boolean.TRUE.equals(enterRoomConfig.mLogData.isAutoEnter) ? 1 : 0);
            }
            EnterRoomConfig.LogData logData7 = enterRoomConfig.mLogData;
            int i = logData7.interactType;
            Map<String, String> map3 = logData7.liveAiSummaryParams;
            c0ivu.LJJJLL = map3;
            Map<String, String> map4 = logData7.pcsDecorationLogParams;
            c0ivu.LJJJLZIJ = map4;
            String str3 = logData7.repostPairFollowStatus;
            Boolean bool = logData7.previewFollowedAnchor;
            Boolean bool2 = logData7.previewShowedFollowGuide;
            int i2 = logData7.livePreviewCTAShown;
            long j3 = logData7.livePreviewShowInterval;
            if (enterRoomConfig.mRoomsData.multiGuestContinuousType != 1) {
                z = false;
            }
            String str4 = c0ivu.LIZ;
            String str5 = c0ivu.LIZIZ;
            String str6 = c0ivu.LIZJ;
            Long l = c0ivu.LIZLLL;
            String str7 = c0ivu.LJ;
            String str8 = c0ivu.LJFF;
            String str9 = c0ivu.LJI;
            Boolean bool3 = c0ivu.LJII;
            String str10 = c0ivu.LJIIIIZZ;
            String str11 = c0ivu.LJIIIZ;
            String str12 = c0ivu.LJIIJ;
            String str13 = c0ivu.LJIIJJI;
            String str14 = c0ivu.LJIIL;
            String str15 = c0ivu.LJIILIIL;
            String str16 = c0ivu.LJIILJJIL;
            Long l2 = c0ivu.LJIILL;
            String str17 = c0ivu.LJIILLIIL;
            Integer num8 = c0ivu.LJIIZILJ;
            Integer num9 = c0ivu.LJJJI;
            Long l3 = c0ivu.LJJJIL;
            String str18 = c0ivu.LJJJJ;
            long j4 = c0ivu.LJIJI;
            String str19 = c0ivu.LJIJJ;
            String str20 = c0ivu.LJIJJLI;
            int i3 = c0ivu.LJIL;
            int i4 = c0ivu.LJJ;
            String str21 = c0ivu.LJJI;
            String str22 = c0ivu.LJJIFFI;
            String str23 = c0ivu.LJJII;
            String str24 = c0ivu.LJJIII;
            String str25 = c0ivu.LJJIIJ;
            String str26 = c0ivu.LJJIIJZLJL;
            String str27 = c0ivu.LJJIIZ;
            Long l4 = c0ivu.LJJIIZI;
            Long l5 = c0ivu.LJJIJ;
            String str28 = c0ivu.LJJIJIIJI;
            Long l6 = c0ivu.LJJIJIIJIL;
            Long l7 = c0ivu.LJJIJIL;
            AdLiveEnterRoomConfig adLiveEnterRoomConfig = c0ivu.LJJIJL;
            dataChannelGlobal.JQ2(C1148430fzV.class, new C0IXL(str4, str5, str6, l, str7, str8, str9, bool3, str10, str11, str12, str13, str14, str15, str16, null, l2, str17, num8, null, str26, str27, l4, l5, l6, str28, l7, null, c0ivu.LJIJ, j4, str19, str20, Integer.valueOf(i4), str21, str22, str23, str24, str25, i3, 0L, adLiveEnterRoomConfig, c0ivu.LJJIJLIJ, c0ivu.LJJIL, num9, l3, str18, c0ivu.LJJIZ, c0ivu.LJJJ, c0ivu.LJJJJI, c0ivu.LJJJJIZL, c0ivu.LJJJJJ, c0ivu.LJJJJL, c0ivu.LJJJJJL, null, null, c0ivu.LJJJJLI, c0ivu.LJJJJLL, c0ivu.LJJJJZ, c0ivu.LJJJJZI, c0ivu.LJJJLIIL, i, map3, map4, str3, bool, bool2, null, c0ivu.LJJJZ, c0ivu.LJJL, c0ivu.LJJLI, c0ivu.LJJLIIIIJ, i2, j3, z));
        }
        C0IXW.LJIIJ(enterRoomConfig2);
    }

    public final void LIZIZ(Room room, EnterRoomConfig enterRoomConfig) {
        EnterRoomConfig.LogData logData;
        if (enterRoomConfig != null && (logData = enterRoomConfig.mLogData) != null && enterRoomConfig.mRoomsData != null) {
            Map<String, String> map = logData.auctionLogMap;
            if (map == null || map.isEmpty()) {
                C464330IIt.LJI(room, enterRoomConfig);
            }
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
            C0IR5 c0ir5 = (C0IR5) dataChannelGlobal.gg0(C1148310fzJ.class);
            if (c0ir5 != null) {
                Map<String, String> map2 = enterRoomConfig.mLogData.auctionLogMap;
                if (map2 != null && !map2.isEmpty()) {
                    c0ir5.LJIILIIL = new HashMap(enterRoomConfig.mLogData.auctionLogMap);
                } else {
                    c0ir5.LJIILIIL = null;
                }
                dataChannelGlobal.JQ2(C1148310fzJ.class, c0ir5);
            }
            C823050WQl.LIZIZ().execute(new ARunnableS40S0300000_7(this, enterRoomConfig, room, 13));
        }
    }

    public static void LIZLLL(String str, EnterRoomConfig enterRoomConfig, Room room) {
        Object obj;
        Object obj2;
        String str2;
        int iIntValue;
        Object obj3;
        String str3;
        Map<String, String> map;
        Map<String, String> map2;
        MultiLiveUserSettings multiLiveUserSettings;
        MultiLiveUserApplySettings multiLiveUserApplySettings;
        Object obj4;
        C0IXL c0ixl;
        C0IXL c0ixl2;
        LinkedHashMap linkedHashMap;
        Map<String, String> map3;
        C0IXL c0ixl3;
        String str4 = enterRoomConfig.mLogData.requestId;
        if (TextUtils.isEmpty(str4)) {
            str4 = enterRoomConfig.mLogData.requestId;
        }
        String str5 = enterRoomConfig.mLogData.logPb;
        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
        long j = roomsData.roomId;
        String str6 = roomsData.userId;
        w.LIZ.getClass();
        String strLJJIFFI = w.LJJIFFI();
        EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.mRoomsData;
        String str7 = roomsData2.sourceType;
        String str8 = roomsData2.sceneId;
        HashMap map4 = new HashMap();
        map4.put("room_id", String.valueOf(j));
        map4.put("anchor_id", str6);
        Long lValueOf = Long.valueOf(j);
        C0IR5 c0ir5LIZIZ = C0IR2.LIZIZ();
        if (c0ir5LIZIZ != null) {
            c0ir5LIZIZ.LIZJ = lValueOf;
        }
        Map<String, String> mapLIZ = C464340IIu.LIZ(enterRoomConfig);
        C0IR5 c0ir5LIZIZ2 = C0IR2.LIZIZ();
        if (c0ir5LIZIZ2 != null) {
            c0ir5LIZIZ2.LJIILJJIL = mapLIZ;
        }
        Long lValueOf2 = Long.valueOf(UserService.getInstance().user().getCurrentUserId());
        C0IR5 c0ir5LIZIZ3 = C0IR2.LIZIZ();
        if (c0ir5LIZIZ3 != null && (c0ixl3 = c0ir5LIZIZ3.LJFF) != null) {
            c0ixl3.LJJJLL = lValueOf2;
        }
        EnterRoomConfig.RoomsData roomsData3 = enterRoomConfig.mRoomsData;
        String str9 = roomsData3.enterFromMerge;
        String str10 = roomsData3.enterMethod;
        String str11 = roomsData3.isFromMgTopLive;
        String str12 = "1";
        if (LiveSdkRemoveLiveShowFromLiveCellOptSetting.isEnable() && TextUtils.equals(str11, "1") && !TextUtils.isEmpty(str10) && ((str10.contains("hangout_live_cell") || str10.contains("hangout_cover") || str10.contains("hangout_banner")) && "click".equals(str))) {
            return;
        }
        map4.put("request_id", str4);
        map4.put("log_pb", str5);
        map4.put("action_type", str);
        map4.put("enter_from_merge", str9);
        map4.put("enter_method", str10);
        if (!TextUtils.isEmpty(str7)) {
            map4.put("moment_room_source", str7);
        }
        if (!TextUtils.isEmpty(str8) && "draw".equals(str)) {
            map4.put("scene_id", str8);
        }
        if ("draw".equals(str)) {
            map4.put("orientation", CardStruct.IStatusCode.DEFAULT);
        }
        if (!C2093608Ic.LJ(enterRoomConfig.mRoomsData.windowMode)) {
            map4.put("live_window_mode", enterRoomConfig.mRoomsData.windowMode);
        }
        String strLJIILJJIL = w.LJIILJJIL();
        if (!TextUtils.isEmpty(strLJIILJJIL) && "click_push_live_cd_user".equals(strLJIILJJIL)) {
            map4.put("is_subscribe", "1");
        } else {
            map4.put("is_subscribe", CardStruct.IStatusCode.DEFAULT);
        }
        long j2 = enterRoomConfig.mRoomsData.smallPictureOrder;
        if (j2 != -1) {
            map4.put("small_picture_order", String.valueOf(j2));
        }
        C0IR5 c0ir5 = (C0IR5) DataChannelGlobal.LLILZ.gg0(C1148310fzJ.class);
        if (c0ir5 != null) {
            EnterRoomConfig.LogData logData = enterRoomConfig.mLogData;
            if (logData != null && (map3 = logData.singleRoomLogMap) != null) {
                linkedHashMap = new LinkedHashMap(map3);
            } else {
                linkedHashMap = null;
            }
            c0ir5.LJIIJJI = linkedHashMap;
        }
        if (!TextUtils.isEmpty(w.LJIILL())) {
            map4.put("list_item_id", String.valueOf(j));
        }
        if (!C2093608Ic.LJ(C466640IRq.LIZJ().LIZLLL())) {
            map4.put("enter_live_method", C466640IRq.LIZJ().LIZLLL());
        }
        if (!C2093608Ic.LJ(enterRoomConfig.mRoomsData.followStatus)) {
            map4.put("follow_status", enterRoomConfig.mRoomsData.followStatus);
            map4.put("initial_follow_status", enterRoomConfig.mRoomsData.followStatus);
        }
        if (enterRoomConfig.mRoomsData.isBackPreRoom) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        map4.put("is_return", obj);
        EnterRoomConfig.RoomsData roomsData4 = enterRoomConfig.mRoomsData;
        if (roomsData4.isShowFlare) {
            map4.put("task_id", roomsData4.flareTaskId);
        }
        EnterRoomConfig.ECWrapData eCWrapData = enterRoomConfig.mECData;
        if (eCWrapData != null) {
            HashMap<String, String> map5 = eCWrapData.ecCommonExtraParam;
            if (map5 != null) {
                map4.putAll(map5);
            }
            String str13 = enterRoomConfig.mECData.ecRecommendInfo;
            if (str13 != null) {
                map4.put("ecom_live_rcmd_info", str13);
            }
        }
        Map<String, String> map6 = enterRoomConfig.mRoomsData.gameLiveExtra;
        if (map6 != null) {
            try {
                map4.putAll(map6);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJ("LiveRoomLog", "hashMap concurrentModificationException");
            }
            if (enterRoomConfig.mRoomsData.gameLiveExtra.get("tag_name") != null) {
                map4.put("live_game_name", enterRoomConfig.mRoomsData.gameLiveExtra.get("tag_name"));
            }
        }
        long j3 = enterRoomConfig.mLogData.cardRoomId;
        if (j3 > 0) {
            map4.put("card_room_id", String.valueOf(j3));
        }
        if (enterRoomConfig.mLogData.fromRoomId > 0 || "draw".equals(enterRoomConfig.mRoomsData.actionType)) {
            map4.put("from_room_id", String.valueOf(enterRoomConfig.mLogData.fromRoomId));
        }
        if (!"-1".equals(enterRoomConfig.mLogData.drawAction) || "draw".equals(enterRoomConfig.mRoomsData.actionType)) {
            map4.put("draw_action", enterRoomConfig.mLogData.drawAction);
        }
        Map<String, String> map7 = enterRoomConfig.mLogData.innerDrawSortStatsTag;
        if (map7 != null) {
            for (Map.Entry<String, String> entry : map7.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (key != null && C1533950q1J.LJ(key) && C1533950q1J.LJ(value) && !map4.containsKey(key)) {
                    map4.put(key, value);
                }
            }
        }
        Map<String, String> map8 = enterRoomConfig.mLogData.smbLiveRoomLogMap;
        if (map8 != null) {
            map4.putAll(map8);
        }
        map4.put("enter_from_merge", enterRoomConfig.mRoomsData.enterFromMerge);
        map4.put("enter_method", enterRoomConfig.mRoomsData.enterMethod);
        String str14 = enterRoomConfig.mLogData.liveBgImageId;
        if (str14 != null) {
            map4.put("bg_image_uri_id", str14);
        }
        EnterRoomConfig.LogData logData2 = enterRoomConfig.mLogData;
        String str15 = logData2.guestRequestId;
        if (str15 != null) {
            map4.put("guest_request_id", str15);
        } else if (!TextUtils.isEmpty(logData2.requestId)) {
            map4.put("guest_request_id", enterRoomConfig.mLogData.requestId);
        }
        boolean zLIZ = C147500hN.LIZ(enterRoomConfig.mLogData.toggleStatus);
        Boolean bool = enterRoomConfig.mRoomsData.hasCommerceGoods;
        if (bool != null) {
            if (bool.booleanValue()) {
                map4.put("is_ecom", "1");
            } else {
                map4.put("is_ecom", CardStruct.IStatusCode.DEFAULT);
            }
        }
        if (enterRoomConfig.mRoomsData.isFresh) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        map4.put("is_fresh", obj2);
        if (C497740JfY.LJIL()) {
            str2 = "portrait";
        } else {
            str2 = "landscape";
        }
        map4.put("room_orientation", str2);
        if (enterRoomConfig.mRoomsData.recommendApiEndTimestamp > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis() - enterRoomConfig.mRoomsData.recommendApiEndTimestamp;
            if (jCurrentTimeMillis >= 0) {
                map4.put("feed_to_cellshow_time", String.valueOf(jCurrentTimeMillis));
            }
        }
        ILiveHostCrossRoomEventHelper iLiveHostCrossRoomEventHelper = (ILiveHostCrossRoomEventHelper) C1161920gLG.LIZJ(ILiveHostCrossRoomEventHelper.class);
        map4.put("cohost_from_room_id", iLiveHostCrossRoomEventHelper.getFromRoomId());
        map4.put("cohost_from_request_id", iLiveHostCrossRoomEventHelper.getFromRequestId());
        map4.putAll(C467820IWe.LIZIZ());
        C0IXY c0ixyLJIIIIZZ = C0IXW.LJIIIIZZ(enterRoomConfig);
        Map<String, String> map9 = new HashMap<>();
        if (room != null) {
            map9 = room.getMultiStreamLogParams();
        }
        EnterRoomConfig.GuestUser guestUser = enterRoomConfig.mRoomsData.guestUser;
        if (guestUser != null) {
            iIntValue = guestUser.guestCnt.intValue();
        } else {
            iIntValue = 0;
        }
        map4.put("guest_cnt", String.valueOf(iIntValue));
        if (iIntValue > 0) {
            obj3 = "1";
        } else {
            obj3 = CardStruct.IStatusCode.DEFAULT;
        }
        map4.put("is_guest_connection", obj3);
        EnterRoomConfig.StreamData streamData = enterRoomConfig.mStreamData;
        if (streamData != null) {
            map4.put("live_type", LiveMode.valueOf(streamData.streamType).logStreamingType);
        }
        if (enterRoomConfig.mLogData.aiSummaryBoardShow == 1) {
            map4.put("is_in_room_ai_summary_board_show", "1");
            C0IR5 c0ir5LIZIZ4 = C0IR2.LIZIZ();
            if (c0ir5LIZIZ4 != null) {
                c0ir5LIZIZ4.LJIIZILJ = Boolean.TRUE;
            }
        } else {
            C0IR5 c0ir5LIZIZ5 = C0IR2.LIZIZ();
            if (c0ir5LIZIZ5 != null) {
                c0ir5LIZIZ5.LJIIZILJ = Boolean.FALSE;
            }
        }
        Map<String, String> map10 = enterRoomConfig.mLogData.liveAiSummaryParams;
        C0IR5 c0ir5LIZIZ6 = C0IR2.LIZIZ();
        if (c0ir5LIZIZ6 != null && (c0ixl2 = c0ir5LIZIZ6.LJFF) != null) {
            c0ixl2.LJJLIIIJILLIZJL = map10;
        }
        Map<String, String> map11 = enterRoomConfig.mLogData.pcsDecorationLogParams;
        C0IR5 c0ir5LIZIZ7 = C0IR2.LIZIZ();
        if (c0ir5LIZIZ7 != null && (c0ixl = c0ir5LIZIZ7.LJFF) != null) {
            c0ixl.LJJLIIIJJI = map11;
        }
        map4.putAll(C475750IlB.LIZ());
        Boolean bool2 = enterRoomConfig.mLogData.fromManualRefresh;
        if (bool2 != null) {
            if (bool2.booleanValue()) {
                obj4 = "1";
            } else {
                obj4 = CardStruct.IStatusCode.DEFAULT;
            }
            map4.put("is_refresh", obj4);
        }
        if (room == null || (multiLiveUserSettings = room.multiLiveUserSettings) == null || (multiLiveUserApplySettings = multiLiveUserSettings.multiLiveUserApplySettings) == null || (str3 = multiLiveUserApplySettings.topLiveTitle) == null) {
            str3 = "";
        }
        map4.put("summary_content", str3);
        EnterRoomConfig.RoomsData roomsData5 = enterRoomConfig.mRoomsData;
        if (roomsData5 != null && (map2 = roomsData5.mgAISummaryExtra) != null) {
            map4.putAll(map2);
        }
        EnterRoomConfig.RoomsData roomsData6 = enterRoomConfig.mRoomsData;
        if (roomsData6 != null && (map = roomsData6.mgCardLabelInfo) != null) {
            map4.putAll(map);
        }
        if (Boolean.TRUE.equals(DataChannelGlobal.LLILZ.gg0(C931100aKy.class))) {
            map4.put("is_end_live_from_card", "1");
        }
        EnterRoomConfig.RoomsData roomsData7 = enterRoomConfig.mRoomsData;
        if (roomsData7 != null && "auction".equals(roomsData7.tabType)) {
            map4.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("live_show");
        c474500IjALIZ.LJJIIZI(map4);
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJFF(c0ixyLJIIIIZZ);
        c474500IjALIZ.LJIILJJIL("");
        c474500IjALIZ.LJIIJJI("live_view");
        c474500IjALIZ.LJIILL("core");
        c474500IjALIZ.LJIILIIL(strLJJIFFI);
        if (!zLIZ) {
            str12 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(str12, "is_gaming_toggle");
        c474500IjALIZ.LJJIIZI(map9);
        c474500IjALIZ.LIZ();
    }

    public static void LIZJ(EnterRoomConfig enterRoomConfig, String str, long j, String str2) {
        if (enterRoomConfig == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = enterRoomConfig.mRoomsData.userId;
        }
        if (j == 0) {
            j = enterRoomConfig.mRoomsData.roomId;
        }
        w.LIZ.getClass();
        if (TextUtils.equals(w.LJIIL(), "push")) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_push_error");
            C463300IEu c463300IEu = new C463300IEu();
            c463300IEu.LIZ("anchor_id", str);
            c463300IEu.LIZ("anchor_status", str2);
            c463300IEu.LIZ("room_id", String.valueOf(j));
            c474500IjALIZ.LJJIIZI(c463300IEu.LIZ);
            c474500IjALIZ.LIZ();
        }
    }
}
