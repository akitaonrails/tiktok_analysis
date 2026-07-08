package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.1D8r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2251031D8r {
    public final C1D84 LIZ;
    public final C2251021D8q LIZIZ;
    public final C2251041D8s LIZJ;
    public C2251051D8t LIZLLL;
    public final int LJ = 100;

    public C2251031D8r(ArrayList arrayList) {
        Iterator it2 = arrayList.iterator();
        int i = 0;
        while (it2.hasNext()) {
            i += ((C1437500nVk) it2.next()).LIZIZ;
        }
        if (i == this.LJ) {
            C1D84 c1d84 = new C1D84();
            this.LIZ = c1d84;
            C2251021D8q c2251021D8q = new C2251021D8q(arrayList, c1d84);
            this.LIZIZ = c2251021D8q;
            this.LIZJ = new C2251041D8s(c2251021D8q);
            this.LIZLLL = new C2251051D8t(0.0f, 0, ((C1437500nVk) ListProtector.get(arrayList, 0)).LIZ);
            return;
        }
        throw new RuntimeException("ProgressCalculator totalProgress not equal");
    }

    public final void LIZ(String str) {
        C1D84 c1d84 = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProgressCalculator | ");
        sbLIZ.append(str);
        c1d84.LIZ(C2188811AlT.LIZIZ(sbLIZ));
    }
}
