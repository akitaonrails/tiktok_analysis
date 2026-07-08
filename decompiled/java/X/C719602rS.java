package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.OSPPageModuleConfig;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ProductSafetyModule;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02rS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C719602rS extends AbstractC756202xM {
    public final ProductSafetyModule LLILZLL;
    public final String LLIZ;

    public C719602rS() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C719602rS) && Intrinsics.LJFF(this.LLILZLL, ((C719602rS) obj).LLILZLL);
    }

    public final int hashCode() {
        ProductSafetyModule productSafetyModule = this.LLILZLL;
        if (productSafetyModule == null) {
            return 0;
        }
        return productSafetyModule.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CombinedSkuSafetyVO(safetyModule=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC756202xM, X.AbstractC723102s1
    public final String getGroupId() {
        String str;
        OSPPageModuleConfig oSPPageModuleConfig = this.LLILLL;
        return (oSPPageModuleConfig == null || (str = oSPPageModuleConfig.name) == null) ? "product_safety_module" : str;
    }

    @Override // X.AbstractC756202xM, X.AbstractC723102s1
    public final String getItemId() {
        return this.LLIZ;
    }

    public C719602rS(ProductSafetyModule productSafetyModule) {
        this.LLILZLL = productSafetyModule;
        this.LLIZ = "combined_sku_safety_item";
    }

    @Override // X.AbstractC723102s1, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return interfaceC1891350zJl instanceof C719602rS;
    }
}
