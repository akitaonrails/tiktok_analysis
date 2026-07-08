package X;

import com.ss.android.ugc.aweme.ml.ab.OneSmartDataTrackConfig;
import com.ss.android.ugc.aweme.ml.api.ISmartDataTrackerService;
import com.ss.android.ugc.aweme.ml.api.SmartDataTrackerService;
import com.ss.android.ugc.aweme.search.performance.core.config.HistoryAheadPrefetchConfig;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QGT, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QGT {
    public static final Map<String, Integer> LIZ = new LinkedHashMap();
    public static List<Float> LIZIZ;
    public static final int LIZJ;
    public static final boolean LIZLLL;
    public static final boolean LJ;
    public static final boolean LJFF;
    public static final float LJI;
    public static final long LJII;
    public static final int LJIIIIZZ;
    public static final long LJIIIZ;
    public static final C01GW LJIIJ;

    static {
        C666380QBw.LIZ.getClass();
        LIZJ = C666380QBw.LIZ().prefetchCount;
        LIZLLL = C666380QBw.LIZ().enableSmartPrefetch == 1;
        LJ = C666380QBw.LIZ().enableSmartPrefetch == 2;
        LJFF = C666380QBw.LIZ().enableSmartPrefetch == 3;
        LJI = C666380QBw.LIZ().scoreThreshold;
        LJII = C666380QBw.LIZ().prefetchDelayTime;
        C667550QGj.LIZ.getClass();
        C01GW c01gw = C667550QGj.LIZJ;
        LJIIIIZZ = ((HistoryAheadPrefetchConfig) c01gw.getValue()).prefetchCount;
        LJIIIZ = ((HistoryAheadPrefetchConfig) c01gw.getValue()).prefetchDelayTime;
        LJIIJ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(732));
    }

    public static void LIZ() {
        C1509310pNZ c1509310pNZ = new C1509310pNZ(0);
        SmartDataTrackerService.Companion.getClass();
        ISmartDataTrackerService iSmartDataTrackerService = C1512160pSA.LIZ;
        C666380QBw.LIZ.getClass();
        OneSmartDataTrackConfig track = C666380QBw.LIZ().getTrack();
        iSmartDataTrackerService.onSceneRealCheckAndReport(track != null ? track.getScene() : null, c1509310pNZ);
    }

    public static void LIZIZ(Integer num, String str) {
        if (Intrinsics.LJFF("click", "clear")) {
            return;
        }
        Map<String, Integer> map = LIZ;
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        Object obj = linkedHashMap.get(str);
        if (obj == null) {
            obj = 0;
            linkedHashMap.put(str, obj);
        }
        map.put(str, Integer.valueOf(((Number) obj).intValue() + 1));
        C1487550ooT c1487550ooT = C1487550ooT.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("history_search_click_");
        sbLIZ.append(num);
        c1487550ooT.addFeature(C2188811AlT.LIZIZ(sbLIZ), Float.valueOf(1.0f), false);
    }
}
