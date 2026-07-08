package X;

import fyo.e;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0oHs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1467340oHs {
    public final WeakReference<C1466990oHJ> LIZ;

    public C1467340oHs(C1466990oHJ c1466990oHJ) {
        this.LIZ = new WeakReference<>(c1466990oHJ);
    }

    public final void LIZ(e eVar, String str) {
        C1466990oHJ c1466990oHJ = this.LIZ.get();
        if (c1466990oHJ == null) {
            return;
        }
        if (str != null && eVar == null) {
            if (c1466990oHJ.LJIIIIZZ != null) {
                c1466990oHJ.LJLLLL(str);
            }
        } else {
            C1468160oJC c1468160oJC = c1466990oHJ.LLLZIL;
            c1468160oJC.getClass();
            if (eVar == null) {
                return;
            }
            c1468160oJC.LLIILZL = eVar.toString();
            c1468160oJC.LLIIZ = C1468160oJC.LJJIJIIJI(1, eVar.LIZ);
        }
    }
}
