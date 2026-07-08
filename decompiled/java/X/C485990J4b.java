package X;

import com.bytedance.android.livesdk.livesetting.watchlive.LiveGameMultiStreamWatch;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.LiveStreamUrlExtra;
import com.ss.android.ugc.aweme.feed.model.live.StreamUrlStruct;
import com.ss.android.ugc.aweme.follow.presenter.RoomStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0J4b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C485990J4b {
    public static Map LIZ(Map map) {
        HashMap map2 = new HashMap();
        C1A57.LIZ.getClass();
        if (!C1A57.LIZJ() && map != null) {
            Object obj = map.get("bottombar_content_type");
            Object obj2 = "";
            if (obj == null) {
                obj = "";
            }
            map2.put("bottom_bar_type", obj);
            Object obj3 = map.get("bottombar_content");
            if (obj3 == null) {
                obj3 = "";
            }
            map2.put("bottombar_content", obj3);
            Object obj4 = map.get("bottombar_content_tag");
            if (obj4 != null) {
                obj2 = obj4;
            }
            map2.put("bottombar_content_tag", obj2);
        }
        return map2;
    }

    public static void LIZJ(LiveRoomStruct liveRoomStruct, EnterRoomConfig enterRoomConfig) {
        Object c098200Yq;
        String str;
        int i;
        LiveStreamUrlExtra.SrConfig srConfig;
        Long lValueOf;
        Integer numValueOf;
        String str2;
        if (liveRoomStruct != null) {
            enterRoomConfig.mRoomsData.roomId = liveRoomStruct.id;
            LiveStreamUrlExtra.SrConfig srConfig2 = null;
            try {
                Long lLJIILIIL = C2095008Iq.LJIILIIL(liveRoomStruct.idStr);
                if (lLJIILIIL != null) {
                    long jLongValue = lLJIILIIL.longValue();
                    if (jLongValue > 0 && jLongValue != liveRoomStruct.id) {
                        enterRoomConfig.mRoomsData.roomId = jLongValue;
                        HashMap map = new HashMap();
                        map.put("id_str", lLJIILIIL.toString());
                        map.put(FollowStatusChangeMethod.PARAM_UID, String.valueOf(liveRoomStruct.id));
                        map.put("anchor_id", String.valueOf(liveRoomStruct.getAnchorId()));
                        String requestId = liveRoomStruct.getRequestId();
                        if (requestId == null) {
                            requestId = "";
                        }
                        map.put("request_id", requestId);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("RoomId Exception, ");
                        sbLIZ.append(map);
                        C20441214yg.LJ("LiveWatcherUtils", C2188811AlT.LIZIZ(sbLIZ));
                        C1AF0.LJI(new Throwable("RoomId Exception"), "RoomId Exception", map);
                    }
                    c098200Yq = Unit.LIZ;
                } else {
                    c098200Yq = null;
                }
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C20441214yg.LJI("LiveWatcherUtils", thM5exceptionOrNullimpl);
            }
            String str3 = enterRoomConfig.mLogData.requestId;
            if ((str3 == null || str3.length() == 0) && C123100dR.LIZ(liveRoomStruct.getRequestId())) {
                enterRoomConfig.mLogData.requestId = liveRoomStruct.getRequestId();
            }
            String str4 = enterRoomConfig.mLogData.logId;
            if ((str4 == null || str4.length() == 0) && (str = liveRoomStruct.logId) != null && C123100dR.LIZ(str)) {
                enterRoomConfig.mLogData.logId = liveRoomStruct.logId;
            }
            enterRoomConfig.mLogData.forcedLowLatency = liveRoomStruct.getForceLowLatency();
            enterRoomConfig.mRoomsData.userId = String.valueOf(liveRoomStruct.userId);
            EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
            User user = liveRoomStruct.owner;
            if (user != null && user.isAccuratePrivateAccount()) {
                i = 1;
            } else {
                i = 0;
            }
            roomsData.isSecret = i;
            enterRoomConfig.mRoomsData.hasCommerceGoods = Boolean.valueOf(liveRoomStruct.hasCommerceGoods);
            enterRoomConfig.mRoomsData.isSubOnlyLive = liveRoomStruct.liveSubOnly;
            String multiStreamData = liveRoomStruct.getMultiStreamData();
            String multiStreamDefaultQualitySdkKey = liveRoomStruct.getMultiStreamDefaultQualitySdkKey();
            int iOrdinal = RoomStruct.getStreamType(liveRoomStruct).ordinal();
            LiveStreamUrlExtra streamUrlExtra = liveRoomStruct.getStreamUrlExtra();
            if (streamUrlExtra != null) {
                srConfig = streamUrlExtra.getSrConfig();
            } else {
                srConfig = null;
            }
            String options = liveRoomStruct.getOptions();
            StreamUrlStruct streamUrlStruct = liveRoomStruct.stream_url;
            if (streamUrlStruct != null) {
                lValueOf = Long.valueOf(streamUrlStruct.aliveTimestamp);
            } else {
                lValueOf = null;
            }
            StreamUrlStruct streamUrlStruct2 = liveRoomStruct.stream_url;
            if (streamUrlStruct2 != null) {
                numValueOf = Integer.valueOf(streamUrlStruct2.drmType);
            } else {
                numValueOf = null;
            }
            StreamUrlStruct streamUrlStruct3 = liveRoomStruct.stream_url;
            if (streamUrlStruct3 != null) {
                str2 = streamUrlStruct3.streamLanguage;
            } else {
                str2 = null;
            }
            C0J4Y.LIZLLL(enterRoomConfig, multiStreamData, multiStreamDefaultQualitySdkKey, iOrdinal, srConfig, options, lValueOf, numValueOf, str2);
            enterRoomConfig.mRoomsData.enlargeView = C0J4Y.LIZIZ(liveRoomStruct.previewEnlargeViewInfo);
            if (liveRoomStruct.multiStreamScene == 1 && LiveGameMultiStreamWatch.INSTANCE.isExperimentGroup() && liveRoomStruct.getLiveStudioExtraStreamData() != null && liveRoomStruct.getLiveStudioExtraStreamDefaultQualitySdkKey() != null) {
                String liveStudioExtraStreamData = liveRoomStruct.getLiveStudioExtraStreamData();
                String liveStudioExtraStreamDefaultQualitySdkKey = liveRoomStruct.getLiveStudioExtraStreamDefaultQualitySdkKey();
                int iOrdinal2 = RoomStruct.getStreamType(liveRoomStruct).ordinal();
                LiveStreamUrlExtra liveStudioStreamUrlExtra = liveRoomStruct.getLiveStudioStreamUrlExtra();
                if (liveStudioStreamUrlExtra != null) {
                    srConfig2 = liveStudioStreamUrlExtra.getSrConfig();
                }
                C0J4Y.LJ(enterRoomConfig, liveStudioExtraStreamData, liveStudioExtraStreamDefaultQualitySdkKey, iOrdinal2, srConfig2, liveRoomStruct.getOptions(), Boolean.valueOf(liveRoomStruct.isMainStreamHorizontal()));
            }
        }
    }

    public static void LIZLLL(Aweme aweme, EnterRoomConfig enterRoomConfig) {
        if (aweme != null) {
            LIZJ(AwemeExtKt.getNewLiveRoomDataExt(aweme), enterRoomConfig);
        }
    }

    public static final List<EnterRoomConfig> LIZIZ(List<? extends Aweme> list, InterfaceC486120J4o interfaceC486120J4o, InterfaceC486070J4j interfaceC486070J4j) {
        EnterRoomConfig.SearchWrapData searchWrapData;
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        for (Aweme aweme : list) {
            EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
            LIZLLL(aweme, enterRoomConfig);
            if (interfaceC486120J4o != null) {
                interfaceC486120J4o.LIZIZ(aweme, enterRoomConfig);
                interfaceC486120J4o.LIZ(aweme, enterRoomConfig);
                interfaceC486120J4o.LIZJ(aweme, enterRoomConfig);
            }
            if (interfaceC486070J4j != null && (searchWrapData = enterRoomConfig.mSearchData) != null) {
                searchWrapData.listProviderTag = String.valueOf(interfaceC486070J4j.hashCode());
            }
            arrayList.add(enterRoomConfig);
        }
        return arrayList;
    }

    public static EnterRoomConfig LJ(long j, String str, String str2) {
        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
        roomsData.roomId = j;
        EnterRoomConfig.TimeStamp timeStamp = roomsData.timeStamps;
        if (timeStamp != null) {
            timeStamp.enterRoomStarTimeReal = System.currentTimeMillis();
        }
        EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.mRoomsData;
        roomsData2.enterFromMerge = str;
        roomsData2.enterMethod = str2;
        roomsData2.enterRoomScene = "outside_with_feed";
        return enterRoomConfig;
    }
}
