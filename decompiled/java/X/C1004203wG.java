package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SizeGuide;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkcInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03wG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1004203wG implements InterfaceC1004403wI {
    public final int LL;
    public final SaleProp LLILLJJLI;
    public final List<String> LLILLL;
    public final List<SkuItem> LLILZ;
    public final SkcInfo LLILZIL;
    public final Integer LLILZLL;
    public final SizeGuide LLIZ;
    public final Boolean LLIZLLLIL;
    public final InterfaceC813403Fs LLJ;
    public final Boolean LLJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1004203wG)) {
            return false;
        }
        C1004203wG c1004203wG = (C1004203wG) obj;
        return this.LL == c1004203wG.LL && Intrinsics.LJFF(this.LLILLJJLI, c1004203wG.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1004203wG.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1004203wG.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1004203wG.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1004203wG.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1004203wG.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1004203wG.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1004203wG.LLJ) && Intrinsics.LJFF(this.LLJI, c1004203wG.LLJI);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = ((this.LL * 31) + this.LLILLJJLI.hashCode()) * 31;
        List<String> list = this.LLILLL;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<SkuItem> list2 = this.LLILZ;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        SkcInfo skcInfo = this.LLILZIL;
        int iHashCode4 = (iHashCode3 + (skcInfo == null ? 0 : skcInfo.hashCode())) * 31;
        Integer num = this.LLILZLL;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        SizeGuide sizeGuide = this.LLIZ;
        int iHashCode6 = (iHashCode5 + (sizeGuide == null ? 0 : sizeGuide.hashCode())) * 31;
        Boolean bool = this.LLIZLLLIL;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        InterfaceC813403Fs interfaceC813403Fs = this.LLJ;
        int iHashCode8 = (iHashCode7 + (interfaceC813403Fs == null ? 0 : interfaceC813403Fs.hashCode())) * 31;
        Boolean bool2 = this.LLJI;
        return iHashCode8 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OspSkuItemVO(key=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", saleProp=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", checkIds=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", skuItems=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", skcInfo=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", bizType=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", sizeGuide=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", status=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", listener=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", singleRow=");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(this, interfaceC1891350zJl);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return C1004303wH.LIZ(this, interfaceC1891350zJl);
    }

    public C1004203wG(int i, SaleProp saleProp, List<String> list, List<SkuItem> list2, SkcInfo skcInfo, Integer num, SizeGuide sizeGuide, Boolean bool, InterfaceC813403Fs interfaceC813403Fs, Boolean bool2) {
        this.LL = i;
        this.LLILLJJLI = saleProp;
        this.LLILLL = list;
        this.LLILZ = list2;
        this.LLILZIL = skcInfo;
        this.LLILZLL = num;
        this.LLIZ = sizeGuide;
        this.LLIZLLLIL = bool;
        this.LLJ = interfaceC813403Fs;
        this.LLJI = bool2;
    }
}
