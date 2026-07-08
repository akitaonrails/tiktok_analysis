package X;

import com.ss.android.ugc.aweme.components.purchaseoption.PurchaseOptionWithPrice;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gGr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1159190gGr extends AbstractC1159230gGv {
    public final AbstractC1155890gBX LIZIZ;
    public final String LIZJ;
    public final PurchaseOptionWithPrice LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1159190gGr)) {
            return false;
        }
        C1159190gGr c1159190gGr = (C1159190gGr) obj;
        return Intrinsics.LJFF(this.LIZIZ, c1159190gGr.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1159190gGr.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1159190gGr.LIZLLL);
    }

    public final int hashCode() {
        return (((this.LIZIZ.hashCode() * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Error(error=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", productId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", purchaseOption=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1159230gGv
    public final String LIZ() {
        return this.LIZJ;
    }

    public C1159190gGr(AbstractC1155890gBX abstractC1155890gBX, String str, PurchaseOptionWithPrice purchaseOptionWithPrice) {
        super(str);
        this.LIZIZ = abstractC1155890gBX;
        this.LIZJ = str;
        this.LIZLLL = purchaseOptionWithPrice;
    }
}
