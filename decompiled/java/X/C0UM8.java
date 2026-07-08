package X;

import com.bytedance.android.livesdk.livesetting.broadcast.AnchorSmoothRoomCreateOptABSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0UM8, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UM8 {
    public static final void LIZ(DataChannel dataChannel, Long l, Long l2, int i) {
        if (!AnchorSmoothRoomCreateOptABSetting.INSTANCE.enable()) {
            return;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_smooth_room_create_room_opt");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "current_progress");
        c474500IjALIZ.LJJII(l, "room_id");
        c474500IjALIZ.LJJII(l2, "anchor_id");
        c474500IjALIZ.LJJII(Long.valueOf(System.currentTimeMillis()), "time");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LIZ();
    }
}
