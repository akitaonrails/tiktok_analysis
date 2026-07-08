package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0pyH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1532070pyH {
    public InterfaceC1532130pyN LIZ;
    public Integer LIZIZ;
    public Integer LIZJ;

    public final void LIZ() {
        Unit unit;
        try {
            InterfaceC1532130pyN interfaceC1532130pyN = this.LIZ;
            if (interfaceC1532130pyN != null) {
                interfaceC1532130pyN.close();
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
