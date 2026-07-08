package X;

import Y.ARunnableS0S0100200_7;
import Y.ARunnableS86S0000000_7;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.livesdk.chatroom.bl.enterroomboost.LiveEnterRoomUpdateSetting;
import com.bytedance.android.livesdk.chatroom.model.EnterRoomExtra;
import com.bytedance.android.livesdk.feed.skylight.CommonSkylightDataManager;
import com.bytedance.android.livesdk.livesetting.feed.LiveForuTopLivesEnterOptSetting;
import com.bytedance.android.livesdk.livesetting.feed.LiveRecInfoPtyUploadSetting;
import com.bytedance.android.livesdk.livesetting.feed.TopLivePreFetchPoolSetting;
import com.bytedance.android.livesdk.livesetting.feed.TopliveReuseSkylightDataOptReqSetting;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdk.model.FlareInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostWatch;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.Event;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0IUV, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IUV {
    public static boolean LIZ;
    public static C0IUX LIZIZ;
    public static ARunnableS0S0100200_7 LIZJ;

    public static void LIZLLL() {
        LIZ = false;
        if (LIZIZ != null) {
            CommonSkylightDataManager.LIZ.LIZJ(LIZIZ);
        }
        LIZIZ = null;
        int i = C467320IUg.LIZIZ;
        C473410IhP.LIZ().removeCallbacks(null);
        C473410IhP.LIZ().removeCallbacks(null);
        C473410IhP.LIZ().removeCallbacks(LIZJ);
    }

    public static void LJFF() {
        LIZ = false;
        C0IUW.LIZ(true);
        if (LIZIZ != null) {
            CommonSkylightDataManager.LIZ.LIZJ(LIZIZ);
        }
        LIZIZ = null;
        int i = C467320IUg.LIZIZ;
        C473410IhP.LIZ().removeCallbacks(null);
        C473410IhP.LIZ().removeCallbacks(null);
        C473410IhP.LIZ().removeCallbacks(LIZJ);
    }

    public static String LIZ(String str) {
        if (!TextUtils.isEmpty(str) && str.contains("/webcast/feed/")) {
            if ((((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline() || ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLiveInhouse()) && !str.contains("&debug=true")) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append("&debug=true");
                return C2188811AlT.LIZIZ(sbLIZ);
            }
            return str;
        }
        return str;
    }

    public static void LJIIIIZZ(Throwable th) {
        C465050ILn.LIZLLL("webcast_feed_process");
        if (LiveForuTopLivesEnterOptSetting.INSTANCE.enable()) {
            ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).addPauseTask(new ARunnableS86S0000000_7(20));
        } else {
            LIZ = false;
        }
        C465050ILn.LIZ.getClass();
        C20182413y2 c20182413y2LJIIIZ = C465050ILn.LJIIIZ();
        if (c20182413y2LJIIIZ != null) {
            c20182413y2LJIIIZ.LIZIZ();
        }
        C465050ILn.LJFF = null;
        C20182313y1 c20182313y1 = C465050ILn.LIZIZ;
        if (c20182313y1 != null && C465050ILn.LJI == null) {
            C465050ILn.LJI = c20182313y1.LIZ("prepare_data_to_create_live_container");
        }
        LJIILIIL(-4L, null);
        C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131840613));
        Event event = new Event("webcast_feed_api_fail", 36865, C0IIR.ServerApiCall);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("feed api request has some error, ");
        sbLIZ.append(th);
        event.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        C0IL2.LIZ.LIZ().LIZIZ(event);
        C20441214yg.LJI("NewFeedStyleEntranceUtils", th);
        LJFF();
    }

    public static EnterRoomConfig LIZIZ(FeedItem feedItem, FeedExtra feedExtra) {
        InterfaceC468260IXw interfaceC468260IXw = feedItem.item;
        String str = null;
        if (!(interfaceC468260IXw instanceof Room)) {
            return null;
        }
        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
        C464330IIt.LIZLLL((Room) interfaceC468260IXw, enterRoomConfig);
        C0ISL.LIZ(feedItem, enterRoomConfig);
        if (feedExtra != null) {
            try {
                enterRoomConfig.mLogData.logPb = String.valueOf(feedExtra.getLogPb());
                if (TextUtils.isEmpty(feedExtra.reqId) && feedExtra.getLogPb() != null && !TextUtils.isEmpty(String.valueOf(feedExtra.getLogPb()))) {
                    feedExtra.reqId = JSONObjectProtectorUtils.getString(new JSONObject(feedExtra.getLogPb().toString()), "impr_id");
                }
                enterRoomConfig.mLogData.requestId = feedExtra.reqId;
                EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
                if (feedItem.isRecommendCard) {
                    str = "pop_card";
                }
                roomsData.enterFromMergeRecommend = str;
                return enterRoomConfig;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJI("NewFeedStyleEntranceUtils", e);
            }
        }
        return enterRoomConfig;
    }

    public static EnterRoomConfig LIZJ(FeedItem feedItem, FeedExtra feedExtra) {
        EnterRoomExtra enterRoomExtra;
        String str = null;
        if (feedItem != null) {
            InterfaceC468260IXw interfaceC468260IXw = feedItem.item;
            if (interfaceC468260IXw instanceof Room) {
                Room room = (Room) interfaceC468260IXw;
                EnterRoomConfig enterRoomConfigLIZJ = C464330IIt.LIZJ(true, room);
                C456601q8.LIZ(feedItem, enterRoomConfigLIZJ);
                FlareInfo flareInfo = feedItem.flareInfo;
                if (flareInfo != null) {
                    EnterRoomConfig.RoomsData roomsData = enterRoomConfigLIZJ.mRoomsData;
                    roomsData.isShowFlare = flareInfo.isFlare;
                    roomsData.flareTaskId = flareInfo.taskId;
                }
                enterRoomConfigLIZJ.mRoomsData.isFresh = feedItem.isFresh;
                C464330IIt.LJI(room, enterRoomConfigLIZJ);
                C0ISL.LIZ(feedItem, enterRoomConfigLIZJ);
                if (LiveEnterRoomUpdateSetting.INSTANCE.isEnable() && (enterRoomExtra = room.enterRoomBoostExtra) != null && enterRoomExtra.useEnterBoostCache == 1) {
                    enterRoomConfigLIZJ.mRoomsData.setEnterRoomCache(room);
                }
                if (feedExtra != null) {
                    try {
                        enterRoomConfigLIZJ.mLogData.logPb = String.valueOf(feedExtra.getLogPb());
                        if (TextUtils.isEmpty(feedExtra.reqId) && !TextUtils.isEmpty(String.valueOf(feedExtra.getLogPb()))) {
                            feedExtra.reqId = JSONObjectProtectorUtils.getString(new JSONObject(feedExtra.getLogPb().toString()), "impr_id");
                        }
                        enterRoomConfigLIZJ.mLogData.requestId = feedExtra.reqId;
                        EnterRoomConfig.RoomsData roomsData2 = enterRoomConfigLIZJ.mRoomsData;
                        if (feedItem.isRecommendCard) {
                            str = "pop_card";
                        }
                        roomsData2.enterFromMergeRecommend = str;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C20441214yg.LJI("NewFeedStyleEntranceUtils", e);
                    }
                }
                if (LiveRecInfoPtyUploadSetting.INSTANCE.enable()) {
                    C456701q9.LIZ(feedItem, enterRoomConfigLIZJ);
                }
                return enterRoomConfigLIZJ;
            }
        }
        return null;
    }

    public static void LJ(EnterRoomConfig enterRoomConfig, Map<String, String> map) {
        if (map != null) {
            enterRoomConfig.mLogData.toplivePosition = map.get("toplive_position");
            enterRoomConfig.mLogData.fromTopliveGuide = map.get("from_toplive_guide");
            enterRoomConfig.mLogData.topliveGuidanceType = map.get("guidance_type");
            enterRoomConfig.mLogData.fromFollowRelationShipTopliveGuide = map.get("from_follow_relationship_toplive_guide");
            enterRoomConfig.mLogData.topliveHomepageType = map.get("toplive_homepage_type");
            enterRoomConfig.mLogData.topliveEnterTimestamp = map.get("toplive_enter_time");
            enterRoomConfig.mLogData.landingTab = map.get("landing_tab");
            enterRoomConfig.mLogData.liveTabSource = map.get("live_tab_source");
            enterRoomConfig.mLogData.topLiveSource = map.get("top_live_source");
        }
    }

    public static void LJIIJ(EnterRoomConfig enterRoomConfig, long j) {
        HashMap map = new HashMap();
        if (j > 0) {
            map.put("duration", String.valueOf(System.currentTimeMillis() - j));
            map.put("enter_from_merge", "live_merge");
            map.put("enter_method", "live_cover");
            map.put("anchor_id", enterRoomConfig.mRoomsData.userId);
            map.put("room_id", String.valueOf(enterRoomConfig.mRoomsData.roomId));
            map.put("request_id", enterRoomConfig.mLogData.requestId);
            map.put("action_type", "click");
            map.put("live_window_mode", "full_screen");
            map.put("log_pb", enterRoomConfig.mLogData.logPb);
            map.put("live_type", enterRoomConfig.mRoomsData.streamType.logStreamingType);
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_new_style_feed_duration");
            c474500IjALIZ.LJJIIZI(map);
            c474500IjALIZ.LIZ();
        }
    }

    public static void LJIIJJI(Map map, long j) {
        if (LiveForuTopLivesEnterOptSetting.INSTANCE.enable()) {
            LJIILIIL(-3L, map);
        }
    }

    public static void LJIILIIL(long j, Map map) {
        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
        roomsData.roomId = j;
        roomsData.timeStamps.enterRoomStarTimeReal = System.currentTimeMillis();
        EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.mRoomsData;
        roomsData2.enterFromMerge = "live_merge";
        roomsData2.enterMethod = "live_cover";
        roomsData2.enterRoomScene = "outside_with_feed";
        if (map != null) {
            enterRoomConfig.mLogData.sourceBtmToken = (String) map.get("source_btm_token");
        }
        Context contextLJII = C497740JfY.LJII();
        LJ(enterRoomConfig, map);
        LJIIZILJ(contextLJII, enterRoomConfig);
    }

    public static void LJIIZILJ(Context context, EnterRoomConfig enterRoomConfig) {
        if (!((IHostWatch) C1161920gLG.LIZJ(IHostWatch.class)).watchLive(context, enterRoomConfig) && LiveForuTopLivesEnterOptSetting.INSTANCE.cancelTask()) {
            LIZ = false;
            ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).clearTask();
        }
    }

    public static void LJII(int i, long j, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("page_from", str);
            jSONObject.put("feed_count", i);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1CC2.LJIIJ(0, SystemClock.elapsedRealtime() - j, C0KQH.LIZ("ttlive_toplives_query_feed_api"), jSONObject);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0079, code lost:
    
        if (r7 == null) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIL(long r15, long r17, java.util.Map r19) {
        /*
            com.bytedance.android.livesdk.livesetting.feed.TopLivePreFetchPoolSetting r0 = com.bytedance.android.livesdk.livesetting.feed.TopLivePreFetchPoolSetting.INSTANCE
            com.bytedance.android.livesdk.livesetting.feed.TopLivePreFetchPoolSettingConfig r0 = r0.getValue()
            boolean r0 = r0.getEnabled()
            if (r0 != 0) goto Ld
            return
        Ld:
            X.0ITP r7 = X.C467340IUi.LIZIZ
            r6 = 0
            X.C467340IUi.LIZIZ = r6
            r5 = 0
            if (r7 == 0) goto L7f
            java.util.List<com.bytedance.android.livesdk.model.FeedItem> r0 = r7.LIZ
            if (r0 == 0) goto L7f
            int r0 = r0.size()
        L1d:
            r4 = 1
            if (r0 <= r4) goto L79
            if (r7 == 0) goto L7b
            java.util.List<com.bytedance.android.livesdk.model.FeedItem> r0 = r7.LIZ
            if (r0 == 0) goto L43
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r4)
            com.bytedance.android.livesdk.model.FeedItem r0 = (com.bytedance.android.livesdk.model.FeedItem) r0
            if (r0 == 0) goto L43
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r0.getRoom()
            if (r0 == 0) goto L43
            long r2 = r0.getId()
            java.util.List<java.lang.Long> r1 = X.C467340IUi.LJIIJ
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r1.add(r0)
        L43:
            java.util.List<com.bytedance.android.livesdk.model.FeedItem> r0 = r7.LIZ
            if (r0 == 0) goto L4b
            java.util.List r6 = r0.subList(r5, r4)
        L4b:
            r7.LIZ = r6
        L4d:
            X.0IUY r0 = X.C0IUW.LJII
            if (r0 == 0) goto L53
            r0.LIZ = r4
        L53:
            LIZLLL()
            java.lang.Class<com.bytedance.android.livesdkapi.host.IHostAction> r0 = com.bytedance.android.livesdkapi.host.IHostAction.class
            X.006A r2 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.livesdkapi.host.IHostAction r2 = (com.bytedance.android.livesdkapi.host.IHostAction) r2
            Y.ARunnableS86S0000000_7 r1 = new Y.ARunnableS86S0000000_7
            r0 = 22
            r1.<init>(r0)
            r2.addPauseTask(r1)
            java.lang.String r8 = X.C0IUW.LJFF
            r14 = 0
            r11 = r19
            r12 = r17
            r9 = r15
            r15 = r14
            LJIILJJIL(r7, r8, r9, r11, r12, r14, r15)
            r0 = 2
            X.C467340IUi.LJ(r0)
            return
        L79:
            if (r7 != 0) goto L4d
        L7b:
            X.C467340IUi.LJ(r4)
            return
        L7f:
            r0 = 0
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0IUV.LJIIL(long, long, java.util.Map):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJIILLIIL(long r11, long r13, java.lang.String r15, java.util.Map r16) {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0IUV.LJIILLIIL(long, long, java.lang.String, java.util.Map):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fe A[LOOP:0: B:43:0x00f8->B:45:0x00fe, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0205  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.bytedance.android.livesdkapi.session.EnterRoomConfig LJI(java.util.List<com.bytedance.android.livesdk.model.FeedItem> r12, com.bytedance.android.live.base.model.feed.FeedExtra r13, java.lang.String r14, long r15, java.util.Map<java.lang.String, java.lang.String> r17) {
        /*
            Method dump skipped, instruction units count: 698
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0IUV.LJI(java.util.List, com.bytedance.android.live.base.model.feed.FeedExtra, java.lang.String, long, java.util.Map):com.bytedance.android.livesdkapi.session.EnterRoomConfig");
    }

    public static void LJIILL(FeedItem feedItem, String str, long j, Map<String, String> map, long j2) {
        if (feedItem == null) {
            return;
        }
        C0IUY c0iuy = C0IUW.LJII;
        if (c0iuy != null) {
            c0iuy.LIZ = true;
        }
        LIZLLL();
        ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).addPauseTask(new ARunnableS86S0000000_7(21));
        FeedExtra feedExtra = new FeedExtra();
        feedExtra.hasMore = true;
        feedExtra.reqId = feedItem.getRoom().getRequestId();
        ArrayList arrayList = new ArrayList();
        arrayList.add(feedItem);
        LJIILJJIL(new C0ITP(arrayList, feedExtra), str, j, map, j2, !TopliveReuseSkylightDataOptReqSetting.INSTANCE.getConfig(), false);
    }

    public static void LJIIIZ(C0ITP c0itp, String str, long j, Map<String, String> map, long j2, boolean z, boolean z2) {
        C465050ILn.LIZLLL("webcast_feed_process");
        ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).addPauseTask(new ARunnableS86S0000000_7(17));
        if (c0itp != null && !C0IKQ.LIZ(c0itp.LIZ) && ListProtector.get(c0itp.LIZ, 0) != null) {
            C465050ILn.LIZ.getClass();
            C20182413y2 c20182413y2LJIIIZ = C465050ILn.LJIIIZ();
            if (c20182413y2LJIIIZ != null) {
                c20182413y2LJIIIZ.LIZIZ();
            }
            C465050ILn.LJFF = null;
            C20182313y1 c20182313y1 = C465050ILn.LIZIZ;
            if (c20182313y1 != null && C465050ILn.LJI == null) {
                C465050ILn.LJI = c20182313y1.LIZ("prepare_data_to_create_live_container");
            }
            LJIILJJIL(c0itp, str, j, map, j2, true, z2);
            LJFF();
            return;
        }
        LJIILIIL(-4L, map);
        Event event = new Event("webcast_feed_api_fail", 36866, C0IIR.ServerApiCall);
        event.LIZIZ("feed data is empty");
        C0IL2.LIZ.LIZ().LIZIZ(event);
        C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131840613));
    }

    public static void LJIILJJIL(C0ITP c0itp, String str, long j, Map map, long j2, boolean z, boolean z2) {
        long j3;
        C473410IhP.LIZ().removeCallbacks(null);
        C473410IhP.LIZ().removeCallbacks(null);
        C473410IhP.LIZ().removeCallbacks(LIZJ);
        EnterRoomConfig enterRoomConfigLJI = LJI(c0itp.LIZ, c0itp.LIZIZ, str, j, map);
        enterRoomConfigLJI.mRoomsData.timeStamps.enterRoomStarTimeReal = j2;
        if (z) {
            LJIIJ(enterRoomConfigLJI, j2);
            C0IL2.LIZ.LIZ().LIZIZ(new Event("webcast_feed_api_success", SpeechEngineDefines.TTS_WORK_MODE_BOTH, C0IIR.ServerApiCall));
            LJII(c0itp.LIZ.size(), j2, "homepage_hot");
        }
        LJ(enterRoomConfigLJI, map);
        enterRoomConfigLJI.mRoomsData.enterRoomScene = "outside_with_feed";
        if (!z) {
            if (TopLivePreFetchPoolSetting.INSTANCE.getValue().getEnabled()) {
                j3 = C467340IUi.LIZJ;
            } else {
                enterRoomConfigLJI.mRoomsData.topliveEnterRoomFromCache = true;
                j3 = C467450IUt.LJIIL.getValue().LIZLLL;
            }
            if (j3 > 0) {
                enterRoomConfigLJI.mLogData.topliveCacheDataDuration = SystemClock.uptimeMillis() - j3;
            }
        }
        enterRoomConfigLJI.mRoomsData.roomId = ((FeedItem) ListProtector.get(c0itp.LIZ, 0)).item.getId();
        enterRoomConfigLJI.mRoomsData.fromClickTopLive = true;
        FeedItem feedItem = (FeedItem) ListProtector.get(c0itp.LIZ, 0);
        if (feedItem != null && feedItem.getRoom() != null && feedItem.getRoom().getOwner() != null && feedItem.getRoom().getOwner().getFollowInfo() != null) {
            enterRoomConfigLJI.mRoomsData.followStatus = String.valueOf(feedItem.getRoom().getOwner().getFollowInfo().getFollowStatus());
        }
        Context contextLJII = C497740JfY.LJII();
        if (!z && z2) {
            C0IU0.LIZJ(1, ((FeedItem) ListProtector.get(c0itp.LIZ, 0)).getRoom().getId());
        }
        LJIIZILJ(contextLJII, enterRoomConfigLJI);
    }
}
