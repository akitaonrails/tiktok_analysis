package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DBp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C335070DBp {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final AbstractC334720DAg LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C335070DBp)) {
            return false;
        }
        C335070DBp c335070DBp = (C335070DBp) obj;
        return Intrinsics.LJFF(this.LIZ, c335070DBp.LIZ) && Intrinsics.LJFF(this.LIZIZ, c335070DBp.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c335070DBp.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c335070DBp.LIZLLL);
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CheckoutBottomBarUiState(merchantName=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", totalLabel=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", totalAmount=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", buttonState=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C335070DBp(String str, String str2, String str3, AbstractC334720DAg abstractC334720DAg) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = abstractC334720DAg;
    }
}
