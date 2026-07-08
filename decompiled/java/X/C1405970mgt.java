package X;

import com.bytedance.goda.v2.model.dto.GodaV2Style;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.selection.Prop;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.selection.PropButton;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mgt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1405970mgt implements InterfaceC746802vq, C04DW, C04DV, InterfaceC1420630n4X {
    public final List<Prop> LL;
    public final PropButton LLILLJJLI;
    public final String LLILLL;
    public final Integer LLILZ;
    public final GodaV2Style LLILZIL;
    public final Boolean LLILZLL;
    public final Boolean LLIZ;
    public final List<String> LLIZLLLIL;
    public final String LLJ;
    public String LLJI = "undefined";
    public C04FN LLJIJIL;

    @Override // X.InterfaceC1420630n4X
    public final String LIZLLL() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1405970mgt)) {
            return false;
        }
        C1405970mgt c1405970mgt = (C1405970mgt) obj;
        return Intrinsics.LJFF(this.LL, c1405970mgt.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1405970mgt.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1405970mgt.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1405970mgt.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1405970mgt.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1405970mgt.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1405970mgt.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1405970mgt.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1405970mgt.LLJ);
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
        List<Prop> list = this.LL;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        PropButton propButton = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (propButton == null ? 0 : propButton.hashCode())) * 31;
        String str = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        GodaV2Style godaV2Style = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (godaV2Style == null ? 0 : godaV2Style.hashCode())) * 31;
        Boolean bool = this.LLILZLL;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.LLIZ;
        int iHashCode7 = (((iHashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31) + this.LLIZLLLIL.hashCode()) * 31;
        String str2 = this.LLJ;
        return iHashCode7 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // X.C04DW
    public final void setGodaGroupId(String str) {
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SkuPropSelectionItemVO(props=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", propButton=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", delimiter=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", layoutType=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", cellStyle=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", shouldShowText=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", isSelectionRequired=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", checkedSkuIds=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", region=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1420630n4X
    public final PropButton LIZ() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1420630n4X
    public final String LJ() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1420630n4X
    public final List<String> LJI() {
        return this.LLIZLLLIL;
    }

    @Override // X.C04DV
    public final C04FN LJIIIIZZ() {
        return this.LLJIJIL;
    }

    @Override // X.C04DW
    public final String getGodaNodeId() {
        return this.LLJI;
    }

    @Override // X.InterfaceC1420630n4X
    public final List<Prop> getProps() {
        return this.LL;
    }

    @Override // X.InterfaceC1420630n4X
    public final String getRegion() {
        return this.LLJ;
    }

    @Override // X.C04DV
    public final void LIZIZ(C04FN c04fn) {
        this.LLJIJIL = c04fn;
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
        this.LLJI = str;
    }

    public C1405970mgt(List<Prop> list, PropButton propButton, String str, Integer num, GodaV2Style godaV2Style, Boolean bool, Boolean bool2, List<String> list2, String str2) {
        this.LL = list;
        this.LLILLJJLI = propButton;
        this.LLILLL = str;
        this.LLILZ = num;
        this.LLILZIL = godaV2Style;
        this.LLILZLL = bool;
        this.LLIZ = bool2;
        this.LLIZLLLIL = list2;
        this.LLJ = str2;
    }
}
