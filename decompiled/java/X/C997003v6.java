package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03v6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C997003v6 {
    public final InterfaceC497601wk LIZ;
    public final String LIZIZ;
    public final ProductPackStruct LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C997003v6)) {
            return false;
        }
        C997003v6 c997003v6 = (C997003v6) obj;
        return Intrinsics.LJFF(this.LIZ, c997003v6.LIZ) && Intrinsics.LJFF(this.LIZIZ, c997003v6.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c997003v6.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        ProductPackStruct productPackStruct = this.LIZJ;
        return iHashCode + (productPackStruct == null ? 0 : productPackStruct.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TryOnPrefetchSource(scope=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", productId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", productInfoPack=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C997003v6(InterfaceC497601wk interfaceC497601wk, String str, ProductPackStruct productPackStruct) {
        this.LIZ = interfaceC497601wk;
        this.LIZIZ = str;
        this.LIZJ = productPackStruct;
    }
}
