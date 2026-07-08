package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Rwa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C712140Rwa {
    public static final Map<String, String> LIZ = new LinkedHashMap();

    public static void LIZ(String str, String str2) {
        if (str != null && str2 != null) {
            Map<String, String> map = LIZ;
            if (((LinkedHashMap) map).get(str) == null) {
                map.put(str, str2);
            }
        }
    }
}
