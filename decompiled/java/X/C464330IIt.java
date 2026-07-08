package X;

import com.bytedance.android.livesdk.livesetting.watchlive.LiveGameMultiStreamWatch;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreloadInteractionLayerSetting;
import com.bytedance.android.livesdkapi.depend.model.live.BoardUsingInfo;
import com.bytedance.android.livesdkapi.depend.model.live.CommerceStruct;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.SMBInfo;
import com.bytedance.android.livesdkapi.host.IHostCommerce;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0IIt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C464330IIt {
    public static ArrayList<String> LJII(Room room) {
        if (room.getCover() != null && !C0IKQ.LIZ(room.getCover().getUrls())) {
            return new ArrayList<>(room.getCover().getUrls());
        }
        if (room.getOwner() != null && room.getOwner().getAvatarThumb() != null && !C0IKQ.LIZ(room.getOwner().getAvatarThumb().getUrls())) {
            return new ArrayList<>(room.getOwner().getAvatarThumb().getUrls());
        }
        return null;
    }

    public static boolean LJIIIIZZ(Room room) {
        String str;
        if (room == null) {
            return false;
        }
        int iOptInt = -1;
        try {
            CommerceStruct commerceStruct = room.getCommerceStruct();
            if (commerceStruct != null && (str = commerceStruct.oecInitDataString) != null && str.length() > 0) {
                iOptInt = new JSONObject(commerceStruct.oecInitDataString).optInt("product_num", -1);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("isEcomForLiveStream ");
            sbLIZ.append(th);
            C20441214yg.LJ("ArgumentsBuilder", C2188811AlT.LIZIZ(sbLIZ));
        }
        IHostCommerce iHostCommerce = (IHostCommerce) C1161920gLG.LIZJ(IHostCommerce.class);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("room(");
        sbLIZ2.append(room.getId());
        sbLIZ2.append(")");
        return iHostCommerce.Pf(iOptInt, C2188811AlT.LIZIZ(sbLIZ2), room.hasCommerceGoods, room.existedCommerceGoods);
    }

    public static void LIZ(Room room, EnterRoomConfig enterRoomConfig) {
        if (room != null && room.getOwner() != null && room.getOwner().getFollowInfo() != null) {
            enterRoomConfig.mRoomsData.followStatus = String.valueOf(room.getOwner().getFollowInfo().getFollowStatus());
        }
    }

    public static void LIZIZ(Room room, EnterRoomConfig enterRoomConfig) {
        if (room != null && room.getRoomAuthStatus() != null && room.getOwner() != null && LivePreloadInteractionLayerSetting.INSTANCE.isEnableFeedRoomParse()) {
            enterRoomConfig.mRoomsData.commerceStruct = room.getCommerceStruct();
            enterRoomConfig.mRoomsData.preLoadRoomInfo = GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, room);
        }
    }

    public static EnterRoomConfig LIZJ(boolean z, Room room) {
        String str;
        ArrayList<String> arrayList;
        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
        if (room != null) {
            enterRoomConfig.mRoomsData.specialCard = EnterRoomConfig.SpecialCardWrapper.fromSpecialCard(room.specialCard);
            enterRoomConfig.mRoomsData.roomId = room.getId();
            enterRoomConfig.mRoomsData.streamType = room.getStreamType();
            enterRoomConfig.mRoomsData.bgUrls = LJII(room);
            enterRoomConfig.mLogData.requestId = room.getRequestId();
            EnterRoomConfig.LogData logData = enterRoomConfig.mLogData;
            logData.logId = room.logId;
            logData.forcedLowLatency = room.isForcedLowLatency();
            BoardUsingInfo boardUsingInfo = room.boardUsingInfo;
            if (boardUsingInfo != null && boardUsingInfo.usingBoard == 1 && boardUsingInfo.recommendSource == 2) {
                enterRoomConfig.mLogData.aiSummaryBoardShow = 1L;
            }
            HashMap map = new HashMap();
            SMBInfo sMBInfo = room.smbInfo;
            int i = 1;
            if (sMBInfo != null && sMBInfo.optInStatus == 1 && sMBInfo.activeSkuCount > 0) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("is_smb_creator", str);
            map.put("decoration_set_id", String.valueOf(room.smbBoardId));
            EnterRoomConfig.LogData logData2 = enterRoomConfig.mLogData;
            logData2.pcsDecorationLogParams = map;
            logData2.logPb = room.getLog_pb();
            enterRoomConfig.mRoomsData.sourceType = room.getSourceType();
            EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
            if (room.blurredCover == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList<>(room.blurredCover.getUrls());
            }
            roomsData.gaussianBgUrls = arrayList;
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
            if (dataChannelGlobal.gg0(C930940aKi.class) != null) {
                Room room2 = (Room) dataChannelGlobal.gg0(C930940aKi.class);
                enterRoomConfig.mLogData.userFrom = room2.getUserFrom();
            }
            enterRoomConfig.mRoomsData.roomLabels = room.getLabels();
            LJFF(room, enterRoomConfig);
            enterRoomConfig.mRoomsData.userId = String.valueOf(room.getOwnerUserId());
            if (room.getOwner() != null) {
                enterRoomConfig.mRoomsData.isSecret = Integer.valueOf(room.getOwner().getSecret());
            }
            if (z) {
                LIZIZ(room, enterRoomConfig);
                enterRoomConfig.mRoomsData.commerceStruct = room.getCommerceStruct();
            }
            LIZ(room, enterRoomConfig);
            enterRoomConfig.mRoomsData.hasCommerceGoods = Boolean.valueOf(room.hasCommerceGoods);
            LJIIIZ(room, enterRoomConfig);
            if (enterRoomConfig.mRoomsData.guestUser != null && room.getLinkMicInfo() != null && room.getLinkMicInfo().audienceIdList != null) {
                enterRoomConfig.mRoomsData.guestUser.guestCnt = Integer.valueOf(room.getLinkMicInfo().audienceIdList.size());
                EnterRoomConfig.GuestUser guestUser = enterRoomConfig.mRoomsData.guestUser;
                if (room.getLinkMicInfo().audienceIdList.size() <= 0) {
                    i = 0;
                }
                guestUser.isGuestEnter = i;
            }
        }
        return enterRoomConfig;
    }

    public static void LIZLLL(Room room, EnterRoomConfig enterRoomConfig) {
        ArrayList<String> arrayList;
        String str;
        if (room != null) {
            enterRoomConfig.mRoomsData.specialCard = EnterRoomConfig.SpecialCardWrapper.fromSpecialCard(room.specialCard);
            enterRoomConfig.mRoomsData.roomId = room.getId();
            enterRoomConfig.mRoomsData.streamType = room.getStreamType();
            enterRoomConfig.mRoomsData.bgUrls = LJII(room);
            EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
            if (room.blurredCover == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList<>(room.blurredCover.getUrls());
            }
            roomsData.gaussianBgUrls = arrayList;
            enterRoomConfig.mLogData.requestId = room.getRequestId();
            EnterRoomConfig.LogData logData = enterRoomConfig.mLogData;
            logData.logId = room.logId;
            logData.forcedLowLatency = room.isForcedLowLatency();
            enterRoomConfig.mLogData.logPb = room.getLog_pb();
            enterRoomConfig.mRoomsData.sourceType = room.getSourceType();
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
            if (dataChannelGlobal.gg0(C930940aKi.class) != null) {
                Room room2 = (Room) dataChannelGlobal.gg0(C930940aKi.class);
                enterRoomConfig.mLogData.userFrom = room2.getUserFrom();
            }
            HashMap map = new HashMap();
            SMBInfo sMBInfo = room.smbInfo;
            if (sMBInfo != null && sMBInfo.optInStatus == 1 && sMBInfo.activeSkuCount > 0) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("is_smb_creator", str);
            map.put("decoration_set_id", String.valueOf(room.smbBoardId));
            enterRoomConfig.mLogData.pcsDecorationLogParams = map;
            enterRoomConfig.mRoomsData.roomLabels = room.getLabels();
            LJFF(room, enterRoomConfig);
            enterRoomConfig.mRoomsData.userId = String.valueOf(room.getOwnerUserId());
            if (room.getOwner() != null) {
                enterRoomConfig.mRoomsData.isSecret = Integer.valueOf(room.getOwner().getSecret());
            }
            LIZ(room, enterRoomConfig);
            LJIIIZ(room, enterRoomConfig);
        }
    }

    public static void LJ(Room room, EnterRoomConfig enterRoomConfig) {
        ArrayList<String> arrayList;
        if (room != null) {
            enterRoomConfig.mRoomsData.roomId = room.getId();
            enterRoomConfig.mRoomsData.streamType = room.getStreamType();
            LJFF(room, enterRoomConfig);
            LIZ(room, enterRoomConfig);
            EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
            if (room.blurredCover == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList<>(room.blurredCover.getUrls());
            }
            roomsData.gaussianBgUrls = arrayList;
            enterRoomConfig.mRoomsData.bgUrls = LJII(room);
            enterRoomConfig.mRoomsData.userId = String.valueOf(room.getOwnerUserId());
            if (room.getOwner() != null) {
                enterRoomConfig.mRoomsData.isSecret = Integer.valueOf(room.getOwner().getSecret());
            }
            LJIIIZ(room, enterRoomConfig);
        }
    }

    public static void LJFF(Room room, EnterRoomConfig enterRoomConfig) {
        C0IVR.LIZLLL(room, enterRoomConfig);
        if (room.multiStreamScene == 1 && LiveGameMultiStreamWatch.INSTANCE.isExperimentGroup() && room.getExtraStreamData() != null && room.getExtraStreamDefaultQualitySdkKey() != null) {
            C0IVR.LJ(room, enterRoomConfig);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005c A[Catch: all -> 0x007e, TryCatch #0 {all -> 0x007e, blocks: (B:9:0x0018, B:11:0x001e, B:13:0x0022, B:15:0x0028, B:17:0x0037, B:19:0x003d, B:20:0x0041, B:22:0x0047, B:24:0x0051, B:25:0x0056, B:27:0x005c, B:28:0x0065, B:30:0x006b, B:31:0x0079), top: B:36:0x0018 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJI(com.bytedance.android.livesdkapi.depend.model.live.Room r4, com.bytedance.android.livesdkapi.session.EnterRoomConfig r5) {
        /*
            java.lang.String r3 = "da_info"
            if (r4 == 0) goto La2
            if (r5 == 0) goto La2
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$LogData r1 = r5.mLogData
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.singleRoomLogMap
            if (r0 != 0) goto L13
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.singleRoomLogMap = r0
        L13:
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$LogData r1 = r5.mLogData
            r0 = 0
            r1.auctionLogMap = r0
            com.bytedance.android.livesdkapi.depend.model.live.CommerceStruct r1 = r4.getCommerceStruct()     // Catch: java.lang.Throwable -> L7e
            if (r1 == 0) goto L97
            java.lang.String r0 = r1.oecInitDataString     // Catch: java.lang.Throwable -> L7e
            if (r0 == 0) goto L97
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L7e
            if (r0 != 0) goto L97
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L7e
            java.lang.String r0 = r1.oecInitDataString     // Catch: java.lang.Throwable -> L7e
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L7e
            java.lang.String r0 = "recommend_info"
            java.lang.String r1 = r2.optString(r0)     // Catch: java.lang.Throwable -> L7e
            if (r1 == 0) goto L41
            boolean r0 = r1.isEmpty()     // Catch: java.lang.Throwable -> L7e
            if (r0 != 0) goto L41
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$ECWrapData r0 = r5.mECData     // Catch: java.lang.Throwable -> L7e
            r0.ecRecommendInfo = r1     // Catch: java.lang.Throwable -> L7e
        L41:
            org.json.JSONObject r4 = r2.optJSONObject(r3)     // Catch: java.lang.Throwable -> L7e
            if (r4 != 0) goto L56
            java.lang.String r1 = r2.optString(r3)     // Catch: java.lang.Throwable -> L7e
            boolean r0 = r1.isEmpty()     // Catch: java.lang.Throwable -> L7e
            if (r0 != 0) goto L97
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L7e
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L7e
        L56:
            int r0 = r4.length()     // Catch: java.lang.Throwable -> L7e
            if (r0 <= 0) goto L97
            java.util.HashMap r3 = new java.util.HashMap     // Catch: java.lang.Throwable -> L7e
            r3.<init>()     // Catch: java.lang.Throwable -> L7e
            java.util.Iterator r2 = r4.keys()     // Catch: java.lang.Throwable -> L7e
        L65:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> L7e
            if (r0 == 0) goto L79
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Throwable -> L7e
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L7e
            java.lang.String r0 = r4.optString(r1)     // Catch: java.lang.Throwable -> L7e
            r3.put(r1, r0)     // Catch: java.lang.Throwable -> L7e
            goto L65
        L79:
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$LogData r0 = r5.mLogData     // Catch: java.lang.Throwable -> L7e
            r0.auctionLogMap = r3     // Catch: java.lang.Throwable -> L7e
            goto L97
        L7e:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "extractEcParamsToConfig "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "ArgumentsBuilder"
            X.C20441214yg.LJ(r0, r1)
        L97:
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$LogData r0 = r5.mLogData
            java.util.Map<java.lang.String, java.lang.String> r1 = r0.singleRoomLogMap
            java.util.Map r0 = X.C0IVR.LJI(r5)
            r1.putAll(r0)
        La2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C464330IIt.LJI(com.bytedance.android.livesdkapi.depend.model.live.Room, com.bytedance.android.livesdkapi.session.EnterRoomConfig):void");
    }

    public static void LJIIIZ(Room room, EnterRoomConfig enterRoomConfig) {
        String str;
        if (room != null) {
            try {
                EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
                if (LJIIIIZZ(room)) {
                    str = "ecom";
                } else {
                    str = null;
                }
                roomsData.enterMethodSubtag = str;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("updateEnterMethodSubtag ");
                sbLIZ.append(th);
                C20441214yg.LJ("ArgumentsBuilder", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }
}
