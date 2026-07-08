package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderInfo;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.031B, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C031B extends AbstractC756202xM {
    public final Map<String, List<MainOrderInfo>> LLILZLL;
    public final String LLIZ;
    public final String LLIZLLLIL;
    public final String LLJ = "ineligible_items";
    public final String LLJI = "combined_sku_unavailable_item";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C031B)) {
            return false;
        }
        C031B c031b = (C031B) obj;
        return Intrinsics.LJFF(this.LLILZLL, c031b.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c031b.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c031b.LLIZLLLIL);
    }

    public final int hashCode() {
        int iHashCode = this.LLILZLL.hashCode() * 31;
        String str = this.LLIZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLIZLLLIL;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CombinedSkuUnavailableVO(unavailableMainOrders=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", titleText=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", contentText=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC756202xM, X.AbstractC723102s1
    public final String getGroupId() {
        return this.LLJ;
    }

    @Override // X.AbstractC756202xM, X.AbstractC723102s1
    public final String getItemId() {
        return this.LLJI;
    }

    @Override // X.AbstractC723102s1, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return interfaceC1891350zJl instanceof C031B;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C031B(Map<String, ? extends List<MainOrderInfo>> map, String str, String str2) {
        this.LLILZLL = map;
        this.LLIZ = str;
        this.LLIZLLLIL = str2;
    }
}
