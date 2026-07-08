package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0oy4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1493500oy4 {
    public static volatile C1493500oy4 LIZ;

    public static C1493500oy4 LIZ() {
        if (LIZ == null) {
            synchronized (C1493500oy4.class) {
                try {
                    if (LIZ == null) {
                        LIZ = new C1493500oy4();
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
