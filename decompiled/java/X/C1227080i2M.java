package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0i2M, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1227080i2M extends AbstractC1227310i2j {
    public final C20603715jn LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final List<String> LJI;
    public final List<String> LJII;
    public final List<String> LJIIIIZZ;
    public final EnumC114800c6 LJIIIZ;
    public final List<String> LJIIJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1227080i2M)) {
            return false;
        }
        C1227080i2M c1227080i2M = (C1227080i2M) obj;
        return Intrinsics.LJFF(this.LIZLLL, c1227080i2M.LIZLLL) && this.LJ == c1227080i2M.LJ && this.LJFF == c1227080i2M.LJFF && Intrinsics.LJFF(this.LJI, c1227080i2M.LJI) && Intrinsics.LJFF(this.LJII, c1227080i2M.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c1227080i2M.LJIIIIZZ) && this.LJIIIZ == c1227080i2M.LJIIIZ && Intrinsics.LJFF(this.LJIIJ, c1227080i2M.LJIIJ);
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
        return iHashCode5 + (list4 != null ? list4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FriendSearchDataSourceProtocolConfig(paginationConfig=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", needReorder=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", showLoadingStatus=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", defaultSelectedIdList=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", defaultDisableIdList=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", alwaysSelectedAndDisableIdList=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", stickyTopListSource=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(", stickyTopUidList=");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
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

    public C1227080i2M(C20603715jn c20603715jn, boolean z, List list, List list2, EnumC114800c6 enumC114800c6, List list3) {
        super(c20603715jn, z);
        this.LIZLLL = c20603715jn;
        this.LJ = false;
        this.LJFF = z;
        this.LJI = list;
        this.LJII = null;
        this.LJIIIIZZ = list2;
        this.LJIIIZ = enumC114800c6;
        this.LJIIJ = list3;
    }
}
