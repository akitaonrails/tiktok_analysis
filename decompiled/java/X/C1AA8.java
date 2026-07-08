package X;

import android.text.TextUtils;
import com.bytedance.android.livesdkapi.depend.model.live.CustomTabInfo;
import com.bytedance.android.livesdkapi.depend.model.live.EnlargeViewInfo;
import com.bytedance.android.livesdkapi.depend.model.live.LiveCoreSDKData;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.p;
import com.ss.android.ugc.aweme.feed.model.live.PreviewEnlargeViewInfo;
import com.ss.android.ugc.aweme.feed.model.live.StreamUrlStruct;
import com.ss.android.ugc.aweme.follow.presenter.RoomStruct;

/* JADX INFO: renamed from: X.1AA8, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AA8 {
    public static RoomStruct LIZ(Room room) {
        boolean z;
        StreamUrl streamUrl;
        String str = null;
        if (room == null) {
            return null;
        }
        RoomStruct roomStruct = new RoomStruct();
        roomStruct.id = room.getId();
        roomStruct.ownerUserId = room.getOwnerUserId();
        StreamUrlStruct streamUrlStructLIZIZ = LIZIZ(room.getStreamUrl(), room.getMultiStreamDefaultQualitySdkKey());
        if (streamUrlStructLIZIZ == null) {
            return null;
        }
        if (room.multiStreamScene == 1 && (streamUrl = room.multiStreamUrl) != null) {
            LiveCoreSDKData liveCoreSDKData = streamUrl.liveCoreSDKData;
            if (liveCoreSDKData != null && liveCoreSDKData.getDefaultQuality() != null) {
                str = room.multiStreamUrl.liveCoreSDKData.getDefaultQuality().sdkKey;
            }
            roomStruct.multiStreamUrl = LIZIZ(room.multiStreamUrl, str);
            roomStruct.multiStreamId = room.multiStreamId;
            roomStruct.multiStreamIdStr = room.multiStreamIdStr;
            roomStruct.multiStreamScene = room.multiStreamScene;
            roomStruct.multiStreamSource = room.multiStreamSource;
        }
        EnlargeViewInfo enlargeViewInfo = room.enlargeViewInfo;
        if (enlargeViewInfo != null) {
            PreviewEnlargeViewInfo previewEnlargeViewInfo = new PreviewEnlargeViewInfo();
            previewEnlargeViewInfo.enablerEnlargeView = enlargeViewInfo.enablerEnlargeView;
            previewEnlargeViewInfo.portraitView = enlargeViewInfo.portraitView;
            previewEnlargeViewInfo.landscapeView = enlargeViewInfo.landscapeView;
            roomStruct.previewEnlargeViewInfo = previewEnlargeViewInfo;
        }
        String str2 = room.roomCreateAbParam;
        if (str2 != null) {
            roomStruct.roomCreateAbParam = str2;
        }
        CustomTabInfo customTabInfo = room.customTabInfo;
        if (customTabInfo != null) {
            roomStruct.previewCustomTabInfo = C0J4Y.LIZJ(customTabInfo);
        }
        roomStruct.stream_url = streamUrlStructLIZIZ;
        roomStruct.isThirdParty = room.isThirdParty;
        roomStruct.isScreenshot = room.isScreenshot;
        if (room.getStreamType() == LiveMode.AUDIO) {
            z = true;
        } else {
            z = false;
        }
        roomStruct.liveTypeAudio = z;
        if (room.getStreamType() == LiveMode.LIVE_VOICE) {
            roomStruct.liveRoomMode = 7;
        }
        return roomStruct;
    }

    public static StreamUrlStruct LIZIZ(StreamUrl streamUrl, String str) {
        LiveCoreSDKData liveCoreSDKData;
        String strLJIL;
        if (streamUrl == null) {
            return null;
        }
        StreamUrlStruct streamUrlStruct = new StreamUrlStruct();
        streamUrlStruct.sid = streamUrl.id;
        streamUrlStruct.provider = streamUrl.provider;
        streamUrlStruct.rtmp_push_url = streamUrl.LIZLLL();
        String str2 = streamUrl.rtmpPullUrl;
        streamUrlStruct.rtmp_pull_url = str2;
        if (TextUtils.isEmpty(str2) && (liveCoreSDKData = streamUrl.liveCoreSDKData) != null && liveCoreSDKData.getPullData() != null) {
            String streamData = liveCoreSDKData.getPullData().getStreamData();
            if (streamData != null) {
                try {
                    new p();
                    strLJIL = p.LIZJ(streamData).LJIILIIL().LJJIJ("data").LJJIJ("origin").LJJIJ("main").LJJIIZ("flv").LJIL();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    strLJIL = null;
                }
                streamUrlStruct.rtmp_pull_url = strLJIL;
            } else {
                strLJIL = null;
                streamUrlStruct.rtmp_pull_url = strLJIL;
            }
        }
        if (TextUtils.isEmpty(streamUrlStruct.rtmp_pull_url)) {
            return null;
        }
        streamUrlStruct.mDefaultResolution = str;
        streamUrlStruct.aliveTimestamp = streamUrl.aliveTimestamp;
        streamUrlStruct.drmType = streamUrl.drmType;
        streamUrlStruct.streamLanguage = streamUrl.streamLanguage;
        return streamUrlStruct;
    }
}
