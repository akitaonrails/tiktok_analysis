package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.assem.module.address.identity.CpfEnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.IdentityInfoOption;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03cj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C883103cj implements InterfaceC111300bX {
    public final CpfEnterParams LL;
    public final InterfaceC20236714Gf<IdentityInfoOption> LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C883103cj)) {
            return false;
        }
        C883103cj c883103cj = (C883103cj) obj;
        return Intrinsics.LJFF(this.LL, c883103cj.LL) && Intrinsics.LJFF(this.LLILLJJLI, c883103cj.LLILLJJLI);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        InterfaceC20236714Gf<IdentityInfoOption> interfaceC20236714Gf = this.LLILLJJLI;
        return iHashCode + (interfaceC20236714Gf == null ? 0 : interfaceC20236714Gf.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CpfHierarchyData(cpfEnterParams=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", continuation=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C883103cj(CpfEnterParams cpfEnterParams, C2252611DEt c2252611DEt) {
        this.LL = cpfEnterParams;
        this.LLILLJJLI = c2252611DEt;
    }
}
