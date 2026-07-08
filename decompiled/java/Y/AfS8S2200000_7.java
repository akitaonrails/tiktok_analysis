package Y;

import X.C09JN;
import X.C1C7U;
import X.C20441214yg;
import X.C2188811AlT;
import X.C468150IXl;
import X.C485980J4a;
import X.C485990J4b;
import X.C497740JfY;
import X.C766270U4b;
import android.content.Context;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.ss.android.ugc.aweme.live.api.PreloadRoomExtra;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes8.dex */
public class AfS8S2200000_7 implements C09JN {
    public final int $t;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$0(AfS8S2200000_7 afS8S2200000_7, Object obj) {
        Room room;
        String reason;
        PreloadRoomExtra preloadRoomExtra;
        C1C7U.LIZ("LivePreloadService@894.preloadAndCache$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse != null) {
            room = (Room) baseResponse.data;
        } else {
            room = null;
        }
        if (room != null && room.getId() != 0) {
            ((C468150IXl) afS8S2200000_7.l2).LIZ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(afS8S2200000_7.s0);
            sbLIZ.append('-');
            sbLIZ.append(afS8S2200000_7.s1);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            ((C468150IXl) afS8S2200000_7.l2).LIZ.put(strLIZIZ, room);
            ((C468150IXl) afS8S2200000_7.l2).LIZIZ.put(strLIZIZ, Long.valueOf(System.currentTimeMillis()));
            ((C468150IXl) afS8S2200000_7.l2).LIZJ.put(strLIZIZ, "success");
        } else {
            ConcurrentHashMap<String, String> concurrentHashMap = ((C468150IXl) afS8S2200000_7.l2).LIZJ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(afS8S2200000_7.s0);
            sbLIZ2.append('-');
            sbLIZ2.append(afS8S2200000_7.s1);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            if (baseResponse == null || (preloadRoomExtra = (PreloadRoomExtra) baseResponse.extra) == null || (reason = preloadRoomExtra.getReason()) == null) {
                reason = "empty";
            }
            concurrentHashMap.put(strLIZIZ2, reason);
        }
        Runnable runnable = (Runnable) afS8S2200000_7.l3;
        if (runnable != null) {
            runnable.run();
        }
        C1C7U.LIZIZ("LivePreloadService@894.preloadAndCache$1");
    }

    public static final void accept$1(AfS8S2200000_7 afS8S2200000_7, Object obj) {
        C1C7U.LIZ("LiveWatcherUtils@1ee2.watchLive$3");
        EnterRoomConfig enterRoomConfigLJ = C485990J4b.LJ(-4L, afS8S2200000_7.s0, afS8S2200000_7.s1);
        C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131840613));
        ((C485980J4a) afS8S2200000_7.l2).watchLive((Context) afS8S2200000_7.l3, enterRoomConfigLJ);
        C20441214yg.LJI("LiveWatcherUtils", (Throwable) obj);
        C1C7U.LIZIZ("LiveWatcherUtils@1ee2.watchLive$3");
    }

    public AfS8S2200000_7(String str, C485980J4a c485980J4a, Context context, int i) {
        this.$t = i;
        this.s0 = str;
        this.s1 = "live_bottom_bar";
        this.l2 = c485980J4a;
        this.l3 = context;
    }

    public AfS8S2200000_7(C468150IXl c468150IXl, String str, String str2, int i) {
        this.$t = i;
        this.l2 = c468150IXl;
        this.s0 = str;
        this.s1 = str2;
        this.l3 = null;
    }
}
