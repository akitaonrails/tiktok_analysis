package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0brr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C989930brr extends AbstractC989950brt {
    public final int LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C989930brr)) {
            return false;
        }
        C989930brr c989930brr = (C989930brr) obj;
        return this.LIZ == c989930brr.LIZ && Intrinsics.LJFF(this.LIZIZ, c989930brr.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c989930brr.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c989930brr.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31;
        String str = this.LIZLLL;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ContainerFailed(errorCode=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", templateName=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", templateUrl=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", message=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C989930brr(int i, String str, String str2, String str3) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
    }
}
