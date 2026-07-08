package X;

import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuVoucher;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03xM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1011003xM {
    public final String LIZ;
    public final Integer LIZIZ;
    public final String LIZJ;
    public final SkuVoucher LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;

    public C1011003xM() {
        this(null, null, null, null, 127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1011003xM)) {
            return false;
        }
        C1011003xM c1011003xM = (C1011003xM) obj;
        return Intrinsics.LJFF(this.LIZ, c1011003xM.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1011003xM.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1011003xM.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1011003xM.LIZLLL) && Intrinsics.LJFF(this.LJ, c1011003xM.LJ) && Intrinsics.LJFF(this.LJFF, c1011003xM.LJFF) && Intrinsics.LJFF(this.LJI, c1011003xM.LJI);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.LIZIZ;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        SkuVoucher skuVoucher = this.LIZLLL;
        int iHashCode4 = (iHashCode3 + (skuVoucher == null ? 0 : skuVoucher.hashCode())) * 31;
        String str3 = this.LJ;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJFF;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LJI;
        return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SkuSelectedInfo(skuId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", productQuantity=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", warehouseId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", voucherInfo=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", cartItemId=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", billInfoRepoId=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", tenure=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1011003xM(String str, Integer num, String str2, SkuVoucher skuVoucher, int i) {
        str = (i & 1) != 0 ? null : str;
        num = (i & 2) != 0 ? null : num;
        str2 = (i & 4) != 0 ? null : str2;
        skuVoucher = (i & 8) != 0 ? null : skuVoucher;
        this.LIZ = str;
        this.LIZIZ = num;
        this.LIZJ = str2;
        this.LIZLLL = skuVoucher;
        this.LJ = null;
        this.LJFF = null;
        this.LJI = null;
    }
}
