package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerDetailInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopPerformance;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreLabel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02os, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C703602os implements InterfaceC746802vq, C04DW {
    public final String LL;
    public final String LLILLJJLI;
    public final List<StoreLabel> LLILLL;
    public final List<SellerDetailInfo> LLILZ;
    public final ShopPerformance LLILZIL;
    public String LLILZLL = "undefined";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C703602os)) {
            return false;
        }
        C703602os c703602os = (C703602os) obj;
        return Intrinsics.LJFF(this.LL, c703602os.LL) && Intrinsics.LJFF(this.LLILLJJLI, c703602os.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c703602os.LLILLL) && Intrinsics.LJFF(this.LLILZ, c703602os.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c703602os.LLILZIL);
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
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<StoreLabel> list = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<SellerDetailInfo> list2 = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        ShopPerformance shopPerformance = this.LLILZIL;
        return iHashCode4 + (shopPerformance != null ? shopPerformance.hashCode() : 0);
    }

    @Override // X.C04DW
    public final void setGodaGroupId(String str) {
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("USSESShopPerfVO(sellerId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", rating=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", brandLabels=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", shopDetailInfos=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", shopPerformance=");
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

    public C703602os(String str, String str2, List<StoreLabel> list, List<SellerDetailInfo> list2, ShopPerformance shopPerformance) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = list;
        this.LLILZ = list2;
        this.LLILZIL = shopPerformance;
    }
}
