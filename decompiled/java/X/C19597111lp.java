package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.11lp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19597111lp {
    public static void LIZIZ() {
        C0P0T c0p0t;
        synchronized (C19597211lq.LLJ) {
            try {
                WeakReference<C0P0T> weakReference = C19597211lq.LLJI;
                if (weakReference != null && (c0p0t = weakReference.get()) != null) {
                    c0p0t.dismiss();
                }
                C19597211lq.LLJI = null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LIZ(C0P0T c0p0t) {
        C0P0T c0p0t2;
        synchronized (C19597211lq.LLJ) {
            try {
                WeakReference<C0P0T> weakReference = C19597211lq.LLJI;
                if (weakReference != null) {
                    c0p0t2 = weakReference.get();
                } else {
                    c0p0t2 = null;
                }
                if (c0p0t2 == c0p0t) {
                    C19597211lq.LLJI = null;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
