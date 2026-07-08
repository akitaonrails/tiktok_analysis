package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07aY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1888807aY {
    public final String LIZ;
    public final Integer LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1888807aY)) {
            return false;
        }
        C1888807aY c1888807aY = (C1888807aY) obj;
        return Intrinsics.LJFF(this.LIZ, c1888807aY.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1888807aY.LIZIZ) && this.LIZJ == c1888807aY.LIZJ;
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        Integer num = this.LIZIZ;
        return ((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShellResult(output=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", exitCode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", timedOut=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1888807aY(Integer num, String str, boolean z) {
        this.LIZ = str;
        this.LIZIZ = num;
        this.LIZJ = z;
    }
}
