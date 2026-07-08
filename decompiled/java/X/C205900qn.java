package X;

import com.bytedance.android.livesdk.model.Gift;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00qn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C205900qn {
    public final boolean LIZ;
    public final int LIZIZ;
    public final List<Gift> LIZJ;
    public final Gift LIZLLL;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C205900qn)) {
            return false;
        }
        C205900qn c205900qn = (C205900qn) obj;
        return this.LIZ == c205900qn.LIZ && this.LIZIZ == c205900qn.LIZIZ && Intrinsics.LJFF(this.LIZJ, c205900qn.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c205900qn.LIZLLL) && Intrinsics.LJFF(this.LJ, c205900qn.LJ);
    }

    public final int hashCode() {
        int iZ2 = ((((C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode()) * 31;
        Gift gift = this.LIZLLL;
        int iHashCode = (iZ2 + (gift == null ? 0 : gift.hashCode())) * 31;
        String str = this.LJ;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SwitchTabResult(success=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", tabType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", gifts=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", selectedGift=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", errorMessage=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C205900qn(boolean z, int i, List<? extends Gift> list, Gift gift, String str) {
        this.LIZ = z;
        this.LIZIZ = i;
        this.LIZJ = list;
        this.LIZLLL = gift;
        this.LJ = str;
    }
}
