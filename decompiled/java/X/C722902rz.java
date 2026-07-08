package X;

import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticPanelModule;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MultiLogisticsPanelInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.OSPPageModuleConfig;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.QuantityControlInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SkuCardExtendInfo;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02rz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C722902rz extends AbstractC756202xM {
    public final Image LLILZLL;
    public final List<LogisticDTO> LLIZ;
    public final LogisticDTO LLIZLLLIL;
    public final MultiLogisticsPanelInfo LLJ;
    public final LogisticPanelModule LLJI;
    public final LogisticPanelModule LLJIJIL;
    public final String LLJILJIL;
    public final Boolean LLJILJILJ;
    public final String LLJILLL;
    public final boolean LLJJ;
    public final boolean LLJJI;
    public final String LLJJIII;
    public final QuantityControlInfo LLJJIJI;
    public final SkuCardExtendInfo LLJJIJIIJIL;
    public final String LLJJIJIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C722902rz)) {
            return false;
        }
        C722902rz c722902rz = (C722902rz) obj;
        return Intrinsics.LJFF(this.LLILZLL, c722902rz.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c722902rz.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c722902rz.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c722902rz.LLJ) && Intrinsics.LJFF(this.LLJI, c722902rz.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c722902rz.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c722902rz.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, c722902rz.LLJILJILJ) && Intrinsics.LJFF(this.LLJILLL, c722902rz.LLJILLL) && this.LLJJ == c722902rz.LLJJ && this.LLJJI == c722902rz.LLJJI && Intrinsics.LJFF(this.LLJJIII, c722902rz.LLJJIII) && Intrinsics.LJFF(this.LLJJIJI, c722902rz.LLJJIJI) && Intrinsics.LJFF(this.LLJJIJIIJIL, c722902rz.LLJJIJIIJIL);
    }

    public final int hashCode() {
        Image image = this.LLILZLL;
        int iHashCode = (image == null ? 0 : image.hashCode()) * 31;
        List<LogisticDTO> list = this.LLIZ;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        LogisticDTO logisticDTO = this.LLIZLLLIL;
        int iHashCode3 = (iHashCode2 + (logisticDTO == null ? 0 : logisticDTO.hashCode())) * 31;
        MultiLogisticsPanelInfo multiLogisticsPanelInfo = this.LLJ;
        int iHashCode4 = (iHashCode3 + (multiLogisticsPanelInfo == null ? 0 : multiLogisticsPanelInfo.hashCode())) * 31;
        LogisticPanelModule logisticPanelModule = this.LLJI;
        int iHashCode5 = (iHashCode4 + (logisticPanelModule == null ? 0 : logisticPanelModule.hashCode())) * 31;
        LogisticPanelModule logisticPanelModule2 = this.LLJIJIL;
        int iHashCode6 = (iHashCode5 + (logisticPanelModule2 == null ? 0 : logisticPanelModule2.hashCode())) * 31;
        String str = this.LLJILJIL;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.LLJILJILJ;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.LLJILLL;
        int iHashCode9 = (((((iHashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31) + C786410Ut5.Z2(this.LLJJ)) * 31) + C786410Ut5.Z2(this.LLJJI)) * 31;
        String str3 = this.LLJJIII;
        int iHashCode10 = (iHashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        QuantityControlInfo quantityControlInfo = this.LLJJIJI;
        int iHashCode11 = (iHashCode10 + (quantityControlInfo == null ? 0 : quantityControlInfo.hashCode())) * 31;
        SkuCardExtendInfo skuCardExtendInfo = this.LLJJIJIIJIL;
        return iHashCode11 + (skuCardExtendInfo != null ? skuCardExtendInfo.hashCode() : 0);
    }

    public final String toString() {
        return "HalfMainOrderInfoVO(productImg=" + this.LLILZLL + ", logistics=" + this.LLIZ + ", selectedLogistic=" + this.LLIZLLLIL + ", multiLogisticsPanelInfo=" + this.LLJ + ", logisticsExpressionModule=" + this.LLJI + ", logisticsPanelModule=" + this.LLJIJIL + ", selectedLogisticsServiceId=" + this.LLJILJIL + ", isUseSkeleton=" + this.LLJILJILJ + ", shippingTitle=" + this.LLJILLL + ", hasAddress=" + this.LLJJ + ", available=" + this.LLJJI + ", expressEdtPlaceHolder=" + this.LLJJIII + ", quantityControlInfo=" + this.LLJJIJI + ", skuCardExtInfo=" + this.LLJJIJIIJIL + ')';
    }

    @Override // X.AbstractC756202xM, X.AbstractC723102s1
    public final String getGroupId() {
        String str;
        OSPPageModuleConfig oSPPageModuleConfig = this.LLILLL;
        return (oSPPageModuleConfig == null || (str = oSPPageModuleConfig.name) == null) ? "logistics_module" : str;
    }

    @Override // X.AbstractC756202xM, X.AbstractC723102s1
    public final String getItemId() {
        return this.LLJJIJIL;
    }

    @Override // X.AbstractC723102s1, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return interfaceC1891350zJl instanceof C722902rz;
    }

    public /* synthetic */ C722902rz(Image image, List list, LogisticDTO logisticDTO, MultiLogisticsPanelInfo multiLogisticsPanelInfo, LogisticPanelModule logisticPanelModule, LogisticPanelModule logisticPanelModule2, String str, Boolean bool, String str2, boolean z, boolean z2, String str3) {
        this(image, list, logisticDTO, multiLogisticsPanelInfo, logisticPanelModule, logisticPanelModule2, str, bool, str2, z, z2, str3, null, null);
    }

    public C722902rz(Image image, List<LogisticDTO> list, LogisticDTO logisticDTO, MultiLogisticsPanelInfo multiLogisticsPanelInfo, LogisticPanelModule logisticPanelModule, LogisticPanelModule logisticPanelModule2, String str, Boolean bool, String str2, boolean z, boolean z2, String str3, QuantityControlInfo quantityControlInfo, SkuCardExtendInfo skuCardExtendInfo) {
        this.LLILZLL = image;
        this.LLIZ = list;
        this.LLIZLLLIL = logisticDTO;
        this.LLJ = multiLogisticsPanelInfo;
        this.LLJI = logisticPanelModule;
        this.LLJIJIL = logisticPanelModule2;
        this.LLJILJIL = str;
        this.LLJILJILJ = bool;
        this.LLJILLL = str2;
        this.LLJJ = z;
        this.LLJJI = z2;
        this.LLJJIII = str3;
        this.LLJJIJI = quantityControlInfo;
        this.LLJJIJIIJIL = skuCardExtendInfo;
        this.LLJJIJIL = "half_main_order_info_item";
    }
}
