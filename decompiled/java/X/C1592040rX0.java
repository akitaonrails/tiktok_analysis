package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AFwS213S0000000_24;

/* JADX INFO: renamed from: X.0rX0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1592040rX0 implements InterfaceC1591950rWr {
    public final C01GW LIZ = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, AFwS213S0000000_24.get$arr$(228));

    public final String LIZ() {
        String strLJIIJ;
        try {
            strLJIIJ = ((InterfaceC1594010raB) this.LIZ.getValue()).LJIIJ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJFF(th, "MainTabPreferences AbstractMethodError");
        }
        return strLJIIJ == null ? "" : strLJIIJ;
    }
}
