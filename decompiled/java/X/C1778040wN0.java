package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wN0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1778040wN0 implements InterfaceC1778050wN1 {
    public final C861890XrX LIZ;
    public final long LIZIZ;
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1778040wN0)) {
            return false;
        }
        C1778040wN0 c1778040wN0 = (C1778040wN0) obj;
        return Intrinsics.LJFF(this.LIZ, c1778040wN0.LIZ) && this.LIZIZ == c1778040wN0.LIZIZ && this.LIZJ == c1778040wN0.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Success(key=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", targetUserId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", clickType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1778040wN0(C861890XrX c861890XrX, long j, int i) {
        this.LIZ = c861890XrX;
        this.LIZIZ = j;
        this.LIZJ = i;
    }
}
