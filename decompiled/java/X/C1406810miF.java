package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0miF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1406810miF extends AbstractC1406770miB {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1406810miF)) {
            return false;
        }
        C1406810miF c1406810miF = (C1406810miF) obj;
        return Intrinsics.LJFF(this.LIZ, c1406810miF.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1406810miF.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1406810miF.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1406810miF.LIZLLL) && Intrinsics.LJFF(this.LJ, c1406810miF.LJ);
    }

    public final int hashCode() {
        return (((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PropSearch(enterMethod=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", searchKeyword=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", searchId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isSuccess=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", duration=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1406810miF(String str, String str2, String str3, String str4, String str5) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
    }
}
