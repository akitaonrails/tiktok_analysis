package X;

import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.00jj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C162100jj {
    public static final Room LIZ(DataChannel dataChannel) {
        if (dataChannel != null) {
            return (Room) dataChannel.gg0(RoomChannel.class);
        }
        return null;
    }

    public static final boolean LIZIZ(DataChannel dataChannel) {
        Room roomLIZ = LIZ(dataChannel);
        if (roomLIZ == null || roomLIZ.questionVersion == 0) {
            return false;
        }
        return true;
    }

    public static final boolean LIZJ(DataChannel dataChannel) {
        RoomAuthStatus roomAuthStatus;
        Room roomLIZ = LIZ(dataChannel);
        if (roomLIZ == null || (roomAuthStatus = roomLIZ.getRoomAuthStatus()) == null || !roomAuthStatus.isEnableQuestion()) {
            return false;
        }
        return true;
    }
}
