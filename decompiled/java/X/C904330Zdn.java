package X;

import com.ss.android.ugc.aweme.im.saas.host.api.favorite.IMFavoriteBridgeApi;
import java.util.Map;

/* JADX INFO: renamed from: X.0Zdn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C904330Zdn {
    public static final boolean LIZ(C0Y8T c0y8t) {
        C0Y8Y coreInfo;
        Map<String, String> ext;
        String str;
        if (c0y8t != null && (coreInfo = c0y8t.getCoreInfo()) != null && (ext = coreInfo.getExt()) != null && (str = ext.get("a:collaborative_collection_status")) != null && Boolean.parseBoolean(str)) {
            IMFavoriteBridgeApi.LIZ.getClass();
            IMFavoriteBridgeApi value = C904340Zdo.LIZIZ.getValue();
            if (value != null && value.LIZLLL()) {
                return true;
            }
            return false;
        }
        return false;
    }
}
