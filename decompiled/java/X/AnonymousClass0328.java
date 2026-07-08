package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.core.strategy.BizIdentity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0328, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class AnonymousClass0328 {
    public final BizIdentity LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final InterfaceC7746030u LIZLLL;
    public final BillInfoData LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass0328)) {
            return false;
        }
        AnonymousClass0328 anonymousClass0328 = (AnonymousClass0328) obj;
        return Intrinsics.LJFF(this.LIZ, anonymousClass0328.LIZ) && Intrinsics.LJFF(this.LIZIZ, anonymousClass0328.LIZIZ) && this.LIZJ == anonymousClass0328.LIZJ && Intrinsics.LJFF(this.LIZLLL, anonymousClass0328.LIZLLL) && Intrinsics.LJFF(this.LJ, anonymousClass0328.LJ);
    }

    public final int hashCode() {
        return (((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OspListCreationContext(bizIdentity=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", checkoutType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", renderMode=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", pageContext=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", billInfoData=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AnonymousClass0328(BizIdentity bizIdentity, String str, int i, InterfaceC7746030u interfaceC7746030u, BillInfoData billInfoData) {
        this.LIZ = bizIdentity;
        this.LIZIZ = str;
        this.LIZJ = i;
        this.LIZLLL = interfaceC7746030u;
        this.LJ = billInfoData;
    }
}
