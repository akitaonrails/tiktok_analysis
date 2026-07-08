package X;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Lmy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C553300Lmy implements InterfaceC553290Lmx {
    public final C553310Lmz LIZIZ;
    public final Set<String> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C553300Lmy)) {
            return false;
        }
        C553300Lmy c553300Lmy = (C553300Lmy) obj;
        return Intrinsics.LJFF(this.LIZIZ, c553300Lmy.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c553300Lmy.LIZJ);
    }

    public final int hashCode() {
        return (this.LIZIZ.hashCode() * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoPauseAndResume(policy=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", drainUntilNodeNames=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C553300Lmy() {
        C553310Lmz c553310Lmz = new C553310Lmz(0);
        InterfaceC553290Lmx.LIZ.getClass();
        Set<String> set = C553230Lmr.LIZIZ;
        this.LIZIZ = c553310Lmz;
        this.LIZJ = set;
    }
}
