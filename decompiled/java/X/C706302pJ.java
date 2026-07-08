package X;

import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuSaleProp;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02pJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C706302pJ {
    public final String LIZ;
    public final SkuSaleProp LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C706302pJ)) {
            return false;
        }
        C706302pJ c706302pJ = (C706302pJ) obj;
        return Intrinsics.LJFF(this.LIZ, c706302pJ.LIZ) && Intrinsics.LJFF(this.LIZIZ, c706302pJ.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TryOnDefaultSelection(skuId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", saleProp=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C706302pJ(String str, SkuSaleProp skuSaleProp) {
        this.LIZ = str;
        this.LIZIZ = skuSaleProp;
    }
}
