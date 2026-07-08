package X;

import com.ss.android.ugc.aweme.poi.mapmode.model.PoiMapModeResponse;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0ggL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1174990ggL {
    public final Map<C1174450gfT, PoiMapModeResponse> LIZ = new LinkedHashMap();

    public final void LIZ(C1174450gfT c1174450gfT, PoiMapModeResponse poiMapModeResponse) {
        if (c1174450gfT == null) {
            return;
        }
        if (poiMapModeResponse == null) {
            this.LIZ.remove(c1174450gfT);
        } else {
            this.LIZ.put(c1174450gfT, poiMapModeResponse);
        }
    }
}
