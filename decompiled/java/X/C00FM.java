package X;

import java.util.Map;

/* JADX INFO: renamed from: X.00FM, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00FM {
    public static String LIZ(Map<String, Long> map) {
        StringBuilder sb = new StringBuilder();
        if (map != null && map.size() > 0) {
            for (Map.Entry<String, Long> entry : map.entrySet()) {
                sb.append(entry.getKey());
                sb.append(":");
                sb.append(entry.getValue());
                sb.append(",");
            }
        }
        return sb.toString();
    }
}
