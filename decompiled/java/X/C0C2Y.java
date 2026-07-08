package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;

/* JADX INFO: renamed from: X.0C2Y, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0C2Y {
    public static final Keva LIZ = KevaImpl.getRepo("long_video_keva_repo", 1);

    public static long LIZ() {
        if (!C0BPY.LIZIZ() && C0BPY.LIZ() != 2 && C0BPY.LIZ() != 3) {
            return -1L;
        }
        Keva keva = LIZ;
        if (keva.getLong("last_edge_speed_trigger_time", 0L) == 0) {
            keva.storeLong("last_edge_speed_trigger_time", System.currentTimeMillis());
        }
        return keva.getLong("last_edge_speed_trigger_time", System.currentTimeMillis());
    }
}
