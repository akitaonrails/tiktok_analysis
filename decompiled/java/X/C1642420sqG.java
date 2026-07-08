package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.vesdk.VERecorder;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0sqG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1642420sqG {
    public static volatile C1642420sqG LIZIZ;
    public WeakReference<VERecorder> LIZ;

    public static C1642420sqG LIZ() {
        if (LIZIZ != null) {
            return LIZIZ;
        }
        synchronized (C1642420sqG.class) {
            try {
                if (LIZIZ != null) {
                    return LIZIZ;
                }
                LIZIZ = new C1642420sqG();
                return LIZIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final VERecorder LIZIZ() {
        WeakReference<VERecorder> weakReference = this.LIZ;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }
}
