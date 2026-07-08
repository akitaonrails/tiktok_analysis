package X;

import android.os.RemoteException;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1BS8, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BS8 {
    public final C1BSF LIZ;

    public final int hashCode() {
        try {
            return this.LIZ.LJIIJJI();
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C829150Wfp(e);
        }
    }

    public C1BS8(C1BSF c1bsf) {
        C0W3J.LJIIIIZZ(c1bsf);
        this.LIZ = c1bsf;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1BS8)) {
            return false;
        }
        try {
            return this.LIZ.LJLIL(((C1BS8) obj).LIZ);
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C829150Wfp(e);
        }
    }
}
