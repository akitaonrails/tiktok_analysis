package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wS3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1781170wS3 implements InterfaceC1781190wS5 {
    public final String LIZ;
    public final List<String> LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;
    public final AbstractC874970YUd LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1781170wS3)) {
            return false;
        }
        C1781170wS3 c1781170wS3 = (C1781170wS3) obj;
        return Intrinsics.LJFF(this.LIZ, c1781170wS3.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1781170wS3.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1781170wS3.LIZJ) && this.LIZLLL == c1781170wS3.LIZLLL && Intrinsics.LJFF(this.LJ, c1781170wS3.LJ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        List<String> list = this.LIZIZ;
        int iHashCode2 = (((((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31;
        AbstractC874970YUd abstractC874970YUd = this.LJ;
        return iHashCode2 + (abstractC874970YUd != null ? abstractC874970YUd.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PromptOnly(rankText=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", avatarUrls=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", promptText=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", fromCache=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", error=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1781170wS3(String str, List<String> list, String str2, boolean z, AbstractC874970YUd abstractC874970YUd) {
        this.LIZ = str;
        this.LIZIZ = list;
        this.LIZJ = str2;
        this.LIZLLL = z;
        this.LJ = abstractC874970YUd;
    }
}
