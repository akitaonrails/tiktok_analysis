package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0YH1, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public class C0YH1 {
    public final C0YH7 LIZ;

    public InterfaceC497601wk LIZ() {
        InterfaceC497601wk interfaceC497601wkLIZJ = null;
        if (this.LIZ.isLogin()) {
            try {
                interfaceC497601wkLIZJ = this.LIZ.LJFF().LIZJ();
                return interfaceC497601wkLIZJ;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return interfaceC497601wkLIZJ;
    }

    public C871360YGg LIZIZ() {
        if (!this.LIZ.isLogin()) {
            return null;
        }
        try {
            return this.LIZ.LJFF().LJIIZILJ().getDomain().LIZLLL;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public C0YH1(C0YH7 c0yh7) {
        this.LIZ = c0yh7;
    }
}
