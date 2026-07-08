package X;

import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: X.0mA8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1385660mA8 {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static InterfaceC1367540lgu LIZ(Map map) {
        String str;
        Map map2;
        String str2;
        String str3;
        Map mapLJ;
        String str4;
        char cCharValue;
        Object obj = map.get("type");
        if ((obj instanceof String) && (str = (String) obj) != null) {
            Object obj2 = map.get("event_tracking");
            if (obj2 instanceof Map) {
                map2 = (Map) obj2;
            } else {
                map2 = null;
            }
            String lowerCase = str.toLowerCase(Locale.ROOT);
            switch (lowerCase.hashCode()) {
                case -1063735000:
                    if (lowerCase.equals("post_delimiter")) {
                        Object obj3 = map.get("delimiter");
                        if ((obj3 instanceof String) && (str4 = (String) obj3) != null) {
                            Character chLJLLILLLL = C13LN.LJLLILLLL(str4);
                            if (chLJLLILLLL != null) {
                                cCharValue = chLJLLILLLL.charValue();
                            } else {
                                cCharValue = ' ';
                            }
                            return new C1385640mA6(cCharValue, map2);
                        }
                        throw new IllegalArgumentException("Missing delimiter parameter for PostDelimiter matcher");
                    }
                    break;
                case -980110702:
                    if (lowerCase.equals("prefix")) {
                        return new C1385620mA4(map2);
                    }
                    break;
                case 111309:
                    if (lowerCase.equals("psp")) {
                        Object obj4 = map.get("scene_key");
                        if ((obj4 instanceof String) && (str2 = (String) obj4) != null) {
                            Object obj5 = map.get("strategy_key");
                            if ((obj5 instanceof String) && (str3 = (String) obj5) != null) {
                                Object obj6 = map.get("extra_params");
                                if (!(obj6 instanceof Map) || (mapLJ = (Map) obj6) == null) {
                                    mapLJ = C2097608Jq.LJ();
                                }
                                return new C1385710mAD(str2, str3, mapLJ, map2);
                            }
                            throw new IllegalArgumentException("Missing strategy_key parameter for PSP matcher");
                        }
                        throw new IllegalArgumentException("Missing scene_key parameter for PSP matcher");
                    }
                    break;
                case 530542161:
                    if (lowerCase.equals("substring")) {
                        return new C1385630mA5(map2);
                    }
                    break;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Unknown matcher type: ");
            sbLIZ.append(str);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        throw new IllegalArgumentException("Missing matcher type");
    }
}
