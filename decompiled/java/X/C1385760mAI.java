package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mAI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1385760mAI {
    public final int LIZ;
    public final C0VRK LIZIZ;
    public final long LIZJ;
    public final String LIZLLL;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1385760mAI)) {
            return false;
        }
        C1385760mAI c1385760mAI = (C1385760mAI) obj;
        return this.LIZ == c1385760mAI.LIZ && this.LIZIZ == c1385760mAI.LIZIZ && this.LIZJ == c1385760mAI.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1385760mAI.LIZLLL) && Intrinsics.LJFF(this.LJ, c1385760mAI.LJ);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31;
        String str = this.LIZLLL;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InputEvent(index=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", type=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", timestamp=");
        sbLIZ.append((Object) C1385770mAJ.LIZIZ(10, this.LIZJ));
        sbLIZ.append(", character=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", previousText=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1385760mAI(int i, C0VRK c0vrk, long j, String str, String str2) {
        this.LIZ = i;
        this.LIZIZ = c0vrk;
        this.LIZJ = j;
        this.LIZLLL = str;
        this.LJ = str2;
    }
}
