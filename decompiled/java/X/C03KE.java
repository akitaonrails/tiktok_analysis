package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPLogisticUIConfig;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPReturnPolicyModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRight;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03KE, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03KE implements InterfaceC1755100vm0, InterfaceC746802vq, C04DW {
    public final UserRight LL;
    public final PDPReturnPolicyModule LLILLJJLI;
    public final Boolean LLILLL;
    public final String LLILZ;
    public final PDPLogisticUIConfig LLILZIL;
    public String LLILZLL = "undefined";

    @Override // X.InterfaceC1755100vm0
    public final String LIZ() {
        return "return_policy";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C03KE)) {
            return false;
        }
        C03KE c03ke = (C03KE) obj;
        return Intrinsics.LJFF(this.LL, c03ke.LL) && Intrinsics.LJFF(this.LLILLJJLI, c03ke.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c03ke.LLILLL) && Intrinsics.LJFF(this.LLILZ, c03ke.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c03ke.LLILZIL);
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
        int iHashCode = this.LL.hashCode() * 31;
        PDPReturnPolicyModule pDPReturnPolicyModule = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (pDPReturnPolicyModule == null ? 0 : pDPReturnPolicyModule.hashCode())) * 31;
        Boolean bool = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        PDPLogisticUIConfig pDPLogisticUIConfig = this.LLILZIL;
        return iHashCode4 + (pDPLogisticUIConfig != null ? pDPLogisticUIConfig.hashCode() : 0);
    }

    @Override // X.C04DW
    public final void setGodaGroupId(String str) {
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GlobalReturnPolicyVO(returnPolicy=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", pdpReturnPolicyModule=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", needDivider=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", skuId=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", uiConfig=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C04DW
    public final String getGodaNodeId() {
        return this.LLILZLL;
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
        this.LLILZLL = str;
    }

    public C03KE(UserRight userRight, PDPReturnPolicyModule pDPReturnPolicyModule, Boolean bool, String str, PDPLogisticUIConfig pDPLogisticUIConfig) {
        this.LL = userRight;
        this.LLILLJJLI = pDPReturnPolicyModule;
        this.LLILLL = bool;
        this.LLILZ = str;
        this.LLILZIL = pDPLogisticUIConfig;
    }
}
