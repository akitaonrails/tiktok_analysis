package X;

import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ifT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1251330ifT implements InterfaceC447510Hgj {
    public final User LIZ;
    public final C291001Au<User> LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final C291001Au<User> LJ;
    public final EnumC1251790igD LJFF;
    public final C291001Au<Unit> LJI;
    public final C291001Au<Unit> LJII;

    public C1251330ifT() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1251330ifT)) {
            return false;
        }
        C1251330ifT c1251330ifT = (C1251330ifT) obj;
        return Intrinsics.LJFF(this.LIZ, c1251330ifT.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1251330ifT.LIZIZ) && this.LIZJ == c1251330ifT.LIZJ && this.LIZLLL == c1251330ifT.LIZLLL && Intrinsics.LJFF(this.LJ, c1251330ifT.LJ) && this.LJFF == c1251330ifT.LJFF && Intrinsics.LJFF(this.LJI, c1251330ifT.LJI) && Intrinsics.LJFF(this.LJII, c1251330ifT.LJII);
    }

    public final int hashCode() {
        User user = this.LIZ;
        int iHashCode = (user == null ? 0 : user.hashCode()) * 31;
        C291001Au<User> c291001Au = this.LIZIZ;
        int iHashCode2 = (((((iHashCode + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31;
        C291001Au<User> c291001Au2 = this.LJ;
        int iHashCode3 = (((iHashCode2 + (c291001Au2 == null ? 0 : c291001Au2.hashCode())) * 31) + this.LJFF.hashCode()) * 31;
        C291001Au<Unit> c291001Au3 = this.LJI;
        int iHashCode4 = (iHashCode3 + (c291001Au3 == null ? 0 : c291001Au3.hashCode())) * 31;
        C291001Au<Unit> c291001Au4 = this.LJII;
        return iHashCode4 + (c291001Au4 != null ? c291001Au4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProfileInfoData(user=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", userUpdateEvent=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", fromSetSimpleUser=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", fromRecSimpleUser=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", onUserLoadEvent=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", action=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", changeTabs=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", refreshEvent=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1251330ifT(int i) {
        this(null, null, false, false, null, EnumC1251790igD.NORMAL, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1251330ifT(User user, C291001Au<? extends User> c291001Au, boolean z, boolean z2, C291001Au<? extends User> c291001Au2, EnumC1251790igD enumC1251790igD, C291001Au<Unit> c291001Au3, C291001Au<Unit> c291001Au4) {
        this.LIZ = user;
        this.LIZIZ = c291001Au;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = c291001Au2;
        this.LJFF = enumC1251790igD;
        this.LJI = c291001Au3;
        this.LJII = c291001Au4;
    }

    public static C1251330ifT LIZ(C1251330ifT c1251330ifT, User user, C291001Au c291001Au, boolean z, boolean z2, EnumC1251790igD enumC1251790igD, C291001Au c291001Au2, C291001Au c291001Au3, int i) {
        C291001Au<User> c291001Au4;
        C291001Au c291001Au5 = c291001Au3;
        C291001Au c291001Au6 = c291001Au2;
        EnumC1251790igD enumC1251790igD2 = enumC1251790igD;
        boolean z3 = z2;
        boolean z4 = z;
        C291001Au c291001Au7 = c291001Au;
        User user2 = user;
        if ((i & 1) != 0) {
            user2 = c1251330ifT.LIZ;
        }
        if ((i & 2) != 0) {
            c291001Au7 = c1251330ifT.LIZIZ;
        }
        if ((i & 4) != 0) {
            z4 = c1251330ifT.LIZJ;
        }
        if ((i & 8) != 0) {
            z3 = c1251330ifT.LIZLLL;
        }
        if ((i & 16) != 0) {
            c291001Au4 = c1251330ifT.LJ;
        } else {
            c291001Au4 = null;
        }
        if ((i & 32) != 0) {
            enumC1251790igD2 = c1251330ifT.LJFF;
        }
        if ((i & 64) != 0) {
            c291001Au6 = c1251330ifT.LJI;
        }
        if ((i & 128) != 0) {
            c291001Au5 = c1251330ifT.LJII;
        }
        c1251330ifT.getClass();
        return new C1251330ifT(user2, c291001Au7, z4, z3, c291001Au4, enumC1251790igD2, c291001Au6, c291001Au5);
    }
}
