package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductUnavailableInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04AZ, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04AZ {
    public final Integer LIZ;
    public final ProductUnavailableInfo LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C04AZ)) {
            return false;
        }
        C04AZ c04az = (C04AZ) obj;
        return Intrinsics.LJFF(this.LIZ, c04az.LIZ) && Intrinsics.LJFF(this.LIZIZ, c04az.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c04az.LIZJ);
    }

    public final int hashCode() {
        Integer num = this.LIZ;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        ProductUnavailableInfo productUnavailableInfo = this.LIZIZ;
        int iHashCode2 = (iHashCode + (productUnavailableInfo == null ? 0 : productUnavailableInfo.hashCode())) * 31;
        String str = this.LIZJ;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SkuOutOfStockInfo(stockStatus=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", unavailableInfo=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", noStockMsg=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C04AZ(Integer num, ProductUnavailableInfo productUnavailableInfo, String str) {
        this.LIZ = num;
        this.LIZIZ = productUnavailableInfo;
        this.LIZJ = str;
    }
}
