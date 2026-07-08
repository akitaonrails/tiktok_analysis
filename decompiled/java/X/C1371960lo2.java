package X;

import com.ss.android.ugc.aweme.longpress.LPPProtocol;
import com.ss.android.ugc.aweme.longpress.LongPressComponent;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lo2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1371960lo2 {
    public static LongPressComponent LIZIZ() {
        Map<String, LongPressComponent> map;
        C1379120lza.LIZ.getClass();
        LPPProtocol lPPProtocolLIZ = C1379120lza.LIZ();
        if (lPPProtocolLIZ == null || (map = lPPProtocolLIZ.componentMap) == null) {
            return null;
        }
        for (Map.Entry<String, LongPressComponent> entry : map.entrySet()) {
            if (Intrinsics.LJFF(entry.getValue().type, "im_contact")) {
                return entry.getValue();
            }
        }
        return null;
    }

    public static LongPressComponent LIZ(String str) {
        Map<String, LongPressComponent> map;
        C1379120lza.LIZ.getClass();
        LPPProtocol lPPProtocolLIZ = C1379120lza.LIZ();
        if (lPPProtocolLIZ != null && (map = lPPProtocolLIZ.componentMap) != null) {
            for (Map.Entry<String, LongPressComponent> entry : map.entrySet()) {
                if (Intrinsics.LJFF(entry.getValue().type, "action") && Intrinsics.LJFF(entry.getValue().actionId, str)) {
                    return entry.getValue();
                }
            }
            return null;
        }
        return null;
    }
}
