package X;

import android.os.RemoteException;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: renamed from: X.1BSr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2205271BSr {
    public final InterfaceC2205261BSq LIZ;

    public final LatLng LIZ() {
        try {
            return this.LIZ.LJIIJJI();
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C829150Wfp(e);
        }
    }

    public final String LIZIZ() {
        try {
            return this.LIZ.LJIIL();
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C829150Wfp(e);
        }
    }

    public final int hashCode() {
        try {
            return this.LIZ.LIZJ();
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C829150Wfp(e);
        }
    }

    public C2205271BSr(InterfaceC2205261BSq interfaceC2205261BSq) {
        C0W3J.LJIIIIZZ(interfaceC2205261BSq);
        this.LIZ = interfaceC2205261BSq;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2205271BSr)) {
            return false;
        }
        try {
            return this.LIZ.a(((C2205271BSr) obj).LIZ);
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C829150Wfp(e);
        }
    }
}
