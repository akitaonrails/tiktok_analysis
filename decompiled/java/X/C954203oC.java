package X;

import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkcInfo;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03oC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C954203oC {
    public final List<SaleProp> LIZ;
    public final String[] LIZIZ;
    public final SkcInfo LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C954203oC)) {
            return false;
        }
        C954203oC c954203oC = (C954203oC) obj;
        return Intrinsics.LJFF(this.LIZ, c954203oC.LIZ) && Intrinsics.LJFF(this.LIZIZ, c954203oC.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c954203oC.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String[] strArr = this.LIZIZ;
        int iHashCode2 = (iHashCode + (strArr == null ? 0 : Arrays.hashCode(strArr))) * 31;
        SkcInfo skcInfo = this.LIZJ;
        return iHashCode2 + (skcInfo != null ? skcInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaPdpSkuVO(props=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", selectIdList=");
        sbLIZ.append(Arrays.toString(this.LIZIZ));
        sbLIZ.append(", skcInfo=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C954203oC(List<SaleProp> list, String[] strArr, SkcInfo skcInfo) {
        this.LIZ = list;
        this.LIZIZ = strArr;
        this.LIZJ = skcInfo;
    }
}
