package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillCpfInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02v5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C742102v5 extends AbstractC723102s1 {
    public final BillCpfInfo LL;
    public final String LLILLJJLI = "cpf";
    public final String LLILLL = "cpf_item";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C742102v5) && Intrinsics.LJFF(this.LL, ((C742102v5) obj).LL);
    }

    public final int hashCode() {
        BillCpfInfo billCpfInfo = this.LL;
        if (billCpfInfo == null) {
            return 0;
        }
        return billCpfInfo.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CpfVO(billCpfInfo=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC723102s1
    public final String getGroupId() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC723102s1
    public final String getItemId() {
        return this.LLILLL;
    }

    public C742102v5(BillCpfInfo billCpfInfo) {
        this.LL = billCpfInfo;
    }

    @Override // X.AbstractC723102s1, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return interfaceC1891350zJl instanceof C742102v5;
    }
}
