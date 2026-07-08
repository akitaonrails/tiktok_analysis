package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;

/* JADX INFO: renamed from: X.0aCt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C926090aCt {
    public final Room LIZ;
    public final EnterRoomConfig LIZIZ;
    public final LifecycleOwner LIZJ;
    public C926050aCp LIZLLL;
    public String LJ = "";
    public String LJFF = "";
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;

    public C926090aCt(LifecycleOwner lifecycleOwner, Room room, EnterRoomConfig enterRoomConfig) {
        this.LIZ = room;
        this.LIZIZ = enterRoomConfig;
        this.LIZJ = lifecycleOwner;
    }
}
