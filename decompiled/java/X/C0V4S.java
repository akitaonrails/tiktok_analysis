package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0V4S, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V4S {
    public static volatile C0V4S LIZIZ;
    public volatile Object LIZ;

    public final Object LIZ() {
        if (this.LIZ == null) {
            synchronized (C0V4S.class) {
                try {
                    if (this.LIZ == null) {
                        try {
                            this.LIZ = Class.forName("android.os.SystemProperties").newInstance();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    throw th2;
                }
            }
        }
        return this.LIZ;
    }
}
