package X;

import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;

/* JADX INFO: renamed from: X.010k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2640010k {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZIZ() {
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        return room != null && LIZ() == room.getOwnerUserId();
    }

    public static long LIZ() {
        return UserService.getInstance().user().getCurrentUserId();
    }
}
