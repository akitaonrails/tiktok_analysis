package X;

import com.ss.android.ugc.aweme.publicgroup.data.model.GroupInviteListRequest;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0i2N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1227090i2N extends C1223510hwb {
    public final C20603715jn LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final List<String> LJI;
    public final GroupInviteListRequest LJII;
    public final C1227810i3X LJIIIIZZ;
    public final EnumC1224830hyj LJIIIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1227090i2N)) {
            return false;
        }
        C1227090i2N c1227090i2N = (C1227090i2N) obj;
        return Intrinsics.LJFF(this.LIZLLL, c1227090i2N.LIZLLL) && this.LJ == c1227090i2N.LJ && this.LJFF == c1227090i2N.LJFF && Intrinsics.LJFF(this.LJI, c1227090i2N.LJI) && Intrinsics.LJFF(this.LJII, c1227090i2N.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c1227090i2N.LJIIIIZZ) && this.LJIIIZ == c1227090i2N.LJIIIZ;
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZLLL.hashCode() * 31) + C786410Ut5.Z2(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF)) * 31;
        List<String> list = this.LJI;
        return ((((((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + this.LJII.hashCode()) * 31) + this.LJIIIIZZ.hashCode()) * 31) + this.LJIIIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PublicGroupInviteCTDSProtocolConfig(paginationConfig=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", needReorder=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", showLoadingStatus=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", alwaysSelectedAndDisableIdList=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", groupInviteListRequest=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", emptyStatusInfo=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", variant=");
        sbLIZ.append(this.LJIIIZ);
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

    public C1227090i2N(C20603715jn c20603715jn, List list, GroupInviteListRequest groupInviteListRequest, C1227810i3X c1227810i3X, EnumC1224830hyj enumC1224830hyj) {
        super(c20603715jn, false, true);
        this.LIZLLL = c20603715jn;
        this.LJ = false;
        this.LJFF = true;
        this.LJI = list;
        this.LJII = groupInviteListRequest;
        this.LJIIIIZZ = c1227810i3X;
        this.LJIIIZ = enumC1224830hyj;
    }
}
