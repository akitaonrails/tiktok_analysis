package X;

import com.bytedance.android.live.broadcast.model.ActivitiesIconInfo;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.livesdk.dataChannel.BroadcastPreviewBannerChannel;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UKF, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UKF {
    public static final boolean LIZ(DataChannel dataChannel) {
        RoomCreateInfo roomCreateInfo;
        ActivitiesIconInfo activitiesIconInfo;
        if (!Intrinsics.LJFF(dataChannel.gg0(BroadcastPreviewBannerChannel.class), Boolean.TRUE) || (roomCreateInfo = (RoomCreateInfo) dataChannel.gg0(RoomCreateInfoChannel.class)) == null || (activitiesIconInfo = roomCreateInfo.activitiesIconInfo) == null) {
            return false;
        }
        if (!Intrinsics.LJFF(activitiesIconInfo.activityId, "24_fest") && !activitiesIconInfo.isLiveFest) {
            return false;
        }
        return true;
    }
}
