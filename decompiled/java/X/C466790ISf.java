package X;

import com.bytedance.android.livesdkapi.depend.model.live.RoomInfo;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0ISf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C466790ISf {
    public String LIZ;
    public final EnterRoomConfig LIZIZ;
    public final List<RoomInfo> LIZJ;
    public final int LIZLLL;
    public final boolean LJ;
    public final Map<String, String> LJFF;

    public C466790ISf(String str, EnterRoomConfig enterRoomConfig, List list, int i) {
        HashMap map = new HashMap();
        this.LIZ = str;
        this.LIZIZ = enterRoomConfig;
        this.LIZJ = list;
        this.LIZLLL = i;
        this.LJ = true;
        this.LJFF = map;
    }
}
