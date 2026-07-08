package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Vbm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C801160Vbm {
    public static int LIZ = -1;

    public static boolean LIZ() {
        int i = LIZ;
        if (i != -1) {
            return i == 1;
        }
        try {
            Class.forName("ohos.utils.system.SystemCapability");
            LIZ = 1;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZ = 0;
        }
        return LIZ == 1;
    }
}
