package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BlockPageInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vld, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1754870vld implements InterfaceC0148002o {
    public final List<InterfaceC1891350zJl> LL;
    public final int LLILLJJLI;
    public final BlockPageInfo LLILLL;
    public final int LLILZ;
    public final float LLILZIL;
    public final boolean LLILZLL;
    public final C291001Au<Integer> LLIZ;
    public final C291001Au<String> LLIZLLLIL;
    public final SellerInfo LLJ;

    public C1754870vld() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1754870vld)) {
            return false;
        }
        C1754870vld c1754870vld = (C1754870vld) obj;
        return Intrinsics.LJFF(this.LL, c1754870vld.LL) && this.LLILLJJLI == c1754870vld.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1754870vld.LLILLL) && this.LLILZ == c1754870vld.LLILZ && Float.compare(this.LLILZIL, c1754870vld.LLILZIL) == 0 && this.LLILZLL == c1754870vld.LLILZLL && Intrinsics.LJFF(this.LLIZ, c1754870vld.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1754870vld.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1754870vld.LLJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PdpBodyState(mainListUIState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", loadingStatus=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", blockInfo=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", scrollOffset=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", bottomSheetSlideOffset=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", isFullScreen=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", targetFocusModuleByBrickName=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", targetFocusModuleByGodaNodeId=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", shopInfo=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + this.LLILLJJLI) * 31;
        BlockPageInfo blockPageInfo = this.LLILLL;
        int iHashCode2 = (((((((iHashCode + (blockPageInfo == null ? 0 : blockPageInfo.hashCode())) * 31) + this.LLILZ) * 31) + Float.floatToIntBits(this.LLILZIL)) * 31) + C786410Ut5.Z2(this.LLILZLL)) * 31;
        C291001Au<Integer> c291001Au = this.LLIZ;
        int iHashCode3 = (iHashCode2 + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31;
        C291001Au<String> c291001Au2 = this.LLIZLLLIL;
        int iHashCode4 = (iHashCode3 + (c291001Au2 == null ? 0 : c291001Au2.hashCode())) * 31;
        SellerInfo sellerInfo = this.LLJ;
        return iHashCode4 + (sellerInfo != null ? sellerInfo.hashCode() : 0);
    }

    public C1754870vld(int i) {
        this(C13BV.INSTANCE, 0, null, 0, 0.0f, false, null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1754870vld(List<? extends InterfaceC1891350zJl> list, int i, BlockPageInfo blockPageInfo, int i2, float f, boolean z, C291001Au<Integer> c291001Au, C291001Au<String> c291001Au2, SellerInfo sellerInfo) {
        this.LL = list;
        this.LLILLJJLI = i;
        this.LLILLL = blockPageInfo;
        this.LLILZ = i2;
        this.LLILZIL = f;
        this.LLILZLL = z;
        this.LLIZ = c291001Au;
        this.LLIZLLLIL = c291001Au2;
        this.LLJ = sellerInfo;
    }

    public static C1754870vld LIZ(C1754870vld c1754870vld, List list, int i, BlockPageInfo blockPageInfo, int i2, float f, boolean z, C291001Au c291001Au, C291001Au c291001Au2, SellerInfo sellerInfo, int i3) {
        SellerInfo sellerInfo2 = sellerInfo;
        C291001Au c291001Au3 = c291001Au2;
        C291001Au c291001Au4 = c291001Au;
        boolean z2 = z;
        float f2 = f;
        int i4 = i2;
        BlockPageInfo blockPageInfo2 = blockPageInfo;
        int i5 = i;
        List list2 = list;
        if ((i3 & 1) != 0) {
            list2 = c1754870vld.LL;
        }
        if ((i3 & 2) != 0) {
            i5 = c1754870vld.LLILLJJLI;
        }
        if ((i3 & 4) != 0) {
            blockPageInfo2 = c1754870vld.LLILLL;
        }
        if ((i3 & 8) != 0) {
            i4 = c1754870vld.LLILZ;
        }
        if ((i3 & 16) != 0) {
            f2 = c1754870vld.LLILZIL;
        }
        if ((i3 & 32) != 0) {
            z2 = c1754870vld.LLILZLL;
        }
        if ((i3 & 64) != 0) {
            c291001Au4 = c1754870vld.LLIZ;
        }
        if ((i3 & 128) != 0) {
            c291001Au3 = c1754870vld.LLIZLLLIL;
        }
        if ((i3 & 256) != 0) {
            sellerInfo2 = c1754870vld.LLJ;
        }
        c1754870vld.getClass();
        return new C1754870vld(list2, i5, blockPageInfo2, i4, f2, z2, c291001Au4, c291001Au3, sellerInfo2);
    }
}
