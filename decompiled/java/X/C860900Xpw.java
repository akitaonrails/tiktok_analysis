package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Xpw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C860900Xpw implements InterfaceC1785530wZ5 {
    public final C861890XrX LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C860900Xpw)) {
            return false;
        }
        C860900Xpw c860900Xpw = (C860900Xpw) obj;
        return Intrinsics.LJFF(this.LIZ, c860900Xpw.LIZ) && this.LIZIZ == c860900Xpw.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ScrollToRank(key=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", rank=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C860900Xpw(long j, C861890XrX c861890XrX) {
        this.LIZ = c861890XrX;
        this.LIZIZ = j;
    }
}
