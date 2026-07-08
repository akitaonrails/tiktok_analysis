package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0T59, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T59 extends C0T5B {
    public static final ConcurrentHashMap<Integer, ConcurrentHashMap<Integer, C0T57>> LLILZIL = new ConcurrentHashMap<>();
    public final int LLILZ;

    @Override // X.C0T5B, java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("DelegateRunnableWithMap@cd08.run");
        try {
            try {
                super.run();
                C0T58.LIZ(this.LLILZ, this.LL, true);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C0T58.LIZ(this.LLILZ, this.LL, true);
                throw th;
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DelegateRunnableWithMap@cd08.run");
    }

    public C0T59(Runnable runnable, C0W9T c0w9t) {
        super(runnable, c0w9t);
        this.LLILZ = 1;
    }
}
