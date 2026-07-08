package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YSW, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YSW implements InterfaceC874460YSe {
    public final Long LIZ;
    public final C0Y8T LIZIZ;
    public final C0YPQ LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0YSW)) {
            return false;
        }
        C0YSW c0ysw = (C0YSW) obj;
        return Intrinsics.LJFF(this.LIZ, c0ysw.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0ysw.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0ysw.LIZJ);
    }

    public final int hashCode() {
        Long l = this.LIZ;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        C0Y8T c0y8t = this.LIZIZ;
        int iHashCode2 = (iHashCode + (c0y8t == null ? 0 : c0y8t.hashCode())) * 31;
        C0YPQ c0ypq = this.LIZJ;
        return iHashCode2 + (c0ypq != null ? c0ypq.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Synced(assignedConvShortId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", conversation=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", error=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0YSW(Long l, C0Y8T c0y8t, C0YPR c0ypr) {
        this.LIZ = l;
        this.LIZIZ = c0y8t;
        this.LIZJ = c0ypr;
    }
}
