package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS547S0100000_3;

/* JADX INFO: renamed from: X.06yx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1785306yx {
    public boolean LIZIZ;
    public final C01GW LIZ = C452501pT.LIZIZ(new C07DC());
    public final C01GW LIZJ = C452501pT.LIZIZ(new C12875052b());

    public final boolean LIZ(Function0<Integer> function0) {
        if (!((Boolean) this.LIZJ.getValue()).booleanValue()) {
            return false;
        }
        if (this.LIZIZ) {
            return true;
        }
        boolean zLJJIJ = C104100aN.LIZ().LJJIJ(new AwS547S0100000_3(function0, (Function0<Unit>) 182));
        this.LIZIZ = zLJJIJ;
        return zLJJIJ;
    }
}
