package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0i00, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1225620i00 extends C1223510hwb {
    public final C20603715jn LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final List<String> LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1225620i00)) {
            return false;
        }
        C1225620i00 c1225620i00 = (C1225620i00) obj;
        return Intrinsics.LJFF(this.LIZLLL, c1225620i00.LIZLLL) && this.LJ == c1225620i00.LJ && this.LJFF == c1225620i00.LJFF && Intrinsics.LJFF(this.LJI, c1225620i00.LJI);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZLLL.hashCode() * 31) + C786410Ut5.Z2(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF)) * 31;
        List<String> list = this.LJI;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CollectionInviteFriendCTDSProtocolConfig(paginationConfig=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", needReorder=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", showLoadingStatus=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", defaultSelectedIdList=");
        sbLIZ.append(this.LJI);
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

    public C1225620i00(C20603715jn c20603715jn, List list) {
        super(c20603715jn, false, false);
        this.LIZLLL = c20603715jn;
        this.LJ = false;
        this.LJFF = false;
        this.LJI = list;
    }
}
