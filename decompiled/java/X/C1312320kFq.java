package X;

import Y.ARunnableS120S0100000_20;
import Y.ARunnableS6S0202000_20;
import com.lynx.base.log.LynxLog;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0kFq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1312320kFq implements InterfaceC1290410jgV {
    public final WeakReference<C1312310kFp> LIZ;

    @Override // X.InterfaceC1290380jgS
    public final void onStart() {
    }

    @Override // X.InterfaceC1290380jgS
    public final void onSuccess() {
    }

    public C1312320kFq(C1312310kFp c1312310kFp) {
        this.LIZ = new WeakReference<>(c1312310kFp);
    }

    @Override // X.InterfaceC1290380jgS
    public final void onError(String str) {
        C1312310kFp c1312310kFp = this.LIZ.get();
        if (c1312310kFp != null && !c1312310kFp.LJIJJLI) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("requestSrc error! the src is ");
            sbLIZ.append(c1312310kFp.LJIIJJI);
            sbLIZ.append(" error message is ");
            sbLIZ.append(str);
            LynxLog.e("lynx_SVGRenderer", C2188811AlT.LIZIZ(sbLIZ));
            c1312310kFp.LJIILLIIL = null;
            C1289620jfE.LIZJ(new ARunnableS120S0100000_20(this, 46));
        }
    }

    @Override // X.InterfaceC1290410jgV
    public final void LIZ(String str, C2257191DWj c2257191DWj) {
        C1312310kFp c1312310kFp = this.LIZ.get();
        if (c1312310kFp != null && !c1312310kFp.LJIJJLI) {
            if (c1312310kFp.LJIILIIL) {
                c1312310kFp.LJIIL = str;
                c1312310kFp.LJIIIZ();
            } else {
                if (c2257191DWj == null) {
                    c1312310kFp.LJIILL = false;
                    return;
                }
                C1301610jyZ.LJ().execute(new ARunnableS6S0202000_20(c1312310kFp, c1312310kFp.LJIJI, c1312310kFp.LJIJJ, c2257191DWj, 1));
            }
        }
    }
}
