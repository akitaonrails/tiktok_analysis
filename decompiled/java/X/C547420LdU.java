package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LdU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C547420LdU {
    public final String LIZ;
    public final int LIZIZ;
    public final long LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C547420LdU)) {
            return false;
        }
        C547420LdU c547420LdU = (C547420LdU) obj;
        return Intrinsics.LJFF(this.LIZ, c547420LdU.LIZ) && this.LIZIZ == c547420LdU.LIZIZ && this.LIZJ == c547420LdU.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + C786410Ut5.Y2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Step(branch=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", status=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", elapsedMs=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C547420LdU(String str, int i, long j) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = j;
    }
}
