package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0KMW, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KMW {
    public static final C0KMW LIZ = new C0KMW();

    public static void LIZ(int i, String str, Map map) {
        C511970K5z c511970K5z = new C511970K5z("livesdk_subscribe_failed");
        c511970K5z.LIZIZ(Integer.valueOf(i), "error_code");
        c511970K5z.LIZIZ(str, "failed_reason");
        c511970K5z.LIZIZ(0, "is_shorten_version");
        c511970K5z.LIZJ(map);
        C0K61.LIZ(c511970K5z, null);
        c511970K5z.LIZLLL();
    }

    public static void LIZIZ(int i, String str, Map map) {
        C511970K5z c511970K5z = new C511970K5z("livesdk_subscription_purchase_failed");
        c511970K5z.LIZIZ(Integer.valueOf(i), "error_code");
        c511970K5z.LIZIZ(str, "failed_reason");
        c511970K5z.LIZIZ(0, "is_shorten_version");
        c511970K5z.LIZJ(map);
        C0K61.LIZ(c511970K5z, null);
        c511970K5z.LIZLLL();
    }
}
