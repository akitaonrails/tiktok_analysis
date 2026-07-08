package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.003u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0180003u {
    public final String LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0180003u)) {
            return false;
        }
        C0180003u c0180003u = (C0180003u) obj;
        return Intrinsics.LJFF(this.LIZ, c0180003u.LIZ) && this.LIZIZ == c0180003u.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QuickShareCandidateRef(candidateId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", type=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0180003u(String str, long j) {
        this.LIZ = str;
        this.LIZIZ = j;
    }
}
