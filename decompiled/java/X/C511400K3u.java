package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0K3u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C511400K3u {
    public static final C511400K3u LIZ = new C511400K3u();

    public static String LIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sslocal://webcast_subscribe");
        sbLIZ.append(str);
        sbLIZ.append('?');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final String LIZIZ(String str, Map<String, ? extends Object> map) {
        if (!a0.LJJJIL(str) && !map.isEmpty()) {
            C2089008Gi c2089008Gi = new C2089008Gi(str);
            for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                String str2 = (String) entry.getKey();
                Object value = entry.getValue();
                if ((!a0.LJJJIL(str2)) && value != null) {
                    c2089008Gi.LIZLLL(str2, value.toString());
                }
            }
            return c2089008Gi.LJ();
        }
        return str;
    }

    public static final String LIZJ(String str, Map<String, String> map) {
        LIZ.getClass();
        String strLIZ = LIZ("/pgc_sub_package");
        LinkedHashMap linkedHashMapLJII = C2097608Jq.LJII(new Pair("sec_anchor_id", str));
        linkedHashMapLJII.putAll(map);
        return LIZIZ(strLIZ, linkedHashMapLJII);
    }

    public static final String LIZLLL(String str, String str2, String str3, String str4, Map<String, String> map) {
        LIZ.getClass();
        String strLIZ = LIZ("/pgc_sub_only_space");
        LinkedHashMap linkedHashMapLJII = C2097608Jq.LJII(new Pair("sec_anchor_id", str), new Pair("enter_from", str2), new Pair("is_fullscreen", str3), new Pair("preview_mode", str4));
        linkedHashMapLJII.putAll(map);
        return LIZIZ(strLIZ, linkedHashMapLJII);
    }
}
