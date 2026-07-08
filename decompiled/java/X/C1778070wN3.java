package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wN3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1778070wN3 {
    public final long LIZ;
    public final C861890XrX LIZIZ;
    public final long LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1778070wN3)) {
            return false;
        }
        C1778070wN3 c1778070wN3 = (C1778070wN3) obj;
        return this.LIZ == c1778070wN3.LIZ && Intrinsics.LJFF(this.LIZIZ, c1778070wN3.LIZIZ) && this.LIZJ == c1778070wN3.LIZJ;
    }

    public final int hashCode() {
        return (((C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PendingScrollToRankRuntime(requestId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", key=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", rank=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1778070wN3(long j, long j2, C861890XrX c861890XrX) {
        this.LIZ = j;
        this.LIZIZ = c861890XrX;
        this.LIZJ = j2;
    }
}
