package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;

/* JADX INFO: renamed from: X.09C2, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09C2 {
    public static volatile Gson LIZ;

    public static Gson LIZ() {
        if (LIZ == null) {
            synchronized (C09C2.class) {
                try {
                    if (LIZ == null) {
                        LIZ = new Gson();
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
