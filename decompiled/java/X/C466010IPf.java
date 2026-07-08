package X;

import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.Set;

/* JADX INFO: renamed from: X.0IPf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C466010IPf {
    public static final C466010IPf LIZ = new C466010IPf();

    public static boolean LIZ() {
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        String strValueOf = (room == null || UserService.getInstance().user().getCurrentUserId() != room.getOwnerUserId()) ? C0IL2.LIZ.LIZIZ : String.valueOf(room.getId());
        C20337914i1<Set<String>> c20337914i1 = InterfaceC960800b6s.LLLLIL;
        if (!c20337914i1.LIZIZ().contains(strValueOf) && c20337914i1.LIZIZ().size() >= 3) {
            return false;
        }
        Set<String> setLIZIZ = c20337914i1.LIZIZ();
        setLIZIZ.add(strValueOf);
        c20337914i1.LJFF(setLIZIZ);
        return true;
    }
}
