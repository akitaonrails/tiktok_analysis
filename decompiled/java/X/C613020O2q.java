package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;

/* JADX INFO: renamed from: X.0O2q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C613020O2q {
    public static Boolean LIZ(Aweme aweme) {
        PoiDataStruct poiDataStruct;
        if (aweme != null && (poiDataStruct = aweme.getPoiDataStruct()) != null) {
            boolean z = true;
            if (((Boolean) C262260APo.LIZ.getValue()).booleanValue()) {
                if (!poiDataStruct.anchorShowed && !poiDataStruct.tagShowed) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
            return Boolean.valueOf(!poiDataStruct.anchorAvoidResult);
        }
        return null;
    }
}
