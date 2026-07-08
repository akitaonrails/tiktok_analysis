package X;

import com.bytedance.android.livesdk.livesetting.watchlive.PushStreamUrlConfig;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.live.api.LiveRoomPreloadApi;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0IXl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C468150IXl implements InterfaceC468170IXn, InterfaceC464000IHm {
    public static final C468150IXl LJ = new C468150IXl();
    public static final int LJFF = PushStreamUrlConfig.INSTANCE.getCacheSize();
    public final Map<String, Room> LIZ = Collections.synchronizedMap(new LinkedHashMap());
    public final ConcurrentHashMap<String, Long> LIZIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, String> LIZJ = new ConcurrentHashMap<>();
    public final LiveRoomPreloadApi LIZLLL;

    public final void LIZ() {
        if (this.LIZ.size() >= LJFF) {
            Iterator<Map.Entry<String, Room>> it2 = this.LIZ.entrySet().iterator();
            if (it2.hasNext()) {
                String key = it2.next().getKey();
                if (key != null) {
                    this.LIZIZ.remove(key);
                    this.LIZJ.remove(key);
                }
                it2.remove();
            }
        }
    }

    public C468150IXl() {
        C480460Ism.LIZ().getClass();
        this.LIZLLL = (LiveRoomPreloadApi) C480460Ism.LIZLLL(LiveRoomPreloadApi.class);
    }

    public final String LIZIZ(String str, String str2) {
        ConcurrentHashMap<String, String> concurrentHashMap = this.LIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('-');
        sbLIZ.append(str2);
        String strRemove = concurrentHashMap.remove(C2188811AlT.LIZIZ(sbLIZ));
        if (strRemove == null) {
            return "null";
        }
        return strRemove;
    }
}
