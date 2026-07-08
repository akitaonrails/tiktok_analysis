package X;

import com.bytedance.android.live.base.model.user.User;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0i0g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1226040i0g extends C1223510hwb {
    public final List<User> LIZLLL;
    public final List<User> LJ;
    public final String LJFF;
    public final String LJI;
    public final C20603715jn LJII;
    public final boolean LJIIIIZZ;
    public final boolean LJIIIZ;
    public final Set<String> LJIIJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1226040i0g)) {
            return false;
        }
        C1226040i0g c1226040i0g = (C1226040i0g) obj;
        return Intrinsics.LJFF(this.LIZLLL, c1226040i0g.LIZLLL) && Intrinsics.LJFF(this.LJ, c1226040i0g.LJ) && Intrinsics.LJFF(this.LJFF, c1226040i0g.LJFF) && Intrinsics.LJFF(this.LJI, c1226040i0g.LJI) && Intrinsics.LJFF(this.LJII, c1226040i0g.LJII) && this.LJIIIIZZ == c1226040i0g.LJIIIIZZ && this.LJIIIZ == c1226040i0g.LJIIIZ && Intrinsics.LJFF(this.LJIIJ, c1226040i0g.LJIIJ);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((this.LIZLLL.hashCode() * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode()) * 31) + C786410Ut5.Z2(this.LJIIIIZZ)) * 31) + C786410Ut5.Z2(this.LJIIIZ)) * 31;
        Set<String> set = this.LJIIJ;
        return iHashCode + (set == null ? 0 : set.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveInviteGuestContentTabDataSourceProtocolConfig(suggestedFriends=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", suggestedUsers=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", friendsTitle=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", recommendGuestsTitle=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", paginationConfig=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", needReorder=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", showLoadingStatus=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(", defaultSelectedIdList=");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C1223510hwb
    public final boolean LIZ() {
        return this.LJIIIIZZ;
    }

    @Override // X.C1223510hwb
    public final C20603715jn LIZIZ() {
        return this.LJII;
    }

    @Override // X.C1223510hwb
    public final boolean LIZJ() {
        return this.LJIIIZ;
    }

    public C1226040i0g(List list, List list2, String str, String str2, C20603715jn c20603715jn, Set set) {
        super(c20603715jn, false, false);
        this.LIZLLL = list;
        this.LJ = list2;
        this.LJFF = str;
        this.LJI = str2;
        this.LJII = c20603715jn;
        this.LJIIIIZZ = false;
        this.LJIIIZ = false;
        this.LJIIJ = set;
    }
}
