package X;

import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0vbo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1748780vbo {
    public static final void LIZ(C1748770vbn c1748770vbn, Function1<? super LaneParams, Unit> function1) {
        LIZIZ(c1748770vbn, "lib_track_builtin_lane_business", function1);
    }

    public static final void LIZIZ(C1748770vbn c1748770vbn, String str, Function1<? super LaneParams, Unit> function1) {
        LaneParams laneParamsLIZIZ = c1748770vbn.LIZIZ(str);
        if (laneParamsLIZIZ == null) {
            laneParamsLIZIZ = new LaneParams();
        }
        function1.invoke(laneParamsLIZIZ);
        c1748770vbn.LIZIZ.put(str, laneParamsLIZIZ);
    }
}
