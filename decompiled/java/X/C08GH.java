package X;

import Y.ARunnableS103S0100000_3;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Choreographer;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: X.08GH, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public abstract class C08GH {
    public final boolean LIZ = false;
    public final boolean LIZIZ = false;
    public final List<C08GI> LIZJ = new LinkedList();
    public int LIZLLL;

    public abstract Pair<C08GC, Boolean> LIZIZ(int i, Choreographer choreographer);

    public abstract void LIZJ();

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getClass().getName());
        sbLIZ.append("{");
        LIZJ();
        sbLIZ.append("POLICY_H");
        sbLIZ.append(", ");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append("}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LIZ(int i, C08GC c08gc) {
        boolean z;
        int i2;
        SystemClock.uptimeMillis();
        if (c08gc.LIZLLL && !c08gc.LJ) {
            c08gc.LIZ();
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i2 = 2;
        } else {
            i2 = 3;
        }
        this.LIZLLL = i2;
        if (!this.LIZJ.isEmpty()) {
            C786410Ut5.LJLIIL(0L, C08GF.LIZ().LIZ, new ARunnableS103S0100000_3(this, i, 3, z, 162));
        }
    }
}
