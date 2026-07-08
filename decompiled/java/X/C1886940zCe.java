package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zCe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1886940zCe {
    public final String LIZ;
    public final C1404290meB LIZIZ;
    public final List<C1869300ykC> LIZJ;
    public final List<C1869290ykB> LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1886940zCe)) {
            return false;
        }
        C1886940zCe c1886940zCe = (C1886940zCe) obj;
        return Intrinsics.LJFF(this.LIZ, c1886940zCe.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1886940zCe.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1886940zCe.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1886940zCe.LIZLLL);
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Campaign(pspSceneKey=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", campaignInfo=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", tasks=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", gameplays=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1886940zCe(String str, C1404290meB c1404290meB, List<C1869300ykC> list, List<C1869290ykB> list2) {
        this.LIZ = str;
        this.LIZIZ = c1404290meB;
        this.LIZJ = list;
        this.LIZLLL = list2;
    }
}
