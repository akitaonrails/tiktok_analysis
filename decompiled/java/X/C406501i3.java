package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.01i3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C406501i3 {
    public static void LIZ(DataChannel dataChannel, Fragment fragment, EnumC768840UDy enumC768840UDy) {
        long id;
        Room room = (Room) dataChannel.gg0(RoomChannel.class);
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(fragment), C0PEM.LIZJ, null, new C401001hA(C0U60.LIZ(), enumC768840UDy, fragment, id, dataChannel, null), 2);
    }
}
