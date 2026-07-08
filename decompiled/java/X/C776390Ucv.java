package X;

import com.bytedance.android.live.broadcast.model.PushStreamInfo;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.livesdk.livesetting.game.TtliveGameEnableCategoryGearsSetting;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ucv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C776390Ucv {
    public static final boolean LIZ(PushStreamInfo.Quality quality) {
        if (quality.fps > 0 && quality.width > 0 && quality.height > 0 && quality.max_bitrate > 0 && quality.min_bitrate > 0 && quality.default_bitrate > 0) {
            return true;
        }
        return false;
    }

    public static final PushStreamInfo.Quality LIZIZ(PushStreamInfo.Quality quality) {
        Map<Long, PushStreamInfo> map;
        PushStreamInfo pushStreamInfo;
        List<PushStreamInfo.Quality> listLJ;
        RoomCreateInfo roomCreateInfo = (RoomCreateInfo) DataChannelGlobal.LLILZ.gg0(C168W.class);
        if (roomCreateInfo != null && (map = roomCreateInfo.pushStreamInfoMap) != null && (pushStreamInfo = map.get(4L)) != null) {
            if (TtliveGameEnableCategoryGearsSetting.INSTANCE.isEnable()) {
                EnumC1284950jXh enumC1284950jXh = C19370910qR.LIZ;
                listLJ = C19370910qR.LJ(pushStreamInfo.multiQualities);
                if (listLJ == null) {
                    listLJ = pushStreamInfo.qualityList;
                }
            } else {
                listLJ = pushStreamInfo.qualityList;
            }
            for (PushStreamInfo.Quality quality2 : listLJ) {
                String str = quality2.sdkKey;
                if (str != null && str.length() > 0 && Intrinsics.LJFF(quality2.sdkKey, quality.sdkKey)) {
                    if (LIZ(quality)) {
                        return quality;
                    }
                    return quality2;
                }
            }
        }
        return null;
    }
}
