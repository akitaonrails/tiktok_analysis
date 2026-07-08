package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0g7N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1153310g7N {
    public final Long LIZ;
    public final Long LIZIZ;

    public C1153310g7N() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1153310g7N)) {
            return false;
        }
        C1153310g7N c1153310g7N = (C1153310g7N) obj;
        return Intrinsics.LJFF(this.LIZ, c1153310g7N.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1153310g7N.LIZIZ);
    }

    public final int hashCode() {
        Long l = this.LIZ;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.LIZIZ;
        return iHashCode + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SubPageOwnerState(ownerUserId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", ownerRank=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1153310g7N(Long l, Long l2) {
        this.LIZ = l;
        this.LIZIZ = l2;
    }
}
