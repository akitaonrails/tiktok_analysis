package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0r4t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1574610r4t {
    public static final C1574610r4t LIZ = new C1574610r4t();
    public static final C199596137q LIZIZ;

    static {
        C199593137n c199593137n = new C199593137n();
        c199593137n.LIZJ(3600L, TimeUnit.SECONDS);
        c199593137n.LIZLLL(10L);
        LIZIZ = c199593137n.LIZ();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void LIZ(String str, Function0<? extends Aweme> function0) {
        Cloneable cloneable;
        synchronized (this) {
            try {
                C199596137q c199596137q = LIZIZ;
                if (c199596137q.LJIIIZ(str) == null && (cloneable = (Aweme) function0.invoke()) != null) {
                    c199596137q.LL.put((K) str, (V) cloneable);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
