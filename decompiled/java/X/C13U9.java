package X;

import Y.ARunnableS130S0100000_30;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: X.13U9, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13U9 {
    public final C13S6 LIZ(C13U8 c13u8, HashMap<String, C13UG> map) {
        if (C13UC.LJIIL == null) {
            synchronized (this) {
                try {
                    if (C13UC.LJIIL == null) {
                        C13UC c13uc = new C13UC(c13u8, map);
                        C13UA.LIZ = c13u8.LJIILJJIL;
                        if (!c13u8.LJIIJJI) {
                            ExecutorService executorServiceLIZLLL = c13u8.LIZJ;
                            if (executorServiceLIZLLL == null) {
                                executorServiceLIZLLL = C823050WQl.LIZLLL();
                            }
                            executorServiceLIZLLL.execute(new ARunnableS130S0100000_30(c13uc, 34));
                        }
                        C13UC.LJIIL = c13uc;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        C13UC c13uc2 = C13UC.LJIIL;
        if (c13uc2 == null) {
            return new C13UC(c13u8, map);
        }
        return c13uc2;
    }
}
