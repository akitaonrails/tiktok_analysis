package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import xlp.c;

/* JADX INFO: renamed from: X.0XML, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XML extends AbstractC842530X3j {
    public final /* synthetic */ C0X0P LIZ;
    public final /* synthetic */ File LIZIZ;

    @Override // X.AbstractC842530X3j
    public final long LIZ() {
        return this.LIZIZ.length();
    }

    @Override // X.AbstractC842530X3j
    public final C0X0P LIZIZ() {
        return this.LIZ;
    }

    @Override // X.AbstractC842530X3j
    public final void LJ(InterfaceC1496780p3M interfaceC1496780p3M) {
        C1496340p2e c1496340p2eLIZIZ = null;
        try {
            c1496340p2eLIZIZ = C1496330p2d.LIZIZ(this.LIZIZ);
            interfaceC1496780p3M.LLIIJI(c1496340p2eLIZIZ);
            c.LJ(c1496340p2eLIZIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c.LJ(c1496340p2eLIZIZ);
            throw th;
        }
    }

    public C0XML(C0X0P c0x0p, File file) {
        this.LIZ = c0x0p;
        this.LIZIZ = file;
    }
}
