package X;

import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.01k9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C419501k9 {
    public static boolean LIZ(DataChannel dataChannel) {
        boolean z;
        RoomCreateInfo roomCreateInfo = C0UON.LIZ;
        if (roomCreateInfo == null) {
            if (dataChannel != null) {
                roomCreateInfo = (RoomCreateInfo) dataChannel.gg0(RoomCreateInfoChannel.class);
            } else {
                roomCreateInfo = null;
            }
        }
        if (roomCreateInfo != null && roomCreateInfo.showVoiceChatGuide) {
            z = true;
        } else {
            z = false;
        }
        Boolean boolLIZIZ = InterfaceC1106030et7.u9.LIZIZ();
        if (z && boolLIZIZ.booleanValue()) {
            return true;
        }
        return false;
    }
}
