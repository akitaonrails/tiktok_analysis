package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0jiX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1291670jiX {
    public static C1291680jiY LIZ() {
        if (C1291680jiY.LIZIZ == null) {
            synchronized (C1291680jiY.class) {
                try {
                    if (C1291680jiY.LIZIZ == null) {
                        C1291680jiY.LIZIZ = new C1291680jiY();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        C1291680jiY c1291680jiY = C1291680jiY.LIZIZ;
        if (c1291680jiY == null) {
            Intrinsics.LJIIL();
        }
        return c1291680jiY;
    }
}
