package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RiO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C703340RiO {
    public final Set<String> LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C703340RiO)) {
            return false;
        }
        C703340RiO c703340RiO = (C703340RiO) obj;
        return Intrinsics.LJFF(this.LIZ, c703340RiO.LIZ) && this.LIZIZ == c703340RiO.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TimingContext(timingSet=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isDefaultExecution=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean LIZ(C703160Ri6 c703160Ri6) {
        if (this.LIZIZ) {
            List<String> list = c703160Ri6.LIZLLL;
            if (list == null || list.isEmpty() || c703160Ri6.LIZJ != null) {
                return true;
            }
            return false;
        }
        List<String> list2 = c703160Ri6.LIZLLL;
        if (list2 != null && !list2.isEmpty()) {
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                return false;
            }
            Iterator<String> it2 = list2.iterator();
            while (it2.hasNext()) {
                if (this.LIZ.contains(it2.next())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public C703340RiO(boolean z, Set set) {
        this.LIZ = set;
        this.LIZIZ = z;
    }
}
