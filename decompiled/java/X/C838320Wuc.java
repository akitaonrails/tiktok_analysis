package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Wuc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C838320Wuc {
    public static C838310Wub LIZ(C825940Wae c825940Wae, String str) {
        C838310Wub c838310Wub;
        synchronized (C838310Wub.LJIIIZ) {
            try {
                c838310Wub = C838310Wub.LJIIJ;
                if (c838310Wub != null) {
                    C838310Wub.LJIIJ = c838310Wub.LJIIIIZZ;
                    c838310Wub.LJIIIIZZ = null;
                    C838310Wub.LJIIJJI--;
                } else {
                    c838310Wub = new C838310Wub();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        c838310Wub.LIZ = c825940Wae;
        c838310Wub.LIZIZ = str;
        C838330Wud c838330Wud = c838310Wub.LJ;
        if (!c838330Wud.LIZLLL) {
            c838330Wud.LIZLLL = true;
            c838330Wud.LIZ.LIZ = System.currentTimeMillis();
            c838330Wud.LIZIZ.LIZ = System.nanoTime();
            c838330Wud.LIZJ.LIZ = SystemClock.currentThreadTimeMillis();
        }
        return c838310Wub;
    }
}
