package X;

import java.util.Map;

/* JADX INFO: renamed from: X.10Ng, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19235810Ng {
    public static String LIZ(Integer num) {
        if (num != null) {
            int iIntValue = num.intValue();
            Map<Integer, C10NW> map = C10NW.map;
            if (map.get(Integer.valueOf(iIntValue)) != null) {
                C10NW c10nw = map.get(Integer.valueOf(num.intValue()));
                if (c10nw != null) {
                    return c10nw.getDesc();
                }
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
            return "unknown";
        }
        return "unknown";
    }
}
