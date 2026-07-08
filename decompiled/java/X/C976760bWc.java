package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* JADX INFO: renamed from: X.0bWc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C976760bWc {
    public static final /* synthetic */ C976760bWc LIZ = new C976760bWc();

    public static int LIZ(int i, long j, Room room) {
        User owner;
        if (i != 102) {
            if (i != 103) {
                return 111;
            }
            if (room != null && (owner = room.getOwner()) != null && j == owner.getId()) {
                if (!C915980Zwa.LJI().LIZ().LJJIJLIJ()) {
                    return 103;
                }
                return 110;
            }
            return 109;
        }
        return 106;
    }
}
