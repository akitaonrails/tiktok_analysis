package X;

import Y.AfS1S1100100_7;
import android.content.Context;
import com.bytedance.android.feed.api.ILiveFeedApiService;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdk.model.FlareInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0IXq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C468200IXq {
    public static final C468200IXq LIZ = new C468200IXq();
    public static final C468220IXs LIZIZ = new C468220IXs();

    public static void LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("clearCache called, current cache size: ");
        C468220IXs c468220IXs = LIZIZ;
        sbLIZ.append(c468220IXs.LIZ.size());
        C20441214yg.LIZIZ("GameLiveBottombarFeedProvider", C2188811AlT.LIZIZ(sbLIZ));
        c468220IXs.LIZ.clear();
        c468220IXs.LIZIZ = true;
        c468220IXs.LIZJ = 0L;
        C20441214yg.LIZIZ("GameLiveBottombarFeedProvider", "clearCache completed, cache cleared");
    }

    public static List LIZIZ(List list, FeedExtra feedExtra, String str, String str2, long j, long j2, Map map) {
        Room room;
        Room room2;
        boolean z;
        long id;
        User owner;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("convertFeedItemsToBottomBarItem[heroId] called with ");
        sbLIZ.append(list.size());
        sbLIZ.append(" items, enterFromMerge=");
        sbLIZ.append(str);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(str2);
        sbLIZ.append(", startTime=");
        sbLIZ.append(j);
        C20441214yg.LIZIZ("GameLiveBottombarFeedProvider", C2188811AlT.LIZIZ(sbLIZ));
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            FeedItem feedItem = (FeedItem) ListProtector.get(list, i);
            InterfaceC468260IXw interfaceC468260IXw = feedItem.item;
            String str3 = null;
            if (interfaceC468260IXw instanceof Room) {
                room = (Room) interfaceC468260IXw;
            } else {
                room = null;
            }
            if (room == null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Feed[");
                sbLIZ2.append(j2);
                sbLIZ2.append("] item ");
                sbLIZ2.append(i);
                sbLIZ2.append(" has null or non-Room item: ");
                sbLIZ2.append(feedItem.item);
                C20441214yg.LJIIL("GameLiveBottombarFeedProvider", C2188811AlT.LIZIZ(sbLIZ2));
            } else {
                FeedItem feedItem2 = (FeedItem) ListProtector.get(list, i);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("convertFeedItemToRoomConfig called with feedItem[");
                sbLIZ3.append(i);
                sbLIZ3.append("]:  ");
                sbLIZ3.append(feedItem2);
                sbLIZ3.append(" , enterFromMerge=");
                sbLIZ3.append(str);
                sbLIZ3.append(", enterMethod=");
                sbLIZ3.append(str2);
                sbLIZ3.append(", startTime=");
                sbLIZ3.append(j);
                C20441214yg.LIZIZ("GameLiveBottombarFeedProvider", C2188811AlT.LIZIZ(sbLIZ3));
                InterfaceC468260IXw interfaceC468260IXw2 = feedItem2.item;
                if ((interfaceC468260IXw2 instanceof Room) && (room2 = (Room) interfaceC468260IXw2) != null) {
                    EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
                    C464330IIt.LIZLLL(room2, enterRoomConfig);
                    EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
                    roomsData.enterFromMerge = str;
                    roomsData.enterMethod = str2;
                    roomsData.enterRoomScene = "outside_with_feed";
                    roomsData.fromNewStyle = true;
                    roomsData.windowMode = "full_screen";
                    roomsData.hasMoreExtra = Boolean.valueOf(feedExtra.hasMore);
                    roomsData.maxTimeExtra = feedExtra.maxTime;
                    roomsData.unReadIdExtra = feedExtra.unreadExtra;
                    roomsData.oceanReqInfo = feedExtra.oceanReqInfo;
                    roomsData.position = i;
                    EnterRoomConfig.TimeStamp timeStamp = roomsData.timeStamps;
                    if (timeStamp != null) {
                        timeStamp.enterRoomStarTimeReal = j;
                    }
                    Room room3 = feedItem2.getRoom();
                    if (room3 != null && (owner = room3.getOwner()) != null && owner.getFollowInfo() != null) {
                        roomsData.followStatus = String.valueOf(feedItem2.getRoom().getOwner().getFollowInfo().getFollowStatus());
                    }
                    roomsData.isFresh = feedItem2.isFresh;
                    FlareInfo flareInfo = feedItem2.flareInfo;
                    if (flareInfo != null) {
                        z = flareInfo.isFlare;
                    } else {
                        z = false;
                    }
                    roomsData.isShowFlare = z;
                    if (flareInfo != null) {
                        str3 = flareInfo.taskId;
                    }
                    roomsData.flareTaskId = str3;
                    roomsData.hasCommerceGoods = Boolean.valueOf(room2.hasCommerceGoods);
                    roomsData.gameLiveExtra = map;
                    HashMap<Long, String> map2 = new HashMap<>();
                    Long lValueOf = Long.valueOf(room2.getId());
                    String str4 = feedItem2.debugInfo;
                    if (str4 == null) {
                        str4 = "";
                    }
                    map2.put(lValueOf, str4);
                    enterRoomConfig.mRoomsData.debugInfos = map2;
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("convertFeedItemToRoomConfig completed, returning config: ");
                    sbLIZ4.append(enterRoomConfig);
                    sbLIZ4.append(" room configurations");
                    C20441214yg.LIZIZ("GameLiveBottombarFeedProvider", C2188811AlT.LIZIZ(sbLIZ4));
                    EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.mRoomsData;
                    if (roomsData2 != null) {
                        roomsData2.roomIds = new long[list.size()];
                        int size2 = list.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            Room room4 = ((FeedItem) ListProtector.get(list, i2)).getRoom();
                            if (room4 != null) {
                                id = room4.getId();
                            } else {
                                id = 0;
                            }
                            long[] jArr = enterRoomConfig.mRoomsData.roomIds;
                            if (jArr != null) {
                                jArr[i2] = id;
                            }
                        }
                        C468240IXu c468240IXu = new C468240IXu(room, enterRoomConfig, j2, 8);
                        arrayList.add(c468240IXu);
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append("videoItem[");
                        sbLIZ5.append(j2);
                        sbLIZ5.append("] completed, returning videoItem ");
                        sbLIZ5.append(c468240IXu);
                        sbLIZ5.append(" room configurations");
                        C20441214yg.LIZIZ("GameLiveBottombarFeedProvider", C2188811AlT.LIZIZ(sbLIZ5));
                    }
                } else {
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append("Feed item ");
                    sbLIZ6.append(i);
                    sbLIZ6.append(" has null or non-Room item: ");
                    sbLIZ6.append(feedItem2.item);
                    C20441214yg.LJIIL("GameLiveBottombarFeedProvider", C2188811AlT.LIZIZ(sbLIZ6));
                }
                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                sbLIZ7.append("config[");
                sbLIZ7.append(j2);
                sbLIZ7.append("] item ");
                sbLIZ7.append(i);
                sbLIZ7.append(" has null or non-Room item: ");
                sbLIZ7.append(feedItem.item);
                C20441214yg.LJIIL("GameLiveBottombarFeedProvider", C2188811AlT.LIZIZ(sbLIZ7));
            }
        }
        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
        sbLIZ8.append("convertFeedItemsToRoomConfigs[");
        sbLIZ8.append(j2);
        sbLIZ8.append("] completed, returning ");
        sbLIZ8.append(arrayList.size());
        sbLIZ8.append(" room configurations");
        C20441214yg.LIZIZ("GameLiveBottombarFeedProvider", C2188811AlT.LIZIZ(sbLIZ8));
        return arrayList;
    }

    public static void LIZJ(Context context, final Map map, final String str, final String str2, final String str3, final long j, final C475660Il2 c475660Il2) {
        String str4;
        LinkedHashMap linkedHashMap;
        C11JN c11jnIC;
        String strJ3;
        Map<String, Object> mapL7;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetchFeedData[heroId=");
        sbLIZ.append(j);
        sbLIZ.append("] called with params: context=");
        sbLIZ.append(context);
        sbLIZ.append(", params=");
        sbLIZ.append(map);
        sbLIZ.append(", enterFromMerge=");
        sbLIZ.append(str);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(str2);
        sbLIZ.append(", loadType=");
        sbLIZ.append(str3);
        sbLIZ.append(", callback=");
        sbLIZ.append("provided");
        C20441214yg.LIZIZ("GameLiveBottombarFeedProvider", C2188811AlT.LIZIZ(sbLIZ));
        final long jCurrentTimeMillis = System.currentTimeMillis();
        C468220IXs c468220IXs = LIZIZ;
        c468220IXs.getClass();
        ILiveFeedApiService iLiveFeedApiService = (ILiveFeedApiService) PluggableExtentionKt.pluggableSpi$default(ILiveFeedApiService.class, false, false, false, 14, null);
        if (iLiveFeedApiService != null && (mapL7 = iLiveFeedApiService.L7(-1L)) != null && (mapL7.get("feed_url") instanceof String)) {
            str4 = (String) mapL7.get("feed_url");
        } else {
            str4 = "";
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("fetchFeedData[heroId=");
        sbLIZ2.append(j);
        sbLIZ2.append("] API url ");
        sbLIZ2.append(str4);
        C20441214yg.LIZIZ("GameLiveBottombarFeedProvider", C2188811AlT.LIZIZ(sbLIZ2));
        if (map != null) {
            linkedHashMap = new LinkedHashMap(map);
        } else {
            linkedHashMap = new LinkedHashMap();
        }
        if (Intrinsics.LJFF(str3, "related_live_loadmore")) {
            long j2 = c468220IXs.LIZJ;
            if (j2 > 0) {
                linkedHashMap.put("max_time", String.valueOf(j2));
            }
        }
        if (!linkedHashMap.containsKey("room_ids") && map != null && map.containsKey("roomList")) {
            linkedHashMap.put("room_ids", map.get("roomList"));
        }
        if (!linkedHashMap.containsKey("default_index") && map != null && map.containsKey("defaultIndex")) {
            linkedHashMap.put("default_index", map.get("defaultIndex"));
        }
        if (j >= 0) {
            String str5 = (String) linkedHashMap.get("related_live_tag");
            if (str5 != null) {
                try {
                    JSONObject jSONObject = new JSONObject(str5);
                    if (jSONObject.has("hero_list")) {
                        jSONObject.remove("hero_list");
                    }
                    jSONObject.put("hero_id", String.valueOf(j));
                    strJ3 = C786410Ut5.J3(jSONObject);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    strJ3 = null;
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("fetchFeedData[heroId=");
                sbLIZ3.append(j);
                sbLIZ3.append("] API relatedLiveTag:");
                sbLIZ3.append(str5);
                sbLIZ3.append(", relatedLiveHeroTag:");
                sbLIZ3.append(strJ3);
                C20441214yg.LIZIZ("GameLiveBottombarFeedProvider", C2188811AlT.LIZIZ(sbLIZ3));
                if (strJ3 != null && linkedHashMap.containsKey("related_live_tag")) {
                    linkedHashMap.put("related_live_tag", strJ3);
                }
            } else {
                strJ3 = null;
                StringBuilder sbLIZ32 = C2188811AlT.LIZ();
                sbLIZ32.append("fetchFeedData[heroId=");
                sbLIZ32.append(j);
                sbLIZ32.append("] API relatedLiveTag:");
                sbLIZ32.append(str5);
                sbLIZ32.append(", relatedLiveHeroTag:");
                sbLIZ32.append(strJ3);
                C20441214yg.LIZIZ("GameLiveBottombarFeedProvider", C2188811AlT.LIZIZ(sbLIZ32));
                if (strJ3 != null) {
                    linkedHashMap.put("related_live_tag", strJ3);
                }
            }
        }
        ILiveFeedApiService iLiveFeedApiService2 = (ILiveFeedApiService) C1161920gLG.LIZJ(ILiveFeedApiService.class);
        if (iLiveFeedApiService2 != null && (c11jnIC = iLiveFeedApiService2.IC(str, str4, str3, linkedHashMap)) != null) {
            c11jnIC.LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0IXr
                /* JADX WARN: Removed duplicated region for block: B:73:0x022f  */
                @Override // X.C09JN
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void accept(java.lang.Object r27) {
                    /*
                        Method dump skipped, instruction units count: 586
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C468210IXr.accept(java.lang.Object):void");
                }
            }, new AfS1S1100100_7(j, c475660Il2, str3, 2));
        }
    }
}
