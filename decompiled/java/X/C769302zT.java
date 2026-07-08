package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopOrderNew;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02zT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C769302zT implements C033V {
    public final BillInfoData LIZ;
    public final List<ShopOrderNew> LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public C769302zT() {
        this(null, null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C769302zT)) {
            return false;
        }
        C769302zT c769302zT = (C769302zT) obj;
        return Intrinsics.LJFF(this.LIZ, c769302zT.LIZ) && Intrinsics.LJFF(this.LIZIZ, c769302zT.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c769302zT.LIZJ);
    }

    public final int hashCode() {
        BillInfoData billInfoData = this.LIZ;
        int iHashCode = (billInfoData == null ? 0 : billInfoData.hashCode()) * 31;
        List<ShopOrderNew> list = this.LIZIZ;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.LIZJ;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShopOrdersBO(billInfoData=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", shopOrders=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", orderTitlePrefix=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C033V
    public final String getName() {
        return this.LIZLLL;
    }

    public C769302zT(BillInfoData billInfoData, List list, int i) {
        billInfoData = (i & 1) != 0 ? null : billInfoData;
        list = (i & 2) != 0 ? null : list;
        this.LIZ = billInfoData;
        this.LIZIZ = list;
        this.LIZJ = null;
        this.LIZLLL = "ShopOrdersBO";
    }
}
