package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleInfoResponseData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04A0, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04A0 implements InterfaceC746802vq, C04DW {
    public final BundleInfoResponseData LL;
    public String LLILLJJLI = "undefined";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C04A0) && Intrinsics.LJFF(this.LL, ((C04A0) obj).LL);
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
        BundleInfoResponseData bundleInfoResponseData = this.LL;
        if (bundleInfoResponseData == null) {
            return 0;
        }
        return bundleInfoResponseData.hashCode();
    }

    @Override // X.C04DW
    public final void setGodaGroupId(String str) {
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BundleDealVO(bundleDealData=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C04DW
    public final String getGodaNodeId() {
        return this.LLILLJJLI;
    }

    public C04A0(BundleInfoResponseData bundleInfoResponseData) {
        this.LL = bundleInfoResponseData;
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
        this.LLILLJJLI = str;
    }
}
