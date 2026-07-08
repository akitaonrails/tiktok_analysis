package X;

import android.util.Pair;
import java.io.IOException;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0ddr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1058130ddr {
    public static String LIZ(String str) throws IOException {
        String str2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Pair<String, String> pairLIZJ = C2088908Gh.LIZJ(str, linkedHashMap);
        String str3 = (String) pairLIZJ.first;
        if (str3 != null && str3.equals("aweme://webDialog") && (str2 = (String) pairLIZJ.second) != null && str2.equals("/eventDetail")) {
            return (String) linkedHashMap.get("event_id");
        }
        return null;
    }
}
