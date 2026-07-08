package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0g77, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C07QN("tako_video_generating_expire_time")
public final class C1153150g77 {
    public static final C1153150g77 LIZ = new C1153150g77();

    public static long LIZ() {
        long jLIZJ = 600;
        try {
            C1153090g71.LIZ.getClass();
            jLIZJ = C1153090g71.LIZJ(C1153150g77.class, 600L);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (jLIZJ < 1) {
            return 1L;
        }
        return jLIZJ;
    }
}
