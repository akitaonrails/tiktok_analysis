package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wMz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1778030wMz implements InterfaceC1778050wN1 {
    public final C861890XrX LIZ;
    public final long LIZIZ;
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1778030wMz)) {
            return false;
        }
        C1778030wMz c1778030wMz = (C1778030wMz) obj;
        return Intrinsics.LJFF(this.LIZ, c1778030wMz.LIZ) && this.LIZIZ == c1778030wMz.LIZIZ && this.LIZJ == c1778030wMz.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failure(key=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", targetUserId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", clickType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1778030wMz(C861890XrX c861890XrX, long j, int i) {
        this.LIZ = c861890XrX;
        this.LIZIZ = j;
        this.LIZJ = i;
    }
}
