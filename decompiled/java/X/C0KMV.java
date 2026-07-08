package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0KMV, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KMV {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(int i, String str, Map map) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_subscribe_failed");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "error_code");
        c474500IjALIZ.LJJII(str, "failed_reason");
        c474500IjALIZ.LJJII(0, "is_shorten_version");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LIZ();
    }

    public static void LIZIZ(int i, String str, Map map) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_subscription_purchase_failed");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "error_code");
        c474500IjALIZ.LJJII(str, "failed_reason");
        c474500IjALIZ.LJJII(0, "is_shorten_version");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LIZ();
    }
}
