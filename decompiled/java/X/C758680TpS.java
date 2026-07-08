package X;

import com.bytedance.android.live.broadcast.BroadcastSettingResponse;
import com.bytedance.android.live.broadcast.api.BroadcastSettingResponseChannel;
import com.bytedance.android.livesdk.broadcast.GamePartnershipEntrance;
import com.bytedance.android.livesdk.broadcast.PartnershipVideoLivePermission;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0TpS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C758680TpS {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(DataChannel dataChannel) {
        BroadcastSettingResponse broadcastSettingResponse;
        if (dataChannel != null && (broadcastSettingResponse = (BroadcastSettingResponse) dataChannel.gg0(BroadcastSettingResponseChannel.class)) != null) {
            return broadcastSettingResponse.liveCommercial;
        }
        return false;
    }

    public static boolean LIZIZ(DataChannel dataChannel) {
        Object objGg0;
        C193200ok c193200ok;
        C0UI2 c0ui2;
        if (dataChannel != null) {
            objGg0 = dataChannel.gg0(LiveModeChannel.class);
        } else {
            objGg0 = null;
        }
        if (objGg0 == LiveMode.VIDEO) {
            if (dataChannel != null && (c0ui2 = (C0UI2) dataChannel.gg0(PartnershipVideoLivePermission.class)) != null) {
                return c0ui2.LIZ;
            }
            return false;
        }
        if (dataChannel != null && (c193200ok = (C193200ok) dataChannel.gg0(GamePartnershipEntrance.class)) != null) {
            return c193200ok.LIZ;
        }
        return false;
    }
}
