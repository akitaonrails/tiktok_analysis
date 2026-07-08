package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0q2T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1534670q2T {
    public InterfaceC1534970q2x LIZ;
    public Integer LIZIZ;

    public final void LIZ() {
        Unit unit;
        try {
            InterfaceC1534970q2x interfaceC1534970q2x = this.LIZ;
            if (interfaceC1534970q2x != null) {
                interfaceC1534970q2x.close();
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        this.LIZ = null;
    }
}
