package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS308S0000000_23;

/* JADX INFO: renamed from: X.0SVl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C722430SVl {
    public static final AFwS308S0000000_23 LIZ = AFwS308S0000000_23.get$arr$(21);

    public static Map LIZ(InterfaceC722440SVm interfaceC722440SVm) {
        String str;
        Map<String, String> map;
        String str2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C722360SVe c722360SVeLIZ = interfaceC722440SVm.LIZ();
        String str3 = "";
        if (c722360SVeLIZ == null || (str = c722360SVeLIZ.LIZ) == null) {
            str = "";
        }
        linkedHashMap.put("scenario", str);
        C722360SVe c722360SVeLIZ2 = interfaceC722440SVm.LIZ();
        if (c722360SVeLIZ2 != null && (str2 = c722360SVeLIZ2.LIZIZ) != null) {
            str3 = str2;
        }
        linkedHashMap.put("type", str3);
        C722360SVe c722360SVeLIZ3 = interfaceC722440SVm.LIZ();
        if (c722360SVeLIZ3 != null && (map = c722360SVeLIZ3.LIZJ) != null) {
            linkedHashMap.putAll(map);
        }
        return linkedHashMap;
    }

    public static void LIZJ(String str, InterfaceC722440SVm interfaceC722440SVm) {
        AFwS308S0000000_23 aFwS308S0000000_23 = LIZ;
        Map mapLIZ = LIZ(interfaceC722440SVm);
        mapLIZ.put("view_id", str);
        aFwS308S0000000_23.invoke("tuc_view_click", mapLIZ);
    }

    public static void LIZIZ(String str, String str2, boolean z) {
        String str3;
        AFwS308S0000000_23 aFwS308S0000000_23 = LIZ;
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair("scenario", str);
        pairArr[1] = new Pair("type", str2);
        if (z) {
            str3 = "highest";
        } else {
            str3 = "specific";
        }
        pairArr[2] = new Pair("find_method", str3);
        aFwS308S0000000_23.invoke("tuc_mapping_get_condition", C2097608Jq.LJIIIIZZ(pairArr));
    }
}
