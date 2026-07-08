package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wR9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1780610wR9 {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final List<C1780630wRB> LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1780610wR9)) {
            return false;
        }
        C1780610wR9 c1780610wR9 = (C1780610wR9) obj;
        return Intrinsics.LJFF(this.LIZ, c1780610wR9.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1780610wR9.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1780610wR9.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1780610wR9.LIZLLL);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZJ;
        return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Offer(offerToken=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", purchaseOptionId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", offerId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", prices=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1780610wR9(String str, String str2, String str3, List<C1780630wRB> list) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = list;
    }
}
