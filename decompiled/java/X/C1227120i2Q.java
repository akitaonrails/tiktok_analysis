package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0i2Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1227120i2Q extends C1224340hxw {
    public final EnumC1224390hy1 LJ;
    public final int LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final List<String> LJIIIIZZ;
    public final List<String> LJIIIZ;
    public final List<String> LJIIJ;
    public final List<String> LJIIJJI;
    public final boolean LJIIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1227120i2Q)) {
            return false;
        }
        C1227120i2Q c1227120i2Q = (C1227120i2Q) obj;
        return this.LJ == c1227120i2Q.LJ && this.LJFF == c1227120i2Q.LJFF && this.LJI == c1227120i2Q.LJI && this.LJII == c1227120i2Q.LJII && Intrinsics.LJFF(this.LJIIIIZZ, c1227120i2Q.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c1227120i2Q.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c1227120i2Q.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c1227120i2Q.LJIIJJI) && this.LJIIL == c1227120i2Q.LJIIL;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LJ.hashCode() * 31) + this.LJFF) * 31) + C786410Ut5.Z2(this.LJI)) * 31) + C786410Ut5.Z2(this.LJII)) * 31;
        List<String> list = this.LJIIIIZZ;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.LJIIIZ;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.LJIIJ;
        int iHashCode4 = (iHashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<String> list4 = this.LJIIJJI;
        return ((iHashCode4 + (list4 != null ? list4.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJIIL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PrivateGroupDataInteractProtocolConfig(selectMode=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", maxSelectableCount=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", hideSelectBoxWhenMeetMax=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", showActiveStatus=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", defaultSelectedIdList=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", defaultDisableIdList=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(", stickyTopUidList=");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append(", alwaysSelectedAndDisableIdList=");
        sbLIZ.append(this.LJIIJJI);
        sbLIZ.append(", supportRelatedFriend=");
        sbLIZ.append(this.LJIIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C1224340hxw
    public final boolean LIZ() {
        return this.LJI;
    }

    @Override // X.C1224340hxw
    public final int LIZIZ() {
        return this.LJFF;
    }

    @Override // X.C1224340hxw
    public final EnumC1224390hy1 LIZJ() {
        return this.LJ;
    }

    @Override // X.C1224340hxw
    public final boolean LIZLLL() {
        return this.LJII;
    }

    public C1227120i2Q(EnumC1224390hy1 enumC1224390hy1, int i, boolean z, List list, List list2, List list3) {
        super(enumC1224390hy1, i, true, z);
        this.LJ = enumC1224390hy1;
        this.LJFF = i;
        this.LJI = true;
        this.LJII = z;
        this.LJIIIIZZ = list;
        this.LJIIIZ = null;
        this.LJIIJ = list2;
        this.LJIIJJI = list3;
        this.LJIIL = true;
    }
}
