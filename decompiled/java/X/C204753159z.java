package X;

import com.bytedance.android.live.base.model.user.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.159z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C204753159z implements InterfaceC20477315At {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final User LIZJ;
    public final User LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final Integer LJI;
    public C15A1 LJII;
    public final boolean LJIIIIZZ;
    public boolean LJIIIZ;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public C204753159z() {
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        this(false, (boolean) objArr, (User) null, (User) (0 == true ? 1 : 0), (int) objArr2, (int) objArr3, (Integer) (0 == true ? 1 : 0), (C15A1) (0 == true ? 1 : 0), (boolean) objArr4, 1023);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C204753159z)) {
            return false;
        }
        C204753159z c204753159z = (C204753159z) obj;
        return this.LIZ == c204753159z.LIZ && this.LIZIZ == c204753159z.LIZIZ && Intrinsics.LJFF(this.LIZJ, c204753159z.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c204753159z.LIZLLL) && this.LJ == c204753159z.LJ && this.LJFF == c204753159z.LJFF && Intrinsics.LJFF(this.LJI, c204753159z.LJI) && Intrinsics.LJFF(this.LJII, c204753159z.LJII) && this.LJIIIIZZ == c204753159z.LJIIIIZZ && this.LJIIIZ == c204753159z.LJIIIZ;
    }

    public final int hashCode() {
        int iZ2 = ((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31;
        User user = this.LIZJ;
        int iHashCode = (iZ2 + (user == null ? 0 : user.hashCode())) * 31;
        User user2 = this.LIZLLL;
        int iHashCode2 = (((((iHashCode + (user2 == null ? 0 : user2.hashCode())) * 31) + this.LJ) * 31) + this.LJFF) * 31;
        Integer num = this.LJI;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        C15A1 c15a1 = this.LJII;
        return ((((iHashCode3 + (c15a1 != null ? c15a1.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJIIIIZZ)) * 31) + C786410Ut5.Z2(this.LJIIIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Top3AvatarGeniusExtraConfig(isShaking=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isElastic=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", lastUser=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", newUser=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", lastUserAction=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", newUserAction=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", rank=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", lottieConfig=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", needShowNickName=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", detached=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC20477315At
    public final InterfaceC20477315At LIZJ() {
        boolean z = this.LIZ;
        boolean z2 = this.LIZIZ;
        User user = this.LIZJ;
        User user2 = this.LIZLLL;
        int i = this.LJ;
        int i2 = this.LJFF;
        Integer num = this.LJI;
        C15A1 c15a1 = this.LJII;
        return new C204753159z(z, z2, user, user2, i, i2, num, c15a1 != null ? new C15A1(c15a1.LIZ.LIZIZ(), c15a1.LIZIZ.LIZ(), false, false, 12) : null, this.LJIIIIZZ, this.LJIIIZ);
    }

    @Override // X.InterfaceC20477315At
    public final boolean LIZ() {
        return this.LJIIIZ;
    }

    @Override // X.InterfaceC20477315At
    public final void LIZIZ(boolean z) {
        this.LJIIIZ = z;
    }

    public /* synthetic */ C204753159z(boolean z, boolean z2, User user, User user2, int i, int i2, Integer num, C15A1 c15a1, boolean z3, int i3) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? true : z2, (i3 & 4) != 0 ? null : user, (i3 & 8) != 0 ? null : user2, (i3 & 16) != 0 ? 0 : i, (i3 & 32) != 0 ? 0 : i2, (i3 & 64) != 0 ? null : num, (i3 & 128) == 0 ? c15a1 : null, (i3 & 256) != 0 ? false : z3, false);
    }

    public C204753159z(boolean z, boolean z2, User user, User user2, int i, int i2, Integer num, C15A1 c15a1, boolean z3, boolean z4) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = user;
        this.LIZLLL = user2;
        this.LJ = i;
        this.LJFF = i2;
        this.LJI = num;
        this.LJII = c15a1;
        this.LJIIIIZZ = z3;
        this.LJIIIZ = z4;
    }
}
