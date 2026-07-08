package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03Oc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C835203Oc {
    public final String LIZ;
    public final int LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C835203Oc)) {
            return false;
        }
        C835203Oc c835203Oc = (C835203Oc) obj;
        return Intrinsics.LJFF(this.LIZ, c835203Oc.LIZ) && this.LIZIZ == c835203Oc.LIZIZ && Intrinsics.LJFF(this.LIZJ, c835203Oc.LIZJ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.LIZIZ) * 31;
        String str2 = this.LIZJ;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlaceOrderBubbleTrackInfo(bubbleType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isPayBubble=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", promotionType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C835203Oc(String str, int i, String str2) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = str2;
    }
}
