package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPLogisticModule;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.PreOrderInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03Fd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C811903Fd implements InterfaceC1755100vm0, InterfaceC746802vq, C04DW {
    public final PreOrderInfo LL;
    public final PDPLogisticModule LLILLJJLI;
    public final String LLILLL;
    public String LLILZ = "undefined";

    @Override // X.InterfaceC1755100vm0
    public final String LIZ() {
        return "logistics";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C811903Fd)) {
            return false;
        }
        C811903Fd c811903Fd = (C811903Fd) obj;
        return Intrinsics.LJFF(this.LL, c811903Fd.LL) && Intrinsics.LJFF(this.LLILLJJLI, c811903Fd.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c811903Fd.LLILLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    @Override // X.InterfaceC746802vq
    public final String getItemId() {
        return null;
    }

    public final int hashCode() {
        PreOrderInfo preOrderInfo = this.LL;
        int iHashCode = (preOrderInfo == null ? 0 : preOrderInfo.hashCode()) * 31;
        PDPLogisticModule pDPLogisticModule = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (pDPLogisticModule == null ? 0 : pDPLogisticModule.hashCode())) * 31;
        String str = this.LLILLL;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Override // X.C04DW
    public final void setGodaGroupId(String str) {
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UsShippingVO(preOrderInfo=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", pdpLogisticModule=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", skuId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C04DW
    public final String getGodaNodeId() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(this, interfaceC1891350zJl);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return C703902ov.LIZ(this, interfaceC1891350zJl);
    }

    @Override // X.C04DW
    public final void setGodaNodeId(String str) {
        this.LLILZ = str;
    }

    public C811903Fd(PreOrderInfo preOrderInfo, PDPLogisticModule pDPLogisticModule, String str) {
        this.LL = preOrderInfo;
        this.LLILLJJLI = pDPLogisticModule;
        this.LLILLL = str;
    }
}
