package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.0VxS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C814600VxS {
    public static final C814600VxS LIZ = new C814600VxS();

    public static void LIZ(int i, int i2, C813900VwK c813900VwK) {
        HashMap map = new HashMap();
        map.put("strategy", c813900VwK.LIZIZ);
        map.put("ab_value", String.valueOf(i));
        map.put("local_hour", String.valueOf(i2));
        map.put("should_clear", String.valueOf(c813900VwK.LIZ));
        map.put("enter_from", "app_foreground");
        C20684815ws.LJIILLIIL("push_foreground_clear_decision", map);
    }
}
