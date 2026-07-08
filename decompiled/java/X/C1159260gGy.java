package X;

import com.ss.android.ugc.aweme.model.PurchaseOption;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gGy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1159260gGy extends AbstractC1159090gGh {
    public final String LIZ;
    public final List<Long> LIZIZ;
    public final List<PurchaseOption> LIZJ;
    public final Integer LIZLLL;
    public final Integer LJ;
    public final long LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1159260gGy)) {
            return false;
        }
        C1159260gGy c1159260gGy = (C1159260gGy) obj;
        return Intrinsics.LJFF(this.LIZ, c1159260gGy.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1159260gGy.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1159260gGy.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1159260gGy.LIZLLL) && Intrinsics.LJFF(this.LJ, c1159260gGy.LJ) && this.LJFF == c1159260gGy.LJFF;
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        List<PurchaseOption> list = this.LIZJ;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.LIZLLL;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LJ;
        return ((iHashCode3 + (num2 != null ? num2.hashCode() : 0)) * 31) + C786410Ut5.Y2(this.LJFF);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PurchaseConfirmed(paidContentOrderId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", purchasedVideoIds=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", purchaseOptions=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", firstUnpurchasedSeqId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", preselectIndex=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", collectionId=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1159090gGh
    public final long LIZ() {
        return this.LJFF;
    }

    public C1159260gGy(String str, List<Long> list, List<PurchaseOption> list2, Integer num, Integer num2, long j) {
        super(j);
        this.LIZ = str;
        this.LIZIZ = list;
        this.LIZJ = list2;
        this.LIZLLL = num;
        this.LJ = num2;
        this.LJFF = j;
    }
}
