package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.04m0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1195404m0 {
    public static final Map<String, Integer> LIZ = new LinkedHashMap();

    public static int LIZ(String str) {
        Integer num;
        if (str == null || str.length() == 0 || (num = (Integer) ((LinkedHashMap) LIZ).get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }
}
