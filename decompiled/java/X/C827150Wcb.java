package X;

import android.content.Context;

/* JADX INFO: renamed from: X.0Wcb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C827150Wcb {
    public static volatile long LIZ;
    public static volatile boolean LIZIZ;

    static {
        C587840N3u.LIZ.LIZ(EnumC587870N3x.VIDEO_REQ);
        LIZ = -1L;
        LIZIZ = false;
    }

    public static boolean LIZ() {
        if (LIZIZ) {
            return true;
        }
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        if (LIZ <= 0) {
            LIZ = C810670Vr7.LIZJ(contextLIZ, 0, "ies_log_flag").getLong("first_install_time_key", C1514430pVp.LIZLLL ? -1L : 1L);
            if (LIZ <= 0) {
                LIZ = System.currentTimeMillis();
                C810670Vr7.LIZJ(C844470XAv.LIZ(), 0, "ies_log_flag").edit().putLong("first_install_time_key", System.currentTimeMillis()).apply();
            }
        }
        if (LIZ + 172800000 > System.currentTimeMillis()) {
            return false;
        }
        if (!LIZIZ) {
            LIZIZ = true;
            C810670Vr7.LIZJ(contextLIZ, 0, "ies_log_flag").edit().putLong("first_install_time_key", 1L).apply();
        }
        return true;
    }
}
