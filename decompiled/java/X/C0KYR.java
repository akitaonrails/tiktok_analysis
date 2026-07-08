package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.RoomUserChannel;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0KYR, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KYR {
    public static final String LIZJ(DataChannel dataChannel) {
        Room room;
        if (dataChannel != null) {
            room = (Room) dataChannel.gg0(RoomChannel.class);
        } else {
            room = null;
        }
        return LIZIZ(room, dataChannel);
    }

    public static final String LIZLLL(Throwable th) {
        String message;
        if (th == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(th.getClass().getSimpleName());
        sb.append("|");
        Throwable cause = th.getCause();
        if (cause != null) {
            message = cause.getMessage();
        } else {
            message = th.getMessage();
        }
        if (message == null || message.length() == 0) {
            message = "unknown_reason";
        }
        if (a0.LJJIIZI(message.toLowerCase(Locale.ROOT), "time_out", false)) {
            int iLJJJ = a0.LJJJ(message, "time_out", 0, false, 6) + 8;
            if (iLJJJ >= 0 || (iLJJJ = a0.LJJJ(message, "TIME_OUT", 0, false, 6) + 8) >= 0) {
                message = message.substring(Math.max(iLJJJ - 50, 0), iLJJJ);
            }
            if (message.length() == 0) {
                message = "timeout error_msg_too_long";
            } else {
                message = message.substring(0, 50);
            }
        }
        sb.append(message);
        StackTraceElement[] stackTrace = th.getStackTrace();
        if (stackTrace.length != 0) {
            sb.append("|");
            sb.append(stackTrace[0].toString());
        }
        return sb.toString();
    }

    public static final String LIZ(User user, Room room) {
        Long lValueOf;
        Long lValueOf2 = null;
        if (user != null) {
            lValueOf = Long.valueOf(user.getId());
        } else {
            lValueOf = null;
        }
        if (room != null) {
            lValueOf2 = Long.valueOf(room.getOwnerUserId());
        }
        if (Intrinsics.LJFF(lValueOf, lValueOf2)) {
            return "anchor";
        }
        if (user != null) {
            UserAttr userAttr = user.getUserAttr();
            if (userAttr != null && userAttr.isChannelAdmin) {
                return "channel_admin";
            }
            UserAttr userAttr2 = user.getUserAttr();
            if (userAttr2 != null && userAttr2.isAdmin) {
                return "admin";
            }
            return "viewer";
        }
        return "viewer";
    }

    public static final String LIZIZ(Room room, DataChannel dataChannel) {
        User user;
        if (dataChannel != null) {
            user = (User) dataChannel.gg0(RoomUserChannel.class);
        } else {
            user = null;
        }
        return LIZ(user, room);
    }
}
