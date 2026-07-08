package X;

import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticPanelModule;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.WarehouseTag;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AddonPanelInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderAvailableInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderSetting;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MultiLogisticsPanelInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PhoneCredit;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02s0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C723002s0 implements InterfaceC1891350zJl {
    public static final /* synthetic */ int LLJLILLLLZIIL = 0;
    public final String LL;
    public final String LLILLJJLI;
    public final boolean LLILLL;
    public final List<LogisticDTO> LLILZ;
    public final LogisticDTO LLILZIL;
    public final MultiLogisticsPanelInfo LLILZLL;
    public final boolean LLIZ;
    public final String LLIZLLLIL;
    public final List<C719102rN> LLJ;
    public final String LLJI;
    public final Integer LLJIJIL;
    public final PhoneCredit LLJILJIL;
    public final WarehouseTag LLJILJILJ;
    public final String LLJILLL;
    public final String LLJJ;
    public final MainOrderAvailableInfo LLJJI;
    public final Boolean LLJJIII;
    public final Boolean LLJJIJI;
    public final LogisticPanelModule LLJJIJIIJIL;
    public final LogisticPanelModule LLJJIJIL;
    public final String LLJJJ;
    public final MainOrderSetting LLJJJIL;
    public final AddonPanelInfo LLJJJJ;
    public final Boolean LLJJJJJIL;
    public final String LLJJJJLIIL;
    public int LLJJL;
    public C719202rO LLJJLIIIJLLLLLLLZ;
    public List<C798803Ac> LLJL;
    public final C719102rN LLJLIL;

    public C723002s0() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C723002s0)) {
            return false;
        }
        C723002s0 c723002s0 = (C723002s0) obj;
        return Intrinsics.LJFF(this.LL, c723002s0.LL) && Intrinsics.LJFF(this.LLILLJJLI, c723002s0.LLILLJJLI) && this.LLILLL == c723002s0.LLILLL && Intrinsics.LJFF(this.LLILZ, c723002s0.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c723002s0.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c723002s0.LLILZLL) && this.LLIZ == c723002s0.LLIZ && Intrinsics.LJFF(this.LLIZLLLIL, c723002s0.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c723002s0.LLJ) && Intrinsics.LJFF(this.LLJI, c723002s0.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c723002s0.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c723002s0.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, c723002s0.LLJILJILJ) && Intrinsics.LJFF(this.LLJILLL, c723002s0.LLJILLL) && Intrinsics.LJFF(this.LLJJ, c723002s0.LLJJ) && Intrinsics.LJFF(this.LLJJI, c723002s0.LLJJI) && Intrinsics.LJFF(this.LLJJIII, c723002s0.LLJJIII) && Intrinsics.LJFF(this.LLJJIJI, c723002s0.LLJJIJI) && Intrinsics.LJFF(this.LLJJIJIIJIL, c723002s0.LLJJIJIIJIL) && Intrinsics.LJFF(this.LLJJIJIL, c723002s0.LLJJIJIL) && Intrinsics.LJFF(this.LLJJJ, c723002s0.LLJJJ) && Intrinsics.LJFF(this.LLJJJIL, c723002s0.LLJJJIL) && Intrinsics.LJFF(this.LLJJJJ, c723002s0.LLJJJJ) && Intrinsics.LJFF(this.LLJJJJJIL, c723002s0.LLJJJJJIL) && Intrinsics.LJFF(this.LLJJJJLIIL, c723002s0.LLJJJJLIIL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LLILLJJLI;
        int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31;
        List<LogisticDTO> list = this.LLILZ;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        LogisticDTO logisticDTO = this.LLILZIL;
        int iHashCode4 = (iHashCode3 + (logisticDTO == null ? 0 : logisticDTO.hashCode())) * 31;
        MultiLogisticsPanelInfo multiLogisticsPanelInfo = this.LLILZLL;
        int iHashCode5 = (((iHashCode4 + (multiLogisticsPanelInfo == null ? 0 : multiLogisticsPanelInfo.hashCode())) * 31) + C786410Ut5.Z2(this.LLIZ)) * 31;
        String str3 = this.LLIZLLLIL;
        int iHashCode6 = (((iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.LLJ.hashCode()) * 31;
        String str4 = this.LLJI;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.LLJIJIL;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        PhoneCredit phoneCredit = this.LLJILJIL;
        int iHashCode9 = (iHashCode8 + (phoneCredit == null ? 0 : phoneCredit.hashCode())) * 31;
        WarehouseTag warehouseTag = this.LLJILJILJ;
        int iHashCode10 = (iHashCode9 + (warehouseTag == null ? 0 : warehouseTag.hashCode())) * 31;
        String str5 = this.LLJILLL;
        int iHashCode11 = (iHashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.LLJJ;
        int iHashCode12 = (iHashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        MainOrderAvailableInfo mainOrderAvailableInfo = this.LLJJI;
        int iHashCode13 = (iHashCode12 + (mainOrderAvailableInfo == null ? 0 : mainOrderAvailableInfo.hashCode())) * 31;
        Boolean bool = this.LLJJIII;
        int iHashCode14 = (iHashCode13 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.LLJJIJI;
        int iHashCode15 = (iHashCode14 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        LogisticPanelModule logisticPanelModule = this.LLJJIJIIJIL;
        int iHashCode16 = (iHashCode15 + (logisticPanelModule == null ? 0 : logisticPanelModule.hashCode())) * 31;
        LogisticPanelModule logisticPanelModule2 = this.LLJJIJIL;
        int iHashCode17 = (iHashCode16 + (logisticPanelModule2 == null ? 0 : logisticPanelModule2.hashCode())) * 31;
        String str7 = this.LLJJJ;
        int iHashCode18 = (iHashCode17 + (str7 == null ? 0 : str7.hashCode())) * 31;
        MainOrderSetting mainOrderSetting = this.LLJJJIL;
        int iHashCode19 = (iHashCode18 + (mainOrderSetting == null ? 0 : mainOrderSetting.hashCode())) * 31;
        AddonPanelInfo addonPanelInfo = this.LLJJJJ;
        int iHashCode20 = (iHashCode19 + (addonPanelInfo == null ? 0 : addonPanelInfo.hashCode())) * 31;
        Boolean bool3 = this.LLJJJJJIL;
        int iHashCode21 = (iHashCode20 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str8 = this.LLJJJJLIIL;
        return iHashCode21 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        return "MainOrderInfoVO(sellerId=" + this.LL + ", warehouseId=" + this.LLILLJJLI + ", hasAddress=" + this.LLILLL + ", logistics=" + this.LLILZ + ", selectedLogistic=" + this.LLILZIL + ", multiLogisticsPanelInfo=" + this.LLILZLL + ", reachable=" + this.LLIZ + ", unreachableReason=" + this.LLIZLLLIL + ", skuInfos=" + this.LLJ + ", showTopSellerDiscount=" + this.LLJI + ", productType=" + this.LLJIJIL + ", phoneCredit=" + this.LLJILJIL + ", warehouseTag=" + this.LLJILJILJ + ", shippingTitle=" + this.LLJILLL + ", mainOrderId=" + this.LLJJ + ", availableInfo=" + this.LLJJI + ", isUseSkeleton=" + this.LLJJIII + ", isPreHandle=" + this.LLJJIJI + ", logisticsExpressionModule=" + this.LLJJIJIIJIL + ", logisticsPanelModule=" + this.LLJJIJIL + ", selectedLogisticsServiceId=" + this.LLJJJ + ", mainOrderSetting=" + this.LLJJJIL + ", freeShippingAddonPanel=" + this.LLJJJJ + ", isPudoLogisticsServiceSelected=" + this.LLJJJJJIL + ", selectedPudoId=" + this.LLJJJJLIIL + ')';
    }

    public final boolean LIZ() {
        if (!C756302xN.LIZ(this.LLJ)) {
            return false;
        }
        List<C719102rN> list = this.LLJ;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<C719102rN> it2 = list.iterator();
            while (it2.hasNext()) {
                if (!it2.next().LIZLLL()) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C723002s0) {
            C723002s0 c723002s0 = (C723002s0) interfaceC1891350zJl;
            if (Intrinsics.LJFF(this.LL, c723002s0.LL) && Intrinsics.LJFF(this.LLILLJJLI, c723002s0.LLILLJJLI) && Intrinsics.LJFF(this.LLJJ, c723002s0.LLJJ)) {
                return true;
            }
            return false;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C723002s0(String str, String str2, boolean z, List list, LogisticDTO logisticDTO, MultiLogisticsPanelInfo multiLogisticsPanelInfo, boolean z2, String str3, List list2, String str4, Integer num, PhoneCredit phoneCredit, WarehouseTag warehouseTag, String str5, String str6, MainOrderAvailableInfo mainOrderAvailableInfo, Boolean bool, Boolean bool2, LogisticPanelModule logisticPanelModule, LogisticPanelModule logisticPanelModule2, String str7, MainOrderSetting mainOrderSetting, AddonPanelInfo addonPanelInfo, Boolean bool3, String str8, int i) {
        String str9 = str8;
        Boolean bool4 = bool3;
        AddonPanelInfo addonPanelInfo2 = addonPanelInfo;
        Boolean bool5 = bool2;
        Object obj = null;
        Boolean bool6 = (i & 65536) != 0 ? null : bool;
        bool5 = (i & 131072) != 0 ? null : bool5;
        addonPanelInfo2 = (i & 4194304) != 0 ? null : addonPanelInfo2;
        bool4 = (i & 8388608) != 0 ? null : bool4;
        str9 = (i & 16777216) != 0 ? null : str9;
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = z;
        this.LLILZ = list;
        this.LLILZIL = logisticDTO;
        this.LLILZLL = multiLogisticsPanelInfo;
        this.LLIZ = z2;
        this.LLIZLLLIL = str3;
        this.LLJ = list2;
        this.LLJI = str4;
        this.LLJIJIL = num;
        this.LLJILJIL = phoneCredit;
        this.LLJILJILJ = warehouseTag;
        this.LLJILLL = str5;
        this.LLJJ = str6;
        this.LLJJI = mainOrderAvailableInfo;
        this.LLJJIII = bool6;
        this.LLJJIJI = bool5;
        this.LLJJIJIIJIL = logisticPanelModule;
        this.LLJJIJIL = logisticPanelModule2;
        this.LLJJJ = str7;
        this.LLJJJIL = mainOrderSetting;
        this.LLJJJJ = addonPanelInfo2;
        this.LLJJJJJIL = bool4;
        this.LLJJJJLIIL = str9;
        ListIterator listIterator = list2.listIterator(list2.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            Object objPrevious = listIterator.previous();
            if (!((C719102rN) objPrevious).LIZLLL()) {
                obj = objPrevious;
                break;
            }
        }
        this.LLJLIL = (C719102rN) obj;
    }
}
