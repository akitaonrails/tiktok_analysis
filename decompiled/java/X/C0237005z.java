package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.005z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0237005z implements AnonymousClass0060 {
    public final Integer LIZ = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0237005z) && Intrinsics.LJFF(this.LIZ, ((C0237005z) obj).LIZ);
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
        sbLIZ.append("LiveEventFetchParams(pullType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
