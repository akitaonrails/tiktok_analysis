package X;

import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import java.util.Map;

/* JADX INFO: renamed from: X.0viN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1752850viN {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Map map, LaneParams laneParams) {
        if (laneParams == null) {
            return;
        }
        map.put("parent_request_id", laneParams.get("request_id"));
        map.put("parent_track_id", laneParams.get("track_id"));
    }
}
