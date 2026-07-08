package X;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0m9Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1385220m9Q extends C1908870zm1 {
    public final User LIZJ;
    public final EnumC1357230lQH LIZLLL;
    public final boolean LJ;
    public final Map<Boolean, Integer> LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final LifecycleOwner LJIIIIZZ;
    public final ViewModelStoreOwner LJIIIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1385220m9Q)) {
            return false;
        }
        C1385220m9Q c1385220m9Q = (C1385220m9Q) obj;
        return Intrinsics.LJFF(this.LIZJ, c1385220m9Q.LIZJ) && this.LIZLLL == c1385220m9Q.LIZLLL && this.LJ == c1385220m9Q.LJ && Intrinsics.LJFF(this.LJFF, c1385220m9Q.LJFF) && this.LJI == c1385220m9Q.LJI && this.LJII == c1385220m9Q.LJII && Intrinsics.LJFF(this.LJIIIIZZ, c1385220m9Q.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c1385220m9Q.LJIIIZ);
    }

    public final int hashCode() {
        User user = this.LIZJ;
        int iHashCode = (user == null ? 0 : user.hashCode()) * 31;
        EnumC1357230lQH enumC1357230lQH = this.LIZLLL;
        int iHashCode2 = (((iHashCode + (enumC1357230lQH == null ? 0 : enumC1357230lQH.hashCode())) * 31) + C786410Ut5.Z2(this.LJ)) * 31;
        Map<Boolean, Integer> map = this.LJFF;
        int iHashCode3 = (((((iHashCode2 + (map == null ? 0 : map.hashCode())) * 31) + C786410Ut5.Z2(this.LJI)) * 31) + C786410Ut5.Z2(this.LJII)) * 31;
        LifecycleOwner lifecycleOwner = this.LJIIIIZZ;
        int iHashCode4 = (iHashCode3 + (lifecycleOwner == null ? 0 : lifecycleOwner.hashCode())) * 31;
        ViewModelStoreOwner viewModelStoreOwner = this.LJIIIZ;
        return iHashCode4 + (viewModelStoreOwner != null ? viewModelStoreOwner.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RelationTextConfig(user=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", prefixStyle=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", allowToUnfollow=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", stateToFont=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", forceDarkMode=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", isFromRecommendScene=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", lifecycleOwner=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", viewModelStoreOwner=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C1908870zm1
    public final LifecycleOwner LIZ() {
        return this.LJIIIIZZ;
    }

    @Override // X.C1908870zm1
    public final User LIZIZ() {
        return this.LIZJ;
    }

    @Override // X.C1908870zm1
    public final ViewModelStoreOwner LIZJ() {
        return this.LJIIIZ;
    }

    @Override // X.C1908870zm1
    public final boolean LIZLLL() {
        return this.LJII;
    }

    public C1385220m9Q(User user, EnumC1357230lQH enumC1357230lQH, boolean z, Map<Boolean, Integer> map, boolean z2, boolean z3, LifecycleOwner lifecycleOwner, ViewModelStoreOwner viewModelStoreOwner) {
        super(user, z3, lifecycleOwner, viewModelStoreOwner);
        this.LIZJ = user;
        this.LIZLLL = enumC1357230lQH;
        this.LJ = z;
        this.LJFF = map;
        this.LJI = z2;
        this.LJII = z3;
        this.LJIIIIZZ = lifecycleOwner;
        this.LJIIIZ = viewModelStoreOwner;
    }
}
