package X;

import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewTransData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04G7, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04G7 {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final int LJ;
    public final ReviewTransData LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C04G7)) {
            return false;
        }
        C04G7 c04g7 = (C04G7) obj;
        return this.LIZ == c04g7.LIZ && this.LIZIZ == c04g7.LIZIZ && this.LIZJ == c04g7.LIZJ && this.LIZLLL == c04g7.LIZLLL && this.LJ == c04g7.LJ && Intrinsics.LJFF(this.LJFF, c04g7.LJFF);
    }

    public final int hashCode() {
        int iZ2 = ((((((((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + this.LJ) * 31;
        ReviewTransData reviewTransData = this.LJFF;
        return iZ2 + (reviewTransData == null ? 0 : reviewTransData.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReviewCellState(mainReviewExpand=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", appendReviewExpand=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", sellerFistReplyExpand=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", sellerAppendReplyExpand=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", transState=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", transData=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C04G7() {
        int value = C04G9.VIEW_TRANSLATION.getValue();
        this.LIZ = false;
        this.LIZIZ = false;
        this.LIZJ = false;
        this.LIZLLL = false;
        this.LJ = value;
        this.LJFF = null;
    }
}
