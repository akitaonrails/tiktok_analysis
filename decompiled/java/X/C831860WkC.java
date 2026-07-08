package X;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0WkC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C831860WkC implements InterfaceC831990WkP {
    public final C831840WkA LIZ;

    public C831860WkC(C831840WkA c831840WkA) {
        this.LIZ = c831840WkA;
    }

    @Override // X.InterfaceC831990WkP
    public final void LIZ(ConnectionResult connectionResult, C832010WkR<?> c832010WkR, boolean z) {
    }

    @Override // X.InterfaceC831990WkP
    public final void LIZJ(Bundle bundle) {
    }

    @Override // X.InterfaceC831990WkP
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC831990WkP
    public final void LJ() {
    }

    @Override // X.InterfaceC831990WkP
    public final boolean LJI() {
        this.LIZ.LLJILJILJ.getClass();
        this.LIZ.LJII();
        return true;
    }

    @Override // X.InterfaceC831990WkP
    public final <A, T extends AbstractC831980WkO<? extends InterfaceC832870Wlp, A>> T LIZIZ(T t) {
        try {
            C832040WkU c832040WkU = this.LIZ.LLJILJILJ.LJIL;
            c832040WkU.LIZ.add(t);
            t.LJI.set(c832040WkU.LIZIZ);
            C831920WkI c831920WkI = this.LIZ.LLJILJILJ;
            InterfaceC831160Wj4 interfaceC831160Wj4 = c831920WkI.LJIILJJIL.get(t.LJIILJJIL);
            C0W3J.LJIIIZ(interfaceC831160Wj4, "Appropriate Api was not requested.");
            if (!interfaceC831160Wj4.isConnected()) {
                if (((HashMap) this.LIZ.LLIZ).containsKey(t.LJIILJJIL)) {
                    t.LJIILJJIL(new Status(17, null));
                    return t;
                }
            }
            try {
                try {
                    t.LJIILIIL(interfaceC831160Wj4);
                    return t;
                } catch (DeadObjectException e) {
                    TryCatchGuardChecker.doCheck(e);
                    t.LJIILJJIL(new Status(8, null, e.getLocalizedMessage()));
                    throw e;
                }
            } catch (RemoteException e2) {
                TryCatchGuardChecker.doCheck(e2);
                t.LJIILJJIL(new Status(8, null, e2.getLocalizedMessage()));
                return t;
            }
        } catch (DeadObjectException e3) {
            TryCatchGuardChecker.doCheck(e3);
            this.LIZ.LJIIIIZZ(new AbstractC832250Wkp(this) { // from class: X.0Wkk
                @Override // X.AbstractC832250Wkp
                public final void LIZ() {
                    this.LIZIZ.LJFF(1);
                }
            });
            return t;
        }
    }

    @Override // X.InterfaceC831990WkP
    public final void LJFF(int i) {
        this.LIZ.LJII();
        this.LIZ.LLJILLL.LIZJ(i);
    }
}
