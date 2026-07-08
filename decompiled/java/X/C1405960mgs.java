package X;

import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.osp.dto.InsuranceInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.dropdown.DropdownProperty;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.dropdown.PropClientMetadata;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.selection.Prop;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.selection.PropButton;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mgs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1405960mgs implements InterfaceC746802vq, C04DW, C04DV, InterfaceC1420630n4X {
    public final String LL;
    public final PropButton LLILLJJLI;
    public final String LLILLL;
    public final List<DropdownProperty> LLILZ;
    public final PropClientMetadata LLILZIL;
    public final Icon LLILZLL;
    public final List<String> LLIZ;
    public final Integer LLIZLLLIL;
    public final InsuranceInfo LLJ;
    public final String LLJI;
    public String LLJIJIL = "undefined";
    public C04FN LLJILJIL;

    @Override // X.InterfaceC1420630n4X
    public final String LJ() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1405960mgs)) {
            return false;
        }
        C1405960mgs c1405960mgs = (C1405960mgs) obj;
        return Intrinsics.LJFF(this.LL, c1405960mgs.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1405960mgs.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1405960mgs.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1405960mgs.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1405960mgs.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1405960mgs.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1405960mgs.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1405960mgs.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1405960mgs.LLJ) && Intrinsics.LJFF(this.LLJI, c1405960mgs.LLJI);
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
        PropButton propButton = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (propButton == null ? 0 : propButton.hashCode())) * 31;
        String str2 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<DropdownProperty> list = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        PropClientMetadata propClientMetadata = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (propClientMetadata == null ? 0 : propClientMetadata.hashCode())) * 31;
        Icon icon = this.LLILZLL;
        int iHashCode6 = (((iHashCode5 + (icon == null ? 0 : icon.hashCode())) * 31) + this.LLIZ.hashCode()) * 31;
        Integer num = this.LLIZLLLIL;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        InsuranceInfo insuranceInfo = this.LLJ;
        int iHashCode8 = (iHashCode7 + (insuranceInfo == null ? 0 : insuranceInfo.hashCode())) * 31;
        String str3 = this.LLJI;
        return iHashCode8 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // X.C04DW
    public final void setGodaGroupId(String str) {
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SkuPropDropdownItemVO(propTitle=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", propButton=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", dropdownDelimiter=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", dropdownProperties=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", propClientMetadata=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", dropdownIcon=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", checkedSkuIds=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", productQuantity=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", insuranceInfo=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", region=");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1420630n4X
    public final PropButton LIZ() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1420630n4X
    public final String LIZLLL() {
        return this.LL;
    }

    @Override // X.InterfaceC1420630n4X
    public final List<String> LJI() {
        return this.LLIZ;
    }

    @Override // X.C04DV
    public final C04FN LJIIIIZZ() {
        return this.LLJILJIL;
    }

    @Override // X.C04DW
    public final String getGodaNodeId() {
        return this.LLJIJIL;
    }

    @Override // X.InterfaceC1420630n4X
    public final List<Prop> getProps() {
        return C13BV.INSTANCE;
    }

    @Override // X.InterfaceC1420630n4X
    public final String getRegion() {
        return this.LLJI;
    }

    @Override // X.C04DV
    public final void LIZIZ(C04FN c04fn) {
        this.LLJILJIL = c04fn;
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
        this.LLJIJIL = str;
    }

    public C1405960mgs(String str, PropButton propButton, String str2, List<DropdownProperty> list, PropClientMetadata propClientMetadata, Icon icon, List<String> list2, Integer num, InsuranceInfo insuranceInfo, String str3) {
        this.LL = str;
        this.LLILLJJLI = propButton;
        this.LLILLL = str2;
        this.LLILZ = list;
        this.LLILZIL = propClientMetadata;
        this.LLILZLL = icon;
        this.LLIZ = list2;
        this.LLIZLLLIL = num;
        this.LLJ = insuranceInfo;
        this.LLJI = str3;
    }
}
