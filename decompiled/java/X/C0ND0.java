package X;

import com.bytedance.keva.Keva;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0ND0, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0ND0 {
    public final Keva LIZ;
    public final String LIZIZ = "entry_";
    public final String LIZJ = "head";
    public final String LIZLLL = "tail";
    public final long LJ = 500;

    public C0ND0(Keva keva) {
        this.LIZ = keva;
    }

    public final void LIZ(C0ND1 c0nd1) {
        Iterator<String> it2 = c0nd1.LIZLLL.iterator();
        while (it2.hasNext()) {
            this.LIZ.erase(it2.next());
        }
        this.LIZ.storeLong(this.LIZJ, c0nd1.LIZIZ);
    }

    public final String LIZIZ(long j) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(j);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
