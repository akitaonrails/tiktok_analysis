package X;

import com.ss.android.ugc.aweme.ecommerce.base.common.model.CommonColor;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04Ds, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1063004Ds {
    public final Integer LIZ;
    public final String LIZIZ;
    public final Icon LIZJ;
    public final String LIZLLL;
    public final Integer LJ;
    public final List<C1062804Dq> LJFF;
    public final CommonColor LJI;
    public final List<C1062804Dq> LJII;
    public final CommonColor LJIIIIZZ;
    public final CommonColor LJIIIZ;
    public final Integer LJIIJ;
    public final Integer LJIIJJI;
    public final Boolean LJIIL;
    public final C1057104Bl LJIILIIL;
    public final C1057104Bl LJIILJJIL;
    public final Map<String, Object> LJIILL;
    public final String LJIILLIIL;
    public Integer LJIIZILJ;

    public C1063004Ds() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1063004Ds)) {
            return false;
        }
        C1063004Ds c1063004Ds = (C1063004Ds) obj;
        return Intrinsics.LJFF(this.LIZ, c1063004Ds.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1063004Ds.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1063004Ds.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1063004Ds.LIZLLL) && Intrinsics.LJFF(this.LJ, c1063004Ds.LJ) && Intrinsics.LJFF(this.LJFF, c1063004Ds.LJFF) && Intrinsics.LJFF(this.LJI, c1063004Ds.LJI) && Intrinsics.LJFF(this.LJII, c1063004Ds.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c1063004Ds.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c1063004Ds.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c1063004Ds.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c1063004Ds.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c1063004Ds.LJIIL) && Intrinsics.LJFF(this.LJIILIIL, c1063004Ds.LJIILIIL) && Intrinsics.LJFF(this.LJIILJJIL, c1063004Ds.LJIILJJIL) && Intrinsics.LJFF(this.LJIILL, c1063004Ds.LJIILL) && Intrinsics.LJFF(this.LJIILLIIL, c1063004Ds.LJIILLIIL);
    }

    public final int hashCode() {
        Integer num = this.LIZ;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Icon icon = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (icon == null ? 0 : icon.hashCode())) * 31;
        String str2 = this.LIZLLL;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.LJ;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<C1062804Dq> list = this.LJFF;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        CommonColor commonColor = this.LJI;
        int iHashCode7 = (iHashCode6 + (commonColor == null ? 0 : commonColor.hashCode())) * 31;
        List<C1062804Dq> list2 = this.LJII;
        int iHashCode8 = (iHashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        CommonColor commonColor2 = this.LJIIIIZZ;
        int iHashCode9 = (iHashCode8 + (commonColor2 == null ? 0 : commonColor2.hashCode())) * 31;
        CommonColor commonColor3 = this.LJIIIZ;
        int iHashCode10 = (iHashCode9 + (commonColor3 == null ? 0 : commonColor3.hashCode())) * 31;
        Integer num3 = this.LJIIJ;
        int iHashCode11 = (iHashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.LJIIJJI;
        int iHashCode12 = (iHashCode11 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Boolean bool = this.LJIIL;
        int iHashCode13 = (iHashCode12 + (bool == null ? 0 : bool.hashCode())) * 31;
        C1057104Bl c1057104Bl = this.LJIILIIL;
        int iHashCode14 = (iHashCode13 + (c1057104Bl == null ? 0 : c1057104Bl.hashCode())) * 31;
        C1057104Bl c1057104Bl2 = this.LJIILJJIL;
        int iHashCode15 = (iHashCode14 + (c1057104Bl2 == null ? 0 : c1057104Bl2.hashCode())) * 31;
        Map<String, Object> map = this.LJIILL;
        int iHashCode16 = (iHashCode15 + (map == null ? 0 : map.hashCode())) * 31;
        String str3 = this.LJIILLIIL;
        return iHashCode16 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "SeaPdpBottomBarBtnVO(type=" + this.LIZ + ", name=" + this.LIZIZ + ", icon=" + this.LIZJ + ", title=" + this.LIZLLL + ", initBadgeNumber=" + this.LJ + ", desc=" + this.LJFF + ", descColor=" + this.LJI + ", subDesc=" + this.LJII + ", subDescColor=" + this.LJIIIIZZ + ", bgColor=" + this.LJIIIZ + ", marginLeft=" + this.LJIIJ + ", marginRight=" + this.LJIIJJI + ", enable=" + this.LJIIL + ", clickAction=" + this.LJIILIIL + ", touchDownAction=" + this.LJIILJJIL + ", daInfo=" + this.LJIILL + ", pageName=" + this.LJIILLIIL + ')';
    }

    public C1063004Ds(Integer num, String str, Icon icon, String str2, Integer num2, List<C1062804Dq> list, CommonColor commonColor, List<C1062804Dq> list2, CommonColor commonColor2, CommonColor commonColor3, Integer num3, Integer num4, Boolean bool, C1057104Bl c1057104Bl, C1057104Bl c1057104Bl2, Map<String, ? extends Object> map, String str3) {
        this.LIZ = num;
        this.LIZIZ = str;
        this.LIZJ = icon;
        this.LIZLLL = str2;
        this.LJ = num2;
        this.LJFF = list;
        this.LJI = commonColor;
        this.LJII = list2;
        this.LJIIIIZZ = commonColor2;
        this.LJIIIZ = commonColor3;
        this.LJIIJ = num3;
        this.LJIIJJI = num4;
        this.LJIIL = bool;
        this.LJIILIIL = c1057104Bl;
        this.LJIILJJIL = c1057104Bl2;
        this.LJIILL = map;
        this.LJIILLIIL = str3;
        this.LJIIZILJ = num2;
    }
}
