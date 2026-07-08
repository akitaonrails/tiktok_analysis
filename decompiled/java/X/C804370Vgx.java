package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0Vgx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C804370Vgx {
    public static C804390Vgz LIZIZ;
    public static final AtomicBoolean LIZ = new AtomicBoolean(false);
    public static boolean LIZJ = false;

    public static C804390Vgz LIZ() {
        if (LIZIZ == null) {
            synchronized (C804370Vgx.class) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = new C804390Vgz();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZIZ;
    }
}
