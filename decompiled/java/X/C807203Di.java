package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPLogisticModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpShipping;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.PreOrderInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03Di, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C807203Di implements InterfaceC1755100vm0 {
    public final C765002ym LL;
    public final PdpShipping LLILLJJLI;
    public final PreOrderInfo LLILLL;
    public final PDPLogisticModule LLILZ;
    public final String LLILZIL;
    public final boolean LLILZLL = false;

    @Override // X.InterfaceC1755100vm0
    public final String LIZ() {
        return "logistics";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C807203Di)) {
            return false;
        }
        C807203Di c807203Di = (C807203Di) obj;
        return Intrinsics.LJFF(this.LL, c807203Di.LL) && Intrinsics.LJFF(this.LLILLJJLI, c807203Di.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c807203Di.LLILLL) && Intrinsics.LJFF(this.LLILZ, c807203Di.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c807203Di.LLILZIL) && this.LLILZLL == c807203Di.LLILZLL;
    }

    public final int hashCode() {
        C765002ym c765002ym = this.LL;
        int iHashCode = (c765002ym == null ? 0 : c765002ym.hashCode()) * 31;
        PdpShipping pdpShipping = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (pdpShipping == null ? 0 : pdpShipping.hashCode())) * 31;
        PreOrderInfo preOrderInfo = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (preOrderInfo == null ? 0 : preOrderInfo.hashCode())) * 31;
        PDPLogisticModule pDPLogisticModule = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (pDPLogisticModule == null ? 0 : pDPLogisticModule.hashCode())) * 31;
        String str = this.LLILZIL;
        return ((iHashCode4 + (str != null ? str.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLILZLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaShippingVO(deliveryInfo=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", pdpShipping=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", preOrderInfo=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", pdpLogisticModule=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", skuId=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", needDivider=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C807203Di(C765002ym c765002ym, PdpShipping pdpShipping, PreOrderInfo preOrderInfo, PDPLogisticModule pDPLogisticModule, String str) {
        this.LL = c765002ym;
        this.LLILLJJLI = pdpShipping;
        this.LLILLL = preOrderInfo;
        this.LLILZ = pDPLogisticModule;
        this.LLILZIL = str;
    }
}
