package X;

import android.graphics.PointF;
import com.bytedance.android.live.base.model.user.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15A0, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15A0 implements InterfaceC20477315At {
    public boolean LIZ;
    public boolean LIZIZ;
    public final User LIZJ;
    public final String LIZLLL;
    public boolean LJ;
    public PointF LJFF;
    public PointF LJI;
    public C15A1 LJII;
    public boolean LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15A0)) {
            return false;
        }
        C15A0 c15a0 = (C15A0) obj;
        return this.LIZ == c15a0.LIZ && this.LIZIZ == c15a0.LIZIZ && Intrinsics.LJFF(this.LIZJ, c15a0.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c15a0.LIZLLL) && this.LJ == c15a0.LJ && Intrinsics.LJFF(this.LJFF, c15a0.LJFF) && Intrinsics.LJFF(this.LJI, c15a0.LJI) && Intrinsics.LJFF(this.LJII, c15a0.LJII) && this.LJIIIIZZ == c15a0.LJIIIIZZ;
    }

    public final int hashCode() {
        int iZ2 = ((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31;
        User user = this.LIZJ;
        int iHashCode = (iZ2 + (user == null ? 0 : user.hashCode())) * 31;
        String str = this.LIZLLL;
        int iHashCode2 = (((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31;
        C15A1 c15a1 = this.LJII;
        return ((iHashCode2 + (c15a1 != null ? c15a1.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJIIIIZZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AvatarGeniusExtraConfig(isBreathing=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isShaking=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", linkedUser=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", linkMicId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", isAnimating=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", currentPos=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", targetPos=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", lottieConfig=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", detached=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC20477315At
    public final InterfaceC20477315At LIZJ() {
        boolean z = this.LIZ;
        boolean z2 = this.LIZIZ;
        User user = this.LIZJ;
        String str = this.LIZLLL;
        boolean z3 = this.LJ;
        PointF pointF = this.LJFF;
        PointF pointF2 = this.LJI;
        C15A1 c15a1 = this.LJII;
        return new C15A0(z, z2, user, str, z3, pointF, pointF2, c15a1 != null ? new C15A1(c15a1.LIZ.LIZIZ(), c15a1.LIZIZ.LIZ(), false, false, 12) : null, this.LJIIIIZZ);
    }

    @Override // X.InterfaceC20477315At
    public final boolean LIZ() {
        return this.LJIIIIZZ;
    }

    @Override // X.InterfaceC20477315At
    public final void LIZIZ(boolean z) {
        this.LJIIIIZZ = z;
    }

    public /* synthetic */ C15A0(boolean z, boolean z2, User user, String str, PointF pointF, PointF pointF2, C15A1 c15a1, int i) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? null : user, (i & 8) != 0 ? null : str, false, pointF, pointF2, (i & 128) == 0 ? c15a1 : null, false);
    }

    public C15A0(boolean z, boolean z2, User user, String str, boolean z3, PointF pointF, PointF pointF2, C15A1 c15a1, boolean z4) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = user;
        this.LIZLLL = str;
        this.LJ = z3;
        this.LJFF = pointF;
        this.LJI = pointF2;
        this.LJII = c15a1;
        this.LJIIIIZZ = z4;
    }
}
