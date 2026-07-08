package X;

import com.bytedance.android.livesdk.livesetting.broadcast.TtliveGameEnableIntelligentRotationSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.follow.presenter.RoomStruct;
import java.util.Map;

/* JADX INFO: renamed from: X.0IaG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C468980IaG {
    public static boolean LIZ(LiveRoomStruct liveRoomStruct) {
        if (TtliveGameEnableIntelligentRotationSetting.INSTANCE.isEnable() && liveRoomStruct != null) {
            if (RoomStruct.getStreamType(liveRoomStruct) != LiveMode.SCREEN_RECORD) {
                Map<String, Object> map = C1338270kvh.LIZ;
                return false;
            }
            return true;
        }
        Map<String, Object> map2 = C1338270kvh.LIZ;
        return false;
    }
}
