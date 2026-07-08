package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: X.0pzp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1533030pzp {
    public static final C1533030pzp LIZ = new C1533030pzp();
    public static final LinkedHashSet<InterfaceC1532560pz4> LIZIZ = new LinkedHashSet<>();
    public static final LinkedHashSet<InterfaceC1533010pzn> LIZJ = new LinkedHashSet<>();

    public final synchronized void LIZ(InterfaceC1532560pz4 interfaceC1532560pz4) {
        while (true) {
            try {
                LIZIZ.add(interfaceC1532560pz4);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    public final synchronized void LIZIZ(C1533060pzs c1533060pzs) {
        while (true) {
            try {
                LIZIZ.remove(c1533060pzs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }
}
