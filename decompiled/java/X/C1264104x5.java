package X;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04x5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1264104x5 {
    public final Set<String> LIZ;
    public final boolean LIZIZ = true;
    public final Set<String> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1264104x5)) {
            return false;
        }
        C1264104x5 c1264104x5 = (C1264104x5) obj;
        return Intrinsics.LJFF(this.LIZ, c1264104x5.LIZ) && this.LIZIZ == c1264104x5.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1264104x5.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SlotConsumeStrategyConfig(slotIds=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", deferAddWhenPlayerPaused=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", suppressAddAfterEvents=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1264104x5(Set set, Set set2) {
        this.LIZ = set;
        this.LIZJ = set2;
    }
}
