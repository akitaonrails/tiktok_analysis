package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0DFe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C336000DFe implements InterfaceC336080DFm {
    public static final C336000DFe LIZ = new C336000DFe();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(3526));

    @Override // X.InterfaceC336080DFm
    public final void LIZ(C1896707bp c1896707bp) {
        DialogC1389620mGW dialogC1389620mGWRemove;
        String str = c1896707bp.LIZ;
        if (str != null) {
            C336010DFf.LIZ(str);
            C336040DFi c336040DFi = C336040DFi.LIZ;
            if (c336040DFi.LIZIZ(str)) {
                c336040DFi.LIZ(str);
            }
            C336020DFg c336020DFg = C336010DFf.LIZJ;
            synchronized (c336020DFg.LIZIZ) {
                try {
                    dialogC1389620mGWRemove = c336020DFg.LIZIZ.remove(str);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (dialogC1389620mGWRemove != null && dialogC1389620mGWRemove.isShowing()) {
                dialogC1389620mGWRemove.dismiss();
                C785410UrT.LIZ(dialogC1389620mGWRemove);
            }
        }
        C335360DCs.LIZ.LIZIZ(c1896707bp);
    }
}
