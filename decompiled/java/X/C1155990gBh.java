package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gBh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1155990gBh implements InterfaceC1157570gEF {
    public final Throwable LIZ;
    public final Integer LIZIZ;

    public C1155990gBh() {
        this((Throwable) null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1155990gBh)) {
            return false;
        }
        C1155990gBh c1155990gBh = (C1155990gBh) obj;
        return Intrinsics.LJFF(this.LIZ, c1155990gBh.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1155990gBh.LIZIZ);
    }

    public final int hashCode() {
        Throwable th = this.LIZ;
        int iHashCode = (th == null ? 0 : th.hashCode()) * 31;
        Integer num = this.LIZIZ;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Error(throwable=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1155990gBh(Throwable th, int i) {
        this((Integer) null, (i & 1) != 0 ? null : th);
    }

    public C1155990gBh(Integer num, Throwable th) {
        this.LIZ = th;
        this.LIZIZ = num;
    }
}
