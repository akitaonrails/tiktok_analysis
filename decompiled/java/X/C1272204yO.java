package X;

import com.ss.android.ugc.aweme.model.VipSubscriptionEntitlement;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04yO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1272204yO implements InterfaceC1272104yN {
    public final List<VipSubscriptionEntitlement> LL;
    public final int LLILLJJLI;

    @Override // X.InterfaceC1272104yN
    public final boolean LJJIJIL() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1272204yO)) {
            return false;
        }
        C1272204yO c1272204yO = (C1272204yO) obj;
        return Intrinsics.LJFF(this.LL, c1272204yO.LL) && this.LLILLJJLI == c1272204yO.LLILLJJLI;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeriesVipSubscriptionBenefitsItem(benefits=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", topPaddingDp=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1272204yO) {
            C1272204yO c1272204yO = (C1272204yO) interfaceC1891350zJl;
            if (Intrinsics.LJFF(c1272204yO.LL, this.LL) && c1272204yO.LLILLJJLI == this.LLILLJJLI) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return interfaceC1891350zJl instanceof C1272204yO;
    }

    public C1272204yO(List<VipSubscriptionEntitlement> list, int i) {
        this.LL = list;
        this.LLILLJJLI = i;
    }
}
