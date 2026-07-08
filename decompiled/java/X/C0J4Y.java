package X;

import com.bytedance.android.livesdkapi.depend.model.live.CustomTab;
import com.bytedance.android.livesdkapi.depend.model.live.CustomTabInfo;
import com.bytedance.android.livesdkapi.depend.model.live.CustomTabs;
import com.bytedance.android.livesdkapi.depend.model.live.EnlargeViewInfo;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStatesTag;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.LiveStreamUrlExtra;
import com.ss.android.ugc.aweme.feed.model.live.PreviewCustomTab;
import com.ss.android.ugc.aweme.feed.model.live.PreviewCustomTabInfo;
import com.ss.android.ugc.aweme.feed.model.live.PreviewCustomTabs;
import com.ss.android.ugc.aweme.feed.model.live.PreviewEnlargeViewInfo;
import com.ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0J4Y, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J4Y {
    public static final boolean LIZ(Aweme aweme) {
        if (aweme != null && !AwemeExtKt.isCard(aweme) && !AwemeSaaSExtKt.isLive(aweme) && aweme.getAuthor() != null && !C2093608Ic.LJ(aweme.getAuthor().getUid())) {
            return true;
        }
        return false;
    }

    public static final EnlargeViewInfo LIZIZ(PreviewEnlargeViewInfo previewEnlargeViewInfo) {
        if (previewEnlargeViewInfo == null) {
            return null;
        }
        EnlargeViewInfo enlargeViewInfo = new EnlargeViewInfo();
        enlargeViewInfo.enablerEnlargeView = previewEnlargeViewInfo.enablerEnlargeView;
        enlargeViewInfo.portraitView = previewEnlargeViewInfo.portraitView;
        enlargeViewInfo.landscapeView = previewEnlargeViewInfo.landscapeView;
        return enlargeViewInfo;
    }

    public static final PreviewCustomTabInfo LIZJ(CustomTabInfo customTabInfo) {
        if (customTabInfo == null) {
            return null;
        }
        PreviewCustomTabInfo previewCustomTabInfo = new PreviewCustomTabInfo();
        PreviewCustomTabs previewCustomTabs = new PreviewCustomTabs();
        previewCustomTabInfo.customTabs = previewCustomTabs;
        CustomTabs customTabs = customTabInfo.customTabs;
        if (customTabs == null) {
            return previewCustomTabInfo;
        }
        previewCustomTabs.id = customTabs.id;
        previewCustomTabs.beginTime = customTabs.beginTime;
        previewCustomTabs.endTime = customTabs.endTime;
        previewCustomTabs.anchorId = customTabs.anchorId;
        previewCustomTabs.roomId = customTabs.roomId;
        previewCustomTabs.defaultTabIndex = customTabs.defaultTabIndex;
        List<CustomTab> list = customTabs.customTabList;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (CustomTab customTab : list) {
            PreviewCustomTab previewCustomTab = new PreviewCustomTab();
            previewCustomTab.id = customTab.id;
            previewCustomTab.tabTitle = customTab.tabTitle;
            previewCustomTab.tabSchema = customTab.tabSchema;
            previewCustomTab.tabSchemaType = customTab.tabSchemaType;
            previewCustomTab.tabPriority = customTab.tabPriority;
            previewCustomTab.tabBizName = customTab.tabBizName;
            arrayList.add(previewCustomTab);
        }
        previewCustomTabs.customTabList = new ArrayList(arrayList);
        return previewCustomTabInfo;
    }

    public static final LiveRoomStruct LJI(Aweme aweme) {
        if (aweme != null) {
            LiveRoomStruct newLiveRoomDataExt = AwemeExtKt.getNewLiveRoomDataExt(aweme);
            if (newLiveRoomDataExt == null) {
                RoomFeedCellStruct roomFeedCellStruct = aweme.getRoomFeedCellStruct();
                if (roomFeedCellStruct != null) {
                    return roomFeedCellStruct.getNewLiveRoomData();
                }
                return null;
            }
            return newLiveRoomDataExt;
        }
        return null;
    }

    public static final boolean LJIIIIZZ(Aweme aweme) {
        LiveRoomStruct liveRoomStructLJI = LJI(aweme);
        if (aweme != null && liveRoomStructLJI != null && AwemeSaaSExtKt.isLive(aweme) && liveRoomStructLJI.id != 0) {
            return true;
        }
        return false;
    }

    public static final String LJFF(LiveRoomStruct liveRoomStruct, String str) {
        String str2 = liveRoomStruct.originReqId;
        if (str2 == null) {
            if (str == null) {
                return "";
            }
            return str;
        }
        return str2;
    }

    public static final String LJII(Aweme aweme, String str) {
        List<LiveRoomStatesTag> liveExtraInfoStruct;
        if (aweme != null && (liveExtraInfoStruct = aweme.getLiveExtraInfoStruct()) != null) {
            for (LiveRoomStatesTag liveRoomStatesTag : liveExtraInfoStruct) {
                if (Intrinsics.LJFF(liveRoomStatesTag.tagKey, str)) {
                    return liveRoomStatesTag.tagValue;
                }
            }
        }
        return null;
    }

    public static final void LJ(EnterRoomConfig enterRoomConfig, String str, String str2, int i, LiveStreamUrlExtra.SrConfig srConfig, String str3, Boolean bool) {
        boolean zBooleanValue;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = true;
        }
        EnterRoomConfig.StreamData streamData = enterRoomConfig.mSubStreamData;
        streamData.pullSDKParam = null;
        streamData.pullStreamData = str;
        streamData.pullDefaultResolution = str2;
        streamData.streamType = i;
        streamData.options = str3;
        if (srConfig != null) {
            streamData.extraStreamSREnable = srConfig.enabled;
            streamData.extraStreamSRAntiAlias = srConfig.antiAlias;
            streamData.extraStreamSRStrength = srConfig.strength;
        }
        streamData.isMultiStreamMode = true;
        streamData.isHorizontalStream = !zBooleanValue;
        EnterRoomConfig.StreamData streamData2 = enterRoomConfig.mStreamData;
        streamData2.isMultiStreamMode = true;
        streamData2.isHorizontalStream = zBooleanValue;
    }

    public static final void LIZLLL(EnterRoomConfig enterRoomConfig, String str, String str2, int i, LiveStreamUrlExtra.SrConfig srConfig, String str3, Long l, Integer num, String str4) {
        EnterRoomConfig.StreamData streamData = enterRoomConfig.mStreamData;
        streamData.pullSDKParam = null;
        streamData.pullStreamData = str;
        streamData.pullDefaultResolution = str2;
        streamData.streamType = i;
        streamData.options = str3;
        if (srConfig != null) {
            streamData.extraStreamSREnable = srConfig.enabled;
            streamData.extraStreamSRAntiAlias = srConfig.antiAlias;
            streamData.extraStreamSRStrength = srConfig.strength;
        }
        if (l != null) {
            streamData.aliveTimestamp = Long.valueOf(l.longValue());
        }
        if (num != null) {
            streamData.drmType = Integer.valueOf(num.intValue());
        }
        if (str4 != null) {
            streamData.streamLanguage = str4;
        }
    }
}
