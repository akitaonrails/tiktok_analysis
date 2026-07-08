package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.dataChannel.RoomUserChannel;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.01C5, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01C5 {
    public static final boolean LIZ(DataChannel dataChannel) {
        Boolean boolValueOf;
        UserAttr userAttr;
        User user;
        UserAttr userAttr2;
        if (dataChannel != null && (user = (User) dataChannel.gg0(RoomUserChannel.class)) != null && (userAttr2 = user.getUserAttr()) != null) {
            return userAttr2.isAdmin;
        }
        User userLIZIZ = C0KXJ.LIZIZ();
        if (userLIZIZ != null && (userAttr = userLIZIZ.getUserAttr()) != null) {
            boolValueOf = Boolean.valueOf(userAttr.isAdmin);
        } else {
            boolValueOf = null;
        }
        return C500260Jjc.LJJJI(boolValueOf);
    }

    public static final boolean LIZIZ(DataChannel dataChannel) {
        Boolean boolValueOf;
        UserAttr userAttr;
        User user;
        UserAttr userAttr2;
        if (dataChannel != null && (user = (User) dataChannel.gg0(RoomUserChannel.class)) != null && (userAttr2 = user.getUserAttr()) != null) {
            return userAttr2.isChannelAdmin;
        }
        User userLIZIZ = C0KXJ.LIZIZ();
        if (userLIZIZ != null && (userAttr = userLIZIZ.getUserAttr()) != null) {
            boolValueOf = Boolean.valueOf(userAttr.isChannelAdmin);
        } else {
            boolValueOf = null;
        }
        return C500260Jjc.LJJJI(boolValueOf);
    }
}
