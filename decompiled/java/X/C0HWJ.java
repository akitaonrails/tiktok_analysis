package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0HWJ, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public abstract class C0HWJ implements InterfaceC589510NAf<Boolean> {
    @Override // X.InterfaceC589510NAf
    public final void LIZJ(AbstractC1321260kUG abstractC1321260kUG) {
    }

    @Override // X.InterfaceC589510NAf
    public final void LIZLLL(AbstractC1321260kUG abstractC1321260kUG) {
    }

    public abstract void LJ(InterfaceC1320200kSY<Boolean> interfaceC1320200kSY);

    public abstract void LJFF(boolean z);

    @Override // X.InterfaceC589510NAf
    public final void LIZ(InterfaceC1320200kSY<Boolean> interfaceC1320200kSY) {
        try {
            LJFF(interfaceC1320200kSY.getResult().booleanValue());
            interfaceC1320200kSY.close();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            interfaceC1320200kSY.close();
            throw th;
        }
    }

    @Override // X.InterfaceC589510NAf
    public final void LIZIZ(InterfaceC1320200kSY<Boolean> interfaceC1320200kSY) {
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
