package X;

import java.util.Map;

/* JADX INFO: renamed from: X.05zh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1535105zh {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(Map map, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (!map.isEmpty()) {
            sb.append("?");
            int i = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str2 = (String) entry.getKey();
                String str3 = (String) entry.getValue();
                if (!C504670Jqj.LIZIZ(str2) && !C504670Jqj.LIZIZ(str3)) {
                    if (i == 0) {
                        sb.append(str2);
                        sb.append("=");
                        sb.append(str3);
                    } else {
                        sb.append("&");
                        sb.append(str2);
                        sb.append("=");
                        sb.append(str3);
                    }
                }
                i++;
            }
        }
        return sb.toString();
    }
}
