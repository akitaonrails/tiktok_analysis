package X;

import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.live.AnchorLevelPermission;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0UoY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C783600UoY {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(DataChannel dataChannel) {
        Room room;
        RoomAuthStatus roomAuthStatus;
        AnchorLevelPermission anchorLevelPermission;
        if (C500260Jjc.LJIIZILJ(dataChannel) && dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null && (roomAuthStatus = room.getRoomAuthStatus()) != null && (anchorLevelPermission = roomAuthStatus.anchorLevelPermission) != null && anchorLevelPermission.viewerRankList == 0) {
            return true;
        }
        return false;
    }
}
