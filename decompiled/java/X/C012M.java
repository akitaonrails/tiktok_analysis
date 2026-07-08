package X;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.012M, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C012M {
    public final LinkedHashMap<Integer, LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>>> LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C012M)) {
            return false;
        }
        C012M c012m = (C012M) obj;
        return Intrinsics.LJFF(this.LIZ, c012m.LIZ) && this.LIZIZ == c012m.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GuardianGroupReorderResult(panelListMap=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", didDemoteGuardianGroup=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C012M(LinkedHashMap<Integer, LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>>> linkedHashMap, boolean z) {
        this.LIZ = linkedHashMap;
        this.LIZIZ = z;
    }
}
