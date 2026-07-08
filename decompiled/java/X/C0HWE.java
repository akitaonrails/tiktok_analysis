package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0HWE, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public abstract class C0HWE<T> implements InterfaceC589510NAf<T> {
    @Override // X.InterfaceC589510NAf
    public void LIZJ(AbstractC1321260kUG abstractC1321260kUG) {
    }

    @Override // X.InterfaceC589510NAf
    public void LIZLLL(AbstractC1321260kUG abstractC1321260kUG) {
    }

    public abstract void LJ(InterfaceC1320200kSY<T> interfaceC1320200kSY);

    public abstract void LJFF(InterfaceC1320200kSY<T> interfaceC1320200kSY);

    @Override // X.InterfaceC589510NAf
    public final void LIZ(InterfaceC1320200kSY<T> interfaceC1320200kSY) {
        boolean zLIZ = interfaceC1320200kSY.LIZ();
        try {
            LJFF(interfaceC1320200kSY);
            if (zLIZ) {
                interfaceC1320200kSY.close();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (zLIZ) {
                interfaceC1320200kSY.close();
            }
            throw th;
        }
    }

    @Override // X.InterfaceC589510NAf
    public void LIZIZ(InterfaceC1320200kSY<T> interfaceC1320200kSY) {
        try {
            LJ(interfaceC1320200kSY);
            interfaceC1320200kSY.close();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            interfaceC1320200kSY.close();
            throw th;
        }
    }
}
