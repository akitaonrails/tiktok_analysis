package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0T5B, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public class C0T5B implements Runnable, C0T5I<Runnable> {
    public static final /* synthetic */ int LLILLL = 0;
    public final Runnable LL;
    public final C0W9T LLILLJJLI;

    public final int hashCode() {
        return this.LL.hashCode();
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zLIZ;
        C1C7U.LIZ("DelegateRunnable@3398.run");
        try {
            boolean zLJ = C0W9U.LJ(this.LLILLJJLI);
            try {
                this.LL.run();
                if (zLJ) {
                    C0W9U.LJFF();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (zLJ) {
                    C0W9U.LJFF();
                }
                throw th;
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DelegateRunnable@3398.run");
    }

    @Override // X.C0T5I
    public final /* bridge */ /* synthetic */ Runnable LIZJ() {
        return this.LL;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C0T5B) && Intrinsics.LJFF(this.LL, ((C0T5B) obj).LL)) {
            return true;
        }
        return false;
    }

    public C0T5B(Runnable runnable, C0W9T c0w9t) {
        this.LL = runnable;
        this.LLILLJJLI = c0w9t;
    }
}
