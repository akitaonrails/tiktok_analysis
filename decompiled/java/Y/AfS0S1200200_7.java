package Y;

import X.C09JN;
import X.C0IKP;
import X.C0IOL;
import X.C0ITM;
import X.C0IU7;
import X.C1161920gLG;
import X.C13LP;
import X.C13LQ;
import X.C1C7U;
import X.C1CC2;
import X.C20441214yg;
import X.C2093608Ic;
import X.C2188811AlT;
import X.C464330IIt;
import X.C464950ILd;
import X.C465050ILn;
import X.C465330IMp;
import X.C465340IMq;
import X.C466200IPy;
import X.C501470JlZ;
import X.C786410Ut5;
import X.InterfaceC468260IXw;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.list.MultiPlusFeedRoomListProvider;
import com.bytedance.android.livesdk.livesetting.feed.GameLiveBottomBarSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveQuickReturnOptSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveLoadMoreOptSetting;
import com.bytedance.android.livesdk.model.Extra;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdk.model.FlareInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class AfS0S1200200_7 implements C09JN {
    public final int $t;
    public long j3;
    public long j4;
    public Object l1;
    public Object l2;
    public String s0;

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
        }
    }

    public static final void accept$0(AfS0S1200200_7 afS0S1200200_7, Object obj) {
        C464950ILd c464950ILd = (C464950ILd) afS0S1200200_7.l1;
        long j = afS0S1200200_7.j3;
        Handler handler = (Handler) afS0S1200200_7.l2;
        long j2 = afS0S1200200_7.j4;
        String str = afS0S1200200_7.s0;
        BaseResponse baseResponse = (BaseResponse) obj;
        c464950ILd.getClass();
        C1C7U.LIZ("RoomManager@6c79.notifyEnterRoomToRemote$1L");
        if (LiveQuickReturnOptSetting.getMockStatusCode() != 0) {
            C501470JlZ c501470JlZ = new C501470JlZ(LiveQuickReturnOptSetting.getMockStatusCode());
            C465050ILn.LIZIZ(j, "live_room_enter_end");
            if (handler != null) {
                Message messageObtainMessage = handler.obtainMessage(4);
                messageObtainMessage.obj = c501470JlZ;
                C786410Ut5.LJLJJL(handler, messageObtainMessage);
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - j2;
            C465050ILn.LJI(j);
            C464950ILd.LJIIJJI(j, c501470JlZ, jCurrentTimeMillis, str);
        } else {
            C466200IPy.LIZ(baseResponse);
            if (handler != null) {
                Message messageObtainMessage2 = handler.obtainMessage(57);
                messageObtainMessage2.arg1 = 0;
                C786410Ut5.LJLJJL(handler, messageObtainMessage2);
            }
        }
        C1C7U.LIZIZ("RoomManager@6c79.notifyEnterRoomToRemote$1L");
    }

    public static final void accept$1(AfS0S1200200_7 afS0S1200200_7, Object obj) {
        C464950ILd c464950ILd = (C464950ILd) afS0S1200200_7.l1;
        long j = afS0S1200200_7.j3;
        Handler handler = (Handler) afS0S1200200_7.l2;
        long j2 = afS0S1200200_7.j4;
        String str = afS0S1200200_7.s0;
        c464950ILd.getClass();
        C1C7U.LIZ("RoomManager@6c79.notifyEnterRoomToRemote$2L");
        C465050ILn.LIZIZ(j, "live_room_enter_end");
        if (handler != null) {
            Message messageObtainMessage = handler.obtainMessage(4);
            messageObtainMessage.obj = obj;
            C786410Ut5.LJLJJL(handler, messageObtainMessage);
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - j2;
        C465050ILn.LJI(j);
        C464950ILd.LJIIJJI(j, obj, jCurrentTimeMillis, str);
        C1C7U.LIZIZ("RoomManager@6c79.notifyEnterRoomToRemote$2L");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$2(AfS0S1200200_7 afS0S1200200_7, Object obj) {
        String str;
        String str2;
        List arrayList;
        MultiPlusFeedRoomListProvider multiPlusFeedRoomListProvider = (MultiPlusFeedRoomListProvider) afS0S1200200_7.l1;
        long j = afS0S1200200_7.j3;
        Map map = (Map) afS0S1200200_7.l2;
        long j2 = afS0S1200200_7.j4;
        String str3 = afS0S1200200_7.s0;
        C0ITM c0itm = (C0ITM) obj;
        multiPlusFeedRoomListProvider.getClass();
        C1C7U.LIZ("MultiPlusFeedRoomListProvider@8180.loadMore$1L");
        if (c0itm != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jUptimeMillis = SystemClock.uptimeMillis();
            C465340IMq c465340IMq = new C465340IMq();
            c465340IMq.LIZ = "draw";
            c465340IMq.LIZLLL = c0itm.LIZLLL;
            c465340IMq.LJ = "/webcast/feed/";
            c465340IMq.LJFF = c0itm.LJFF;
            C465330IMp.LIZ(j, jCurrentTimeMillis, jUptimeMillis, c465340IMq.LIZ(), c0itm.LIZIZ, c0itm.LIZJ);
            str = c0itm.LIZLLL;
            multiPlusFeedRoomListProvider.LLJLILLLLZIIL = str;
        } else {
            str = "";
        }
        Pair pair = (Pair) c0itm.LIZ;
        int i = 1;
        multiPlusFeedRoomListProvider.LLJLL++;
        if (((List) pair.first).size() > 0) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        } else {
            str2 = "-123";
        }
        multiPlusFeedRoomListProvider.LLJLLIL = str2;
        map.put("request_time", Long.valueOf(SystemClock.elapsedRealtime() - j2));
        map.put("error_code", multiPlusFeedRoomListProvider.LLJLLIL);
        map.put("enter_from_merge", multiPlusFeedRoomListProvider.LLJI.mRoomsData.enterFromMerge);
        map.put("enter_method", multiPlusFeedRoomListProvider.LLJI.mRoomsData.enterMethod);
        Object obj2 = pair.second;
        if (obj2 != null) {
            map.put("has_more", Boolean.valueOf(((Extra) obj2).hasMore));
        }
        C0IOL.LJJIZ(map);
        Object obj3 = pair.second;
        if (obj3 == null) {
            multiPlusFeedRoomListProvider.LLJIJIL = false;
            C1C7U.LIZIZ("MultiPlusFeedRoomListProvider@8180.loadMore$1L");
            return;
        }
        multiPlusFeedRoomListProvider.LLJILLL = (FeedExtra) obj3;
        String[] strArr = C0IKP.LIZ;
        if (str3 != null && GameLiveBottomBarSetting.INSTANCE.isEnable() && C0IKP.LIZIZ.contains(str3) && !multiPlusFeedRoomListProvider.LLJL && !multiPlusFeedRoomListProvider.LLJILLL.hasMore) {
            multiPlusFeedRoomListProvider.LLJL = true;
        }
        List<FeedItem> list = (List) pair.first;
        FeedExtra feedExtra = (FeedExtra) pair.second;
        if (list != null && !list.isEmpty()) {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            boolean z = false;
            for (FeedItem feedItem : list) {
                if (!feedItem.isVariantCard()) {
                    if (feedItem.item == null) {
                        try {
                            Room room = feedItem.getRoom();
                            feedItem.item = room;
                            int i2 = feedItem.type;
                            if ((i2 == i || i2 == 2) && (room instanceof Room)) {
                                room.setLog_pb(feedItem.logPb);
                                room.getOwner().setLogPb(feedItem.logPb);
                                room.setRequestId(feedItem.resId);
                                room.isFromRecommendCard = feedItem.isRecommendCard;
                                feedItem.item = room;
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                    InterfaceC468260IXw interfaceC468260IXw = feedItem.item;
                    if (interfaceC468260IXw instanceof Room) {
                        Room room2 = (Room) interfaceC468260IXw;
                        if (multiPlusFeedRoomListProvider.LLJJIJIIJIL.longValue() == room2.getOwner().getLiveRoomId()) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("Remove duplicate room ");
                            sbLIZ.append(multiPlusFeedRoomListProvider.LLJJIJIIJIL);
                            C20441214yg.LIZIZ("MultiPlusFeedRoomListProvider", C2188811AlT.LIZIZ(sbLIZ));
                        } else if (!multiPlusFeedRoomListProvider.LLJJJJJIL.contains(Long.valueOf(room2.getId()))) {
                            EnterRoomConfig enterRoomConfigLIZJ = C464330IIt.LIZJ(false, room2);
                            if (C2093608Ic.LJ(enterRoomConfigLIZJ.mStreamData.pullStreamData) && C2093608Ic.LJ(enterRoomConfigLIZJ.mStreamData.pullStreamUrl)) {
                                z = true;
                            }
                            FlareInfo flareInfo = feedItem.flareInfo;
                            if (flareInfo != null) {
                                EnterRoomConfig.RoomsData roomsData = enterRoomConfigLIZJ.mRoomsData;
                                roomsData.isShowFlare = flareInfo.isFlare;
                                roomsData.flareTaskId = flareInfo.taskId;
                            }
                            EnterRoomConfig.RoomsData roomsData2 = enterRoomConfigLIZJ.mRoomsData;
                            roomsData2.isFresh = feedItem.isFresh;
                            roomsData2.serverLogId = str;
                            roomsData2.isSubOnlyLive = room2.liveSubOnly;
                            roomsData2.recommendApiEndTimestamp = jCurrentTimeMillis2;
                            multiPlusFeedRoomListProvider.LLJJJJJIL.add(Long.valueOf(room2.getId()));
                            boolean z2 = multiPlusFeedRoomListProvider.LLJJ;
                            if (z2) {
                                EnterRoomConfig.RoomsData roomsData3 = enterRoomConfigLIZJ.mRoomsData;
                                roomsData3.fromNewStyle = z2;
                                roomsData3.fromDrawerStyle = multiPlusFeedRoomListProvider.LLJJI;
                                roomsData3.enterFromLiveSource = multiPlusFeedRoomListProvider.LLJJIII;
                                roomsData3.feedUrl = multiPlusFeedRoomListProvider.LLJJJJ;
                                roomsData3.windowMode = "full_screen";
                            }
                            ((ArrayList) multiPlusFeedRoomListProvider.LLJJIJIL).add(room2);
                            ((ArrayList) multiPlusFeedRoomListProvider.LLJJJ).add(enterRoomConfigLIZJ);
                            if (feedExtra != null && !TextUtils.isEmpty(feedExtra.unreadExtra)) {
                                enterRoomConfigLIZJ.mRoomsData.unreadExtra = feedExtra.unreadExtra;
                            }
                            EnterRoomConfig enterRoomConfig = multiPlusFeedRoomListProvider.LLJI;
                            if (enterRoomConfig != null) {
                                enterRoomConfigLIZJ.mRoomsData.gameLiveExtra = enterRoomConfig.mRoomsData.gameLiveExtra;
                            }
                        }
                    }
                }
                i = 1;
            }
            if (z) {
                HashMap map2 = new HashMap();
                map2.put("logid", C0IU7.LIZIZ.LIZ.get("/webcast/feed/"));
                C1CC2.LJII(0, "ttlive_webcast_feed_empty_stream", map2);
            }
            if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline() || ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLiveInhouse()) {
                for (int i3 = 0; i3 < list.size(); i3++) {
                    FeedItem feedItem2 = (FeedItem) ListProtector.get(list, i3);
                    if (feedItem2 != null && feedItem2.getRoom() != null) {
                        multiPlusFeedRoomListProvider.LLILZIL.put(Long.valueOf(feedItem2.getRoom().getId()), feedItem2.debugInfo);
                        multiPlusFeedRoomListProvider.LLILZLL.put(Long.valueOf(feedItem2.getRoom().getId()), feedExtra.oceanReqInfo);
                    }
                }
            }
        }
        if (C0IKP.LIZ(multiPlusFeedRoomListProvider.LLJI) || C0IKP.LIZLLL(multiPlusFeedRoomListProvider.LLJI)) {
            EnterRoomConfig enterRoomConfig2 = multiPlusFeedRoomListProvider.LLJI;
            List<Room> list2 = multiPlusFeedRoomListProvider.LLJJIJIL;
            if (enterRoomConfig2 != null && list2 != null) {
                long[] jArr = enterRoomConfig2.mRoomsData.roomIds;
                if (jArr != null) {
                    arrayList = C13LQ.LJL(jArr);
                } else {
                    arrayList = new ArrayList();
                }
                for (Room room3 : (ArrayList) list2) {
                    if (!arrayList.contains(Long.valueOf(room3.getId()))) {
                        arrayList.add(Long.valueOf(room3.getId()));
                    }
                }
                enterRoomConfig2.mRoomsData.roomIds = C13LP.LLIIIILZ(arrayList);
            }
        }
        multiPlusFeedRoomListProvider.LJIILJJIL();
        multiPlusFeedRoomListProvider.LLJIJIL = false;
        LiveLoadMoreOptSetting.INSTANCE.resetHasTry();
        C1C7U.LIZIZ("MultiPlusFeedRoomListProvider@8180.loadMore$1L");
    }

    public AfS0S1200200_7(Object obj, long j, Object obj2, long j2, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.j3 = j;
        this.l2 = obj2;
        this.j4 = j2;
        this.s0 = str;
    }
}
