package X;

import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.live.AnchorLevelPermission;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* JADX INFO: renamed from: X.0UXQ, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UXQ {
    public static final boolean LIZ(Room room) {
        int i;
        RoomAuthStatus roomAuthStatus;
        AnchorLevelPermission anchorLevelPermission;
        LiveMode streamType;
        if (room != null && (streamType = room.getStreamType()) != null) {
            i = C0UXP.LIZ[streamType.ordinal()];
        } else {
            i = -1;
        }
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            return true;
        }
        if (room.cppVersion == 2 && (roomAuthStatus = room.getRoomAuthStatus()) != null && (anchorLevelPermission = roomAuthStatus.anchorLevelPermission) != null && anchorLevelPermission.playTogether == 0) {
            return false;
        }
        return true;
    }
}
