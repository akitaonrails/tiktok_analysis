package X;

import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;

/* JADX INFO: renamed from: X.012d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2685012d {
    public static final String LIZ() {
        User owner;
        SubscribeInfo subscribeInfo;
        String str;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        return (room == null || (owner = room.getOwner()) == null || (subscribeInfo = owner.getSubscribeInfo()) == null || (str = subscribeInfo.packageId) == null) ? "" : str;
    }

    public static final boolean LIZIZ() {
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        return room != null && UserService.getInstance().user().getCurrentUserId() == room.getOwnerUserId();
    }
}
