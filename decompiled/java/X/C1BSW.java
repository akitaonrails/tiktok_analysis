package X;

import X.C1BSX;
import android.os.Looper;
import android.os.RemoteException;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.1BSW, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public abstract class C1BSW<O, C extends C1BSX> {
    public final C1BSM LIZ;
    public final Map<O, C> LIZIZ;

    public C1BSW(C1BSM c1bsm) {
        new HashMap();
        this.LIZIZ = new HashMap();
        this.LIZ = c1bsm;
        C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new Runnable() { // from class: X.1BSN
            public final void LIZ() {
                C2205211BSl c2205211BSl = (C2205211BSl) this.LL;
                C1BSM c1bsm2 = c2205211BSl.LIZ;
                if (c1bsm2 != null) {
                    try {
                        c1bsm2.LIZ.LJZ(new BinderC2205281BSs(c2205211BSl));
                        C1BSM c1bsm3 = c2205211BSl.LIZ;
                        c1bsm3.getClass();
                        try {
                            c1bsm3.LIZ.T(new BinderC2205291BSt(c2205211BSl));
                            c2205211BSl.LIZ.LIZLLL(c2205211BSl);
                            C1BSM c1bsm4 = c2205211BSl.LIZ;
                            c1bsm4.getClass();
                            try {
                                c1bsm4.LIZ.LLLLLZ(new BinderC2205141BSe(c2205211BSl));
                                C1BSM c1bsm5 = c2205211BSl.LIZ;
                                c1bsm5.getClass();
                                try {
                                    c1bsm5.LIZ.B0(new C1BSR(c2205211BSl));
                                } catch (RemoteException e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    throw new C829150Wfp(e);
                                }
                            } catch (RemoteException e2) {
                                TryCatchGuardChecker.doCheck(e2);
                                throw new C829150Wfp(e2);
                            }
                        } catch (RemoteException e3) {
                            TryCatchGuardChecker.doCheck(e3);
                            throw new C829150Wfp(e3);
                        }
                    } catch (RemoteException e4) {
                        TryCatchGuardChecker.doCheck(e4);
                        throw new C829150Wfp(e4);
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("MapObjectManager@15fc.<init>$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("MapObjectManager@15fc.<init>$1");
            }
        });
    }

    public final void LIZJ(Object obj) {
        C1BSX c1bsx = (C1BSX) ((HashMap) this.LIZIZ).get(obj);
        if (c1bsx != null && c1bsx.LIZ.remove(obj)) {
            ((HashMap) c1bsx.LIZIZ.LIZIZ).remove(obj);
            c1bsx.LIZIZ.getClass();
            C2205271BSr c2205271BSr = (C2205271BSr) obj;
            c2205271BSr.getClass();
            try {
                c2205271BSr.LIZ.LJIILL();
            } catch (RemoteException e) {
                TryCatchGuardChecker.doCheck(e);
                throw new C829150Wfp(e);
            }
        }
    }
}
