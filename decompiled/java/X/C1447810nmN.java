package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0nmN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1447810nmN extends C1447920nmY {
    public final List<C1447920nmY> LIZLLL = new ArrayList();

    @Override // X.C1447920nmY
    public final void LIZ() {
        Iterator it2 = ((ArrayList) this.LIZLLL).iterator();
        while (it2.hasNext()) {
            ((C1447920nmY) it2.next()).LIZ();
        }
        super.LIZ();
    }

    public final C1447920nmY LIZJ() {
        C1447920nmY c1447920nmY = new C1447920nmY();
        C12WP.LIZ();
        ((ArrayList) this.LIZLLL).add(c1447920nmY);
        return c1447920nmY;
    }

    public final void LIZLLL(C1447920nmY c1447920nmY) {
        C12WP.LIZ();
        ((ArrayList) this.LIZLLL).remove(c1447920nmY);
    }
}
