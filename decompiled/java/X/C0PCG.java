package X;

import java.util.Map;
import kotlin.jvm.internal.AFwS293S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PCG, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PCG implements C0PWT {
    public final Map<String, String> LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0PCG) && Intrinsics.LJFF(this.LL, ((C0PCG) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpdateSearchItemMobParamsAction(mobParams=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        C0Q3E.LJFF().wO2().LIZIZ(C13LE.LIZ(C0PCG.class), AFwS293S0000000_10.get$arr$(95));
    }

    @Override // X.C0PWT
    public final boolean isLog() {
        return C0P9U.LIZ();
    }

    public C0PCG(Map<String, String> map) {
        this.LL = map;
    }
}
