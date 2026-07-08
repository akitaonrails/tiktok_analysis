package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.anchor.LiveShowAnchorViewModel;
import com.bytedance.android.live.liveinteract.multilive.model.ShowAgainGuestResponse;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.dataChannel.StreamTranslationSwitchData;
import com.bytedance.android.livesdk.gift.model.GiftRealTimeUpdateResponse;
import com.bytedance.android.livesdk.gift.model.GiftRecommendInfo;
import com.bytedance.android.livesdk.gift.model.MinuteGameFinishParams;
import com.bytedance.android.livesdk.gift.model.MinuteGameGetRoomActiveGameplayResponse;
import com.bytedance.android.livesdk.minute_game.model.MinuteGameGameplay;
import com.bytedance.android.livesdk.sticker.game.IMinuteGameApi;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function1;
import webcast.data.multi_guest_play.ShowContent;
import webcast.data.multi_guest_play.ShowListUser;

/* JADX INFO: renamed from: X.01zm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C516401zm implements C09JN {
    public final int $t;
    public long j1;
    public Object l0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
            case 6:
                accept$6(this, obj);
                break;
            case 7:
                accept$7(this, obj);
                break;
        }
    }

    public C516401zm(TimeUnit timeUnit, int i) {
        this.$t = i;
        this.j1 = 1L;
        this.l0 = timeUnit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$0(C516401zm c516401zm, Object obj) {
        List<ShowListUser> list;
        C1C7U.LIZ("LiveShowAnchorViewModel@f562.showAgainGuest$1");
        LiveShowAnchorViewModel liveShowAnchorViewModel = (LiveShowAnchorViewModel) c516401zm.l0;
        ShowContent showContent = ((ShowAgainGuestResponse.ResponseData) ((BaseResponse) obj).data).showContent;
        List<ShowListUser> list2 = null;
        if (showContent != null) {
            list = showContent.showingAndReadyList;
            list2 = showContent.finishedList;
        } else {
            list = null;
        }
        liveShowAnchorViewModel.AQ2(list, list2, false);
        C20441214yg.LIZIZ("LiveShowAnchorViewModel", "show again guest successful");
        if (C306901Gx.LJI.contains(Long.valueOf(c516401zm.j1))) {
            C306901Gx.LJI.remove(Long.valueOf(c516401zm.j1));
        }
        C1C7U.LIZIZ("LiveShowAnchorViewModel@f562.showAgainGuest$1");
    }

    public static final void accept$1(C516401zm c516401zm, Object obj) {
        C1C7U.LIZ("PollApiTryModeProxy@a99e.endCustomPoll$1");
        ((C425401l6) c516401zm.l0).LIZ(c516401zm.j1);
        C1C7U.LIZIZ("PollApiTryModeProxy@a99e.endCustomPoll$1");
    }

    public static final void accept$2(C516401zm c516401zm, Object obj) {
        C1C7U.LIZ("CompetitionTimerManager@5b2f.startInterval$3");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startInterval, period=");
        sbLIZ.append(c516401zm.j1);
        sbLIZ.append(", unit=");
        sbLIZ.append((TimeUnit) c516401zm.l0);
        sbLIZ.append(", throwable=");
        sbLIZ.append(obj);
        C20441214yg.LJ("CompetitionTimerManager", C2188811AlT.LIZIZ(sbLIZ));
        C1C7U.LIZIZ("CompetitionTimerManager@5b2f.startInterval$3");
    }

    public static final void accept$3(C516401zm c516401zm, Object obj) {
        C1C7U.LIZ("TimedCompetitionScoreBarManager@2fad.onStartCompetition$3");
        ((C1099560eig) c516401zm.l0).LJIIIIZZ(c516401zm.j1 - ((Long) obj).longValue());
        C1C7U.LIZIZ("TimedCompetitionScoreBarManager@2fad.onStartCompetition$3");
    }

    public static final void accept$4(C516401zm c516401zm, Object obj) {
        C1C7U.LIZ("StreamTranslationManager@2d8d.switchTranslation$1");
        if (((BaseResponse) obj).statusCode == 0) {
            DataChannelGlobal.LLILZ.HQ2(StreamTranslationSwitchData.class, Long.valueOf(c516401zm.j1));
            ((Function1) c516401zm.l0).invoke(Boolean.TRUE);
        } else {
            ((Function1) c516401zm.l0).invoke(Boolean.FALSE);
        }
        C1C7U.LIZIZ("StreamTranslationManager@2d8d.switchTranslation$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$5(C516401zm c516401zm, Object obj) {
        GiftRealTimeUpdateResponse.Data data;
        GiftRecommendInfo giftRecommendInfo;
        C1C7U.LIZ("RecommendGiftWrapper@7109.getRealTimeRecommendGift$dispose$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse != null) {
            data = (GiftRealTimeUpdateResponse.Data) baseResponse.data;
        } else {
            data = null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - c516401zm.j1;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RealTimeApi,duration = ");
        sbLIZ.append(jCurrentTimeMillis);
        C20441214yg.LIZIZ("RecommendGiftWrapper", C2188811AlT.LIZIZ(sbLIZ));
        if (data != null) {
            Map<Long, Long> map = data.rerankPositionToGiftid;
            Map<Long, GiftRecommendInfo> map2 = data.giftidToRecommendInfo;
            ((C012H) c516401zm.l0).LJII.LIZ = data.strategyData;
            if (map != null && !map.isEmpty() && map2 != null && !map2.isEmpty()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Set<Map.Entry<Long, Long>> setEntrySet = map.entrySet();
                C012H c012h = (C012H) c516401zm.l0;
                Iterator<T> it2 = setEntrySet.iterator();
                while (true) {
                    String str = "";
                    if (!it2.hasNext()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it2.next();
                    long jLongValue = ((Number) entry.getKey()).longValue();
                    long jLongValue2 = ((Number) entry.getValue()).longValue();
                    if (map2.containsKey(Long.valueOf(jLongValue2)) && (giftRecommendInfo = map2.get(Long.valueOf(jLongValue2))) != null) {
                        c012h.getClass();
                        C012D c012d = new C012D(jLongValue2, String.valueOf(giftRecommendInfo.recommendReason), giftRecommendInfo.starlingKey, C012H.LIZJ(giftRecommendInfo), !giftRecommendInfo.shouldCallRealtimeAfterSent);
                        c012d.LJIIJ = (int) jLongValue;
                        String str2 = baseResponse.LIZIZ;
                        if (str2 != null) {
                            str = str2;
                        }
                        c012d.LJIIJJI = str;
                        linkedHashMap.put(Long.valueOf(jLongValue2), c012d);
                    }
                }
                ((C012H) c516401zm.l0).LJI = linkedHashMap;
                C1131700fYW.LIZIZ(jCurrentTimeMillis, "");
            } else {
                C20441214yg.LJ("RecommendGiftWrapper", "reraankPositionMap empty");
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("rerankMap.size = ");
                sbLIZ2.append(map.size());
                sbLIZ2.append(", recommendInfoMap.size = ");
                sbLIZ2.append(map2.size());
                C2188811AlT.LIZIZ(sbLIZ2);
                C1131700fYW.LIZIZ(jCurrentTimeMillis, "empty_map");
            }
        }
        if (((C012H) c516401zm.l0).LIZIZ != null) {
            System.currentTimeMillis();
        }
        C012H c012h2 = (C012H) c516401zm.l0;
        c012h2.LIZJ = true;
        C012F c012f = c012h2.LJ;
        if (c012f != null) {
            C20441214yg.LJIIIZ("RecommendGiftWrapper", "realTimeRecommendGift: after response");
            c012h2.LIZ(c012f.LIZ, c012f.LIZIZ, c012f.LIZJ, c012f.LIZLLL, c012f.LJ, c012f.LJFF, c012f.LJI, c012f.LJII);
        }
        C1C7U.LIZIZ("RecommendGiftWrapper@7109.getRealTimeRecommendGift$dispose$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$6(X.C516401zm r11, java.lang.Object r12) {
        /*
            java.lang.String r10 = "GameCreateInfoManager@c493.queryGameCreateInfo$1"
            X.C1C7U.LIZ(r10)
            com.bytedance.android.live.network.response.BaseResponse r12 = (com.bytedance.android.live.network.response.BaseResponse) r12
            if (r12 == 0) goto La3
            int r1 = r12.statusCode
        Lb:
            r2 = 0
            if (r1 != 0) goto L8e
            r1 = 1
            java.lang.String r0 = ""
            X.C163900k1.LIZ(r2, r0, r1)
            r4 = 0
            if (r12 == 0) goto L8c
            T r0 = r12.data
            webcast.api.game.CreateInfoResponse$ResponseData r0 = (webcast.api.game.CreateInfoResponse.ResponseData) r0
        L1b:
            X.C163900k1.LIZ = r0
            if (r12 == 0) goto L8a
            T r0 = r12.data
            webcast.api.game.CreateInfoResponse$ResponseData r0 = (webcast.api.game.CreateInfoResponse.ResponseData) r0
        L23:
            long r2 = r11.j1
            r8 = -1
            java.lang.Long r7 = java.lang.Long.valueOf(r8)
            if (r0 == 0) goto L7d
            long r5 = r0.serverTimestamp
            int r0 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r0 == 0) goto L7d
            long r7 = java.lang.System.currentTimeMillis()
            long r7 = r7 - r2
            r0 = 2
            long r0 = (long) r0
            long r7 = r7 / r0
            long r5 = r5 - r2
            long r5 = r5 - r7
            java.util.Map<java.lang.String, java.lang.Object> r0 = X.C1338270kvh.LIZ
            com.bytedance.ies.sdk.datachannel.DataChannelGlobal r2 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LLILZ
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.ServerAndClientTimeGapGlobalChannel> r1 = com.bytedance.android.livesdk.dataChannel.ServerAndClientTimeGapGlobalChannel.class
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            r2.HQ2(r1, r0)
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.GameCreateInfoRttGlobalChannel> r1 = com.bytedance.android.livesdk.dataChannel.GameCreateInfoRttGlobalChannel.class
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            r2.HQ2(r1, r0)
        L53:
            java.lang.Object r2 = r11.l0
            com.bytedance.ies.sdk.datachannel.DataChannel r2 = (com.bytedance.ies.sdk.datachannel.DataChannel) r2
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.GameRoomCreateInfoChannel> r1 = com.bytedance.android.livesdk.dataChannel.GameRoomCreateInfoChannel.class
            if (r12 == 0) goto L7b
            T r0 = r12.data
        L5d:
            r2.zW(r1, r0)
            java.lang.Object r3 = r11.l0
            com.bytedance.ies.sdk.datachannel.DataChannel r3 = (com.bytedance.ies.sdk.datachannel.DataChannel) r3
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.GameFirstGoLiveTs> r2 = com.bytedance.android.livesdk.dataChannel.GameFirstGoLiveTs.class
            if (r12 == 0) goto L74
            T r0 = r12.data
            webcast.api.game.CreateInfoResponse$ResponseData r0 = (webcast.api.game.CreateInfoResponse.ResponseData) r0
            if (r0 == 0) goto L74
            long r0 = r0.anchorFirstGameGoLiveTs
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
        L74:
            r3.zW(r2, r4)
        L77:
            X.C1C7U.LIZIZ(r10)
            return
        L7b:
            r0 = r4
            goto L5d
        L7d:
            com.bytedance.ies.sdk.datachannel.DataChannelGlobal r1 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LLILZ
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.ServerAndClientTimeGapGlobalChannel> r0 = com.bytedance.android.livesdk.dataChannel.ServerAndClientTimeGapGlobalChannel.class
            r1.HQ2(r0, r7)
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.GameCreateInfoRttGlobalChannel> r0 = com.bytedance.android.livesdk.dataChannel.GameCreateInfoRttGlobalChannel.class
            r1.HQ2(r0, r7)
            goto L53
        L8a:
            r0 = r4
            goto L23
        L8c:
            r0 = r4
            goto L1b
        L8e:
            java.lang.String r0 = "response status code not right."
            X.C163900k1.LIZ(r1, r0, r2)
            java.lang.Object r3 = r11.l0
            com.bytedance.ies.sdk.datachannel.DataChannel r3 = (com.bytedance.ies.sdk.datachannel.DataChannel) r3
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.GameFirstGoLiveTs> r2 = com.bytedance.android.livesdk.dataChannel.GameFirstGoLiveTs.class
            r0 = -2
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.zW(r2, r0)
            goto L77
        La3:
            r1 = -999999(0xfffffffffff0bdc1, float:NaN)
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C516401zm.accept$6(X.01zm, java.lang.Object):void");
    }

    public static final void accept$7(C516401zm c516401zm, Object obj) {
        MinuteGameGameplay minuteGameGameplay;
        final long j;
        Object c098200Yq;
        MinuteGameGetRoomActiveGameplayResponse.Data data;
        C1C7U.LIZ("GameGiftRoomActiveGuard@4319.cleanupIfActive$1$1");
        MinuteGameGetRoomActiveGameplayResponse minuteGameGetRoomActiveGameplayResponse = (MinuteGameGetRoomActiveGameplayResponse) obj;
        if (minuteGameGetRoomActiveGameplayResponse != null && (data = minuteGameGetRoomActiveGameplayResponse.data) != null) {
            minuteGameGameplay = data.gameplay;
        } else {
            minuteGameGameplay = null;
        }
        if (minuteGameGameplay != null) {
            j = minuteGameGameplay.gameplayId;
        } else {
            j = 0;
        }
        if (minuteGameGameplay != null && j != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("room_active_gameplay found orphan: roomId=");
            sbLIZ.append(c516401zm.j1);
            sbLIZ.append(", gameplayId=");
            sbLIZ.append(j);
            sbLIZ.append(", gameType=");
            sbLIZ.append(minuteGameGameplay.gameType);
            sbLIZ.append(", status=");
            sbLIZ.append(minuteGameGameplay.status);
            sbLIZ.append("; firing finish");
            C20441214yg.LJIIIZ("GameGiftRoomActiveGuard__ttlive_gift_render", C2188811AlT.LIZIZ(sbLIZ));
            C155900ij c155900ij = (C155900ij) c516401zm.l0;
            final long j2 = c516401zm.j1;
            c155900ij.getClass();
            MinuteGameFinishParams minuteGameFinishParams = new MinuteGameFinishParams();
            minuteGameFinishParams.roomId = j2;
            minuteGameFinishParams.gameplayId = j;
            minuteGameFinishParams.finishReason = 3;
            try {
                C480460Ism.LIZ().getClass();
                c098200Yq = ((IMinuteGameApi) C480460Ism.LIZLLL(IMinuteGameApi.class)).finish(minuteGameFinishParams).LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.00Y5
                    @Override // X.C09JN
                    public final void accept(Object obj2) {
                        C1C7U.LIZ("GameGiftRoomActiveGuard@4319.sendFinish$1$1");
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("finish (orphan-cleanup) success: roomId=");
                        sbLIZ2.append(j2);
                        sbLIZ2.append(", gameplayId=");
                        sbLIZ2.append(j);
                        C20441214yg.LJIIIZ("GameGiftRoomActiveGuard__ttlive_gift_render", C2188811AlT.LIZIZ(sbLIZ2));
                        C1C7U.LIZIZ("GameGiftRoomActiveGuard@4319.sendFinish$1$1");
                    }
                }, new C09JN() { // from class: X.00Y4
                    @Override // X.C09JN
                    public final void accept(Object obj2) {
                        C1C7U.LIZ("GameGiftRoomActiveGuard@4319.sendFinish$1$2");
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("finish (orphan-cleanup) failed: roomId=");
                        sbLIZ2.append(j2);
                        sbLIZ2.append(", gameplayId=");
                        sbLIZ2.append(j);
                        C20441214yg.LJFF("GameGiftRoomActiveGuard__ttlive_gift_render", C2188811AlT.LIZIZ(sbLIZ2), (Throwable) obj2);
                        C1C7U.LIZIZ("GameGiftRoomActiveGuard@4319.sendFinish$1$2");
                    }
                });
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("finish (orphan-cleanup) dispatch threw, roomId=");
                sbLIZ2.append(j2);
                sbLIZ2.append(", gameplayId=");
                sbLIZ2.append(j);
                C20441214yg.LJFF("GameGiftRoomActiveGuard__ttlive_gift_render", C2188811AlT.LIZIZ(sbLIZ2), thM5exceptionOrNullimpl);
            }
        } else {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("room_active_gameplay clean: no gameplay in flight, roomId=");
            sbLIZ3.append(c516401zm.j1);
            C20441214yg.LJIIIZ("GameGiftRoomActiveGuard__ttlive_gift_render", C2188811AlT.LIZIZ(sbLIZ3));
        }
        C1C7U.LIZIZ("GameGiftRoomActiveGuard@4319.cleanupIfActive$1$1");
    }

    public C516401zm(long j, Object obj, int i) {
        this.$t = i;
        this.j1 = j;
        this.l0 = obj;
    }
}
