package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillStarlingText;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.IdentityInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShippingAddress;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.030y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7750030y implements C033V {
    public final ShippingAddress LIZ;
    public final ShippingAddress LIZIZ;
    public final IdentityInfo LIZJ;
    public final BillStarlingText LIZLLL;
    public final BillInfoData LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7750030y)) {
            return false;
        }
        C7750030y c7750030y = (C7750030y) obj;
        return Intrinsics.LJFF(this.LIZ, c7750030y.LIZ) && Intrinsics.LJFF(this.LIZIZ, c7750030y.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c7750030y.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c7750030y.LIZLLL) && Intrinsics.LJFF(this.LJ, c7750030y.LJ);
    }

    @Override // X.C033V
    public final String getName() {
        return "AddressBO";
    }

    public final int hashCode() {
        ShippingAddress shippingAddress = this.LIZ;
        int iHashCode = (shippingAddress == null ? 0 : shippingAddress.hashCode()) * 31;
        ShippingAddress shippingAddress2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (shippingAddress2 == null ? 0 : shippingAddress2.hashCode())) * 31;
        IdentityInfo identityInfo = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (identityInfo == null ? 0 : identityInfo.hashCode())) * 31;
        BillStarlingText billStarlingText = this.LIZLLL;
        int iHashCode4 = (iHashCode3 + (billStarlingText == null ? 0 : billStarlingText.hashCode())) * 31;
        BillInfoData billInfoData = this.LJ;
        return iHashCode4 + (billInfoData != null ? billInfoData.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AddressBO(shippingAddress=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", pudoShippingAddress=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", identityInfo=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", addDeliverAddress=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", billInfoData=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C7750030y(ShippingAddress shippingAddress, ShippingAddress shippingAddress2, IdentityInfo identityInfo, BillStarlingText billStarlingText, BillInfoData billInfoData) {
        this.LIZ = shippingAddress;
        this.LIZIZ = shippingAddress2;
        this.LIZJ = identityInfo;
        this.LIZLLL = billStarlingText;
        this.LJ = billInfoData;
    }
}
