package X;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: X.0RXO, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RXO {
    public static C698680Ras LIZ(String str, String str2, Map map) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return new C698680Ras(null, null, str2, map);
        }
        return new C698680Ras(null, Collections.singletonList(str), str2, map);
    }
}
