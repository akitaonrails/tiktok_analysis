package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08p1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2233308p1 extends AbstractC2233208p0 {
    public final String LIZ;
    public final Throwable LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2233308p1)) {
            return false;
        }
        C2233308p1 c2233308p1 = (C2233308p1) obj;
        return Intrinsics.LJFF(this.LIZ, c2233308p1.LIZ) && Intrinsics.LJFF(this.LIZIZ, c2233308p1.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        Throwable th = this.LIZIZ;
        return iHashCode + (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failure(reason=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", exception=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2233308p1(String str, Throwable th) {
        this.LIZ = str;
        this.LIZIZ = th;
    }
}
