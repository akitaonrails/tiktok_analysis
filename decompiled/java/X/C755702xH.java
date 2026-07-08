package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SkuSelection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02xH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C755702xH extends AbstractC756202xM {
    public final SkuSelection LLILZLL;
    public final List<String> LLIZ;
    public final boolean LLIZLLLIL;
    public final Boolean LLJ;
    public final String LLJI;
    public final String LLJIJIL;

    /* JADX WARN: Multi-variable type inference failed */
    public C755702xH() {
        this(null, 0 == true ? 1 : 0, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C755702xH)) {
            return false;
        }
        C755702xH c755702xH = (C755702xH) obj;
        return Intrinsics.LJFF(this.LLILZLL, c755702xH.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c755702xH.LLIZ) && this.LLIZLLLIL == c755702xH.LLIZLLLIL && Intrinsics.LJFF(this.LLJ, c755702xH.LLJ);
    }

    public final int hashCode() {
        SkuSelection skuSelection = this.LLILZLL;
        int iHashCode = (skuSelection == null ? 0 : skuSelection.hashCode()) * 31;
        List<String> list = this.LLIZ;
        int iHashCode2 = (((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + C786410Ut5.Z2(this.LLIZLLLIL)) * 31;
        Boolean bool = this.LLJ;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("USSkuModuleVO(skuSelection=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", checkedSkuArray=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", isShowSkeleton=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", disableClick=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC756202xM, X.AbstractC723102s1
    public final String getGroupId() {
        return this.LLJI;
    }

    @Override // X.AbstractC756202xM, X.AbstractC723102s1
    public final String getItemId() {
        return this.LLJIJIL;
    }

    @Override // X.AbstractC723102s1, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return interfaceC1891350zJl instanceof C755702xH;
    }

    public /* synthetic */ C755702xH(SkuSelection skuSelection, List list, int i) {
        this((i & 1) != 0 ? null : skuSelection, (i & 2) != 0 ? null : list, false, null);
    }

    public C755702xH(SkuSelection skuSelection, List<String> list, boolean z, Boolean bool) {
        this.LLILZLL = skuSelection;
        this.LLIZ = list;
        this.LLIZLLLIL = z;
        this.LLJ = bool;
        this.LLJI = "sku_selector";
        this.LLJIJIL = "sku_selection_item";
    }

    public static C755702xH LIZIZ(C755702xH c755702xH, SkuSelection skuSelection, List list, Boolean bool, int i) {
        boolean z;
        if ((i & 1) != 0) {
            skuSelection = c755702xH.LLILZLL;
        }
        if ((i & 2) != 0) {
            list = c755702xH.LLIZ;
        }
        if ((i & 4) != 0) {
            z = c755702xH.LLIZLLLIL;
        } else {
            z = false;
        }
        if ((i & 8) != 0) {
            bool = c755702xH.LLJ;
        }
        c755702xH.getClass();
        return new C755702xH(skuSelection, list, z, bool);
    }
}
