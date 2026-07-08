package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0WN9, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WN9 {
    public final String LIZ;
    public final Object LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final C828420Wee LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0WN9)) {
            return false;
        }
        C0WN9 c0wn9 = (C0WN9) obj;
        return Intrinsics.LJFF(this.LIZ, c0wn9.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0wn9.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0wn9.LIZJ) && this.LIZLLL == c0wn9.LIZLLL && Intrinsics.LJFF(this.LJ, c0wn9.LJ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Object obj = this.LIZIZ;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        String str2 = this.LIZJ;
        return ((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.LIZLLL) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("JSInterfaceEvent(url=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", implClass=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", jsiName=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", dataFlowId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", securityEvent=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0WN9(String str, Object obj, String str2, int i, C828420Wee c828420Wee) {
        this.LIZ = str;
        this.LIZIZ = obj;
        this.LIZJ = str2;
        this.LIZLLL = i;
        this.LJ = c828420Wee;
    }
}
