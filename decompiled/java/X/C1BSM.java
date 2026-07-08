package X;

import android.os.RemoteException;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.maps.model.CameraPosition;
import java.util.HashMap;

/* JADX INFO: renamed from: X.1BSM, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BSM {
    public final C1BS1 LIZ;
    public C1BT4 LIZIZ;

    public final CameraPosition LIZ() {
        try {
            return this.LIZ.getCameraPosition();
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C829150Wfp(e);
        }
    }

    public final C1BT3 LIZIZ() {
        try {
            return new C1BT3(this.LIZ.k0());
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C829150Wfp(e);
        }
    }

    public final C1BT4 LIZJ() {
        try {
            if (this.LIZIZ == null) {
                this.LIZIZ = new C1BT4(this.LIZ.LJJIIZI());
            }
            return this.LIZIZ;
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C829150Wfp(e);
        }
    }

    public C1BSM(C1BS1 c1bs1) {
        new HashMap();
        C0W3J.LJIIIIZZ(c1bs1);
        this.LIZ = c1bs1;
    }

    public final void LIZLLL(InterfaceC2205331BSx interfaceC2205331BSx) {
        try {
            this.LIZ.D0(new BinderC2205301BSu(interfaceC2205331BSx));
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C829150Wfp(e);
        }
    }
}
