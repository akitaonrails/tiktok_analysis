package X;

import android.app.Activity;
import android.os.RemoteException;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.1BTR, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BTR extends AbstractC2203141BKm {
    public final Fragment LJ;
    public InterfaceC2190731AoZ LJFF;
    public Activity LJI;
    public final List LJII = new ArrayList();

    public final void LJFF() {
        Activity activity = this.LJI;
        if (activity == null || this.LJFF == null || this.LIZ != 0) {
            return;
        }
        try {
            try {
                synchronized (C1BTM.class) {
                    C1BTM.LIZ(activity);
                }
                C1BTW c1btwY = C829110Wfl.LIZ(this.LJI).y(new C0WH6(this.LJI));
                if (c1btwY == null) {
                    return;
                }
                ((C2203151BKn) this.LJFF).LIZ(new C1BTV(this.LJ, c1btwY));
                for (InterfaceC2205441BTi interfaceC2205441BTi : (ArrayList) this.LJII) {
                    C1BTV c1btv = (C1BTV) this.LIZ;
                    c1btv.getClass();
                    try {
                        c1btv.LIZIZ.LJJIII(new BinderC2205401BTe(interfaceC2205441BTi));
                    } catch (RemoteException e) {
                        TryCatchGuardChecker.doCheck(e);
                        throw new C829150Wfp(e);
                    }
                }
                ((ArrayList) this.LJII).clear();
            } catch (C812710VuP e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        } catch (RemoteException e3) {
            TryCatchGuardChecker.doCheck(e3);
            throw new C829150Wfp(e3);
        }
    }

    public C1BTR(Fragment fragment) {
        this.LJ = fragment;
    }

    @Override // X.AbstractC2203141BKm
    public final void LIZ(C2203151BKn c2203151BKn) {
        this.LJFF = c2203151BKn;
        LJFF();
    }
}
