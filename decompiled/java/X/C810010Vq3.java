package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Vq3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C810010Vq3 {
    public static volatile C810010Vq3 LIZ;

    public static C810010Vq3 LIZ() {
        if (LIZ == null) {
            synchronized (C810010Vq3.class) {
                try {
                    if (LIZ == null) {
                        LIZ = new C810010Vq3();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZ;
    }
}
