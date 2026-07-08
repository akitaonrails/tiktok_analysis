package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AwS133S1200000_17;

/* JADX INFO: renamed from: X.0eYq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1093460eYq implements InterfaceC1093480eYs {
    public final InterfaceC1092770eXj LIZ;

    public C1093460eYq() {
        this(null);
    }

    public C1093460eYq(InterfaceC1092770eXj interfaceC1092770eXj) {
        this.LIZ = interfaceC1092770eXj;
    }

    @Override // X.InterfaceC1093480eYs
    public final void LIZ(C796430VMb c796430VMb, C0VMV c0vmv, C1093150eYL c1093150eYL) {
        boolean z;
        C1093490eYt.LIZ(this, c796430VMb, c0vmv, c1093150eYL);
        String strLIZ = C0VPJ.LIZ(String.valueOf(c796430VMb.LIZ), c796430VMb.LIZIZ, c796430VMb.LIZJ);
        InterfaceC1092770eXj interfaceC1092770eXjLIZ = this.LIZ;
        if (interfaceC1092770eXjLIZ == null) {
            interfaceC1092770eXjLIZ = c0vmv.LIZ(strLIZ);
        }
        if (interfaceC1092770eXjLIZ != null) {
            z = true;
        } else {
            z = false;
        }
        try {
            C784440Upu.LIZ().LIZIZ(new C00IQ("native_callback", c796430VMb.LIZJ, Boolean.valueOf(z), c796430VMb.LIZIZ, null, null, null, null, null));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        C500260Jjc.LJJLIIIJJIZ(new AwS133S1200000_17(interfaceC1092770eXjLIZ, strLIZ, c1093150eYL, 4));
        C1093620eZ6.LIZ(new C1093630eZ7(c796430VMb.LIZIZ, c796430VMb.LIZJ, 1, null, null, null, 56));
    }
}
