package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.dto.InsuranceInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SizeGuide;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.TryOnData;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkcInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuCommonConfig;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03wB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1003703wB implements InterfaceC746802vq, C04DW {
    public final List<SaleProp> LL;
    public final List<SkuItem> LLILLJJLI;
    public final SkuCommonConfig LLILLL;
    public final SizeGuide LLILZ;
    public final List<String> LLILZIL;
    public final Integer LLILZLL;
    public final SkcInfo LLIZ;
    public final Boolean LLIZLLLIL;
    public final Boolean LLJ;
    public final InsuranceInfo LLJI;
    public final TryOnData LLJIJIL;
    public String LLJILJIL = "undefined";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1003703wB)) {
            return false;
        }
        C1003703wB c1003703wB = (C1003703wB) obj;
        return Intrinsics.LJFF(this.LL, c1003703wB.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1003703wB.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1003703wB.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1003703wB.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1003703wB.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1003703wB.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1003703wB.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1003703wB.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1003703wB.LLJ) && Intrinsics.LJFF(this.LLJI, c1003703wB.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c1003703wB.LLJIJIL);
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
        List<SaleProp> list = this.LL;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<SkuItem> list2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        SkuCommonConfig skuCommonConfig = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (skuCommonConfig == null ? 0 : skuCommonConfig.hashCode())) * 31;
        SizeGuide sizeGuide = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (sizeGuide == null ? 0 : sizeGuide.hashCode())) * 31;
        List<String> list3 = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Integer num = this.LLILZLL;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        SkcInfo skcInfo = this.LLIZ;
        int iHashCode7 = (iHashCode6 + (skcInfo == null ? 0 : skcInfo.hashCode())) * 31;
        Boolean bool = this.LLIZLLLIL;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.LLJ;
        int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        InsuranceInfo insuranceInfo = this.LLJI;
        int iHashCode10 = (iHashCode9 + (insuranceInfo == null ? 0 : insuranceInfo.hashCode())) * 31;
        TryOnData tryOnData = this.LLJIJIL;
        return iHashCode10 + (tryOnData != null ? tryOnData.hashCode() : 0);
    }

    @Override // X.C04DW
    public final void setGodaGroupId(String str) {
    }

    public final String toString() {
        return "UsSkuVO(saleProps=" + this.LL + ", skuList=" + this.LLILLJJLI + ", skuCommonConfig=" + this.LLILLL + ", sizeGuide=" + this.LLILZ + ", selectIdList=" + this.LLILZIL + ", quantity=" + this.LLILZLL + ", skcInfo=" + this.LLIZ + ", needDivider=" + this.LLIZLLLIL + ", isUnselectedPropsHighlighted=" + this.LLJ + ", insuranceInfo=" + this.LLJI + ", tryOnData=" + this.LLJIJIL + ')';
    }

    @Override // X.C04DW
    public final String getGodaNodeId() {
        return this.LLJILJIL;
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
        this.LLJILJIL = str;
    }

    public C1003703wB(List<SaleProp> list, List<SkuItem> list2, SkuCommonConfig skuCommonConfig, SizeGuide sizeGuide, List<String> list3, Integer num, SkcInfo skcInfo, Boolean bool, Boolean bool2, InsuranceInfo insuranceInfo, TryOnData tryOnData) {
        this.LL = list;
        this.LLILLJJLI = list2;
        this.LLILLL = skuCommonConfig;
        this.LLILZ = sizeGuide;
        this.LLILZIL = list3;
        this.LLILZLL = num;
        this.LLIZ = skcInfo;
        this.LLIZLLLIL = bool;
        this.LLJ = bool2;
        this.LLJI = insuranceInfo;
        this.LLJIJIL = tryOnData;
    }
}
