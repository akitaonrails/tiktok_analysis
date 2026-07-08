package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Rb1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C698770Rb1 {
    public final String LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final C698890RbD LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C698770Rb1)) {
            return false;
        }
        C698770Rb1 c698770Rb1 = (C698770Rb1) obj;
        return Intrinsics.LJFF(this.LIZ, c698770Rb1.LIZ) && this.LIZIZ == c698770Rb1.LIZIZ && this.LIZJ == c698770Rb1.LIZJ && Intrinsics.LJFF(this.LIZLLL, c698770Rb1.LIZLLL);
    }

    public final int hashCode() {
        String str = this.LIZ;
        return ((((((str == null ? 0 : str.hashCode()) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExecuteRequest(awemeId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", generation=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", executeSeq=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", request=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C698770Rb1(String str, long j, long j2, C698890RbD c698890RbD) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LIZLLL = c698890RbD;
    }
}
