package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;

/* JADX INFO: renamed from: X.04pQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1216604pQ {
    public static volatile Gson LIZ;

    public static Gson LIZ() {
        if (LIZ == null) {
            synchronized (C1216604pQ.class) {
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
