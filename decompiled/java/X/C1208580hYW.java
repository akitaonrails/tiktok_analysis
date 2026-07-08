package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0hYW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1208580hYW {
    public static String LIZIZ(int i) {
        if (i == 0) {
            return "success";
        }
        switch (i) {
            case -10004:
                return "config_query_failed";
            case -10003:
                return "config_not_found";
            case -10002:
                return "yu";
            case -10001:
                return "nl";
            default:
                switch (i) {
                    case -998:
                        return "init_checker_failed";
                    case -997:
                        return "config_parse_error";
                    case -996:
                        return "invalid_configs";
                    default:
                        return "unknown";
                }
        }
    }

    public static C1208190hXt LIZ(int i, String str, String str2) {
        int i2;
        if (i != 10001) {
            if (i != 20001) {
                if (i != 30001) {
                    if (i != 40001) {
                        i2 = -999;
                    } else {
                        i2 = -10004;
                    }
                } else {
                    i2 = -10003;
                }
            } else {
                i2 = -10002;
            }
        } else {
            i2 = -10001;
        }
        return LIZJ(i2, LIZIZ(i2), str, str2);
    }

    public static C1208190hXt LIZJ(int i, String str, String str2, String str3) {
        return new C1208190hXt((C0V0R) null, new LinkedHashMap(), new LinkedHashMap(), (Map<String, C1208180hXs>) C2097608Jq.LJ(), new ArrayList(), (String) null, str2, i, str, str3);
    }
}
