package X;

import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkcInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03pL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C961303pL {
    public final int LIZ;
    public final SaleProp LIZIZ;
    public final String LIZJ;
    public final SkcInfo LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C961303pL)) {
            return false;
        }
        C961303pL c961303pL = (C961303pL) obj;
        return this.LIZ == c961303pL.LIZ && Intrinsics.LJFF(this.LIZIZ, c961303pL.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c961303pL.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c961303pL.LIZLLL);
    }

    public final int hashCode() {
        return (((((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaPdpSkcVO(skcSalePropIndex=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", skcSaleProp=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", selectedSkcId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", skcInfo=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C961303pL(int i, SaleProp saleProp, String str, SkcInfo skcInfo) {
        this.LIZ = i;
        this.LIZIZ = saleProp;
        this.LIZJ = str;
        this.LIZLLL = skcInfo;
    }
}
