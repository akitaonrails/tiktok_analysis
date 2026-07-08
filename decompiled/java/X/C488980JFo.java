package X;

import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0JFo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C488980JFo {
    public final DataChannel LIZ;
    public final C495950Jcf LIZIZ;
    public final boolean LIZJ;
    public final Room LIZLLL;
    public final long LJ;
    public final UserProfileEvent LJFF;

    public C488980JFo(DataChannel dataChannel, C495950Jcf c495950Jcf, boolean z, Room room, long j, UserProfileEvent userProfileEvent) {
        this.LIZ = dataChannel;
        this.LIZIZ = c495950Jcf;
        this.LIZJ = z;
        this.LIZLLL = room;
        this.LJ = j;
        this.LJFF = userProfileEvent;
    }
}
