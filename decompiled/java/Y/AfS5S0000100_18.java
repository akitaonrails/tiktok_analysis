package Y;

import X.C05FZ;
import X.C09JN;
import X.C1199450hJn;
import X.C1199460hJo;
import X.C1C7U;
import X.C2097608Jq;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.poi.api.PoiSearchApi;
import com.ss.android.ugc.aweme.tracker.LocationNetTracker;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS52S0100100_18;

/* JADX INFO: loaded from: classes19.dex */
public class AfS5S0000100_18 implements C09JN {
    public final int $t;
    public long j0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
        }
    }

    public AfS5S0000100_18(long j, int i) {
        this.$t = i;
        this.j0 = j;
    }

    public static final void accept$0(AfS5S0000100_18 afS5S0000100_18, Object obj) {
        C1C7U.LIZ("MixBottomBarVM@eed6.preload$2$preloadResult$detailResp$1");
        C05FZ c05fz = C05FZ.LIZ;
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("duration_ms", String.valueOf(System.currentTimeMillis() - afS5S0000100_18.j0)), new Pair("reason", "failed"), new Pair(Scene.SCENE_SERVICE, "play_next"));
        c05fz.getClass();
        C05FZ.LIZLLL(mapLJIIIIZZ);
        C1C7U.LIZIZ("MixBottomBarVM@eed6.preload$2$preloadResult$detailResp$1");
    }

    public static final void accept$1(AfS5S0000100_18 afS5S0000100_18, Object obj) {
        C1C7U.LIZ("MixBottomBarVM@eed6.preload$2$preloadResult$listResp$1");
        C05FZ c05fz = C05FZ.LIZ;
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("duration_ms", String.valueOf(System.currentTimeMillis() - afS5S0000100_18.j0)), new Pair("reason", "failed"), new Pair(Scene.SCENE_SERVICE, "play_next"));
        c05fz.getClass();
        C05FZ.LJ(mapLJIIIIZZ);
        C1C7U.LIZIZ("MixBottomBarVM@eed6.preload$2$preloadResult$listResp$1");
    }

    public static final void accept$2(AfS5S0000100_18 afS5S0000100_18, Object obj) {
        C1C7U.LIZ("PoiSearchApi$Companion@bc2d.addSearchRcmdSample$1");
        C1199460hJo c1199460hJo = C1199460hJo.LIZ;
        C1199450hJn c1199450hJn = new C1199450hJn("poi_search");
        c1199450hJn.LIZLLL = "add_search_rcmd_sample";
        c1199450hJn.LIZ(1L);
        c1199460hJo.getClass();
        C1199460hJo.LIZ(c1199450hJn);
        LocationNetTracker.LIZIZ(null, new AwS52S0100100_18(afS5S0000100_18.j0, (PoiSearchApi.PoiSearchResultWrapperV2) obj, 0));
        C1C7U.LIZIZ("PoiSearchApi$Companion@bc2d.addSearchRcmdSample$1");
    }
}
