package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03b7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C873103b7 implements InterfaceC1891350zJl {
    public final InstallmentInfo LL;
    public final C873003b6 LLILLJJLI;
    public final String LLILLL = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C873103b7)) {
            return false;
        }
        C873103b7 c873103b7 = (C873103b7) obj;
        return Intrinsics.LJFF(this.LL, c873103b7.LL) && Intrinsics.LJFF(this.LLILLJJLI, c873103b7.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c873103b7.LLILLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31;
        String str = this.LLILLL;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InstallmentListItem(installmentInfo=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", bankInfo=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", selectTenure=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C873103b7(InstallmentInfo installmentInfo, C873003b6 c873003b6) {
        this.LL = installmentInfo;
        this.LLILLJJLI = c873003b6;
    }
}
