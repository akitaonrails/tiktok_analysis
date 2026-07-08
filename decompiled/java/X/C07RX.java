package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.07RX, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07RX {
    public static final HashMap<String, Integer> LIZ;

    static {
        HashMap<String, Integer> map = new HashMap<>();
        LIZ = map;
        map.put("xx", 12334);
    }

    public static Integer LIZ(String str) {
        return LIZ.get(str);
    }
}
