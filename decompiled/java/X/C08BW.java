package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.08BW, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08BW {
    public static int LIZ = -1;

    /* JADX WARN: Type inference failed for: r4v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    public static boolean LIZ() {
        ?? r4;
        int i = LIZ;
        boolean zBooleanValue = false;
        if (i != -1) {
            return i == 1;
        }
        try {
            Class<?> cls = Class.forName("android.util.FtFeature");
            zBooleanValue = ((Boolean) cls.getDeclaredMethod("isFeatureSupport", Integer.TYPE).invoke(cls, 32)).booleanValue();
            r4 = zBooleanValue;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            r4 = zBooleanValue;
        }
        LIZ = r4;
        return r4;
    }
}
