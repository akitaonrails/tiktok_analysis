package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;

/* JADX INFO: renamed from: X.0IXu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C468240IXu {
    public final Room LIZ;
    public final EnterRoomConfig LIZIZ;
    public final long LIZJ;

    public C468240IXu() {
        this(null, null, 0L, 15);
    }

    public C468240IXu(Room room, EnterRoomConfig enterRoomConfig, long j, int i) {
        room = (i & 1) != 0 ? new Room() : room;
        enterRoomConfig = (i & 2) != 0 ? new EnterRoomConfig() : enterRoomConfig;
        j = (i & 4) != 0 ? 0L : j;
        this.LIZ = room;
        this.LIZIZ = enterRoomConfig;
        this.LIZJ = j;
    }
}
