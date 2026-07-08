package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0raA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1594000raA {
    public final C01GW LIZ = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, new C1593990ra9());

    public final InterfaceC1594010raB LIZ() {
        return (InterfaceC1594010raB) this.LIZ.getValue();
    }

    public final String LIZIZ() {
        try {
            return String.valueOf(LIZ().LJIIJ());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJFF(th, "MainTabPreferences AbstractMethodError");
            return "";
        }
    }

    public final void LIZJ(boolean z) {
        try {
            LIZ().LJIIIIZZ(z);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJFF(th, "MainTabPreferences AbstractMethodError");
        }
    }

    public final void LIZLLL(String str) {
        try {
            LIZ().LJII(str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJFF(th, "MainTabPreferences AbstractMethodError");
        }
    }
}
