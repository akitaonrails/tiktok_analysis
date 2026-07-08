package X;

import com.ss.android.ugc.aweme.feature.newselector.config.newconversation.RecomReasonData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0i2L, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1227070i2L extends AbstractC1227310i2j {
    public final C20603715jn LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final List<String> LJI;
    public final List<String> LJII;
    public final List<String> LJIIIIZZ;
    public final EnumC114800c6 LJIIIZ;
    public final List<String> LJIIJ;
    public final Boolean LJIIJJI;
    public final Boolean LJIIL;
    public final String LJIILIIL;
    public final RecomReasonData LJIILJJIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1227070i2L)) {
            return false;
        }
        C1227070i2L c1227070i2L = (C1227070i2L) obj;
        return Intrinsics.LJFF(this.LIZLLL, c1227070i2L.LIZLLL) && this.LJ == c1227070i2L.LJ && this.LJFF == c1227070i2L.LJFF && Intrinsics.LJFF(this.LJI, c1227070i2L.LJI) && Intrinsics.LJFF(this.LJII, c1227070i2L.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c1227070i2L.LJIIIIZZ) && this.LJIIIZ == c1227070i2L.LJIIIZ && Intrinsics.LJFF(this.LJIIJ, c1227070i2L.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c1227070i2L.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c1227070i2L.LJIIL) && Intrinsics.LJFF(this.LJIILIIL, c1227070i2L.LJIILIIL) && Intrinsics.LJFF(this.LJIILJJIL, c1227070i2L.LJIILJJIL);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZLLL.hashCode() * 31) + C786410Ut5.Z2(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF)) * 31;
        List<String> list = this.LJI;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.LJII;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.LJIIIIZZ;
        int iHashCode4 = (iHashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        EnumC114800c6 enumC114800c6 = this.LJIIIZ;
        int iHashCode5 = (iHashCode4 + (enumC114800c6 == null ? 0 : enumC114800c6.hashCode())) * 31;
        List<String> list4 = this.LJIIJ;
        int iHashCode6 = (iHashCode5 + (list4 == null ? 0 : list4.hashCode())) * 31;
        Boolean bool = this.LJIIJJI;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.LJIIL;
        int iHashCode8 = (iHashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.LJIILIIL;
        int iHashCode9 = (iHashCode8 + (str == null ? 0 : str.hashCode())) * 31;
        RecomReasonData recomReasonData = this.LJIILJJIL;
        return iHashCode9 + (recomReasonData != null ? recomReasonData.hashCode() : 0);
    }

    public final String toString() {
        return "FriendContentTabDataSourceProtocolConfig(paginationConfig=" + this.LIZLLL + ", needReorder=" + this.LJ + ", showLoadingStatus=" + this.LJFF + ", defaultSelectedIdList=" + this.LJI + ", defaultDisableIdList=" + this.LJII + ", alwaysSelectedAndDisableIdList=" + this.LJIIIIZZ + ", stickyTopListSource=" + this.LJIIIZ + ", stickyTopUidList=" + this.LJIIJ + ", withIndex=" + this.LJIIJJI + ", withSuggest=" + this.LJIIL + ", stickyTopText=" + this.LJIILIIL + ", recomReasonData=" + this.LJIILJJIL + ')';
    }

    @Override // X.C1223510hwb
    public final boolean LIZ() {
        return this.LJ;
    }

    @Override // X.C1223510hwb
    public final C20603715jn LIZIZ() {
        return this.LIZLLL;
    }

    @Override // X.C1223510hwb
    public final boolean LIZJ() {
        return this.LJFF;
    }

    @Override // X.AbstractC1227310i2j
    public final List<String> LIZLLL() {
        return this.LJIIIIZZ;
    }

    @Override // X.AbstractC1227310i2j
    public final List<String> LJ() {
        return this.LJII;
    }

    @Override // X.AbstractC1227310i2j
    public final List<String> LJFF() {
        return this.LJI;
    }

    public C1227070i2L(C20603715jn c20603715jn, List list, List list2, EnumC114800c6 enumC114800c6, List list3, Boolean bool, Boolean bool2, String str, RecomReasonData recomReasonData) {
        super(c20603715jn, false);
        this.LIZLLL = c20603715jn;
        this.LJ = false;
        this.LJFF = false;
        this.LJI = list;
        this.LJII = null;
        this.LJIIIIZZ = list2;
        this.LJIIIZ = enumC114800c6;
        this.LJIIJ = list3;
        this.LJIIJJI = bool;
        this.LJIIL = bool2;
        this.LJIILIIL = str;
        this.LJIILJJIL = recomReasonData;
    }
}
