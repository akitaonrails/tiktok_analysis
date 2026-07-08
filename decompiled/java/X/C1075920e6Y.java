package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0e6Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1075920e6Y {
    public final String LIZ;
    public final Long LIZIZ;
    public final Long LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1075920e6Y)) {
            return false;
        }
        C1075920e6Y c1075920e6Y = (C1075920e6Y) obj;
        return Intrinsics.LJFF(this.LIZ, c1075920e6Y.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1075920e6Y.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1075920e6Y.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        Long l = this.LIZIZ;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.LIZJ;
        return iHashCode2 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommentPollPayload(awemeId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", serverPollId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", localPollId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1075920e6Y(String str, Long l, Long l2) {
        this.LIZ = str;
        this.LIZIZ = l;
        this.LIZJ = l2;
    }

    public /* synthetic */ C1075920e6Y(String str, Long l, Long l2, int i) {
        this(str, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : l2);
    }
}
