package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS206S0000000_18;

/* JADX INFO: renamed from: X.0hKI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1199760hKI {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(719));
    public int LIZIZ = -1;
    public int LIZJ = -1;
    public int LIZLLL = -1;
    public final List<Function1<Integer, Unit>> LJ = new ArrayList();
    public final List<Function0<Unit>> LJFF = new ArrayList();
    public boolean LJI;

    public final void LIZ() {
        int i;
        int i2 = this.LIZJ;
        if (i2 < 0 || (i = this.LIZIZ) < 0) {
            return;
        }
        this.LIZLLL = Math.abs(i2 - i);
        C1205320hTG c1205320hTG = C1205320hTG.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('[');
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(" - ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append("] = ");
        sbLIZ.append(this.LIZLLL);
        c1205320hTG.LIZJ("UGC", C2188811AlT.LIZIZ(sbLIZ));
    }
}
