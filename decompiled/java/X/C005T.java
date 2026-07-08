package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.005T, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C005T {
    public C005T() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C005T)) {
            return false;
        }
        obj.getClass();
        return Intrinsics.LJFF(null, null) && Intrinsics.LJFF(null, null);
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SlotOperationPlan(slotId=");
        sbLIZ.append((String) null);
        sbLIZ.append(", actionType=");
        sbLIZ.append((Object) null);
        sbLIZ.append(", matchedTimingKey=");
        sbLIZ.append((String) null);
        sbLIZ.append(", effectiveDelayMs=");
        sbLIZ.append(0L);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
