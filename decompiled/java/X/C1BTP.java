package X;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.maps.GoogleMapOptions;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.1BTP, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BTP extends AbstractC2203141BKm {
    public final ViewGroup LJ;
    public final Context LJFF;
    public InterfaceC2190731AoZ LJI;
    public final GoogleMapOptions LJII;
    public final List LJIIIIZZ = new ArrayList();

    @Override // X.AbstractC2203141BKm
    public final void LIZ(C2203151BKn c2203151BKn) {
        this.LJI = c2203151BKn;
        if (c2203151BKn != null && this.LIZ == 0) {
            try {
                try {
                    Context context = this.LJFF;
                    synchronized (C1BTM.class) {
                        C1BTM.LIZ(context);
                    }
                    C1BTY c1btyA0 = C829110Wfl.LIZ(this.LJFF).a0(new C0WH6(this.LJFF), this.LJII);
                    if (c1btyA0 != null) {
                        ((C2203151BKn) this.LJI).LIZ(new C1BTU(this.LJ, c1btyA0));
                        for (InterfaceC2205441BTi interfaceC2205441BTi : (ArrayList) this.LJIIIIZZ) {
                            C1BTU c1btu = (C1BTU) this.LIZ;
                            c1btu.getClass();
                            try {
                                c1btu.LIZIZ.LJJIII(new BinderC2205391BTd(interfaceC2205441BTi));
                            } catch (RemoteException e) {
                                TryCatchGuardChecker.doCheck(e);
                                throw new C829150Wfp(e);
                            }
                        }
                        ((ArrayList) this.LJIIIIZZ).clear();
                    }
                } catch (C812710VuP e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            } catch (RemoteException e3) {
                TryCatchGuardChecker.doCheck(e3);
                throw new C829150Wfp(e3);
            }
        }
    }

    public C1BTP(ViewGroup viewGroup, Context context, GoogleMapOptions googleMapOptions) {
        this.LJ = viewGroup;
        this.LJFF = context;
        this.LJII = googleMapOptions;
    }
}
