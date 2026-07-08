package X;

import com.ss.android.ugc.aweme.pns.gatekeeper.api.tools.PNSGKToolItem;
import java.util.Map;

/* JADX INFO: renamed from: X.0NQv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C593830NQv {
    public static PNSGKToolItem LIZ(Map map) {
        String str;
        String str2;
        Object obj = map.get("tool_type");
        if ((obj instanceof String) && (str = (String) obj) != null && str.length() > 0) {
            Object obj2 = map.get("signal");
            if ((obj2 instanceof String) && (str2 = (String) obj2) != null && str2.length() > 0) {
                return new PNSGKToolItem(str, str2, map);
            }
        }
        return null;
    }
}
