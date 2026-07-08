package X;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0vq8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1757660vq8 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(boolean z, Map map, Map map2) {
        C0N5M c0n5m;
        HashMap map3 = new HashMap();
        if (map2 != null) {
            map3.putAll(map2);
        }
        if (z) {
            c0n5m = C0N5M.MUTE;
        } else {
            c0n5m = C0N5M.UNMUTE;
        }
        map3.put("action_type", c0n5m.getValue());
        if (map != null) {
            map3.putAll(map);
        }
        C1018703yb.LIZIZ("tiktokec_mini_window_mute", map3);
    }

    public static void LIZ(EnumC1757650vq7 enumC1757650vq7, long j, Map map, Map map2) {
        HashMap map3 = new HashMap();
        if (map2 != null) {
            map3.putAll(map2);
        }
        map3.put("close_type", enumC1757650vq7.getValue());
        map3.put("total_duration", Long.valueOf(j));
        if (map != null) {
            map3.putAll(map);
        }
        C1018703yb.LIZIZ("tiktokec_mini_window_close", map3);
    }
}
