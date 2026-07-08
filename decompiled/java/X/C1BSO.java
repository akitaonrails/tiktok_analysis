package X;

import android.os.RemoteException;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1BSO, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BSO {
    public final C1BSM LIZ;

    public final void LIZIZ() {
        C1BT4 c1bt4LIZJ = this.LIZ.LIZJ();
        c1bt4LIZJ.getClass();
        try {
            c1bt4LIZJ.LIZ.LLLLIIL();
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C829150Wfp(e);
        }
    }

    public C1BSO(C1BSM c1bsm) {
        this.LIZ = c1bsm;
    }

    public final void LIZ(boolean z) {
        C1BT4 c1bt4LIZJ = this.LIZ.LIZJ();
        c1bt4LIZJ.getClass();
        try {
            c1bt4LIZJ.LIZ.LLJLLL(z);
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C829150Wfp(e);
        }
    }
}
