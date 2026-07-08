package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0063, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class AnonymousClass0063 implements AnonymousClass0060 {
    public final Integer LIZ = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AnonymousClass0063) && Intrinsics.LJFF(this.LIZ, ((AnonymousClass0063) obj).LIZ);
    }

    public final int hashCode() {
        Integer num = this.LIZ;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryCelebrationFetchParams(pullType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
