package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lEP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1349870lEP {
    public final TextExtraStruct LIZ;
    public final Comment LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final boolean LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1349870lEP)) {
            return false;
        }
        C1349870lEP c1349870lEP = (C1349870lEP) obj;
        return Intrinsics.LJFF(this.LIZ, c1349870lEP.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1349870lEP.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1349870lEP.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1349870lEP.LIZLLL) && this.LJ == c1349870lEP.LJ && this.LJFF == c1349870lEP.LJFF && this.LJI == c1349870lEP.LJI;
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        Comment comment = this.LIZIZ;
        int iHashCode2 = (iHashCode + (comment == null ? 0 : comment.hashCode())) * 31;
        String str = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZLLL;
        return ((((((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.LJ) * 31) + this.LJFF) * 31) + C786410Ut5.Z2(this.LJI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PendingSearchWordShowEvent(textExtraStruct=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", comment=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", searchPosition=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", lastFromGroupId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", isVideoAds=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", isTrafficAds=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", isStarHub=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1349870lEP(TextExtraStruct textExtraStruct, Comment comment, String str, String str2, int i, int i2, boolean z) {
        this.LIZ = textExtraStruct;
        this.LIZIZ = comment;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = i;
        this.LJFF = i2;
        this.LJI = z;
    }
}
