package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;

/* JADX INFO: renamed from: X.0fcO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1134100fcO {
    public static boolean LIZ(InterfaceC1136020ffU interfaceC1136020ffU) {
        long currentUserId = UserService.getInstance().user().getCurrentUserId();
        InterfaceC1136800fgk interfaceC1136800fgkLIZJ = interfaceC1136020ffU.LIZJ();
        if (interfaceC1136800fgkLIZJ != null) {
            if (interfaceC1136800fgkLIZJ.getId() == currentUserId) {
                return true;
            }
            return false;
        }
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null && currentUserId == room.getOwnerUserId()) {
            return true;
        }
        return false;
    }

    public static boolean LIZIZ(GiftMessage giftMessage) {
        long currentUserId = UserService.getInstance().user().getCurrentUserId();
        User user = giftMessage.toUser;
        if (user != null) {
            if (user.getId() == currentUserId) {
                return true;
            }
            return false;
        }
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null && currentUserId == room.getOwnerUserId()) {
            return true;
        }
        return false;
    }
}
