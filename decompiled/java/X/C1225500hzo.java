package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hzo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1225500hzo extends C1223510hwb {
    public final C20603715jn LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final String LJI;
    public final Boolean LJII;
    public final List<String> LJIIIIZZ;
    public final boolean LJIIIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1225500hzo)) {
            return false;
        }
        C1225500hzo c1225500hzo = (C1225500hzo) obj;
        return Intrinsics.LJFF(this.LIZLLL, c1225500hzo.LIZLLL) && this.LJ == c1225500hzo.LJ && this.LJFF == c1225500hzo.LJFF && Intrinsics.LJFF(this.LJI, c1225500hzo.LJI) && Intrinsics.LJFF(this.LJII, c1225500hzo.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c1225500hzo.LJIIIIZZ) && this.LJIIIZ == c1225500hzo.LJIIIZ;
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZLLL.hashCode() * 31) + C786410Ut5.Z2(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF)) * 31;
        String str = this.LJI;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.LJII;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<String> list = this.LJIIIIZZ;
        return ((iHashCode3 + (list != null ? list.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJIIIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMGroupMemberDataSourceProtocolConfig(paginationConfig=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", needReorder=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", showLoadingStatus=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", conversationId=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", includeSelf=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", alwaysSelectedAndDisableIdList=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", showEmptyStatusView=");
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

    public C1225500hzo(C20603715jn c20603715jn, String str, Boolean bool, List list, boolean z) {
        super(c20603715jn, false, false);
        this.LIZLLL = c20603715jn;
        this.LJ = false;
        this.LJFF = false;
        this.LJI = str;
        this.LJII = bool;
        this.LJIIIIZZ = list;
        this.LJIIIZ = z;
    }
}
