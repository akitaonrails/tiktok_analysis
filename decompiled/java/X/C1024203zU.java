package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PurchaseMethodInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.view.price.PriceType;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03zU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1024203zU implements InterfaceC746802vq, C04DW {
    public final PurchaseMethodInfo LL;
    public final int LLILLJJLI;
    public final Map<Integer, PriceType> LLILLL;
    public final String LLILZ;
    public String LLILZIL = "undefined";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1024203zU)) {
            return false;
        }
        C1024203zU c1024203zU = (C1024203zU) obj;
        return Intrinsics.LJFF(this.LL, c1024203zU.LL) && this.LLILLJJLI == c1024203zU.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1024203zU.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1024203zU.LLILZ);
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
        int iHashCode = ((this.LL.hashCode() * 31) + this.LLILLJJLI) * 31;
        Map<Integer, PriceType> map = this.LLILLL;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.LLILZ;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Override // X.C04DW
    public final void setGodaGroupId(String str) {
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PdpPurchaseMethodVO(purchaseMethodInfo=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", selectedMethod=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", priceMap=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", selectedPeriodText=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C04DW
    public final String getGodaNodeId() {
        return this.LLILZIL;
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
        this.LLILZIL = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1024203zU(PurchaseMethodInfo purchaseMethodInfo, int i, Map<Integer, ? extends PriceType> map, String str) {
        this.LL = purchaseMethodInfo;
        this.LLILLJJLI = i;
        this.LLILLL = map;
        this.LLILZ = str;
    }
}
