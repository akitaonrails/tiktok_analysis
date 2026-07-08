package X;

import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02v6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C742202v6 {
    public final SaleProp LIZ;
    public final Integer LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C742202v6)) {
            return false;
        }
        C742202v6 c742202v6 = (C742202v6) obj;
        return Intrinsics.LJFF(this.LIZ, c742202v6.LIZ) && Intrinsics.LJFF(this.LIZIZ, c742202v6.LIZIZ);
    }

    public final int hashCode() {
        SaleProp saleProp = this.LIZ;
        int iHashCode = (saleProp == null ? 0 : saleProp.hashCode()) * 31;
        Integer num = this.LIZIZ;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TryOnSalePropResult(tryOnSaleProp=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", tryOnSalePropIndexInSaleProps=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C742202v6(SaleProp saleProp, Integer num) {
        this.LIZ = saleProp;
        this.LIZIZ = num;
    }
}
