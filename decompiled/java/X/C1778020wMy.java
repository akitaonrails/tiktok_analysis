package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wMy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1778020wMy implements InterfaceC1785520wZ4 {
    public final long LIZ;
    public final C861890XrX LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1778020wMy)) {
            return false;
        }
        C1778020wMy c1778020wMy = (C1778020wMy) obj;
        return this.LIZ == c1778020wMy.LIZ && Intrinsics.LJFF(this.LIZIZ, c1778020wMy.LIZIZ);
    }

    public final int hashCode() {
        return (C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PendingScrollToRankConsumed(requestId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", key=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1778020wMy(long j, C861890XrX c861890XrX) {
        this.LIZ = j;
        this.LIZIZ = c861890XrX;
    }
}
