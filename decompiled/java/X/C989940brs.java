package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0brs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C989940brs extends AbstractC989950brt {
    public final int LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C989940brs)) {
            return false;
        }
        C989940brs c989940brs = (C989940brs) obj;
        return this.LIZ == c989940brs.LIZ && Intrinsics.LJFF(this.LIZIZ, c989940brs.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c989940brs.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c989940brs.LIZLLL);
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        String str = this.LIZIZ;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZJ;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZLLL;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TemplateFailed(errorCode=");
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

    public C989940brs(int i, String str, String str2, String str3) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
    }
}
